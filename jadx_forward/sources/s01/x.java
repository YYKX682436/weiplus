package s01;

/* loaded from: classes10.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f483469a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f483470b;

    public x(java.lang.String str, java.lang.String str2) {
        this.f483469a = str;
        this.f483470b = str2;
    }

    /* renamed from: equals */
    public boolean m163500xb2c87fbf(java.lang.Object obj) {
        if (obj.getClass() != s01.x.class) {
            return false;
        }
        s01.x xVar = (s01.x) obj;
        java.lang.String str = xVar.f483469a;
        java.lang.String str2 = this.f483469a;
        if (!(str2 == null && str == null) && (str2 == null || !str2.equals(str))) {
            return false;
        }
        java.lang.String str3 = xVar.f483470b;
        java.lang.String str4 = this.f483470b;
        return (str4 == null && str3 == null) || (str4 != null && str4.equals(str3));
    }

    /* renamed from: hashCode */
    public int m163501x8cdac1b() {
        return this.f483469a.hashCode() + this.f483470b.hashCode();
    }
}
