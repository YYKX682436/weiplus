package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class j implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l f210418d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l lVar) {
        this.f210418d = lVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t data = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f210436f != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l lVar = this.f210418d;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = data.f210435e;
            java.lang.String L = lVar.L(z3Var);
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            lVar.dismiss();
            lVar.f210421s.a(L, d17);
        }
    }
}
