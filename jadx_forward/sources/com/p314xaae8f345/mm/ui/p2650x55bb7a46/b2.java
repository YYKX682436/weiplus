package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc f280018d;

    public b2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc wcVar) {
        this.f280018d = wcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc wcVar = this.f280018d;
        android.widget.TextView textView = wcVar.f287453d;
        int height = textView != null ? textView.getHeight() : 0;
        android.widget.TextView textView2 = wcVar.f287452c;
        int height2 = textView2 != null ? textView2.getHeight() : 0;
        android.widget.ImageView imageView = wcVar.f287451b;
        int height3 = imageView != null ? imageView.getHeight() : 0;
        android.widget.ImageView imageView2 = wcVar.f287451b;
        android.view.ViewGroup.LayoutParams layoutParams = imageView2 != null ? imageView2.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (height + height2 > height3) {
            if (layoutParams2 != null) {
                layoutParams2.gravity = 48;
            }
        } else if (layoutParams2 != null) {
            layoutParams2.gravity = 17;
        }
        android.widget.ImageView imageView3 = wcVar.f287451b;
        if (imageView3 == null) {
            return;
        }
        imageView3.setLayoutParams(layoutParams2);
    }
}
