package z01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final z01.f f550537d;

    /* renamed from: e, reason: collision with root package name */
    public static final z01.f f550538e;

    /* renamed from: f, reason: collision with root package name */
    public static final z01.f f550539f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z01.f[] f550540g;

    static {
        z01.f fVar = new z01.f("PICTURE", 0);
        f550537d = fVar;
        z01.f fVar2 = new z01.f("VIDEO", 1);
        f550538e = fVar2;
        z01.f fVar3 = new z01.f("OTHERS", 2);
        f550539f = fVar3;
        z01.f[] fVarArr = {fVar, fVar2, fVar3};
        f550540g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static z01.f m178238xdce0328(java.lang.String str) {
        return (z01.f) java.lang.Enum.valueOf(z01.f.class, str);
    }

    /* renamed from: values */
    public static z01.f[] m178239xcee59d22() {
        return (z01.f[]) f550540g.clone();
    }
}
