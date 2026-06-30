package com.tencent.mm.mm7zip.simple.impl;

/* loaded from: classes16.dex */
public class SimpleInArchiveImpl implements com.tencent.mm.mm7zip.simple.ISimpleInArchive {
    private final com.tencent.mm.mm7zip.IInArchive sevenZipInArchive;
    private boolean wasClosed = false;

    public SimpleInArchiveImpl(com.tencent.mm.mm7zip.IInArchive iInArchive) {
        this.sevenZipInArchive = iInArchive;
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchive
    public void close() {
        this.sevenZipInArchive.close();
        this.wasClosed = true;
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchive
    public com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem getArchiveItem(int i17) {
        if (i17 >= 0 && i17 < this.sevenZipInArchive.getNumberOfItems()) {
            return new com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveItemImpl(this, i17);
        }
        throw new com.tencent.mm.mm7zip.SevenZipException("Index " + i17 + " is out of range. Number of items in archive: " + this.sevenZipInArchive.getNumberOfItems());
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchive
    public com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem[] getArchiveItems() {
        int numberOfItems = getNumberOfItems();
        com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem[] iSimpleInArchiveItemArr = new com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem[numberOfItems];
        for (int i17 = 0; i17 < numberOfItems; i17++) {
            iSimpleInArchiveItemArr[i17] = new com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveItemImpl(this, i17);
        }
        return iSimpleInArchiveItemArr;
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchive
    public int getNumberOfItems() {
        return testAndGetSafeSevenZipInArchive().getNumberOfItems();
    }

    public com.tencent.mm.mm7zip.IInArchive testAndGetSafeSevenZipInArchive() {
        if (this.wasClosed) {
            throw new com.tencent.mm.mm7zip.SevenZipException("Archive was closed");
        }
        return this.sevenZipInArchive;
    }
}
