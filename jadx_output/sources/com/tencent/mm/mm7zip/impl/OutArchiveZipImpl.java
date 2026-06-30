package com.tencent.mm.mm7zip.impl;

/* loaded from: classes16.dex */
public class OutArchiveZipImpl extends com.tencent.mm.mm7zip.impl.OutArchiveImpl<com.tencent.mm.mm7zip.IOutItemZip> implements com.tencent.mm.mm7zip.IOutCreateArchiveZip, com.tencent.mm.mm7zip.IOutUpdateArchiveZip {
    @Override // com.tencent.mm.mm7zip.IOutCreateArchiveZip
    public void createArchive(com.tencent.mm.mm7zip.IOutStream iOutStream, int i17, com.tencent.mm.mm7zip.IOutCreateCallback<? extends com.tencent.mm.mm7zip.IOutItemZip> iOutCreateCallback) {
        createArchive((com.tencent.mm.mm7zip.ISequentialOutStream) iOutStream, i17, (com.tencent.mm.mm7zip.IOutCreateCallback) iOutCreateCallback);
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetLevel
    public void setLevel(int i17) {
        featureSetLevel(i17);
    }
}
