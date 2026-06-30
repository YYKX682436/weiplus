package com.tencent.maas.camstudio;

/* loaded from: classes3.dex */
public class MJAIGCAssetAnalysisResult {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJAIFaceResult[] f47834a;

    public MJAIGCAssetAnalysisResult(java.lang.Object[] objArr) {
        com.tencent.maas.camstudio.MJAIFaceResult[] mJAIFaceResultArr;
        if (objArr == null) {
            mJAIFaceResultArr = null;
        } else {
            com.tencent.maas.camstudio.MJAIFaceResult[] mJAIFaceResultArr2 = new com.tencent.maas.camstudio.MJAIFaceResult[objArr.length];
            for (int i17 = 0; i17 < objArr.length; i17++) {
                mJAIFaceResultArr2[i17] = (com.tencent.maas.camstudio.MJAIFaceResult) objArr[i17];
            }
            mJAIFaceResultArr = mJAIFaceResultArr2;
        }
        this.f47834a = mJAIFaceResultArr;
    }

    public java.lang.String toString() {
        return "MJAIGCAssetAnalysisResult{faceResults=" + this.f47834a.toString() + '}';
    }
}
