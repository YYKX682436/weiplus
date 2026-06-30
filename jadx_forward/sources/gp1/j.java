package gp1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ gp1.j[] f355718d;

    static {
        gp1.j[] jVarArr = {new gp1.j("NONE", 0, -1), new gp1.j("EXPAND", 1, 0), new gp1.j("COLLAPSED_LEFT", 2, 1), new gp1.j("COLLAPSED_RIGHT", 3, 2), new gp1.j("DRAGGING", 4, 3)};
        f355718d = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static gp1.j m131960xdce0328(java.lang.String str) {
        return (gp1.j) java.lang.Enum.valueOf(gp1.j.class, str);
    }

    /* renamed from: values */
    public static gp1.j[] m131961xcee59d22() {
        return (gp1.j[]) f355718d.clone();
    }
}
