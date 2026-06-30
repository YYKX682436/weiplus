package wb2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final wb2.a f525918d;

    /* renamed from: e, reason: collision with root package name */
    public static final wb2.a f525919e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wb2.a[] f525920f;

    static {
        wb2.a aVar = new wb2.a("None", 0);
        f525918d = aVar;
        wb2.a aVar2 = new wb2.a("Left", 1);
        wb2.a aVar3 = new wb2.a("Right", 2);
        f525919e = aVar3;
        wb2.a[] aVarArr = {aVar, aVar2, aVar3};
        f525920f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static wb2.a m173438xdce0328(java.lang.String str) {
        return (wb2.a) java.lang.Enum.valueOf(wb2.a.class, str);
    }

    /* renamed from: values */
    public static wb2.a[] m173439xcee59d22() {
        return (wb2.a[]) f525920f.clone();
    }
}
