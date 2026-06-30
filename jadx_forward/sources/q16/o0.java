package q16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public abstract class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q16.o0 f441309d;

    /* renamed from: e, reason: collision with root package name */
    public static final q16.o0 f441310e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q16.o0[] f441311f;

    static {
        final java.lang.String str = "PLAIN";
        final int i17 = 0;
        q16.o0 o0Var = new q16.o0(str, i17) { // from class: q16.n0
            @Override // q16.o0
            public java.lang.String a(java.lang.String string) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
                return string;
            }
        };
        f441309d = o0Var;
        final java.lang.String str2 = "HTML";
        final int i18 = 1;
        q16.o0 o0Var2 = new q16.o0(str2, i18) { // from class: q16.m0
            @Override // q16.o0
            public java.lang.String a(java.lang.String string) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
                return r26.i0.t(r26.i0.t(string, "<", "&lt;", false), ">", "&gt;", false);
            }
        };
        f441310e = o0Var2;
        q16.o0[] o0VarArr = {o0Var, o0Var2};
        f441311f = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* renamed from: valueOf */
    public static q16.o0 m159437xdce0328(java.lang.String str) {
        return (q16.o0) java.lang.Enum.valueOf(q16.o0.class, str);
    }

    /* renamed from: values */
    public static q16.o0[] m159438xcee59d22() {
        return (q16.o0[]) f441311f.clone();
    }

    public abstract java.lang.String a(java.lang.String str);
}
