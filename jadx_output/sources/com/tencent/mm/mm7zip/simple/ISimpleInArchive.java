package com.tencent.mm.mm7zip.simple;

/* loaded from: classes16.dex */
public interface ISimpleInArchive {
    void close();

    com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem getArchiveItem(int i17);

    com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem[] getArchiveItems();

    int getNumberOfItems();
}
