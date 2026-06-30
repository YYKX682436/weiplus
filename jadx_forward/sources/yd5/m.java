package yd5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final yd5.m f542651e;

    /* renamed from: f, reason: collision with root package name */
    public static final yd5.m f542652f;

    /* renamed from: g, reason: collision with root package name */
    public static final yd5.m f542653g;

    /* renamed from: h, reason: collision with root package name */
    public static final yd5.m f542654h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ yd5.m[] f542655i;

    /* renamed from: d, reason: collision with root package name */
    public final int f542656d;

    static {
        yd5.m mVar = new yd5.m("REPLY", 0, 1);
        f542651e = mVar;
        yd5.m mVar2 = new yd5.m("CLOSE", 1, 2);
        f542652f = mVar2;
        yd5.m mVar3 = new yd5.m("MARK_UNREAD", 2, 3);
        f542653g = mVar3;
        yd5.m mVar4 = new yd5.m("ENTER_CHAT", 3, 4);
        f542654h = mVar4;
        yd5.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, new yd5.m("OTHER", 4, 0)};
        f542655i = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f542656d = i18;
    }

    /* renamed from: valueOf */
    public static yd5.m m176862xdce0328(java.lang.String str) {
        return (yd5.m) java.lang.Enum.valueOf(yd5.m.class, str);
    }

    /* renamed from: values */
    public static yd5.m[] m176863xcee59d22() {
        return (yd5.m[]) f542655i.clone();
    }
}
