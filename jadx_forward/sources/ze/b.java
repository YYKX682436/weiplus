package ze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ze.b f553249d;

    /* renamed from: e, reason: collision with root package name */
    public static final ze.b f553250e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ze.b[] f553251f;

    static {
        ze.b bVar = new ze.b("LANDSCAPE", 0);
        f553249d = bVar;
        ze.b bVar2 = new ze.b("PORTRAIT", 1);
        f553250e = bVar2;
        ze.b[] bVarArr = {bVar, bVar2};
        f553251f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ze.b m178744xdce0328(java.lang.String str) {
        return (ze.b) java.lang.Enum.valueOf(ze.b.class, str);
    }

    /* renamed from: values */
    public static ze.b[] m178745xcee59d22() {
        return (ze.b[]) f553251f.clone();
    }
}
