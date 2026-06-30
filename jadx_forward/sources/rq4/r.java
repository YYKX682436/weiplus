package rq4;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f480626a;

    /* renamed from: b, reason: collision with root package name */
    public int f480627b;

    /* renamed from: c, reason: collision with root package name */
    public int f480628c;

    /* renamed from: d, reason: collision with root package name */
    public int f480629d;

    /* renamed from: e, reason: collision with root package name */
    public long f480630e;

    public r(int i17, int i18, int i19, int i27, long j17, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        j17 = (i28 & 16) != 0 ? 0L : j17;
        this.f480626a = i17;
        this.f480627b = i18;
        this.f480628c = i19;
        this.f480629d = i27;
        this.f480630e = j17;
    }

    /* renamed from: equals */
    public boolean m162932xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq4.r)) {
            return false;
        }
        rq4.r rVar = (rq4.r) obj;
        return this.f480626a == rVar.f480626a && this.f480627b == rVar.f480627b && this.f480628c == rVar.f480628c && this.f480629d == rVar.f480629d && this.f480630e == rVar.f480630e;
    }

    /* renamed from: hashCode */
    public int m162933x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f480626a) * 31) + java.lang.Integer.hashCode(this.f480627b)) * 31) + java.lang.Integer.hashCode(this.f480628c)) * 31) + java.lang.Integer.hashCode(this.f480629d)) * 31) + java.lang.Long.hashCode(this.f480630e);
    }

    /* renamed from: toString */
    public java.lang.String m162934x9616526c() {
        return "FloatCardReportData(dismissCalled=" + this.f480626a + ", viewRemoved=" + this.f480627b + ", showCallType=" + this.f480628c + ", permissionStatus=" + this.f480629d + ", duration=" + this.f480630e + ')';
    }
}
