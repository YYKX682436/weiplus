package gi;

/* loaded from: classes.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final gi.c0 f353525d = new gi.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long l17 = mm.k.l(mm.k.f410054z, null, 1, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "setDeviceChargingApiMode: " + l17);
        if (l17 < 1) {
            l17 = 1;
        }
        if (l17 > 3) {
            l17 = 3;
        }
        return java.lang.Integer.valueOf((int) l17);
    }
}
