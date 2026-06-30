package og3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final og3.a f426688d;

    /* renamed from: e, reason: collision with root package name */
    public static final og3.a f426689e;

    /* renamed from: f, reason: collision with root package name */
    public static final og3.a f426690f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ og3.a[] f426691g;

    static {
        og3.a aVar = new og3.a("VIDEO", 0);
        f426688d = aVar;
        og3.a aVar2 = new og3.a("AUDIO", 1);
        og3.a aVar3 = new og3.a("IMAGE", 2);
        f426689e = aVar3;
        og3.a aVar4 = new og3.a("THUMB", 3);
        f426690f = aVar4;
        og3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f426691g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static og3.a m151254xdce0328(java.lang.String str) {
        return (og3.a) java.lang.Enum.valueOf(og3.a.class, str);
    }

    /* renamed from: values */
    public static og3.a[] m151255xcee59d22() {
        return (og3.a[]) f426691g.clone();
    }
}
