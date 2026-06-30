package gy4;

/* loaded from: classes8.dex */
public final class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f359122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f359122d = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d T6() {
        if (!(m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pf5.o.TAG, "activity is not WebViewUI");
            throw new java.lang.RuntimeException("activity is not WebViewUI");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) m158354x19263085;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_yuanbao_webview_initial_title");
        if (stringExtra == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = T6().L1;
        if (e3Var != null) {
            e3Var.D(new gy4.a(this, stringExtra));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var2 = T6().L1;
        if (e3Var2 != null) {
            e3Var2.C(new gy4.b(this, stringExtra));
        }
    }
}
