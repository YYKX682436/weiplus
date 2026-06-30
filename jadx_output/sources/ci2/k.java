package ci2;

/* loaded from: classes10.dex */
public final class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.n f41685d;

    public k(ci2.n nVar) {
        this.f41685d = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ci2.n nVar = this.f41685d;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = nVar.f41691e.f262201b;
        kotlinx.coroutines.y0 a17 = ((fi2.i) nVar.getService()).f262841a.f262872c.a();
        if (a17 == null) {
            a17 = kotlinx.coroutines.z0.b();
        }
        ripperAnimateView.b(a17);
        nVar.f41691e.f262201b.setInitRadius(r1.f262202c.getWidth() / 2.0f);
        nVar.f41691e.f262201b.setStrokeWidth((int) (r1.getWidth() * 0.07f));
        android.view.ViewTreeObserver viewTreeObserver = nVar.f41691e.f262200a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.tencent.mars.xlog.Log.i("ChatVoiceRoomPreviewContentLayout", "onGlobalLayout,avatar size: " + nVar.f41691e.f262202c.getWidth() + ' ' + nVar.f41691e.f262202c.getHeight() + ",wave size: " + nVar.f41691e.f262201b.getWidth() + ' ' + nVar.f41691e.f262201b.getHeight());
    }
}
