package l72;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l72.j f398376d;

    public e(l72.j jVar) {
        this.f398376d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = this.f398376d.f398386a;
        n72.q qVar = activityC13534x1dc4b4e7.f181726z;
        if (qVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "stopPreview ,isPreview %s camera:%s", java.lang.Boolean.valueOf(qVar.f416815q), qVar.f416808g);
            if (qVar.f416808g != null) {
                qVar.f416815q = false;
                qVar.f416808g.l();
                qVar.f416808g.g(null);
                qVar.f416804J.mo50302x6b17ad39(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d.c();
            }
        }
        activityC13534x1dc4b4e7.f181707d.setVisibility(8);
        activityC13534x1dc4b4e7.f181708e.setVisibility(0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, activityC13534x1dc4b4e7.f181716p.getHeight());
        translateAnimation.setDuration(2000L);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setRepeatCount(-1);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(new l72.o(activityC13534x1dc4b4e7));
        animationSet.setRepeatCount(-1);
        activityC13534x1dc4b4e7.f181718r.startAnimation(animationSet);
    }
}
