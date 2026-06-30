package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.e f539317e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.e f539318f;

    /* renamed from: g, reason: collision with root package name */
    public static final xx.e f539319g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xx.e[] f539320h;

    /* renamed from: d, reason: collision with root package name */
    public final int f539321d;

    static {
        xx.e eVar = new xx.e("AITalkingDone", 0, 1);
        f539317e = eVar;
        xx.e eVar2 = new xx.e("UserInterrupt", 1, 2);
        f539318f = eVar2;
        xx.e eVar3 = new xx.e("UserExitRoom", 2, 3);
        f539319g = eVar3;
        xx.e[] eVarArr = {eVar, eVar2, eVar3};
        f539320h = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f539321d = i18;
    }

    /* renamed from: valueOf */
    public static xx.e m176139xdce0328(java.lang.String str) {
        return (xx.e) java.lang.Enum.valueOf(xx.e.class, str);
    }

    /* renamed from: values */
    public static xx.e[] m176140xcee59d22() {
        return (xx.e[]) f539320h.clone();
    }
}
