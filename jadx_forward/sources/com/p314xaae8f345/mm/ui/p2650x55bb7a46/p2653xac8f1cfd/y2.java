package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.p.class)
/* loaded from: classes5.dex */
public class y2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f281801e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f281802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f281803g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f281805i;

    /* renamed from: h, reason: collision with root package name */
    public boolean f281804h = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f281806m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f281807n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f281808o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f281809p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f281810q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f281811r = 0;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f281812s = 1;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "reset");
        this.f281805i = null;
        this.f281803g = null;
        this.f281802f = null;
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.b("", "");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        m0();
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        m0();
        lt.n0 n0Var = (lt.n0) i95.n0.c(lt.n0.class);
        java.lang.String str = this.f281803g;
        java.lang.String str2 = this.f281805i;
        ((kt.g) n0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.b(str, str2);
    }

    public final void m0() {
        if (this.f281801e == null) {
            try {
                this.f281801e = this.f280113d.f542250l.m78383x21a1233e("key_biz_half_screen_chat_style", false);
                java.lang.String m78394x7e63ed49 = this.f280113d.f542250l.m78394x7e63ed49("key_biz_half_screen_chat_refer_info");
                this.f281802f = m78394x7e63ed49;
                if (m78394x7e63ed49 == null) {
                    this.f281802f = "";
                }
                s0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "checkAndInitBizHalfScreenChattingStyle mIsBizHalfScreenStyle: %s, mReferInfo:%s", this.f281801e, this.f281802f);
            } catch (java.lang.Exception e17) {
                this.f281801e = java.lang.Boolean.FALSE;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "checkAndInitBizHalfScreenChattingStyle", new java.lang.Object[0]);
            }
        }
        this.f281806m = this.f280113d.f542250l.m78383x21a1233e("key_template_history_msg", false).booleanValue();
    }

    public void n0() {
        m0();
        if (this.f281801e.booleanValue()) {
            ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        }
    }

    public final int o0(cl0.g gVar, java.lang.String str) {
        int i17 = 0;
        if (gVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonIntValue param is illegal:" + str);
            return 0;
        }
        try {
            i17 = java.lang.Integer.parseInt(gVar.mo15082x48bce8a4(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "getJsonIntValue", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonIntValue key:" + str + ", value:" + i17);
        return i17;
    }

    public final java.lang.String p0(cl0.g gVar, java.lang.String str) {
        if (gVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonStringValue param is illegal:" + str);
            return "";
        }
        java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "getJsonStringValue key:" + str + ", value:" + mo15082x48bce8a4);
        return mo15082x48bce8a4;
    }

    public int q0() {
        m0();
        if (!this.f281801e.booleanValue()) {
            return 0;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
        return i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 80) + com.p314xaae8f345.mm.ui.bl.i(this.f280113d.g(), 0);
    }

    public long r0() {
        m0();
        if (!this.f281801e.booleanValue() || this.f281812s == 3) {
            return 0L;
        }
        lt.n0 n0Var = (lt.n0) i95.n0.c(lt.n0.class);
        java.lang.String articleIdentity = this.f281803g;
        ((kt.g) n0Var).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(articleIdentity, "articleIdentity");
        try {
            java.lang.String str = "late" + com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273355b;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
            long j17 = o4Var2 != null ? o4Var2.getLong(str, 0L) : 0L;
            if (j17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime latestTime == 0 fold all msg  articleIdentity:".concat(articleIdentity));
            } else {
                long a17 = c01.id.a();
                if (a17 - j17 <= 86400000) {
                    java.lang.String str2 = "early" + com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273355b;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
                    long j18 = (a17 - (o4Var3 != null ? o4Var3.getLong(str2, 0L) : 0L)) + 100;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime  articleIdentity:" + articleIdentity + "  result:" + j18);
                    return j18;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "getMsgFoldTime fold all msg  articleIdentity:".concat(articleIdentity));
            }
            return 10L;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizHalfScreenChattingUtil", e17, "getMsgFoldTime", new java.lang.Object[0]);
            return 0L;
        }
    }

    public final void s0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f281802f)) {
            return;
        }
        try {
            cl0.g gVar = new cl0.g(this.f281802f);
            java.lang.String p07 = p0(gVar, "biz");
            java.lang.String p08 = p0(gVar, "mid");
            java.lang.String p09 = p0(gVar, "idx");
            this.f281811r = o0(gVar, "itemShowType");
            this.f281807n = p0(gVar, "pageUrl");
            this.f281808o = p0(gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            this.f281809p = p0(gVar, "desc");
            this.f281810q = p0(gVar, "cover");
            this.f281803g = p07 + p08 + p09 + this.f281811r;
            this.f281805i = "<mppageidentity><bizid>" + p07 + "</bizid><mid>" + p08 + "</mid><idx>" + p09 + "</idx><itemshowtype>" + this.f281811r + "</itemshowtype></mppageidentity>";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", e17, "", new java.lang.Object[0]);
            this.f281803g = "";
            this.f281805i = "";
        }
    }

    public boolean t0() {
        m0();
        return this.f281801e.booleanValue();
    }

    public void u0(boolean z17) {
        m0();
        if (this.f281801e.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "showMoreMsgHeader show:%b, moreMsgHeaderState:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f281812s));
            if (z17 && this.f281812s == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingBizHalfScreenComponent", "showMoreMsgHeader do add Header");
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f280113d.g()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570112xt, (android.view.ViewGroup) null);
                inflate.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w2(this, inflate));
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) this.f280113d.f542251m).C0().mo75755x77114253(inflate);
                this.f281812s = 2;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        m0();
        if (this.f281801e.booleanValue()) {
            lt.n0 n0Var = (lt.n0) i95.n0.c(lt.n0.class);
            java.lang.String str = this.f281803g;
            java.lang.String str2 = this.f281805i;
            ((kt.g) n0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.b(str, str2);
        }
    }
}
