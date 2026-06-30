package l06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l06.a0[] f396401g;

    /* renamed from: d, reason: collision with root package name */
    public final n16.b f396402d;

    /* renamed from: e, reason: collision with root package name */
    public final n16.g f396403e;

    /* renamed from: f, reason: collision with root package name */
    public final n16.b f396404f;

    static {
        l06.a0[] a0VarArr = {new l06.a0("UBYTE", 0, n16.b.e("kotlin/UByte")), new l06.a0("USHORT", 1, n16.b.e("kotlin/UShort")), new l06.a0("UINT", 2, n16.b.e("kotlin/UInt")), new l06.a0("ULONG", 3, n16.b.e("kotlin/ULong"))};
        f396401g = a0VarArr;
        rz5.b.a(a0VarArr);
    }

    public a0(java.lang.String str, int i17, n16.b bVar) {
        this.f396402d = bVar;
        n16.g j17 = bVar.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getShortClassName(...)");
        this.f396403e = j17;
        this.f396404f = new n16.b(bVar.h(), n16.g.k(j17.h() + "Array"));
    }

    /* renamed from: valueOf */
    public static l06.a0 m144828xdce0328(java.lang.String str) {
        return (l06.a0) java.lang.Enum.valueOf(l06.a0.class, str);
    }

    /* renamed from: values */
    public static l06.a0[] m144829xcee59d22() {
        return (l06.a0[]) f396401g.clone();
    }
}
