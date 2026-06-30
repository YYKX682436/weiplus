package pk1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final pk1.s f437050e;

    /* renamed from: f, reason: collision with root package name */
    public static final pk1.t f437051f;

    /* renamed from: g, reason: collision with root package name */
    public static final pk1.t f437052g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pk1.t[] f437053h;

    /* renamed from: d, reason: collision with root package name */
    public final int f437054d;

    static {
        pk1.t tVar = new pk1.t("NOT_PROXY", 0, 0);
        f437051f = tVar;
        pk1.t tVar2 = new pk1.t("PROXY_DEFAULT", 1, 1);
        pk1.t tVar3 = new pk1.t("PROXY_CDN", 2, 2);
        f437052g = tVar3;
        pk1.t[] tVarArr = {tVar, tVar2, tVar3};
        f437053h = tVarArr;
        rz5.b.a(tVarArr);
        f437050e = new pk1.s(null);
    }

    public t(java.lang.String str, int i17, int i18) {
        this.f437054d = i18;
    }

    /* renamed from: valueOf */
    public static pk1.t m158625xdce0328(java.lang.String str) {
        return (pk1.t) java.lang.Enum.valueOf(pk1.t.class, str);
    }

    /* renamed from: values */
    public static pk1.t[] m158626xcee59d22() {
        return (pk1.t[]) f437053h.clone();
    }
}
