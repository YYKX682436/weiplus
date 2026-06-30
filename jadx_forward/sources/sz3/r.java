package sz3;

/* loaded from: classes15.dex */
public final class r implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.w f495639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f495640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f495641g;

    public r(sz3.c1 c1Var, sz3.w wVar, sz3.x0 x0Var, yz5.l lVar) {
        this.f495638d = c1Var;
        this.f495639e = wVar;
        this.f495640f = x0Var;
        this.f495641g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.c1 c1Var = this.f495638d;
        sz3.a1 a17 = c1Var != null ? c1Var.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = a17 != null ? a17.f495492a : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAddScanProductResultForFullImage source: ");
        sb6.append(c1Var != null ? java.lang.Integer.valueOf(c1Var.f495507a) : null);
        sb6.append(", session: ");
        sb6.append(c1Var != null ? java.lang.Long.valueOf(c1Var.f495508b) : null);
        sb6.append(", trackId: ");
        sb6.append(c17282x335f2f60 != null ? java.lang.Integer.valueOf(c17282x335f2f60.getId()) : null);
        sb6.append(", scanProductInfo: %s");
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = c17282x335f2f60 != null ? java.lang.Integer.valueOf(c17282x335f2f60.hashCode()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewAiImageHandler", sb7, objArr);
        yz5.l lVar = this.f495641g;
        if (c17282x335f2f60 == null) {
            vz3.t.f523243a.j();
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        vz3.t.f523243a.m();
        int id6 = c17282x335f2f60.getId();
        sz3.w wVar = this.f495639e;
        if (wVar.e(id6)) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        } else if (wVar.j(c1Var, this.f495640f)) {
            wVar.d(c17282x335f2f60.getId());
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewAiImageHandler", "onAddScanProductResultForFullImage addScanProduct failed");
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
