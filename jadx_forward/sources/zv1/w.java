package zv1;

/* loaded from: classes15.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final zv1.t f557920d = new zv1.t(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile zv1.w f557921e;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f557922a = jz5.h.b(zv1.u.f557913d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f557923b = jz5.h.b(zv1.v.f557916d);

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f557924c;

    public w(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.util.Map r36, zv1.a0 r37, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r38) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.w.a(java.util.Map, zv1.a0, com.tencent.wcdb.support.CancellationSignal):java.util.List");
    }

    public final java.util.Map b(java.util.Set set, zv1.a0 a0Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 enumC13101x40600c60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60) it.next();
            if (enumC13101x40600c60 != com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35414x24a738) {
                if (c26987xeef691ab != null) {
                    c26987xeef691ab.m108011xf4ed245c();
                }
                zv1.d a17 = zv1.k.f557845a.a(enumC13101x40600c60, a0Var);
                if (a17 != null) {
                    linkedHashMap.put(enumC13101x40600c60, java.lang.Long.valueOf(zv1.m.a(a17, c26987xeef691ab)));
                }
            }
        }
        return linkedHashMap;
    }
}
