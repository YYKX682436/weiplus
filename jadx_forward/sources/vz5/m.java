package vz5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final vz5.m f523333d;

    /* renamed from: e, reason: collision with root package name */
    public static final vz5.m f523334e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vz5.m[] f523335f;

    static {
        vz5.m mVar = new vz5.m("TOP_DOWN", 0);
        f523333d = mVar;
        vz5.m mVar2 = new vz5.m("BOTTOM_UP", 1);
        f523334e = mVar2;
        vz5.m[] mVarArr = {mVar, mVar2};
        f523335f = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vz5.m m173022xdce0328(java.lang.String str) {
        return (vz5.m) java.lang.Enum.valueOf(vz5.m.class, str);
    }

    /* renamed from: values */
    public static vz5.m[] m173023xcee59d22() {
        return (vz5.m[]) f523335f.clone();
    }
}
