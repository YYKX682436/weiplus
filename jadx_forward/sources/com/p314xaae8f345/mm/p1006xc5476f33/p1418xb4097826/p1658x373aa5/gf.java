package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class gf implements android.animation.TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f213692a = new android.view.animation.AccelerateInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f213693b = new android.view.animation.DecelerateInterpolator();

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMileStoneView", "input:" + f17);
        if (f17 <= 0.5f) {
            return this.f213692a.getInterpolation(f17 / 0.5f) * 0.5f;
        }
        return (this.f213693b.getInterpolation((f17 - 0.5f) / 0.5f) * 0.5f) + 0.5f;
    }
}
