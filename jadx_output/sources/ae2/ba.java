package ae2;

/* loaded from: classes3.dex */
public final class ba extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ba f3500d = new ae2.ba();

    public ba() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "礼物时长上限(秒)", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_gift_anim_duration, false, 2, null);
        aVar.a("FINDER_LIVE_GIFT_ANIM_STAY_DURATION", kz5.c0.i(3, 1, 10, 30), kz5.c0.i("3秒", "1秒", "10秒", "30秒"));
        aVar.f317745p = "T32";
        return aVar;
    }
}
