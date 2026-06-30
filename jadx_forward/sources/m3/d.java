package m3;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f404625a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f404626b;

    public d(java.lang.Object obj, java.lang.Object obj2) {
        this.f404625a = obj;
        this.f404626b = obj2;
    }

    public static m3.d a(java.lang.Object obj, java.lang.Object obj2) {
        return new m3.d(obj, obj2);
    }

    /* renamed from: equals */
    public boolean m146704xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof m3.d)) {
            return false;
        }
        m3.d dVar = (m3.d) obj;
        return m3.c.a(dVar.f404625a, this.f404625a) && m3.c.a(dVar.f404626b, this.f404626b);
    }

    /* renamed from: hashCode */
    public int m146705x8cdac1b() {
        java.lang.Object obj = this.f404625a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f404626b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m146706x9616526c() {
        return "Pair{" + this.f404625a + " " + this.f404626b + "}";
    }
}
