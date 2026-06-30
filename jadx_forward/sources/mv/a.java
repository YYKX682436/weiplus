package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final mv.a f413002e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.a f413003f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.a f413004g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.a f413005h;

    /* renamed from: i, reason: collision with root package name */
    public static final mv.a f413006i;

    /* renamed from: m, reason: collision with root package name */
    public static final mv.a f413007m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ mv.a[] f413008n;

    /* renamed from: d, reason: collision with root package name */
    public final bw5.m0 f413009d;

    static {
        mv.a aVar = new mv.a("Default", 0, bw5.m0.ENTER_FROM_DEFAULT);
        mv.a aVar2 = new mv.a("Setting", 1, bw5.m0.ENTER_FROM_SETTING);
        f413002e = aVar2;
        mv.a aVar3 = new mv.a("Banner", 2, bw5.m0.ENTER_FROM_BANNER);
        f413003f = aVar3;
        mv.a aVar4 = new mv.a("FtsSearch", 3, bw5.m0.ENTER_FROM_MAIN_SEARCH);
        f413004g = aVar4;
        mv.a aVar5 = new mv.a("WebSearch", 4, bw5.m0.ENTER_FROM_WEB_SEARCH);
        f413005h = aVar5;
        mv.a aVar6 = new mv.a("CameraScan", 5, bw5.m0.ENTER_FROM_CAMERA_SCAN);
        f413006i = aVar6;
        mv.a aVar7 = new mv.a("PcNewXml", 6, bw5.m0.ENTER_FROM_PC_NEW_XML);
        f413007m = aVar7;
        mv.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        f413008n = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, bw5.m0 m0Var) {
        this.f413009d = m0Var;
    }

    /* renamed from: valueOf */
    public static mv.a m148405xdce0328(java.lang.String str) {
        return (mv.a) java.lang.Enum.valueOf(mv.a.class, str);
    }

    /* renamed from: values */
    public static mv.a[] m148406xcee59d22() {
        return (mv.a[]) f413008n.clone();
    }
}
