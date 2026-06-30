package ab1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final ab1.b f2709e;

    /* renamed from: f, reason: collision with root package name */
    public static final ab1.c f2710f;

    /* renamed from: g, reason: collision with root package name */
    public static final ab1.c f2711g;

    /* renamed from: h, reason: collision with root package name */
    public static final ab1.c f2712h;

    /* renamed from: i, reason: collision with root package name */
    public static final ab1.c f2713i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ab1.c[] f2714m;

    /* renamed from: d, reason: collision with root package name */
    public final int f2715d;

    static {
        ab1.c cVar = new ab1.c("PROVINCE", 0, 1);
        f2710f = cVar;
        ab1.c cVar2 = new ab1.c("CITY", 1, 2);
        f2711g = cVar2;
        ab1.c cVar3 = new ab1.c("REGION", 2, 3);
        f2712h = cVar3;
        ab1.c cVar4 = new ab1.c("DISTRICT", 3, 4);
        f2713i = cVar4;
        ab1.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f2714m = cVarArr;
        rz5.b.a(cVarArr);
        f2709e = new ab1.b(null);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f2715d = i18;
    }

    public static ab1.c valueOf(java.lang.String str) {
        return (ab1.c) java.lang.Enum.valueOf(ab1.c.class, str);
    }

    public static ab1.c[] values() {
        return (ab1.c[]) f2714m.clone();
    }
}
