package dv4;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f325530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f325531b;

    public a(java.lang.String str, int i17) {
        this.f325530a = str;
        this.f325531b = i17;
    }

    public abstract void a(java.util.List list);

    /* renamed from: equals */
    public boolean m126297xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dv4.a)) {
            return false;
        }
        dv4.a aVar = (dv4.a) obj;
        java.lang.String str = aVar.f325530a;
        java.lang.String str2 = this.f325530a;
        return aVar.f325531b == this.f325531b && (str2 == str || (str2 != null && str2.equalsIgnoreCase(str)));
    }

    /* renamed from: hashCode */
    public int m126298x8cdac1b() {
        return super.hashCode();
    }
}
