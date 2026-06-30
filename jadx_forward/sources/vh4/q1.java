package vh4;

@j95.b
/* loaded from: classes7.dex */
public final class q1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f518654d = android.provider.Settings.Secure.getUriFor("minors_mode_enabled");

    /* renamed from: e, reason: collision with root package name */
    public final android.database.ContentObserver f518655e = new vh4.p1();

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModePushService", "onCreate registerContentObserver");
        context.getContentResolver().registerContentObserver(this.f518654d, false, this.f518655e);
    }
}
