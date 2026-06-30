package pl5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final pl5.b f438272d;

    /* renamed from: e, reason: collision with root package name */
    public static final pl5.b f438273e;

    /* renamed from: f, reason: collision with root package name */
    public static final pl5.b f438274f;

    /* renamed from: g, reason: collision with root package name */
    public static final pl5.b f438275g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pl5.b[] f438276h;

    static {
        pl5.b bVar = new pl5.b("CASE_INCLUDE_INCLUDE", 0, 1);
        f438272d = bVar;
        pl5.b bVar2 = new pl5.b("CASE_INCLUDE_EDGE", 1, 2);
        f438273e = bVar2;
        pl5.b bVar3 = new pl5.b("CASE_EDGE_INCLUDE", 2, 3);
        f438274f = bVar3;
        pl5.b bVar4 = new pl5.b("CASE_OTHER", 3, 4);
        f438275g = bVar4;
        pl5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f438276h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static pl5.b m158694xdce0328(java.lang.String str) {
        return (pl5.b) java.lang.Enum.valueOf(pl5.b.class, str);
    }

    /* renamed from: values */
    public static pl5.b[] m158695xcee59d22() {
        return (pl5.b[]) f438276h.clone();
    }
}
