package aq1;

/* loaded from: classes11.dex */
public class n implements i35.g, xg3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f94603d = new java.util.ArrayList();

    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactService", "delete contact %s isClearRecord:%s", str, java.lang.Boolean.valueOf(z17));
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new e21.l(str, z17));
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(4, this, false);
    }

    public final void b(java.lang.String str, int i17, boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactService", "handel delete contact username:%s, getEncryptUsername:%s ret:%d, isClearRecord:%s", str, n17.J0(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (i17 != 0) {
            n17.N2();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(str, n17);
            return;
        }
        c01.e2.G0(str);
        if (z17) {
            c01.w9.h(str, null);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.u1(str);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            f9Var.d1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.okq, c01.a2.e(str)));
            f9Var.m124850x7650bebc(10000);
            f9Var.r1(6);
            f9Var.j1(0);
            f9Var.e1(c01.w9.o(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactService", "addDeleteContactSysMsg() called with: username = [" + str + "] insertMsgId:%s", java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var)));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.q7 Ai = r21.w.Ai();
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 i18 = Ai.i1(n17);
        if (i18 != null) {
            i18.f66489x8af1dc48 = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageMsgInfoStorage", "onContactDelete() called with: talker = [%s %s]  set field_isContactDeleted", n17.d1(), n17.J0());
            z18 = Ai.mo51732xbf274172(i18, false, new java.lang.String[0]);
        } else {
            z18 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactService", "handleDeleteContact: handleFMsgDelResult = " + z18);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(str, 15);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(str);
        }
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20627x76705cb0()) == 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k(str);
        }
    }

    public void c(i35.e eVar) {
        ((java.util.ArrayList) this.f94603d).remove(eVar);
    }

    @Override // xg3.d0
    public void u0(int i17, r45.g25 g25Var, xg3.q0 q0Var) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactService", "ret %d, title %d, content %s", java.lang.Integer.valueOf(i17), g25Var.f456375e, g25Var.f456374d);
            if (q0Var.b() == 4) {
                boolean z17 = q0Var instanceof e21.l ? ((e21.l) q0Var).f328073k : true;
                java.lang.String g17 = x51.j1.g(((r45.xb0) new r45.xb0().mo11468x92b714fd(q0Var.a())).f471474d);
                b(g17, i17, z17);
                java.util.Iterator it = ((java.util.ArrayList) this.f94603d).iterator();
                while (it.hasNext()) {
                    ((i35.e) it.next()).K0(g17, i17, g25Var);
                }
                java.util.Iterator it6 = ((fs.c) fs.g.f(i35.f.class)).all().iterator();
                while (it6.hasNext()) {
                    ((i35.f) ((fs.q) it6.next()).get()).K0(g17, i17, g25Var);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeleteContactService", e17, "BaseProtoBuf parseFrom error!", new java.lang.Object[0]);
        }
    }
}
