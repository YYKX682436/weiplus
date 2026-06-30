package x3;

/* loaded from: classes15.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    public static final x3.r f533124e = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.l(Integer.MIN_VALUE, 1, p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93071w, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f533125a;

    /* renamed from: b, reason: collision with root package name */
    public final x3.o f533126b;

    /* renamed from: c, reason: collision with root package name */
    public final x3.j f533127c;

    /* renamed from: d, reason: collision with root package name */
    public final float f533128d;

    public r(boolean z17, x3.o oVar, x3.j jVar, float f17) {
        this.f533125a = z17;
        this.f533126b = oVar;
        this.f533127c = jVar;
        this.f533128d = f17;
    }

    public x3.j a(boolean z17) {
        x3.j jVar = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93071w;
        x3.j jVar2 = this.f533127c;
        return jVar2 != jVar ? jVar2 : this.f533128d == 0.0f ? z17 ? p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93074z : p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.E : p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.F;
    }

    /* renamed from: equals */
    public boolean m174937xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x3.r.class != obj.getClass()) {
            return false;
        }
        x3.r rVar = (x3.r) obj;
        return this.f533127c.equals(rVar.f533127c) && this.f533126b.m174932xb2c87fbf(rVar.f533126b);
    }

    /* renamed from: hashCode */
    public int m174938x8cdac1b() {
        return (this.f533126b.m174933x8cdac1b() * 31) + this.f533127c.hashCode();
    }
}
