package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.c0 f246375d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.c0();

    public c0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        wa4.q snsPostCgiReportObj = (wa4.q) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsPostCgiReportObj, "snsPostCgiReportObj");
        dx1.f fVar = dx1.g.f326022a;
        fVar.i("SnsPublishProcess", "cgiReconnectCnt", java.lang.Integer.valueOf(snsPostCgiReportObj.f525809e));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(snsPostCgiReportObj.f525810f)) {
            java.lang.String cgiresult = snsPostCgiReportObj.f525810f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cgiresult, "cgiresult");
            fVar.i("SnsPublishProcess", "cgiresult", cgiresult);
        }
        fVar.i("SnsPublishProcess", "returnDuration", java.lang.Integer.valueOf((int) (c01.id.c() - snsPostCgiReportObj.f525811g)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$doReport$1");
        return f0Var;
    }
}
