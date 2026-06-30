package v73;

/* loaded from: classes9.dex */
public class q0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa f515266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa) {
        super(false);
        this.f515266d = activityC16102xafeab7fa;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa = this.f515266d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16102xafeab7fa.f223793d, "click empty header add friend");
        if (activityC16102xafeab7fa.f223875p.getVisibility() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa.V6(activityC16102xafeab7fa);
            return;
        }
        if (activityC16102xafeab7fa.f223876q.isChecked()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa.V6(activityC16102xafeab7fa);
            return;
        }
        int dimensionPixelOffset = activityC16102xafeab7fa.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(activityC16102xafeab7fa.f223875p, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        activityC16102xafeab7fa.f223871i.announceForAccessibility(activityC16102xafeab7fa.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fws, activityC16102xafeab7fa.f223878s));
    }
}
