package d04;

/* loaded from: classes13.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f306912d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb) {
        this.f306912d = c17326x8613bffb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb.H1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f306912d;
        if (c17326x8613bffb.isViewDestroy || (bitmap = c17326x8613bffb.f241219J) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        if (bitmap.isRecycled()) {
            return;
        }
        android.widget.ImageView imageView = c17326x8613bffb.C;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameImage");
            throw null;
        }
        imageView.setImageBitmap(c17326x8613bffb.f241219J);
        android.widget.ImageView imageView2 = c17326x8613bffb.C;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameImage");
            throw null;
        }
        imageView2.setVisibility(0);
        android.widget.ImageView imageView3 = c17326x8613bffb.C;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameImage");
            throw null;
        }
        imageView3.setAlpha(0.0f);
        android.widget.ImageView imageView4 = c17326x8613bffb.C;
        if (imageView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameImage");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = imageView4.animate();
        if (animate != null) {
            animate.cancel();
        }
        android.widget.ImageView imageView5 = c17326x8613bffb.C;
        if (imageView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameImage");
            throw null;
        }
        android.view.ViewPropertyAnimator animate2 = imageView5.animate();
        if (animate2 == null || (alpha = animate2.alpha(1.0f)) == null || (duration = alpha.setDuration(200L)) == null) {
            return;
        }
        duration.start();
    }
}
