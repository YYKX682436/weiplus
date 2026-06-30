package a5;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final a5.f f82917i = new a5.f(new a5.e());

    /* renamed from: a, reason: collision with root package name */
    public a5.b0 f82918a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f82919b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f82920c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f82921d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82922e;

    /* renamed from: f, reason: collision with root package name */
    public long f82923f;

    /* renamed from: g, reason: collision with root package name */
    public long f82924g;

    /* renamed from: h, reason: collision with root package name */
    public a5.h f82925h;

    public f() {
        this.f82918a = a5.b0.NOT_REQUIRED;
        this.f82923f = -1L;
        this.f82924g = -1L;
        this.f82925h = new a5.h();
    }

    /* renamed from: equals */
    public boolean m579xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.f.class != obj.getClass()) {
            return false;
        }
        a5.f fVar = (a5.f) obj;
        if (this.f82919b == fVar.f82919b && this.f82920c == fVar.f82920c && this.f82921d == fVar.f82921d && this.f82922e == fVar.f82922e && this.f82923f == fVar.f82923f && this.f82924g == fVar.f82924g && this.f82918a == fVar.f82918a) {
            return this.f82925h.m585xb2c87fbf(fVar.f82925h);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m580x8cdac1b() {
        int hashCode = ((((((((this.f82918a.hashCode() * 31) + (this.f82919b ? 1 : 0)) * 31) + (this.f82920c ? 1 : 0)) * 31) + (this.f82921d ? 1 : 0)) * 31) + (this.f82922e ? 1 : 0)) * 31;
        long j17 = this.f82923f;
        int i17 = (hashCode + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f82924g;
        return ((i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31) + this.f82925h.m586x8cdac1b();
    }

    public f(a5.e eVar) {
        a5.b0 b0Var = a5.b0.NOT_REQUIRED;
        this.f82918a = b0Var;
        this.f82923f = -1L;
        this.f82924g = -1L;
        this.f82925h = new a5.h();
        eVar.getClass();
        this.f82919b = false;
        this.f82920c = false;
        this.f82918a = b0Var;
        this.f82921d = false;
        this.f82922e = false;
        this.f82925h = eVar.f82916a;
        this.f82923f = -1L;
        this.f82924g = -1L;
    }

    public f(a5.f fVar) {
        this.f82918a = a5.b0.NOT_REQUIRED;
        this.f82923f = -1L;
        this.f82924g = -1L;
        this.f82925h = new a5.h();
        this.f82919b = fVar.f82919b;
        this.f82920c = fVar.f82920c;
        this.f82918a = fVar.f82918a;
        this.f82921d = fVar.f82921d;
        this.f82922e = fVar.f82922e;
        this.f82925h = fVar.f82925h;
    }
}
