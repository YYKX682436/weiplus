package ab1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final ab1.b f84242e;

    /* renamed from: f, reason: collision with root package name */
    public static final ab1.c f84243f;

    /* renamed from: g, reason: collision with root package name */
    public static final ab1.c f84244g;

    /* renamed from: h, reason: collision with root package name */
    public static final ab1.c f84245h;

    /* renamed from: i, reason: collision with root package name */
    public static final ab1.c f84246i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ab1.c[] f84247m;

    /* renamed from: d, reason: collision with root package name */
    public final int f84248d;

    static {
        ab1.c cVar = new ab1.c("PROVINCE", 0, 1);
        f84243f = cVar;
        ab1.c cVar2 = new ab1.c("CITY", 1, 2);
        f84244g = cVar2;
        ab1.c cVar3 = new ab1.c("REGION", 2, 3);
        f84245h = cVar3;
        ab1.c cVar4 = new ab1.c("DISTRICT", 3, 4);
        f84246i = cVar4;
        ab1.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f84247m = cVarArr;
        rz5.b.a(cVarArr);
        f84242e = new ab1.b(null);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f84248d = i18;
    }

    /* renamed from: valueOf */
    public static ab1.c m963xdce0328(java.lang.String str) {
        return (ab1.c) java.lang.Enum.valueOf(ab1.c.class, str);
    }

    /* renamed from: values */
    public static ab1.c[] m964xcee59d22() {
        return (ab1.c[]) f84247m.clone();
    }
}
