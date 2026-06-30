package aj0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final aj0.b f5214d;

    /* renamed from: e, reason: collision with root package name */
    public static final aj0.b f5215e;

    /* renamed from: f, reason: collision with root package name */
    public static final aj0.b f5216f;

    /* renamed from: g, reason: collision with root package name */
    public static final aj0.b f5217g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ aj0.b[] f5218h;

    static {
        aj0.b bVar = new aj0.b("NONE", 0);
        f5214d = bVar;
        aj0.b bVar2 = new aj0.b("LEFT", 1);
        f5215e = bVar2;
        aj0.b bVar3 = new aj0.b("RIGHT", 2);
        f5216f = bVar3;
        aj0.b bVar4 = new aj0.b("BOTH", 3);
        f5217g = bVar4;
        aj0.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f5218h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static aj0.b valueOf(java.lang.String str) {
        return (aj0.b) java.lang.Enum.valueOf(aj0.b.class, str);
    }

    public static aj0.b[] values() {
        return (aj0.b[]) f5218h.clone();
    }
}
