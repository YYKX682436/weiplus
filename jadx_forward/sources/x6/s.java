package x6;

/* loaded from: classes13.dex */
public final class s implements x6.q {

    /* renamed from: a, reason: collision with root package name */
    public final x6.t f533703a;

    /* renamed from: b, reason: collision with root package name */
    public int f533704b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap.Config f533705c;

    public s(x6.t tVar) {
        this.f533703a = tVar;
    }

    @Override // x6.q
    public void a() {
        this.f533703a.c(this);
    }

    /* renamed from: equals */
    public boolean m175060xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof x6.s)) {
            return false;
        }
        x6.s sVar = (x6.s) obj;
        return this.f533704b == sVar.f533704b && q7.p.a(this.f533705c, sVar.f533705c);
    }

    /* renamed from: hashCode */
    public int m175061x8cdac1b() {
        int i17 = this.f533704b * 31;
        android.graphics.Bitmap.Config config = this.f533705c;
        return i17 + (config != null ? config.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m175062x9616526c() {
        return x6.u.c(this.f533704b, this.f533705c);
    }
}
