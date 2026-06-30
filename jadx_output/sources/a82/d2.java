package a82;

/* loaded from: classes4.dex */
public final class d2 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f1985d;

    public d2(kotlinx.coroutines.q qVar) {
        this.f1985d = qVar;
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavResourceDownloadPreCheckHelper", "requestVideoDownloadCtx onGYNetEnd: errType=%d, errCode=%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        kotlinx.coroutines.q qVar = this.f1985d;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavResourceDownloadPreCheckHelper", "requestVideoDownloadCtx CGI failed: errType=%d, errCode=%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            if (((kotlinx.coroutines.r) qVar).n()) {
                qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        r45.uf3 uf3Var = fVar instanceof r45.uf3 ? (r45.uf3) fVar : null;
        if (((kotlinx.coroutines.r) qVar).n()) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(uf3Var));
        }
    }
}
