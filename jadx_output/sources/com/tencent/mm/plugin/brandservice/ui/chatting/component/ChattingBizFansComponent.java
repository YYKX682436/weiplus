package com.tencent.mm.plugin.brandservice.ui.chatting.component;

@yn.c(exportInterface = zq1.d0.class)
/* loaded from: classes11.dex */
public final class ChattingBizFansComponent extends yn.n implements zq1.d0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent$bizFansNeedCheckFansEvent$1 f94056e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent$bizFansNeedCheckFansEvent$1] */
    public ChattingBizFansComponent() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f94056e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizFansNeedCheckFansNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent$bizFansNeedCheckFansEvent$1
            {
                this.__eventId = -893235486;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BizFansNeedCheckFansNotifyEvent bizFansNeedCheckFansNotifyEvent) {
                com.tencent.mm.autogen.events.BizFansNeedCheckFansNotifyEvent event = bizFansNeedCheckFansNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.s0 s0Var = event.f54002g;
                com.tencent.mars.xlog.Log.i("ChattingBizFansComponent", "BizFansNeedCheckFansNotifyEvent talker %s", s0Var.f7856a);
                java.lang.String str = s0Var.f7856a;
                com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent chattingBizFansComponent = com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent.this;
                if (!kotlin.jvm.internal.o.b(str, chattingBizFansComponent.o0())) {
                    return false;
                }
                chattingBizFansComponent.m0();
                ((yb5.d) chattingBizFansComponent.f463595d).k();
                return false;
            }
        };
    }

    @Override // yn.n, yn.l
    public void E() {
        if (p0(o0())) {
            com.tencent.mm.storage.u2 u2Var = com.tencent.mm.storage.u2.f195353a;
            com.tencent.mm.sdk.platformtools.o4 a17 = u2Var.a();
            if (a17 != null && a17.i("biz_fans_privacy_guide_dialog_shown", false)) {
                com.tencent.mars.xlog.Log.i("ChattingBizFansComponent", "privacy guide dialog has been shown");
            } else {
                android.app.Activity g17 = ((yb5.d) this.f463595d).g();
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(g17, 0, 0, true);
                z2Var.i(com.tencent.mm.R.layout.dzj);
                android.view.View view = z2Var.f212058g;
                if (view == null) {
                    com.tencent.mars.xlog.Log.w("ChattingBizFansComponent", "showPrivacyDialogIfNeed: rootView is null, skip");
                } else {
                    ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c9z)).setOnClickListener(new qr1.c(z2Var));
                    if (n0() == 5) {
                        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc)).setText(com.tencent.mm.R.string.ngp);
                        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cgi)).setText(com.tencent.mm.R.string.ngw);
                    } else {
                        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc)).setText(com.tencent.mm.R.string.nfe);
                        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cgi)).setText(com.tencent.mm.R.string.nfl);
                    }
                    ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485149u00)).setOnClickListener(new qr1.d(this, g17));
                    z2Var.C();
                    com.tencent.mm.sdk.platformtools.o4 a18 = u2Var.a();
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
            jr1.i.f301360a.e(2, jr1.j.e(o0(), n0()), n0());
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
        if (((yb5.d) this.f463595d).k() != 1) {
            return;
        }
        if (n0() == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            a17 = jr1.j.c(((ox.r) d0Var).Bi(2).c());
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            a17 = jr1.j.a(((ox.r) d0Var2).Bi(1).c());
        }
        if (n0() == 5) {
            nr1.k Zi = yq1.u0.Zi();
            java.lang.String o07 = o0();
            Zi.getClass();
            B = Zi.f339154d.B("select rowid from BizPhotoFansSessionInfo  where talker = '" + o07 + "' limit 1", null);
            try {
                z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z17) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("ChattingBizFansComponent", "ensureSessionInfoIfInteractive: no sessionInfo for talker=" + o0() + ", creating...");
                hr1.m mVar = new hr1.m();
                mVar.field_sessionId = o0();
                mVar.field_talker = o0();
                mVar.field_senderUserName = a17;
                Zi.D0(mVar, 0, hr1.u.f283365d);
            } finally {
            }
        } else {
            hr1.o Ni = yq1.u0.Ni();
            java.lang.String o08 = o0();
            Ni.getClass();
            B = Ni.f283359d.B("select rowid from BizFansSessionInfo  where talker = '" + o08 + "' limit 1", null);
            try {
                z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z17) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("ChattingBizFansComponent", "ensureSessionInfoIfInteractive: no sessionInfo for talker=" + o0() + ", creating...");
                hr1.m mVar2 = new hr1.m();
                mVar2.field_sessionId = o0();
                mVar2.field_talker = o0();
                mVar2.field_senderUserName = a17;
                Ni.z0(mVar2, 0, hr1.u.f283365d);
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
            tk.s[] sVarArr = tk.s.f419870d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        s00Var.f385360d = c17;
        s00Var.f385361e = jr1.j.e(o0(), n0());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 25584;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mp/checkfansmsg";
        lVar.f70664a = s00Var;
        lVar.f70665b = new r45.t00();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        android.content.ComponentCallbacks2 g17 = ((yb5.d) this.f463595d).g();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).Ai(a17, new qr1.a(bVar), g17 instanceof im5.b ? (im5.b) g17 : null);
    }

    @Override // yn.n, yn.m
    public void n(yn.f context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.n(context);
        if (p0(o0())) {
            alive();
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
        return ((yb5.d) this.f463595d).x();
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
