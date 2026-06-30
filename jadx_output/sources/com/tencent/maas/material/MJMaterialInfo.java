package com.tencent.maas.material;

/* loaded from: classes5.dex */
public class MJMaterialInfo {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.g f48223a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48224b;

    /* renamed from: c, reason: collision with root package name */
    public final long f48225c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48226d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f48227e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f48228f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f48229g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[] f48230h;

    public MJMaterialInfo(int i17, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map) {
        this(i17, str, j17, str2, str3, str4, map, new com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[0]);
    }

    public java.lang.String toString() {
        return "MJMaterialInfo{materialScene=" + this.f48223a + ", materialID='" + this.f48224b + "', version=" + this.f48225c + ", materialName='" + this.f48226d + "', previewImageURL='" + this.f48227e + "', downloadURL='" + this.f48228f + "', extraInfo='" + this.f48229g + "', vocalFilterParamsLength='" + this.f48230h.length + "'}";
    }

    public MJMaterialInfo(int i17, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Object[] objArr) {
        this.f48223a = com.tencent.maas.material.g.a(i17);
        this.f48224b = str;
        this.f48225c = j17;
        this.f48226d = str2;
        this.f48227e = str3;
        this.f48228f = str4;
        this.f48229g = map;
        this.f48230h = new com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams[objArr.length];
        for (int i18 = 0; i18 < objArr.length; i18++) {
            this.f48230h[i18] = (com.tencent.maas.moviecomposing.EqualizerPeakingFilterParams) objArr[i18];
        }
    }
}
