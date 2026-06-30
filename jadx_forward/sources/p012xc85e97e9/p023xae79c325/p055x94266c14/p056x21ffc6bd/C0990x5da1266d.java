package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.ClientVersion */
/* loaded from: classes14.dex */
public class C0990x5da1266d {

    /* renamed from: sCurrent */
    private static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d f2424x508b7d86 = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d("1.4.0");

    /* renamed from: mVersion */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 f2425xb30dcfab;

    public C0990x5da1266d(java.lang.String str) {
        this.f2425xb30dcfab = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.m6721x6581ab3(str);
    }

    /* renamed from: getCurrentVersion */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d m6688xa4c95a15() {
        return f2424x508b7d86;
    }

    /* renamed from: isMaximumCompatibleVersion */
    public static boolean m6689x884246e(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8) {
        return m6688xa4c95a15().f2425xb30dcfab.m6723xabcba240(abstractC1001x782db4b8.mo6678x74cb5c03(), abstractC1001x782db4b8.mo6679x74cf0dff()) <= 0;
    }

    /* renamed from: isMinimumCompatibleVersion */
    public static boolean m6690x18d7a440(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8) {
        return m6688xa4c95a15().f2425xb30dcfab.m6723xabcba240(abstractC1001x782db4b8.mo6678x74cb5c03(), abstractC1001x782db4b8.mo6679x74cf0dff()) >= 0;
    }

    /* renamed from: setCurrentVersion */
    public static void m6691x6cbfc221(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d c0990x5da1266d) {
        f2424x508b7d86 = c0990x5da1266d;
    }

    /* renamed from: getVersion */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 m6692x52c258a2() {
        return this.f2425xb30dcfab;
    }

    /* renamed from: toVersionString */
    public java.lang.String m6693x462284e() {
        return this.f2425xb30dcfab.m6726x9616526c();
    }
}
