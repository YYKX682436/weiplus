package zt0;

/* loaded from: classes5.dex */
public abstract class a {
    public static final java.util.Map a(android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "<this>");
        jz5.l lVar = new jz5.l("finder_tab_context_id", bundle.getString("key_click_tab_context_id", ""));
        jz5.l lVar2 = new jz5.l("finder_context_id", bundle.getString("FINDER_CONTEXT_ID", ""));
        jz5.l lVar3 = new jz5.l("enterscene", java.lang.Integer.valueOf(bundle.getInt("key_ref_enter_scene", 0)));
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return kz5.c1.l(lVar, lVar2, lVar3, new jz5.l("finder_post_sessionid", ((qs2.q) ((w40.e) c17)).hj()), new jz5.l("comment_scene", 363));
    }
}
