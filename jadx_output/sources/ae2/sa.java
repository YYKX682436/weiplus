package ae2;

/* loaded from: classes3.dex */
public final class sa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.sa f4168d = new ae2.sa();

    public sa() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号直播助听模式开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_hearing_aid_mode_enable, false, 2, null);
        aVar.a("FINDER_LIVE_HEARING_AID_MODE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
