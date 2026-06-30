package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class nw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f190134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f190135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ym5.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(0);
        this.f190134d = s3Var;
        this.f190135e = pzVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa;
        ym5.s3 s3Var = this.f190134d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erb);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f190135e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar = pzVar.f190292m;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = (ctVar == null || (m56655x4905e9fa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar).m56655x4905e9fa()) == null) ? null : m56655x4905e9fa.mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        pzVar.Y = (c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) <= 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "[checkEmptyHeader] isEmpty=" + pzVar.Y + " reason=" + s3Var);
        int i18 = pzVar.f190295p;
        boolean z17 = i18 == 35 && ((i17 = s3Var.f545050b) == -3 || i17 == -4);
        boolean z18 = pzVar.Y;
        in5.w wVar = pzVar.f190309y0;
        if (z18 || z17) {
            if (z17) {
                pzVar.C.m56387xe6796cde().clear();
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar2 = pzVar.f190292m;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l17 = ctVar2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar2).l() : null;
            if (l17 != null) {
                l17.m82688x390c1d00(false);
            }
            if (wVar instanceof so2.s) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erb);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                ((so2.s) wVar).f492115d = string;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f492116e = s3Var.f545050b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f492117f = i18;
                java.lang.Object obj = s3Var.f545053e;
                so2.g5 g5Var = obj instanceof so2.g5 ? (so2.g5) obj : null;
                if (g5Var != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                    ((so2.s) wVar).f492118g = g5Var;
                }
            }
            if ((c22848x6ddd90cf == null || c22848x6ddd90cf.W(wVar)) ? false : true) {
                c22848x6ddd90cf.Q(wVar, false);
            } else if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.c0(((so2.s) wVar).hashCode());
            }
        } else if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.i0(((so2.s) wVar).hashCode(), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar3 = pzVar.f190292m;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l18 = ctVar3 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) ctVar3).l() : null;
        if (l18 != null) {
            l18.m82557x5e058fc9((s3Var.f545050b == -1 && pzVar.Y) ? false : true);
        }
        return jz5.f0.f384359a;
    }
}
