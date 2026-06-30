package ae2;

/* loaded from: classes3.dex */
public final class hg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.hg f3655d = new ae2.hg();

    public hg() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播回放是否允许弹幕", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_live_replay_bullet_enable, false, 2, null);
        aVar.a("FINDER_LIVE_REPLAY_BULLET_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
