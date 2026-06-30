package vd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final vd1.k f517123d;

    /* renamed from: e, reason: collision with root package name */
    public static final vd1.l f517124e;

    /* renamed from: f, reason: collision with root package name */
    public static final vd1.l f517125f;

    /* renamed from: g, reason: collision with root package name */
    public static final vd1.l f517126g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vd1.l[] f517127h;

    static {
        vd1.l lVar = new vd1.l("HIGH", 0);
        f517124e = lVar;
        vd1.l lVar2 = new vd1.l("LOW", 1);
        f517125f = lVar2;
        vd1.l lVar3 = new vd1.l("IMMEDIATE", 2);
        f517126g = lVar3;
        vd1.l[] lVarArr = {lVar, lVar2, lVar3};
        f517127h = lVarArr;
        rz5.b.a(lVarArr);
        f517123d = new vd1.k(null);
    }

    public l(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vd1.l m171587xdce0328(java.lang.String str) {
        return (vd1.l) java.lang.Enum.valueOf(vd1.l.class, str);
    }

    /* renamed from: values */
    public static vd1.l[] m171588xcee59d22() {
        return (vd1.l[]) f517127h.clone();
    }
}
