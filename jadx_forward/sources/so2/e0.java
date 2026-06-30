package so2;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public long f491854a;

    /* renamed from: b, reason: collision with root package name */
    public long f491855b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f491856c;

    public e0(long j17, long j18, java.lang.String remindFinderList, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        remindFinderList = (i17 & 4) != 0 ? "" : remindFinderList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remindFinderList, "remindFinderList");
        this.f491854a = j17;
        this.f491855b = j18;
        this.f491856c = remindFinderList;
    }

    /* renamed from: equals */
    public boolean m164865xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.e0)) {
            return false;
        }
        so2.e0 e0Var = (so2.e0) obj;
        return this.f491854a == e0Var.f491854a && this.f491855b == e0Var.f491855b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491856c, e0Var.f491856c);
    }

    /* renamed from: hashCode */
    public int m164866x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f491854a) * 31) + java.lang.Long.hashCode(this.f491855b)) * 31) + this.f491856c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164867x9616526c() {
        return "FinderCommentAtReportData(clickChooseFinderCnt=" + this.f491854a + ", inputFinderCnt=" + this.f491855b + ", remindFinderList=" + this.f491856c + ')';
    }
}
