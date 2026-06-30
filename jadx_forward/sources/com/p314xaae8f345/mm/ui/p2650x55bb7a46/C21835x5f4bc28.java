package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.ib$$a */
/* loaded from: classes9.dex */
public final /* synthetic */ class C21835x5f4bc28 implements vh0.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib f283380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r35.m3 f283381b;

    public /* synthetic */ C21835x5f4bc28(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib ibVar, r35.m3 m3Var) {
        this.f283380a = ibVar;
        this.f283381b = m3Var;
    }

    public final void a(android.net.Uri uri, final vh0.h1 h1Var) {
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib ibVar = this.f283380a;
        final r35.m3 m3Var = this.f283381b;
        ibVar.getClass();
        vh0.h1 h1Var2 = vh0.h1.UNKNOWN_URL;
        if (h1Var != h1Var2 && "/SetRedEnvelopeCover".equals(uri.getPath())) {
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib ibVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib.this;
                    ibVar2.getClass();
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    java.util.HashMap hashMap = new java.util.HashMap(16);
                    m3.d[] dVarArr = new m3.d[4];
                    yb5.d dVar = ibVar2.f283379a;
                    dVarArr[0] = new m3.d("chat_name", dVar.x());
                    dVarArr[1] = new m3.d("enter_sessionid", dVar.f542255q);
                    dVarArr[2] = new m3.d("enter_type", java.lang.Integer.valueOf(vh0.l2.a(dVar.k())));
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
                    dVarArr[3] = new m3.d("msgid", java.lang.Long.valueOf(f9Var != null ? f9Var.I0() : 0L));
                    ((cy1.a) rVar).Hj("yuanbao_text_link", "view_clk", bm5.i0.a(hashMap, dVarArr), 34004);
                }
            }, "yb_txt_link_clk_rpt");
        }
        if (h1Var != h1Var2 && "/SendYuanbaoRemindMsg".equals(uri.getPath())) {
            long F1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(uri.getQueryParameter("msgid"), 0L);
            java.lang.String x17 = ibVar.f283379a.x();
            java.lang.Long valueOf = java.lang.Long.valueOf(F1);
            final com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = valueOf.longValue() != 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2.class)).cj().o2(x17, valueOf.longValue()) : null;
            if (o27 != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_POSITION_REMIND_MSG_TIP_IN_BOOLEAN;
                if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            final com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib ibVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib.this;
                            yb5.d dVar = ibVar2.f283379a;
                            android.app.Activity g17 = dVar.g();
                            java.lang.String string = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy8);
                            java.lang.String string2 = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy9);
                            final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = o27;
                            db5.e1.t(g17, string, string2, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.chatting.ib$$f
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                                    final com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib ibVar3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib.this;
                                    final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
                                    ibVar3.getClass();
                                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$g
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            pj5.k.f436919a.d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib.this.f283379a.g(), f9Var2, 1);
                                        }
                                    });
                                }
                            });
                        }
                    });
                    c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
                } else {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$d
                        @Override // java.lang.Runnable
                        public final void run() {
                            pj5.k.f436919a.d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib.this.f283379a.g(), o27, 1);
                        }
                    });
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).D(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$e
            @Override // java.lang.Runnable
            public final void run() {
                vh0.h1 h1Var3 = vh0.h1.OK;
                vh0.h1 h1Var4 = h1Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib ibVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib.this;
                if (h1Var4 != h1Var3) {
                    ibVar2.getClass();
                    return;
                }
                yb5.d dVar = ibVar2.f283379a;
                if (dVar.l() != null) {
                    dVar.n().putExtra("deeplink_handled", true);
                    dVar.d();
                }
            }
        });
    }
}
