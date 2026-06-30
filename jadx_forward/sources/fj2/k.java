package fj2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final fj2.k f344708d;

    /* renamed from: e, reason: collision with root package name */
    public static final fj2.k f344709e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fj2.k[] f344710f;

    static {
        fj2.k kVar = new fj2.k("RED_TEAM", 0, 1);
        f344708d = kVar;
        fj2.k kVar2 = new fj2.k("BLUE_TEAM", 1, 2);
        f344709e = kVar2;
        fj2.k[] kVarArr = {kVar, kVar2};
        f344710f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static fj2.k m129604xdce0328(java.lang.String str) {
        return (fj2.k) java.lang.Enum.valueOf(fj2.k.class, str);
    }

    /* renamed from: values */
    public static fj2.k[] m129605xcee59d22() {
        return (fj2.k[]) f344710f.clone();
    }
}
