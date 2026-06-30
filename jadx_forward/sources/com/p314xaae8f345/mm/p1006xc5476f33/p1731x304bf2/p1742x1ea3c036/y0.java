package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15877xdff6ded2 f221570d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15877xdff6ded2 activityC15877xdff6ded2) {
        this.f221570d = activityC15877xdff6ded2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15877xdff6ded2 activityC15877xdff6ded2 = this.f221570d;
        android.widget.FrameLayout frameLayout = activityC15877xdff6ded2.f221037d.f488195c;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(frameLayout, "translationY", frameLayout.getTranslationY(), activityC15877xdff6ded2.f221037d.f488195c.getTranslationY() + activityC15877xdff6ded2.f221033i).setDuration(200L);
        duration.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.x0());
        duration.start();
        activityC15877xdff6ded2.finish();
        activityC15877xdff6ded2.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc, com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
