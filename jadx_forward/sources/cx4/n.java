package cx4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final cx4.n f306171e;

    /* renamed from: f, reason: collision with root package name */
    public static final cx4.n f306172f;

    /* renamed from: g, reason: collision with root package name */
    public static final cx4.n f306173g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cx4.n[] f306174h;

    /* renamed from: d, reason: collision with root package name */
    public final int f306175d;

    static {
        cx4.n nVar = new cx4.n("None", 0, 0);
        f306171e = nVar;
        cx4.n nVar2 = new cx4.n("ColdBoot", 1, 1);
        f306172f = nVar2;
        cx4.n nVar3 = new cx4.n("WarmBoot", 2, 2);
        f306173g = nVar3;
        cx4.n[] nVarArr = {nVar, nVar2, nVar3};
        f306174h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
        this.f306175d = i18;
    }

    /* renamed from: valueOf */
    public static cx4.n m123082xdce0328(java.lang.String str) {
        return (cx4.n) java.lang.Enum.valueOf(cx4.n.class, str);
    }

    /* renamed from: values */
    public static cx4.n[] m123083xcee59d22() {
        return (cx4.n[]) f306174h.clone();
    }
}
