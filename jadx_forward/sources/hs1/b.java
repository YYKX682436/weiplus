package hs1;

/* loaded from: classes4.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f366093e = {l75.n0.m145250x3fdc6f77(hs1.a.f366092t, "BizAppMsgReportContext")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f366094f = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f366095d;

    public b(l75.k0 k0Var) {
        super(k0Var, hs1.a.f366092t, "BizAppMsgReportContext", f366094f);
        this.f366095d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(hs1.a aVar) {
        aVar.f68633x1ec7cd11 = aVar.f68634x2c459686;
        return super.mo880xb970c2b9(aVar);
    }

    public void z0(java.util.List list) {
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            mo9951xb06685ab((hs1.a) it.next(), new java.lang.String[0]);
        }
        gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
    }
}
