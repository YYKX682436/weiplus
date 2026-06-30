package al5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final al5.g f87442d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ al5.g[] f87443e;

    static {
        al5.g gVar = new al5.g("CENTER", 0);
        al5.g gVar2 = new al5.g("ABOVE", 1);
        f87442d = gVar2;
        al5.g[] gVarArr = {gVar, gVar2, new al5.g("BELOW", 2), new al5.g("ALIGN_TOP", 3), new al5.g("ALIGN_BOTTOM", 4)};
        f87443e = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static al5.g m2297xdce0328(java.lang.String str) {
        return (al5.g) java.lang.Enum.valueOf(al5.g.class, str);
    }

    /* renamed from: values */
    public static al5.g[] m2298xcee59d22() {
        return (al5.g[]) f87443e.clone();
    }
}
