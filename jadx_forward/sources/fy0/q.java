package fy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final fy0.q f348753d;

    /* renamed from: e, reason: collision with root package name */
    public static final fy0.q f348754e;

    /* renamed from: f, reason: collision with root package name */
    public static final fy0.q f348755f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fy0.q[] f348756g;

    static {
        fy0.q qVar = new fy0.q("PLAYER_TIME_CHANGED", 0);
        f348753d = qVar;
        fy0.q qVar2 = new fy0.q("DRAGGING_AUTO_SCROLLING", 1);
        fy0.q qVar3 = new fy0.q("DRAGGING", 2);
        f348754e = qVar3;
        fy0.q qVar4 = new fy0.q("UP", 3);
        f348755f = qVar4;
        fy0.q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
        f348756g = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static fy0.q m130551xdce0328(java.lang.String str) {
        return (fy0.q) java.lang.Enum.valueOf(fy0.q.class, str);
    }

    /* renamed from: values */
    public static fy0.q[] m130552xcee59d22() {
        return (fy0.q[]) f348756g.clone();
    }
}
