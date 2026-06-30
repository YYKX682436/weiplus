package ci2;

/* loaded from: classes10.dex */
public final class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.n f123218d;

    public k(ci2.n nVar) {
        this.f123218d = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ci2.n nVar = this.f123218d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = nVar.f123224e.f343734b;
        p3325xe03a0797.p3326xc267989b.y0 a17 = ((fi2.i) nVar.m14915xb411027f()).f344374a.f344405c.a();
        if (a17 == null) {
            a17 = p3325xe03a0797.p3326xc267989b.z0.b();
        }
        c14246xaa893502.b(a17);
        nVar.f123224e.f343734b.m56877x290db7c4(r1.f343735c.getWidth() / 2.0f);
        nVar.f123224e.f343734b.m56878xe2eaa4ac((int) (r1.getWidth() * 0.07f));
        android.view.ViewTreeObserver viewTreeObserver = nVar.f123224e.f343733a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatVoiceRoomPreviewContentLayout", "onGlobalLayout,avatar size: " + nVar.f123224e.f343735c.getWidth() + ' ' + nVar.f123224e.f343735c.getHeight() + ",wave size: " + nVar.f123224e.f343734b.getWidth() + ' ' + nVar.f123224e.f343734b.getHeight());
    }
}
