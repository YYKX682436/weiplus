package t20;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final t20.g f496208a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f496209b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f496210c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f496211d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.p8 f496212e;

    public i(t20.g service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f496208a = service;
    }

    public void a(android.view.View view, java.lang.String identifier) {
        if (view != null) {
            if (identifier == null || identifier.length() == 0) {
                return;
            }
            t20.g gVar = this.f496208a;
            gVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identifier, "identifier");
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) gVar.f496204d).get(identifier);
            android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view2 != null && view2 != view) {
                gVar.Di(view2);
            }
            if (gVar.Ai(view) != null) {
                gVar.Di(view);
            }
            y02.n0 b17 = b();
            if (b17 != null) {
                view.setTag(com.p314xaae8f345.mm.R.id.t68, b17);
                gVar.getClass();
                view.setTag(com.p314xaae8f345.mm.R.id.t67, identifier);
                gVar.f496204d.put(identifier, new java.lang.ref.WeakReference(view));
                gVar.wi(view);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.Oracle.EcsOracleService", "[bindSessionWithIdentifier] view:%s, identifier:%s, session:%s", view, identifier, b17);
            }
        }
    }

    public final y02.n0 b() {
        int i17 = y02.o0.f540149d;
        y02.n0 n0Var = (y02.n0) p3380x6a61f93.p3387xf51c6630.C30615x21b18c1b.m170274x21b14333();
        if (n0Var == null) {
            return null;
        }
        yz5.l lVar = this.f496209b;
        if (lVar != null) {
            y02.o1 o1Var = new y02.o1();
            o1Var.f540151d = lVar;
        }
        yz5.l lVar2 = this.f496210c;
        if (lVar2 != null) {
            y02.o1 o1Var2 = new y02.o1();
            o1Var2.f540151d = lVar2;
        }
        yz5.l lVar3 = this.f496211d;
        if (lVar3 != null) {
            y02.o1 o1Var3 = new y02.o1();
            o1Var3.f540151d = lVar3;
        }
        bw5.p8 p8Var = this.f496212e;
        if (p8Var != null) {
            byte[] mo14344x5f01b1f6 = p8Var.mo14344x5f01b1f6();
            long m105978x2737f10 = ((y02.o0) n0Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        }
        return n0Var;
    }
}
