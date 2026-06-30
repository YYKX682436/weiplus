package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.g f539323e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.g f539324f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xx.g[] f539325g;

    /* renamed from: d, reason: collision with root package name */
    public final int f539326d;

    static {
        xx.g gVar = new xx.g("AIRoomTypeAlone", 0, 1);
        f539323e = gVar;
        xx.g gVar2 = new xx.g("AIRoomTypeMultiple", 1, 2);
        f539324f = gVar2;
        xx.g[] gVarArr = {gVar, gVar2};
        f539325g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f539326d = i18;
    }

    /* renamed from: valueOf */
    public static xx.g m176145xdce0328(java.lang.String str) {
        return (xx.g) java.lang.Enum.valueOf(xx.g.class, str);
    }

    /* renamed from: values */
    public static xx.g[] m176146xcee59d22() {
        return (xx.g[]) f539325g.clone();
    }
}
