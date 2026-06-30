package com.p314xaae8f345.mm.ui.p2741x4c58d2b0;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.transmit.SendAppMessageWrapperUI */
/* loaded from: classes9.dex */
public class ActivityC22573x19a79d99 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int B = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f292556i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f292557m;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f292561q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292551d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f292552e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f292553f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f292554g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f292555h = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f292558n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f292559o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f292560p = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f292562r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f292563s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f292564t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f292565u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f292566v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f292567w = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f292568x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f292569y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f292570z = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new dk5.a5(this), true);

    static {
        org.apache.commons.logging.LogFactory.getLog(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x04aa, code lost:
    
        if (r35.j1.l(r26.f39322x2305be9, r7.toString(), r26.f292552e.f67370x28d45f97.equals("wx4310bbd51be7d979") ? "" : r26.f292551d, true, "", new dk5.t4(r26, r0)) != null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T6(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 r26) {
        /*
            Method dump skipped, instructions count: 2100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.T6(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI):void");
    }

    public static void U6(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99) {
        int i17 = activityC22573x19a79d99.f292555h;
        if (i17 == 0 || i17 == 3) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Report_Args", com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC22573x19a79d99.getIntent().getExtras(), -2));
            activityC22573x19a79d99.setResult(0, intent);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC22573x19a79d99, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC22573x19a79d99.getIntent().getExtras(), -2), true, false);
        }
        activityC22573x19a79d99.finish();
    }

    public static void V6(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99) {
        activityC22573x19a79d99.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "finishOKWhenCancel");
        activityC22573x19a79d99.f292568x = true;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC22573x19a79d99, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC22573x19a79d99.getIntent().getExtras(), 0), true, true);
        activityC22573x19a79d99.finish();
    }

    public final boolean W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "blockInvalidToken block %b", java.lang.Boolean.valueOf(this.f292563s));
        return this.f292563s;
    }

    public final boolean X6(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504) {
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) c11286x34a5504.f33122xe4128443;
        java.lang.String str = c11289x4ff06936.f33195x4b66fa4;
        java.lang.String g76 = g7(c11286x34a5504.f33128x4f3b3aa0);
        if (!g76.isEmpty()) {
            str = g76;
        }
        e15.b bVar = new e15.b();
        bVar.C(c01.od.c(c11289x4ff06936.f33203x2b375427, ""));
        bVar.z(c01.od.c(c11289x4ff06936.f33192xedb9d9a, ""));
        bVar.B(c01.od.c(c11289x4ff06936.f33199xd0293a5e, ""));
        bVar.A(c01.od.c(java.lang.Long.valueOf(c11289x4ff06936.f33197xafbf827), ""));
        bVar.y(c01.od.b(java.lang.Integer.valueOf(c11289x4ff06936.f33193x89444d94), 0));
        v05.b bVar2 = new v05.b();
        java.lang.String c17 = c01.od.c(c11286x34a5504.f33130x6942258, "");
        int i17 = bVar2.f449898d;
        bVar2.set(i17 + 2, c17);
        bVar2.set(i17 + 3, c01.od.c(c11286x34a5504.f33121x993583fc, ""));
        bVar2.set(i17 + 9, c01.od.c(c11289x4ff06936.f33201x324c710a, ""));
        java.lang.String c18 = c01.od.c(c11289x4ff06936.f33198xc58aab80, "");
        int i18 = bVar2.f513848e;
        bVar2.set(i18 + 2, c18);
        bVar2.set(i18 + 47, c01.od.c(c11289x4ff06936.f33204x1478a44a, ""));
        bVar2.set(i18 + 46, str);
        bVar2.set(i18 + 49, bVar);
        l15.c cVar = new l15.c();
        cVar.q(bVar2);
        oe5.c cVar2 = new oe5.c();
        cVar2.k(str);
        cVar2.l(cVar);
        n13.t tVar = new n13.t();
        tVar.f415666a = new dk5.t4(this, c11286x34a5504);
        tVar.f415669d = new dk5.s4(this, g76);
        n13.a0.td();
        tVar.f415668c = n13.y.f415674a;
        tVar.f415671f.f415672a = 4;
        return ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(this, cVar2, this.f292553f, tVar);
    }

    public final void Y6(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, int i17) {
        int i18 = this.f292555h;
        if (i18 == 0 || i18 == 3) {
            c01.sc.d().a(38, 1);
            java.util.LinkedList linkedList = new java.util.LinkedList(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f292553f.split(",")));
            int i19 = this.f292555h == 3 ? 1 : 0;
            dk5.f6 f6Var = new dk5.f6();
            f6Var.f316157a = this.f292569y;
            f6Var.f316158b = this.f292561q;
            f6Var.f316161e = this.f292570z;
            dk5.y6.l(this, getIntent(), this.f292552e, c11286x34a5504, linkedList, i19, this.f292559o, W6(), this.f292560p, this.f292566v, this.f292567w, 1, new dk5.z4(this, c11286x34a5504, str, i17, linkedList), f6Var);
            return;
        }
        if (p94.w0.g() != null) {
            p94.r0 g17 = p94.w0.g();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f292552e;
            java.lang.String str2 = mVar.f67370x28d45f97;
            java.lang.String str3 = mVar.f67372x453d1e07;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 o7Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7) g17;
            o7Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 s17 = o7Var.s(c11286x34a5504, str, str2, str3);
            if (s17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            } else {
                s17.R(c11286x34a5504.f33123xa4d390c1);
                s17.T(str2, c11286x34a5504.f33125x9b39409a, c11286x34a5504.f33124x838b091d);
                if (i17 > q94.a.f442461a) {
                    s17.u(1, 1);
                }
                s17.i();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareAppMsg", "com.tencent.mm.plugin.sns.model.UploadManager");
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7) p94.w0.g()).d();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(this, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(getIntent().getExtras(), 0), true, false);
        finish();
    }

    public final void Z6(int i17, java.lang.Object obj, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, int i18, java.util.LinkedList linkedList) {
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h7.c(this.f292564t, this.f292552e, c11286x34a5504, linkedList);
        } else if (i17 == 2 || i17 == 3) {
            b7(str, linkedList, i18);
        }
    }

    public final void a7() {
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f292557m;
            if (u3Var == null || !u3Var.isShowing()) {
                return;
            }
            this.f292557m.dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    public final void b7(java.lang.String str, java.util.LinkedList linkedList, int i17) {
        java.lang.String string;
        boolean z17;
        if (this.f292552e.f67370x28d45f97.equals("wx4310bbd51be7d979")) {
            string = null;
        } else {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f292552e;
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bay, ((kt.c) i0Var).Vi(this, mVar, mVar.f67372x453d1e07));
        }
        if (!this.f292559o && W6()) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bax);
        } else if (string == null) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bax);
        }
        java.lang.String str2 = string;
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572476bb5);
        dk5.b5 b5Var = new dk5.b5(this);
        dk5.c5 c5Var = new dk5.c5(this);
        ik5.a aVar = ik5.b.f373505a;
        if (ik5.b.f373505a == ik5.a.f373502e) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ik5.b.f373507c;
            atomicInteger.incrementAndGet();
            z17 = atomicInteger.get() == ik5.b.f373506b;
            if (z17) {
                ik5.b.f373505a = ik5.a.f373503f;
                atomicInteger.set(0);
            }
        } else {
            z17 = true;
        }
        if (z17) {
            if (this.f292562r) {
                c5Var.a(true, str, i17);
            } else {
                fq1.h.a(this.f39322x2305be9, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572473bb2), str2, string2, c5Var, b5Var);
            }
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "summerbig dealSucc, text is empty");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            f7((java.lang.String) it.next(), str);
        }
    }

    public final void c7(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        int i17;
        int i18;
        java.lang.String str4;
        int i19;
        int i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus mediaPath: %s, filterJumpInfo: %s", str, java.lang.Boolean.valueOf(z17));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str5 = c11295xb9c370e5.f33222xf1cfa047;
        java.lang.String str6 = this.f292556i;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.String concat = str6.concat("@opensdk");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus() called with: sceneDataObject = [" + c11295xb9c370e5 + "], mediaPath = [" + str + "], jumpInfoThumb = [" + str2 + "], filterJumpInfo = [" + z17 + "], displayName = [" + str3 + "]");
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(this, this.f292556i);
        if (Zi == null) {
            Zi = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            Zi = str3;
        }
        java.lang.String str7 = this.f292552e.f67369x5e556d3a;
        if (str7 == null) {
            str7 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str7 = str2;
        }
        if (this.f292554g.m48467xfb85f7b0() == 1 || this.f292554g.m48467xfb85f7b0() == 2 || this.f292554g.m48467xfb85f7b0() == 38) {
            pj4.j0 j0Var = new pj4.j0();
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo iWXStateJumpInfo = c11295xb9c370e5.f33221x30e70dad;
            if (iWXStateJumpInfo instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11294xaf8ffe5f) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11294xaf8ffe5f c11294xaf8ffe5f = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11294xaf8ffe5f) iWXStateJumpInfo;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11294xaf8ffe5f.f33217xb52fc261)) {
                    j0Var.f436672d = "3";
                    j0Var.f436674f = c11294xaf8ffe5f.f33217xb52fc261;
                    arrayList.add(j0Var);
                }
                i17 = 0;
            } else {
                if (z17 || !(iWXStateJumpInfo instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11293xb6173a1d)) {
                    if (!z17 && (iWXStateJumpInfo instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11292x2902f812)) {
                        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11292x2902f812 c11292x2902f812 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11292x2902f812) iWXStateJumpInfo;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11292x2902f812.f33212xf02988d6)) {
                            try {
                                j0Var.f436672d = "8";
                                pj4.t1 t1Var = new pj4.t1();
                                t1Var.f436831d = c11292x2902f812.f33212xf02988d6;
                                t1Var.f436832e = str2;
                                j0Var.f436675g = android.util.Base64.encodeToString(t1Var.mo14344x5f01b1f6(), 0);
                                arrayList.add(j0Var);
                                i17 = 0;
                                i18 = 1;
                            } catch (java.lang.Exception e17) {
                                i17 = 0;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SendAppMessageWrapperUI", e17, "handleSendStatus set finder profile jump info exception", new java.lang.Object[0]);
                            }
                        }
                    }
                    i17 = 0;
                    i18 = i17;
                } else {
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11293xb6173a1d c11293xb6173a1d = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11293xb6173a1d) iWXStateJumpInfo;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11293xb6173a1d.f33215xf02988d6)) {
                        try {
                            j0Var.f436672d = "7";
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put(dm.i4.f66875xa013b0d5, c11293xb6173a1d.f33215xf02988d6 + "@app");
                            jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, c11293xb6173a1d.f33214x346425);
                            jSONObject.put("versionType", c11293xb6173a1d.f33213x2a337707);
                            jSONObject.put("headImageURL", str2);
                            j0Var.f436674f = jSONObject.toString();
                            arrayList.add(j0Var);
                            i18 = 1;
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SendAppMessageWrapperUI", e18, "handleSendStatus set miniProgram jump info exception", new java.lang.Object[0]);
                        }
                        i17 = 0;
                    }
                    i18 = 0;
                    i17 = 0;
                }
                if (i18 != 0) {
                    pj4.j0 j0Var2 = new pj4.j0();
                    j0Var2.f436672d = "3";
                    j0Var2.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
                    arrayList.add(j0Var2);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus jumpInfoList size: %s", java.lang.Integer.valueOf(arrayList.size()));
            if (this.f292554g.m48467xfb85f7b0() != 1) {
                if (this.f292554g.m48467xfb85f7b0() == 2) {
                    str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) this.f292554g.f33122xe4128443).f33105xcba65c20 : str;
                    i19 = 1;
                } else if (this.f292554g.m48467xfb85f7b0() == 38) {
                    str4 = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995) this.f292554g.f33122xe4128443).f33233xd426afc1;
                    i19 = 2;
                }
                i27 = i19;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d c11296xa95b008d = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) this.f292554g.f33122xe4128443;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11296xa95b008d.f33229x36452d)) {
                    str5 = c11296xa95b008d.f33229x36452d;
                }
            }
            str4 = str;
            i19 = i17;
            i27 = i19;
        } else {
            if (this.f292554g.m48467xfb85f7b0() != 76) {
                return;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f292554g;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) c11286x34a5504.f33122xe4128443;
            str5 = c11295xb9c370e5.f33222xf1cfa047;
            Zi = c11286x34a5504.f33130x6942258;
            pj4.j0 j0Var3 = new pj4.j0();
            j0Var3.f436672d = "1";
            r45.hf2 hf2Var = new r45.hf2();
            hf2Var.set(0, this.f292554g.f33130x6942258);
            hf2Var.set(2, c11289x4ff06936.f33198xc58aab80);
            hf2Var.set(4, c11289x4ff06936.f33201x324c710a);
            hf2Var.set(9, c11289x4ff06936.f33199xd0293a5e);
            hf2Var.set(3, this.f292556i);
            hf2Var.set(6, c11289x4ff06936.f33204x1478a44a);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 c11290x5453c607 = c11289x4ff06936.f33202x8b1eb086;
            hf2Var.set(18, c11290x5453c607 != null ? b21.m.e(c11290x5453c607.f33206x54340220) : "");
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = c11289x4ff06936.f33203x2b375427;
            objArr[1] = java.lang.Boolean.valueOf(c11289x4ff06936.f33202x8b1eb086 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "share music mv to status, singerName:%s, musicVipInfo is valid:%b", objArr);
            hf2Var.set(1, c11289x4ff06936.f33203x2b375427);
            hf2Var.set(7, c11289x4ff06936.f33192xedb9d9a);
            hf2Var.set(8, str);
            hf2Var.set(11, java.lang.Long.valueOf(c11289x4ff06936.f33197xafbf827));
            hf2Var.set(13, c11289x4ff06936.f33196x187d426e);
            hf2Var.set(12, this.f292554g.f33125x9b39409a);
            hf2Var.set(14, java.lang.Integer.valueOf(c11289x4ff06936.f33193x89444d94));
            hf2Var.set(17, new r45.if2());
            ((r45.if2) hf2Var.m75936x14adae67(17)).set(0, c11289x4ff06936.f33200xa7a65d4d);
            r45.xs4 xs4Var = new r45.xs4();
            xs4Var.set(14, this.f292554g.f33130x6942258);
            xs4Var.set(15, c11289x4ff06936.f33204x1478a44a);
            xs4Var.set(4, c11289x4ff06936.f33203x2b375427);
            xs4Var.set(5, c11289x4ff06936.f33192xedb9d9a);
            xs4Var.set(16, str);
            xs4Var.set(7, c11289x4ff06936.f33199xd0293a5e);
            xs4Var.set(8, java.lang.Long.valueOf(c11289x4ff06936.f33197xafbf827));
            xs4Var.set(9, c11289x4ff06936.f33196x187d426e);
            xs4Var.set(10, java.lang.Integer.valueOf(c11289x4ff06936.f33193x89444d94));
            xs4Var.set(12, c11289x4ff06936.f33200xa7a65d4d);
            xs4Var.set(11, hf2Var.m75945x2fec8307(18));
            xs4Var.set(6, this.f292554g.f33125x9b39409a);
            ((na0.k) ((oa0.j) i95.n0.c(oa0.j.class))).getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n<MusicVideoStatusOpenParams>\n");
            sb6.append(lm3.c0.c(hf2Var));
            sb6.append('\n');
            java.lang.String a17 = zy2.pc.a(xs4Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "makeContent(...)");
            sb6.append(a17);
            sb6.append("\n</MusicVideoStatusOpenParams>");
            j0Var3.f436674f = r26.b0.b(sb6.toString());
            arrayList.add(j0Var3);
            str7 = "http://wxapp.tc.qq.com/258/20304/stodownload?m=2009416463c227ad5a09b4fcf23bf985&filekey=30340201010420301e020201020402534804102009416463c227ad5a09b4fcf23bf9850202042e040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353931363030306366646534303030303030303037636638353130393030303030313032&bizid=1023";
            str4 = str;
            i27 = 0;
        }
        bi4.c1 c1Var = new bi4.c1();
        c1Var.b(c11295xb9c370e5.f33220x8eebed8c);
        c1Var.a(str5);
        bi4.d1 d1Var = c1Var.f102567a;
        d1Var.f436471e = str4;
        d1Var.f436470d.f436507f = i27;
        c1Var.f(concat);
        c1Var.g(Zi);
        c1Var.e(str7);
        c1Var.h(c11295xb9c370e5.f33223x696b9f9);
        c1Var.c(arrayList);
        arrayList.size();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ni(this, 3, d1Var);
    }

    public final void d7(boolean z17, boolean z18, android.os.Bundle bundle) {
        android.content.Intent b17;
        java.lang.String a17;
        if (this.f292559o || !W6()) {
            int i17 = this.f292564t;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f292554g;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f292552e;
            b17 = m21.b.b(i17, c11286x34a5504, "", mVar.f67370x28d45f97, mVar.f67372x453d1e07, mVar.k(), bundle);
        } else {
            b17 = m21.b.b(this.f292564t, this.f292554g, "", "", "", this.f292552e.k(), bundle);
        }
        if (b17 == null) {
            finish();
            return;
        }
        if (this.f292554g.m48467xfb85f7b0() == 5 || this.f292554g.m48467xfb85f7b0() == 2 || this.f292554g.m48467xfb85f7b0() == 38) {
            java.lang.String str = this.f292552e.f67370x28d45f97;
            a17 = c01.n2.a("app_" + this.f292552e.f67370x28d45f97);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "app_" + this.f292552e.f67370x28d45f97);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = this.f292554g.f33122xe4128443;
            if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) {
                c17.i("url", ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) iMediaObject).f33249xa1713a8c);
            }
        } else {
            a17 = null;
        }
        if ("wx5dfbe0a95623607b".equals(this.f292552e.f67370x28d45f97)) {
            if (this.f292554g.m48467xfb85f7b0() == 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "report(17256) url, to timeline, appId : %s", this.f292552e.f67370x28d45f97);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17256, a17, 2);
            } else if (this.f292554g.m48467xfb85f7b0() == 38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "report(17256) video file, to timeline, appId : %s", this.f292552e.f67370x28d45f97);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17256, a17, 1);
            }
        }
        b17.putExtra("reportSessionId", a17);
        b17.putExtra("KSnsUploadFromSkipCompress", z18);
        b17.putExtra("SendAppMessageWrapper_TokenValid", this.f292559o);
        b17.putExtra("SendAppMessageWrapper_PkgName", this.f292560p);
        if (z17) {
            j45.l.n(this, "sns", ".ui.SnsUploadUI", b17, 1);
        } else {
            j45.l.j(this, "sns", ".ui.SnsUploadUI", b17, null);
        }
    }

    public final void e7(java.util.List list, java.lang.String str) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            f7((java.lang.String) list.get(i17), str);
        }
    }

    public final boolean f7(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap;
        int i17 = 0;
        int i18 = 4;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            hashMap = com.p314xaae8f345.mm.ui.i1.a(str2);
            if (hashMap != null) {
                i18 = 5;
                i17 = 1;
            }
        } else {
            hashMap = null;
        }
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(c01.e2.C(str));
            a17.f523664f = i17;
            a17.f523666h = hashMap;
            a17.b();
        } else {
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(c01.e2.C(str));
            a18.f523664f = i17;
            a18.f523666h = hashMap;
            a18.f523667i = i18;
            a18.a().a();
        }
        return true;
    }

    public final java.lang.String g7(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("OpenSdk");
        if (!h07.m()) {
            h07.J();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h07.n());
        sb6.append("/");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        int S = com.p314xaae8f345.mm.vfs.w6.S(sb7, bArr, 0, bArr.length);
        if (S == 0) {
            return sb7;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "saveBytesToTemp, failed to write temp file, ret = " + S);
        return "";
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    public final void h7(java.util.List list, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list) || c11286x34a5504 == null || c11286x34a5504.f33122xe4128443 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendAppMessageWrapperUI", "sendAppMsg: error toUserList:%s wxMediaMessage:%s", list, c11286x34a5504);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "sendWxMediaMessage() called with: toUserList = [" + list + "], wxMediaMessage = [" + c11286x34a5504 + "]");
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.String str = (java.lang.String) list.get(i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || c11286x34a5504.f33122xe4128443 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendAppMessageWrapperUI", "sendAppMsg: error userName:%s wxMediaMessage:%s", str, c11286x34a5504);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f292552e;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.E(c11286x34a5504, mVar.f67370x28d45f97, mVar.f67372x453d1e07, str, 2, null, null, 0, aVar);
            }
        }
    }

    public final void i7(android.content.DialogInterface.OnCancelListener onCancelListener) {
        a7();
        this.f292557m = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, onCancelListener);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
    }

    public final void j7(java.lang.String str, byte[] bArr, dk5.h2 h2Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && bArr != null && bArr.length > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "uploadMusicVideoImage upload thumbData: %s", java.lang.Integer.valueOf(bArr.length));
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            str = m11.b1.Di().L0(null, bm5.f0.f104097i, bArr, null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            h2Var.a(null, true);
            return;
        }
        i7(null);
        ((ku5.t0) ku5.t0.f394148d).h(new dk5.f2(str, h2Var), "MusicVideoShareUploadImage");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "onActivityResult requestCode " + i17 + " resultCode " + i18);
        if (i17 == 1) {
            if (i18 == -1) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(this, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(getIntent().getExtras(), 0), true, false);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(this, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(getIntent().getExtras(), 0), true, true);
            }
            finish();
            return;
        }
        if (i17 != 2 || i18 != -1) {
            if (i17 == 3) {
                if (i18 == -1) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(this, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(getIntent().getExtras(), 0), true, false);
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(this, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(getIntent().getExtras(), 0), true, true);
                }
                finish();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = this.f292554g.f33122xe4128443;
        if (!(iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995)) {
            if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3 c11282x3580fbc3 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3) iMediaObject;
                java.lang.String stringExtra = intent.getStringExtra("K_SEGMENTVIDEOPATH");
                c11282x3580fbc3.f33097xd426afc1 = stringExtra;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && com.p314xaae8f345.mm.vfs.w6.j(c11282x3580fbc3.f33097xd426afc1)) {
                    d7(true, false, null);
                    return;
                } else {
                    setResult(-5);
                    finish();
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995 c11297x655ab995 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995) iMediaObject;
        java.lang.String stringExtra2 = intent.getStringExtra("K_SEGMENTVIDEOPATH");
        c11297x655ab995.f33233xd426afc1 = stringExtra2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult videoPath: %s", stringExtra2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11297x655ab995.f33233xd426afc1) || !com.p314xaae8f345.mm.vfs.w6.j(c11297x655ab995.f33233xd426afc1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult videoFile invalid");
            setResult(-5);
            finish();
        } else {
            int i19 = this.f292555h;
            if (i19 == 1) {
                d7(true, false, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "handleVideoFileMsgCompressResult unexpected scene: %s", java.lang.Integer.valueOf(i19));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0303 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0417  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f292558n) {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
            setRequestedOrientation(1);
            sharedPreferences.edit().putBoolean("settings_landscape_mode", false).commit();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        mo48674x36654fab();
        return super.onTouchEvent(motionEvent);
    }
}
