package on2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final on2.e f428413d;

    /* renamed from: e, reason: collision with root package name */
    public static final on2.e f428414e;

    /* renamed from: f, reason: collision with root package name */
    public static final on2.e f428415f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ on2.e[] f428416g;

    static {
        on2.e eVar = new on2.e("NONE", 0);
        f428413d = eVar;
        on2.e eVar2 = new on2.e("COUPON_NOT_USED", 1);
        f428414e = eVar2;
        on2.e eVar3 = new on2.e("COUPON_USED", 2);
        f428415f = eVar3;
        on2.e[] eVarArr = {eVar, eVar2, eVar3};
        f428416g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static on2.e m152025xdce0328(java.lang.String str) {
        return (on2.e) java.lang.Enum.valueOf(on2.e.class, str);
    }

    /* renamed from: values */
    public static on2.e[] m152026xcee59d22() {
        return (on2.e[]) f428416g.clone();
    }
}
