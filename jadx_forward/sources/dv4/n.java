package dv4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final dv4.m f325550e;

    /* renamed from: f, reason: collision with root package name */
    public static final dv4.n f325551f;

    /* renamed from: g, reason: collision with root package name */
    public static final dv4.n f325552g;

    /* renamed from: h, reason: collision with root package name */
    public static final dv4.n f325553h;

    /* renamed from: i, reason: collision with root package name */
    public static final dv4.n f325554i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ dv4.n[] f325555m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f325556d;

    static {
        dv4.n nVar = new dv4.n("Unknown", 0, "");
        f325551f = nVar;
        dv4.n nVar2 = new dv4.n("Low", 1, "low");
        f325552g = nVar2;
        dv4.n nVar3 = new dv4.n("Medium", 2, ya.b.f77490x87518375);
        f325553h = nVar3;
        dv4.n nVar4 = new dv4.n("High", 3, "high");
        f325554i = nVar4;
        dv4.n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f325555m = nVarArr;
        rz5.b.a(nVarArr);
        f325550e = new dv4.m(null);
    }

    public n(java.lang.String str, int i17, java.lang.String str2) {
        this.f325556d = str2;
    }

    /* renamed from: valueOf */
    public static dv4.n m126300xdce0328(java.lang.String str) {
        return (dv4.n) java.lang.Enum.valueOf(dv4.n.class, str);
    }

    /* renamed from: values */
    public static dv4.n[] m126301xcee59d22() {
        return (dv4.n[]) f325555m.clone();
    }
}
