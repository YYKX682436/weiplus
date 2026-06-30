package zv1;

/* loaded from: classes15.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final zv1.a0 f557802a;

    /* renamed from: b, reason: collision with root package name */
    public final zv1.p f557803b;

    /* renamed from: c, reason: collision with root package name */
    public final long f557804c;

    /* renamed from: d, reason: collision with root package name */
    public final long f557805d;

    /* renamed from: e, reason: collision with root package name */
    public final long f557806e;

    /* renamed from: f, reason: collision with root package name */
    public final long f557807f;

    /* renamed from: g, reason: collision with root package name */
    public final long f557808g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f557809h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f557810i;

    public b0(zv1.a0 cleanParams, zv1.p result, long j17, long j18, long j19, long j27, long j28, java.util.Map allocation, java.util.List cleanerResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cleanParams, "cleanParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allocation, "allocation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cleanerResults, "cleanerResults");
        this.f557802a = cleanParams;
        this.f557803b = result;
        this.f557804c = j17;
        this.f557805d = j18;
        this.f557806e = j19;
        this.f557807f = j27;
        this.f557808g = j28;
        this.f557809h = allocation;
        this.f557810i = cleanerResults;
    }

    /* renamed from: equals */
    public boolean m179730xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.b0)) {
            return false;
        }
        zv1.b0 b0Var = (zv1.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557802a, b0Var.f557802a) && this.f557803b == b0Var.f557803b && this.f557804c == b0Var.f557804c && this.f557805d == b0Var.f557805d && this.f557806e == b0Var.f557806e && this.f557807f == b0Var.f557807f && this.f557808g == b0Var.f557808g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557809h, b0Var.f557809h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557810i, b0Var.f557810i);
    }

    /* renamed from: hashCode */
    public int m179731x8cdac1b() {
        return (((((((((((((((this.f557802a.m179721x8cdac1b() * 31) + this.f557803b.hashCode()) * 31) + java.lang.Long.hashCode(this.f557804c)) * 31) + java.lang.Long.hashCode(this.f557805d)) * 31) + java.lang.Long.hashCode(this.f557806e)) * 31) + java.lang.Long.hashCode(this.f557807f)) * 31) + java.lang.Long.hashCode(this.f557808g)) * 31) + this.f557809h.hashCode()) * 31) + this.f557810i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179732x9616526c() {
        return "CleanTaskReportData(cleanParams=" + this.f557802a + ", result=" + this.f557803b + ", cacheTotalSize=" + this.f557804c + ", expectCleanSize=" + this.f557805d + ", actualCleanSize=" + this.f557806e + ", exemptCleanSize=" + this.f557807f + ", duration=" + this.f557808g + ", allocation=" + this.f557809h + ", cleanerResults=" + this.f557810i + ')';
    }

    public /* synthetic */ b0(zv1.a0 a0Var, zv1.p pVar, long j17, long j18, long j19, long j27, long j28, java.util.Map map, java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(a0Var, pVar, (i17 & 4) != 0 ? 0L : j17, (i17 & 8) != 0 ? 0L : j18, (i17 & 16) != 0 ? 0L : j19, (i17 & 32) != 0 ? 0L : j27, (i17 & 64) != 0 ? 0L : j28, (i17 & 128) != 0 ? kz5.q0.f395534d : map, (i17 & 256) != 0 ? kz5.p0.f395529d : list);
    }
}
