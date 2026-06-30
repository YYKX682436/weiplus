package c55;

/* loaded from: classes12.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.recovery.ui.RecoveryUI f38766d;

    public u(com.tencent.mm.recovery.ui.RecoveryUI recoveryUI) {
        this.f38766d = recoveryUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI = this.f38766d;
        recoveryUI.f192198h.setClickable(false);
        recoveryUI.f192198h.setVisibility(8);
        recoveryUI.f192199i.setVisibility(0);
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI2 = this.f38766d;
        recoveryUI2.f192197g.setText(recoveryUI2.getResources().getString(com.tencent.recovery.wx.R.string.recovery_tips_loading));
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(3);
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI3 = this.f38766d;
        recoveryUI3.getClass();
        java.lang.String str = null;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            d55.w wVar = new d55.w(recoveryUI3, "recovery_exercise");
            wVar.e();
            if ((((long) wVar.getInt("exercise_flags", 0)) & 4) == 4) {
                android.os.Bundle bundle = new android.os.Bundle();
                android.content.SharedPreferences sharedPreferences = recoveryUI3.getSharedPreferences("recovery_exercise", 4);
                if (sharedPreferences == null) {
                    throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
                }
                str = bundle.containsKey("exercise_base_tinker_id") ? bundle.getString("exercise_base_tinker_id") : sharedPreferences.getString("exercise_base_tinker_id", null);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new c55.q(this, countDownLatch));
        this.f38766d.f192197g.postDelayed(new c55.r(this, countDownLatch), 3000L);
        ((ku5.t0) ku5.t0.f312615d).g(new c55.s(this, countDownLatch));
        ((ku5.t0) ku5.t0.f312615d).g(new c55.t(this, countDownLatch, str));
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
