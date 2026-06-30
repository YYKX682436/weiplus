package a82;

/* loaded from: classes4.dex */
public final class d2 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f83518d;

    public d2(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f83518d = qVar;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public final void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavResourceDownloadPreCheckHelper", "requestVideoDownloadCtx onGYNetEnd: errType=%d, errCode=%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        p3325xe03a0797.p3326xc267989b.q qVar = this.f83518d;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavResourceDownloadPreCheckHelper", "requestVideoDownloadCtx CGI failed: errType=%d, errCode=%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        r45.uf3 uf3Var = fVar instanceof r45.uf3 ? (r45.uf3) fVar : null;
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(uf3Var));
        }
    }
}
