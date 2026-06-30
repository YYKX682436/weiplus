package pk3;

/* loaded from: classes8.dex */
public final class d implements kk3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk3.e f437973a;

    public d(pk3.e eVar) {
        this.f437973a = eVar;
    }

    @Override // kk3.e
    /* renamed from: onOrientationChange */
    public void mo141067x15072581(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        pk3.e eVar = this.f437973a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "whenOrientationChange new:%d, last:%d", valueOf, java.lang.Integer.valueOf(eVar.f437976c));
        if (eVar.f437976c == i17) {
            return;
        }
        eVar.f437976c = i17;
    }
}
