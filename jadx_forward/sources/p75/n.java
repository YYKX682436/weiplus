package p75;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final p75.n f434206e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p75.n[] f434207f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f434208d;

    static {
        p75.n nVar = new p75.n("And", 0, "&");
        f434206e = nVar;
        p75.n[] nVarArr = {nVar, new p75.n("Or", 1, "|")};
        f434207f = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, java.lang.String str2) {
        this.f434208d = str2;
    }

    /* renamed from: valueOf */
    public static p75.n m157949xdce0328(java.lang.String str) {
        return (p75.n) java.lang.Enum.valueOf(p75.n.class, str);
    }

    /* renamed from: values */
    public static p75.n[] m157950xcee59d22() {
        return (p75.n[]) f434207f.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f434208d;
    }
}
