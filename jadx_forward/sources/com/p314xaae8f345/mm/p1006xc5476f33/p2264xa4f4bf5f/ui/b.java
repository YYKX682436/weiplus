package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f255270a;

    /* renamed from: b, reason: collision with root package name */
    public final float f255271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f255272c;

    /* renamed from: d, reason: collision with root package name */
    public final int f255273d;

    /* renamed from: e, reason: collision with root package name */
    public final long f255274e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Interpolator f255275f;

    public b(float f17, float f18, int i17, int i18, long j17, android.view.animation.Interpolator interpolator, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        interpolator = (i19 & 32) != 0 ? ta5.h.f498412a.a() : interpolator;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interpolator, "interpolator");
        this.f255270a = f17;
        this.f255271b = f18;
        this.f255272c = i17;
        this.f255273d = i18;
        this.f255274e = j17;
        this.f255275f = interpolator;
    }

    /* renamed from: equals */
    public boolean m71862xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b) obj;
        return java.lang.Float.compare(this.f255270a, bVar.f255270a) == 0 && java.lang.Float.compare(this.f255271b, bVar.f255271b) == 0 && this.f255272c == bVar.f255272c && this.f255273d == bVar.f255273d && this.f255274e == bVar.f255274e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255275f, bVar.f255275f);
    }

    /* renamed from: hashCode */
    public int m71863x8cdac1b() {
        return (((((((((java.lang.Float.hashCode(this.f255270a) * 31) + java.lang.Float.hashCode(this.f255271b)) * 31) + java.lang.Integer.hashCode(this.f255272c)) * 31) + java.lang.Integer.hashCode(this.f255273d)) * 31) + java.lang.Long.hashCode(this.f255274e)) * 31) + this.f255275f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m71864x9616526c() {
        return "AnimationStage(startSize=" + this.f255270a + ", endSize=" + this.f255271b + ", startColor=" + this.f255272c + ", endColor=" + this.f255273d + ", duration=" + this.f255274e + ", interpolator=" + this.f255275f + ')';
    }
}
