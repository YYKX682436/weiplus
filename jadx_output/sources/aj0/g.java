package aj0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final aj0.g f5240d;

    /* renamed from: e, reason: collision with root package name */
    public static final aj0.g f5241e;

    /* renamed from: f, reason: collision with root package name */
    public static final aj0.g f5242f;

    /* renamed from: g, reason: collision with root package name */
    public static final aj0.g f5243g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ aj0.g[] f5244h;

    static {
        aj0.g gVar = new aj0.g("NONE", 0);
        f5240d = gVar;
        aj0.g gVar2 = new aj0.g("LEFT", 1);
        f5241e = gVar2;
        aj0.g gVar3 = new aj0.g("RIGHT", 2);
        f5242f = gVar3;
        aj0.g gVar4 = new aj0.g("BOTH", 3);
        f5243g = gVar4;
        aj0.g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        f5244h = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static aj0.g valueOf(java.lang.String str) {
        return (aj0.g) java.lang.Enum.valueOf(aj0.g.class, str);
    }

    public static aj0.g[] values() {
        return (aj0.g[]) f5244h.clone();
    }
}
