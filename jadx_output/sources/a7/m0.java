package a7;

/* loaded from: classes13.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Queue f1839d;

    /* renamed from: a, reason: collision with root package name */
    public int f1840a;

    /* renamed from: b, reason: collision with root package name */
    public int f1841b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f1842c;

    static {
        char[] cArr = q7.p.f360310a;
        f1839d = new java.util.ArrayDeque(0);
    }

    public static a7.m0 a(java.lang.Object obj, int i17, int i18) {
        a7.m0 m0Var;
        java.util.Queue queue = f1839d;
        synchronized (queue) {
            m0Var = (a7.m0) ((java.util.ArrayDeque) queue).poll();
        }
        if (m0Var == null) {
            m0Var = new a7.m0();
        }
        m0Var.f1842c = obj;
        m0Var.f1841b = i17;
        m0Var.f1840a = i18;
        return m0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof a7.m0)) {
            return false;
        }
        a7.m0 m0Var = (a7.m0) obj;
        return this.f1841b == m0Var.f1841b && this.f1840a == m0Var.f1840a && this.f1842c.equals(m0Var.f1842c);
    }

    public int hashCode() {
        return (((this.f1840a * 31) + this.f1841b) * 31) + this.f1842c.hashCode();
    }
}
