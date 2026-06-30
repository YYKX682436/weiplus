package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.c1.class)
/* loaded from: classes9.dex */
public class yg extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.c1 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202 c5689x3d19c202 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202();
        c5689x3d19c202.f136014g.f88092a = 2;
        c5689x3d19c202.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.LocationComponent", "doDestroy: ");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5268xee9bd1b5().e();
    }

    @Override // yn.d
    public void h0(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 67 || i17 == 68) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (i11.u.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).b(this.f280113d.g())) {
                    i11.u.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).d(this.f280113d.g());
                    return;
                } else {
                    db5.e1.C(this.f280113d.g(), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), this.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xg(this), null);
                    return;
                }
            }
            if (i17 == 67) {
                o0();
            } else {
                p0();
            }
        }
    }

    public boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!f9Var.L2()) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.d(f9Var);
        this.f280113d.L(true);
        return true;
    }

    public java.util.Map n0() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e;
        hashMap.put("has_reddot", 0);
        hashMap.put("attachment_exp_sessionid", c19666xfd6e2f33.m75435xc09a09d9().f271462e);
        hashMap.put("chat_name", this.f280113d.x());
        java.lang.String x17 = this.f280113d.x();
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(x17) ? 3 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(x17) ? 2 : 1;
        if (c01.e2.R(x17)) {
            i17 = 4;
        }
        hashMap.put("chat_type", java.lang.Integer.valueOf(i17));
        return hashMap;
    }

    public void o0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 1, "");
        android.content.Intent intent = new android.content.Intent();
        if (this.f280113d.D()) {
            intent.putExtra("type_tag", 2);
        } else {
            intent.putExtra("type_tag", 1);
        }
        intent.putExtra("map_view_type", 0);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("map_sender_name", this.f280113d.t());
        intent.putExtra("map_talker_name", this.f280113d.x());
        j45.l.j(this.f280113d.g(), ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(3, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0() {
        /*
            r4 = this;
            yb5.d r0 = r4.f280113d
            android.app.Activity r0 = r0.g()
            boolean r0 = iq.b.C(r0)
            if (r0 != 0) goto Leb
            yb5.d r0 = r4.f280113d
            android.app.Activity r0 = r0.g()
            boolean r0 = iq.b.v(r0)
            if (r0 != 0) goto Leb
            yb5.d r0 = r4.f280113d
            android.app.Activity r0 = r0.g()
            boolean r0 = iq.b.e(r0)
            if (r0 != 0) goto Leb
            java.lang.Class<com.tencent.mm.plugin.multitalk.model.y> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.multitalk.model.y r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) r0
            yb5.d r1 = r4.f280113d
            java.lang.String r1 = r1.x()
            boolean r0 = r0.q4(r1)
            if (r0 == 0) goto L4f
            java.lang.String r0 = "MicroMsg.ChattingUI.LocationComponent"
            java.lang.String r1 = "click share location, but now is in multitalk!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            yb5.d r0 = r4.f280113d
            android.app.Activity r0 = r0.g()
            r1 = 2131772008(0x7f104268, float:1.9175363E38)
            r2 = 2131756315(0x7f10051b, float:1.9143534E38)
            db5.e1.i(r0, r1, r2)
            return
        L4f:
            r0 = 0
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 != 0) goto Ld2
            q21.a r1 = q21.d.a()
            if (r1 == 0) goto L96
            q21.a r1 = q21.d.a()
            yb5.d r2 = r4.f280113d
            com.tencent.mm.storage.z3 r2 = r2.u()
            java.lang.String r2 = r2.d1()
            va3.z0 r1 = (va3.z0) r1
            boolean r1 = r1.f(r2)
            if (r1 == 0) goto L96
            q21.a r1 = q21.d.a()
            yb5.d r2 = r4.f280113d
            com.tencent.mm.storage.z3 r2 = r2.u()
            java.lang.String r2 = r2.d1()
            va3.z0 r1 = (va3.z0) r1
            java.util.LinkedList r1 = r1.b(r2)
            if (r1 == 0) goto L96
            yb5.d r2 = r4.f280113d
            java.lang.String r2 = r2.t()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L96
            r1 = 1
            goto L97
        L96:
            r1 = 0
        L97:
            if (r1 != 0) goto Ld2
            yb5.d r1 = r4.f280113d
            android.app.Activity r1 = r1.g()
            com.tencent.mm.ui.widget.dialog.a r2 = new com.tencent.mm.ui.widget.dialog.a
            r2.<init>()
            r2.f293262s = r0
            android.content.res.Resources r0 = of5.b.a(r1)
            r3 = 2131769644(0x7f10392c, float:1.9170568E38)
            java.lang.String r0 = r0.getString(r3)
            r2.f293265v = r0
            com.tencent.mm.ui.chatting.component.wg r0 = new com.tencent.mm.ui.chatting.component.wg
            r0.<init>(r4)
            r2.E = r0
            com.tencent.mm.ui.widget.dialog.j0 r0 = new com.tencent.mm.ui.widget.dialog.j0
            r3 = 2131821911(0x7f110557, float:1.9276579E38)
            r0.<init>(r1, r3)
            r0.e(r2)
            com.tencent.mm.ui.widget.dialog.d0 r1 = r2.f293256m
            if (r1 == 0) goto Lce
            android.widget.EditText r2 = r0.f293370r
            r1.a(r2)
        Lce:
            r0.show()
            goto Leb
        Ld2:
            yb5.d r0 = r4.f280113d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f542241c
            java.lang.Class<sb5.j2> r1 = sb5.j2.class
            yn.e r0 = r0.a(r1)
            sb5.j2 r0 = (sb5.j2) r0
            java.lang.String r1 = "fromPluginLocation"
            com.tencent.mm.ui.chatting.component.sm r0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) r0
            r0.t0(r1)
            r0 = 3
            r1 = 10
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(r0, r1)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yg.p0():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202 c5689x3d19c202 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202();
        am.ej ejVar = c5689x3d19c202.f136014g;
        ejVar.f88092a = 0;
        ejVar.f88093b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.u().d1());
        c5689x3d19c202.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.LocationComponent", "doCreate: ");
    }
}
