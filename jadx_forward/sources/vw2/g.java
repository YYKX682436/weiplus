package vw2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final vw2.g f522373d;

    /* renamed from: e, reason: collision with root package name */
    public static final vw2.g f522374e;

    /* renamed from: f, reason: collision with root package name */
    public static final vw2.g f522375f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vw2.g[] f522376g;

    static {
        vw2.g gVar = new vw2.g("OneInterceptorPerHolder", 0);
        f522373d = gVar;
        vw2.g gVar2 = new vw2.g("OncePerHolder", 1);
        f522374e = gVar2;
        vw2.g gVar3 = new vw2.g("Unlimited", 2);
        f522375f = gVar3;
        vw2.g[] gVarArr = {gVar, gVar2, gVar3};
        f522376g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vw2.g m172823xdce0328(java.lang.String str) {
        return (vw2.g) java.lang.Enum.valueOf(vw2.g.class, str);
    }

    /* renamed from: values */
    public static vw2.g[] m172824xcee59d22() {
        return (vw2.g[]) f522376g.clone();
    }
}
