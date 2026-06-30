package com.tencent.mm.plugin.brandservice.ui.flutter;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI;", "Lcom/tencent/mm/ui/gallery/BaseMediaTabActivity;", "Lpi0/o0;", "Lrr1/a;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizTextCoverUI extends com.tencent.mm.ui.gallery.BaseMediaTabActivity implements pi0.o0, rr1.a {

    /* renamed from: i, reason: collision with root package name */
    public static rr1.a f94058i;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f94059f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterViewEngine f94060g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterPageInfo f94061h;

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageInfo F5() {
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = this.f94061h;
        kotlin.jvm.internal.o.d(flutterPageInfo);
        return flutterPageInfo;
    }

    @Override // pi0.o0
    public bj0.t P1() {
        na5.a activityAnimLifecycle = getActivityAnimLifecycle();
        w03.h hVar = activityAnimLifecycle instanceof w03.h ? (w03.h) activityAnimLifecycle : null;
        if (hVar != null) {
            return (w03.f) ((jz5.n) hVar.f441883f).getValue();
        }
        return null;
    }

    @Override // pi0.o0
    public android.view.ViewGroup S2() {
        android.view.ViewGroup viewGroup = this.f94059f;
        kotlin.jvm.internal.o.d(viewGroup);
        return viewGroup;
    }

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageStyle S3() {
        return new com.tencent.mm.flutter.ui.FlutterPageStyle(1, 1, null, false, false, false, null, 0, false, false, false, null, 4092, null);
    }

    @Override // pi0.o0
    public void S5(boolean z17) {
    }

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public void V6(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        xg5.b bVar = this.f208684d;
        if (bVar != null) {
            ((b33.o) bVar).U6().setCanSlide(false);
        }
        f94058i = this;
        int intExtra = getIntent().getIntExtra("BizTextCoverEditorUI_kEditorScene", 0);
        com.tencent.mm.autogen.mmdata.rpt.BizTextCoverEditorReportStruct bizTextCoverEditorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizTextCoverEditorReportStruct();
        bizTextCoverEditorReportStruct.f55432d = 101L;
        bizTextCoverEditorReportStruct.f55433e = intExtra;
        bizTextCoverEditorReportStruct.k();
    }

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public void W6(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        xg5.b bVar = this.f208684d;
        if (bVar != null) {
            ((b33.o) bVar).U6().setCanSlide(true);
        }
        f94058i = null;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f94060g;
        if (flutterViewEngine != null) {
            flutterViewEngine.b();
        }
    }

    @Override // pi0.o0
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dzz;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTextCoverUI", "BizTextCoverUI onBackPressed " + hashCode());
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f94060g;
        if (flutterViewEngine != null) {
            flutterViewEngine.f68133h.getNavigationChannel().popRoute();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTextCoverUI", "BizTextCoverUI onCreate " + hashCode());
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        this.f94059f = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f487281ve3);
        this.f94061h = (com.tencent.mm.flutter.ui.FlutterPageInfo) getIntent().getParcelableExtra("page_info");
        io.flutter.embedding.engine.FlutterEngineCache flutterEngineCache = io.flutter.embedding.engine.FlutterEngineCache.getInstance();
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = this.f94061h;
        if (flutterPageInfo == null || (str = flutterPageInfo.f68113d) == null) {
            str = "";
        }
        if (flutterEngineCache.get(str) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch with cached engine id ");
            com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo2 = this.f94061h;
            sb6.append(flutterPageInfo2 != null ? flutterPageInfo2.f68113d : null);
            sb6.append(", but it has been destroyed");
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTextCoverUI", sb6.toString());
            finish();
            return;
        }
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = new com.tencent.mm.flutter.ui.FlutterViewEngine(this);
        this.f94060g = flutterViewEngine;
        flutterViewEngine.f();
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setNavigationBarColor(0);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTextCoverUI", "BizTextCoverUI onDestroy " + hashCode());
        f94058i = null;
        super.onDestroy();
        this.f94060g = null;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f94060g;
        if (flutterViewEngine != null) {
            flutterViewEngine.h();
        }
        super.onUserLeaveHint();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, pi0.o0
    public void pop() {
    }
}
