package vg0;

/* loaded from: classes8.dex */
public final class j implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517989a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517990b;

    public j(java.lang.ref.WeakReference callbackRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackRef, "callbackRef");
        this.f517989a = callbackRef;
        this.f517990b = "setSearchBarFocus";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("focused") : null;
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        tg0.q1 q1Var = (tg0.q1) this.f517989a.get();
        if (q1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = ((rx4.e) q1Var).f482668b;
            if (!booleanValue) {
                c19404xac949430.m174141x36654fab();
            }
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) c19404xac949430.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.gfl);
            if (booleanValue) {
                if (c22479x68a26381 != null) {
                    c22479x68a26381.requestFocus();
                }
            } else if (c22479x68a26381 != null) {
                c22479x68a26381.clearFocus();
            }
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f517990b;
    }
}
