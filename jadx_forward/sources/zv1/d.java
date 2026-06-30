package zv1;

/* loaded from: classes10.dex */
public interface d {
    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 a();

    default java.util.Map b() {
        jz5.l lVar;
        zv1.f1 f1Var = (zv1.f1) i95.n0.c(zv1.f1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType = a();
        ((yv1.h) f1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        java.util.List b17 = zv1.i1.f557839a.b(cacheType);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            jz5.l lVar2 = (jz5.l) it.next();
            java.lang.Object obj = lVar2.f384367e;
            if (obj == null) {
                lVar = null;
            } else {
                lVar = new jz5.l(((com.p314xaae8f345.mm.vfs.c6) obj).f294406a, kz5.b0.c(lVar2.f384366d));
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return kz5.c1.q(arrayList);
    }

    default long c(long j17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17) {
        return 0L;
    }

    default zv1.w0 d() {
        return null;
    }

    default java.util.List e() {
        zv1.f1 f1Var = (zv1.f1) i95.n0.c(zv1.f1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType = a();
        ((yv1.h) f1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        java.util.List b17 = zv1.i1.f557839a.b(cacheType);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((jz5.l) it.next()).f384366d);
        }
        return arrayList;
    }
}
