package bj0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ bj0.b[] f102635d;

    static {
        bj0.b[] bVarArr = {new bj0.b("Normal", 0), new bj0.b("SingleInstance", 1), new bj0.b("SingleTop", 2)};
        f102635d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static bj0.b m10646xdce0328(java.lang.String str) {
        return (bj0.b) java.lang.Enum.valueOf(bj0.b.class, str);
    }

    /* renamed from: values */
    public static bj0.b[] m10647xcee59d22() {
        return (bj0.b[]) f102635d.clone();
    }
}
