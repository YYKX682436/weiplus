package xh3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final xh3.a f536093d;

    /* renamed from: e, reason: collision with root package name */
    public static final xh3.a f536094e;

    /* renamed from: f, reason: collision with root package name */
    public static final xh3.a f536095f;

    /* renamed from: g, reason: collision with root package name */
    public static final xh3.a f536096g;

    /* renamed from: h, reason: collision with root package name */
    public static final xh3.a f536097h;

    /* renamed from: i, reason: collision with root package name */
    public static final xh3.a f536098i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ xh3.a[] f536099m;

    static {
        xh3.a aVar = new xh3.a("IDLE", 0);
        f536093d = aVar;
        xh3.a aVar2 = new xh3.a("WAITING", 1);
        f536094e = aVar2;
        xh3.a aVar3 = new xh3.a("PROGRESS", 2);
        f536095f = aVar3;
        xh3.a aVar4 = new xh3.a("CANCEL", 3);
        f536096g = aVar4;
        xh3.a aVar5 = new xh3.a("SUCCESS", 4);
        f536097h = aVar5;
        xh3.a aVar6 = new xh3.a("FAILED", 5);
        f536098i = aVar6;
        xh3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f536099m = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static xh3.a m175556xdce0328(java.lang.String str) {
        return (xh3.a) java.lang.Enum.valueOf(xh3.a.class, str);
    }

    /* renamed from: values */
    public static xh3.a[] m175557xcee59d22() {
        return (xh3.a[]) f536099m.clone();
    }
}
