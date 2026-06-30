package vl0;

/* loaded from: classes13.dex */
public final class a implements gl0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at.e f519311a;

    public a(at.e eVar) {
        this.f519311a = eVar;
    }

    @Override // gl0.a
    public void a(fl0.b bVar, long j17, boolean z17, float f17) {
        at.e eVar = this.f519311a;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveHomeReddotPredict", "item null");
            if (eVar != null) {
                eVar.a("", 2, 0.0f);
                return;
            }
            return;
        }
        if (eVar != null) {
            java.lang.String c17 = ((pl0.e) bVar).c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getUid(...)");
            eVar.a(c17, z17 ? 1 : 0, f17);
        }
        if (nl0.c.f419694c == null) {
            nl0.c.b();
        }
        nl0.f fVar = nl0.c.f419694c;
        java.lang.String c18 = ((pl0.e) bVar).c();
        java.lang.String ret = java.lang.String.valueOf(z17 ? 1 : 0);
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        if (c18 == null) {
            return;
        }
        dm.l9 l9Var = new dm.l9();
        l9Var.f67351x29cc1f0d = f17;
        l9Var.f67352x4b6e878b = c18;
        l9Var.f67348x4b6e404e = "LiveHomeRedDot";
        l9Var.f67349x4b6e7bdc = ret;
        l9Var.f67350xa597db4a = java.lang.System.currentTimeMillis();
        fVar.mo880xb970c2b9(l9Var);
    }

    @Override // gl0.a
    public void b(fl0.b bVar) {
        at.e eVar;
        if (bVar == null || (eVar = this.f519311a) == null) {
            return;
        }
        java.lang.String c17 = ((pl0.e) bVar).c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getUid(...)");
        eVar.mo8975x68ac462(c17);
    }
}
