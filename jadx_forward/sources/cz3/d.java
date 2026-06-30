package cz3;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cz3.d f306559d = new cz3.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_scan_crash_valid_duration_seconds, 604800L);
        java.lang.Long valueOf = java.lang.Long.valueOf(Ui > 0 ? Ui : 604800L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFileCrashManager", "crashProtect crashValidDuration: " + valueOf.longValue());
        return valueOf;
    }
}
