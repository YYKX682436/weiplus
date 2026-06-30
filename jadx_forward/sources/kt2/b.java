package kt2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final kt2.b f393502d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kt2.b[] f393503e;

    static {
        kt2.b bVar = new kt2.b("NONE", 0);
        kt2.b bVar2 = new kt2.b("HIGH", 1);
        f393502d = bVar2;
        kt2.b[] bVarArr = {bVar, bVar2, new kt2.b("MEDIUM", 2), new kt2.b("LOW", 3)};
        f393503e = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static kt2.b m144350xdce0328(java.lang.String str) {
        return (kt2.b) java.lang.Enum.valueOf(kt2.b.class, str);
    }

    /* renamed from: values */
    public static kt2.b[] m144351xcee59d22() {
        return (kt2.b[]) f393503e.clone();
    }
}
