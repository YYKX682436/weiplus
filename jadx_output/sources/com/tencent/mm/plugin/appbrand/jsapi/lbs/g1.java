package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class g1 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 f81416d;

    public g1(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var) {
        this.f81416d = j1Var;
    }

    @Override // k75.c
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RuntimeLocationUpdateStateManager", "enter stateListening");
        lk1.c cVar = (lk1.c) nd.f.a(lk1.c.class);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81416d;
        cVar.w9(j1Var.f81438n, j1Var.f81436i, j1Var.f81437m);
        this.f81416d.f81440p = true;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.i1 i1Var = this.f81416d.f81442r;
        if (i1Var != null) {
            i1Var.a("StateListening");
        }
    }

    @Override // k75.c
    public void b() {
        lk1.c cVar = (lk1.c) nd.f.a(lk1.c.class);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81416d;
        cVar.ia(j1Var.f81438n, j1Var.f81436i, j1Var.f81437m);
        this.f81416d.f81440p = false;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.i1 i1Var = this.f81416d.f81442r;
        if (i1Var != null) {
            i1Var.a("StateNotListening");
        }
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81416d;
        if (2 == i17) {
            j1Var.o(j1Var.f81443s);
            return true;
        }
        if (3 != i17) {
            return false;
        }
        j1Var.o(j1Var.f81445u);
        return true;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return this.f81416d.f304846d + "$StateNotListening";
    }
}
