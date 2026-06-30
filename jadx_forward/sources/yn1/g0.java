package yn1;

/* loaded from: classes11.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.g0 f545204d = new yn1.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start: ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MigrationForegroundService", sb6.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.class);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startForegroundService(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MigrationForegroundService", "already started");
        }
        return jz5.f0.f384359a;
    }
}
