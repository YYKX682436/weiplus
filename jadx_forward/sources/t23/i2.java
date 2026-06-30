package t23;

/* loaded from: classes10.dex */
public class i2 extends t23.m2 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f496717b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f496718c;

    public i2(java.lang.String str, java.lang.String str2) {
        this.f496739a = 0;
        this.f496717b = str;
        this.f496718c = str2;
    }

    /* renamed from: equals */
    public boolean m165750xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof t23.i2) {
            t23.i2 i2Var = (t23.i2) obj;
            if (this.f496718c.equals(i2Var.f496718c) && this.f496717b.equals(i2Var.f496717b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m165751x8cdac1b() {
        return ((629 + this.f496717b.hashCode()) * 37) + this.f496718c.hashCode();
    }
}
