package sc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final sc.b f487138d;

    /* renamed from: e, reason: collision with root package name */
    public static final sc.b f487139e;

    /* renamed from: f, reason: collision with root package name */
    public static final sc.b f487140f;

    /* renamed from: g, reason: collision with root package name */
    public static final sc.b f487141g;

    /* renamed from: h, reason: collision with root package name */
    public static final sc.b f487142h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ sc.b[] f487143i;

    static {
        sc.b bVar = new sc.b("SKIP_SYSTEM", 0);
        f487138d = bVar;
        sc.b bVar2 = new sc.b("SKIP_CIRCULAR", 1);
        f487139e = bVar2;
        sc.b bVar3 = new sc.b("LEVEL_1", 2);
        f487140f = bVar3;
        sc.b bVar4 = new sc.b("LEVEL_1_DOUBLE", 3);
        f487141g = bVar4;
        sc.b bVar5 = new sc.b("LEVEL_2", 4);
        f487142h = bVar5;
        sc.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f487143i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static sc.b m164219xdce0328(java.lang.String str) {
        return (sc.b) java.lang.Enum.valueOf(sc.b.class, str);
    }

    /* renamed from: values */
    public static sc.b[] m164220xcee59d22() {
        return (sc.b[]) f487143i.clone();
    }
}
