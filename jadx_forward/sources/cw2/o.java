package cw2;

/* loaded from: classes15.dex */
public final class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final /* synthetic */ int r0(cw2.o oVar) {
        super.w();
        return 0;
    }

    public final void A0(java.lang.String str, java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() != android.os.Looper.getMainLooper().getThread().getId()) {
            runnable.run();
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        ((ku5.t0) u0Var).h(new cw2.b(runnable), "FinderAsyncVideoView#" + hashCode());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, cw2.da
    public boolean F() {
        A0("prepareToPlay", new cw2.g(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, cw2.da
    public void G() {
        A0("prepareforReuse", new cw2.h(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    public boolean J(java.lang.Integer num) {
        A0("startOrPlay", new cw2.m(this, num));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    public boolean a(double d17, boolean z17) {
        A0("seekTo", new cw2.i(this, d17, z17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, cw2.da
    /* renamed from: getCoverImage */
    public /* bridge */ /* synthetic */ android.widget.ImageView mo56684x37b3d7da() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: pause */
    public boolean mo58788x65825f6() {
        A0("pause", new cw2.d(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: play */
    public boolean mo58789x348b34() {
        A0(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, new cw2.f(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd
    public void q(int i17) {
        cw2.c cVar = new cw2.c(this, i17);
        if (java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) {
            cVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(cVar).get();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    public boolean r(double d17, boolean z17, int i17) {
        A0("seekTo", new cw2.j(this, d17, z17, i17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: setCustomSurfaceTexture */
    public void mo56702x939d3d01(android.graphics.SurfaceTexture texture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texture, "texture");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: setLoop */
    public void mo56708x764cf626(boolean z17) {
        A0("setLoop", new cw2.k(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: setMute */
    public void mo56709x764d819b(boolean z17) {
        A0("setMute", new cw2.l(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, zy2.g5
    /* renamed from: stop */
    public void mo58801x360802() {
        A0("stop", new cw2.n(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd, cw2.da
    public int w() {
        A0("pauseWithCancel", new cw2.e(this));
        return 0;
    }
}
