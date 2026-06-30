package al5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final al5.q f5988d;

    /* renamed from: e, reason: collision with root package name */
    public static final al5.q f5989e;

    /* renamed from: f, reason: collision with root package name */
    public static final al5.q f5990f;

    /* renamed from: g, reason: collision with root package name */
    public static final al5.q f5991g;

    /* renamed from: h, reason: collision with root package name */
    public static final al5.q f5992h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ al5.q[] f5993i;

    static {
        al5.q qVar = new al5.q("ALWAYS_HIDE", 0);
        f5988d = qVar;
        al5.q qVar2 = new al5.q("ALWAYS_AVOID", 1);
        f5989e = qVar2;
        al5.q qVar3 = new al5.q("ADAPTIVE", 2);
        f5990f = qVar3;
        al5.q qVar4 = new al5.q("IMMERSIVE_SCROLL", 3);
        f5991g = qVar4;
        al5.q qVar5 = new al5.q("AUTO_DETECT", 4);
        f5992h = qVar5;
        al5.q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
        f5993i = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static al5.q valueOf(java.lang.String str) {
        return (al5.q) java.lang.Enum.valueOf(al5.q.class, str);
    }

    public static al5.q[] values() {
        return (al5.q[]) f5993i.clone();
    }
}
