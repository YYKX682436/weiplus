package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.a f520620e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vp5.b[] f520621f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f520622g;

    /* renamed from: d, reason: collision with root package name */
    public final int f520623d;

    static {
        vp5.b[] bVarArr = {new vp5.b("OK", 0, 0), new vp5.b("FAIL_ALLOC", 1, -3), new vp5.b("FAIL_DECOMPRESS", 2, -4), new vp5.b("FAIL_OVERFLOW", 3, -5), new vp5.b("FAIL_READ_OLD_FILE", 4, -6), new vp5.b("FAIL_READ_DIFF_FILE", 5, -7), new vp5.b("FAIL_WRITE_NEW_FILE", 6, -8)};
        f520621f = bVarArr;
        f520622g = rz5.b.a(bVarArr);
        f520620e = new vp5.a(null);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f520623d = i18;
    }

    /* renamed from: valueOf */
    public static vp5.b m172447xdce0328(java.lang.String str) {
        return (vp5.b) java.lang.Enum.valueOf(vp5.b.class, str);
    }

    /* renamed from: values */
    public static vp5.b[] m172448xcee59d22() {
        return (vp5.b[]) f520621f.clone();
    }
}
