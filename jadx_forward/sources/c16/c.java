package c16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c16.c f119483d;

    /* renamed from: e, reason: collision with root package name */
    public static final c16.c f119484e;

    /* renamed from: f, reason: collision with root package name */
    public static final c16.c f119485f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c16.c[] f119486g;

    static {
        c16.c cVar = new c16.c("INFLEXIBLE", 0);
        f119483d = cVar;
        c16.c cVar2 = new c16.c("FLEXIBLE_UPPER_BOUND", 1);
        f119484e = cVar2;
        c16.c cVar3 = new c16.c("FLEXIBLE_LOWER_BOUND", 2);
        f119485f = cVar3;
        c16.c[] cVarArr = {cVar, cVar2, cVar3};
        f119486g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static c16.c m14038xdce0328(java.lang.String str) {
        return (c16.c) java.lang.Enum.valueOf(c16.c.class, str);
    }

    /* renamed from: values */
    public static c16.c[] m14039xcee59d22() {
        return (c16.c[]) f119486g.clone();
    }
}
