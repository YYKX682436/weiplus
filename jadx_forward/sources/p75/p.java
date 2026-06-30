package p75;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final p75.p f434213e;

    /* renamed from: f, reason: collision with root package name */
    public static final p75.p f434214f;

    /* renamed from: g, reason: collision with root package name */
    public static final p75.p f434215g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.p f434216h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.p f434217i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.p f434218m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p75.p[] f434219n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f434220d;

    static {
        p75.p pVar = new p75.p("Equal", 0, "=");
        f434213e = pVar;
        p75.p pVar2 = new p75.p("NotEqual", 1, "<>");
        f434214f = pVar2;
        p75.p pVar3 = new p75.p("LargerThan", 2, ">");
        f434215g = pVar3;
        p75.p pVar4 = new p75.p("SmallerThan", 3, "<");
        f434216h = pVar4;
        p75.p pVar5 = new p75.p("LargerEqual", 4, ">=");
        f434217i = pVar5;
        p75.p pVar6 = new p75.p("SmallerEqual", 5, "<=");
        f434218m = pVar6;
        p75.p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
        f434219n = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, java.lang.String str2) {
        this.f434220d = str2;
    }

    /* renamed from: valueOf */
    public static p75.p m157955xdce0328(java.lang.String str) {
        return (p75.p) java.lang.Enum.valueOf(p75.p.class, str);
    }

    /* renamed from: values */
    public static p75.p[] m157956xcee59d22() {
        return (p75.p[]) f434219n.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f434220d;
    }
}
