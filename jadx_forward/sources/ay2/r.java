package ay2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final ay2.r f96799e;

    /* renamed from: f, reason: collision with root package name */
    public static final ay2.r f96800f;

    /* renamed from: g, reason: collision with root package name */
    public static final ay2.r f96801g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ay2.r[] f96802h;

    /* renamed from: d, reason: collision with root package name */
    public final int f96803d;

    static {
        ay2.r rVar = new ay2.r("Cancel", 0, 0);
        f96799e = rVar;
        ay2.r rVar2 = new ay2.r("Confirm", 1, 1);
        f96800f = rVar2;
        ay2.r rVar3 = new ay2.r("Close", 2, 2);
        f96801g = rVar3;
        ay2.r[] rVarArr = {rVar, rVar2, rVar3};
        f96802h = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17, int i18) {
        this.f96803d = i18;
    }

    /* renamed from: valueOf */
    public static ay2.r m9304xdce0328(java.lang.String str) {
        return (ay2.r) java.lang.Enum.valueOf(ay2.r.class, str);
    }

    /* renamed from: values */
    public static ay2.r[] m9305xcee59d22() {
        return (ay2.r[]) f96802h.clone();
    }
}
