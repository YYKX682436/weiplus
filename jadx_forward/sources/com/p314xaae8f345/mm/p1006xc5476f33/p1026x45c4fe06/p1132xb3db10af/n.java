package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lg1.a f165695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f165696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a f165697f;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a, lg1.a aVar, android.content.Context context) {
        this.f165697f = activityC12309x37262e4a;
        this.f165695d = aVar;
        this.f165696e = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        lg1.a aVar = this.f165695d;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (aVar.getWidth() > 0) {
            float width = (com.p314xaae8f345.mm.ui.dl.d(this.f165696e).x / 2) - (aVar.getWidth() / 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12309x37262e4a activityC12309x37262e4a = this.f165697f;
            activityC12309x37262e4a.f165643i = width;
            activityC12309x37262e4a.f165644m = (((r1.y / 2) - (aVar.getHeight() / 2)) - activityC12309x37262e4a.findViewById(com.p314xaae8f345.mm.R.id.gxy).getHeight()) - activityC12309x37262e4a.findViewById(com.p314xaae8f345.mm.R.id.f563965ef).getHeight();
            activityC12309x37262e4a.f165645n = aVar.getWidth() / 2.0f;
            activityC12309x37262e4a.f165646o = aVar.getHeight() / 2.0f;
            float width2 = r1.x / aVar.getWidth();
            activityC12309x37262e4a.f165648q = width2;
            activityC12309x37262e4a.f165647p = width2;
            activityC12309x37262e4a.f165641g.setTranslationX(activityC12309x37262e4a.f165643i);
            activityC12309x37262e4a.f165641g.setTranslationY(activityC12309x37262e4a.f165644m);
            activityC12309x37262e4a.f165641g.setPivotX(activityC12309x37262e4a.f165645n);
            activityC12309x37262e4a.f165641g.setPivotY(activityC12309x37262e4a.f165646o);
            activityC12309x37262e4a.f165641g.setScaleX(activityC12309x37262e4a.f165647p);
            activityC12309x37262e4a.f165641g.setScaleY(activityC12309x37262e4a.f165647p);
            activityC12309x37262e4a.f165639e.requestLayout();
        }
    }
}
