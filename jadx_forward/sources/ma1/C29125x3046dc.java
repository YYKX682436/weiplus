package ma1;

/* renamed from: ma1.i$$e */
/* loaded from: classes7.dex */
public final /* synthetic */ class C29125x3046dc implements ta1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma1.i f406711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f406712b;

    public /* synthetic */ C29125x3046dc(ma1.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f406711a = iVar;
        this.f406712b = c0Var;
    }

    public final void a(long j17) {
        ma1.i iVar = this.f406711a;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: relative ticks in ms: %d", java.lang.Long.valueOf(j17));
        ma1.a aVar = iVar.f406698g;
        aVar.u(this.f406712b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch stamp change: %d", java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("state", "timeUpdate");
        hashMap.put("currentTime", java.lang.Long.valueOf(j17));
        aVar.t(hashMap);
        aVar.m();
    }
}
