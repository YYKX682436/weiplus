package l06;

/* loaded from: classes15.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f396407a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f396408b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f396409c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f396410d;

    static {
        l06.a0[] m144829xcee59d22 = l06.a0.m144829xcee59d22();
        java.util.ArrayList arrayList = new java.util.ArrayList(m144829xcee59d22.length);
        for (l06.a0 a0Var : m144829xcee59d22) {
            arrayList.add(a0Var.f396403e);
        }
        f396407a = kz5.n0.X0(arrayList);
        l06.z[] m144846xcee59d22 = l06.z.m144846xcee59d22();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(m144846xcee59d22.length);
        for (l06.z zVar : m144846xcee59d22) {
            arrayList2.add(zVar.f396501d);
        }
        kz5.n0.X0(arrayList2);
        f396408b = new java.util.HashMap();
        f396409c = new java.util.HashMap();
        kz5.c1.i(new jz5.l(l06.z.f396496e, n16.g.k("ubyteArrayOf")), new jz5.l(l06.z.f396497f, n16.g.k("ushortArrayOf")), new jz5.l(l06.z.f396498g, n16.g.k("uintArrayOf")), new jz5.l(l06.z.f396499h, n16.g.k("ulongArrayOf")));
        l06.a0[] m144829xcee59d222 = l06.a0.m144829xcee59d22();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (l06.a0 a0Var2 : m144829xcee59d222) {
            linkedHashSet.add(a0Var2.f396404f.j());
        }
        f396410d = linkedHashSet;
        for (l06.a0 a0Var3 : l06.a0.m144829xcee59d22()) {
            java.util.HashMap hashMap = f396408b;
            n16.b bVar = a0Var3.f396404f;
            n16.b bVar2 = a0Var3.f396402d;
            hashMap.put(bVar, bVar2);
            f396409c.put(bVar2, a0Var3.f396404f);
        }
    }

    public static final boolean a(f26.o0 type) {
        o06.j i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (f26.z2.o(type) || (i17 = type.w0().i()) == null) {
            return false;
        }
        o06.m e17 = i17.e();
        return (e17 instanceof o06.d1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.z0) ((o06.d1) e17)).f450099h, l06.x.f396489k) && f396407a.contains(i17.mo132800xfb82e301());
    }
}
