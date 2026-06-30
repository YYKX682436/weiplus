package ua1;

/* loaded from: classes7.dex */
public class e extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ua1.f f507486a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ua1.f fVar, android.os.Handler handler) {
        super(handler);
        this.f507486a = fVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        ua1.f fVar = this.f507486a;
        int streamVolume = fVar.f507490d.getStreamVolume(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordAudioLogic", "user vol changed old:%d new:%d max:%d", java.lang.Integer.valueOf(fVar.f507492f), java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(fVar.f507491e));
        fVar.f507492f = streamVolume;
    }
}
