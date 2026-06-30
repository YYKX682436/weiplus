package n06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final n06.j f415521d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n06.j[] f415522e;

    static {
        n06.j jVar = new n06.j("FROM_DEPENDENCIES", 0);
        f415521d = jVar;
        n06.j[] jVarArr = {jVar, new n06.j("FROM_CLASS_LOADER", 1), new n06.j("FALLBACK", 2)};
        f415522e = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static n06.j m148831xdce0328(java.lang.String str) {
        return (n06.j) java.lang.Enum.valueOf(n06.j.class, str);
    }

    /* renamed from: values */
    public static n06.j[] m148832xcee59d22() {
        return (n06.j[]) f415522e.clone();
    }
}
