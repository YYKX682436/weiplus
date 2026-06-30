package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class LaunchAABeforeUI extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f72475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f72476e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f72477f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f72478g = new com.tencent.mm.plugin.aa.ui.d2(this);

    public static void O6(com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI launchAABeforeUI, boolean z17) {
        launchAABeforeUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("cancel", z17);
        launchAABeforeUI.setResult(-1, intent);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1809, this.f72478g);
        this.f72476e = getIntent().getStringExtra("pfOrderNo");
        this.f72477f = getIntent().getStringExtra("appid");
        this.f72475d = db5.e1.O(this, null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.aa.ui.e2(this));
        i61.p pVar = new i61.p(this.f72476e, this.f72477f);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(pVar);
        setResult(0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1809, this.f72478g);
        super.onDestroy();
    }
}
