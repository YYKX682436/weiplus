package ls;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ls.k[] f402313d;

    static {
        ls.k[] kVarArr = {new ls.k("LOGIN_TYPE_NO_PWD", 0, 2L), new ls.k("LOGIN_TYPE_GATEWAY", 1, 4L), new ls.k("LOGIN_TYPE_FINGERPRINT", 2, 8L), new ls.k("LOGIN_TYPE_FASTSWITCH", 3, 16L)};
        f402313d = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17, long j17) {
    }

    /* renamed from: valueOf */
    public static ls.k m146247xdce0328(java.lang.String str) {
        return (ls.k) java.lang.Enum.valueOf(ls.k.class, str);
    }

    /* renamed from: values */
    public static ls.k[] m146248xcee59d22() {
        return (ls.k[]) f402313d.clone();
    }
}
