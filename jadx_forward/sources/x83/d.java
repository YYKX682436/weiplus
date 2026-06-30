package x83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final x83.d f534089e;

    /* renamed from: f, reason: collision with root package name */
    public static final x83.d f534090f;

    /* renamed from: g, reason: collision with root package name */
    public static final x83.d f534091g;

    /* renamed from: h, reason: collision with root package name */
    public static final x83.d f534092h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x83.d[] f534093i;

    /* renamed from: d, reason: collision with root package name */
    public final int f534094d;

    static {
        x83.d dVar = new x83.d("LOGIN_RESULT_SUCCESS", 0, 1);
        f534089e = dVar;
        x83.d dVar2 = new x83.d("LOGIN_RESULT_TURN_TO_REG", 1, 2);
        f534090f = dVar2;
        x83.d dVar3 = new x83.d("LOGIN_RESULT_CANCEL", 2, 3);
        f534091g = dVar3;
        x83.d dVar4 = new x83.d("LOGIN_RESULT_FAIL", 3, 4);
        f534092h = dVar4;
        x83.d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f534093i = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f534094d = i18;
    }

    /* renamed from: valueOf */
    public static x83.d m175167xdce0328(java.lang.String str) {
        return (x83.d) java.lang.Enum.valueOf(x83.d.class, str);
    }

    /* renamed from: values */
    public static x83.d[] m175168xcee59d22() {
        return (x83.d[]) f534093i.clone();
    }
}
