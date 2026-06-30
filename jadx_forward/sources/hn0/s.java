package hn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ hn0.s[] f363968d;

    static {
        hn0.s[] sVarArr = {new hn0.s("Strategy_Unknown", 0, 0), new hn0.s("Strategy_SurfaceChanged_Destroy", 1, 1), new hn0.s("Strategy_SurfaceDestroyed_Destroy", 2, 2)};
        f363968d = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static hn0.s m133785xdce0328(java.lang.String str) {
        return (hn0.s) java.lang.Enum.valueOf(hn0.s.class, str);
    }

    /* renamed from: values */
    public static hn0.s[] m133786xcee59d22() {
        return (hn0.s[]) f363968d.clone();
    }
}
