package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class i1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53446d = 0;

    public i1(com.tencent.mm.app.j1 j1Var, com.tencent.mm.app.h1 h1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53446d < 30;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53446d;
        this.f53446d = i17 + 1;
        switch (i17) {
            case 0:
                return el4.z.INSTANCE;
            case 1:
                return a35.x.INSTANCE;
            case 2:
                return com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListenerProvider.INSTANCE;
            case 3:
                return z33.n.INSTANCE;
            case 4:
                return com.tencent.mm.accessibility.feature.AccStaticForegroundListenerProvider.INSTANCE;
            case 5:
                return wz.g.INSTANCE;
            case 6:
                return q12.c.INSTANCE;
            case 7:
                return wj0.k.INSTANCE;
            case 8:
                return c73.o.INSTANCE;
            case 9:
                return ah0.s1.INSTANCE;
            case 10:
                return ha0.m.INSTANCE;
            case 11:
                return i80.g.INSTANCE;
            case 12:
                return j14.m.INSTANCE;
            case 13:
                return cp1.c.INSTANCE;
            case 14:
                return qb0.o.INSTANCE;
            case 15:
                return ge0.a0.INSTANCE;
            case 16:
                return ag4.h.INSTANCE;
            case 17:
                return gq4.a0.INSTANCE;
            case 18:
                return xh4.j.INSTANCE;
            case 19:
                return com.tencent.mm.plugin.appbrand.appusage.d7.INSTANCE;
            case 20:
                return wa3.k.INSTANCE;
            case 21:
                return uf4.g.INSTANCE;
            case 22:
                return dj3.p.INSTANCE;
            case 23:
                return pd0.c1.INSTANCE;
            case 24:
                return b25.l.INSTANCE;
            case 25:
                return gt.p3.INSTANCE;
            case 26:
                return vh4.r2.INSTANCE;
            case 27:
                return ue5.e.INSTANCE;
            case 28:
                return u40.r.INSTANCE;
            case 29:
                return v71.c.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 30");
        }
    }
}
