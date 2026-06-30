package td2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final td2.a f499151d;

    /* renamed from: e, reason: collision with root package name */
    public static final td2.a f499152e;

    /* renamed from: f, reason: collision with root package name */
    public static final td2.a f499153f;

    /* renamed from: g, reason: collision with root package name */
    public static final td2.a f499154g;

    /* renamed from: h, reason: collision with root package name */
    public static final td2.a f499155h;

    /* renamed from: i, reason: collision with root package name */
    public static final td2.a f499156i;

    /* renamed from: m, reason: collision with root package name */
    public static final td2.a f499157m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ td2.a[] f499158n;

    static {
        td2.a aVar = new td2.a("ON_CREATE", 0);
        f499151d = aVar;
        td2.a aVar2 = new td2.a("ON_START", 1);
        f499152e = aVar2;
        td2.a aVar3 = new td2.a("ON_RESUME", 2);
        f499153f = aVar3;
        td2.a aVar4 = new td2.a("ON_PAUSE", 3);
        f499154g = aVar4;
        td2.a aVar5 = new td2.a("ON_STOP", 4);
        f499155h = aVar5;
        td2.a aVar6 = new td2.a("ON_DESTROY", 5);
        f499156i = aVar6;
        td2.a aVar7 = new td2.a("ON_ANY", 6);
        f499157m = aVar7;
        td2.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f499158n = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static td2.a m166274xdce0328(java.lang.String str) {
        return (td2.a) java.lang.Enum.valueOf(td2.a.class, str);
    }

    /* renamed from: values */
    public static td2.a[] m166275xcee59d22() {
        return (td2.a[]) f499158n.clone();
    }
}
