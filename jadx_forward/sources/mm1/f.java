package mm1;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mm1.f f410192d = new mm1.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (android.os.Build.VERSION.SDK_INT >= 31 && fp.e0.i()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!o45.wf.f424566k && !j62.e.g().l("clicfg_xiaomi_audio_manager_cache", false, true, true)) {
                return java.lang.Boolean.FALSE;
            }
            pm1.e.f438347e.a();
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
