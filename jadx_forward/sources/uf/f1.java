package uf;

/* loaded from: classes7.dex */
public final class f1 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f508556a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context, android.os.Handler handler) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        this.f508556a = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        android.media.AudioManager audioManager = this.f508556a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "Volume now " + (audioManager != null ? java.lang.Integer.valueOf(audioManager.getStreamVolume(3)) : null));
    }
}
