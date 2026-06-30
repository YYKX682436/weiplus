package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ge {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mapsdk.internal.ge f49572a = a(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int f49573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49574c;

    private ge(int i17, int i18) {
        this.f49573b = i17;
        this.f49574c = i18;
    }

    public static com.tencent.mapsdk.internal.ge a(int i17, int i18) {
        if (i17 <= i18) {
            return new com.tencent.mapsdk.internal.ge(i17, i18);
        }
        throw new java.lang.IllegalStateException("Range的范围最小值不能大于最大值");
    }

    private com.tencent.mapsdk.internal.ge b(com.tencent.mapsdk.internal.ge geVar) {
        return a(java.lang.Math.min(this.f49573b, geVar.f49573b), java.lang.Math.max(this.f49574c, geVar.f49574c));
    }

    private int b() {
        return this.f49574c;
    }

    public final boolean a(int i17) {
        return this.f49573b <= i17 && i17 <= this.f49574c;
    }

    private com.tencent.mapsdk.internal.ge a(com.tencent.mapsdk.internal.ge geVar) {
        int i17;
        int i18 = this.f49574c;
        int i19 = geVar.f49573b;
        if (i18 >= i19 && (i17 = this.f49573b) <= geVar.f49574c) {
            return a(java.lang.Math.max(i17, i19), java.lang.Math.min(this.f49574c, geVar.f49574c));
        }
        return f49572a;
    }

    private int a() {
        return this.f49573b;
    }
}
