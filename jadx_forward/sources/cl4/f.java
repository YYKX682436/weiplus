package cl4;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final cl4.f f124480a = new cl4.f();

    public final java.lang.String a(bw5.lp0 lp0Var) {
        java.lang.String k17 = lp0Var.d().j().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getMusicWeburl(...)");
        return k17;
    }

    public final void b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ting3rdJumperHelper", "launch H5 appId: %s, url:%s", str, str2);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "wx5aa333606550dfd5")) {
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_G5AaIuNdPtZyH1oCL8";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public final void c(java.lang.String str, bw5.lp0 lp0Var, int i17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Bj("player_page_music_jump_pop_continue", "view_clk", kz5.c1.k(new jz5.l("appid", str), new jz5.l("currlistenid", lp0Var.d().m13170xcc16feb8()), new jz5.l("actionlistenid", lp0Var.d().m13170xcc16feb8()), new jz5.l("from_scene", java.lang.Integer.valueOf(i17))), 5, false);
    }
}
