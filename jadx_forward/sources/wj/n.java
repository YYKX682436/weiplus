package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.n f527980d;

    /* renamed from: e, reason: collision with root package name */
    public static final wj.n f527981e;

    /* renamed from: f, reason: collision with root package name */
    public static final wj.n f527982f;

    /* renamed from: g, reason: collision with root package name */
    public static final wj.n f527983g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wj.n[] f527984h;

    static {
        wj.n nVar = new wj.n("NotFound", 0);
        f527980d = nVar;
        wj.n nVar2 = new wj.n("NoInstall", 1);
        f527981e = nVar2;
        wj.n nVar3 = new wj.n("InstallNotMatchVersion", 2);
        f527982f = nVar3;
        wj.n nVar4 = new wj.n("InstallMatchVersion", 3);
        f527983g = nVar4;
        wj.n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f527984h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static wj.n m173900xdce0328(java.lang.String str) {
        return (wj.n) java.lang.Enum.valueOf(wj.n.class, str);
    }

    /* renamed from: values */
    public static wj.n[] m173901xcee59d22() {
        return (wj.n[]) f527984h.clone();
    }
}
