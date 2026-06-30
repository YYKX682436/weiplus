package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class h00 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 f188407J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var, in5.s itemConvertFactory, java.util.ArrayList data, boolean z17) {
        super(itemConvertFactory, data, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f188407J = v00Var;
    }

    @Override // in5.n0
    public java.lang.String k0(java.lang.Exception e17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            return j5Var.toString();
        }
        return "Feed[" + j5Var + "] is not BaseFinderFeed";
    }

    @Override // in5.n0
    public java.lang.String l0(java.lang.Exception e17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return super.l0(e17, i17);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.I(holder, i17);
        if (this.I) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zj(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) this.f188407J.f192380e).U0(), "ShowResult");
        this.I = true;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf
    public void y0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
    }
}
