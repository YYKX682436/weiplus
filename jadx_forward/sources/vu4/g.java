package vu4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final vu4.g f521856e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu4.g f521857f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vu4.g[] f521858g;

    /* renamed from: d, reason: collision with root package name */
    public final int f521859d;

    static {
        vu4.g gVar = new vu4.g("normal", 0, 0);
        f521856e = gVar;
        vu4.g gVar2 = new vu4.g("sayHi", 1, 1);
        f521857f = gVar2;
        vu4.g[] gVarArr = {gVar, gVar2};
        f521858g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f521859d = i18;
    }

    /* renamed from: valueOf */
    public static vu4.g m172665xdce0328(java.lang.String str) {
        return (vu4.g) java.lang.Enum.valueOf(vu4.g.class, str);
    }

    /* renamed from: values */
    public static vu4.g[] m172666xcee59d22() {
        return (vu4.g[]) f521858g.clone();
    }
}
