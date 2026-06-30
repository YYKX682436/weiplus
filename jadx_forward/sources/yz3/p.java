package yz3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yz3.p[] f550073d;

    static {
        yz3.p[] pVarArr = {new yz3.p("NONE", 0, 0), new yz3.p("SCAN_NEW_STYLE", 1, 1), new yz3.p("QRCODE", 2, 2), new yz3.p("SEND_FILE", 3, 4), new yz3.p("LUCKY_MONEY", 4, 8)};
        f550073d = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static yz3.p m178114xdce0328(java.lang.String str) {
        return (yz3.p) java.lang.Enum.valueOf(yz3.p.class, str);
    }

    /* renamed from: values */
    public static yz3.p[] m178115xcee59d22() {
        return (yz3.p[]) f550073d.clone();
    }
}
