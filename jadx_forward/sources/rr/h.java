package rr;

/* loaded from: classes12.dex */
public final class h implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.n f480661d;

    public h(rr.n nVar) {
        this.f480661d = nVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        rr.n nVar = this.f480661d;
        java.lang.Integer num = nVar.f480675h != null ? 698 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        r1Var.q(num.intValue(), this);
        z12.g gVar = nVar.f480675h;
        if (gVar == null || m1Var != gVar) {
            return;
        }
        if (gVar != null && gVar.f550828g == 3) {
            if (i17 != 0 || i18 != 0) {
                rr.n.a(nVar, false);
                return;
            }
            gr.t.g().n(true);
            gr.t.g().l(true);
            z85.l c17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
            java.lang.String mo42933xb5885648 = nVar.f480670c.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            c17.y2(0, kz5.b0.c(mo42933xb5885648));
            com.p314xaae8f345.mm.p2621x8fb0427b.z4.f277924j.g();
            rr.n.a(nVar, true);
        }
    }
}
