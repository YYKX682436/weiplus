package pi;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f436025a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436026b;

    public a(int i17, java.lang.String str) {
        this.f436025a = i17;
        this.f436026b = str;
    }

    /* renamed from: equals */
    public boolean m158552xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pi.a.class != obj.getClass()) {
            return false;
        }
        pi.a aVar = (pi.a) obj;
        return this.f436025a == aVar.f436025a && java.util.Objects.equals(this.f436026b, aVar.f436026b);
    }

    /* renamed from: hashCode */
    public int m158553x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f436025a), this.f436026b);
    }

    /* renamed from: toString */
    public java.lang.String m158554x9616526c() {
        return this.f436025a + " : " + this.f436026b;
    }
}
