package un;

/* loaded from: classes.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f510788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(un.k0 k0Var) {
        super(1);
        this.f510788d = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.p pVar = (wi5.p) state.a(wi5.p.class);
        un.k0 k0Var = this.f510788d;
        if (pVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = un.k0.V6(k0Var).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 instanceof com.p314xaae8f345.mm.ui.p2724x335620.p2725x32b09e.C22460x20778e62) {
                un.k0.V6(k0Var).l().m78861xe90b84f5(new java.lang.String[]{"🔍", "#"});
                ((com.p314xaae8f345.mm.ui.p2724x335620.p2725x32b09e.C22460x20778e62) a17).f233604u.mo7806x9d92d11c(k0Var.m158354x19263085(), new un.c0(k0Var, a17));
            }
        }
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            em.l2 V6 = un.k0.V6(k0Var);
            if (V6.f336092p == null) {
                V6.f336092p = (android.widget.TextView) V6.f336077a.findViewById(com.p314xaae8f345.mm.R.id.b5i);
            }
            V6.f336092p.setVisibility(0);
            em.l2 V62 = un.k0.V6(k0Var);
            if (V62.f336092p == null) {
                V62.f336092p = (android.widget.TextView) V62.f336077a.findViewById(com.p314xaae8f345.mm.R.id.b5i);
            }
            V62.f336092p.setOnClickListener(new un.d0(k0Var));
            un.k0.V6(k0Var).b().m75365x562adaa6(k0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.oft));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 b17 = un.k0.V6(k0Var).b();
            if (b17 != null) {
                b17.post(new un.f0(k0Var));
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.c0)) {
            java.lang.String str = (java.lang.String) kz5.n0.a0(((wi5.c0) dVar2).f527815b, 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (str != null && n17 != null) {
                java.lang.String l17 = c01.v1.l(str, un.k0.U6(k0Var));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", str);
                intent.putExtra("Contact_RemarkName", n17.w0());
                intent.putExtra("Contact_RoomNickname", l17);
                intent.putExtra("Contact_Nick", n17.P0());
                intent.putExtra("Contact_RoomMember", true);
                intent.putExtra("room_name", un.k0.U6(k0Var));
                if (((int) n17.E2) > 0 && n17.r2()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
                    am.au auVar = c6005x8a110b2f.f136299g;
                    auVar.f87720a = intent;
                    auVar.f87721b = str;
                    c6005x8a110b2f.e();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(219L, 9L, 1L, true);
                if (n17.k2()) {
                    g0Var.mo68478xbd3cda5f(10298, n17.d1() + ",14");
                }
                intent.putExtra("Contact_Scene", 14);
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = k0Var.f510833h;
                if (a3Var != null) {
                    intent.putExtra("Is_RoomOwner", a3Var.L0(str));
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent.putExtra("Is_RoomOwner", false), "run(...)");
                }
                intent.putExtra("Contact_ChatRoomId", un.k0.U6(k0Var));
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(un.k0.U6(k0Var))) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8 c6800x63c0d5b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8();
                    c6800x63c0d5b8.p(un.k0.U6(k0Var));
                    c6800x63c0d5b8.f141319e = 12L;
                    c6800x63c0d5b8.k();
                }
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 8);
                j45.l.j(k0Var.m158354x19263085(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
