package cw2;

/* loaded from: classes2.dex */
public final class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 f305249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305252g;

    public f9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305249d = c15183xcf23ff21;
        this.f305250e = i17;
        this.f305251f = i18;
        this.f305252g = c15196x85976f5f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f305250e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21 = this.f305249d;
        c15183xcf23ff21.mo61298xa7077af8(i17);
        c15183xcf23ff21.a(this.f305251f);
        cw2.da videoView = this.f305252g.getVideoView();
        c15183xcf23ff21.x(videoView != null ? videoView.mo56685x3d7f3f1d() : 0L);
    }
}
