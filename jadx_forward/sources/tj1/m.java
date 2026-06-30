package tj1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final tj1.l f501236e;

    /* renamed from: f, reason: collision with root package name */
    public static final tj1.m f501237f;

    /* renamed from: g, reason: collision with root package name */
    public static final tj1.m f501238g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tj1.m[] f501239h;

    /* renamed from: d, reason: collision with root package name */
    public final int f501240d;

    static {
        tj1.m mVar = new tj1.m("CANNOT_TRANSLATE", 0, 0);
        f501237f = mVar;
        tj1.m mVar2 = new tj1.m("CAN_TRANSLATE", 1, 1);
        f501238g = mVar2;
        tj1.m[] mVarArr = {mVar, mVar2};
        f501239h = mVarArr;
        rz5.b.a(mVarArr);
        f501236e = new tj1.l(null);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f501240d = i18;
    }

    /* renamed from: valueOf */
    public static tj1.m m166658xdce0328(java.lang.String str) {
        return (tj1.m) java.lang.Enum.valueOf(tj1.m.class, str);
    }

    /* renamed from: values */
    public static tj1.m[] m166659xcee59d22() {
        return (tj1.m[]) f501239h.clone();
    }
}
