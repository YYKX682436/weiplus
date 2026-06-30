package zh1;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 f554433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.n f554434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f554436g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554437h;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var, zh1.n nVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f554433d = h6Var;
        this.f554434e = nVar;
        this.f554435f = str;
        this.f554436g = i17;
        this.f554437h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, launch appBrand");
        zh1.n nVar = this.f554434e;
        android.content.Context context = nVar.f554445d;
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = this.f554435f;
        b1Var.f398549c = this.f554436g;
        b1Var.f398555f = this.f554437h;
        b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.r0.f34312x366c91de;
        java.lang.String mimeType = nVar.f554447f.f167782d.f167802d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mimeType, "mimeType");
        java.lang.String materialPath = nVar.f554447f.f167782d.f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        b1Var.f398561i = new bi1.e(mimeType, materialPath, null, 0, 12, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) this.f554433d).bj(context, b1Var);
        ai1.p pVar = ai1.p.f86635b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel = nVar.f554447f.f167782d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialModel, "materialModel");
        ((ku5.t0) ku5.t0.f394148d).k(new ai1.o(materialModel), 5000L);
    }
}
