package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class si implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f211348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f211349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f211350g;

    public si(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6, long j17, boolean z17, in5.s0 s0Var) {
        this.f211347d = activityC15076x7a6c76b6;
        this.f211348e = j17;
        this.f211349f = z17;
        this.f211350g = s0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public final void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        cw2.da videoView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        java.lang.String str = this.f211347d.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSeek: onSeekComplete, feedId=");
        sb6.append(pm0.v.u(this.f211348e));
        sb6.append(", afterSeekPlay=");
        boolean z17 = this.f211349f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        in5.s0 s0Var = this.f211350g;
        if (!z17 && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) != null) {
            cw2.v9.j(c15196x85976f5f, false, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f2 == null || (videoView = c15196x85976f5f2.getVideoView()) == null) {
            return;
        }
        videoView.mo56709x764d819b(false);
    }
}
