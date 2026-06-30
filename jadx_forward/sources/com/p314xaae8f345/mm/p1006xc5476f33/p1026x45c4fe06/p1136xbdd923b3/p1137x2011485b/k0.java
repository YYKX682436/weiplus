package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

/* loaded from: classes7.dex */
public final class k0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0 f165835a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f165836b = new java.util.concurrent.ConcurrentSkipListSet(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.j0.f165827d);

    public void a(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.Iterator it = f165836b.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            fj1.y yVar = (fj1.y) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar.c(), appId) && yVar.f344680g == i17) {
                try {
                    yVar.b();
                } finally {
                    it.remove();
                }
            }
        }
    }
}
