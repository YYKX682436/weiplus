package oz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final oz.l f431700d;

    /* renamed from: e, reason: collision with root package name */
    public static final oz.l f431701e;

    /* renamed from: f, reason: collision with root package name */
    public static final oz.l f431702f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ oz.l[] f431703g;

    static {
        oz.l lVar = new oz.l("DELETE", 0);
        f431700d = lVar;
        oz.l lVar2 = new oz.l("RUNNING", 1);
        f431701e = lVar2;
        oz.l lVar3 = new oz.l("SKIP", 2);
        f431702f = lVar3;
        oz.l[] lVarArr = {lVar, lVar2, lVar3};
        f431703g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static oz.l m157475xdce0328(java.lang.String str) {
        return (oz.l) java.lang.Enum.valueOf(oz.l.class, str);
    }

    /* renamed from: values */
    public static oz.l[] m157476xcee59d22() {
        return (oz.l[]) f431703g.clone();
    }
}
