package l06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static final l06.z f396496e;

    /* renamed from: f, reason: collision with root package name */
    public static final l06.z f396497f;

    /* renamed from: g, reason: collision with root package name */
    public static final l06.z f396498g;

    /* renamed from: h, reason: collision with root package name */
    public static final l06.z f396499h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l06.z[] f396500i;

    /* renamed from: d, reason: collision with root package name */
    public final n16.g f396501d;

    static {
        l06.z zVar = new l06.z("UBYTEARRAY", 0, n16.b.e("kotlin/UByteArray"));
        f396496e = zVar;
        l06.z zVar2 = new l06.z("USHORTARRAY", 1, n16.b.e("kotlin/UShortArray"));
        f396497f = zVar2;
        l06.z zVar3 = new l06.z("UINTARRAY", 2, n16.b.e("kotlin/UIntArray"));
        f396498g = zVar3;
        l06.z zVar4 = new l06.z("ULONGARRAY", 3, n16.b.e("kotlin/ULongArray"));
        f396499h = zVar4;
        l06.z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f396500i = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17, n16.b bVar) {
        n16.g j17 = bVar.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getShortClassName(...)");
        this.f396501d = j17;
    }

    /* renamed from: valueOf */
    public static l06.z m144845xdce0328(java.lang.String str) {
        return (l06.z) java.lang.Enum.valueOf(l06.z.class, str);
    }

    /* renamed from: values */
    public static l06.z[] m144846xcee59d22() {
        return (l06.z[]) f396500i.clone();
    }
}
