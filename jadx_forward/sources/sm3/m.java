package sm3;

/* loaded from: classes10.dex */
public final class m implements sm3.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm3.o f491421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f491422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f491423c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm3.n f491424d;

    public m(sm3.o oVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, sm3.n nVar) {
        this.f491421a = oVar;
        this.f491422b = i17;
        this.f491423c = f0Var;
        this.f491424d = nVar;
    }

    public void a(sm3.c0 edge, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(edge, "edge");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksAdapter", "onSlidingStarted: " + i17 + ", " + i18);
        float f17 = (float) i17;
        sm3.o oVar = this.f491421a;
        long mo67411xf6b910ea = (long) (f17 / oVar.f491430e.mo67411xf6b910ea());
        long mo67411xf6b910ea2 = (long) (((float) i18) / oVar.f491430e.mo67411xf6b910ea());
        sm3.q qVar = (sm3.q) oVar.f491429d;
        qVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSlidingStarted: index=");
        int i19 = this.f491422b;
        sb6.append(i19);
        sb6.append(", startTime=");
        sb6.append(mo67411xf6b910ea);
        sb6.append(", endTime=");
        sb6.append(mo67411xf6b910ea2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksEditView", sb6.toString());
        sm3.u callback = qVar.f491436a.getCallback();
        if (callback != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onTrackSlidingStarted: index=" + i19 + ", startTime=" + mo67411xf6b910ea + ", endTime=" + mo67411xf6b910ea2);
            pk4.c cVar = ((mm3.h) callback).f411172g.f232719n;
            if (cVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).a();
            }
            kl3.t.g().a().mo67220x65825f6();
        }
    }
}
