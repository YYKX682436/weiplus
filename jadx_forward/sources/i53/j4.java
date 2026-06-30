package i53;

/* loaded from: classes8.dex */
public final class j4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q33.d f370154a;

    public j4(q33.d dVar) {
        this.f370154a = dVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        if (i17 == 0 && i18 == 0 && oVar != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.videougc.ReportLocalWxagVideoResponse");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniGameVideoProcessor", "gamelog.report , manage video , reportlocalwxagvideo reso RET = " + ((q33.e) fVar).f441476d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MiniGameVideoProcessor", "gamelog.report , manage video , reportlocalwxagvideo, doReportCgi failed errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + "  op = " + this.f370154a.f441474d);
    }
}
