package rv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c7 {

    /* renamed from: d, reason: collision with root package name */
    public static final rv0.c7 f481493d;

    /* renamed from: e, reason: collision with root package name */
    public static final rv0.c7 f481494e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rv0.c7[] f481495f;

    static {
        rv0.c7 c7Var = new rv0.c7("USE_ALL", 0);
        rv0.c7 c7Var2 = new rv0.c7("USE_NO", 1);
        rv0.c7 c7Var3 = new rv0.c7("USE_ASSET_ASPECT_RATIO", 2);
        f481493d = c7Var3;
        rv0.c7 c7Var4 = new rv0.c7("USE_TIMELINE_VIDEO_SETTINGS", 3);
        f481494e = c7Var4;
        rv0.c7[] c7VarArr = {c7Var, c7Var2, c7Var3, c7Var4};
        f481495f = c7VarArr;
        rz5.b.a(c7VarArr);
    }

    public c7(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static rv0.c7 m163146xdce0328(java.lang.String str) {
        return (rv0.c7) java.lang.Enum.valueOf(rv0.c7.class, str);
    }

    /* renamed from: values */
    public static rv0.c7[] m163147xcee59d22() {
        return (rv0.c7[]) f481495f.clone();
    }
}
