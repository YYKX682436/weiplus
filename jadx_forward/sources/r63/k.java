package r63;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final r63.k f474554d = new r63.k();

    public k() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
        if (systemService instanceof android.os.PowerManager) {
            return (android.os.PowerManager) systemService;
        }
        return null;
    }
}
