package bb2;

/* loaded from: classes10.dex */
public final class p implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Resources f100465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f100466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f100468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100469h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100470i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100471m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f100472n;

    public p(android.content.res.Resources resources, boolean z17, r45.oo ooVar, boolean z18, r45.qt2 qt2Var, so2.u1 u1Var, bb2.w1 w1Var, boolean z19) {
        this.f100465d = resources;
        this.f100466e = z17;
        this.f100467f = ooVar;
        this.f100468g = z18;
        this.f100469h = qt2Var;
        this.f100470i = u1Var;
        this.f100471m = w1Var;
        this.f100472n = z19;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) t70Var.Q().r()).booleanValue();
        android.content.res.Resources resources = this.f100465d;
        if (booleanValue) {
            g4Var.f(13, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o8x));
            arrayList.add(5);
        }
        boolean z17 = this.f100466e;
        r45.oo ooVar = this.f100467f;
        if (z17) {
            if (ooVar.m75939xb282bd08(6) == 0) {
                g4Var.f(2, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gu6));
                g4Var.f(1, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574056gu3));
                arrayList.add(6);
                arrayList.add(10);
                if (this.f100468g) {
                    g4Var.f(4, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cms));
                    arrayList.add(14);
                } else {
                    g4Var.f(3, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmr));
                    arrayList.add(7);
                }
            } else {
                g4Var.f(1, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574056gu3));
                arrayList.add(10);
            }
        } else if (ooVar.m75939xb282bd08(6) == 1) {
            if (((java.lang.Boolean) t70Var.Q().r()).booleanValue()) {
                g4Var.f(12, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574059o90));
                arrayList.add(8);
            }
            g4Var.f(1, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574056gu3));
            arrayList.add(10);
        } else {
            if (((java.lang.Boolean) t70Var.Q().r()).booleanValue()) {
                g4Var.f(12, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574059o90));
                arrayList.add(8);
            }
            g4Var.f(2, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gu6));
            arrayList.add(6);
        }
        arrayList.add(12);
        bb2.l0.a(bb2.l0.f100441a, "finder_barrage_comments_more_options", this.f100469h, this.f100467f, this.f100470i, "view_exp", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null), this.f100471m, this.f100466e, this.f100472n, true);
    }
}
