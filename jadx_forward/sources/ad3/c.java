package ad3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ad3.c f84696d;

    /* renamed from: e, reason: collision with root package name */
    public static final ad3.c f84697e;

    /* renamed from: f, reason: collision with root package name */
    public static final ad3.c f84698f;

    /* renamed from: g, reason: collision with root package name */
    public static final ad3.c f84699g;

    /* renamed from: h, reason: collision with root package name */
    public static final ad3.c f84700h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ad3.c[] f84701i;

    static {
        ad3.c cVar = new ad3.c("NONE", 0);
        f84696d = cVar;
        ad3.c cVar2 = new ad3.c("PORTRAIT", 1);
        f84697e = cVar2;
        ad3.c cVar3 = new ad3.c("LANDSCAPE", 2);
        f84698f = cVar3;
        ad3.c cVar4 = new ad3.c("REVERSE_PORTRAIT", 3);
        f84699g = cVar4;
        ad3.c cVar5 = new ad3.c("REVERSE_LANDSCAPE", 4);
        f84700h = cVar5;
        ad3.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f84701i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ad3.c m1078xdce0328(java.lang.String str) {
        return (ad3.c) java.lang.Enum.valueOf(ad3.c.class, str);
    }

    /* renamed from: values */
    public static ad3.c[] m1079xcee59d22() {
        return (ad3.c[]) f84701i.clone();
    }
}
