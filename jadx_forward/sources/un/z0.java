package un;

/* loaded from: classes11.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f510877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(un.g1 g1Var) {
        super(1);
        this.f510877d = g1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        un.g1 g1Var = this.f510877d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            g1Var.X6();
            g1Var.V6().n().setOnClickListener(new un.v0(g1Var));
            g1Var.V6().s().setOnClickListener(new un.w0(g1Var));
            a14.a.f82114n = new a14.a();
            a14.a a17 = a14.a.a();
            java.lang.String T6 = g1Var.T6();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6872xac0d44e3 c6872xac0d44e3 = a17.f82115a;
            c6872xac0d44e3.f141890d = c6872xac0d44e3.b("RoomId", T6, true);
            c6872xac0d44e3.f141912z = c01.e2.E(T6) ? 1 : 0;
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(g1Var.T6()) || c01.e2.E(g1Var.T6()) || ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D2(g1Var.T6()) <= 0) {
                g1Var.V6().n().setVisibility(8);
                a14.a.a().f82115a.f141891e = 0;
            } else {
                g1Var.V6().n().setVisibility(0);
                a14.a.a().f82115a.f141891e = 1;
            }
            ((com.p314xaae8f345.mm.p648x55baa833.ui.uic.C10386x9087a77d) ((jz5.n) g1Var.f510802t).mo141623x754a37bb()).mo48813x58998cd();
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.c)) {
            a14.a a18 = a14.a.a();
            java.util.ArrayList arrayList = new java.util.ArrayList(state.f527852o);
            a18.getClass();
            long size = arrayList.size();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6872xac0d44e3 c6872xac0d44e32 = a18.f82115a;
            c6872xac0d44e32.f141893g = size;
            c6872xac0d44e32.f141906t = c6872xac0d44e32.b("InvitedUsrs", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ";"), true);
            j75.e eVar = ((wi5.c) dVar2).f379600a;
            if (eVar != null && (eVar instanceof un.a)) {
                un.a aVar = (un.a) eVar;
                if (aVar.f527817a) {
                    if (aVar.f510764b || aVar.f510765c) {
                        db5.e1.y(g1Var.m158354x19263085(), g1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.htx), "", g1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), un.x0.f510871d);
                        a14.a.a().f82124j++;
                    } else if (aVar.f510766d) {
                        db5.e1.y(g1Var.m158354x19263085(), g1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.htw), "", g1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), un.y0.f510874d);
                        a14.a.a().f82125k++;
                        a14.a.a().f82123i++;
                    }
                }
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c0Var.f527815b, ","));
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo localHistoryInfo = new com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.LocalHistoryInfo();
            dn.h hVar = g1Var.f510797o;
            if (hVar != null) {
                localHistoryInfo.f145250d = hVar.f69522xf9dbbe9c;
                localHistoryInfo.f145251e = hVar.f69502xf11df5f5;
                localHistoryInfo.f145252f = hVar.f69526x419c9c3d;
                localHistoryInfo.f145253g = (int) hVar.f69523x17c343e7;
                localHistoryInfo.f145254h = g1Var.f510791f;
            }
            dn.h hVar2 = g1Var.f510801s;
            if (hVar2 != null) {
                localHistoryInfo.f145255i = hVar2.f69522xf9dbbe9c;
                localHistoryInfo.f145256m = hVar2.f69502xf11df5f5;
                localHistoryInfo.f145257n = hVar2.f69526x419c9c3d;
                localHistoryInfo.f145258o = (int) hVar2.f69523x17c343e7;
                localHistoryInfo.f145259p = g1Var.f510791f;
            }
            intent.putExtra("select_record_msg_info", localHistoryInfo);
            intent.putExtra("select_record_fake_msg_id", ((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) g1Var.f510796n.first).f231013d);
            g1Var.m158354x19263085().setResult(-1, intent);
            g1Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
