package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class m1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53514d = 0;

    public m1(com.tencent.mm.app.n1 n1Var, com.tencent.mm.app.l1 l1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53514d < 18;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53514d;
        this.f53514d = i17 + 1;
        switch (i17) {
            case 0:
                return el4.z.INSTANCE;
            case 1:
                return a35.x.INSTANCE;
            case 2:
                return ge0.a0.INSTANCE;
            case 3:
                return com.tencent.mm.accessibility.feature.ScreenRecordStaticForegroundListenerProvider.INSTANCE;
            case 4:
                return z33.n.INSTANCE;
            case 5:
                return ag4.h.INSTANCE;
            case 6:
                return com.tencent.mm.accessibility.feature.AccStaticForegroundListenerProvider.INSTANCE;
            case 7:
                return xh4.j.INSTANCE;
            case 8:
                return wa3.k.INSTANCE;
            case 9:
                return uf4.g.INSTANCE;
            case 10:
                return dj3.p.INSTANCE;
            case 11:
                return b25.l.INSTANCE;
            case 12:
                return vh4.r2.INSTANCE;
            case 13:
                return ue5.e.INSTANCE;
            case 14:
                return ah0.s1.INSTANCE;
            case 15:
                return j14.m.INSTANCE;
            case 16:
                return cp1.c.INSTANCE;
            case 17:
                return v71.c.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 18");
        }
    }
}
