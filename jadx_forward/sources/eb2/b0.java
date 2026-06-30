package eb2;

/* loaded from: classes2.dex */
public final class b0 extends td2.b {

    /* renamed from: g, reason: collision with root package name */
    public final int f332248g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f332249h;

    /* renamed from: i, reason: collision with root package name */
    public final eb2.w f332250i;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f332252n;

    /* renamed from: m, reason: collision with root package name */
    public final im5.c f332251m = new im5.c();

    /* renamed from: o, reason: collision with root package name */
    public boolean f332253o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f332254p = true;

    public b0(int i17, r45.qt2 qt2Var) {
        this.f332248g = i17;
        this.f332249h = qt2Var;
        this.f332250i = new eb2.w(i17);
    }

    public static void E0(eb2.b0 b0Var, db2.u3 u3Var, boolean z17, int i17, java.util.List list, boolean z18, boolean z19, db2.v3 v3Var, int i18, java.lang.Object obj) {
        boolean z27 = (i18 & 2) != 0 ? false : z17;
        java.util.List list2 = (i18 & 8) != 0 ? null : list;
        boolean z28 = (i18 & 16) != 0 ? false : z18;
        db2.v3 v3Var2 = (i18 & 64) != 0 ? null : v3Var;
        b0Var.getClass();
        new db2.w0(i17, b0Var.f332248g, new eb2.y(list2, b0Var, i17, z28, z27, u3Var), v3Var2, b0Var.f332250i.f332392c, false, b0Var.f332249h).l().f(b0Var.f332251m);
    }
}
