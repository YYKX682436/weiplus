package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.k f520658e;

    /* renamed from: f, reason: collision with root package name */
    public static final vp5.l f520659f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vp5.l[] f520660g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f520661h;

    /* renamed from: d, reason: collision with root package name */
    public final int f520662d;

    static {
        vp5.l lVar = new vp5.l("OK", 0, 0);
        f520659f = lVar;
        vp5.l[] lVarArr = {lVar, new vp5.l("FAIL_DECOMPRESS", 1, -1), new vp5.l("FAIL_CHECKSUM_MISMATCH", 2, -2)};
        f520660g = lVarArr;
        f520661h = rz5.b.a(lVarArr);
        f520658e = new vp5.k(null);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f520662d = i18;
    }

    /* renamed from: valueOf */
    public static vp5.l m172474xdce0328(java.lang.String str) {
        return (vp5.l) java.lang.Enum.valueOf(vp5.l.class, str);
    }

    /* renamed from: values */
    public static vp5.l[] m172475xcee59d22() {
        return (vp5.l[]) f520660g.clone();
    }
}
