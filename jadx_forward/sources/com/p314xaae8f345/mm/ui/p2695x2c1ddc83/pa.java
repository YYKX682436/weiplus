package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class pa implements p21.a {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f289502d;

    /* renamed from: e, reason: collision with root package name */
    public yf5.j0 f289503e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f289504f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289505g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289506h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289507i = null;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f289508m = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.na(this);

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        yf5.j0 j0Var = this.f289503e;
        if (j0Var != null) {
            ((yf5.w0) j0Var).notifyDataSetChanged();
        }
    }

    public void a() {
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(this);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a;
        if (j0Var != null) {
            j0Var.dismiss();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a = null;
        }
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) this.f289502d;
        if (activityC21387x976b8e54 != null) {
            com.p314xaae8f345.mm.ui.C21374x812c2fd3 m78446x1cde66a9 = activityC21387x976b8e54.m78446x1cde66a9();
            m78446x1cde66a9.T.remove(this.f289508m);
        }
    }
}
