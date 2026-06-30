package ez2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final ez2.f f339431e;

    /* renamed from: f, reason: collision with root package name */
    public static final ez2.f f339432f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ez2.f[] f339433g;

    /* renamed from: d, reason: collision with root package name */
    public final int f339434d;

    static {
        ez2.f fVar = new ez2.f("TextureView", 0, 1);
        f339431e = fVar;
        ez2.f fVar2 = new ez2.f("SurfaceView", 1, 2);
        f339432f = fVar2;
        ez2.f[] fVarArr = {fVar, fVar2};
        f339433g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f339434d = i18;
    }

    /* renamed from: valueOf */
    public static ez2.f m128487xdce0328(java.lang.String str) {
        return (ez2.f) java.lang.Enum.valueOf(ez2.f.class, str);
    }

    /* renamed from: values */
    public static ez2.f[] m128488xcee59d22() {
        return (ez2.f[]) f339433g.clone();
    }
}
