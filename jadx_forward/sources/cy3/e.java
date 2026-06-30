package cy3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final cy3.e f306303d;

    /* renamed from: e, reason: collision with root package name */
    public static final cy3.e f306304e;

    /* renamed from: f, reason: collision with root package name */
    public static final cy3.e f306305f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cy3.e[] f306306g;

    static {
        cy3.e eVar = new cy3.e("PLAY", 0);
        f306303d = eVar;
        cy3.e eVar2 = new cy3.e("SWITCH", 1);
        f306304e = eVar2;
        cy3.e eVar3 = new cy3.e("SWITCH_DEFAULT", 2);
        f306305f = eVar3;
        cy3.e[] eVarArr = {eVar, eVar2, eVar3, new cy3.e("MORE", 3)};
        f306306g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cy3.e m123111xdce0328(java.lang.String str) {
        return (cy3.e) java.lang.Enum.valueOf(cy3.e.class, str);
    }

    /* renamed from: values */
    public static cy3.e[] m123112xcee59d22() {
        return (cy3.e[]) f306306g.clone();
    }
}
