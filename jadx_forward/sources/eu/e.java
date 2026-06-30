package eu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final eu.e f338224d;

    /* renamed from: e, reason: collision with root package name */
    public static final eu.e f338225e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ eu.e[] f338226f;

    static {
        eu.e eVar = new eu.e("Success", 0);
        f338224d = eVar;
        eu.e eVar2 = new eu.e("Error", 1);
        eu.e eVar3 = new eu.e("InvalidMsg", 2);
        f338225e = eVar3;
        eu.e[] eVarArr = {eVar, eVar2, eVar3};
        f338226f = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static eu.e m128187xdce0328(java.lang.String str) {
        return (eu.e) java.lang.Enum.valueOf(eu.e.class, str);
    }

    /* renamed from: values */
    public static eu.e[] m128188xcee59d22() {
        return (eu.e[]) f338226f.clone();
    }
}
