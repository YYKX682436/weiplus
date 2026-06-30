package yn1;

/* loaded from: classes11.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.e0 f545178d = new yn1.e0();

    public e0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174082g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174082g = false;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.Object systemService = context.getSystemService("notification");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((android.app.NotificationManager) systemService).cancel(539298096);
        }
        return jz5.f0.f384359a;
    }
}
