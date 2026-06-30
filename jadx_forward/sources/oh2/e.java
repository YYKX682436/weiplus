package oh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final oh2.e f426899d;

    /* renamed from: e, reason: collision with root package name */
    public static final oh2.e f426900e;

    /* renamed from: f, reason: collision with root package name */
    public static final oh2.e f426901f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ oh2.e[] f426902g;

    static {
        oh2.e eVar = new oh2.e("CENTER", 0);
        f426899d = eVar;
        oh2.e eVar2 = new oh2.e("LEFT", 1);
        f426900e = eVar2;
        oh2.e eVar3 = new oh2.e("RIGHT", 2);
        f426901f = eVar3;
        oh2.e[] eVarArr = {eVar, eVar2, eVar3};
        f426902g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static oh2.e m151378xdce0328(java.lang.String str) {
        return (oh2.e) java.lang.Enum.valueOf(oh2.e.class, str);
    }

    /* renamed from: values */
    public static oh2.e[] m151379xcee59d22() {
        return (oh2.e[]) f426902g.clone();
    }
}
