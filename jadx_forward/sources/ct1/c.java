package ct1;

/* loaded from: classes11.dex */
public abstract class c implements ct1.v {

    /* renamed from: g, reason: collision with root package name */
    public static c01.v8 f303753g;

    /* renamed from: d, reason: collision with root package name */
    public final vg3.z4 f303754d = new ct1.a(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1 f303755e = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1();

    /* renamed from: f, reason: collision with root package name */
    public final w11.u f303756f = new ct1.b(this);

    public boolean b(r45.w3 w3Var) {
        return true;
    }

    public final void c(r45.w3 w3Var) {
        r45.j4 j4Var = w3Var.f470359d;
        if (j4Var.f459097n == null) {
            j4Var.f459097n = new r45.cu5();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseBypSyncHandler", "[processToFunctionMsg] ImgBuf is null");
        }
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(w3Var.f470359d, false, false, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f118594a.b1(p0Var);
    }

    public void f() {
        w11.u uVar = this.f303756f;
        if (this.f303755e.f270153a != null) {
            boolean z17 = uVar instanceof w11.z0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.z2.f230302b;
            if (z17) {
                v2Var.z(uVar);
            } else if ((uVar instanceof java.lang.String) && uVar.equals("NetSceneInit")) {
                v2Var.z(uVar);
            } else if (uVar instanceof w11.u) {
                v2Var.z(uVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseBypSyncHandler", "[finishReceive]");
    }

    public abstract int h();

    public abstract int i();

    public abstract vg3.z4 k();

    public void l(java.util.List list) {
    }

    public final void m(vg3.x3 x3Var, r45.w3 w3Var, r45.tr trVar) {
        java.lang.String g17 = x51.j1.g(w3Var.f470363h ? w3Var.f470359d.f459091e : w3Var.f470359d.f459092f);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, "");
        if (w3Var.f470363h && !g17.equals(str)) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).hj()).y0(g17, i());
        }
        if (i() == 11) {
            java.lang.String n17 = n(w3Var);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                w3Var.f470359d.f459099p = n17;
            }
        } else if (w3Var.f470363h) {
            w3Var.f470359d.f459092f = x51.j1.i(w3Var.f470360e);
        } else {
            w3Var.f470359d.f459091e = x51.j1.i(w3Var.f470360e);
        }
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(w3Var.f470359d, false, false, false);
        p0Var.f152265g = new r45.w3().mo11468x92b714fd(trVar.f468254f.f273689a);
        p0Var.f152266h = h();
        vg3.w3 w3Var2 = (vg3.w3) i95.n0.c(vg3.w3.class);
        vg3.z4 k17 = k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.b2) w3Var2).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a2.b(p0Var, com.p314xaae8f345.mm.p642xad8b531f.x1.e(), k17);
    }

    public java.lang.String n(r45.w3 w3Var) {
        return null;
    }

    public boolean o(java.lang.Exception exc) {
        return false;
    }

    public void pi(java.util.LinkedList linkedList, boolean z17) {
        int i17;
        w11.u uVar = this.f303756f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1 a1Var = this.f303755e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseBypSyncHandler", "[onReceive] size=%s", java.lang.Integer.valueOf(linkedList.size()));
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        try {
            try {
                a1Var.b(uVar);
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.tr trVar = (r45.tr) it.next();
                    if (trVar.f468253e == 1) {
                        r45.w3 w3Var = new r45.w3();
                        w3Var.mo11468x92b714fd(trVar.f468254f.f273689a);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w3Var.f470360e) && ((i17 = w3Var.f470359d.f459093g) == 10002 || i17 == 10001)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseBypSyncHandler", "dispatchToSysCmdMsgExtension, MsgType=%s isContinue=%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                            c(w3Var);
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w3Var.f470360e)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseBypSyncHandler", "msg_session_id is null! FromUserName=%s ToUserName=%s", x51.j1.g(w3Var.f470359d.f459091e), x51.j1.g(w3Var.f470359d.f459092f));
                        } else {
                            r45.j4 j4Var = w3Var.f470359d;
                            if (j4Var.f459101r == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseBypSyncHandler", "NewMsgId is zero! FromUserName=%s ToUserName=%s", x51.j1.g(j4Var.f459091e), x51.j1.g(w3Var.f470359d.f459092f));
                            } else if (b(w3Var)) {
                                linkedList2.add(w3Var);
                                m(x3Var, w3Var, trVar);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseBypSyncHandler", "[onReceive] ignore this msg %s", w3Var.f470360e);
                            }
                        }
                    }
                }
                l(linkedList2);
                a1Var.a(uVar);
                if (z17) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("BaseBypSyncHandler", e17, "", new java.lang.Object[0]);
                if (o(e17)) {
                    throw new java.lang.RuntimeException(e17);
                }
                l(linkedList2);
                a1Var.a(uVar);
                if (z17) {
                    return;
                }
            }
            f();
        } catch (java.lang.Throwable th6) {
            l(linkedList2);
            a1Var.a(uVar);
            if (!z17) {
                f();
            }
            throw th6;
        }
    }
}
