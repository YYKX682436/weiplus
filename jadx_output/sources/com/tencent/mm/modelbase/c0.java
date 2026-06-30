package com.tencent.mm.modelbase;

/* loaded from: classes.dex */
public class c0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f70595d = 0;

    public c0(com.tencent.mm.modelbase.d0 d0Var, com.tencent.mm.modelbase.b0 b0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70595d < 24;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f70595d;
        this.f70595d = i17 + 1;
        switch (i17) {
            case 0:
                return va3.u.INSTANCE;
            case 1:
                return c01.q2.INSTANCE;
            case 2:
                return c01.nd.INSTANCE;
            case 3:
                return m11.n0.INSTANCE;
            case 4:
                return com.tencent.mm.plugin.voip.model.o1.INSTANCE;
            case 5:
                return dh4.r.INSTANCE;
            case 6:
                return r61.h.INSTANCE;
            case 7:
                return r21.b0.INSTANCE;
            case 8:
                return k41.f0.INSTANCE;
            case 9:
                return r21.u.INSTANCE;
            case 10:
                return jq.g.INSTANCE;
            case 11:
                return ss3.s.INSTANCE;
            case 12:
                return c01.dd.INSTANCE;
            case 13:
                return yf4.h.INSTANCE;
            case 14:
                return c01.v9.INSTANCE;
            case 15:
                return iy4.d1.INSTANCE;
            case 16:
                return com.tencent.mm.modelstat.z.INSTANCE;
            case 17:
                return com.tencent.mm.pluginsdk.model.r0.INSTANCE;
            case 18:
                return com.tencent.mm.pluginsdk.model.app.d0.INSTANCE;
            case 19:
                return c01.gd.INSTANCE;
            case 20:
                return w21.a1.INSTANCE;
            case 21:
                return t21.h3.INSTANCE;
            case 22:
                return c01.lb.INSTANCE;
            case 23:
                return va3.p0.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 24");
        }
    }
}
