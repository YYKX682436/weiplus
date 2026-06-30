package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class yb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f165476a;

    public yb(yz5.q qVar) {
        this.f165476a = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        pj4.r0 r0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11952x91bb3f8b c11952x91bb3f8b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11952x91bb3f8b) abstractC11888x1a859600;
        if (c11952x91bb3f8b.f160202f != null) {
            r0Var = new pj4.r0();
            r0Var.mo11468x92b714fd(c11952x91bb3f8b.f160202f);
        } else {
            r0Var = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "onReceiveResult, publishTextStatus done," + c11952x91bb3f8b.f160200d + ' ' + c11952x91bb3f8b.f160201e + ' ' + r0Var);
        this.f165476a.mo147xb9724478(java.lang.Integer.valueOf(c11952x91bb3f8b.f160200d), c11952x91bb3f8b.f160201e, r0Var);
    }
}
