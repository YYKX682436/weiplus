package ah4;

/* loaded from: classes13.dex */
public class t extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ah4.y f86548h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ah4.y yVar, long j17, java.lang.Integer num) {
        super(j17, num);
        this.f86548h = yVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        int a17 = wo.r.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomEngineProxy", "initLive cpuFlag: %d", java.lang.Integer.valueOf(a17));
        int m71574xffc821c = this.f86548h.f86564e.m71574xffc821c(a17, lp0.b.X() + "lib/");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomEngineProxy", "initLive %d ", java.lang.Integer.valueOf(m71574xffc821c));
        return java.lang.Integer.valueOf(m71574xffc821c);
    }
}
