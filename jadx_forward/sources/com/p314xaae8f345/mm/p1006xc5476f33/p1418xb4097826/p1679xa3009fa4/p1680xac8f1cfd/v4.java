package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class v4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f217737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(in5.s0 s0Var, long j17) {
        super(0);
        this.f217736d = s0Var;
        this.f217737e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cw2.da videoView = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) this.f217736d.p(com.p314xaae8f345.mm.R.id.e_k)).getVideoView();
        if (videoView != null) {
            videoView.r(((float) this.f217737e) / 1000.0f, true, 3);
        }
        return jz5.f0.f384359a;
    }
}
