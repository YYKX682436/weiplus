package aj0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final aj0.f f5235d;

    /* renamed from: e, reason: collision with root package name */
    public static final aj0.f f5236e;

    /* renamed from: f, reason: collision with root package name */
    public static final aj0.f f5237f;

    /* renamed from: g, reason: collision with root package name */
    public static final aj0.f f5238g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ aj0.f[] f5239h;

    static {
        aj0.f fVar = new aj0.f("NONE", 0);
        f5235d = fVar;
        aj0.f fVar2 = new aj0.f("LEFT", 1);
        f5236e = fVar2;
        aj0.f fVar3 = new aj0.f("RIGHT", 2);
        f5237f = fVar3;
        aj0.f fVar4 = new aj0.f("BOTH", 3);
        f5238g = fVar4;
        aj0.f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f5239h = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static aj0.f valueOf(java.lang.String str) {
        return (aj0.f) java.lang.Enum.valueOf(aj0.f.class, str);
    }

    public static aj0.f[] values() {
        return (aj0.f[]) f5239h.clone();
    }
}
