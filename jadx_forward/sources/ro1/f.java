package ro1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final ro1.f f479512e;

    /* renamed from: f, reason: collision with root package name */
    public static final ro1.f f479513f;

    /* renamed from: g, reason: collision with root package name */
    public static final ro1.f f479514g;

    /* renamed from: h, reason: collision with root package name */
    public static final ro1.f f479515h;

    /* renamed from: i, reason: collision with root package name */
    public static final ro1.f f479516i;

    /* renamed from: m, reason: collision with root package name */
    public static final ro1.f f479517m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ro1.f[] f479518n;

    /* renamed from: d, reason: collision with root package name */
    public final int f479519d;

    static {
        ro1.f fVar = new ro1.f("ERROR_OK", 0, 0);
        f479512e = fVar;
        ro1.f fVar2 = new ro1.f("GENERAL_ERROR", 1, -1);
        f479513f = fVar2;
        ro1.f fVar3 = new ro1.f("FILE_NOT_FOUND", 2, -2);
        f479514g = fVar3;
        ro1.f fVar4 = new ro1.f("FILE_TYPE_ERROR", 3, -3);
        f479515h = fVar4;
        ro1.f fVar5 = new ro1.f("OPEN_STREAM_FAILED", 4, -4);
        f479516i = fVar5;
        ro1.f fVar6 = new ro1.f("MAKE_DIR_FAILED", 5, -5);
        f479517m = fVar6;
        ro1.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        f479518n = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
        this.f479519d = i18;
    }

    /* renamed from: valueOf */
    public static ro1.f m162782xdce0328(java.lang.String str) {
        return (ro1.f) java.lang.Enum.valueOf(ro1.f.class, str);
    }

    /* renamed from: values */
    public static ro1.f[] m162783xcee59d22() {
        return (ro1.f[]) f479518n.clone();
    }
}
