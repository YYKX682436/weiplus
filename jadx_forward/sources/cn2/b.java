package cn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final cn2.b f125001d;

    /* renamed from: e, reason: collision with root package name */
    public static final cn2.b f125002e;

    /* renamed from: f, reason: collision with root package name */
    public static final cn2.b f125003f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cn2.b[] f125004g;

    static {
        cn2.b bVar = new cn2.b("H_JOIN", 0);
        f125001d = bVar;
        cn2.b bVar2 = new cn2.b("NORMAL_JOIN", 1);
        f125002e = bVar2;
        cn2.b bVar3 = new cn2.b("EXCEPT_JOIN", 2);
        f125003f = bVar3;
        cn2.b[] bVarArr = {bVar, bVar2, bVar3};
        f125004g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cn2.b m15325xdce0328(java.lang.String str) {
        return (cn2.b) java.lang.Enum.valueOf(cn2.b.class, str);
    }

    /* renamed from: values */
    public static cn2.b[] m15326xcee59d22() {
        return (cn2.b[]) f125004g.clone();
    }
}
