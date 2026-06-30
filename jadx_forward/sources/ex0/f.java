package ex0;

/* loaded from: classes5.dex */
public abstract class f extends ex0.r {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 f338663f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f338664g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f338665h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f338666i;

    /* renamed from: j, reason: collision with root package name */
    public ax0.a f338667j;

    /* renamed from: k, reason: collision with root package name */
    public ax0.d f338668k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f338669l;

    /* renamed from: m, reason: collision with root package name */
    public ax0.c f338670m;

    /* renamed from: n, reason: collision with root package name */
    public float f338671n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f338672o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 elementSegment) {
        super(elementSegment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elementSegment, "elementSegment");
        this.f338663f = elementSegment;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        this.f338664g = ZeroTime;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        this.f338665h = ZeroTime;
        this.f338667j = ax0.a.f96493d;
        this.f338668k = ax0.d.f96504d;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 InvalidTimeRange = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16108xa1116659;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTimeRange, "InvalidTimeRange");
        this.f338669l = InvalidTimeRange;
        this.f338670m = ax0.c.f96500d;
        this.f338671n = 0.3f;
    }

    @Override // ex0.r
    public final void g() {
        int ordinal = this.f338702c.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 10) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = this.f338663f;
            if (c4183xefcb50b7.j0()) {
                ug.m C = c4183xefcb50b7.C();
                if (C == ug.m.MovieClip || C == ug.m.Music) {
                    c4183xefcb50b7.s0(c4183xefcb50b7.w().add(c4183xefcb50b7.i0()));
                } else if (C == ug.m.ImageClip) {
                    c4183xefcb50b7.s0(c4183xefcb50b7.f130058d);
                }
            }
        }
    }

    @Override // ex0.r
    public final void h() {
        int ordinal = this.f338702c.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 10) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = this.f338663f;
            if (c4183xefcb50b7.k0()) {
                ug.m C = c4183xefcb50b7.C();
                if (C != ug.m.MovieClip && C != ug.m.Music) {
                    if (C == ug.m.ImageClip) {
                        c4183xefcb50b7.r0(c4183xefcb50b7.f130058d);
                    }
                } else {
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a w17 = c4183xefcb50b7.w();
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4183xefcb50b7.D();
                    if (D != null) {
                        c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.X(c4183xefcb50b7, D);
                    }
                    c4183xefcb50b7.r0(w17.add(c4128x879fba0a));
                }
            }
        }
    }

    public final boolean r(android.graphics.PointF pointF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointF, "pointF");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = this.f338663f;
        if (!c4183xefcb50b7.q0()) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4183xefcb50b7.D();
        if (D == null) {
            return true;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Z(c4183xefcb50b7, pointF, D);
        return true;
    }

    public final boolean s(float f17) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = this.f338663f;
        if (!c4183xefcb50b7.q0()) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4183xefcb50b7.D();
        if (D == null) {
            return true;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.J(c4183xefcb50b7, f17, D);
        return true;
    }

    public final void t(android.graphics.PointF layerScale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layerScale, "layerScale");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = this.f338663f;
        if (c4183xefcb50b7.q0()) {
            c4183xefcb50b7.t0(layerScale);
        }
    }

    public final boolean u(float f17, boolean z17, boolean z18) {
        int ordinal = this.f338667j.ordinal();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = this.f338663f;
        if (ordinal == 1) {
            return (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) < 0 ? c4183xefcb50b7.j0() && !z17 : c4183xefcb50b7.z().sub(c4183xefcb50b7.f130057c).m33971xf922bec1(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5);
        }
        if (ordinal != 2) {
            return false;
        }
        return (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) > 0 ? c4183xefcb50b7.k0() && !z18 : c4183xefcb50b7.z().sub(c4183xefcb50b7.f130057c).m33971xf922bec1(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5);
    }

    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.5f);
    }

    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.5f);
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a x(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a duration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(duration, "duration");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a max = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.max(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, duration);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(max, "max(...)");
        return max;
    }

    public final boolean y(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a duration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(duration, "duration");
        if (duration.m33975x22a7969a(i())) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i17 = i();
        this.f338663f.r0(duration);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i18 = i();
        duration.m33988x124aa384();
        i17.m33988x124aa384();
        i18.m33988x124aa384();
        l().m34007xde00a612().m33988x124aa384();
        return !i17.m33975x22a7969a(i18);
    }

    public final boolean z(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a duration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(duration, "duration");
        if (duration.m33975x22a7969a(i())) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i17 = i();
        this.f338663f.s0(duration);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i18 = i();
        java.util.Objects.toString(this.f338702c);
        duration.m33988x124aa384();
        i17.m33988x124aa384();
        i18.m33988x124aa384();
        k().m33988x124aa384();
        return !i17.m33975x22a7969a(i18);
    }
}
