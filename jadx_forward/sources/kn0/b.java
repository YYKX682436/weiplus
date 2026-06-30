package kn0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f391030a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f391031b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f391032c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f391033d;

    public b(int i17, boolean z17, java.lang.String decryptString, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decryptString, "decryptString");
        this.f391030a = i17;
        this.f391031b = z17;
        this.f391032c = decryptString;
        this.f391033d = z18;
    }

    /* renamed from: equals */
    public boolean m143726xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.b)) {
            return false;
        }
        kn0.b bVar = (kn0.b) obj;
        return this.f391030a == bVar.f391030a && this.f391031b == bVar.f391031b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391032c, bVar.f391032c) && this.f391033d == bVar.f391033d;
    }

    /* renamed from: hashCode */
    public int m143727x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f391030a) * 31) + java.lang.Boolean.hashCode(this.f391031b)) * 31) + this.f391032c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f391033d);
    }

    /* renamed from: toString */
    public java.lang.String m143728x9616526c() {
        return "key:" + this.f391030a + ",haveDecrypt:" + this.f391031b + ",decryptString:" + this.f391032c + ",havePlay:" + this.f391033d;
    }
}
