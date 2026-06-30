package vx3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ vx3.e[] f522809d;

    static {
        vx3.e[] eVarArr = {new vx3.e("PREPARE", 0), new vx3.e("PLAY", 1), new vx3.e("PAUSE", 2), new vx3.e("NOT_INIT", 3)};
        f522809d = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vx3.e m172893xdce0328(java.lang.String str) {
        return (vx3.e) java.lang.Enum.valueOf(vx3.e.class, str);
    }

    /* renamed from: values */
    public static vx3.e[] m172894xcee59d22() {
        return (vx3.e[]) f522809d.clone();
    }
}
