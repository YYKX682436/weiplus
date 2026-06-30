package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.g.class)
/* loaded from: classes9.dex */
public final class h0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.g {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f280667e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f280668f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g0(this);

    @Override // yn.d
    public void Z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "onFinish");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        java.util.Set set = this.f280667e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "onChattingInit %s, exposedMsgs: %d", this, java.lang.Integer.valueOf(set.size()));
        set.clear();
    }

    public final boolean m0() {
        if (!((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui()) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f280113d.x(), true);
        if ((n17 == null || n17.m2()) ? false : true) {
            return false;
        }
        return ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Bi(this.f280113d.x());
    }

    public boolean n0() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("BrandEcsTemplateMsg@fakeuser", this.f280113d.x());
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "onChattingResume, username: ".concat(this.f280113d.x()));
            bw.k kVar = (bw.k) i95.n0.c(bw.k.class);
            java.lang.String x17 = this.f280113d.x();
            zv.e2 e2Var = (zv.e2) kVar;
            e2Var.getClass();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            r45.r06 r06Var = new r45.r06();
            r06Var.f465936d = x17;
            r06Var.f465937e = 1;
            lVar.f152197a = r06Var;
            lVar.f152198b = new r45.s06();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/timeline/serviceuseractionreport";
            lVar.f152200d = 28908;
            com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new zv.d2(e2Var), false);
            bw.j jVar = (bw.j) i95.n0.c(bw.j.class);
            java.lang.String x18 = this.f280113d.x();
            ((zv.o0) jVar).getClass();
            if (zv.q.f557612a.g()) {
                kk.l lVar2 = ow.y.f430807a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsPrivateNoticeMsgLogic", "inChatting");
                ow.y.f430808b.put(x18, java.lang.Boolean.TRUE);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (!n0()) {
            if (m0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "onChattingPause, username: ".concat(this.f280113d.x()));
                bw.j jVar = (bw.j) i95.n0.c(bw.j.class);
                java.lang.String x17 = this.f280113d.x();
                ((zv.o0) jVar).getClass();
                if (zv.q.f557612a.g()) {
                    kk.l lVar = ow.y.f430807a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsPrivateNoticeMsgLogic", "outChatting");
                    ow.y.f430808b.remove(x17);
                    return;
                }
                return;
            }
            return;
        }
        boolean z17 = false;
        java.lang.Boolean m78383x21a1233e = this.f280113d.f542250l.m78383x21a1233e("key_is_jump_from_brs_box", false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78383x21a1233e, "getBooleanExtra(...)");
        if (m78383x21a1233e.booleanValue()) {
            pm0.v.K(null, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e0.f280486d);
            return;
        }
        if (this.f280113d.l() != null) {
            java.lang.Boolean m78383x21a1233e2 = this.f280113d.f542250l.m78383x21a1233e("KIsHalfScreen", false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78383x21a1233e2, "getBooleanExtra(...)");
            if (m78383x21a1233e2.booleanValue()) {
                z17 = true;
            }
        }
        boolean z18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f280113d.f542241c.a(sb5.z0.class))).f281228s;
        if (z17 && z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsComponent", "onChattingPause halfScreen and markUnread, skip");
        } else {
            pm0.v.K(null, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f0.f280533d);
        }
    }
}
