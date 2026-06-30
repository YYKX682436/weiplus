package vl4;

/* loaded from: classes11.dex */
public final class l extends sl4.g {
    public final jz5.g A;
    public boolean B;
    public final jz5.g C;
    public boolean D;

    public l() {
        super(bw5.eq0.TingChatRoom);
        this.A = jz5.h.b(new vl4.k(this));
        this.C = jz5.h.b(vl4.h.f519423d);
    }

    public final boolean A0(boolean z17) {
        boolean D0;
        jm4.d1 p17;
        if (!this.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall can not add floatball, not isBackground");
            return false;
        }
        jm4.g3 C0 = C0();
        if (((C0 == null || (p17 = ((jm4.h3) C0).p()) == null) ? null : ((jm4.e1) p17).a()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "onEnterBackground getCurRoomCategoryItem is null");
            return false;
        }
        if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingChatRoomFloatBallHelper", "canAddFloatBall ting is playing");
            D0 = false;
        } else {
            D0 = D0();
        }
        if (D0) {
            if (!u()) {
                return e0();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall has ball and ignore");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall can not add floatball");
        if (z17 | (!com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.A)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkAndAddFloatBall can not add floatball and STOP!");
            y0();
        }
        this.f490796r = false;
        this.f490793o = null;
        this.f490801w = null;
        return false;
    }

    public final void B0() {
        jm4.d1 p17;
        jm4.g3 C0 = C0();
        if (C0 == null || (p17 = ((jm4.h3) C0).p()) == null) {
            return;
        }
        jm4.e1 e1Var = (jm4.e1) p17;
        bw5.o50 a17 = e1Var.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "exitChatRoom chatRoomCategory is null");
            return;
        }
        vl4.u uVar = vl4.u.f519437a;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f490794p;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = c26845xac206036 != null ? (b66.g) c26845xac206036.m106052x32c52b() : null;
        boolean c17 = uVar.c(interfaceC26826xca759055 instanceof jm4.n2 ? (jm4.n2) interfaceC26826xca759055 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "exitChatRoom exitChatRoom " + c17);
        if (c17) {
            bw5.o50 o50Var = new bw5.o50();
            o50Var.i(a17.c());
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            qk.f9.a(aj6, context, o50Var, null, true, null, 20, null);
            return;
        }
        bw5.o50 a18 = e1Var.a();
        if (a18 != null) {
            byte[] mo14344x5f01b1f6 = a18.mo14344x5f01b1f6();
            long m105978x2737f10 = e1Var.m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3381xf512d0a5.C30435x21b2e5fd.m168911x21b18cf2(m105978x2737f10, mo14344x5f01b1f6);
        }
    }

    public final jm4.g3 C0() {
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f490794p;
        b66.g gVar = c26845xac206036 != null ? (b66.g) c26845xac206036.m106052x32c52b() : null;
        jm4.n2 n2Var = gVar instanceof jm4.n2 ? (jm4.n2) gVar : null;
        if (n2Var != null) {
            return ((jm4.p2) n2Var).f();
        }
        return null;
    }

    public boolean D0() {
        return j0() != null;
    }

    @Override // sl4.a
    public void a() {
        vl4.u uVar = vl4.u.f519437a;
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f490794p;
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = c26845xac206036 != null ? (b66.g) c26845xac206036.m106052x32c52b() : null;
        if (uVar.b(interfaceC26826xca759055 instanceof jm4.n2 ? (jm4.n2) interfaceC26826xca759055 : null)) {
            return;
        }
        d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        this.f490795q = true;
        t().f174619f = 28;
        b66.n j07 = j0();
        if (j07 != null) {
            p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169678x21b16174(((b66.q) j07).m105978x2737f10(), (vl4.j) ((jz5.n) this.A).mo141623x754a37bb());
        }
    }

    @Override // sl4.g, sl4.a
    public void c(bl4.b info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.c(info);
        if (il4.m.a(info.f103267c)) {
            boolean hj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).hj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "checkRemoveTingFloatBallOrStop isIdle: " + hj6);
            if (hj6) {
                return;
            }
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).zj();
        }
    }

    @Override // sl4.g
    public bl4.a f0() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2299x55baa833.C18726x3fbb17bf(context, null);
    }

    @Override // sl4.g
    public java.lang.String g0() {
        return "TingChatRoomFloatBall";
    }

    @Override // sl4.g, sl4.a
    public void h() {
        super.h();
        this.B = false;
    }

    @Override // sl4.g
    public int h0() {
        return 53;
    }

    @Override // sl4.g, sl4.a
    public void i(boolean z17) {
        if (this.B) {
            return;
        }
        this.B = true;
        A0(z17);
    }

    @Override // sl4.g
    public void n0() {
        B0();
    }

    @Override // sl4.g
    public void o0(qp1.j0 permissionCheckResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissionCheckResult, "permissionCheckResult");
        jz5.g gVar = this.C;
        if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() && !permissionCheckResult.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingChatRoomFloatBallHelper", "onFloatBallPermissionCheckResult: " + permissionCheckResult + " not ok and stop");
            y0();
        }
        if (permissionCheckResult == qp1.j0.Already_Has) {
            bl4.b bVar = this.f490793o;
            yl4.a.c(bVar != null ? bVar.f103270f : null, bVar != null ? bVar.f103271g : null);
            return;
        }
        if (permissionCheckResult == qp1.j0.Allow) {
            bl4.b bVar2 = this.f490793o;
            yl4.a.f(bVar2 != null ? bVar2.f103270f : null, bVar2 != null ? bVar2.f103271g : null);
        } else if (permissionCheckResult == qp1.j0.Refuse && ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.omm);
            e4Var.c();
        }
    }

    @Override // sl4.g
    public void p0() {
        bl4.b bVar = this.f490793o;
        yl4.a.d(false, bVar != null ? bVar.f103270f : null, bVar != null ? bVar.f103271g : null);
    }

    @Override // sl4.g
    public void q0() {
        bl4.b bVar = this.f490793o;
        yl4.a.d(true, bVar != null ? bVar.f103270f : null, bVar != null ? bVar.f103271g : null);
    }

    @Override // sl4.g
    public void r0() {
        bl4.b bVar = this.f490793o;
        yl4.a.e(bVar != null ? bVar.f103270f : null, bVar != null ? bVar.f103271g : null);
    }

    @Override // sl4.g
    public void t0() {
        b66.n a17;
        b66.g i07 = i0();
        if (i07 != null && ((b66.i) i07).m9897x74292566() == bw5.eq0.TingChatRoom) {
            boolean z17 = !this.D;
            b66.g i08 = i0();
            if (i08 == null || (a17 = ((b66.i) i08).a()) == null) {
                return;
            }
            if (z17) {
                b66.m.a(a17, null, 1, null);
            } else {
                b66.m.b(a17, null, 1, null);
            }
        }
    }

    @Override // sl4.g
    public void u0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
        B0();
    }

    @Override // sl4.g
    public boolean v0(int i17) {
        b66.g i07 = i0();
        if (i07 == null || ((b66.i) i07).m9897x74292566() != bw5.eq0.TingChatRoom) {
            return false;
        }
        boolean z17 = i17 == 3;
        this.D = z17;
        return !z17;
    }
}
