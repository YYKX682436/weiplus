package fy3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final fy3.i f348778d;

    /* renamed from: e, reason: collision with root package name */
    public static final fy3.i f348779e;

    /* renamed from: f, reason: collision with root package name */
    public static final fy3.i f348780f;

    /* renamed from: g, reason: collision with root package name */
    public static final fy3.i f348781g;

    /* renamed from: h, reason: collision with root package name */
    public static final fy3.i f348782h;

    /* renamed from: i, reason: collision with root package name */
    public static final fy3.i f348783i;

    /* renamed from: m, reason: collision with root package name */
    public static final fy3.i f348784m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ fy3.i[] f348785n;

    static {
        fy3.i iVar = new fy3.i("Idle", 0);
        f348778d = iVar;
        fy3.i iVar2 = new fy3.i("Ready", 1);
        f348779e = iVar2;
        fy3.i iVar3 = new fy3.i("CheckingRes", 2);
        f348780f = iVar3;
        fy3.i iVar4 = new fy3.i("ConnectingService", 3);
        f348781g = iVar4;
        fy3.i iVar5 = new fy3.i("ServiceReady", 4);
        f348782h = iVar5;
        fy3.i iVar6 = new fy3.i("LoggingIn", 5);
        f348783i = iVar6;
        fy3.i iVar7 = new fy3.i("LoggedIn", 6);
        f348784m = iVar7;
        fy3.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
        f348785n = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static fy3.i m130560xdce0328(java.lang.String str) {
        return (fy3.i) java.lang.Enum.valueOf(fy3.i.class, str);
    }

    /* renamed from: values */
    public static fy3.i[] m130561xcee59d22() {
        return (fy3.i[]) f348785n.clone();
    }
}
