package e04;

/* loaded from: classes15.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f327450a;

    /* renamed from: b, reason: collision with root package name */
    public long f327451b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f327452c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f327453d;

    /* renamed from: e, reason: collision with root package name */
    public long f327454e;

    /* renamed from: f, reason: collision with root package name */
    public long f327455f;

    /* renamed from: g, reason: collision with root package name */
    public long f327456g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f327457h;

    public f1(java.lang.Boolean bool, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bool = (i17 & 1) != 0 ? null : bool;
        j17 = (i17 & 2) != 0 ? -1L : j17;
        this.f327450a = bool;
        this.f327451b = j17;
        this.f327454e = -1L;
        this.f327455f = -1L;
        this.f327456g = -1L;
    }

    /* renamed from: toString */
    public java.lang.String mo126570x9616526c() {
        return "taskCalled: " + this.f327450a + ", cost: " + this.f327451b + ", threadScheduleCost: " + this.f327454e + ", startCallTimestamp: " + this.f327455f + ", taskFinishTimestamp: " + this.f327456g + ", hasException: " + this.f327452c + ", updated: " + this.f327453d;
    }
}
