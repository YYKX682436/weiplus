package cx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final cx0.a f306026d;

    /* renamed from: e, reason: collision with root package name */
    public static final cx0.a f306027e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cx0.a[] f306028f;

    static {
        cx0.a aVar = new cx0.a("Undo", 0);
        f306026d = aVar;
        cx0.a aVar2 = new cx0.a("Redo", 1);
        f306027e = aVar2;
        cx0.a[] aVarArr = {aVar, aVar2};
        f306028f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cx0.a m123058xdce0328(java.lang.String str) {
        return (cx0.a) java.lang.Enum.valueOf(cx0.a.class, str);
    }

    /* renamed from: values */
    public static cx0.a[] m123059xcee59d22() {
        return (cx0.a[]) f306028f.clone();
    }
}
