package gx0;

/* loaded from: classes5.dex */
public final class sc extends pv0.y {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f358486t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f358487u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f358488v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358486t = jz5.h.b(new gx0.nc(this));
        this.f358487u = jz5.h.b(new gx0.rc(this));
        this.f358488v = jz5.h.b(new gx0.pc(this));
    }

    @Override // pv0.y, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        super.b7();
        ((gx0.bh) ((jz5.n) this.f358487u).mo141623x754a37bb()).L.p();
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.oc(this, null), 3, null);
    }

    @Override // pv0.y
    public gx0.hf n7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // pv0.y, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    /* renamed from: o7 */
    public void a7(pv0.m panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.a7(panel);
        pv0.h m159065x3fab8e2e = panel.m159065x3fab8e2e();
        if (m159065x3fab8e2e == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            m159065x3fab8e2e = null;
        }
        if (m159065x3fab8e2e == null) {
            return;
        }
        gx0.bh bhVar = (gx0.bh) ((jz5.n) this.f358487u).mo141623x754a37bb();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = m159065x3fab8e2e.f440058a;
        gx0.qc qcVar = new gx0.qc(this, c4190xd8dd3713);
        bhVar.getClass();
        bhVar.L.m144677xb4f1a68f(qcVar);
        jz5.g gVar = this.f358488v;
        gx0.bf bfVar = (gx0.bf) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = c4190xd8dd3713.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        bfVar.o7(B, true);
        ((gx0.bf) ((jz5.n) gVar).mo141623x754a37bb()).D = 1;
    }
}
