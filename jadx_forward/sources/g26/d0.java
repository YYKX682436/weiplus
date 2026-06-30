package g26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g26.d0 f349519d;

    /* renamed from: e, reason: collision with root package name */
    public static final g26.d0 f349520e;

    /* renamed from: f, reason: collision with root package name */
    public static final g26.d0 f349521f;

    /* renamed from: g, reason: collision with root package name */
    public static final g26.d0 f349522g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g26.d0[] f349523h;

    static {
        final java.lang.String str = "START";
        final int i17 = 0;
        g26.d0 d0Var = new g26.d0(str, i17) { // from class: g26.b0
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextType, "nextType");
                return b(nextType);
            }
        };
        f349519d = d0Var;
        final java.lang.String str2 = "ACCEPT_NULL";
        final int i18 = 1;
        g26.d0 d0Var2 = new g26.d0(str2, i18) { // from class: g26.z
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextType, "nextType");
                return b(nextType);
            }
        };
        f349520e = d0Var2;
        final java.lang.String str3 = "UNKNOWN";
        final int i19 = 2;
        g26.d0 d0Var3 = new g26.d0(str3, i19) { // from class: g26.c0
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextType, "nextType");
                g26.d0 b17 = b(nextType);
                return b17 == g26.d0.f349520e ? this : b17;
            }
        };
        f349521f = d0Var3;
        final java.lang.String str4 = "NOT_NULL";
        final int i27 = 3;
        g26.d0 d0Var4 = new g26.d0(str4, i27) { // from class: g26.a0
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextType, "nextType");
                return this;
            }
        };
        f349522g = d0Var4;
        g26.d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4};
        f349523h = d0VarArr;
        rz5.b.a(d0VarArr);
    }

    public d0(java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* renamed from: valueOf */
    public static g26.d0 m130737xdce0328(java.lang.String str) {
        return (g26.d0) java.lang.Enum.valueOf(g26.d0.class, str);
    }

    /* renamed from: values */
    public static g26.d0[] m130738xcee59d22() {
        return (g26.d0[]) f349523h.clone();
    }

    public abstract g26.d0 a(f26.c3 c3Var);

    public final g26.d0 b(f26.c3 c3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c3Var, "<this>");
        if (c3Var.x0()) {
            return f349520e;
        }
        if (c3Var instanceof f26.v) {
        }
        return f26.c.f340670a.a(g26.a.a(false, true, g26.w.f349551a, null, null, 24, null), f26.h0.c(c3Var), f26.x1.f340767a) ? f349522g : f349521f;
    }
}
