package pr4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final pr4.p f439574d;

    /* renamed from: e, reason: collision with root package name */
    public static final pr4.p f439575e;

    /* renamed from: f, reason: collision with root package name */
    public static final pr4.p f439576f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pr4.p[] f439577g;

    static {
        pr4.p pVar = new pr4.p("FAIL", 0);
        f439574d = pVar;
        pr4.p pVar2 = new pr4.p("CANCEL", 1);
        f439575e = pVar2;
        pr4.p pVar3 = new pr4.p("SUCCESS", 2);
        f439576f = pVar3;
        pr4.p[] pVarArr = {pVar, pVar2, pVar3};
        f439577g = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static pr4.p m158924xdce0328(java.lang.String str) {
        return (pr4.p) java.lang.Enum.valueOf(pr4.p.class, str);
    }

    /* renamed from: values */
    public static pr4.p[] m158925xcee59d22() {
        return (pr4.p[]) f439577g.clone();
    }
}
