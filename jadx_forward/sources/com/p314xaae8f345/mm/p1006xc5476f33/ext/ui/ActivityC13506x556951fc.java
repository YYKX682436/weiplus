package com.p314xaae8f345.mm.p1006xc5476f33.ext.ui;

/* renamed from: com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI */
/* loaded from: classes5.dex */
public class ActivityC13506x556951fc extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f181451d = null;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) ? super.getResources() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181451d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), "", true, false, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new x62.a(this), 500L);
        c01.d9.e().a(106, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(106, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f181451d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f181451d = null;
        }
    }
}
