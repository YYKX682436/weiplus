package zv1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final zv1.j0 f557841d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zv1.j0[] f557842e;

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.j0 f557843f;

    /* renamed from: g, reason: collision with root package name */
    public static final zv1.j0 f557844g;

    static {
        zv1.j0 j0Var = new zv1.j0("NO_OP", 0);
        zv1.j0 j0Var2 = new zv1.j0("CLEAN_ALL", 1);
        zv1.j0 j0Var3 = new zv1.j0("CLEAN_LEAST_RECENT", 2);
        f557841d = j0Var3;
        zv1.j0 j0Var4 = new zv1.j0("VFS_EXPIRE", 3);
        f557843f = j0Var4;
        zv1.j0 j0Var5 = new zv1.j0("CUSTOM", 4);
        f557844g = j0Var5;
        zv1.j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5};
        f557842e = j0VarArr;
        rz5.b.a(j0VarArr);
    }

    public j0(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static zv1.j0 m179752xdce0328(java.lang.String str) {
        return (zv1.j0) java.lang.Enum.valueOf(zv1.j0.class, str);
    }

    /* renamed from: values */
    public static zv1.j0[] m179753xcee59d22() {
        return (zv1.j0[]) f557842e.clone();
    }
}
