package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f182538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f182539b;

    /* renamed from: c, reason: collision with root package name */
    public final long f182540c;

    /* renamed from: d, reason: collision with root package name */
    public final long f182541d;

    /* renamed from: e, reason: collision with root package name */
    public final float f182542e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182543f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f182544g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f182545h;

    /* renamed from: i, reason: collision with root package name */
    public final long f182546i;

    /* renamed from: j, reason: collision with root package name */
    public final float f182547j;

    public m2(float f17, int i17, long j17, long j18, float f18, boolean z17, boolean z18, boolean z19, long j19, float f19, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        float f27 = (i18 & 1) != 0 ? 100.0f : f17;
        int i19 = (i18 & 2) != 0 ? 20 : i17;
        long j27 = (i18 & 4) != 0 ? 16L : j17;
        long j28 = (i18 & 8) != 0 ? 10L : j18;
        float f28 = (i18 & 16) != 0 ? 20.0f : f18;
        boolean z27 = (i18 & 32) != 0 ? true : z17;
        boolean z28 = (i18 & 64) != 0 ? true : z18;
        boolean z29 = (i18 & 128) == 0 ? z19 : true;
        long j29 = (i18 & 256) != 0 ? 200L : j19;
        float f29 = (i18 & 512) != 0 ? 10.0f : f19;
        this.f182538a = f27;
        this.f182539b = i19;
        this.f182540c = j27;
        this.f182541d = j28;
        this.f182542e = f28;
        this.f182543f = z27;
        this.f182544g = z28;
        this.f182545h = z29;
        this.f182546i = j29;
        this.f182547j = f29;
    }

    /* renamed from: equals */
    public boolean m55345xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.m2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.m2 m2Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.m2) obj;
        return java.lang.Float.compare(this.f182538a, m2Var.f182538a) == 0 && this.f182539b == m2Var.f182539b && this.f182540c == m2Var.f182540c && this.f182541d == m2Var.f182541d && java.lang.Float.compare(this.f182542e, m2Var.f182542e) == 0 && this.f182543f == m2Var.f182543f && this.f182544g == m2Var.f182544g && this.f182545h == m2Var.f182545h && this.f182546i == m2Var.f182546i && java.lang.Float.compare(this.f182547j, m2Var.f182547j) == 0;
    }

    /* renamed from: hashCode */
    public int m55346x8cdac1b() {
        return (((((((((((((((((java.lang.Float.hashCode(this.f182538a) * 31) + java.lang.Integer.hashCode(this.f182539b)) * 31) + java.lang.Long.hashCode(this.f182540c)) * 31) + java.lang.Long.hashCode(this.f182541d)) * 31) + java.lang.Float.hashCode(this.f182542e)) * 31) + java.lang.Boolean.hashCode(this.f182543f)) * 31) + java.lang.Boolean.hashCode(this.f182544g)) * 31) + java.lang.Boolean.hashCode(this.f182545h)) * 31) + java.lang.Long.hashCode(this.f182546i)) * 31) + java.lang.Float.hashCode(this.f182547j);
    }

    /* renamed from: toString */
    public java.lang.String m55347x9616526c() {
        return "SwipeMultiSelectConfig(autoScrollEdgeThreshold=" + this.f182538a + ", autoScrollSpeed=" + this.f182539b + ", autoScrollInterval=" + this.f182540c + ", vibrationDuration=" + this.f182541d + ", minSwipeDistance=" + this.f182542e + ", enableHapticFeedback=" + this.f182543f + ", enableAutoScroll=" + this.f182544g + ", autoScrollAcceleration=" + this.f182545h + ", longPressDelay=" + this.f182546i + ", longPressMoveThreshold=" + this.f182547j + ')';
    }
}
