package et5;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f338203a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f338204b;

    public static final void a(yz5.a aVar) {
        java.lang.Boolean bool = f338203a;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanSoLoader", "loadQBarSo loaded success already");
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        try {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            fp.d0.n("XNet");
            fp.d0.n("opencv_world");
            fp.d0.n("QBar");
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AffScanSoLoader", th6, "loadQBarSo exception", new java.lang.Object[0]);
            bool2 = java.lang.Boolean.FALSE;
        }
        f338203a = bool2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanSoLoader", "loadQBarSo soLoaded: " + f338203a);
    }
}
