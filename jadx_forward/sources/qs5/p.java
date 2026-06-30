package qs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ qs5.p[] f447992d;

    static {
        qs5.p[] pVarArr = {new qs5.p("NONE", 0, 0), new qs5.p("WXFLV", 1, 1), new qs5.p("SDKFLV", 2, 2), new qs5.p("SDKLEB", 3, 3)};
        f447992d = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static qs5.p m160861xdce0328(java.lang.String str) {
        return (qs5.p) java.lang.Enum.valueOf(qs5.p.class, str);
    }

    /* renamed from: values */
    public static qs5.p[] m160862xcee59d22() {
        return (qs5.p[]) f447992d.clone();
    }
}
