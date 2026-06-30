package xe3;

/* loaded from: classes15.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve3.o f535480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ve3.o oVar) {
        super(1);
        this.f535480d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ve3.o callback = this.f535480d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "pausePlay " + it);
        rh3.r rVar = it.f535477d;
        if (rVar.mo162437xc00617a4()) {
            rVar.mo162425x65825f6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_video_item", "pausePlay already paused " + it);
            ((xd3.c) callback).b(-1, "pausePlay already paused");
        }
        return jz5.f0.f384359a;
    }
}
