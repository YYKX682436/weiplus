package m05;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final m05.n f404110d;

    /* renamed from: e, reason: collision with root package name */
    public static final m05.n f404111e;

    /* renamed from: f, reason: collision with root package name */
    public static final m05.n f404112f;

    /* renamed from: g, reason: collision with root package name */
    public static final m05.n f404113g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m05.n[] f404114h;

    static {
        m05.n nVar = new m05.n("Event_OnCreate", 0);
        f404110d = nVar;
        m05.n nVar2 = new m05.n("Event_OnStart", 1);
        f404111e = nVar2;
        m05.n nVar3 = new m05.n("Event_OnResume", 2);
        f404112f = nVar3;
        m05.n nVar4 = new m05.n("Event_OnPause", 3);
        m05.n nVar5 = new m05.n("Event_OnStop", 4);
        m05.n nVar6 = new m05.n("Event_OnDestroy", 5);
        m05.n nVar7 = new m05.n("Event_Custom", 6);
        f404113g = nVar7;
        m05.n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
        f404114h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static m05.n m146594xdce0328(java.lang.String str) {
        return (m05.n) java.lang.Enum.valueOf(m05.n.class, str);
    }

    /* renamed from: values */
    public static m05.n[] m146595xcee59d22() {
        return (m05.n[]) f404114h.clone();
    }
}
