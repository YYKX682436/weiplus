package kn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final kn1.n f391176e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn1.n f391177f;

    /* renamed from: g, reason: collision with root package name */
    public static final kn1.n f391178g;

    /* renamed from: h, reason: collision with root package name */
    public static final kn1.n f391179h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kn1.n[] f391180i;

    /* renamed from: d, reason: collision with root package name */
    public final int f391181d;

    static {
        kn1.n nVar = new kn1.n("kPD_Unknown", 0, 0);
        f391176e = nVar;
        kn1.n nVar2 = new kn1.n("kPD_Pc", 1, 1);
        kn1.n nVar3 = new kn1.n("kPD_Mac", 2, 2);
        kn1.n nVar4 = new kn1.n("kPD_Android", 3, 3);
        f391177f = nVar4;
        kn1.n nVar5 = new kn1.n("kPD_IOS", 4, 4);
        f391178g = nVar5;
        kn1.n nVar6 = new kn1.n("kPD_Ohos", 5, 5);
        f391179h = nVar6;
        kn1.n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, new kn1.n("kPD_XwechatWin", 6, 6), new kn1.n("kPD_XwechatMac", 7, 7), new kn1.n("kPD_XwechatLinux", 8, 8), new kn1.n("kPD_XwechatOhos", 9, 9)};
        f391180i = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
        this.f391181d = i18;
    }

    /* renamed from: valueOf */
    public static kn1.n m143780xdce0328(java.lang.String str) {
        return (kn1.n) java.lang.Enum.valueOf(kn1.n.class, str);
    }

    /* renamed from: values */
    public static kn1.n[] m143781xcee59d22() {
        return (kn1.n[]) f391180i.clone();
    }
}
