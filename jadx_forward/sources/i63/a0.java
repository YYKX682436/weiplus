package i63;

/* loaded from: classes7.dex */
public class a0 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f370502a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(i63.b0 b0Var, android.os.Handler handler) {
        super(handler);
        this.f370502a = b0Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        i63.b0 b0Var = this.f370502a;
        int streamVolume = b0Var.f370513p.getStreamVolume(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "user vol changed old:%d new:%d max:%d", java.lang.Integer.valueOf(b0Var.f370515r), java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(b0Var.f370514q));
        b0Var.f370515r = streamVolume;
    }
}
