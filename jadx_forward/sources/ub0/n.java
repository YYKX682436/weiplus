package ub0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ub0.n[] f507535d;

    static {
        ub0.n[] nVarArr = {new ub0.n("ClearSuccess", 0, 0), new ub0.n("ClearFailedReadScrFileFailed", 1, -1), new ub0.n("ClearFailedWriteDstFileFailed", 2, -2), new ub0.n("ClearFailedUnknownError", 3, -3), new ub0.n("ClearFailedScrFileNonePrivate", 4, -4), new ub0.n("ClearSucButJavaCheckDstFileNotExit", 5, 10001)};
        f507535d = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
    }

    /* renamed from: valueOf */
    public static ub0.n m167776xdce0328(java.lang.String str) {
        return (ub0.n) java.lang.Enum.valueOf(ub0.n.class, str);
    }

    /* renamed from: values */
    public static ub0.n[] m167777xcee59d22() {
        return (ub0.n[]) f507535d.clone();
    }
}
