package o72;

/* loaded from: classes12.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f424996a;

    /* renamed from: b, reason: collision with root package name */
    public final long f424997b;

    /* renamed from: c, reason: collision with root package name */
    public final int f424998c;

    /* renamed from: d, reason: collision with root package name */
    public int f424999d;

    /* renamed from: e, reason: collision with root package name */
    public int f425000e;

    /* renamed from: f, reason: collision with root package name */
    public final long f425001f;

    /* renamed from: g, reason: collision with root package name */
    public int f425002g;

    /* renamed from: h, reason: collision with root package name */
    public int f425003h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f425004i = -1;

    public t2(dm.n3 n3Var) {
        r45.jq0 jq0Var;
        int i17 = n3Var.f67657x2262335f;
        this.f424996a = i17;
        this.f424997b = n3Var.f67643xc8a07680;
        r45.bq0 bq0Var = n3Var.f67640x5ab01132;
        if (bq0Var != null && (jq0Var = bq0Var.f452495d) != null) {
            this.f424998c = jq0Var.f459567d;
        }
        this.f425001f = n3Var.f67659xa783a79b;
        java.util.Map map = o72.v2.f425035a;
        this.f425000e = i17 == 8 ? 1 : i17 == 5 ? (bq0Var == null || bq0Var.K == null) ? 3 : 2 : 0;
    }

    /* renamed from: toString */
    public java.lang.String m150791x9616526c() {
        return java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(this.f424996a), 0, java.lang.Long.valueOf(this.f424997b), "", java.lang.Integer.valueOf(this.f424998c), 0, java.lang.Integer.valueOf(this.f424999d), 0, 0, 0, java.lang.Integer.valueOf(this.f425000e), java.lang.Long.valueOf(this.f425001f), java.lang.Integer.valueOf(this.f425002g), java.lang.Integer.valueOf(this.f425003h), java.lang.Integer.valueOf(this.f425004i));
    }
}
