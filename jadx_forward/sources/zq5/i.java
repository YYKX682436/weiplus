package zq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final zq5.i f556601d;

    /* renamed from: e, reason: collision with root package name */
    public static final zq5.i f556602e;

    /* renamed from: f, reason: collision with root package name */
    public static final zq5.i f556603f;

    /* renamed from: g, reason: collision with root package name */
    public static final zq5.i f556604g;

    /* renamed from: h, reason: collision with root package name */
    public static final zq5.i f556605h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ zq5.i[] f556606i;

    static {
        zq5.i iVar = new zq5.i("Verbose", 0);
        f556601d = iVar;
        zq5.i iVar2 = new zq5.i("Debug", 1);
        f556602e = iVar2;
        zq5.i iVar3 = new zq5.i("Info", 2);
        f556603f = iVar3;
        zq5.i iVar4 = new zq5.i("Warn", 3);
        f556604g = iVar4;
        zq5.i iVar5 = new zq5.i("Error", 4);
        f556605h = iVar5;
        zq5.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, new zq5.i("Assert", 5)};
        f556606i = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static zq5.i m179323xdce0328(java.lang.String str) {
        return (zq5.i) java.lang.Enum.valueOf(zq5.i.class, str);
    }

    /* renamed from: values */
    public static zq5.i[] m179324xcee59d22() {
        return (zq5.i[]) f556606i.clone();
    }
}
