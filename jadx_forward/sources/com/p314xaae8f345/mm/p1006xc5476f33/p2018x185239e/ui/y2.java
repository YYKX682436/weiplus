package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class y2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239579a;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var) {
        this.f239579a = h3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "preloadLiteApp fail: " + appId + ", errCode: " + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "preloadLiteApp success: " + info + ", errCode: " + i17);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var = this.f239579a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Qj(h3Var.f239268d, "wxalite5902f97ca32a59d74355fc2e32843e79@pay", "pages/home/home", "preloadLiteApp");
        h3Var.f239278q = true;
    }
}
