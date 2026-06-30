package z51;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.w f551760d;

    public v(z51.w wVar) {
        this.f551760d = wVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/player/component/LivePhotoThumbViewPc$buildView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 1) {
            z51.w wVar = this.f551760d;
            if (wVar.f551764i && wVar.f551766k) {
                ((z51.p) wVar.a(z51.p.class)).h();
                wVar.f551766k = false;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/player/component/LivePhotoThumbViewPc$buildView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
