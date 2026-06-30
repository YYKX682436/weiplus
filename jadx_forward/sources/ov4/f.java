package ov4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final ov4.f f430763e;

    /* renamed from: f, reason: collision with root package name */
    public static final ov4.f f430764f;

    /* renamed from: g, reason: collision with root package name */
    public static final ov4.f f430765g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ov4.f[] f430766h;

    /* renamed from: d, reason: collision with root package name */
    public final int f430767d;

    static {
        ov4.f fVar = new ov4.f("EXPOSE", 0, 1);
        f430763e = fVar;
        ov4.f fVar2 = new ov4.f("CLICK", 1, 2);
        f430764f = fVar2;
        ov4.f fVar3 = new ov4.f("PULL", 2, 3);
        f430765g = fVar3;
        ov4.f[] fVarArr = {fVar, fVar2, fVar3};
        f430766h = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f430767d = i18;
    }

    /* renamed from: valueOf */
    public static ov4.f m157226xdce0328(java.lang.String str) {
        return (ov4.f) java.lang.Enum.valueOf(ov4.f.class, str);
    }

    /* renamed from: values */
    public static ov4.f[] m157227xcee59d22() {
        return (ov4.f[]) f430766h.clone();
    }
}
