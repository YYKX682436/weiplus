package f26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class d3 {

    /* renamed from: f, reason: collision with root package name */
    public static final f26.d3 f340676f;

    /* renamed from: g, reason: collision with root package name */
    public static final f26.d3 f340677g;

    /* renamed from: h, reason: collision with root package name */
    public static final f26.d3 f340678h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f26.d3[] f340679i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f340680d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f340681e;

    static {
        f26.d3 d3Var = new f26.d3("INVARIANT", 0, "", true, true, 0);
        f340676f = d3Var;
        f26.d3 d3Var2 = new f26.d3("IN_VARIANCE", 1, "in", true, false, -1);
        f340677g = d3Var2;
        f26.d3 d3Var3 = new f26.d3("OUT_VARIANCE", 2, "out", false, true, 1);
        f340678h = d3Var3;
        f26.d3[] d3VarArr = {d3Var, d3Var2, d3Var3};
        f340679i = d3VarArr;
        rz5.b.a(d3VarArr);
    }

    public d3(java.lang.String str, int i17, java.lang.String str2, boolean z17, boolean z18, int i18) {
        this.f340680d = str2;
        this.f340681e = z18;
    }

    /* renamed from: valueOf */
    public static f26.d3 m128946xdce0328(java.lang.String str) {
        return (f26.d3) java.lang.Enum.valueOf(f26.d3.class, str);
    }

    /* renamed from: values */
    public static f26.d3[] m128947xcee59d22() {
        return (f26.d3[]) f340679i.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f340680d;
    }
}
