package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class f1 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 f81412d;

    public f1(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var) {
        this.f81412d = j1Var;
    }

    @Override // k75.c
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RuntimeLocationUpdateStateManager", "enter stateNotListening");
        lk1.c cVar = (lk1.c) nd.f.a(lk1.c.class);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81412d;
        cVar.ia(j1Var.f81438n, j1Var.f81436i, j1Var.f81437m);
        this.f81412d.f81440p = false;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.i1 i1Var = this.f81412d.f81442r;
        if (i1Var != null) {
            i1Var.a("StateNotListening");
        }
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81412d;
        if (1 == i17) {
            j1Var.o(j1Var.f81444t);
            return true;
        }
        if (4 != i17) {
            return false;
        }
        j1Var.o(j1Var.f81444t);
        return true;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return this.f81412d.f304846d + "$StateListening";
    }
}
