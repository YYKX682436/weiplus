package b12;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final b12.l f98602e;

    /* renamed from: f, reason: collision with root package name */
    public static final b12.l f98603f;

    /* renamed from: g, reason: collision with root package name */
    public static final b12.l f98604g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b12.l[] f98605h;

    /* renamed from: d, reason: collision with root package name */
    public final int f98606d;

    static {
        b12.l lVar = new b12.l("FREQ_LIMIT", 0, 1);
        f98602e = lVar;
        b12.l lVar2 = new b12.l("SERVER_NOT_ALLOW", 1, 2);
        f98603f = lVar2;
        b12.l lVar3 = new b12.l("REQUEST_FAILED", 2, 3);
        f98604g = lVar3;
        b12.l[] lVarArr = {lVar, lVar2, lVar3};
        f98605h = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f98606d = i18;
    }

    /* renamed from: valueOf */
    public static b12.l m9581xdce0328(java.lang.String str) {
        return (b12.l) java.lang.Enum.valueOf(b12.l.class, str);
    }

    /* renamed from: values */
    public static b12.l[] m9582xcee59d22() {
        return (b12.l[]) f98605h.clone();
    }
}
