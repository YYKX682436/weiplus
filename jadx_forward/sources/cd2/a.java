package cd2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ cd2.a[] f122187d;

    static {
        cd2.a[] aVarArr = {new cd2.a("MENTION_INVALID", 0), new cd2.a("MENTION_NO_MORE", 1), new cd2.a("MENTION_THANK", 2)};
        f122187d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cd2.a m14650xdce0328(java.lang.String str) {
        return (cd2.a) java.lang.Enum.valueOf(cd2.a.class, str);
    }

    /* renamed from: values */
    public static cd2.a[] m14651xcee59d22() {
        return (cd2.a[]) f122187d.clone();
    }
}
