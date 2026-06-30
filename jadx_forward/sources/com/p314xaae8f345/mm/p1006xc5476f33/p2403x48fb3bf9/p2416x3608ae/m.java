package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class m implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f265076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b f265077b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b activityC19301x4b18db3b, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f265077b = activityC19301x4b18db3b;
        this.f265076a = u3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265076a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b activityC19301x4b18db3b = this.f265077b;
        if (z17) {
            if (activityC19301x4b18db3b.f265003e != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("add_shortcut_status", true);
                try {
                    activityC19301x4b18db3b.f265003e.i(54, bundle);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + e17.getMessage());
                }
            }
            db5.e1.o(activityC19301x4b18db3b, com.p314xaae8f345.mm.R.C30867xcad56011.la9, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.l(this));
            return;
        }
        dp.a.m125854x26a183b(activityC19301x4b18db3b.mo55332x76847179(), activityC19301x4b18db3b.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.la8), 0).show();
        if (activityC19301x4b18db3b.f265003e != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("add_shortcut_status", false);
            try {
                activityC19301x4b18db3b.f265003e.i(54, bundle2);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "notify add shortcut status failed: " + e18.getMessage());
            }
        }
        activityC19301x4b18db3b.finish();
    }
}
