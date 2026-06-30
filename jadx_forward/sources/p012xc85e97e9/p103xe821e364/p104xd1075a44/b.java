package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f93492a;

    /* renamed from: b, reason: collision with root package name */
    public int f93493b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f93494c;

    /* renamed from: d, reason: collision with root package name */
    public int f93495d;

    public b(int i17, int i18, int i19, java.lang.Object obj) {
        this.f93492a = i17;
        this.f93493b = i18;
        this.f93495d = i19;
        this.f93494c = obj;
    }

    /* renamed from: equals */
    public boolean m8136xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p012xc85e97e9.p103xe821e364.p104xd1075a44.b.class != obj.getClass()) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) obj;
        int i17 = this.f93492a;
        if (i17 != bVar.f93492a) {
            return false;
        }
        if (i17 == 8 && java.lang.Math.abs(this.f93495d - this.f93493b) == 1 && this.f93495d == bVar.f93493b && this.f93493b == bVar.f93495d) {
            return true;
        }
        if (this.f93495d != bVar.f93495d || this.f93493b != bVar.f93493b) {
            return false;
        }
        java.lang.Object obj2 = this.f93494c;
        if (obj2 != null) {
            if (!obj2.equals(bVar.f93494c)) {
                return false;
            }
        } else if (bVar.f93494c != null) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m8137x8cdac1b() {
        return (((this.f93492a * 31) + this.f93493b) * 31) + this.f93495d;
    }

    /* renamed from: toString */
    public java.lang.String m8138x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("[");
        int i17 = this.f93492a;
        sb6.append(i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb6.append(",s:");
        sb6.append(this.f93493b);
        sb6.append("c:");
        sb6.append(this.f93495d);
        sb6.append(",p:");
        sb6.append(this.f93494c);
        sb6.append("]");
        return sb6.toString();
    }
}
