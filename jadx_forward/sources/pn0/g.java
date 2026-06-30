package pn0;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn0.h f438487d;

    public g(pn0.h hVar) {
        this.f438487d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pn0.h hVar = this.f438487d;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = hVar.f438480k;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            android.view.TextureView mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f438488l, "release oldView: " + mo46536x4ee17f0a);
            if (mo46536x4ee17f0a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f438488l, "release reset");
                scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46537xcd50899c();
                mo46536x4ee17f0a.setSurfaceTextureListener(null);
            }
        }
    }
}
