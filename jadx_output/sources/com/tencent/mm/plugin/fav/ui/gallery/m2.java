package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f101005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f101006b;

    /* renamed from: c, reason: collision with root package name */
    public final long f101007c;

    /* renamed from: d, reason: collision with root package name */
    public final long f101008d;

    /* renamed from: e, reason: collision with root package name */
    public final float f101009e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101010f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101011g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f101012h;

    /* renamed from: i, reason: collision with root package name */
    public final long f101013i;

    /* renamed from: j, reason: collision with root package name */
    public final float f101014j;

    public m2(float f17, int i17, long j17, long j18, float f18, boolean z17, boolean z18, boolean z19, long j19, float f19, int i18, kotlin.jvm.internal.i iVar) {
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
        this.f101005a = f27;
        this.f101006b = i19;
        this.f101007c = j27;
        this.f101008d = j28;
        this.f101009e = f28;
        this.f101010f = z27;
        this.f101011g = z28;
        this.f101012h = z29;
        this.f101013i = j29;
        this.f101014j = f29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.fav.ui.gallery.m2)) {
            return false;
        }
        com.tencent.mm.plugin.fav.ui.gallery.m2 m2Var = (com.tencent.mm.plugin.fav.ui.gallery.m2) obj;
        return java.lang.Float.compare(this.f101005a, m2Var.f101005a) == 0 && this.f101006b == m2Var.f101006b && this.f101007c == m2Var.f101007c && this.f101008d == m2Var.f101008d && java.lang.Float.compare(this.f101009e, m2Var.f101009e) == 0 && this.f101010f == m2Var.f101010f && this.f101011g == m2Var.f101011g && this.f101012h == m2Var.f101012h && this.f101013i == m2Var.f101013i && java.lang.Float.compare(this.f101014j, m2Var.f101014j) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((java.lang.Float.hashCode(this.f101005a) * 31) + java.lang.Integer.hashCode(this.f101006b)) * 31) + java.lang.Long.hashCode(this.f101007c)) * 31) + java.lang.Long.hashCode(this.f101008d)) * 31) + java.lang.Float.hashCode(this.f101009e)) * 31) + java.lang.Boolean.hashCode(this.f101010f)) * 31) + java.lang.Boolean.hashCode(this.f101011g)) * 31) + java.lang.Boolean.hashCode(this.f101012h)) * 31) + java.lang.Long.hashCode(this.f101013i)) * 31) + java.lang.Float.hashCode(this.f101014j);
    }

    public java.lang.String toString() {
        return "SwipeMultiSelectConfig(autoScrollEdgeThreshold=" + this.f101005a + ", autoScrollSpeed=" + this.f101006b + ", autoScrollInterval=" + this.f101007c + ", vibrationDuration=" + this.f101008d + ", minSwipeDistance=" + this.f101009e + ", enableHapticFeedback=" + this.f101010f + ", enableAutoScroll=" + this.f101011g + ", autoScrollAcceleration=" + this.f101012h + ", longPressDelay=" + this.f101013i + ", longPressMoveThreshold=" + this.f101014j + ')';
    }
}
