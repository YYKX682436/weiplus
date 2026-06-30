package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(4128)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorWithoutAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@db5.c9
@ul5.d(0)
/* loaded from: classes3.dex */
public class FinderLiveAnchorWithoutAffinityUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109337v = "FinderLiveAnchorWithoutAffinityUI";

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment f109338w;

    public final void d7() {
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment finderLiveAnchorFragment = new com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment();
        this.f109338w = finderLiveAnchorFragment;
        finderLiveAnchorFragment.f111651n = false;
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.k(com.tencent.mm.R.id.gd9, finderLiveAnchorFragment, null);
        beginTransaction.f();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment finderLiveAnchorFragment = this.f109338w;
        if (finderLiveAnchorFragment != null) {
            java.util.Iterator it = finderLiveAnchorFragment.f206298e.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.component.UIComponent) it.next()).onBeforeFinish(getIntent());
            }
        }
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.alq;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.live.viewmodel.b8.class, d92.z0.class, d92.q0.class, com.tencent.mm.plugin.finder.live.viewmodel.s5.class, com.tencent.mm.plugin.finder.live.viewmodel.g4.class, com.tencent.mm.plugin.finder.live.viewmodel.a6.class, or2.f.class});
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String permission) {
        kotlin.jvm.internal.o.g(permission, "permission");
        if (kotlin.jvm.internal.o.b(permission, d85.g0.CAMERA.f227192d)) {
            finish();
        } else {
            kotlin.jvm.internal.o.b(permission, d85.g0.MICRO_PHONE.f227192d);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionGranted(java.lang.String permission) {
        in0.q qVar;
        kotlin.jvm.internal.o.g(permission, "permission");
        if (kotlin.jvm.internal.o.b(permission, d85.g0.CAMERA.f227192d)) {
            dk2.ef efVar = dk2.ef.f233372a;
            tn0.w0 w0Var = dk2.ef.f233378d;
            qVar = w0Var instanceof in0.q ? (in0.q) w0Var : null;
            if (qVar != null) {
                qVar.c1(ko0.c0.f309825a.b().f319996e);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(permission, d85.g0.MICRO_PHONE.f227192d)) {
            dk2.ef efVar2 = dk2.ef.f233372a;
            tn0.w0 w0Var2 = dk2.ef.f233378d;
            qVar = w0Var2 instanceof in0.q ? (in0.q) w0Var2 : null;
            if (qVar != null) {
                qVar.C0(true);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        getResources().getConfiguration().orientation = newConfig.orientation;
        java.lang.String str = this.f109337v;
        com.tencent.mars.xlog.Log.i(str, "onConfigurationChanged");
        if (getIntent().getBooleanExtra("KEY_SUPPORT_RESET_FRAGMENT", false)) {
            com.tencent.mars.xlog.Log.i(str, "onConfigurationChanged resetFragment");
            getIntent().removeExtra("KEY_SUPPORT_RESET_FRAGMENT");
            getIntent().putExtra("KEY_PARAMS_RESET_LIVE", true);
            com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment finderLiveAnchorFragment = this.f109338w;
            if (finderLiveAnchorFragment != null) {
                androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
                kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
                beginTransaction.j(finderLiveAnchorFragment);
                beginTransaction.f();
            }
            d7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.checkFinishWhenDiffTask(this);
        }
        super.onCreate(bundle);
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        d7();
        java.lang.String str = this.f109337v;
        com.tencent.mars.xlog.Log.i(str, "[onCreate]");
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderLiveAnchorWithoutAffinityUI);
        aVar.Rj(this, iy1.a.FinderLive);
        aVar.ik(this, 40, 25388);
        if (un0.s.f429418b != null) {
            com.tencent.mars.xlog.Log.i(str, "#checkAndStartScreenCastGameService cast is running! ready to start service.");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService.class);
            com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService.f68560g.a(intent, getClass(), 2);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startForegroundService(intent);
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "#checkAndStartScreenCastGameService cast is not running. return");
        }
        ll2.e eVar = ll2.e.f319133a;
        ll2.e.b(eVar, "anchorlive.bottom.videosetting.makeup", false, false, 6, null);
        ll2.e.b(eVar, "startlive.bottom.videosetting.makeup", false, false, 6, null);
        ll2.e.b(eVar, "anchorlive.bottom.videosetting.beauty", false, false, 6, null);
        ll2.e.b(eVar, "startlive.bottom.videosetting.beauty", false, false, 6, null);
        ll2.e.b(eVar, "anchorlive.bottom.videosetting.filter", false, false, 6, null);
        ll2.e.b(eVar, "startlive.bottom.videosetting.filter", false, false, 6, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.content.Intent intent;
        byte[] byteArrayExtra;
        r45.m84 m84Var;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(this.f109337v, "[onDestroy]");
        if (!getIntent().hasExtra("KEY_PARAMS_POST_CREATE_LIVE_FROM_SIDEBAR") || (byteArrayExtra = (intent = getIntent()).getByteArrayExtra("KEY_PARAMS_POST_RECOVER_LIVE_SIDEBAR")) == null) {
            return;
        }
        r45.m84 m84Var2 = new r45.m84();
        try {
            m84Var2.parseFrom(byteArrayExtra);
            m84Var = m84Var2;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            m84Var = null;
        }
        if (m84Var != null) {
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            ((vd2.f1) e0Var).Ri(this, intent, m84Var, false, wk0Var, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(this.f109337v, "[onPause]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i(this.f109337v, "[onResume]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i(this.f109337v, "[onStart]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f109337v, "[onStop]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
