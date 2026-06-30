package sr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final sr3.a f493362e;

    /* renamed from: f, reason: collision with root package name */
    public static final sr3.a f493363f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ sr3.a[] f493364g;

    /* renamed from: d, reason: collision with root package name */
    public final int f493365d;

    static {
        sr3.a aVar = new sr3.a("BIZ_ACCOUNTS", 0, 1);
        f493362e = aVar;
        sr3.a aVar2 = new sr3.a("PHOTO_ACCOUNTS", 1, 2);
        f493363f = aVar2;
        sr3.a[] aVarArr = {aVar, aVar2};
        f493364g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f493365d = i18;
    }

    /* renamed from: valueOf */
    public static sr3.a m165123xdce0328(java.lang.String str) {
        return (sr3.a) java.lang.Enum.valueOf(sr3.a.class, str);
    }

    /* renamed from: values */
    public static sr3.a[] m165124xcee59d22() {
        return (sr3.a[]) f493364g.clone();
    }
}
