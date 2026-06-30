package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes12.dex */
public class BizSearchDetailPageUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f93973d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer f93974e;

    /* renamed from: f, reason: collision with root package name */
    public long f93975f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f93976g;

    /* renamed from: h, reason: collision with root package name */
    public int f93977h;

    /* renamed from: i, reason: collision with root package name */
    public int f93978i;

    /* renamed from: m, reason: collision with root package name */
    public int f93979m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f93980n = new or1.g(this);

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String trim = str.trim();
        if (trim.equals(this.f93976g)) {
            return;
        }
        java.lang.Runnable runnable = this.f93980n;
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        this.f93976g = trim;
        com.tencent.mm.sdk.platformtools.u3.i(runnable, 400L);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488221l0;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        com.tencent.mm.ui.tools.c9 c9Var = this.f93973d;
        if (c9Var == null) {
            return true;
        }
        c9Var.j(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.c9 c9Var = this.f93973d;
        if (c9Var != null) {
            c9Var.a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        com.tencent.mm.ui.tools.c9 c9Var = this.f93973d;
        if (c9Var == null) {
            return true;
        }
        c9Var.m(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
