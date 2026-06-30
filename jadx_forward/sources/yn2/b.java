package yn2;

/* loaded from: classes2.dex */
public final class b implements cw2.xa {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f545495d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f545495d = c15196x85976f5f;
    }

    @Override // cw2.xa
    public void b(boolean z17) {
        boolean z18 = vn2.u0.f519920a.h() || z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f545495d;
        if (c15196x85976f5f.isMute != z18) {
            c15196x85976f5f.mo61320x764d819b(z18);
            cw2.da videoView = c15196x85976f5f.getVideoView();
            if (videoView != null) {
                videoView.mo56709x764d819b(z18);
            }
        }
    }
}
