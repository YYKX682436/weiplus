package xf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final xf0.k f535727d;

    /* renamed from: e, reason: collision with root package name */
    public static final xf0.k f535728e;

    /* renamed from: f, reason: collision with root package name */
    public static final xf0.k f535729f;

    /* renamed from: g, reason: collision with root package name */
    public static final xf0.k f535730g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xf0.k[] f535731h;

    static {
        xf0.k kVar = new xf0.k("Success", 0);
        f535727d = kVar;
        xf0.k kVar2 = new xf0.k("Cancel", 1);
        f535728e = kVar2;
        xf0.k kVar3 = new xf0.k("DownloadError", 2);
        f535729f = kVar3;
        xf0.k kVar4 = new xf0.k("MoveFileError", 3);
        f535730g = kVar4;
        xf0.k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f535731h = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static xf0.k m175458xdce0328(java.lang.String str) {
        return (xf0.k) java.lang.Enum.valueOf(xf0.k.class, str);
    }

    /* renamed from: values */
    public static xf0.k[] m175459xcee59d22() {
        return (xf0.k[]) f535731h.clone();
    }
}
