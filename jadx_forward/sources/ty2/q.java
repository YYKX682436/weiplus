package ty2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final ty2.q f504638e;

    /* renamed from: f, reason: collision with root package name */
    public static final ty2.q f504639f;

    /* renamed from: g, reason: collision with root package name */
    public static final ty2.q f504640g;

    /* renamed from: h, reason: collision with root package name */
    public static final ty2.q f504641h;

    /* renamed from: i, reason: collision with root package name */
    public static final ty2.q f504642i;

    /* renamed from: m, reason: collision with root package name */
    public static final ty2.q f504643m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ty2.q[] f504644n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f504645d;

    static {
        ty2.q qVar = new ty2.q("IMG", 0, "头图");
        f504638e = qVar;
        ty2.q qVar2 = new ty2.q("TITLE", 1, "商品名");
        f504639f = qVar2;
        ty2.q qVar3 = new ty2.q("LABEL", 2, "商品标签");
        f504640g = qVar3;
        ty2.q qVar4 = new ty2.q("PRICE", 3, "商品价格");
        f504641h = qVar4;
        ty2.q qVar5 = new ty2.q("PLATFORM_NAME", 4, "店铺名");
        f504642i = qVar5;
        ty2.q qVar6 = new ty2.q("EMPTY", 5, "空视图");
        f504643m = qVar6;
        ty2.q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6};
        f504644n = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17, java.lang.String str2) {
        this.f504645d = str2;
    }

    /* renamed from: valueOf */
    public static ty2.q m167231xdce0328(java.lang.String str) {
        return (ty2.q) java.lang.Enum.valueOf(ty2.q.class, str);
    }

    /* renamed from: values */
    public static ty2.q[] m167232xcee59d22() {
        return (ty2.q[]) f504644n.clone();
    }
}
