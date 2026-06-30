package ly0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final ly0.e f403724d;

    /* renamed from: e, reason: collision with root package name */
    public static final ly0.e f403725e;

    /* renamed from: f, reason: collision with root package name */
    public static final ly0.e f403726f;

    /* renamed from: g, reason: collision with root package name */
    public static final ly0.e f403727g;

    /* renamed from: h, reason: collision with root package name */
    public static final ly0.e f403728h;

    /* renamed from: i, reason: collision with root package name */
    public static final ly0.e f403729i;

    /* renamed from: m, reason: collision with root package name */
    public static final ly0.e f403730m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ly0.e[] f403731n;

    static {
        ly0.e eVar = new ly0.e("IDLE", 0);
        f403724d = eVar;
        ly0.e eVar2 = new ly0.e("SENDING_REQUEST", 1);
        f403725e = eVar2;
        ly0.e eVar3 = new ly0.e("WAITING_BYP_EVENT", 2);
        f403726f = eVar3;
        ly0.e eVar4 = new ly0.e("POLLING", 3);
        f403727g = eVar4;
        ly0.e eVar5 = new ly0.e("CANCELED", 4);
        f403728h = eVar5;
        ly0.e eVar6 = new ly0.e(com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.f6097xbb18f1ea, 5);
        ly0.e eVar7 = new ly0.e("ERROR", 6);
        f403729i = eVar7;
        ly0.e eVar8 = new ly0.e("SUCCESS", 7);
        f403730m = eVar8;
        ly0.e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        f403731n = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ly0.e m146514xdce0328(java.lang.String str) {
        return (ly0.e) java.lang.Enum.valueOf(ly0.e.class, str);
    }

    /* renamed from: values */
    public static ly0.e[] m146515xcee59d22() {
        return (ly0.e[]) f403731n.clone();
    }
}
