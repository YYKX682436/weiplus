package rv0;

/* loaded from: classes5.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f481835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f481836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481837f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(xv0.g gVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var) {
        super(1);
        this.f481835d = gVar;
        this.f481836e = concurrentHashMap;
        this.f481837f = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ex0.r K;
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        xv0.g gVar = this.f481835d;
        boolean m160994x67ad68cc = gVar.m160994x67ad68cc();
        rv0.n1 n1Var = this.f481837f;
        if (m160994x67ad68cc) {
            for (java.util.Map.Entry entry : this.f481836e.entrySet()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) entry.getKey();
                vv0.l lVar = (vv0.l) entry.getValue();
                ex0.a0 s76 = n1Var.s7();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = (s76 == null || (K = s76.K(c3971x241f78)) == null) ? null : K.f338700a;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                if (c4181x2248e1a3 != null) {
                    float f17 = lVar.f521923a;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                    if (D != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.O0(c4181x2248e1a3, f17, D);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a3.D();
                    if (D2 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.R0(c4181x2248e1a3, lVar.f521924b, D2);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4181x2248e1a3.D();
                    if (D3 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.S0(c4181x2248e1a3, lVar.f521925c, D3);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4181x2248e1a3.D();
                    if (D4 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.j1(c4181x2248e1a3, lVar.f521926d, D4);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D5 = c4181x2248e1a3.D();
                    if (D5 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.l1(c4181x2248e1a3, lVar.f521927e, D5);
                    }
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D6 = c4181x2248e1a3.D();
                    if (D6 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.N0(c4181x2248e1a3, lVar.f521928f, D6);
                    }
                }
            }
        }
        gVar.H();
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.v1(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
