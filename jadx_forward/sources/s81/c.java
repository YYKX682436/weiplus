package s81;

/* loaded from: classes7.dex */
public class c extends dm.l0 implements qj1.d {
    public static final l75.e0 A;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f486260z;

    static {
        java.lang.String[] strArr = {"appId", "version", "packageType", "packageKey"};
        f486260z = strArr;
        l75.e0 m125186x3593deb = dm.l0.m125186x3593deb(dm.l0.class);
        A = m125186x3593deb;
        m125186x3593deb.f398489e += qj1.c.a(strArr);
    }

    @Override // dm.l0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f486260z;
    }
}
