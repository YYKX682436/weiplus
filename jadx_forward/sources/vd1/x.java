package vd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final vd1.x f517150d;

    /* renamed from: e, reason: collision with root package name */
    public static final vd1.x f517151e;

    /* renamed from: f, reason: collision with root package name */
    public static final vd1.x f517152f;

    /* renamed from: g, reason: collision with root package name */
    public static final vd1.x f517153g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vd1.x[] f517154h;

    static {
        vd1.x xVar = new vd1.x("TIMER_PERIOD", 0);
        f517150d = xVar;
        vd1.x xVar2 = new vd1.x("REACH_SLICE_LIMIT", 1);
        f517151e = xVar2;
        vd1.x xVar3 = new vd1.x("RUNTIME_KILLED", 2);
        f517152f = xVar3;
        vd1.x xVar4 = new vd1.x("IMMEDIATE", 3);
        f517153g = xVar4;
        vd1.x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        f517154h = xVarArr;
        rz5.b.a(xVarArr);
    }

    public x(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vd1.x m171594xdce0328(java.lang.String str) {
        return (vd1.x) java.lang.Enum.valueOf(vd1.x.class, str);
    }

    /* renamed from: values */
    public static vd1.x[] m171595xcee59d22() {
        return (vd1.x[]) f517154h.clone();
    }
}
