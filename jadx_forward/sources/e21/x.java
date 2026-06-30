package e21;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final e21.x f328127d;

    /* renamed from: e, reason: collision with root package name */
    public static final e21.x f328128e;

    /* renamed from: f, reason: collision with root package name */
    public static final e21.x f328129f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e21.x[] f328130g;

    static {
        e21.x xVar = new e21.x("Unknown", 0);
        e21.x xVar2 = new e21.x("Succeed", 1);
        f328127d = xVar2;
        e21.x xVar3 = new e21.x("TryMax", 2);
        f328128e = xVar3;
        e21.x xVar4 = new e21.x("OpenIMTypeErr", 3);
        f328129f = xVar4;
        e21.x[] xVarArr = {xVar, xVar2, xVar3, xVar4, new e21.x("CustomRemove", 4), new e21.x("TimeOut", 5), new e21.x("TooLarge", 6)};
        f328130g = xVarArr;
        rz5.b.a(xVarArr);
    }

    public x(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static e21.x m126811xdce0328(java.lang.String str) {
        return (e21.x) java.lang.Enum.valueOf(e21.x.class, str);
    }

    /* renamed from: values */
    public static e21.x[] m126812xcee59d22() {
        return (e21.x[]) f328130g.clone();
    }
}
