package cd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final cd.b f122028d;

    /* renamed from: e, reason: collision with root package name */
    public static final cd.b f122029e;

    /* renamed from: f, reason: collision with root package name */
    public static final cd.b f122030f;

    /* renamed from: g, reason: collision with root package name */
    public static final cd.b f122031g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cd.b[] f122032h;

    static {
        cd.b bVar = new cd.b("SUCCESS", 0);
        f122028d = bVar;
        cd.b bVar2 = new cd.b("FAILURE", 1);
        f122029e = bVar2;
        cd.b bVar3 = new cd.b("RETRY", 2);
        f122030f = bVar3;
        cd.b bVar4 = new cd.b("CANCELED", 3);
        f122031g = bVar4;
        cd.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f122032h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cd.b m14627xdce0328(java.lang.String str) {
        return (cd.b) java.lang.Enum.valueOf(cd.b.class, str);
    }

    /* renamed from: values */
    public static cd.b[] m14628xcee59d22() {
        return (cd.b[]) f122032h.clone();
    }
}
