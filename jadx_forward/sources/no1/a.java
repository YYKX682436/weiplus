package no1;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final no1.a f420267d = new no1.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start: ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174258g == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.RoamForegroundService", sb6.toString());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174258g == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174258g = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.class);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startForegroundService(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174258g);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174258g);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MircoMsg.RoamForegroundService", "already started");
        }
        return jz5.f0.f384359a;
    }
}
