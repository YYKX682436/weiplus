package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.d f539313e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.d f539314f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xx.d[] f539315g;

    /* renamed from: d, reason: collision with root package name */
    public final int f539316d;

    static {
        xx.d dVar = new xx.d("AIMicInputEndTypeOther", 0, 0);
        xx.d dVar2 = new xx.d("AIMicInputEndTypeCLK", 1, 1);
        f539313e = dVar2;
        xx.d dVar3 = new xx.d("AIMicInputEndTypeKeyBoard", 2, 2);
        f539314f = dVar3;
        xx.d[] dVarArr = {dVar, dVar2, dVar3};
        f539315g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f539316d = i18;
    }

    /* renamed from: valueOf */
    public static xx.d m176136xdce0328(java.lang.String str) {
        return (xx.d) java.lang.Enum.valueOf(xx.d.class, str);
    }

    /* renamed from: values */
    public static xx.d[] m176137xcee59d22() {
        return (xx.d[]) f539315g.clone();
    }
}
