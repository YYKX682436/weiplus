package gf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final gf5.c f352915d;

    /* renamed from: e, reason: collision with root package name */
    public static final gf5.c f352916e;

    /* renamed from: f, reason: collision with root package name */
    public static final gf5.c f352917f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gf5.c[] f352918g;

    static {
        gf5.c cVar = new gf5.c("CONTAINS_ANY", 0);
        f352915d = cVar;
        gf5.c cVar2 = new gf5.c("CONTAINS_ALL", 1);
        f352916e = cVar2;
        gf5.c cVar3 = new gf5.c("STARTS_WITH_ANY", 2);
        f352917f = cVar3;
        gf5.c[] cVarArr = {cVar, cVar2, cVar3};
        f352918g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static gf5.c m131458xdce0328(java.lang.String str) {
        return (gf5.c) java.lang.Enum.valueOf(gf5.c.class, str);
    }

    /* renamed from: values */
    public static gf5.c[] m131459xcee59d22() {
        return (gf5.c[]) f352918g.clone();
    }
}
