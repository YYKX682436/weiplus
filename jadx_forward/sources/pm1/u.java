package pm1;

/* loaded from: classes14.dex */
public final class u extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f438375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pm1.w f438376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f438377f;

    public u(java.util.HashMap hashMap, pm1.w wVar, int i17) {
        this.f438375d = hashMap;
        this.f438376e = wVar;
        this.f438377f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.w wVar = this.f438376e;
        java.util.HashMap hashMap = wVar.f438382d;
        java.util.HashMap hashMap2 = this.f438375d;
        boolean z17 = hashMap2 == hashMap;
        int i17 = this.f438377f;
        android.media.AudioManager audioManager = wVar.f438381c;
        int streamMaxVolume = z17 ? audioManager.getStreamMaxVolume(i17) : audioManager.getStreamVolume(i17);
        hashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(streamMaxVolume));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f438379a, "update volume value=" + streamMaxVolume + ", type=" + i17 + ", isMax=" + z17);
    }
}
