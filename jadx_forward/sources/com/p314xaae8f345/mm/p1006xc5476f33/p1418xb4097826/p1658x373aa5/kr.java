package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class kr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15370xc796f908 f214065d;

    public kr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15370xc796f908 c15370xc796f908) {
        this.f214065d = c15370xc796f908;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15370xc796f908 c15370xc796f908 = this.f214065d;
        if (!c15370xc796f908.f213062d.isEmpty()) {
            c15370xc796f908.f213065g = 0.0f;
            if (c15370xc796f908.f213063e >= ((java.util.ArrayList) c15370xc796f908.f213062d).size() - 1) {
                c15370xc796f908.f213063e++;
                c15370xc796f908.b();
                return;
            }
            c15370xc796f908.f213063e++;
            android.animation.ValueAnimator valueAnimator = c15370xc796f908.f213068m;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }
}
