package e11;

/* loaded from: classes15.dex */
public class a implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public long f327882d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f327883e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f327884f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f327885g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f327886h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f327887i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f327888m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f327889n = 0;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17;
        e11.a aVar = (e11.a) obj;
        long j18 = this.f327882d;
        if (j18 != 0) {
            long j19 = aVar.f327882d;
            if (j19 != 0) {
                j17 = j18 - j19;
                return (int) j17;
            }
        }
        j17 = this.f327883e - aVar.f327883e;
        return (int) j17;
    }

    /* renamed from: toString */
    public java.lang.String m126699x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f327885g;
        if (i17 == 0) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,[mm] pid:%s,normal execute:%s", e11.b.c(this.f327882d), e11.b.c(this.f327883e), e11.b.c(this.f327884f), java.lang.Integer.valueOf(this.f327886h), java.lang.Boolean.valueOf(this.f327888m)));
        } else if (i17 == 1) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,[push] pid:%s,network:%s,normal execute:%s", e11.b.c(this.f327882d), e11.b.c(this.f327883e), e11.b.c(this.f327884f), java.lang.Integer.valueOf(this.f327886h), java.lang.Integer.valueOf(this.f327887i), java.lang.Boolean.valueOf(this.f327888m)));
        } else if (i17 == 2) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,send broadcast type(push):%s", e11.b.c(this.f327882d), e11.b.c(this.f327883e), e11.b.c(this.f327884f), java.lang.Integer.valueOf(this.f327889n)));
        } else if (i17 == 3) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,receive broadcast type(mm):%s", e11.b.c(this.f327882d), e11.b.c(this.f327883e), e11.b.c(this.f327884f), java.lang.Integer.valueOf(this.f327889n)));
        } else if (i17 == 4) {
            sb6.append(java.lang.String.format("server time:%s,local start time:%s,local end time:%s,delayed msg pid:%s, msg server time:%s,interval time:%s, msg server id:%s, %s", e11.b.c(this.f327882d), e11.b.c(this.f327883e), e11.b.c(this.f327884f), java.lang.Integer.valueOf(this.f327886h), e11.b.c(0L), 0L, 0L, "background"));
        }
        sb6.append("\n");
        return sb6.toString();
    }
}
