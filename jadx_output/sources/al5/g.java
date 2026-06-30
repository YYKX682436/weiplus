package al5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final al5.g f5909d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ al5.g[] f5910e;

    static {
        al5.g gVar = new al5.g("CENTER", 0);
        al5.g gVar2 = new al5.g("ABOVE", 1);
        f5909d = gVar2;
        al5.g[] gVarArr = {gVar, gVar2, new al5.g("BELOW", 2), new al5.g("ALIGN_TOP", 3), new al5.g("ALIGN_BOTTOM", 4)};
        f5910e = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static al5.g valueOf(java.lang.String str) {
        return (al5.g) java.lang.Enum.valueOf(al5.g.class, str);
    }

    public static al5.g[] values() {
        return (al5.g[]) f5910e.clone();
    }
}
