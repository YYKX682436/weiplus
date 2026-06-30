package so1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final so1.a f491755d;

    /* renamed from: e, reason: collision with root package name */
    public static final so1.a f491756e;

    /* renamed from: f, reason: collision with root package name */
    public static final so1.a f491757f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ so1.a[] f491758g;

    static {
        so1.a aVar = new so1.a("SUPPORTED", 0);
        f491755d = aVar;
        so1.a aVar2 = new so1.a("UNSUPPORTED", 1);
        f491756e = aVar2;
        so1.a aVar3 = new so1.a("UNKNOWN", 2);
        f491757f = aVar3;
        so1.a[] aVarArr = {aVar, aVar2, aVar3};
        f491758g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static so1.a m164838xdce0328(java.lang.String str) {
        return (so1.a) java.lang.Enum.valueOf(so1.a.class, str);
    }

    /* renamed from: values */
    public static so1.a[] m164839xcee59d22() {
        return (so1.a[]) f491758g.clone();
    }
}
