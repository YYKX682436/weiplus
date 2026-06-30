package com.tencent.mm.plugin.ext.ui;

/* loaded from: classes5.dex */
public class RedirectToChattingByPhoneStubUI extends com.tencent.mm.hellhoundlib.activities.HellActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99918d = null;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) ? super.getResources() : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f99918d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490604zq), "", true, false, null);
        com.tencent.mm.sdk.platformtools.u3.i(new x62.a(this), 500L);
        c01.d9.e().a(106, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(106, this);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f99918d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f99918d = null;
        }
    }
}
