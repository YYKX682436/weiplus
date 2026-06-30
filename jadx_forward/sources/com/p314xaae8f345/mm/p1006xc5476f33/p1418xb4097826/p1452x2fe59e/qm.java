package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class qm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f190368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.um f190369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(ym5.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.um umVar) {
        super(0);
        this.f190368d = s3Var;
        this.f190369e = umVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        ym5.s3 s3Var = this.f190368d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erb);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.um umVar = this.f190369e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = umVar.f188690f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = (a1Var == null || (m56022x4905e9fa = a1Var.m56022x4905e9fa()) == null) ? null : m56022x4905e9fa.mo7946xf939df19();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        boolean z17 = (c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) <= 0;
        in5.w wVar = umVar.f192359o;
        if (z17) {
            if (wVar instanceof so2.s) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erb);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                ((so2.s) wVar).f492115d = string;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f492116e = s3Var.f545050b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData");
                ((so2.s) wVar).f492117f = umVar.f192356i;
            }
            if ((c22848x6ddd90cf == null || c22848x6ddd90cf.W(wVar)) ? false : true) {
                c22848x6ddd90cf.Q(wVar, false);
            }
        } else if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.i0(((so2.s) wVar).hashCode(), false);
        }
        return jz5.f0.f384359a;
    }
}
