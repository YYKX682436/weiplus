package ae2;

/* loaded from: classes3.dex */
public final class ig extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ig f3680d = new ae2.ig();

    public ig() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "付费回放免费观看时长默认值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_live_replay_default_preview_duration, false, 2, null);
        aVar.a("FINDER_LIVE_REPLAY_DEFAULT_PREVIEW_DURATION", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
