package mn0;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f411326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f411327e;

    public r(mn0.y yVar, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f411326d = yVar;
        this.f411327e = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn0.y yVar = this.f411326d;
        r45.p72 p72Var = yVar.P;
        jz5.g gVar = yVar.N;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f411327e;
        if (p72Var != null) {
            p72Var.set(5, java.lang.Integer.valueOf((((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() <= 0 || scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getWidth() <= 0 || scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getHeight() <= 0 || ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() / 5 < scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getWidth() * scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getHeight()) ? 0 : 1));
        }
        java.lang.String b17 = yVar.f411339e.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BaseLiveTXPlayer update isSmallScale=");
        r45.p72 p72Var2 = yVar.P;
        sb6.append(p72Var2 != null ? java.lang.Integer.valueOf(p72Var2.m75939xb282bd08(5)) : null);
        sb6.append(", screenArea=");
        sb6.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        sb6.append(", view width=");
        sb6.append(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getWidth());
        sb6.append(", height=");
        sb6.append(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
    }
}
