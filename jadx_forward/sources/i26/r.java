package i26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final i26.r f369622e;

    /* renamed from: f, reason: collision with root package name */
    public static final i26.r f369623f;

    /* renamed from: g, reason: collision with root package name */
    public static final i26.r f369624g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i26.r[] f369625h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f369626d;

    static {
        i26.r rVar = new i26.r("IN", 0, "in");
        f369622e = rVar;
        i26.r rVar2 = new i26.r("OUT", 1, "out");
        f369623f = rVar2;
        i26.r rVar3 = new i26.r("INV", 2, "");
        f369624g = rVar3;
        i26.r[] rVarArr = {rVar, rVar2, rVar3};
        f369625h = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17, java.lang.String str2) {
        this.f369626d = str2;
    }

    /* renamed from: valueOf */
    public static i26.r m134676xdce0328(java.lang.String str) {
        return (i26.r) java.lang.Enum.valueOf(i26.r.class, str);
    }

    /* renamed from: values */
    public static i26.r[] m134677xcee59d22() {
        return (i26.r[]) f369625h.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f369626d;
    }
}
