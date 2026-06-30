package d12;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final d12.a f307241d;

    /* renamed from: e, reason: collision with root package name */
    public static final d12.a f307242e;

    /* renamed from: f, reason: collision with root package name */
    public static final d12.a f307243f;

    /* renamed from: g, reason: collision with root package name */
    public static final d12.a f307244g;

    /* renamed from: h, reason: collision with root package name */
    public static final d12.a f307245h;

    /* renamed from: i, reason: collision with root package name */
    public static final d12.a f307246i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ d12.a[] f307247m;

    static {
        d12.a aVar = new d12.a("Succeed", 0);
        f307241d = aVar;
        d12.a aVar2 = new d12.a("Failed", 1);
        f307242e = aVar2;
        d12.a aVar3 = new d12.a("Denied", 2);
        f307243f = aVar3;
        d12.a aVar4 = new d12.a("FatalError", 3);
        f307244g = aVar4;
        d12.a aVar5 = new d12.a("LoadMaterialFailed", 4);
        f307245h = aVar5;
        d12.a aVar6 = new d12.a("NoMaterial", 5);
        f307246i = aVar6;
        d12.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f307247m = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static d12.a m123356xdce0328(java.lang.String str) {
        return (d12.a) java.lang.Enum.valueOf(d12.a.class, str);
    }

    /* renamed from: values */
    public static d12.a[] m123357xcee59d22() {
        return (d12.a[]) f307247m.clone();
    }
}
