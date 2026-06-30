package vi0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ vi0.a[] f518780d;

    static {
        vi0.a[] aVarArr = {new vi0.a("Image", 0), new vi0.a("Video", 1), new vi0.a("Live", 2)};
        f518780d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static vi0.a m172198xdce0328(java.lang.String str) {
        return (vi0.a) java.lang.Enum.valueOf(vi0.a.class, str);
    }

    /* renamed from: values */
    public static vi0.a[] m172199xcee59d22() {
        return (vi0.a[]) f518780d.clone();
    }
}
