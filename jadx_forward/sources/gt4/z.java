package gt4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final gt4.z f357111d;

    /* renamed from: e, reason: collision with root package name */
    public static final gt4.z f357112e;

    /* renamed from: f, reason: collision with root package name */
    public static final gt4.z f357113f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gt4.z[] f357114g;

    static {
        gt4.z zVar = new gt4.z("None", 0);
        gt4.z zVar2 = new gt4.z("OneWeek", 1);
        f357111d = zVar2;
        gt4.z zVar3 = new gt4.z("OneMonth", 2);
        f357112e = zVar3;
        gt4.z zVar4 = new gt4.z("ThreeMonth", 3);
        f357113f = zVar4;
        gt4.z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f357114g = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static gt4.z m132362xdce0328(java.lang.String str) {
        return (gt4.z) java.lang.Enum.valueOf(gt4.z.class, str);
    }

    /* renamed from: values */
    public static gt4.z[] m132363xcee59d22() {
        return (gt4.z[]) f357114g.clone();
    }
}
