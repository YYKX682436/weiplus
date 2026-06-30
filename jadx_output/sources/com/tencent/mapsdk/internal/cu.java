package com.tencent.mapsdk.internal;

/* loaded from: classes11.dex */
public final class cu implements java.io.Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f49168b = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49170d = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f49172f = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f49174h = 3;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f49176j = true;

    /* renamed from: a, reason: collision with root package name */
    public int f49178a;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f49179l;

    /* renamed from: k, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.cu[] f49177k = new com.tencent.mapsdk.internal.cu[4];

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cu f49169c = new com.tencent.mapsdk.internal.cu(0, 0, "DT_NORMAL");

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cu f49171e = new com.tencent.mapsdk.internal.cu(1, 1, "DT_ONLY_LINK");

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cu f49173g = new com.tencent.mapsdk.internal.cu(2, 2, "DT_ONLY_STATUS");

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.cu f49175i = new com.tencent.mapsdk.internal.cu(3, 3, "DT_LINK_AND_STATUS");

    private cu(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.f49179l = str;
        this.f49178a = i18;
        f49177k[i17] = this;
    }

    private static com.tencent.mapsdk.internal.cu a(int i17) {
        int i18 = 0;
        while (true) {
            com.tencent.mapsdk.internal.cu[] cuVarArr = f49177k;
            if (i18 < cuVarArr.length) {
                com.tencent.mapsdk.internal.cu cuVar = cuVarArr[i18];
                if (cuVar.f49178a == i17) {
                    return cuVar;
                }
                i18++;
            } else {
                if (f49176j) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    public final java.lang.String toString() {
        return this.f49179l;
    }

    private static com.tencent.mapsdk.internal.cu a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.tencent.mapsdk.internal.cu[] cuVarArr = f49177k;
            if (i17 < cuVarArr.length) {
                if (cuVarArr[i17].toString().equals(str)) {
                    return f49177k[i17];
                }
                i17++;
            } else {
                if (f49176j) {
                    return null;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    private int a() {
        return this.f49178a;
    }
}
