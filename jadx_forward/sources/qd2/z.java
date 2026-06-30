package qd2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ qd2.z[] f443390d;

    static {
        qd2.z[] zVarArr = {new qd2.z("LOW", 0, 0), new qd2.z("MEDIUM", 1, 1), new qd2.z("HIGH", 2, 2)};
        f443390d = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static qd2.z m159890xdce0328(java.lang.String str) {
        return (qd2.z) java.lang.Enum.valueOf(qd2.z.class, str);
    }

    /* renamed from: values */
    public static qd2.z[] m159891xcee59d22() {
        return (qd2.z[]) f443390d.clone();
    }
}
