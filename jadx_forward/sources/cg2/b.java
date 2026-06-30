package cg2;

/* loaded from: classes3.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f122612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Resources f122613e;

    public b(dk2.zf zfVar, android.content.res.Resources resources) {
        this.f122612d = zfVar;
        this.f122613e = resources;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) t70Var.Q().r()).booleanValue();
        android.content.res.Resources resources = this.f122613e;
        if (booleanValue) {
            if (this.f122612d.mo124533xfb85f7b0() == 1) {
                g4Var.f(4, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573216dx2));
            }
        }
        if (((java.lang.Boolean) t70Var.Q().r()).booleanValue()) {
            g4Var.f(3, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyu));
        }
        g4Var.f(1, resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4));
    }
}
