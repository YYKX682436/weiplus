package wu2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final wu2.q f531228e;

    /* renamed from: f, reason: collision with root package name */
    public static final wu2.q f531229f;

    /* renamed from: g, reason: collision with root package name */
    public static final wu2.q f531230g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wu2.q[] f531231h;

    /* renamed from: d, reason: collision with root package name */
    public final int f531232d;

    static {
        wu2.q qVar = new wu2.q("Default", 0, 0);
        f531228e = qVar;
        wu2.q qVar2 = new wu2.q("Click", 1, 1);
        f531229f = qVar2;
        wu2.q qVar3 = new wu2.q("Scroll", 2, 2);
        f531230g = qVar3;
        wu2.q[] qVarArr = {qVar, qVar2, qVar3};
        f531231h = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17, int i18) {
        this.f531232d = i18;
    }

    /* renamed from: valueOf */
    public static wu2.q m174456xdce0328(java.lang.String str) {
        return (wu2.q) java.lang.Enum.valueOf(wu2.q.class, str);
    }

    /* renamed from: values */
    public static wu2.q[] m174457xcee59d22() {
        return (wu2.q[]) f531231h.clone();
    }
}
