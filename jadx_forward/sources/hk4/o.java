package hk4;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f363505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f363506b;

    /* renamed from: c, reason: collision with root package name */
    public final int f363507c;

    public o(int i17, int i18, int i19) {
        this.f363505a = i17;
        this.f363506b = i18;
        this.f363507c = i19;
    }

    /* renamed from: equals */
    public boolean m133695xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk4.o)) {
            return false;
        }
        hk4.o oVar = (hk4.o) obj;
        return this.f363505a == oVar.f363505a && this.f363506b == oVar.f363506b && this.f363507c == oVar.f363507c;
    }

    /* renamed from: hashCode */
    public int m133696x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f363505a) * 31) + java.lang.Integer.hashCode(this.f363506b)) * 31) + java.lang.Integer.hashCode(this.f363507c);
    }

    /* renamed from: toString */
    public java.lang.String m133697x9616526c() {
        return "MultiMediaInfo(width=" + this.f363505a + ", height=" + this.f363506b + ", rotate=" + this.f363507c + ')';
    }
}
