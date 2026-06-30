package com.tencent.mm.mm7zip;

/* loaded from: classes12.dex */
public interface IOutCreateArchive<T extends com.tencent.mm.mm7zip.IOutItemBase> extends com.tencent.mm.mm7zip.IOutArchiveBase, java.io.Closeable {
    void createArchive(com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, int i17, com.tencent.mm.mm7zip.IOutCreateCallback<? extends T> iOutCreateCallback);

    com.tencent.mm.mm7zip.ArchiveFormat getArchiveFormat();
}
