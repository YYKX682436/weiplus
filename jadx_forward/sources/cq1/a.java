package cq1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ cq1.a[] f302859d;

    static {
        cq1.a[] aVarArr = {new cq1.a("UNDEFINE", 0, 0), new cq1.a("CAN_PASS", 1, 1), new cq1.a("NEED_BLOCK", 2, 2), new cq1.a("EXIST_RISK", 3, 3)};
        f302859d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static cq1.a m122437xdce0328(java.lang.String str) {
        return (cq1.a) java.lang.Enum.valueOf(cq1.a.class, str);
    }

    /* renamed from: values */
    public static cq1.a[] m122438xcee59d22() {
        return (cq1.a[]) f302859d.clone();
    }
}
