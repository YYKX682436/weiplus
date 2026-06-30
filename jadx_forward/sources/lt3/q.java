package lt3;

/* loaded from: classes10.dex */
public final class q extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public lt3.g f402804f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f402805g;

    /* renamed from: h, reason: collision with root package name */
    public int f402806h;

    public q(lt3.g editorData, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorData, "editorData");
        this.f402804f = editorData;
        this.f402805g = c16991x15ced046;
    }

    @Override // fp0.d
    public void a() {
        if (lt3.v.f402812c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoMixHandler", "running forground task");
            b(fp0.u.f346825h);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new lt3.o(this), "VideoMixHandler");
        }
    }

    @Override // fp0.d
    public java.lang.String d() {
        return "mixTask_" + this.f402804f.f68213x11522065;
    }
}
