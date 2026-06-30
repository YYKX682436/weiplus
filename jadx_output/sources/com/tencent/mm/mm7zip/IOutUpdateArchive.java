package com.tencent.mm.mm7zip;

/* loaded from: classes16.dex */
public interface IOutUpdateArchive<T extends com.tencent.mm.mm7zip.IOutItemBase> extends com.tencent.mm.mm7zip.IOutArchiveBase {
    com.tencent.mm.mm7zip.ArchiveFormat getArchiveFormat();

    com.tencent.mm.mm7zip.IInArchive getConnectedInArchive();

    void updateItems(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, int i17, com.tencent.mm.mm7zip.IOutCreateCallback<T> iOutCreateCallback);
}
