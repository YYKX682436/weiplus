package ix5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ix5.s f377204d;

    /* renamed from: e, reason: collision with root package name */
    public static final ix5.s f377205e;

    /* renamed from: f, reason: collision with root package name */
    public static final ix5.s f377206f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ix5.s[] f377207g;

    static {
        ix5.s sVar = new ix5.s("EXITED", 0);
        f377204d = sVar;
        ix5.s sVar2 = new ix5.s("BOOTING", 1);
        f377205e = sVar2;
        ix5.s sVar3 = new ix5.s("BOOTED", 2);
        f377206f = sVar3;
        ix5.s[] sVarArr = {sVar, sVar2, sVar3};
        f377207g = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ix5.s m139949xdce0328(java.lang.String str) {
        return (ix5.s) java.lang.Enum.valueOf(ix5.s.class, str);
    }

    /* renamed from: values */
    public static ix5.s[] m139950xcee59d22() {
        return (ix5.s[]) f377207g.clone();
    }
}
