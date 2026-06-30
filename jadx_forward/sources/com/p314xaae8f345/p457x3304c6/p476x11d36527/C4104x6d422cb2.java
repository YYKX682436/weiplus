package com.p314xaae8f345.p457x3304c6.p476x11d36527;

/* renamed from: com.tencent.maas.material.MJMaterialInfo */
/* loaded from: classes5.dex */
public class C4104x6d422cb2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.g f129756a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129757b;

    /* renamed from: c, reason: collision with root package name */
    public final long f129758c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f129759d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f129760e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f129761f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f129762g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4141x29d4ed4f[] f129763h;

    public C4104x6d422cb2(int i17, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map) {
        this(i17, str, j17, str2, str3, str4, map, new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4141x29d4ed4f[0]);
    }

    /* renamed from: toString */
    public java.lang.String m33800x9616526c() {
        return "MJMaterialInfo{materialScene=" + this.f129756a + ", materialID='" + this.f129757b + "', version=" + this.f129758c + ", materialName='" + this.f129759d + "', previewImageURL='" + this.f129760e + "', downloadURL='" + this.f129761f + "', extraInfo='" + this.f129762g + "', vocalFilterParamsLength='" + this.f129763h.length + "'}";
    }

    public C4104x6d422cb2(int i17, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Object[] objArr) {
        this.f129756a = com.p314xaae8f345.p457x3304c6.p476x11d36527.g.a(i17);
        this.f129757b = str;
        this.f129758c = j17;
        this.f129759d = str2;
        this.f129760e = str3;
        this.f129761f = str4;
        this.f129762g = map;
        this.f129763h = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4141x29d4ed4f[objArr.length];
        for (int i18 = 0; i18 < objArr.length; i18++) {
            this.f129763h[i18] = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4141x29d4ed4f) objArr[i18];
        }
    }
}
