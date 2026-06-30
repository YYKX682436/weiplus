package xm1;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm1.h f536696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f536697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f536698f;

    public f(xm1.h hVar, int i17, yz5.a aVar) {
        this.f536696d = hVar;
        this.f536697e = i17;
        this.f536698f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xm1.h hVar = this.f536696d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hVar.f());
        int i17 = this.f536697e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAudioManager", "set mode from %d to %d", valueOf, java.lang.Integer.valueOf(i17));
        hVar.c().setMode(i17);
        yz5.a aVar = this.f536698f;
        if (aVar != null) {
        }
    }
}
