package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.c f539307e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.c f539308f;

    /* renamed from: g, reason: collision with root package name */
    public static final xx.c f539309g;

    /* renamed from: h, reason: collision with root package name */
    public static final xx.c f539310h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ xx.c[] f539311i;

    /* renamed from: d, reason: collision with root package name */
    public final int f539312d;

    static {
        xx.c cVar = new xx.c("TimeOut", 0, 1);
        f539307e = cVar;
        xx.c cVar2 = new xx.c("UserExitRoom", 1, 2);
        f539308f = cVar2;
        xx.c cVar3 = new xx.c("UserSpeak", 2, 3);
        f539309g = cVar3;
        xx.c cVar4 = new xx.c("AIAnswer", 3, 4);
        f539310h = cVar4;
        xx.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f539311i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f539312d = i18;
    }

    /* renamed from: valueOf */
    public static xx.c m176133xdce0328(java.lang.String str) {
        return (xx.c) java.lang.Enum.valueOf(xx.c.class, str);
    }

    /* renamed from: values */
    public static xx.c[] m176134xcee59d22() {
        return (xx.c[]) f539311i.clone();
    }
}
