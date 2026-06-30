package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.a f491773d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.a f491774e;

    /* renamed from: f, reason: collision with root package name */
    public static final so2.a f491775f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ so2.a[] f491776g;

    static {
        so2.a aVar = new so2.a("NONE", 0);
        f491773d = aVar;
        so2.a aVar2 = new so2.a("MODIFY", 1);
        f491774e = aVar2;
        so2.a aVar3 = new so2.a("DELETE", 2);
        f491775f = aVar3;
        so2.a[] aVarArr = {aVar, aVar2, aVar3};
        f491776g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static so2.a m164844xdce0328(java.lang.String str) {
        return (so2.a) java.lang.Enum.valueOf(so2.a.class, str);
    }

    /* renamed from: values */
    public static so2.a[] m164845xcee59d22() {
        return (so2.a[]) f491776g.clone();
    }
}
