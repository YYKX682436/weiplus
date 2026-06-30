package ah4;

/* loaded from: classes13.dex */
public class t extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ah4.y f5015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ah4.y yVar, long j17, java.lang.Integer num) {
        super(j17, num);
        this.f5015h = yVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        int a17 = wo.r.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomEngineProxy", "initLive cpuFlag: %d", java.lang.Integer.valueOf(a17));
        int initLive = this.f5015h.f5031e.initLive(a17, lp0.b.X() + "lib/");
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomEngineProxy", "initLive %d ", java.lang.Integer.valueOf(initLive));
        return java.lang.Integer.valueOf(initLive);
    }
}
