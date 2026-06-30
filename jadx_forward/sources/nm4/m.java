package nm4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final nm4.m f420033d;

    /* renamed from: e, reason: collision with root package name */
    public static final nm4.m f420034e;

    /* renamed from: f, reason: collision with root package name */
    public static final nm4.m f420035f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ nm4.m[] f420036g;

    static {
        nm4.m mVar = new nm4.m("NONE", 0);
        f420033d = mVar;
        nm4.m mVar2 = new nm4.m("CLOSED", 1);
        f420034e = mVar2;
        nm4.m mVar3 = new nm4.m("LIVE", 2);
        f420035f = mVar3;
        nm4.m[] mVarArr = {mVar, mVar2, mVar3};
        f420036g = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static nm4.m m149781xdce0328(java.lang.String str) {
        return (nm4.m) java.lang.Enum.valueOf(nm4.m.class, str);
    }

    /* renamed from: values */
    public static nm4.m[] m149782xcee59d22() {
        return (nm4.m[]) f420036g.clone();
    }
}
