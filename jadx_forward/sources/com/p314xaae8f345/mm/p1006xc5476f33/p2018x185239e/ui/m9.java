package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class m9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f239357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239358e;

    public m9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb, boolean z17) {
        this.f239358e = activityC17155x7c2f4bb;
        this.f239357d = z17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223;
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32232;
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32233;
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32234;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z17 = this.f239357d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239358e;
        if (z17) {
            activityC17155x7c2f4bb.m83111x7c491e2a(motionEvent);
        } else {
            c22894x55bf3223 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC17155x7c2f4bb).f39912xe2ad5320;
            if (c22894x55bf3223 != null) {
                c22894x55bf32232 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC17155x7c2f4bb).f39912xe2ad5320;
                if (c22894x55bf32232.isShown()) {
                    c22894x55bf32233 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC17155x7c2f4bb).f39912xe2ad5320;
                    if (c22894x55bf32233.q()) {
                        c22894x55bf32234 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC17155x7c2f4bb).f39912xe2ad5320;
                        c22894x55bf32234.i();
                    }
                }
            }
        }
        activityC17155x7c2f4bb.mo48632xd46dd964();
        activityC17155x7c2f4bb.mo48674x36654fab();
        activityC17155x7c2f4bb.f239135h.m83169xe7297452().clearFocus();
        if (activityC17155x7c2f4bb.f239142r) {
            activityC17155x7c2f4bb.f239141q.clearFocus();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
