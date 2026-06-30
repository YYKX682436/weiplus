package hd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final hd1.c f361926d;

    /* renamed from: e, reason: collision with root package name */
    public static final hd1.c f361927e;

    /* renamed from: f, reason: collision with root package name */
    public static final hd1.c f361928f;

    /* renamed from: g, reason: collision with root package name */
    public static final hd1.c f361929g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ hd1.c[] f361930h;

    static {
        hd1.c cVar = new hd1.c("SUCCESS", 0);
        f361926d = cVar;
        hd1.c cVar2 = new hd1.c("FAIL_SYSTEM_INTERNAL_ERROR", 1);
        f361927e = cVar2;
        hd1.c cVar3 = new hd1.c("FAIL_ALREADY_STARTED", 2);
        f361928f = cVar3;
        hd1.c cVar4 = new hd1.c("FAIL_NOT_STARTED", 3);
        f361929g = cVar4;
        hd1.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f361930h = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static hd1.c m133214xdce0328(java.lang.String str) {
        return (hd1.c) java.lang.Enum.valueOf(hd1.c.class, str);
    }

    /* renamed from: values */
    public static hd1.c[] m133215xcee59d22() {
        return (hd1.c[]) f361930h.clone();
    }
}
