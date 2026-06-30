package zh5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final zh5.f f554554d;

    /* renamed from: e, reason: collision with root package name */
    public static final zh5.f f554555e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zh5.f[] f554556f;

    static {
        zh5.f fVar = new zh5.f("Success", 0);
        f554554d = fVar;
        zh5.f fVar2 = new zh5.f("Error", 1);
        f554555e = fVar2;
        zh5.f[] fVarArr = {fVar, fVar2, new zh5.f("InvalidFileId", 2), new zh5.f("NotSupport", 3)};
        f554556f = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static zh5.f m179002xdce0328(java.lang.String str) {
        return (zh5.f) java.lang.Enum.valueOf(zh5.f.class, str);
    }

    /* renamed from: values */
    public static zh5.f[] m179003xcee59d22() {
        return (zh5.f[]) f554556f.clone();
    }
}
