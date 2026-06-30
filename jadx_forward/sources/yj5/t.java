package yj5;

/* loaded from: classes8.dex */
public final class t extends yj5.a implements q21.c {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be f544264f;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be = this.f544264f;
        if (c21532x4955f5be != null) {
            c21532x4955f5be.i();
        }
    }

    @Override // q21.c
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        yb5.d dVar = this.f280113d;
        if (dVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar.x())) {
            return;
        }
        o0();
    }

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536425q;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        if (q21.d.a() == null) {
            return null;
        }
        va3.z0 z0Var = (va3.z0) q21.d.a();
        java.lang.String str = talkerInfo.f542275a;
        if (!z0Var.f(str)) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList b17 = ((va3.z0) q21.d.a()).b(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getTrackRoomInfo(...)");
        linkedList.add(new xj5.i(b17));
        return linkedList;
    }

    @Override // yj5.a
    public void n0() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be = this.f544264f;
        if (c21532x4955f5be != null) {
            c21532x4955f5be.setVisibility(8);
            c21532x4955f5be.a();
            c21532x4955f5be.c(-1, 0);
            c21532x4955f5be.i();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf) ((sb5.a1) this.f280113d.f542241c.a(sb5.a1.class))).I0(-1, false);
        }
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.y(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        q21.a a17 = q21.d.a();
        if (a17 != null) {
            va3.z0 z0Var = (va3.z0) a17;
            synchronized (z0Var) {
                ((java.util.LinkedList) z0Var.f515932d).add(this);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        q21.a a17 = q21.d.a();
        if (a17 != null) {
            va3.z0 z0Var = (va3.z0) a17;
            synchronized (z0Var) {
                ((java.util.LinkedList) z0Var.f515932d).remove(this);
            }
        }
    }
}
