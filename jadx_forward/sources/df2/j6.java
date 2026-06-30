package df2;

/* loaded from: classes3.dex */
public final class j6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f311984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(df2.t6 t6Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f311984d = t6Var;
        this.f311985e = str;
        this.f311986f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.w5 w5Var;
        df2.t6 t6Var = this.f311984d;
        android.widget.LinearLayout linearLayout = t6Var.f312949n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        df2.d6 d6Var = (df2.d6) t6Var.m56789x25fe639c(df2.d6.class);
        if (d6Var != null && (w5Var = d6Var.f311478m) != null) {
            w5Var.c();
        }
        if (in0.q.f374302b2 != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("features_stage", java.lang.Integer.valueOf(this.f311985e.length() == 0 ? 1 : 2));
            linkedHashMap.put("features_type", this.f311986f);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_anchor_gesture_features", "view_exp", linkedHashMap);
        }
        return jz5.f0.f384359a;
    }
}
