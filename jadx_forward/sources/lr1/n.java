package lr1;

/* loaded from: classes12.dex */
public class n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f402219d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f402220e;

    /* renamed from: f, reason: collision with root package name */
    public final long f402221f;

    /* renamed from: g, reason: collision with root package name */
    public final int f402222g;

    /* renamed from: h, reason: collision with root package name */
    public final int f402223h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f402224i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f402225m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5197x39c61302 f402226n;

    public n(android.content.Context context, java.lang.String str, long j17, int i17, int i18, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5197x39c61302 c5197x39c61302) {
        this.f402219d = context;
        this.f402220e = str;
        this.f402221f = j17;
        this.f402222g = i17;
        this.f402223h = i18;
        this.f402224i = str2;
        this.f402225m = z17;
        this.f402226n = c5197x39c61302;
    }

    public final void a(boolean z17) {
        java.lang.Runnable runnable;
        gm0.j1.d().q(1071, this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5197x39c61302 c5197x39c61302 = this.f402226n;
        if (c5197x39c61302 == null || (runnable = c5197x39c61302.f135538g.f89690g) == null) {
            return;
        }
        c5197x39c61302.f135539h.f89777a = z17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.l) runnable).run();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceLogic", "errType (%d) , errCode (%d) , errMsg (errMsg)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            a(false);
            return;
        }
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BrandServiceLogic", "scene is null.");
            a(false);
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 1071) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceLogic", "The NetScene is not a instanceof BizSearchDetailPage.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceLogic", "BizSearchDetailPage.");
        r45.kw5 kw5Var = ((lr1.g0) m1Var).f402198f;
        r45.qp qpVar = kw5Var == null ? null : kw5Var.f460537d;
        if (qpVar == null || qpVar.f465691h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BrandServiceLogic", "response or BusinessContent or itemList is null.");
            a(false);
            return;
        }
        android.content.Context context = this.f402219d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f.class);
        intent.putExtra("addContactScene", 35);
        intent.putExtra("fromScene", this.f402223h);
        intent.putExtra("keyword", this.f402220e);
        intent.putExtra("businessType", this.f402221f);
        intent.putExtra("offset", this.f402222g);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f402224i);
        intent.putExtra("showEditText", this.f402225m);
        try {
            intent.putExtra("result", qpVar.mo14344x5f01b1f6());
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            a(true);
        } catch (java.lang.Exception e17) {
            a(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BrandService.BrandServiceLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
