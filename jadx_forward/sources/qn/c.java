package qn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final qn.c f446410e;

    /* renamed from: f, reason: collision with root package name */
    public static final qn.c f446411f;

    /* renamed from: g, reason: collision with root package name */
    public static final qn.c f446412g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qn.c[] f446413h;

    /* renamed from: d, reason: collision with root package name */
    public final int f446414d;

    static {
        qn.c cVar = new qn.c("Other", 0, 0);
        f446410e = cVar;
        qn.c cVar2 = new qn.c("Self", 1, 1);
        f446411f = cVar2;
        qn.c cVar3 = new qn.c("FileHelper", 2, 2);
        f446412g = cVar3;
        qn.c[] cVarArr = {cVar, cVar2, cVar3};
        f446413h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f446414d = i18;
    }

    /* renamed from: valueOf */
    public static qn.c m160533xdce0328(java.lang.String str) {
        return (qn.c) java.lang.Enum.valueOf(qn.c.class, str);
    }

    /* renamed from: values */
    public static qn.c[] m160534xcee59d22() {
        return (qn.c[]) f446413h.clone();
    }
}
