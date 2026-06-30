package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI */
/* loaded from: classes9.dex */
public class ActivityC16959x6229db69 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, ws3.u {
    public static final /* synthetic */ int Q = 0;
    public java.util.List M;
    public boolean N;

    /* renamed from: z, reason: collision with root package name */
    public int f236653z;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f236634d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f236635e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f236636f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd f236637g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f236638h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f236639i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.GridView f236640m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.GridView f236641n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f236642o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f236643p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f236644q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f236645r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f236646s = null;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f236647t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r f236648u = null;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r f236649v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.app.Dialog f236650w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c f236651x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f236652y = "";
    public java.util.ArrayList A = null;
    public java.util.ArrayList B = null;
    public vr4.e C = null;
    public vr4.e D = null;
    public vr4.e E = null;
    public vr4.e F = null;
    public vr4.e G = null;
    public java.lang.String H = "";
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public ws3.j f236633J = null;
    public vr4.a1 K = null;
    public boolean L = false;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d P = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.22
        {
            this.f39173x3fe91575 = 520089918;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            if (r4 == null) goto L15;
         */
        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e r7) {
            /*
                r6 = this;
                com.tencent.mm.autogen.events.WalletPayResultEvent r7 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e) r7
                boolean r0 = r7 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e
                r1 = 0
                java.lang.String r2 = "MicroMsg.PhoneRechargeUI"
                if (r0 == 0) goto L53
                am.s10 r7 = r7.f136498g
                boolean r0 = r7.f89398e
                if (r0 == 0) goto L15
                java.lang.String r7 = "WalletPayResultEvent is from kinda, ScanQRCodePay"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f(r2, r7)
                goto L58
            L15:
                int r7 = r7.f89396c
                r0 = -1
                r3 = 1
                if (r7 != r0) goto L4c
                com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.this
                boolean r0 = r7.I
                if (r0 != 0) goto L51
                java.lang.String r0 = "hy: MallRecharge pay result : ok"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
                vs3.a r0 = new vs3.a
                com.tencent.mm.plugin.recharge.ui.form.MallFormView r2 = r7.f236637g
                java.lang.String r2 = r2.m67852xfb85ada3()
                ws3.j r4 = r7.f236633J
                vs3.a r4 = r4.f530715b
                if (r4 == 0) goto L3a
                java.lang.String r4 = r4.f521409b
                boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
                if (r4 != 0) goto L3c
            L3a:
                java.lang.String r4 = ""
            L3c:
                r0.<init>(r2, r4, r1)
                us3.e r1 = us3.e.Ai()
                r1.wi(r0)
                r7.finish()
                r7.I = r3
                goto L51
            L4c:
                java.lang.String r7 = "hy: MallRecharge pay result : cancel"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7)
            L51:
                r1 = r3
                goto L58
            L53:
                java.lang.String r7 = "hy: mismatched event"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f(r2, r7)
            L58:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.AnonymousClass22.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean T6(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 r13, vr4.b1 r14) {
        /*
            ws3.j r0 = r13.f236633J
            vs3.a r0 = r0.f530715b
            r1 = 1
            if (r0 == 0) goto Le5
            com.tencent.mm.plugin.recharge.ui.form.MallFormView r2 = r13.f236637g
            java.lang.String r2 = r2.m67852xfb85ada3()
            int r3 = r13.f236653z
            r4 = 3
            r5 = 0
            if (r3 != r1) goto L1b
            r0 = 2131779963(0x7f10617b, float:1.9191498E38)
            java.lang.String r0 = r13.getString(r0)
            goto L80
        L1b:
            int r6 = r0.f521411d
            r7 = 2131779973(0x7f106185, float:1.9191518E38)
            r8 = 2131771201(0x7f103f41, float:1.9173726E38)
            r9 = 2
            if (r3 != r9) goto L39
            if (r6 == r4) goto L39
            java.lang.String r0 = r13.getString(r7)
            java.lang.String r3 = r14.f521224e
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r3}
            java.lang.String r0 = r13.getString(r8, r0)
            r7 = r0
            goto Lb9
        L39:
            r3 = 2131771200(0x7f103f40, float:1.9173724E38)
            if (r6 != r1) goto L5a
            java.lang.String r9 = r0.f521409b
            boolean r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            if (r9 == 0) goto L5a
            com.tencent.mm.plugin.recharge.ui.form.MallFormView r0 = r13.f236637g
            java.lang.String r0 = r0.m67852xfb85ada3()
            java.lang.String r2 = r13.getString(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r0 = r13.getString(r3, r0)
            r4 = 4
            goto L80
        L5a:
            if (r6 != 0) goto L83
            java.lang.String r0 = r0.f521410c
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L70
            r0 = 2131771202(0x7f103f42, float:1.9173728E38)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = r13.getString(r0, r2)
            goto L7f
        L70:
            r0 = 2131779970(0x7f106182, float:1.9191512E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = r13.getString(r3, r0)
        L7f:
            r4 = 5
        L80:
            r7 = r0
            r9 = r4
            goto Lb9
        L83:
            r3 = 0
            if (r6 == r4) goto Lb7
            int r4 = r14.f521233q
            if (r4 != r1) goto Lb7
            java.lang.String r4 = r0.f521409b
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 != 0) goto L95
            java.lang.String r0 = r0.f521409b
            goto La2
        L95:
            java.lang.String r4 = r0.f521410c
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 != 0) goto La0
            java.lang.String r0 = r0.f521410c
            goto La2
        La0:
            java.lang.String r0 = ""
        La2:
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r4 != 0) goto Lb3
            java.lang.String r3 = r14.f521224e
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r3}
            java.lang.String r0 = r13.getString(r8, r0)
            goto Lb4
        Lb3:
            r0 = r3
        Lb4:
            r7 = r0
            r9 = r1
            goto Lb9
        Lb7:
            r7 = r3
            r9 = r5
        Lb9:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r0 != 0) goto Le5
            java.lang.String r8 = ""
            r0 = 2131771203(0x7f103f43, float:1.917373E38)
            java.lang.String r0 = r13.getString(r0)
            r1 = 2131759091(0x7f100ff3, float:1.9149164E38)
            java.lang.String r10 = r13.getString(r1)
            com.tencent.mm.plugin.recharge.ui.n0 r11 = new com.tencent.mm.plugin.recharge.ui.n0
            r11.<init>(r13, r14, r9)
            com.tencent.mm.plugin.recharge.ui.o0 r12 = new com.tencent.mm.plugin.recharge.ui.o0
            r12.<init>(r13, r9)
            r6 = r13
            r9 = r0
            com.tencent.mm.ui.widget.dialog.j0 r13 = db5.e1.A(r6, r7, r8, r9, r10, r11, r12)
            if (r13 == 0) goto Le4
            r13.setCanceledOnTouchOutside(r5)
        Le4:
            r1 = r5
        Le5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.T6(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI, vr4.b1):boolean");
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69, vr4.b1 b1Var) {
        java.lang.String str = activityC16959x6229db69.f236652y;
        java.lang.String str2 = activityC16959x6229db69.f236651x.f261352d;
        java.lang.String str3 = b1Var.f521223d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mobile=");
        sb6.append(vs3.b.a(activityC16959x6229db69.f236637g.m67852xfb85ada3()));
        sb6.append("&markup=");
        vs3.a aVar = activityC16959x6229db69.f236633J.f530715b;
        sb6.append(aVar != null ? aVar.f521409b : "");
        activityC16959x6229db69.Y6(new vs3.h(str, str2, str3, sb6.toString()), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17620, b1Var.f521224e, b1Var.f521225f, 3);
    }

    public static boolean V6(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        vs3.a aVar;
        activityC16959x6229db69.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        ws3.j jVar = activityC16959x6229db69.f236633J;
        if (jVar == null || (aVar = jVar.f530715b) == null) {
            str5 = "";
            str6 = str5;
            str7 = str6;
        } else {
            str6 = aVar.f521409b;
            int i17 = aVar.f521411d;
            str5 = aVar.f521408a;
            str7 = i17 == 3 ? "1" : "0";
        }
        java.lang.String replace = str2.replace("{phone}", str5).replace("{remark}", str6).replace("{isbind}", str7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "weappID: %s, weappPath: %s", str, replace);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        nxVar.f89000b = replace != null ? replace : "";
        nxVar.f89002d = 1098;
        nxVar.f89001c = 0;
        c6113xa3727625.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17620, str3, str4, 2, str);
        return true;
    }

    public static java.lang.String W6(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69, java.lang.String str) {
        vs3.a aVar;
        activityC16959x6229db69.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            ws3.j jVar = activityC16959x6229db69.f236633J;
            java.lang.String str2 = (jVar == null || (aVar = jVar.f530715b) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b)) ? "" : activityC16959x6229db69.f236633J.f530715b.f521409b;
            if (str2.equals(activityC16959x6229db69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxw))) {
                str2 = "WeChatAccountBindNumber";
            }
            java.lang.String m67852xfb85ada3 = activityC16959x6229db69.f236637g.m67852xfb85ada3();
            java.lang.String encode = java.net.URLEncoder.encode(java.net.URLEncoder.encode(str2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "old url");
                return java.net.URLDecoder.decode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + java.lang.String.format("?phone=%s&remark=%s", m67852xfb85ada3, encode);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "new url");
            java.lang.String replace = str.indexOf("%7Bphone%7D") > 0 ? str.replace("%7Bphone%7D", m67852xfb85ada3) : str.replace("{phone}", m67852xfb85ada3);
            return replace.indexOf("%7Bremark%7D") > 0 ? replace.replace("%7Bremark%7D", encode) : replace.replace("{remark}", encode);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PhoneRechargeUI", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        activityC16959x6229db69.getClass();
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC16959x6229db69.mo55332x76847179(), intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17620, str2, str3, 1, str);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneRechargeUI", "hy: url decode failed: raw url: %s", str);
        }
    }

    public final void Y6(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        android.app.Dialog dialog = this.f236650w;
        if (dialog == null || (dialog != null && !dialog.isShowing())) {
            if (z17) {
                this.f236650w = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(mo55332x76847179(), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.s(this, m1Var));
            } else {
                this.f236650w = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(mo55332x76847179(), true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.t(this, m1Var));
            }
        }
        gm0.j1.d().g(m1Var);
    }

    public final void Z6() {
        this.A = new java.util.ArrayList();
        vr4.b1 b1Var = new vr4.b1();
        b1Var.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxf);
        b1Var.f521226g = 0;
        vr4.b1 b1Var2 = new vr4.b1();
        b1Var2.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxg);
        b1Var2.f521226g = 0;
        vr4.b1 b1Var3 = new vr4.b1();
        b1Var3.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxh);
        b1Var3.f521226g = 0;
        vr4.b1 b1Var4 = new vr4.b1();
        b1Var4.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxi);
        b1Var4.f521226g = 0;
        vr4.b1 b1Var5 = new vr4.b1();
        b1Var5.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxj);
        b1Var5.f521226g = 0;
        vr4.b1 b1Var6 = new vr4.b1();
        b1Var6.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxk);
        b1Var6.f521226g = 0;
        this.A.add(b1Var);
        this.A.add(b1Var2);
        this.A.add(b1Var3);
        this.A.add(b1Var4);
        this.A.add(b1Var5);
        this.A.add(b1Var6);
        this.B = new java.util.ArrayList();
        vr4.b1 b1Var7 = new vr4.b1();
        b1Var7.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxl);
        b1Var7.f521226g = 0;
        vr4.b1 b1Var8 = new vr4.b1();
        b1Var8.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxm);
        b1Var8.f521226g = 0;
        vr4.b1 b1Var9 = new vr4.b1();
        b1Var9.f521224e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxn);
        b1Var9.f521226g = 0;
        this.B.add(b1Var7);
        this.B.add(b1Var8);
        this.B.add(b1Var9);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.a7(boolean, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c9j;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2) {
                if (i18 != -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : cancel");
                } else if (!this.I) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : ok");
                    us3.e.Ai().wi(new vs3.a(this.f236637g.m67852xfb85ada3(), this.f236637g.m67853x310592d0().getText().toString(), 0));
                    finish();
                    this.I = true;
                }
            }
        } else if (i18 == -1) {
            this.L = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.net.Uri data = intent.getData();
            if (data == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneRechargeUI", "hy: uri == null");
                return;
            }
            try {
                android.database.Cursor query = getContentResolver().query(data, null, null, null, null);
                java.lang.String str = null;
                if (query != null && query.getCount() > 0) {
                    query.moveToFirst();
                    int columnIndex = query.getColumnIndex("has_phone_number");
                    if (columnIndex <= 0 || query.getInt(columnIndex) > 0) {
                        java.lang.String string = query.getString(query.getColumnIndex("_id"));
                        android.database.Cursor query2 = getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + string, null, null);
                        if (query2 != null && query2.moveToFirst()) {
                            while (!query2.isAfterLast()) {
                                int columnIndex2 = query2.getColumnIndex("data1");
                                int columnIndex3 = query2.getColumnIndex("display_name");
                                java.lang.String string2 = query2.getString(columnIndex2);
                                java.lang.String string3 = query2.getString(columnIndex3);
                                if (string2 != null) {
                                    java.lang.String a17 = vs3.b.a(string2);
                                    if (android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(a17) && a17.length() == 11) {
                                        arrayList.add(a17);
                                    }
                                }
                                query2.moveToNext();
                                str = string3;
                            }
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                    }
                }
                if (query != null && !query.isClosed()) {
                    query.close();
                }
                if (arrayList.size() > 1) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 S = db5.e1.S(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxy), arrayList, -1, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.g0(this, arrayList, str));
                    if (S != null) {
                        S.setCanceledOnTouchOutside(true);
                    }
                } else if (arrayList.size() == 1) {
                    this.f236633J.b(new vs3.a((java.lang.String) arrayList.get(0), str, 1));
                    gm0.j1.d().g(new vs3.g(this.f236637g.m67852xfb85ada3(), 0));
                } else {
                    db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsu), "");
                }
            } catch (java.lang.SecurityException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneRechargeUI", "hy: permission denied: %s", e17.toString());
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsw), "");
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo64405x4dab7448(mo78508x85b50c3c());
        gm0.j1.d().a(1571, this);
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de, this);
        this.f236651x = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c) getIntent().getParcelableExtra("key_func_info");
        this.N = getIntent().getBooleanExtra("key_need_show_remind_dialog", true);
        Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = this.f236651x;
        if (c19100xad1ade2c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneRechargeUI", "hy: function info is null");
            db5.t7.m123883x26a183b(this, "function info is null", 1).show();
            finish();
            return;
        }
        mo54450xbf7c1df6(c19100xad1ade2c.f261353e);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.c0(this));
        vr4.e eVar = new vr4.e();
        this.G = eVar;
        eVar.f521246e = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxt);
        this.G.f521245d = "http%3A%2F%2Fkf.qq.com%2Ftouch%2Fproduct%2Fwechatrecharge_app.html";
        this.f236634d = findViewById(com.p314xaae8f345.mm.R.id.kuv);
        this.f236635e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kaj);
        this.f236636f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kal);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd) findViewById(com.p314xaae8f345.mm.R.id.lmg);
        this.f236637g = viewOnFocusChangeListenerC16962x770823dd;
        if (viewOnFocusChangeListenerC16962x770823dd == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            viewOnFocusChangeListenerC16962x770823dd.m67861xeace15c1(new ws3.c());
        }
        ws3.j jVar = new ws3.j(this.f236637g);
        this.f236633J = jVar;
        ws3.e eVar2 = new ws3.e(jVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd2 = jVar.f530716c;
        android.widget.EditText editText = viewOnFocusChangeListenerC16962x770823dd2.f236697f;
        if (editText != null) {
            editText.addTextChangedListener(eVar2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.C16961xa9bd4cfb c16961xa9bd4cfb = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.C16961xa9bd4cfb) viewOnFocusChangeListenerC16962x770823dd2.m67842xd454f3ba();
        s75.d.b(new ws3.f(jVar), "fetch_phone_book");
        ws3.y yVar = new ws3.y(viewOnFocusChangeListenerC16962x770823dd2, jVar.f530714a);
        jVar.f530717d = yVar;
        yVar.f530739p = this;
        c16961xa9bd4cfb.m67841x2bec6d6e(true);
        c16961xa9bd4cfb.setAdapter(jVar.f530717d);
        c16961xa9bd4cfb.setOnItemClickListener(new ws3.g(jVar, c16961xa9bd4cfb));
        viewOnFocusChangeListenerC16962x770823dd2.setOnFocusChangeListener(new ws3.h(jVar, c16961xa9bd4cfb));
        c16961xa9bd4cfb.setOnClickListener(new ws3.i(jVar, c16961xa9bd4cfb));
        this.f236640m = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.lmy);
        this.f236642o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ln6);
        this.f236643p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ln7);
        this.f236644q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lme);
        this.f236645r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lmu);
        this.f236638h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568080ln0);
        this.f236639i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568082ln2);
        this.f236641n = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.lmh);
        this.f236646s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lmz);
        this.f236647t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568081ln1);
        this.f236637g.m67866x749e7e77(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.h0(this));
        this.f236637g.m67844x1e821d71().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.i0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r();
        this.f236648u = rVar;
        rVar.f236753e = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.j0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r rVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r();
        this.f236649v = rVar2;
        rVar2.f236753e = new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.k0(this);
        this.f236640m.setAdapter((android.widget.ListAdapter) this.f236648u);
        this.f236641n.setAdapter((android.widget.ListAdapter) this.f236649v);
        this.f236635e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.l0(this));
        this.f236636f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.m0(this));
        this.f236637g.c();
        int B = (i65.a.B(this) / 4) - 20;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "max width: %s", java.lang.Integer.valueOf(B));
        this.f236642o.setMaxWidth(B);
        this.f236643p.setMaxWidth(B);
        this.f236644q.setMaxWidth(B);
        this.f236645r.setMaxWidth(B);
        getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        vs3.a aVar = this.f236633J.f530715b;
        if (aVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b)) {
            java.lang.String str = this.f236633J.f530715b.f521409b;
        }
        this.f236637g.m67842xd454f3ba().setHintTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2c));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236637g.m67852xfb85ada3())) {
            Y6(new vs3.g("", 0), false);
        } else {
            Y6(new vs3.g(this.f236637g.m67852xfb85ada3(), 0), false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(1571, this);
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de, this);
        this.P.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        a7(false, true);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        if (!(m1Var instanceof vs3.g)) {
            if (m1Var instanceof vs3.h) {
                android.app.Dialog dialog = this.f236650w;
                if (dialog != null && dialog.isShowing() && m1Var.mo808xfb85f7b0() != 497) {
                    this.f236650w.dismiss();
                    this.f236650w = null;
                }
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
                    ((h45.q) i95.n0.c(h45.q.class)).mo24849x2784dc28(((vs3.h) m1Var).f521455f.f273647m, 6, 0);
                    this.P.mo48813x58998cd();
                    return;
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
                    }
                    db5.e1.G(this, str, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.b0(this));
                    return;
                }
            }
            return;
        }
        vs3.g gVar = (vs3.g) m1Var;
        android.app.Dialog dialog2 = this.f236650w;
        if (dialog2 != null && dialog2.isShowing() && m1Var.mo808xfb85f7b0() != 497) {
            this.f236650w.dismiss();
            this.f236650w = null;
        }
        if (gVar.f521452y != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "do delete phone number");
            return;
        }
        java.lang.String str2 = gVar.f521436f;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !str2.equals(this.f236637g.m67852xfb85ada3())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "hy: mobiel num not match.abourt, %s, %s", str2, this.f236637g.m67852xfb85ada3());
            return;
        }
        if (gVar.f521438h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneRechargeUI", "hy: cgi failed.");
            db5.e1.G(this, gVar.f521450w, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.b0(this));
            this.f236652y = "";
            Z6();
            return;
        }
        this.f236652y = gVar.f521437g;
        this.f236653z = gVar.f521440m;
        this.A = gVar.f521441n;
        this.C = gVar.f521443p;
        this.D = gVar.f521444q;
        this.E = gVar.f521445r;
        this.F = gVar.f521446s;
        java.lang.String str3 = gVar.f521439i;
        this.H = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "desc: %s, mobile: %s", str3, this.f236637g.m67852xfb85ada3());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H)) {
            getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        } else {
            vs3.a aVar = this.f236633J.f530715b;
            if (aVar != null && aVar.f521408a.trim().equals(this.f236637g.m67852xfb85ada3())) {
                ws3.j jVar = this.f236633J;
                vs3.a aVar2 = jVar.f530715b;
                aVar2.f521410c = this.H;
                jVar.b(aVar2);
            }
        }
        this.K = gVar.f521448u;
        java.util.ArrayList arrayList = gVar.f521442o;
        this.B = arrayList;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vr4.b1 b1Var = (vr4.b1) this.B.get(size);
                if (b1Var.f521224e.isEmpty()) {
                    this.B.remove(b1Var);
                }
            }
        }
        vr4.e eVar = gVar.f521447t;
        if (eVar == null || (eVar.f521246e.equals(this.G.f521246e) && gVar.f521447t.f521245d.equals(this.G.f521245d) && gVar.f521447t.f521247f.equals(this.G.f521247f) && gVar.f521447t.f521248g.equals(this.G.f521248g))) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "need to update head");
            this.G = gVar.f521447t;
            z17 = true;
        }
        a7(!this.H.equals(""), z17);
        us3.e.Ai().Ni(gVar.f521451x);
        if (this.f236633J != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236637g.m67852xfb85ada3())) {
                this.f236633J.a(true);
            } else {
                this.f236633J.a(false);
            }
        }
        this.f236637g.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.f0(this), 300L);
    }
}
