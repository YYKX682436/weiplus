package p2;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f432924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f432927d;

    public o(int i17, int i18, int i19, int i27) {
        this.f432924a = i17;
        this.f432925b = i18;
        this.f432926c = i19;
        this.f432927d = i27;
    }

    /* renamed from: equals */
    public boolean m157750xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2.o)) {
            return false;
        }
        p2.o oVar = (p2.o) obj;
        return this.f432924a == oVar.f432924a && this.f432925b == oVar.f432925b && this.f432926c == oVar.f432926c && this.f432927d == oVar.f432927d;
    }

    /* renamed from: hashCode */
    public int m157751x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f432924a) * 31) + java.lang.Integer.hashCode(this.f432925b)) * 31) + java.lang.Integer.hashCode(this.f432926c)) * 31) + java.lang.Integer.hashCode(this.f432927d);
    }

    /* renamed from: toString */
    public java.lang.String m157752x9616526c() {
        return "IntRect.fromLTRB(" + this.f432924a + ", " + this.f432925b + ", " + this.f432926c + ", " + this.f432927d + ')';
    }
}
