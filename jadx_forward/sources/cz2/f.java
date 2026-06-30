package cz2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final cz2.f f306535d;

    /* renamed from: e, reason: collision with root package name */
    public static final cz2.f f306536e;

    /* renamed from: f, reason: collision with root package name */
    public static final cz2.f f306537f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cz2.f[] f306538g;

    static {
        cz2.f fVar = new cz2.f("Default", 0);
        f306535d = fVar;
        cz2.f fVar2 = new cz2.f("Enable", 1);
        f306536e = fVar2;
        cz2.f fVar3 = new cz2.f("Disable", 2);
        f306537f = fVar3;
        cz2.f[] fVarArr = {fVar, fVar2, fVar3};
        f306538g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cz2.f m123163xdce0328(java.lang.String str) {
        return (cz2.f) java.lang.Enum.valueOf(cz2.f.class, str);
    }

    /* renamed from: values */
    public static cz2.f[] m123164xcee59d22() {
        return (cz2.f[]) f306538g.clone();
    }
}
