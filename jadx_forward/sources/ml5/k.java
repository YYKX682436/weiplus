package ml5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final ml5.k f409963d;

    /* renamed from: e, reason: collision with root package name */
    public static final ml5.k f409964e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml5.k f409965f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml5.k[] f409966g;

    static {
        ml5.k kVar = new ml5.k("CENTER_CROP", 0);
        f409963d = kVar;
        ml5.k kVar2 = new ml5.k("CENTER_INSIDE", 1);
        f409964e = kVar2;
        ml5.k kVar3 = new ml5.k("ALIGN_START", 2);
        f409965f = kVar3;
        ml5.k[] kVarArr = {kVar, kVar2, kVar3};
        f409966g = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ml5.k m147835xdce0328(java.lang.String str) {
        return (ml5.k) java.lang.Enum.valueOf(ml5.k.class, str);
    }

    /* renamed from: values */
    public static ml5.k[] m147836xcee59d22() {
        return (ml5.k[]) f409966g.clone();
    }
}
