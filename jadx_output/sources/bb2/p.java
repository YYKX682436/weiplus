package bb2;

/* loaded from: classes10.dex */
public final class p implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Resources f18932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f18933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oo f18934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f18935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f18936h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f18937i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18938m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f18939n;

    public p(android.content.res.Resources resources, boolean z17, r45.oo ooVar, boolean z18, r45.qt2 qt2Var, so2.u1 u1Var, bb2.w1 w1Var, boolean z19) {
        this.f18932d = resources;
        this.f18933e = z17;
        this.f18934f = ooVar;
        this.f18935g = z18;
        this.f18936h = qt2Var;
        this.f18937i = u1Var;
        this.f18938m = w1Var;
        this.f18939n = z19;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) t70Var.Q().r()).booleanValue();
        android.content.res.Resources resources = this.f18932d;
        if (booleanValue) {
            g4Var.f(13, resources.getString(com.tencent.mm.R.string.o8x));
            arrayList.add(5);
        }
        boolean z17 = this.f18933e;
        r45.oo ooVar = this.f18934f;
        if (z17) {
            if (ooVar.getInteger(6) == 0) {
                g4Var.f(2, resources.getString(com.tencent.mm.R.string.gu6));
                g4Var.f(1, resources.getString(com.tencent.mm.R.string.f492523gu3));
                arrayList.add(6);
                arrayList.add(10);
                if (this.f18935g) {
                    g4Var.f(4, resources.getString(com.tencent.mm.R.string.cms));
                    arrayList.add(14);
                } else {
                    g4Var.f(3, resources.getString(com.tencent.mm.R.string.cmr));
                    arrayList.add(7);
                }
            } else {
                g4Var.f(1, resources.getString(com.tencent.mm.R.string.f492523gu3));
                arrayList.add(10);
            }
        } else if (ooVar.getInteger(6) == 1) {
            if (((java.lang.Boolean) t70Var.Q().r()).booleanValue()) {
                g4Var.f(12, resources.getString(com.tencent.mm.R.string.f492526o90));
                arrayList.add(8);
            }
            g4Var.f(1, resources.getString(com.tencent.mm.R.string.f492523gu3));
            arrayList.add(10);
        } else {
            if (((java.lang.Boolean) t70Var.Q().r()).booleanValue()) {
                g4Var.f(12, resources.getString(com.tencent.mm.R.string.f492526o90));
                arrayList.add(8);
            }
            g4Var.f(2, resources.getString(com.tencent.mm.R.string.gu6));
            arrayList.add(6);
        }
        arrayList.add(12);
        bb2.l0.a(bb2.l0.f18908a, "finder_barrage_comments_more_options", this.f18936h, this.f18934f, this.f18937i, "view_exp", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null), this.f18938m, this.f18933e, this.f18939n, true);
    }
}
