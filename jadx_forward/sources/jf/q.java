package jf;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final jf.q f380875a = new jf.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f380876b = jz5.h.b(jf.p.f380874d);

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f380876b).mo141623x754a37bb();
    }

    public final void b(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        a().putInt("SwitchRenderLogic#".concat(appId), i17);
    }

    public final void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwitchRenderLogic", "setDeafultMode:" + i17);
        a().putInt("SwitchRenderLogic#Default", i17);
    }
}
