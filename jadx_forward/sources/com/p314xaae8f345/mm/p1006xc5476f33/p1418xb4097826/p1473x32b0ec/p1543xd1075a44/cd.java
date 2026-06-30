package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class cd extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd f199525d;

    public cd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd gdVar) {
        this.f199525d = gdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd gdVar = this.f199525d;
        gdVar.setVisibility(8);
        int i17 = gdVar.f199953d;
        gdVar.f199955f = i17;
        gdVar.f199956g.setText(java.lang.String.valueOf(i17));
        gdVar.setAlpha(1.0f);
        yz5.a aVar = gdVar.f199959m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gd gdVar = this.f199525d;
        gdVar.setVisibility(8);
        int i17 = gdVar.f199953d;
        gdVar.f199955f = i17;
        gdVar.f199956g.setText(java.lang.String.valueOf(i17));
        gdVar.setAlpha(1.0f);
        yz5.a aVar = gdVar.f199959m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
