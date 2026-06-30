package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class y3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.p4 f92408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f92409b;

    public y3(com.tencent.mm.plugin.appbrand.j3 j3Var, com.tencent.mm.plugin.appbrand.p4 p4Var) {
        this.f92409b = j3Var;
        this.f92408a = p4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) obj;
        if (n7Var != null) {
            return n7Var;
        }
        if (!this.f92409b.f78452d) {
            com.tencent.mm.plugin.appbrand.x3 x3Var = new com.tencent.mm.plugin.appbrand.x3(this, km5.u.c());
            if (this.f92408a == com.tencent.mm.plugin.appbrand.p4.X_CONFIG) {
                this.f92409b.f78450b.m(x3Var);
            } else {
                this.f92409b.f78450b.f74810s.a(x3Var);
            }
        }
        return null;
    }
}
