package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ha extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f188443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa f188444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ym5.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar) {
        super(0);
        this.f188443d = s3Var;
        this.f188444e = oaVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ym5.s3 s3Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        android.view.View f294968x;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        ym5.s3 s3Var2 = this.f188443d;
        if (s3Var2 == null) {
            s3Var = new ym5.s3(0);
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erb);
        } else {
            s3Var = s3Var2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f188444e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = oaVar.f188690f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = (a1Var == null || (m56022x4905e9fa = a1Var.m56022x4905e9fa()) == null) ? null : m56022x4905e9fa.mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        boolean z17 = (c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) <= 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollowFeedUIContract.Presenter", "[checkEmptyHeader] isEmpty=" + z17 + " reason=" + s3Var);
        if (s3Var2 != null) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209576yd).mo141623x754a37bb()).r()).intValue() == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = oaVar.f188690f;
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = a1Var2 != null ? a1Var2.f187713m : null;
                if (c22801x87cbdc004 != null) {
                    c22801x87cbdc004.m82688x390c1d00(false);
                }
            }
            if (s3Var2.f545054f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = oaVar.f188690f;
                if ((a1Var3 == null || (c22801x87cbdc003 = a1Var3.f187713m) == null || c22801x87cbdc003.getEnableLoadMore()) ? false : true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var4 = oaVar.f188690f;
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = a1Var4 != null ? a1Var4.f187713m : null;
                    if (c22801x87cbdc005 != null) {
                        c22801x87cbdc005.m82688x390c1d00(true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var5 = oaVar.f188690f;
                    if (a1Var5 != null && (c22801x87cbdc002 = a1Var5.f187713m) != null) {
                        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(oaVar.f188688d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570708bk1, (android.view.ViewGroup) null);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                        c22801x87cbdc002.m82697xe136b7d8(inflate);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var6 = oaVar.f188690f;
                    if (a1Var6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa) {
                    }
                    if (a1Var6 != null && (c22801x87cbdc00 = a1Var6.f187713m) != null && (f294968x = c22801x87cbdc00.getF294968x()) != null && (c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) f294968x.findViewById(com.p314xaae8f345.mm.R.id.m6l)) != null) {
                        c22627xa933f8e4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.avk);
                    }
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var7 = oaVar.f188690f;
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = a1Var7 != null ? a1Var7.f187713m : null;
                if (c22801x87cbdc006 != null) {
                    c22801x87cbdc006.m82688x390c1d00(false);
                }
            }
        }
        in5.w wVar = oaVar.f190164q;
        if (z17) {
            if (wVar instanceof so2.s) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erb);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                ((so2.s) wVar).f492115d = string;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f492116e = s3Var.f545050b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f492117f = oaVar.f190160m;
            }
            if ((c22848x6ddd90cf == null || c22848x6ddd90cf.W(wVar)) ? false : true) {
                c22848x6ddd90cf.Q(wVar, false);
            } else if (s3Var2 != null && c22848x6ddd90cf != null) {
                c22848x6ddd90cf.c0(((so2.s) wVar).hashCode());
            }
        } else if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.i0(((so2.s) wVar).hashCode(), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var8 = oaVar.f188690f;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc007 = a1Var8 != null ? a1Var8.f187713m : null;
        if (c22801x87cbdc007 != null) {
            c22801x87cbdc007.m82557x5e058fc9((s3Var.f545050b == -1 && z17) ? false : true);
        }
        return jz5.f0.f384359a;
    }
}
