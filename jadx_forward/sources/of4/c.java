package of4;

/* loaded from: classes4.dex */
public final class c implements sf4.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93 f426638a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93 activityC18468x57f0fe93) {
        this.f426638a = activityC18468x57f0fe93;
    }

    public void a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93 activityC18468x57f0fe93 = this.f426638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = activityC18468x57f0fe93.f253398f;
        if (c18497x85806502 != null) {
            c18497x85806502.setEnabled(false);
            long height = ((c18497x85806502.getHeight() - c18497x85806502.getTranslationY()) / c18497x85806502.getHeight()) * 300;
            if (height < 0) {
                height = 0;
            }
            android.widget.ImageView imageView = activityC18468x57f0fe93.f253399g;
            if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(height)) != null) {
                duration.start();
            }
            c18497x85806502.animate().translationY(c18497x85806502.getHeight()).setDuration(height).withEndAction(new of4.b(activityC18468x57f0fe93)).start();
        }
    }
}
