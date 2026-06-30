package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes4.dex */
public final class qs extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final float f214445d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15380x99018fe f214446e;

    public qs(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15380x99018fe c15380x99018fe) {
        this.f214446e = c15380x99018fe;
        c15380x99018fe.f213132h = true;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        float f18 = 0.0f + ((this.f214445d - 0.0f) * f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15380x99018fe c15380x99018fe = this.f214446e;
        c15380x99018fe.scrollBy((int) ((c15380x99018fe.getMaxWidth() - c15380x99018fe.getScrollX()) * f18), 0);
        if (f18 == 1.0f) {
            c15380x99018fe.f213132h = false;
        }
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
        setDuration(260L);
        setInterpolator(new android.view.animation.AccelerateInterpolator());
    }
}
