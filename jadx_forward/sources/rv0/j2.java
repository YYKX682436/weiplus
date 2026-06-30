package rv0;

/* loaded from: classes5.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f481589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f481590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481592g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(rv0.j7 j7Var, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(1);
        this.f481589d = j7Var;
        this.f481590e = concurrentHashMap;
        this.f481591f = n1Var;
        this.f481592g = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        rv0.j7 j7Var = this.f481589d;
        if (j7Var.m160994x67ad68cc()) {
            for (java.util.Map.Entry entry : this.f481590e.entrySet()) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) entry.getKey();
                double doubleValue = ((java.lang.Number) entry.getValue()).doubleValue();
                ex0.r K = this.f481592g.K(c3971x241f78);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = K != null ? K.f338700a : null;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                if (c4181x2248e1a3 != null) {
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                    if (D != null) {
                        bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.D0(c4181x2248e1a3, doubleValue, D);
                    }
                    bool.booleanValue();
                }
            }
        }
        j7Var.H();
        rv0.n1 n1Var = this.f481591f;
        p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.i2(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
