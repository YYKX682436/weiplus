package com.tencent.mm.mm7zip.impl;

/* loaded from: classes16.dex */
public class OutArchive7zImpl extends com.tencent.mm.mm7zip.impl.OutArchiveImpl<com.tencent.mm.mm7zip.IOutItem7z> implements com.tencent.mm.mm7zip.IOutCreateArchive7z, com.tencent.mm.mm7zip.IOutUpdateArchive7z {
    private boolean solidExtension;
    private boolean solid = true;
    private int countOfFilesPerBlock = -1;
    private long countOfBytesPerBlock = -1;

    @Override // com.tencent.mm.mm7zip.impl.OutArchiveImpl
    public void applyFeatures() {
        super.applyFeatures();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.solidExtension) {
            sb6.append(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        }
        int i17 = this.countOfFilesPerBlock;
        if (i17 != -1) {
            sb6.append(i17);
            sb6.append("F");
        }
        long j17 = this.countOfBytesPerBlock;
        if (j17 != -1) {
            sb6.append(j17);
            sb6.append("B");
        }
        if (sb6.length() > 0) {
            nativeSetSolidSpec(sb6.toString());
        }
        if (this.solid) {
            return;
        }
        nativeSetSolidSpec(null);
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetEncryptHeader
    public void setHeaderEncryption(boolean z17) {
        featureSetHeaderEncryption(z17);
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetLevel
    public void setLevel(int i17) {
        featureSetLevel(i17);
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetSolid
    public void setSolid(boolean z17) {
        this.solid = z17;
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetSolid
    public void setSolidExtension(boolean z17) {
        this.solidExtension = z17;
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetSolid
    public void setSolidFiles(int i17) {
        this.countOfFilesPerBlock = i17;
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetSolid
    public void setSolidSize(long j17) {
        this.countOfBytesPerBlock = j17;
    }

    @Override // com.tencent.mm.mm7zip.IOutFeatureSetMultithreading
    public void setThreadCount(int i17) {
        featureSetThreadCount(i17);
    }
}
