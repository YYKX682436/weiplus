package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class a4 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f74891a;

    public a4(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f74891a = j3Var;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) obj;
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f74891a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(n7Var != null);
        j3Var.h("pageView onTerminate loaded[%b], countdown", objArr);
        this.f74891a.f78455g = n7Var;
        this.f74891a.j();
    }
}
