package fm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fm.a[] f345494d;

    static {
        fm.a[] aVarArr = {new fm.a("Default", 0), new fm.a("LoginTick", 1), new fm.a("LoadStep", 2), new fm.a("ResourceCheck", 3), new fm.a("AutoDownload", 4), new fm.a("RESOURCE_LOAD_AVG", 5)};
        f345494d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static fm.a m129685xdce0328(java.lang.String str) {
        return (fm.a) java.lang.Enum.valueOf(fm.a.class, str);
    }

    /* renamed from: values */
    public static fm.a[] m129686xcee59d22() {
        return (fm.a[]) f345494d.clone();
    }
}
