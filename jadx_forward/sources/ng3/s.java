package ng3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ng3.s f418561d;

    /* renamed from: e, reason: collision with root package name */
    public static final ng3.s f418562e;

    /* renamed from: f, reason: collision with root package name */
    public static final ng3.s f418563f;

    /* renamed from: g, reason: collision with root package name */
    public static final ng3.s f418564g;

    /* renamed from: h, reason: collision with root package name */
    public static final ng3.s f418565h;

    /* renamed from: i, reason: collision with root package name */
    public static final ng3.s f418566i;

    /* renamed from: m, reason: collision with root package name */
    public static final ng3.s f418567m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ng3.s[] f418568n;

    static {
        ng3.s sVar = new ng3.s("IDLE", 0);
        f418561d = sVar;
        ng3.s sVar2 = new ng3.s("IDLE_VERTICAL_MOVE_ING", 1);
        f418562e = sVar2;
        ng3.s sVar3 = new ng3.s("PREVIEW_IDLE", 2);
        f418563f = sVar3;
        ng3.s sVar4 = new ng3.s("PREVIEW_SCALE_ING", 3);
        f418564g = sVar4;
        ng3.s sVar5 = new ng3.s("PREVIEW_SCALE_WAIT", 4);
        f418565h = sVar5;
        ng3.s sVar6 = new ng3.s("PREVIEW_MOVE_ING", 5);
        f418566i = sVar6;
        ng3.s sVar7 = new ng3.s("DRAG_EXIT_ING", 6);
        f418567m = sVar7;
        ng3.s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7};
        f418568n = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ng3.s m149569xdce0328(java.lang.String str) {
        return (ng3.s) java.lang.Enum.valueOf(ng3.s.class, str);
    }

    /* renamed from: values */
    public static ng3.s[] m149570xcee59d22() {
        return (ng3.s[]) f418568n.clone();
    }
}
