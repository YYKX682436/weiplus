package s7;

/* loaded from: classes16.dex */
public class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s7.c0 f485138c = new s7.c0(s7.a0.none, null);

    /* renamed from: d, reason: collision with root package name */
    public static final s7.c0 f485139d = new s7.c0(s7.a0.xMidYMid, s7.b0.meet);

    /* renamed from: a, reason: collision with root package name */
    public final s7.a0 f485140a;

    /* renamed from: b, reason: collision with root package name */
    public final s7.b0 f485141b;

    public c0(s7.a0 a0Var, s7.b0 b0Var) {
        this.f485140a = a0Var;
        this.f485141b = b0Var;
    }

    /* renamed from: equals */
    public boolean m163955xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s7.c0.class != obj.getClass()) {
            return false;
        }
        s7.c0 c0Var = (s7.c0) obj;
        return this.f485140a == c0Var.f485140a && this.f485141b == c0Var.f485141b;
    }

    /* renamed from: toString */
    public java.lang.String m163956x9616526c() {
        return this.f485140a + " " + this.f485141b;
    }
}
