package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.t1 f178166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.t1 t1Var) {
        super(1);
        this.f178166d = t1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object tag = it.getTag();
        boolean z17 = tag instanceof gx1.b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.t1 t1Var = this.f178166d;
        if (z17) {
            java.lang.String string = t1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.by);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (!(tag instanceof gx1.g)) {
            return "";
        }
        java.lang.String string2 = t1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571331c0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string2;
    }
}
