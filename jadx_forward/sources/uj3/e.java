package uj3;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.g f509791d;

    public e(uj3.g gVar) {
        this.f509791d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        uj3.g gVar = this.f509791d;
        android.widget.TextView textView = gVar.f509806f;
        if (textView != null) {
            textView.setVisibility(4);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = gVar.f509802b;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = gVar.f509802b;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.clearAnimation();
        }
        int i17 = -com.p314xaae8f345.mm.ui.zk.a(gVar.f509801a, 4);
        android.view.View view = gVar.f509810j;
        int width = (view != null ? view.getWidth() : 0) - com.p314xaae8f345.mm.ui.zk.a(gVar.f509801a, 32);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = gVar.f509802b;
        int left = width - (c22699x3dcdb3523 != null ? c22699x3dcdb3523.getLeft() : 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = gVar.f509802b;
        if (c22699x3dcdb3524 != null && (animate = c22699x3dcdb3524.animate()) != null && (translationX = animate.translationX(left)) != null && (translationY = translationX.translationY(i17)) != null && (duration = translationY.setDuration(300L)) != null) {
            duration.start();
        }
        int[] iArr = new int[2];
        android.view.View view2 = gVar.f509810j;
        iArr[0] = view2 != null ? view2.getWidth() : 0;
        iArr[1] = com.p314xaae8f345.mm.ui.zk.a(gVar.f509801a, 28);
        android.animation.PropertyValuesHolder ofInt = android.animation.PropertyValuesHolder.ofInt("sizeW", iArr);
        int[] iArr2 = new int[2];
        android.view.View view3 = gVar.f509810j;
        iArr2[0] = view3 != null ? view3.getHeight() : 0;
        iArr2[1] = com.p314xaae8f345.mm.ui.zk.a(gVar.f509801a, 28);
        android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofPropertyValuesHolder(ofInt, android.animation.PropertyValuesHolder.ofInt("sizeH", iArr2), android.animation.PropertyValuesHolder.ofInt("marginBottom", 0, com.p314xaae8f345.mm.ui.zk.a(gVar.f509801a, 8)), android.animation.PropertyValuesHolder.ofInt("marginEnd", 0, com.p314xaae8f345.mm.ui.zk.a(gVar.f509801a, 8))).setDuration(300L);
        duration2.addUpdateListener(new uj3.d(gVar));
        duration2.start();
    }
}
