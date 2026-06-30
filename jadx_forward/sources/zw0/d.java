package zw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final zw0.c f558093e;

    /* renamed from: f, reason: collision with root package name */
    public static final zw0.d f558094f;

    /* renamed from: g, reason: collision with root package name */
    public static final zw0.d f558095g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zw0.d[] f558096h;

    /* renamed from: d, reason: collision with root package name */
    public final int f558097d;

    static {
        zw0.d dVar = new zw0.d("NONE", 0, 0);
        f558094f = dVar;
        zw0.d dVar2 = new zw0.d("FIRST", 1, 1);
        f558095g = dVar2;
        zw0.d[] dVarArr = {dVar, dVar2, new zw0.d("SECOND", 2, 2)};
        f558096h = dVarArr;
        rz5.b.a(dVarArr);
        f558093e = new zw0.c(null);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f558097d = i18;
    }

    /* renamed from: valueOf */
    public static zw0.d m179816xdce0328(java.lang.String str) {
        return (zw0.d) java.lang.Enum.valueOf(zw0.d.class, str);
    }

    /* renamed from: values */
    public static zw0.d[] m179817xcee59d22() {
        return (zw0.d[]) f558096h.clone();
    }
}
