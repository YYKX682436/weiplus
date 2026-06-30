package td1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final td1.l f499141e;

    /* renamed from: f, reason: collision with root package name */
    public static final td1.l f499142f;

    /* renamed from: g, reason: collision with root package name */
    public static final td1.l f499143g;

    /* renamed from: h, reason: collision with root package name */
    public static final td1.l f499144h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ td1.l[] f499145i;

    /* renamed from: d, reason: collision with root package name */
    public final int f499146d;

    static {
        td1.l lVar = new td1.l("OK", 0, 0);
        f499141e = lVar;
        td1.l lVar2 = new td1.l("FAIL_OTHER", 1, 1);
        f499142f = lVar2;
        td1.l lVar3 = new td1.l("FAIL_ADD_STAR_REACHED_MAXIMUM_LIMIT", 2, 2);
        f499143g = lVar3;
        td1.l lVar4 = new td1.l("FAIL_ADD_STAR_BLOCKED", 3, 3);
        f499144h = lVar4;
        td1.l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f499145i = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f499146d = i18;
    }

    /* renamed from: valueOf */
    public static td1.l m166270xdce0328(java.lang.String str) {
        return (td1.l) java.lang.Enum.valueOf(td1.l.class, str);
    }

    /* renamed from: values */
    public static td1.l[] m166271xcee59d22() {
        return (td1.l[]) f499145i.clone();
    }
}
