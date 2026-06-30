package a82;

/* loaded from: classes12.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.t f2049e;

    public k(java.lang.String str, kotlinx.coroutines.y0 y0Var, a82.t tVar) {
        this.f2048d = str;
        this.f2049e = tVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.modelcdntran.n1 n1Var = (com.tencent.mm.modelcdntran.n1) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancelTask " + n1Var.f71103a + ' ' + n1Var.f71104b + ' ' + n1Var.f71105c);
        o72.e2 e2Var = (o72.e2) dm.j3.t0(this.f2048d).o(c82.e.d() ? c82.e.f39668a.c() : c82.e.f39668a.a(), o72.e2.class);
        if (e2Var != null) {
            this.f2049e.T6(e2Var);
        } else {
            dn.m mVar = n1Var.f71106d;
            if (mVar != null) {
                com.tencent.mm.vfs.w6.f(mVar.field_fullpath);
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancel task delete temp file " + mVar.field_fullpath);
            }
        }
        return jz5.f0.f302826a;
    }
}
