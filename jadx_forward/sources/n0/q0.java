package n0;

/* loaded from: classes14.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.k4 f415212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f415213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f415214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(n0.k4 k4Var, n0.d dVar, java.util.List list) {
        super(3);
        this.f415212d = k4Var;
        this.f415213e = dVar;
        this.f415214f = list;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rememberManager, "rememberManager");
        java.util.List list = this.f415214f;
        n0.k4 k4Var = this.f415212d;
        n0.o4 j17 = k4Var.j();
        try {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((yz5.q) list.get(i17)).mo147xb9724478(applier, j17, rememberManager);
            }
            j17.e();
            int i18 = slots.f415188m;
            slots.f415188m = i18 + 1;
            if (i18 == 0) {
                slots.f415191p.b(((slots.f415177b.length / 5) - slots.f415181f) - slots.f415182g);
            }
            n0.d dVar = this.f415213e;
            dVar.getClass();
            slots.s(k4Var, k4Var.e(dVar));
            slots.i();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            j17.e();
            throw th6;
        }
    }
}
