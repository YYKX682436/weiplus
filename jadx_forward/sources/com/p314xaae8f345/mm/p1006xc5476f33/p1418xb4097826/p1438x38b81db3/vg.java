package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class vg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(in5.s0 s0Var) {
        super(0);
        this.f186321d = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) this.f186321d.p(com.p314xaae8f345.mm.R.id.e_k);
        cw2.da videoView = c15196x85976f5f.getVideoView();
        if (videoView != null) {
            c15196x85976f5f.a0(false);
            videoView.mo56716x4121a19(true);
            if (videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView).X(-1);
            } else {
                videoView.mo58789x348b34();
            }
        }
        return jz5.f0.f384359a;
    }
}
