package ka3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final ka3.v f387639e;

    /* renamed from: f, reason: collision with root package name */
    public static final ka3.w f387640f;

    /* renamed from: g, reason: collision with root package name */
    public static final ka3.w f387641g;

    /* renamed from: h, reason: collision with root package name */
    public static final ka3.w f387642h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ka3.w[] f387643i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f387644m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f387645d;

    static {
        ka3.w wVar = new ka3.w("WALLET_CN", 0, "cn");
        f387640f = wVar;
        ka3.w wVar2 = new ka3.w("WALLET_HK", 1, "hk");
        f387641g = wVar2;
        ka3.w wVar3 = new ka3.w("WALLET_OTHER", 2, "other");
        f387642h = wVar3;
        ka3.w[] wVarArr = {wVar, wVar2, wVar3};
        f387643i = wVarArr;
        f387644m = rz5.b.a(wVarArr);
        f387639e = new ka3.v(null);
    }

    public w(java.lang.String str, int i17, java.lang.String str2) {
        this.f387645d = str2;
    }

    /* renamed from: valueOf */
    public static ka3.w m142308xdce0328(java.lang.String str) {
        return (ka3.w) java.lang.Enum.valueOf(ka3.w.class, str);
    }

    /* renamed from: values */
    public static ka3.w[] m142309xcee59d22() {
        return (ka3.w[]) f387643i.clone();
    }
}
