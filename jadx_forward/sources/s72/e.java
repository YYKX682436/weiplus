package s72;

/* loaded from: classes11.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f485551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        super(1);
        this.f485551d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s72.a it = (s72.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doScene] errorType = ");
        int i17 = it.f485515a;
        sb6.append(i17);
        sb6.append(", errorCode = ");
        int i18 = it.f485516b;
        sb6.append(i18);
        sb6.append(", errorMsg = ");
        java.lang.String str = it.f485517c;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncRequestWrapper", sb6.toString());
        boolean z17 = i17 == 0 && i18 == 0;
        if (((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).f83546f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncRequestWrapper", "[doScene] sending item, return");
        } else {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f485551d;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncRequestWrapper", "[doScene] favSync cgi success");
                p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) qVar;
                if (rVar.n()) {
                    com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = it.f485518d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavSyncResponse");
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((r45.lq0) fVar));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSyncRequestWrapper", "[doScene] favsync cgi fail, error type = " + i17 + ", errorCode = " + i18);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new s72.b("/cgi-bin/micromsg-bin/favsync", i17, i18, str))));
            }
        }
        return jz5.f0.f384359a;
    }
}
