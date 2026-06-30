package cz3;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz3.c f306558d = new cz3.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_scan_crash_protect_enable, 1) == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFileCrashManager", "crashProtect enable: " + valueOf.booleanValue());
        return valueOf;
    }
}
