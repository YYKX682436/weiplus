package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class y3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 f218054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f218055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 f218056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808) {
        super(1);
        this.f218054d = a4Var;
        this.f218055e = lVar;
        this.f218056f = c15324x3354d808;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a it = (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = this.f218054d;
        in5.s0 s0Var = a4Var.f215248h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) s0Var.p(com.p314xaae8f345.mm.R.id.fs6) : null;
        if (c15324x3354d808 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderAnimateVideoviewUIC", "removeMediaMask return for null.");
        } else {
            c15324x3354d808.removeView(a4Var.f215250m);
        }
        this.f218055e.mo146xb9724478(it);
        this.f218056f.clearAnimation();
        yz5.a aVar = a4Var.f215263z;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        a4Var.f215263z = null;
        return jz5.f0.f384359a;
    }
}
