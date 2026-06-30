package eu2;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final eu2.l f338332d = new eu2.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("keyguard");
        if (systemService instanceof android.app.KeyguardManager) {
            return (android.app.KeyguardManager) systemService;
        }
        return null;
    }
}
