package zh1;

/* loaded from: classes8.dex */
public final class d implements fi1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f554403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zh1.n f554404b;

    public d(yz5.q qVar, zh1.n nVar) {
        this.f554403a = qVar;
        this.f554404b = nVar;
    }

    public void a(java.lang.String appId, int i17, java.lang.String enterPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21) this.f554403a.mo147xb9724478(appId, java.lang.Integer.valueOf(i17), enterPath);
        if (c12474x8b872a21 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "onWeAppExposure#buildHybridBottomSheet, openMaterialModel is null");
            return;
        }
        ((di1.f) this.f554404b.f554449h).g(c12474x8b872a21.f167788d);
    }
}
