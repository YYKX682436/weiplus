package ae2;

/* loaded from: classes3.dex */
public final class wk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.wk f4273d = new ae2.wk();

    public wk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(100000, "心愿单单个礼物上限", null, null, 12, null);
        aVar.a("FINDER_LIVE_WISH_MAX_SIZE", kz5.c0.i(99999, 999999, 9999999), kz5.c0.i("99999", "99999", "9999999"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_wish_max_size, false, 2, null);
        return aVar;
    }
}
