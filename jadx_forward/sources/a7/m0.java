package a7;

/* loaded from: classes13.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Queue f83372d;

    /* renamed from: a, reason: collision with root package name */
    public int f83373a;

    /* renamed from: b, reason: collision with root package name */
    public int f83374b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f83375c;

    static {
        char[] cArr = q7.p.f441843a;
        f83372d = new java.util.ArrayDeque(0);
    }

    public static a7.m0 a(java.lang.Object obj, int i17, int i18) {
        a7.m0 m0Var;
        java.util.Queue queue = f83372d;
        synchronized (queue) {
            m0Var = (a7.m0) ((java.util.ArrayDeque) queue).poll();
        }
        if (m0Var == null) {
            m0Var = new a7.m0();
        }
        m0Var.f83375c = obj;
        m0Var.f83374b = i17;
        m0Var.f83373a = i18;
        return m0Var;
    }

    /* renamed from: equals */
    public boolean m758xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof a7.m0)) {
            return false;
        }
        a7.m0 m0Var = (a7.m0) obj;
        return this.f83374b == m0Var.f83374b && this.f83373a == m0Var.f83373a && this.f83375c.equals(m0Var.f83375c);
    }

    /* renamed from: hashCode */
    public int m759x8cdac1b() {
        return (((this.f83373a * 31) + this.f83374b) * 31) + this.f83375c.hashCode();
    }
}
