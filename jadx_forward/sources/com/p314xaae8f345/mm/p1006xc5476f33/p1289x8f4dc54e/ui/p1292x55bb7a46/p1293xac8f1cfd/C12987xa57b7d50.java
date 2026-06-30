package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd;

@yn.c(m177365x976763e5 = zq1.d0.class)
/* renamed from: com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent */
/* loaded from: classes11.dex */
public final class C12987xa57b7d50 extends yn.n implements zq1.d0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd.C12988x7ec4e214 f175589e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent$bizFansNeedCheckFansEvent$1] */
    public C12987xa57b7d50() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f175589e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5194x6b73faf2>(a0Var) { // from class: com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent$bizFansNeedCheckFansEvent$1
            {
                this.f39173x3fe91575 = -893235486;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5194x6b73faf2 c5194x6b73faf2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5194x6b73faf2 event = c5194x6b73faf2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.s0 s0Var = event.f135535g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingBizFansComponent", "BizFansNeedCheckFansNotifyEvent talker %s", s0Var.f89389a);
                java.lang.String str = s0Var.f89389a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd.C12987xa57b7d50 c12987xa57b7d50 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd.C12987xa57b7d50.this;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c12987xa57b7d50.o0())) {
                    return false;
                }
                c12987xa57b7d50.m0();
                ((yb5.d) c12987xa57b7d50.f545128d).k();
                return false;
            }
        };
    }

    @Override // yn.n, yn.l
    public void E() {
        if (p0(o0())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.u2 u2Var = com.p314xaae8f345.mm.p2621x8fb0427b.u2.f276886a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = u2Var.a();
            if (a17 != null && a17.i("biz_fans_privacy_guide_dialog_shown", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingBizFansComponent", "privacy guide dialog has been shown");
            } else {
                android.app.Activity g17 = ((yb5.d) this.f545128d).g();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(g17, 0, 0, true);
                z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.dzj);
                android.view.View view = z2Var.f293591g;
                if (view == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChattingBizFansComponent", "showPrivacyDialogIfNeed: rootView is null, skip");
                } else {
                    ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.c9z)).setOnClickListener(new qr1.c(z2Var));
                    if (n0() == 5) {
                        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.ngp);
                        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cgi)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.ngw);
                    } else {
                        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.nfe);
                        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cgi)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.nfl);
                    }
                    ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566682u00)).setOnClickListener(new qr1.d(this, g17));
                    z2Var.C();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = u2Var.a();
                    if (a18 != null) {
                        a18.G("biz_fans_privacy_guide_dialog_shown", true);
                    }
                }
            }
            zq1.u uVar = (zq1.u) i95.n0.c(zq1.u.class);
            java.lang.String o07 = o0();
            int n07 = n0();
            br1.m mVar = (br1.m) uVar;
            mVar.getClass();
            mVar.Ni(n07).a(o07, n07, java.lang.Boolean.TRUE);
            jr1.i.f382893a.e(2, jr1.j.e(o0(), n0()), n0());
        }
    }

    @Override // yn.l
    public void K() {
        o0();
        n0();
        if (p0(o0())) {
            java.lang.String o07 = o0();
            if (n0() == 5) {
                nr1.f Vi = yq1.u0.Vi();
                Vi.getClass();
                Vi.m(o07, true);
            } else {
                hr1.i Di = yq1.u0.Di();
                Di.getClass();
                Di.m(o07, true);
            }
        }
    }

    @Override // yn.n, yn.l
    public void a() {
        java.lang.String a17;
        android.database.Cursor B;
        boolean z17;
        if (!p0(o0())) {
            return;
        }
        m0();
        if (((yb5.d) this.f545128d).k() != 1) {
            return;
        }
        if (n0() == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            a17 = jr1.j.c(((ox.r) d0Var).Bi(2).c());
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            a17 = jr1.j.a(((ox.r) d0Var2).Bi(1).c());
        }
        if (n0() == 5) {
            nr1.k Zi = yq1.u0.Zi();
            java.lang.String o07 = o0();
            Zi.getClass();
            B = Zi.f420687d.B("select rowid from BizPhotoFansSessionInfo  where talker = '" + o07 + "' limit 1", null);
            try {
                z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z17) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingBizFansComponent", "ensureSessionInfoIfInteractive: no sessionInfo for talker=" + o0() + ", creating...");
                hr1.m mVar = new hr1.m();
                mVar.f66479xbed8694c = o0();
                mVar.f66480x114ef53e = o0();
                mVar.f66478x1362f030 = a17;
                Zi.D0(mVar, 0, hr1.u.f364898d);
            } finally {
            }
        } else {
            hr1.o Ni = yq1.u0.Ni();
            java.lang.String o08 = o0();
            Ni.getClass();
            B = Ni.f364892d.B("select rowid from BizFansSessionInfo  where talker = '" + o08 + "' limit 1", null);
            try {
                z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z17) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingBizFansComponent", "ensureSessionInfoIfInteractive: no sessionInfo for talker=" + o0() + ", creating...");
                hr1.m mVar2 = new hr1.m();
                mVar2.f66479xbed8694c = o0();
                mVar2.f66480x114ef53e = o0();
                mVar2.f66478x1362f030 = a17;
                Ni.z0(mVar2, 0, hr1.u.f364898d);
            } finally {
            }
        }
    }

    public final void m0() {
        java.lang.String c17;
        qr1.b bVar = new qr1.b(this);
        r45.s00 s00Var = new r45.s00();
        if (n0() == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        s00Var.f466893d = c17;
        s00Var.f466894e = jr1.j.e(o0(), n0());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 25584;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mp/checkfansmsg";
        lVar.f152197a = s00Var;
        lVar.f152198b = new r45.t00();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        android.content.ComponentCallbacks2 g17 = ((yb5.d) this.f545128d).g();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).Ai(a17, new qr1.a(bVar), g17 instanceof im5.b ? (im5.b) g17 : null);
    }

    @Override // yn.n, yn.m
    public void n(yn.f context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.n(context);
        if (p0(o0())) {
            mo48813x58998cd();
        }
    }

    public final int n0() {
        java.lang.String o07 = o0();
        if (r26.i0.n(o07, "@picfansmsg", false)) {
            return 5;
        }
        r26.i0.n(o07, "@bizfansmsg", false);
        return 0;
    }

    public final java.lang.String o0() {
        return ((yb5.d) this.f545128d).x();
    }

    public final boolean p0(java.lang.String str) {
        return r26.i0.n(str, "@bizfansmsg", false) || r26.i0.n(str, "@picfansmsg", false);
    }

    @Override // yn.n, yn.l
    public void x() {
        if (p0(o0())) {
            m0();
        }
    }
}
