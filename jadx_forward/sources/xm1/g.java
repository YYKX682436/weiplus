package xm1;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm1.h f536699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f536700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f536701f;

    public g(xm1.h hVar, int i17, yz5.a aVar) {
        this.f536699d = hVar;
        this.f536700e = i17;
        this.f536701f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xm1.h hVar = this.f536699d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hVar.f());
        int i17 = this.f536700e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAudioManager", "set mode from %d to %d", valueOf, java.lang.Integer.valueOf(i17));
        hVar.c().setMode(i17);
        yz5.a aVar = this.f536701f;
        if (aVar != null) {
        }
    }
}
