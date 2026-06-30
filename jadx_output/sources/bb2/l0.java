package bb2;

/* loaded from: classes10.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bb2.l0 f18908a = new bb2.l0();

    /* renamed from: b, reason: collision with root package name */
    public static rl5.r f18909b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f18910c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.modelbase.i f18911d;

    /* renamed from: e, reason: collision with root package name */
    public static az2.f f18912e;

    public static final void a(bb2.l0 l0Var, java.lang.String str, r45.qt2 qt2Var, r45.oo ooVar, so2.u1 u1Var, java.lang.String str2, java.lang.String str3, bb2.w1 w1Var, boolean z17, boolean z18, boolean z19) {
        l0Var.getClass();
        java.lang.String str4 = z19 ? "bc_more_options" : "bc_options";
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[13];
        lVarArr[0] = new jz5.l("bc_id", pm0.v.u(ooVar.getLong(0)));
        lVarArr[1] = new jz5.l("bc_content", ooVar.getString(2));
        lVarArr[2] = new jz5.l("bc_like_cnt", java.lang.Integer.valueOf(ooVar.getInteger(8)));
        lVarArr[3] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[4] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[5] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        lVarArr[6] = new jz5.l(str4, str3);
        lVarArr[7] = new jz5.l("playpercent", java.lang.Integer.valueOf(a06.d.b((w1Var != null ? w1Var.f() : 0.0f) * 100)));
        lVarArr[8] = new jz5.l("screen_type", java.lang.Integer.valueOf(z18 ? 1 : 2));
        lVarArr[9] = new jz5.l("feed_id", pm0.v.u(u1Var.getItemId()));
        lVarArr[10] = new jz5.l("login_mode", java.lang.Integer.valueOf(z17 ? 1 : 2));
        lVarArr[11] = new jz5.l("bc_post_type", java.lang.Integer.valueOf(ooVar.getLong(14) == 0 ? 1 : 2));
        java.lang.Long valueOf = java.lang.Long.valueOf(ooVar.getLong(14));
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        lVarArr[12] = new jz5.l("bs_follow_button_id", valueOf != null ? pm0.v.u(valueOf.longValue()) : null);
        ((cy1.a) rVar).Bj(str, str2, kz5.c1.k(lVarArr), 1, false);
    }

    public static final db5.o4 b(bb2.l0 l0Var, android.content.Context context, r45.oo ooVar, boolean z17, boolean z18, r45.qt2 qt2Var, so2.u1 u1Var, bb2.w1 w1Var, boolean z19) {
        l0Var.getClass();
        return new bb2.p(context.getResources(), z17, ooVar, z18, qt2Var, u1Var, w1Var, z19);
    }

    public static final db5.t4 c(bb2.l0 l0Var, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, in5.s0 s0Var, android.view.View view, so2.u1 u1Var, r45.oo ooVar, float f17, float f18, boolean z17, r45.qt2 qt2Var, int i17, bb2.w1 w1Var, boolean z18, android.widget.PopupWindow.OnDismissListener onDismissListener, yz5.a aVar) {
        l0Var.getClass();
        return new bb2.z(view, u1Var, ooVar, onDismissListener, mMFragmentActivity, s0Var, qt2Var, w1Var, z17, z18, aVar, i17);
    }
}
