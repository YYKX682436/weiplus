package pu1;

/* loaded from: classes13.dex */
public final class b extends es0.d {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f439951o;

    /* renamed from: p, reason: collision with root package name */
    public final pu1.a f439952p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f439953q;

    /* renamed from: r, reason: collision with root package name */
    public int f439954r;

    public b() {
        super(false, 1, null);
        this.f439952p = new pu1.a();
        this.f439953q = new java.util.ArrayList();
    }

    public final void c() {
        this.f337846c = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        this.f337845b = (((int) (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf * (this.f337845b / this.f337846c))) / 16) * 16;
        this.f337847d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_screec_cast_pc_video_bitrate, 4000) * 1000;
        this.f337850g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_screec_cast_pc_video_iframe_interval, 3);
    }

    @Override // es0.d
    /* renamed from: toString */
    public java.lang.String mo128077x9616526c() {
        return "mVideoWidth:" + this.f337845b + "  mVideoHeight : " + this.f337846c + " mBitRate : " + this.f337847d + " , mFps : " + this.f337848e + ' ';
    }
}
