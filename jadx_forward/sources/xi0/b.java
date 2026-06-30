package xi0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xi0.b[] f536200d;

    static {
        xi0.b[] bVarArr = {new xi0.b("Image", 0), new xi0.b("Video", 1)};
        f536200d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static xi0.b m175591xdce0328(java.lang.String str) {
        return (xi0.b) java.lang.Enum.valueOf(xi0.b.class, str);
    }

    /* renamed from: values */
    public static xi0.b[] m175592xcee59d22() {
        return (xi0.b[]) f536200d.clone();
    }
}
