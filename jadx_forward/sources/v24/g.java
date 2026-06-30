package v24;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.g f514451a = new v24.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f514452b = jz5.h.b(v24.f.f514449d);

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f514453c;

    public final java.lang.String a() {
        java.lang.String str = f514453c;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = f514453c;
            return str2 == null ? "" : str2;
        }
        if (gm0.j1.a()) {
            f514453c = gm0.j1.b().j();
        }
        java.lang.String str3 = f514453c;
        return str3 == null ? "" : str3;
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("LocalGenFinishSuccess").putBoolean("LocalGenFinishSuccess".concat(a()), z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ColorfulQRConfig", "saveLocalGenFlag: " + z17);
    }
}
