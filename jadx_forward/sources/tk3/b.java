package tk3;

/* loaded from: classes8.dex */
public final class b implements kk3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk3.d f501443a;

    public b(tk3.d dVar) {
        this.f501443a = dVar;
    }

    @Override // kk3.e
    /* renamed from: onOrientationChange */
    public void mo141067x15072581(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        tk3.d dVar = this.f501443a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "whenOrientationChange new:%d, last:%d", valueOf, java.lang.Integer.valueOf(dVar.f501447b));
        if (dVar.f501447b == i17) {
            return;
        }
        dVar.f501447b = i17;
    }
}
