package f16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final f16.n f340288d;

    /* renamed from: e, reason: collision with root package name */
    public static final f16.n f340289e;

    /* renamed from: f, reason: collision with root package name */
    public static final f16.n f340290f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f16.n[] f340291g;

    static {
        f16.n nVar = new f16.n("FORCE_FLEXIBILITY", 0);
        f340288d = nVar;
        f16.n nVar2 = new f16.n("NULLABLE", 1);
        f340289e = nVar2;
        f16.n nVar3 = new f16.n("NOT_NULL", 2);
        f340290f = nVar3;
        f16.n[] nVarArr = {nVar, nVar2, nVar3};
        f340291g = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static f16.n m128728xdce0328(java.lang.String str) {
        return (f16.n) java.lang.Enum.valueOf(f16.n.class, str);
    }

    /* renamed from: values */
    public static f16.n[] m128729xcee59d22() {
        return (f16.n[]) f340291g.clone();
    }
}
