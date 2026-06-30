package ip;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f375096e = {1};

    /* renamed from: a, reason: collision with root package name */
    public final int f375097a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f375098b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f375099c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f375100d = null;

    public h(int i17) {
        this.f375097a = i17;
    }

    public static java.lang.String a(java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            sb6.append(".");
            sb6.append(str);
        }
        return sb6.toString();
    }
}
