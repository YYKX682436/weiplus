package com.tencent.mm.mm7zip.simple.impl;

/* loaded from: classes16.dex */
public class SimpleInArchiveItemImpl implements com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem {
    private final int index;
    private final com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveImpl simpleInArchiveImpl;

    public SimpleInArchiveItemImpl(com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveImpl simpleInArchiveImpl, int i17) {
        this.simpleInArchiveImpl = simpleInArchiveImpl;
        this.index = i17;
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream) {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().extractSlow(this.index, iSequentialOutStream);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.Integer getAttributes() {
        return (java.lang.Integer) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.ATTRIBUTES);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.Integer getCRC() {
        return (java.lang.Integer) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.CRC);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.String getComment() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, com.tencent.mm.mm7zip.PropID.COMMENT);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.util.Date getCreationTime() {
        return (java.util.Date) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.CREATION_TIME);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.String getGroup() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, com.tencent.mm.mm7zip.PropID.GROUP);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.String getHostOS() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, com.tencent.mm.mm7zip.PropID.HOST_OS);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public int getItemIndex() {
        return this.index;
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.util.Date getLastAccessTime() {
        return (java.util.Date) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.LAST_ACCESS_TIME);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.util.Date getLastWriteTime() {
        return (java.util.Date) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.LAST_MODIFICATION_TIME);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.String getMethod() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, com.tencent.mm.mm7zip.PropID.METHOD);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.Long getPackedSize() {
        return (java.lang.Long) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.PACKED_SIZE);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.String getPath() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, com.tencent.mm.mm7zip.PropID.PATH);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.Integer getPosition() {
        return (java.lang.Integer) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.POSITION);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.Long getSize() {
        return (java.lang.Long) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.SIZE);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.String getUser() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, com.tencent.mm.mm7zip.PropID.USER);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public java.lang.Boolean isCommented() {
        return (java.lang.Boolean) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.COMMENTED);
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public boolean isEncrypted() {
        return ((java.lang.Boolean) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.ENCRYPTED)).booleanValue();
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public boolean isFolder() {
        return ((java.lang.Boolean) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, com.tencent.mm.mm7zip.PropID.IS_FOLDER)).booleanValue();
    }

    @Override // com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem
    public com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, java.lang.String str) {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().extractSlow(this.index, iSequentialOutStream, str);
    }

    public SimpleInArchiveItemImpl(com.tencent.mm.mm7zip.IInArchive iInArchive, int i17) {
        this.simpleInArchiveImpl = new com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveImpl(iInArchive);
        this.index = i17;
    }
}
