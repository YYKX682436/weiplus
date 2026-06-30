package c55;

/* loaded from: classes12.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 f120299d;

    public u(com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509) {
        this.f120299d = activityC19822xa98ed509;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509 = this.f120299d;
        activityC19822xa98ed509.f273731h.setClickable(false);
        activityC19822xa98ed509.f273731h.setVisibility(8);
        activityC19822xa98ed509.f273732i.setVisibility(0);
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5092 = this.f120299d;
        activityC19822xa98ed5092.f273730g.setText(activityC19822xa98ed5092.getResources().getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46231xe1e9c79f));
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(3);
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed5093 = this.f120299d;
        activityC19822xa98ed5093.getClass();
        java.lang.String str = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            d55.w wVar = new d55.w(activityC19822xa98ed5093, "recovery_exercise");
            wVar.e();
            if ((((long) wVar.mo123525xb58848b9("exercise_flags", 0)) & 4) == 4) {
                android.os.Bundle bundle = new android.os.Bundle();
                android.content.SharedPreferences sharedPreferences = activityC19822xa98ed5093.getSharedPreferences("recovery_exercise", 4);
                if (sharedPreferences == null) {
                    throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
                }
                str = bundle.containsKey("exercise_base_tinker_id") ? bundle.getString("exercise_base_tinker_id") : sharedPreferences.getString("exercise_base_tinker_id", null);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(new c55.q(this, countDownLatch));
        this.f120299d.f273730g.postDelayed(new c55.r(this, countDownLatch), 3000L);
        ((ku5.t0) ku5.t0.f394148d).g(new c55.s(this, countDownLatch));
        ((ku5.t0) ku5.t0.f394148d).g(new c55.t(this, countDownLatch, str));
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
