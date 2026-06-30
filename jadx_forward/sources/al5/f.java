package al5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final al5.f f87419d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ al5.f[] f87420e;

    static {
        al5.f fVar = new al5.f("CENTER", 0);
        f87419d = fVar;
        al5.f[] fVarArr = {fVar, new al5.f("LEFT", 1), new al5.f("RIGHT", 2), new al5.f("ALIGN_LEFT", 3), new al5.f("ALIGN_RIGHT", 4)};
        f87420e = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static al5.f m2291xdce0328(java.lang.String str) {
        return (al5.f) java.lang.Enum.valueOf(al5.f.class, str);
    }

    /* renamed from: values */
    public static al5.f[] m2292xcee59d22() {
        return (al5.f[]) f87420e.clone();
    }
}
