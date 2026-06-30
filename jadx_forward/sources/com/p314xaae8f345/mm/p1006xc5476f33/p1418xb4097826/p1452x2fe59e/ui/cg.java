package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class cg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dg f191287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f191288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dg dgVar, ym5.s3 s3Var) {
        super(0);
        this.f191287d = dgVar;
        this.f191288e = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f191287d.f187957g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lg lgVar = i0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lg ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lg) i0Var : null;
        if (lgVar != null) {
            ym5.s3 reason = this.f191288e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
            lgVar.o().m82690xd3a27e96(reason.f545054f);
            if (!reason.f545054f) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout = lgVar.o().getStickTopLoadingLayout();
                if (stickTopLoadingLayout != null) {
                    stickTopLoadingLayout.setVisibility(8);
                }
                lgVar.o().m82707x9a17759f(null);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = lgVar.m56068x4905e9fa();
            m56068x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hg(m56068x4905e9fa));
        }
        return jz5.f0.f384359a;
    }
}
