package x83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final x83.e f534095e;

    /* renamed from: f, reason: collision with root package name */
    public static final x83.e f534096f;

    /* renamed from: g, reason: collision with root package name */
    public static final x83.e f534097g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x83.e[] f534098h;

    /* renamed from: d, reason: collision with root package name */
    public final int f534099d;

    static {
        x83.e eVar = new x83.e("LOGIN_TYPE_DEFAULT", 0, 0);
        f534095e = eVar;
        x83.e eVar2 = new x83.e("LOGIN_TYPE_BOTH", 1, 1);
        f534096f = eVar2;
        x83.e eVar3 = new x83.e("LOGIN_TYPE_WATCH_ONLY", 2, 2);
        f534097g = eVar3;
        x83.e[] eVarArr = {eVar, eVar2, eVar3};
        f534098h = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f534099d = i18;
    }

    /* renamed from: valueOf */
    public static x83.e m175170xdce0328(java.lang.String str) {
        return (x83.e) java.lang.Enum.valueOf(x83.e.class, str);
    }

    /* renamed from: values */
    public static x83.e[] m175171xcee59d22() {
        return (x83.e[]) f534098h.clone();
    }
}
