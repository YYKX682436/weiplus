package aj5;

/* loaded from: classes.dex */
public final class a0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f86915d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f86916e;

    /* renamed from: f, reason: collision with root package name */
    public p13.c f86917f;

    /* renamed from: g, reason: collision with root package name */
    public p13.c f86918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f86915d = jz5.h.b(aj5.t.f87048d);
        this.f86916e = jz5.h.b(new aj5.z(this));
    }

    public static final void T6(aj5.a0 a0Var, wi5.n0 n0Var) {
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactRecommendUIC", "startRecommendChatRoom");
        p13.c cVar = a0Var.f86917f;
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            a0Var.f86917f = null;
        }
        aj5.w wVar = new aj5.w();
        java.util.List b17 = wi5.p0.f527866a.b(n0Var.f527852o, n0Var.f527851n, false);
        if (!(!((java.util.ArrayList) b17).isEmpty())) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = a0Var.V6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.z(wVar);
                return;
            }
            return;
        }
        p13.u uVar = new p13.u();
        ((java.util.ArrayList) uVar.f432688q).addAll(b17);
        uVar.f432673b = 8;
        uVar.f432683l = r13.b.f450135d;
        uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) a0Var.f86915d).mo141623x754a37bb();
        uVar.f432680i = 3;
        uVar.f432687p = true;
        uVar.f432684m = new aj5.s(a0Var, new aj5.v(a0Var, wVar));
        a0Var.f86917f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
    }

    public static final void U6(aj5.a0 a0Var, wi5.n0 n0Var) {
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactRecommendUIC", "startRecommendContact");
        p13.c cVar = a0Var.f86918g;
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            a0Var.f86918g = null;
        }
        aj5.y yVar = new aj5.y();
        java.util.List b17 = wi5.p0.f527866a.b(n0Var.f527852o, n0Var.f527851n, false);
        if (!(!((java.util.ArrayList) b17).isEmpty())) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = a0Var.V6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 != null) {
                a17.z(yVar);
                return;
            }
            return;
        }
        p13.u uVar = new p13.u();
        ((java.util.ArrayList) uVar.f432688q).addAll(b17);
        uVar.f432673b = 13;
        uVar.f432683l = r13.b.f450135d;
        uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) a0Var.f86915d).mo141623x754a37bb();
        uVar.f432680i = 6;
        uVar.f432684m = new aj5.s(a0Var, new aj5.x(a0Var, yVar));
        uVar.f432687p = true;
        a0Var.f86918g = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(11, uVar);
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f86916e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("recommend_chatroom", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new aj5.u(this, booleanExtra));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p13.c cVar = this.f86917f;
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar);
            this.f86917f = null;
        }
        p13.c cVar2 = this.f86918g;
        if (cVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(cVar2);
            this.f86918g = null;
        }
    }
}
