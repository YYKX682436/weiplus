package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes3.dex */
public class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f272853d;

    public t(android.widget.ImageView imageView) {
        this.f272853d = imageView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        android.widget.ImageView imageView = this.f272853d;
        if (actionMasked == 0) {
            if (imageView.getDrawable() != null && (imageView.getDrawable() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.v)) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.v) imageView.getDrawable()).f273561r = true;
                imageView.invalidate();
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && imageView.getDrawable() != null && (imageView.getDrawable() instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.v)) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.v) imageView.getDrawable()).f273561r = false;
            imageView.invalidate();
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
