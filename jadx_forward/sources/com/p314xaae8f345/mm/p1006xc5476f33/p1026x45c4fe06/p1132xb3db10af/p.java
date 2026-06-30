package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class p extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a f165702d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a) {
        this.f165702d = activityC12309x37262e4a;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a = this.f165702d;
        if (activityC12309x37262e4a.f165641g == null) {
            return true;
        }
        activityC12309x37262e4a.f165647p = scaleGestureDetector.getScaleFactor() * activityC12309x37262e4a.f165648q;
        float f17 = activityC12309x37262e4a.f165647p;
        if (f17 > 5.0f || f17 < 0.1f) {
            return true;
        }
        activityC12309x37262e4a.f165641g.setTranslationX(activityC12309x37262e4a.f165643i);
        activityC12309x37262e4a.f165641g.setTranslationY(activityC12309x37262e4a.f165644m);
        activityC12309x37262e4a.f165641g.setPivotX(activityC12309x37262e4a.f165645n);
        activityC12309x37262e4a.f165641g.setPivotY(activityC12309x37262e4a.f165646o);
        activityC12309x37262e4a.f165641g.setScaleX(activityC12309x37262e4a.f165647p);
        activityC12309x37262e4a.f165641g.setScaleY(activityC12309x37262e4a.f165647p);
        activityC12309x37262e4a.f165648q = activityC12309x37262e4a.f165647p;
        return false;
    }
}
