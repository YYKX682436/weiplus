package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppView */
/* loaded from: classes14.dex */
public class C16266x3ede7a38 extends com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: p1, reason: collision with root package name */
    public static android.database.ContentObserver f225906p1;

    /* renamed from: l1, reason: collision with root package name */
    public q80.v f225907l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f225908p0;

    /* renamed from: x0, reason: collision with root package name */
    public q80.y f225909x0;

    /* renamed from: y0, reason: collision with root package name */
    public q80.u f225910y0;

    public C16266x3ede7a38(android.content.Context context) {
        super(context);
        this.f225908p0 = true;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329
    public void a() {
        super.a();
        if (f225906p1 != null) {
            getContext().getContentResolver().unregisterContentObserver(f225906p1);
            f225906p1 = null;
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        q80.v vVar = this.f225907l1;
        if (vVar != null) {
            y54.i0 i0Var = (y54.i0) vVar;
            i0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCloseWindow", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$setupLiteAppView$liteAppView$1");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfScreenVangogh", "onCloseWindow");
            i0Var.f541079a.V6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCloseWindow", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$setupLiteAppView$liteAppView$1");
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329
    public void f() {
        super.f();
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.z1) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226047q.get(java.lang.Long.valueOf(mo28563xe7b2546()));
        if (z1Var != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            boolean z17 = !this.f225908p0;
            if (this.f127572J) {
                z17 = false;
            }
            hashMap.put("popGestureEnable", java.lang.Boolean.valueOf(z17));
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.y1(z1Var, "popGestureEnable", hashMap));
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onBodySizeChange */
    public void mo29025x4e43b612(java.lang.String str, long j17, long j18, float f17, float f18) {
        q80.u uVar = this.f225910y0;
        if (uVar != null) {
            uVar.mo57790x4e43b612(str, j17, j18, f17, f18);
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        super.mo28578x2635de3e(str, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().B(this.f127573d);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        super.mo28579x2d9f160(str, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().C(str, this.f127573d);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329
    /* renamed from: onPause */
    public void mo29028xb01dfb57() {
        super.mo29028xb01dfb57();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329
    /* renamed from: onResume */
    public void mo29029x57429eec() {
        super.mo29029x57429eec();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17 && j45.l.f()) {
            if (f225906p1 == null) {
                f225906p1 = new ra3.g0(getContext(), new java.lang.ref.WeakReference(this));
            }
            getContext().getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, f225906p1);
        } else if (f225906p1 != null) {
            getContext().getContentResolver().unregisterContentObserver(f225906p1);
            f225906p1 = null;
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setForbidRightGestureEnable */
    public void mo28587x5189f8a6(boolean z17) {
        super.mo28587x5189f8a6(z17);
        q80.y yVar = this.f225909x0;
        if (yVar != null) {
            java.lang.String str = this.f127584r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v6 v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v6) yVar;
            v6Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppGameTabUI", "onRightGestureForbidChange appId = %s, forbid = %b", str, java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4 activityC15990xef42d2e4 = v6Var.f223343a;
            activityC15990xef42d2e4.f222536y = z17;
            if (z17) {
                activityC15990xef42d2e4.m78735x28280f95().m81450x8e764904(false);
            } else {
                activityC15990xef42d2e4.m78735x28280f95().m81450x8e764904(true);
            }
        }
        h();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setIsPopGestureEnabled */
    public void mo28588xf7fe169d(boolean z17) {
        super.mo28588xf7fe169d(z17);
        this.f225908p0 = z17;
        h();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(mo28563xe7b2546(), "app.screenshot", (org.json.JSONObject) null);
    }
}
