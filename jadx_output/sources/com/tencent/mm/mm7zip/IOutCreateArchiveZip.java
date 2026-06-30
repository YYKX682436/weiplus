package com.tencent.mm.mm7zip;

/* loaded from: classes12.dex */
public interface IOutCreateArchiveZip extends com.tencent.mm.mm7zip.IOutCreateArchive<com.tencent.mm.mm7zip.IOutItemZip>, com.tencent.mm.mm7zip.IOutFeatureSetLevel {
    void createArchive(com.tencent.mm.mm7zip.IOutStream iOutStream, int i17, com.tencent.mm.mm7zip.IOutCreateCallback<? extends com.tencent.mm.mm7zip.IOutItemZip> iOutCreateCallback);
}
