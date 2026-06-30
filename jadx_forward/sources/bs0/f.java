package bs0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final bs0.f f105316d;

    /* renamed from: e, reason: collision with root package name */
    public static final bs0.f f105317e;

    /* renamed from: f, reason: collision with root package name */
    public static final bs0.f f105318f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bs0.f[] f105319g;

    static {
        bs0.f fVar = new bs0.f("RATIO_16_9", 0);
        f105316d = fVar;
        bs0.f fVar2 = new bs0.f("RATIO_4_3", 1);
        f105317e = fVar2;
        bs0.f fVar3 = new bs0.f("RATIO_1_1", 2);
        f105318f = fVar3;
        bs0.f[] fVarArr = {fVar, fVar2, fVar3};
        f105319g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static bs0.f m11082xdce0328(java.lang.String str) {
        return (bs0.f) java.lang.Enum.valueOf(bs0.f.class, str);
    }

    /* renamed from: values */
    public static bs0.f[] m11083xcee59d22() {
        return (bs0.f[]) f105319g.clone();
    }
}
