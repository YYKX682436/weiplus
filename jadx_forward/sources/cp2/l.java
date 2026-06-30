package cp2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f302367a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.dd2 f302368b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f302369c;

    /* renamed from: d, reason: collision with root package name */
    public final int f302370d;

    /* renamed from: e, reason: collision with root package name */
    public final int f302371e;

    /* renamed from: f, reason: collision with root package name */
    public final int f302372f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f302373g;

    /* renamed from: h, reason: collision with root package name */
    public final int f302374h;

    /* renamed from: i, reason: collision with root package name */
    public final long f302375i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f302376j;

    /* renamed from: k, reason: collision with root package name */
    public final int f302377k;

    public l(int i17, r45.dd2 dd2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, int i19, int i27, java.lang.String by_pass, int i28, long j17, java.lang.String str, int i29, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        dd2Var = (i37 & 2) != 0 ? null : dd2Var;
        gVar = (i37 & 4) != 0 ? null : gVar;
        by_pass = (i37 & 64) != 0 ? "" : by_pass;
        i28 = (i37 & 128) != 0 ? 0 : i28;
        j17 = (i37 & 256) != 0 ? 0L : j17;
        str = (i37 & 512) != 0 ? null : str;
        i29 = (i37 & 1024) != 0 ? -1 : i29;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(by_pass, "by_pass");
        this.f302367a = i17;
        this.f302368b = dd2Var;
        this.f302369c = gVar;
        this.f302370d = i18;
        this.f302371e = i19;
        this.f302372f = i27;
        this.f302373g = by_pass;
        this.f302374h = i28;
        this.f302375i = j17;
        this.f302376j = str;
        this.f302377k = i29;
    }

    /* renamed from: toString */
    public java.lang.String m122377x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pullType:");
        sb6.append(this.f302367a);
        sb6.append("  tabId:");
        r45.dd2 dd2Var = this.f302368b;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : null);
        sb6.append(" tabName:");
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        sb6.append(" lastBuffer:");
        sb6.append(this.f302369c);
        sb6.append(" memoryCacheFlag:");
        sb6.append(this.f302370d);
        sb6.append(" tabType:");
        sb6.append(this.f302371e);
        sb6.append(" commentScene:");
        sb6.append(this.f302372f);
        sb6.append(" subTabIndex: ");
        sb6.append(this.f302377k);
        sb6.append(" relatedObjectId:");
        sb6.append(this.f302375i);
        return sb6.toString();
    }
}
