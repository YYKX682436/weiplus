package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class hu extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f188485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu f188486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(ym5.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar) {
        super(0);
        this.f188485d = s3Var;
        this.f188486e = zuVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ym5.s3 s3Var = this.f188485d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.era);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zu zuVar = this.f188486e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo56062x4905e9fa = zuVar.g().mo56062x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo56062x4905e9fa != null ? mo56062x4905e9fa.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        boolean z17 = (c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) <= 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsPresenter", "[checkEmptyHeader] isEmpty=" + z17 + " reason=" + s3Var);
        boolean z18 = s3Var.f545049a != 2 && s3Var.f545050b == -2;
        so2.s sVar = zuVar.f192834p;
        if (z17 || z18) {
            if (z18) {
                zuVar.f192830i.m56387xe6796cde().clear();
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
                zuVar.f192833o = true;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f17 = zuVar.g().f();
            if (f17 != null) {
                f17.m82688x390c1d00(false);
            }
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.era);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            sVar.getClass();
            sVar.f492115d = string;
            sVar.f492116e = s3Var.f545050b;
            sVar.f492117f = 2;
            if ((c22848x6ddd90cf == null || c22848x6ddd90cf.W(sVar)) ? false : true) {
                c22848x6ddd90cf.Q(sVar, false);
            } else if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.c0(sVar.hashCode());
            }
        } else if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.i0(sVar.hashCode(), false);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f18 = zuVar.g().f();
        if (f18 != null) {
            f18.m82557x5e058fc9((s3Var.f545050b == -1 && z17) ? false : true);
        }
        return jz5.f0.f384359a;
    }
}
