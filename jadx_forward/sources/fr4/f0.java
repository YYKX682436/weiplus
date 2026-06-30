package fr4;

/* loaded from: classes8.dex */
public final class f0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr4.e f347352a;

    public f0(gr4.e eVar) {
        this.f347352a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p944x882e457a.n nVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = (nVar = oVar.f152244b).f152233a) != null && (fVar instanceof r45.ij3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[requestSessionInfo] session info request success");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = nVar.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMsgSessionInfoResp");
            this.f347352a.a((r45.ij3) fVar2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "[requestSessionInfo] session info request failed: errType=" + i17 + ", errCode=" + i18);
    }
}
