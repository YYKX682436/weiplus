package x3;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f533118a;

    /* renamed from: b, reason: collision with root package name */
    public final int f533119b;

    public o(int i17, int i18) {
        this.f533118a = i17;
        this.f533119b = i18;
    }

    /* renamed from: equals */
    public boolean m174932xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x3.o.class != obj.getClass()) {
            return false;
        }
        x3.o oVar = (x3.o) obj;
        return this.f533119b == oVar.f533119b && this.f533118a == oVar.f533118a;
    }

    /* renamed from: hashCode */
    public int m174933x8cdac1b() {
        return (this.f533118a * 31) + this.f533119b;
    }

    /* renamed from: toString */
    public java.lang.String m174934x9616526c() {
        return "[" + this.f533118a + ", " + this.f533119b + "]";
    }
}
