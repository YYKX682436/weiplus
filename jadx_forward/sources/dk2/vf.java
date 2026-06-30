package dk2;

/* loaded from: classes3.dex */
public final class vf {

    /* renamed from: a, reason: collision with root package name */
    public final r45.lq1 f315783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f315784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f315785c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.mq1 f315786d;

    public vf(r45.lq1 lq1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        this.f315783a = lq1Var;
        this.f315784b = lq1Var != null ? lq1Var.m75939xb282bd08(1) : 0;
        this.f315785c = lq1Var != null ? lq1Var.m75939xb282bd08(0) : 0;
        r45.mq1 mq1Var = new r45.mq1();
        byte[] g17 = (lq1Var == null || (m75934xbce7f2f = lq1Var.m75934xbce7f2f(2)) == null) ? null : m75934xbce7f2f.g();
        if (g17 != null) {
            try {
                mq1Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            this.f315786d = mq1Var;
        }
        mq1Var = null;
        this.f315786d = mq1Var;
    }
}
