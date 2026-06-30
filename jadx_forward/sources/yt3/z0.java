package yt3;

/* loaded from: classes5.dex */
public final class z0 {
    public z0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View view, int i17, boolean z17) {
        if (view == null) {
            return;
        }
        int i18 = i17 != 1 ? i17 != 2 ? 4 : 1 : 2;
        dy1.a.i(view, "video_edit_basic_miaojian_jump");
        dy1.a.l(view, 40, 32337);
        dy1.a.j(view, "post_session_id", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        dy1.a.j(view, "video_edit_scene", java.lang.Integer.valueOf(i18));
        dy1.a.j(view, "video_edit_path", java.lang.Integer.valueOf(z17 ? 2 : 1));
    }
}
