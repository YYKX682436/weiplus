package zi;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f554606a;

    /* renamed from: b, reason: collision with root package name */
    public final zi.b f554607b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f554608c;

    public a(int i17, zi.b bVar, java.lang.Object obj) {
        this.f554606a = i17;
        this.f554607b = bVar;
        this.f554608c = obj;
    }

    /* renamed from: equals */
    public boolean m179011xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi.a)) {
            return false;
        }
        zi.a aVar = (zi.a) obj;
        if (this.f554606a != aVar.f554606a || !this.f554607b.m179013xb2c87fbf(aVar.f554607b)) {
            return false;
        }
        java.lang.Object obj2 = this.f554608c;
        java.lang.Object obj3 = aVar.f554608c;
        return (obj2 == null || obj2.equals(obj3)) && (obj3 == null || obj3.equals(obj2));
    }

    /* renamed from: hashCode */
    public int m179012x8cdac1b() {
        return (this.f554607b.m179014x8cdac1b() << 31) + this.f554606a;
    }
}
