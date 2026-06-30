package aw2;

/* loaded from: classes10.dex */
public final class t0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f14797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aw2.x0 f14798b;

    public t0(r45.qt2 qt2Var, aw2.x0 x0Var) {
        this.f14797a = qt2Var;
        this.f14798b = x0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        r45.qt2 qt2Var = this.f14797a;
        lVarArr[0] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        int i17 = 2;
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        aw2.x0 x0Var = this.f14798b;
        if (((java.lang.Boolean) ((jz5.n) x0Var.f14816p).getValue()).booleanValue()) {
            i17 = 3;
        } else if (x0Var.f14812i) {
            i17 = 1;
        } else {
            java.lang.String str2 = (java.lang.String) ((jz5.n) x0Var.f14817q).getValue();
            kotlin.jvm.internal.o.f(str2, "<get-topicWord>(...)");
            if (!(str2.length() > 0)) {
                i17 = 0;
            }
        }
        lVarArr[3] = new jz5.l("follow_shot_type", java.lang.Integer.valueOf(i17));
        java.util.HashMap i18 = kz5.c1.i(lVarArr);
        if (kotlin.jvm.internal.o.b(str, "view_clk")) {
            android.widget.CheckBox checkBox = (android.widget.CheckBox) ((jz5.n) x0Var.f14809f).getValue();
            i18.put("if_pitch_on_share_to_comment_area", !(checkBox != null && checkBox.isChecked()) ? "1" : "0");
        }
        return kz5.c1.s(i18);
    }
}
