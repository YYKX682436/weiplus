package pd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final pd1.g f435069d;

    /* renamed from: e, reason: collision with root package name */
    public static final pd1.g f435070e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pd1.g[] f435071f;

    static {
        pd1.g gVar = new pd1.g("LANDSCAPE", 0);
        f435069d = gVar;
        pd1.g gVar2 = new pd1.g("PORTRAIT", 1);
        f435070e = gVar2;
        pd1.g[] gVarArr = {gVar, gVar2};
        f435071f = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static pd1.g m158264xdce0328(java.lang.String str) {
        return (pd1.g) java.lang.Enum.valueOf(pd1.g.class, str);
    }

    /* renamed from: values */
    public static pd1.g[] m158265xcee59d22() {
        return (pd1.g[]) f435071f.clone();
    }
}
