package ub3;

/* loaded from: classes14.dex */
public class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub3.i f507638d;

    public h(ub3.i iVar) {
        this.f507638d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        ub3.i iVar = this.f507638d;
        android.view.View view = iVar.f507644h.f226603g;
        view.setPadding(view.getPaddingLeft(), (int) floatValue, iVar.f507644h.f226603g.getPaddingRight(), iVar.f507644h.f226603g.getPaddingBottom());
        float f17 = floatValue / iVar.f507641e;
        if (f17 <= 1.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = iVar.f507644h;
            activityC16330x45b4a404.f226613q.setAlpha((1.0f - f17) + activityC16330x45b4a404.U);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a4042 = iVar.f507644h;
            activityC16330x45b4a4042.f226614r.setAlpha(f17 * activityC16330x45b4a4042.U);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a4043 = iVar.f507644h;
        activityC16330x45b4a4043.f226613q.setAlpha(activityC16330x45b4a4043.U);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a4044 = iVar.f507644h;
        activityC16330x45b4a4044.f226614r.setAlpha(activityC16330x45b4a4044.U);
    }
}
