package com.tencent.mm.modelbase;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f70634d = 0;

    public g0(com.tencent.mm.modelbase.h0 h0Var, com.tencent.mm.modelbase.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70634d < 39;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f70634d;
        this.f70634d = i17 + 1;
        switch (i17) {
            case 0:
                return com.tencent.mm.plugin.luckymoney.model.e4.INSTANCE;
            case 1:
                return e21.c1.INSTANCE;
            case 2:
                return ez3.p.INSTANCE;
            case 3:
                return com.tencent.mm.plugin.sns.model.o0.INSTANCE;
            case 4:
                return cm3.j.INSTANCE;
            case 5:
                return o90.o.INSTANCE;
            case 6:
                return i64.j1.INSTANCE;
            case 7:
                return ge0.c0.INSTANCE;
            case 8:
                return t14.y.INSTANCE;
            case 9:
                return bb0.m0.INSTANCE;
            case 10:
                return vc0.q.INSTANCE;
            case 11:
                return ff3.t.INSTANCE;
            case 12:
                return sf0.k.INSTANCE;
            case 13:
                return e62.i.INSTANCE;
            case 14:
                return bb0.j0.INSTANCE;
            case 15:
                return m90.j2.INSTANCE;
            case 16:
                return la0.j0.INSTANCE;
            case 17:
                return we0.v1.INSTANCE;
            case 18:
                return com.tencent.mm.ui.tools.jd.INSTANCE;
            case 19:
                return q12.c4.INSTANCE;
            case 20:
                return im.n.INSTANCE;
            case 21:
                return z90.k.INSTANCE;
            case 22:
                return ge0.l0.INSTANCE;
            case 23:
                return o90.u.INSTANCE;
            case 24:
                return ge0.n0.INSTANCE;
            case 25:
                return ww1.m1.INSTANCE;
            case 26:
                return ni4.a0.INSTANCE;
            case 27:
                return com.tencent.mm.plugin.messenger.foundation.q.INSTANCE;
            case 28:
                return mt.s.INSTANCE;
            case 29:
                return nv.c.INSTANCE;
            case 30:
                return l32.y.INSTANCE;
            case 31:
                return u21.n.INSTANCE;
            case 32:
                return vd0.m2.INSTANCE;
            case 33:
                return yv1.k1.INSTANCE;
            case 34:
                return u40.u.INSTANCE;
            case 35:
                return m73.p.INSTANCE;
            case 36:
                return z62.v.INSTANCE;
            case 37:
                return o30.c.INSTANCE;
            case 38:
                return cx1.b.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 39");
        }
    }
}
