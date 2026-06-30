package xx2;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx2.l f539500d;

    public c(xx2.l lVar) {
        this.f539500d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xx2.l lVar = this.f539500d;
        int height = lVar.f539515d.getHeight();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = lVar.f539517f;
        int width = c1073x7e08a787.getWidth();
        int i17 = com.p314xaae8f345.mm.ui.bk.h(lVar.f539513b).x;
        lVar.f539521j = width;
        lVar.f539522k = i17 - width;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = lVar.f539514c;
        lVar.f539523l = c1073x7e08a7872.getBottom();
        lVar.f539524m = height;
        android.view.ViewGroup.LayoutParams layoutParams = c1073x7e08a787.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af4 = lVar.f539516e;
        ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams)).height = (int) (c15432x61ce4af4.getHeight() * (lVar.f539522k / c15432x61ce4af4.getWidth()));
        c1073x7e08a787.setY(lVar.f539523l);
        c1073x7e08a787.requestLayout();
        c1073x7e08a787.setTranslationX(i17);
        c1073x7e08a7872.setTranslationY(-c1073x7e08a7872.getBottom());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f539512a, "totalDistance:" + lVar.f539521j + ", targetBodyWidth:" + lVar.f539522k + ", targetBodyMarginTop:" + lVar.f539523l + " targetBodyMarginBottom:" + lVar.f539524m);
    }
}
