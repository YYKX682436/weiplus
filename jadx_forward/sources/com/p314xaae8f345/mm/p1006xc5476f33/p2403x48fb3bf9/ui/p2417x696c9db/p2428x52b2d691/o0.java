package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class o0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o0 f267934d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o0();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f267935e;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.content.Context context = env.f422393a;
        if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) && (e3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).L1) != null) {
            java.util.Iterator it = e3Var.X.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3) it.next()).n();
            }
        }
        f267935e = msg.f422546c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "SPA-Trace, JsApiDoAuthCurrentUrl call");
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 397;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "doAuthCurrentUrl";
    }
}
