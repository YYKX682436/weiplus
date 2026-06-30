package a5;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final a5.f f1384i = new a5.f(new a5.e());

    /* renamed from: a, reason: collision with root package name */
    public a5.b0 f1385a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1386b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1387c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1388d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1389e;

    /* renamed from: f, reason: collision with root package name */
    public long f1390f;

    /* renamed from: g, reason: collision with root package name */
    public long f1391g;

    /* renamed from: h, reason: collision with root package name */
    public a5.h f1392h;

    public f() {
        this.f1385a = a5.b0.NOT_REQUIRED;
        this.f1390f = -1L;
        this.f1391g = -1L;
        this.f1392h = new a5.h();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.f.class != obj.getClass()) {
            return false;
        }
        a5.f fVar = (a5.f) obj;
        if (this.f1386b == fVar.f1386b && this.f1387c == fVar.f1387c && this.f1388d == fVar.f1388d && this.f1389e == fVar.f1389e && this.f1390f == fVar.f1390f && this.f1391g == fVar.f1391g && this.f1385a == fVar.f1385a) {
            return this.f1392h.equals(fVar.f1392h);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f1385a.hashCode() * 31) + (this.f1386b ? 1 : 0)) * 31) + (this.f1387c ? 1 : 0)) * 31) + (this.f1388d ? 1 : 0)) * 31) + (this.f1389e ? 1 : 0)) * 31;
        long j17 = this.f1390f;
        int i17 = (hashCode + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f1391g;
        return ((i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31) + this.f1392h.hashCode();
    }

    public f(a5.e eVar) {
        a5.b0 b0Var = a5.b0.NOT_REQUIRED;
        this.f1385a = b0Var;
        this.f1390f = -1L;
        this.f1391g = -1L;
        this.f1392h = new a5.h();
        eVar.getClass();
        this.f1386b = false;
        this.f1387c = false;
        this.f1385a = b0Var;
        this.f1388d = false;
        this.f1389e = false;
        this.f1392h = eVar.f1383a;
        this.f1390f = -1L;
        this.f1391g = -1L;
    }

    public f(a5.f fVar) {
        this.f1385a = a5.b0.NOT_REQUIRED;
        this.f1390f = -1L;
        this.f1391g = -1L;
        this.f1392h = new a5.h();
        this.f1386b = fVar.f1386b;
        this.f1387c = fVar.f1387c;
        this.f1385a = fVar.f1385a;
        this.f1388d = fVar.f1388d;
        this.f1389e = fVar.f1389e;
        this.f1392h = fVar.f1392h;
    }
}
