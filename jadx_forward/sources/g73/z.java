package g73;

/* loaded from: classes15.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.z f350876d = new g73.z();

    public z() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "onAppForeground");
        g73.o0.f350851n = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "onAppForeground, send alllist");
        if (!g73.o0.f350850m.f158886f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "webwx is offline, do not sync!");
        }
        return jz5.f0.f384359a;
    }
}
