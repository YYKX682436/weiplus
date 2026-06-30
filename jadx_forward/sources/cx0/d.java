package cx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final cx0.d f306041d;

    /* renamed from: e, reason: collision with root package name */
    public static final cx0.d f306042e;

    /* renamed from: f, reason: collision with root package name */
    public static final cx0.d f306043f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cx0.d[] f306044g;

    static {
        cx0.d dVar = new cx0.d("None", 0);
        f306041d = dVar;
        cx0.d dVar2 = new cx0.d("NoAnimation", 1);
        f306042e = dVar2;
        cx0.d dVar3 = new cx0.d("Layout", 2);
        f306043f = dVar3;
        cx0.d[] dVarArr = {dVar, dVar2, dVar3};
        f306044g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cx0.d m123065xdce0328(java.lang.String str) {
        return (cx0.d) java.lang.Enum.valueOf(cx0.d.class, str);
    }

    /* renamed from: values */
    public static cx0.d[] m123066xcee59d22() {
        return (cx0.d[]) f306044g.clone();
    }

    public final java.util.EnumSet a(cx0.d other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        java.util.EnumSet of6 = java.util.EnumSet.of(this, other);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of6, "of(...)");
        return of6;
    }
}
