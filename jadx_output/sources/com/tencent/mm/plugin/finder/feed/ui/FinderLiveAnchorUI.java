package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveAnchorUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109332v = "MicroMsg.FinderLiveAnchorUI";

    /* renamed from: w, reason: collision with root package name */
    public boolean f109333w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.v1 f109334x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f109335y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.c8 f109336z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aym;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.live.viewmodel.b8.class, com.tencent.mm.plugin.finder.live.viewmodel.s5.class, com.tencent.mm.plugin.finder.live.viewmodel.g4.class, com.tencent.mm.plugin.finder.live.viewmodel.a6.class});
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        if (v1Var != null) {
            v1Var.onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        boolean z17 = false;
        if (v1Var != null && !v1Var.onBackPress()) {
            z17 = true;
        }
        if (z17) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        if (v1Var != null) {
            v1Var.unMount();
        }
        com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f109336z;
        if (c8Var != null) {
            c8Var.o0();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        if (v1Var != null) {
            v1Var.onNewIntent(intent);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f109335y;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        if (v1Var != null) {
            v1Var.pause();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        if (v1Var != null) {
            v1Var.resume();
        }
        com.tencent.mm.plugin.finder.live.view.v1 v1Var2 = this.f109334x;
        if (v1Var2 != null) {
            v1Var2.post(new com.tencent.mm.plugin.finder.feed.ui.u7(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        if (v1Var != null) {
            v1Var.start();
        }
        com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f109336z;
        if (c8Var != null) {
            c8Var.p0();
        }
        qp1.h0.a(true, false, true);
        com.tencent.mars.xlog.Log.i(this.f109332v, "onStart hideFloatBall");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = this.f109334x;
        if (v1Var != null) {
            v1Var.stop();
        }
        com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f109336z;
        if (c8Var != null) {
            c8Var.z();
        }
        qp1.h0.b();
        com.tencent.mars.xlog.Log.i(this.f109332v, "onStop resumeFloatBall");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
