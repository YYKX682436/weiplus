package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamOptionResult {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47895a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f47896b = new java.util.ArrayList();

    public MJCamOptionResult(java.lang.String str, java.lang.Object[] objArr) {
        this.f47895a = str;
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                if (obj instanceof com.tencent.maas.camstudio.MJRenderNodeStatsResult) {
                    this.f47896b.add((com.tencent.maas.camstudio.MJRenderNodeStatsResult) obj);
                }
            }
        }
    }

    public java.lang.String getMd5String() {
        return this.f47895a;
    }

    public java.util.List<com.tencent.maas.camstudio.MJRenderNodeStatsResult> getRenderNodeStatsResults() {
        return this.f47896b;
    }

    public java.lang.String toString() {
        return "MJCamOptionResult{md5String='" + this.f47895a + "', renderNodeStatsResults=" + this.f47896b + '}';
    }
}
