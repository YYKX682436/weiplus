package n70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final n70.c f416779d;

    /* renamed from: e, reason: collision with root package name */
    public static final n70.c f416780e;

    /* renamed from: f, reason: collision with root package name */
    public static final n70.c f416781f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n70.c[] f416782g;

    static {
        n70.c cVar = new n70.c("Success", 0);
        f416779d = cVar;
        n70.c cVar2 = new n70.c("PrepareError", 1);
        f416780e = cVar2;
        n70.c cVar3 = new n70.c("DBError", 2);
        f416781f = cVar3;
        n70.c[] cVarArr = {cVar, cVar2, cVar3, new n70.c("Error", 3)};
        f416782g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static n70.c m149168xdce0328(java.lang.String str) {
        return (n70.c) java.lang.Enum.valueOf(n70.c.class, str);
    }

    /* renamed from: values */
    public static n70.c[] m149169xcee59d22() {
        return (n70.c[]) f416782g.clone();
    }
}
