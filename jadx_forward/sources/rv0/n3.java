package rv0;

/* loaded from: classes5.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.f f481673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e f481675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481677h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481678i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(rv0.f fVar, rv0.n1 n1Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, ex0.a0 a0Var) {
        super(1);
        this.f481673d = fVar;
        this.f481674e = n1Var;
        this.f481675f = c4188xeef5596e;
        this.f481676g = c4128x879fba0a;
        this.f481677h = c4128x879fba0a2;
        this.f481678i = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a newStartTimeInMedia = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newStartTimeInMedia, "newStartTimeInMedia");
        this.f481673d.J();
        rv0.n1 n1Var = this.f481674e;
        gx0.kh q76 = n1Var.q7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f481675f.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        ex0.o m76 = q76.m7(c3971x241f78);
        if (m76 != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = m76.i().add(newStartTimeInMedia);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f481676g;
            if (add.m33971xf922bec1(c4128x879fba0a)) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = c4128x879fba0a.sub(newStartTimeInMedia);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub, "sub(...)");
                m76.y(sub);
            }
            m76.f338663f.u0(newStartTimeInMedia);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i17 = m76.i();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a musicOriginDuration = this.f481677h;
            if (!i17.m33975x22a7969a(musicOriginDuration)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicOriginDuration, "$musicOriginDuration");
                m76.y(musicOriginDuration);
            }
            newStartTimeInMedia.m33988x124aa384();
            m76.i().m33988x124aa384();
            m76.j().m33988x124aa384();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m17 = m76.m();
            if (m17 != null) {
                dx0.o.c(m17);
            }
            dx0.o.c(m76.l());
            java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f306042e, cx0.d.f306043f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of6, "of(...)");
            this.f481678i.J(of6, null);
            p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.m3(n1Var, m76, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
