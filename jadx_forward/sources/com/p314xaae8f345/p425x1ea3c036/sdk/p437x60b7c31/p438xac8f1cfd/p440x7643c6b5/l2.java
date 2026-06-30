package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class l2 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 f129008d;

    public l2(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var) {
        this.f129008d = n2Var;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        vp5.h hVar;
        int i17 = bVar == null ? -1 : com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.k2.f128999a[bVar.ordinal()];
        if (i17 == 1) {
            hVar = vp5.h.f520644d;
        } else if (i17 == 2) {
            hVar = vp5.h.f520645e;
        } else if (i17 == 3) {
            hVar = vp5.h.f520646f;
        } else {
            if (i17 != 4) {
                throw new jz5.j();
            }
            hVar = vp5.h.f520647g;
        }
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = this.f129008d.f129035a;
        if (abstractC22919x419b2652 != null) {
            abstractC22919x419b2652.m83334xf2e6d8a1(hVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
    }
}
