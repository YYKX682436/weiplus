package ae2;

/* loaded from: classes3.dex */
public final class jg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.jg f85491d = new ae2.jg();

    public jg() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(1, "付费回放付费后是否重新进房", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_live_replay_restart_after_pay, false, 2, null);
        aVar.a("FINDER_LIVE_REPLAY_RESTART_AFTER_PAY", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
