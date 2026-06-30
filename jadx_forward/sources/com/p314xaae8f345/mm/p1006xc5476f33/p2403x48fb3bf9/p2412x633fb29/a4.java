package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 f264300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.d4 f264301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 h4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.d4 d4Var) {
        super(0);
        this.f264300d = h4Var;
        this.f264301e = d4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4 h4Var = this.f264300d;
        if (!h4Var.f264456h) {
            h4Var.f264456h = true;
            java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
            if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                activity = j17 != null ? (android.app.Activity) j17.get() : null;
            }
            this.f264301e.hashCode();
            java.util.Objects.toString(activity);
            if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b)) {
                h4Var.d(hy4.a0.f367606f);
            }
        }
        return jz5.f0.f384359a;
    }
}
