package bs0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final bs0.f f23783d;

    /* renamed from: e, reason: collision with root package name */
    public static final bs0.f f23784e;

    /* renamed from: f, reason: collision with root package name */
    public static final bs0.f f23785f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bs0.f[] f23786g;

    static {
        bs0.f fVar = new bs0.f("RATIO_16_9", 0);
        f23783d = fVar;
        bs0.f fVar2 = new bs0.f("RATIO_4_3", 1);
        f23784e = fVar2;
        bs0.f fVar3 = new bs0.f("RATIO_1_1", 2);
        f23785f = fVar3;
        bs0.f[] fVarArr = {fVar, fVar2, fVar3};
        f23786g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static bs0.f valueOf(java.lang.String str) {
        return (bs0.f) java.lang.Enum.valueOf(bs0.f.class, str);
    }

    public static bs0.f[] values() {
        return (bs0.f[]) f23786g.clone();
    }
}
