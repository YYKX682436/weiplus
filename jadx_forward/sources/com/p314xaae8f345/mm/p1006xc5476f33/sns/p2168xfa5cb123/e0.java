package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f246380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f246381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i17, int i18) {
        super(1);
        this.f246380d = i17;
        this.f246381e = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        wa4.q snsPostCgiReportObj = (wa4.q) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsPostCgiReportObj, "snsPostCgiReportObj");
        java.lang.String str = snsPostCgiReportObj.f525810f;
        java.lang.String valueOf = java.lang.String.valueOf(this.f246380d);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            valueOf = str + "#" + valueOf;
        }
        snsPostCgiReportObj.f525810f = valueOf;
        snsPostCgiReportObj.f525809e++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a;
        i0Var.p(snsPostCgiReportObj);
        dx1.g.f326022a.j("SnsPublishProcess", "opresult_", 6, bx1.u.f117842d);
        i0Var.d(this.f246381e + "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportNetPost$1");
        return f0Var;
    }
}
