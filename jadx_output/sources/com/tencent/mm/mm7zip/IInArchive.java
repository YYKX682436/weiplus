package com.tencent.mm.mm7zip;

/* loaded from: classes16.dex */
public interface IInArchive extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void extract(int[] iArr, boolean z17, com.tencent.mm.mm7zip.IArchiveExtractCallback iArchiveExtractCallback);

    com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(int i17, com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream);

    com.tencent.mm.mm7zip.ExtractOperationResult extractSlow(int i17, com.tencent.mm.mm7zip.ISequentialOutStream iSequentialOutStream, java.lang.String str);

    com.tencent.mm.mm7zip.ArchiveFormat getArchiveFormat();

    java.lang.Object getArchiveProperty(com.tencent.mm.mm7zip.PropID propID);

    com.tencent.mm.mm7zip.PropertyInfo getArchivePropertyInfo(int i17);

    com.tencent.mm.mm7zip.IOutUpdateArchive<com.tencent.mm.mm7zip.IOutItemAllFormats> getConnectedOutArchive();

    com.tencent.mm.mm7zip.IOutUpdateArchive7z getConnectedOutArchive7z();

    com.tencent.mm.mm7zip.IOutUpdateArchiveZip getConnectedOutArchiveZip();

    int getNumberOfArchiveProperties();

    int getNumberOfItems();

    int getNumberOfProperties();

    java.lang.Object getProperty(int i17, com.tencent.mm.mm7zip.PropID propID);

    com.tencent.mm.mm7zip.PropertyInfo getPropertyInfo(int i17);

    com.tencent.mm.mm7zip.simple.ISimpleInArchive getSimpleInterface();

    java.lang.String getStringArchiveProperty(com.tencent.mm.mm7zip.PropID propID);

    java.lang.String getStringProperty(int i17, com.tencent.mm.mm7zip.PropID propID);
}
