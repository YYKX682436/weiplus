package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public final class h4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ak0 f234171d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f234172e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f234173f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f234174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f234172e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.d4(this));
        this.f234173f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.f4(this));
        this.f234174g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.c4(this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f234172e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e) mo141623x754a37bb;
    }

    public final void P6() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, null);
        if (str == null || str.length() == 0) {
            this.f234171d = null;
            return;
        }
        try {
            this.f234171d = wo3.l.I(new org.json.JSONObject(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletOfflineEnableUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final void Q6() {
        r45.ak0 ak0Var = this.f234171d;
        if (ak0Var != null) {
            if (!(ak0Var != null && ak0Var.f451594d == 0)) {
                if (O6().d(9)) {
                    if (O6().f234006d == 9) {
                        O6().a();
                    }
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f234174g).mo141623x754a37bb();
                    if (viewGroup != null) {
                        viewGroup.setVisibility(4);
                    }
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e O6 = O6();
                    java.lang.Object mo141623x754a37bb = ((jz5.n) this.f234173f).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                    final android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) mo141623x754a37bb;
                    r45.ak0 ak0Var2 = this.f234171d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.g4 g4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.g4(this);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineAlertView", "showEnableTokenAlert");
                    O6.f234006d = 9;
                    O6.f234009g = false;
                    O6.setVisibility(0);
                    O6.f234008f.removeAllViews();
                    final android.view.View inflate = android.view.LayoutInflater.from(O6.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d7j, O6.f234008f, false);
                    O6.f234008f.addView(inflate);
                    android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.kiq);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/OfflineAlertView", "showEnableTokenAlert", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/EnableCodePage;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/offline/ui/OfflineAlertView", "showEnableTokenAlert", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/EnableCodePage;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.h7n);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564466s7);
                    android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.h5h);
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80822x51aaf0c4);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ak0Var2.f451596f)) {
                        textView.setText(ak0Var2.f451596f);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ak0Var2.f451597g)) {
                        button.setText(ak0Var2.f451597g);
                    }
                    ((android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.m9c)).setVisibility(8);
                    button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.s(O6, g4Var));
                    viewGroup2.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e.f234005n;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e.this;
                            c16759xaa786f9e.getClass();
                            android.view.View view = viewGroup2;
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getHeight());
                            android.view.View view2 = inflate;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", valueOf, java.lang.Integer.valueOf(view2.getMeasuredHeight()));
                            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
                            if (view2.getMeasuredHeight() > view.getHeight()) {
                                layoutParams.height = view2.getMeasuredHeight();
                                view2.setLayoutParams(layoutParams);
                            } else if (view.getHeight() > 0) {
                                layoutParams.height = view.getHeight();
                                view2.setLayoutParams(layoutParams);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z zVar = c16759xaa786f9e.f234010h;
                            if (zVar != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q1) zVar).a();
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (O6().f234006d == 9) {
            O6().a();
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a1Var, gm0.j1.u().c())) {
            java.util.Objects.toString(obj);
            if (obj == com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEnableUIC", "update enableCodePage changed");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.e4(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEnableUIC", "onActivityResult: " + i17 + ", " + i18);
        if (i17 == 256 && i18 == -1) {
            wo3.l lVar = new wo3.l("" + ((int) (java.lang.System.currentTimeMillis() / 1000)), 0, 0);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) m158354x19263085).m83099x5406100e(lVar, false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        P6();
        Q6();
        gm0.j1.u().c().a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.u().c().e(this);
    }
}
