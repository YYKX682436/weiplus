package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class v5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        super(1);
        this.f214760d = c15270x6d877a34;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) obj;
        if (animatorSet != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214760d;
            android.animation.Animator animator = c15270x6d877a34.M1;
            if (animator != null) {
                animator.cancel();
            }
            c15270x6d877a34.M1 = animatorSet;
            animatorSet.start();
        }
        return jz5.f0.f384359a;
    }
}
