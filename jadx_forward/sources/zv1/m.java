package zv1;

/* loaded from: classes15.dex */
public abstract class m {
    public static final long a(zv1.d dVar, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        return zv1.g0.d(zv1.g0.f557833a, new zv1.r(dVar, 0L, false, 0L, null, c26987xeef691ab, false, false, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, null), dVar.e(), false, 4, null);
    }

    public static final long b(zv1.d dVar, java.util.List taggedPaths, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taggedPaths, "taggedPaths");
        return zv1.g0.d(zv1.g0.f557833a, new zv1.r(dVar, 0L, false, 0L, null, c26987xeef691ab, false, false, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, null), taggedPaths, false, 4, null);
    }

    public static final long c(zv1.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        if (!(dVar instanceof zv1.q)) {
            return 0L;
        }
        zv1.r rVar = ((zv1.c) ((zv1.q) dVar)).f557811a;
        java.lang.Long valueOf = rVar != null ? java.lang.Long.valueOf(rVar.f557895d) : null;
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 0L;
    }

    public static final zv1.d a(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 type, zv1.a0 a0Var) {
        zv1.s sVar;
        if (((a0Var == null || (sVar = a0Var.f557790f) == null) ? 0 : sVar.f557911l) > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            return zv1.k.a(zv1.k.f557845a, type, zv1.j0.f557843f, null, null, 12, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        return new zv1.f(type);
    }
}
