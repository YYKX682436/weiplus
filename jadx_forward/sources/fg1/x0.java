package fg1;

/* loaded from: classes7.dex */
public final class x0 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f343450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context, android.os.Handler handler) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f343450a = (android.media.AudioManager) systemService;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingsContentObserver", "Volume now " + this.f343450a.getStreamVolume(3));
    }
}
