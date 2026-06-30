package com.p314xaae8f345.mm.app;

/* loaded from: classes6.dex */
public class c2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f134891d = 0;

    public c2(com.p314xaae8f345.mm.app.d2 d2Var, com.p314xaae8f345.mm.app.b2 b2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f134891d < 14;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f134891d;
        this.f134891d = i17 + 1;
        switch (i17) {
            case 0:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.i.INSTANCE;
            case 1:
                return qs.u.INSTANCE;
            case 2:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h1.INSTANCE;
            case 3:
                return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.EnumC3372xe8de7f.INSTANCE;
            case 4:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.s.INSTANCE;
            case 5:
                return gt.s3.INSTANCE;
            case 6:
                return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.z2.INSTANCE;
            case 7:
                return b83.r.INSTANCE;
            case 8:
                return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.b.INSTANCE;
            case 9:
                return com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.EnumC4949x4d437c2d.INSTANCE;
            case 10:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.k.INSTANCE;
            case 11:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t7.INSTANCE;
            case 12:
                return gt.m3.INSTANCE;
            case 13:
                return pd0.o1.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 14");
        }
    }
}
