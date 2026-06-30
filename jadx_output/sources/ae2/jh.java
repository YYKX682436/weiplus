package ae2;

/* loaded from: classes3.dex */
public final class jh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.jh f3959d = new ae2.jh();

    public jh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否允许录屏", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_secure_switch, false, 2, null);
        aVar.a("FINDER_LIVE_SECURE_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
