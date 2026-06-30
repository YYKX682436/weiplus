package com.tencent.mapsdk.internal;

/* loaded from: classes11.dex */
public final class ct implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49160a = 29;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49161b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49162c = 8;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f49164e = true;

    /* renamed from: g, reason: collision with root package name */
    private int f49166g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f49167h;

    /* renamed from: f, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.ct[] f49165f = new com.tencent.mapsdk.internal.ct[28];

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.ct f49163d = new com.tencent.mapsdk.internal.ct("REQ_CONFIG");

    private ct(java.lang.String str) {
        new java.lang.String();
        this.f49167h = str;
        this.f49166g = 29;
        f49165f[26] = this;
    }

    private static com.tencent.mapsdk.internal.ct a(int i17) {
        int i18 = 0;
        while (true) {
            com.tencent.mapsdk.internal.ct[] ctVarArr = f49165f;
            if (i18 < ctVarArr.length) {
                com.tencent.mapsdk.internal.ct ctVar = ctVarArr[i18];
                if (ctVar.f49166g == i17) {
                    return ctVar;
                }
                i18++;
            } else {
                if (f49164e) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    public final java.lang.String toString() {
        return this.f49167h;
    }

    private static com.tencent.mapsdk.internal.ct a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.tencent.mapsdk.internal.ct[] ctVarArr = f49165f;
            if (i17 < ctVarArr.length) {
                if (ctVarArr[i17].toString().equals(str)) {
                    return f49165f[i17];
                }
                i17++;
            } else {
                if (f49164e) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    private int a() {
        return this.f49166g;
    }
}
