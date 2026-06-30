package rv0;

/* loaded from: classes5.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f481548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f481549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(rv0.o7 o7Var, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(1);
        this.f481548d = o7Var;
        this.f481549e = concurrentHashMap;
        this.f481550f = n1Var;
        this.f481551g = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        rv0.o7 o7Var = this.f481548d;
        boolean m160994x67ad68cc = o7Var.m160994x67ad68cc();
        rv0.n1 n1Var = this.f481550f;
        if (m160994x67ad68cc) {
            for (java.util.Map.Entry entry : this.f481549e.entrySet()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) entry.getKey();
                jz5.l lVar = (jz5.l) entry.getValue();
                boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
                float floatValue = ((java.lang.Number) lVar.f384367e).floatValue();
                ex0.c f76 = n1Var.q7().f7(c3971x241f78);
                if (f76 != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = f76.f338652p;
                    c4181x2248e1a3.getClass();
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                    if (D != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.I0(c4181x2248e1a3, booleanValue, D);
                    }
                    f76.E(floatValue);
                }
            }
        }
        rv0.a4.a(this.f481551g, n1Var);
        o7Var.H();
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.f3(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
