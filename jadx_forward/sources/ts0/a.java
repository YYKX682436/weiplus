package ts0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final ts0.a f503048d;

    /* renamed from: e, reason: collision with root package name */
    public static final ts0.a f503049e;

    /* renamed from: f, reason: collision with root package name */
    public static final ts0.a f503050f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ts0.a[] f503051g;

    static {
        ts0.a aVar = new ts0.a("CAMERA_IS_DEFAULT", 0, -1);
        f503048d = aVar;
        ts0.a aVar2 = new ts0.a("CAMERA_IS_PREVIEWING", 1, 0);
        f503049e = aVar2;
        ts0.a aVar3 = new ts0.a("CAMERA_IS_CAPTURING", 2, 1);
        f503050f = aVar3;
        ts0.a[] aVarArr = {aVar, aVar2, aVar3};
        f503051g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static ts0.a m166996xdce0328(java.lang.String str) {
        return (ts0.a) java.lang.Enum.valueOf(ts0.a.class, str);
    }

    /* renamed from: values */
    public static ts0.a[] m166997xcee59d22() {
        return (ts0.a[]) f503051g.clone();
    }
}
