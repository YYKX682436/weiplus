package eh5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final eh5.a f334484d;

    /* renamed from: e, reason: collision with root package name */
    public static final eh5.a f334485e;

    /* renamed from: f, reason: collision with root package name */
    public static final eh5.a f334486f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ eh5.a[] f334487g;

    static {
        eh5.a aVar = new eh5.a("Header", 0);
        f334484d = aVar;
        eh5.a aVar2 = new eh5.a("Footer", 1);
        f334485e = aVar2;
        eh5.a aVar3 = new eh5.a("Content", 2);
        eh5.a aVar4 = new eh5.a("Overlay", 3);
        f334486f = aVar4;
        eh5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f334487g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static eh5.a m127737xdce0328(java.lang.String str) {
        return (eh5.a) java.lang.Enum.valueOf(eh5.a.class, str);
    }

    /* renamed from: values */
    public static eh5.a[] m127738xcee59d22() {
        return (eh5.a[]) f334487g.clone();
    }
}
