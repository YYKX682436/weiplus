package w21;

/* loaded from: classes14.dex */
public class c0 implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Future f523837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f523838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w21.a0 f523839c;

    public c0(w21.a0 a0Var, java.util.concurrent.Future future, java.lang.Runnable runnable) {
        this.f523839c = a0Var;
        this.f523837a = future;
        this.f523838b = runnable;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(android.media.AudioTrack audioTrack) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "onMarkerReached: ");
        java.util.concurrent.Future future = this.f523837a;
        if (future != null && !future.cancel(false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "onMarkerReached: reached too late");
            return;
        }
        java.util.concurrent.Future future2 = this.f523839c.f523829e.G;
        if (future2 != null && !future2.isDone()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "has uncomplete task");
        }
        this.f523839c.f523829e.C = null;
        this.f523839c.f523829e.B = false;
        this.f523839c.f523829e.G = ((ku5.t0) ku5.t0.f394148d).g(this.f523838b);
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioTrack audioTrack) {
    }
}
