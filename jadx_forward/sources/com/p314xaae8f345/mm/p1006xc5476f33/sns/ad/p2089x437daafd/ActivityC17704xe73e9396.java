package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd;

@db5.a(m123858x6ac9171 = 7)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI */
/* loaded from: classes4.dex */
public class ActivityC17704xe73e9396 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static t34.f f244161m;

    /* renamed from: d, reason: collision with root package name */
    public t34.f f244162d;

    /* renamed from: e, reason: collision with root package name */
    public t34.a f244163e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f244164f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f244165g = false;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f244166h = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final c84.f f244167i = new t34.c(this);

    public static /* synthetic */ void T6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        V6(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    public static void V6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2029, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    public final void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpLandingPageAndFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        if (isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdAnimProxyUI", "doJumpLandingPageAndFinish, activity destroyed");
            V6(11);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdAnimProxyUI", "doJumpLandingPageAndFinish, handleClick");
            V6(10);
            int i17 = ca4.m0.Y(this.f244162d.f496956b) ? 1 : 2;
            t34.f fVar = this.f244162d;
            w64.n nVar = new w64.n(this, fVar.f496955a, fVar.f496957c, null, fVar.f496960f);
            t34.f fVar2 = this.f244162d;
            nVar.n(fVar2.f496958d, fVar2.f496956b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            nVar.f524853m = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNativeSightType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            android.view.View view = this.f244164f;
            w64.l lVar = this.f244162d.f496960f;
            if (lVar == null || lVar.b() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdAnimProxyUI", "onGetAnimContentView==null, use mRoot");
            } else {
                view = this.f244162d.f496960f.b();
            }
            t34.f fVar3 = this.f244162d;
            u74.d dVar = fVar3.f496963i;
            if (dVar != null && (iVar = fVar3.f496962h) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = fVar3.f496956b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                l44.j4 j4Var = null;
                if (ca4.m0.u0(e42.c0.clicfg_sns_full_card_ad_disable_jump_anim_info, 0) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ClickActionHelper", "disableJumpAnimInfo, do origin logic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                } else if (c17933xe8d1b226 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                } else if (dVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                } else {
                    j4Var = new l44.j4(c17933xe8d1b226, dVar, iVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFullCardAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
                }
                if (j4Var != null) {
                    nVar.x(j4Var);
                    t34.f fVar4 = this.f244162d;
                    fVar4.f496962h.U(j4Var, fVar4.f496956b.m70354x74235b3e().f38248xdb8989da);
                }
            }
            nVar.k(view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delayFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            this.f244166h.postDelayed(new t34.b(this), 300L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delayFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpLandingPageAndFinish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    public final void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActivityStyle", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        try {
            mo78530x8b45058f();
            getWindow().getDecorView().setSystemUiVisibility(1280);
            mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            mo78514x143f1b92().O0(this.f244162d.f496961g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdAnimProxyUI", "setActivityStyle, exp=" + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActivityStyle", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdAnimProxyUI", "finish");
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.coe;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdAnimProxyUI", "onDestroy, hash=" + hashCode());
        V6(15);
        this.f244166h.removeCallbacksAndMessages(null);
        f244161m = null;
        t34.a aVar = this.f244163e;
        if (aVar != null) {
            aVar.mo165846xac79a11b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyDown", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdAnimProxyUI", "onKeyDown back, isEnableBack=" + this.f244165g);
            if (!this.f244165g) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
                return true;
            }
            V6(14);
        }
        boolean onKeyDown = super.onKeyDown(i17, keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        return onKeyDown;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdAnimProxyUI", "onStop, isFinishing=" + isFinishing() + ", hash=" + hashCode());
        f244161m = null;
        if (!isFinishing()) {
            V6(12);
            finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.onWindowFocusChanged(z17);
        if (z17) {
            W6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setActionbarColor */
    public void mo64405x4dab7448(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionbarColor", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
        super.mo64405x4dab7448(i17);
        vj5.o.e(getWindow());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionbarColor", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
    }
}
