package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.m f492008d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.m f492009e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ so2.m[] f492010f;

    static {
        so2.m mVar = new so2.m("NORMAL", 0);
        f492008d = mVar;
        so2.m mVar2 = new so2.m("AT_CONTACT", 1);
        f492009e = mVar2;
        so2.m[] mVarArr = {mVar, mVar2};
        f492010f = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static so2.m m164917xdce0328(java.lang.String str) {
        return (so2.m) java.lang.Enum.valueOf(so2.m.class, str);
    }

    /* renamed from: values */
    public static so2.m[] m164918xcee59d22() {
        return (so2.m[]) f492010f.clone();
    }
}
