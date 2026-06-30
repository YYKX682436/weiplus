package q16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final q16.a f441230f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q16.a[] f441231g;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f441232d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441233e;

    static {
        q16.a aVar = new q16.a("NO_ARGUMENTS", 0, false, false, 3, null);
        f441230f = aVar;
        q16.a[] aVarArr = {aVar, new q16.a("UNLESS_EMPTY", 1, true, false, 2, null), new q16.a("ALWAYS_PARENTHESIZED", 2, true, true)};
        f441231g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, boolean z17, boolean z18) {
        this.f441232d = z17;
        this.f441233e = z18;
    }

    /* renamed from: valueOf */
    public static q16.a m159404xdce0328(java.lang.String str) {
        return (q16.a) java.lang.Enum.valueOf(q16.a.class, str);
    }

    /* renamed from: values */
    public static q16.a[] m159405xcee59d22() {
        return (q16.a[]) f441231g.clone();
    }

    public /* synthetic */ a(java.lang.String str, int i17, boolean z17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i18 & 1) != 0 ? false : z17, (i18 & 2) != 0 ? false : z18);
    }
}
