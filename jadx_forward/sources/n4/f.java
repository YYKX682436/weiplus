package n4;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416405a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f416406b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f416407c;

    public f(java.lang.String str, boolean z17, java.util.List list) {
        this.f416405a = str;
        this.f416406b = z17;
        this.f416407c = list;
    }

    /* renamed from: equals */
    public boolean m149081xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n4.f.class != obj.getClass()) {
            return false;
        }
        n4.f fVar = (n4.f) obj;
        if (this.f416406b != fVar.f416406b || !this.f416407c.equals(fVar.f416407c)) {
            return false;
        }
        java.lang.String str = this.f416405a;
        boolean startsWith = str.startsWith("index_");
        java.lang.String str2 = fVar.f416405a;
        return startsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    /* renamed from: hashCode */
    public int m149082x8cdac1b() {
        java.lang.String str = this.f416405a;
        return ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f416406b ? 1 : 0)) * 31) + this.f416407c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149083x9616526c() {
        return "Index{name='" + this.f416405a + "', unique=" + this.f416406b + ", columns=" + this.f416407c + '}';
    }
}
