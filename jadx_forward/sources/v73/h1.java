package v73;

/* loaded from: classes9.dex */
public class h1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da f515229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da activityC16105xbfd7a3da) {
        super(false);
        this.f515229d = activityC16105xbfd7a3da;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da activityC16105xbfd7a3da = this.f515229d;
        int visibility = activityC16105xbfd7a3da.f223909t.getVisibility();
        java.lang.String str = activityC16105xbfd7a3da.f223793d;
        if (visibility != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do get honey pay card");
            r73.e eVar = new r73.e(activityC16105xbfd7a3da.f223915z);
            eVar.K(activityC16105xbfd7a3da);
            activityC16105xbfd7a3da.m83099x5406100e(eVar, true);
            return;
        }
        if (activityC16105xbfd7a3da.f223910u.isChecked()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do get honey pay card");
            r73.e eVar2 = new r73.e(activityC16105xbfd7a3da.f223915z);
            eVar2.K(activityC16105xbfd7a3da);
            activityC16105xbfd7a3da.m83099x5406100e(eVar2, true);
            return;
        }
        int dimensionPixelOffset = activityC16105xbfd7a3da.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(activityC16105xbfd7a3da.f223909t, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        activityC16105xbfd7a3da.f223902m.announceForAccessibility(activityC16105xbfd7a3da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fws, activityC16105xbfd7a3da.A));
    }
}
