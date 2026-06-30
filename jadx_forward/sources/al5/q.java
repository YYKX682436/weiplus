package al5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final al5.q f87521d;

    /* renamed from: e, reason: collision with root package name */
    public static final al5.q f87522e;

    /* renamed from: f, reason: collision with root package name */
    public static final al5.q f87523f;

    /* renamed from: g, reason: collision with root package name */
    public static final al5.q f87524g;

    /* renamed from: h, reason: collision with root package name */
    public static final al5.q f87525h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ al5.q[] f87526i;

    static {
        al5.q qVar = new al5.q("ALWAYS_HIDE", 0);
        f87521d = qVar;
        al5.q qVar2 = new al5.q("ALWAYS_AVOID", 1);
        f87522e = qVar2;
        al5.q qVar3 = new al5.q("ADAPTIVE", 2);
        f87523f = qVar3;
        al5.q qVar4 = new al5.q("IMMERSIVE_SCROLL", 3);
        f87524g = qVar4;
        al5.q qVar5 = new al5.q("AUTO_DETECT", 4);
        f87525h = qVar5;
        al5.q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
        f87526i = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static al5.q m2309xdce0328(java.lang.String str) {
        return (al5.q) java.lang.Enum.valueOf(al5.q.class, str);
    }

    /* renamed from: values */
    public static al5.q[] m2310xcee59d22() {
        return (al5.q[]) f87526i.clone();
    }
}
