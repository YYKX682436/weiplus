package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.v4[] f409682d;

    static {
        ml2.v4[] v4VarArr = {new ml2.v4("WIN", 0, 1), new ml2.v4("NO_WIN", 1, 2), new ml2.v4("NO_JOIN", 2, 3)};
        f409682d = v4VarArr;
        rz5.b.a(v4VarArr);
    }

    public v4(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static ml2.v4 m147772xdce0328(java.lang.String str) {
        return (ml2.v4) java.lang.Enum.valueOf(ml2.v4.class, str);
    }

    /* renamed from: values */
    public static ml2.v4[] m147773xcee59d22() {
        return (ml2.v4[]) f409682d.clone();
    }
}
