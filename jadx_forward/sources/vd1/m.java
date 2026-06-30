package vd1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final vd1.m f517128e;

    /* renamed from: f, reason: collision with root package name */
    public static final vd1.m f517129f;

    /* renamed from: g, reason: collision with root package name */
    public static final vd1.m f517130g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vd1.m[] f517131h;

    /* renamed from: d, reason: collision with root package name */
    public final int f517132d;

    static {
        vd1.m mVar = new vd1.m("Enqueued", 0, 1);
        f517128e = mVar;
        vd1.m mVar2 = new vd1.m("Succeed", 1, 2);
        f517129f = mVar2;
        vd1.m mVar3 = new vd1.m("Failed", 2, 3);
        f517130g = mVar3;
        vd1.m[] mVarArr = {mVar, mVar2, mVar3};
        f517131h = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f517132d = i18;
    }

    /* renamed from: valueOf */
    public static vd1.m m171590xdce0328(java.lang.String str) {
        return (vd1.m) java.lang.Enum.valueOf(vd1.m.class, str);
    }

    /* renamed from: values */
    public static vd1.m[] m171591xcee59d22() {
        return (vd1.m[]) f517131h.clone();
    }
}
