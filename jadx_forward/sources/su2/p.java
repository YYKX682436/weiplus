package su2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final su2.p f494300a = new su2.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f494301b;

    static {
        su2.e eVar = su2.f.f494271b;
        java.util.List i17 = kz5.c0.i(eVar.a(su2.h.f494275e), eVar.a(su2.h.f494276f), eVar.a(su2.h.f494277g), eVar.a(su2.h.f494278h), eVar.a(su2.h.f494279i), eVar.a(su2.h.f494280m));
        int d17 = kz5.b1.d(kz5.d0.q(i17, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : i17) {
            linkedHashMap.put(((su2.f) obj).f494272a, obj);
        }
        f494301b = linkedHashMap;
    }

    public final java.lang.String a(su2.h resourceName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceName, "resourceName");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f494301b;
        java.lang.String str = resourceName.f494282d;
        su2.f fVar = (su2.f) linkedHashMap.get(str);
        if (fVar != null) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) c17)).Ui("ilinkres_6c359432", fVar.f494272a);
            if (Ui != null && fVar.a(Ui)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderUdrResourceLoader", "getResourceOrAsyncCheck exist, " + str + " : " + Ui.m117639xfb83cc9b());
                return Ui.m117639xfb83cc9b();
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new su2.k(fVar, null), 2, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderUdrResourceLoader", "getResourceOrAsyncCheck no match, " + str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(su2.h r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: su2.p.b(su2.h, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
