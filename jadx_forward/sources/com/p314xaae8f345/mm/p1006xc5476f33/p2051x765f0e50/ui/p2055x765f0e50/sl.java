package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class sl implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 f243079d;

    public sl(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 activityC17459xab65a958) {
        this.f243079d = activityC17459xab65a958;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 activityC17459xab65a958 = this.f243079d;
        if (activityC17459xab65a958.findViewById(com.p314xaae8f345.mm.R.id.mq9).getWidth() <= 0) {
            return true;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958.f242186o;
        activityC17459xab65a958.getClass();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) activityC17459xab65a958.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i18 = displayMetrics.widthPixels;
        int i19 = displayMetrics.heightPixels;
        if (i18 >= i19) {
            i18 = i19;
        }
        activityC17459xab65a958.f242188e = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wl(activityC17459xab65a958, activityC17459xab65a958, (i18 - 60) / 3);
        activityC17459xab65a958.f242189f = (android.widget.GridView) activityC17459xab65a958.findViewById(com.p314xaae8f345.mm.R.id.mq9);
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.r0.Bi().add(activityC17459xab65a958.f242188e);
        activityC17459xab65a958.f242189f.setAdapter((android.widget.ListAdapter) activityC17459xab65a958.f242188e);
        activityC17459xab65a958.f242189f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vl(activityC17459xab65a958));
        return false;
    }
}
