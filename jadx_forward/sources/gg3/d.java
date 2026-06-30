package gg3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final gg3.d f353265d;

    /* renamed from: e, reason: collision with root package name */
    public static final gg3.d f353266e;

    /* renamed from: f, reason: collision with root package name */
    public static final gg3.d f353267f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gg3.d[] f353268g;

    static {
        gg3.d dVar = new gg3.d("DOWNLOAD_ING", 0);
        f353265d = dVar;
        gg3.d dVar2 = new gg3.d("DOWNLOAD_SUCCESS", 1);
        f353266e = dVar2;
        gg3.d dVar3 = new gg3.d("DOWNLOAD_FAILED", 2);
        f353267f = dVar3;
        gg3.d[] dVarArr = {dVar, dVar2, dVar3};
        f353268g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static gg3.d m131534xdce0328(java.lang.String str) {
        return (gg3.d) java.lang.Enum.valueOf(gg3.d.class, str);
    }

    /* renamed from: values */
    public static gg3.d[] m131535xcee59d22() {
        return (gg3.d[]) f353268g.clone();
    }
}
