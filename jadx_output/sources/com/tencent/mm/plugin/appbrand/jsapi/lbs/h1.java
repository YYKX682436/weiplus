package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class h1 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 f81422d;

    public h1(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var) {
        this.f81422d = j1Var;
    }

    @Override // k75.c
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RuntimeLocationUpdateStateManager", "enter stateSuspend");
        com.tencent.mm.plugin.appbrand.jsapi.lbs.i1 i1Var = this.f81422d.f81442r;
        if (i1Var != null) {
            i1Var.a("StateSuspend");
        }
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = this.f81422d;
        if (2 == i17) {
            j1Var.o(j1Var.f81443s);
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
        return this.f81422d.f304846d + "$StateSuspend";
    }
}
