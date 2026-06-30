package vt3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final vt3.m f521544e;

    /* renamed from: f, reason: collision with root package name */
    public static final vt3.m f521545f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vt3.m[] f521546g;

    /* renamed from: d, reason: collision with root package name */
    public final int f521547d;

    static {
        vt3.m mVar = new vt3.m("NONE", 0, 1);
        f521544e = mVar;
        vt3.m mVar2 = new vt3.m("NORMAL", 1, 2);
        f521545f = mVar2;
        vt3.m[] mVarArr = {mVar, mVar2};
        f521546g = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f521547d = i18;
    }

    /* renamed from: valueOf */
    public static vt3.m m172615xdce0328(java.lang.String str) {
        return (vt3.m) java.lang.Enum.valueOf(vt3.m.class, str);
    }

    /* renamed from: values */
    public static vt3.m[] m172616xcee59d22() {
        return (vt3.m[]) f521546g.clone();
    }
}
