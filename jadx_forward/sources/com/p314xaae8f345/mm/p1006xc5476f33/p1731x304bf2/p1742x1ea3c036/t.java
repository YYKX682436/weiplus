package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15874x8f11b532 f221499d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15874x8f11b532 activityC15874x8f11b532) {
        this.f221499d = activityC15874x8f11b532;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/LuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15874x8f11b532 activityC15874x8f11b532 = this.f221499d;
        android.widget.FrameLayout frameLayout = activityC15874x8f11b532.f221027d.f488195c;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(frameLayout, "translationY", frameLayout.getTranslationY(), activityC15874x8f11b532.f221027d.f488195c.getTranslationY() + activityC15874x8f11b532.f221022n).setDuration(200L);
        duration.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.s());
        duration.start();
        super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
        activityC15874x8f11b532.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc, com.p314xaae8f345.mm.R.C30854x2dc211.f559364cp);
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/LuggageGameHalfWebViewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
