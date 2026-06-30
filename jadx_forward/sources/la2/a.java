package la2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final la2.a f399033d;

    /* renamed from: e, reason: collision with root package name */
    public static final la2.a f399034e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ la2.a[] f399035f;

    static {
        la2.a aVar = new la2.a("None", 0);
        la2.a aVar2 = new la2.a("PoiDrawer", 1);
        f399033d = aVar2;
        la2.a aVar3 = new la2.a("HalfScreenDrawer", 2);
        f399034e = aVar3;
        la2.a[] aVarArr = {aVar, aVar2, aVar3};
        f399035f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static la2.a m145460xdce0328(java.lang.String str) {
        return (la2.a) java.lang.Enum.valueOf(la2.a.class, str);
    }

    /* renamed from: values */
    public static la2.a[] m145461xcee59d22() {
        return (la2.a[]) f399035f.clone();
    }
}
