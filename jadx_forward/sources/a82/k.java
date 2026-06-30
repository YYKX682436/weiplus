package a82;

/* loaded from: classes12.dex */
public final class k implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.t f83582e;

    public k(java.lang.String str, p3325xe03a0797.p3326xc267989b.y0 y0Var, a82.t tVar) {
        this.f83581d = str;
        this.f83582e = tVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancelTask " + n1Var.f152636a + ' ' + n1Var.f152637b + ' ' + n1Var.f152638c);
        o72.e2 e2Var = (o72.e2) dm.j3.t0(this.f83581d).o(c82.e.d() ? c82.e.f121201a.c() : c82.e.f121201a.a(), o72.e2.class);
        if (e2Var != null) {
            this.f83582e.T6(e2Var);
        } else {
            dn.m mVar = n1Var.f152639d;
            if (mVar != null) {
                com.p314xaae8f345.mm.vfs.w6.f(mVar.f69595x6d25b0d9);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancel task delete temp file " + mVar.f69595x6d25b0d9);
            }
        }
        return jz5.f0.f384359a;
    }
}
