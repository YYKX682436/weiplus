package ns4;

/* loaded from: classes8.dex */
public final class r2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421167d;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421167d = activityC19068x49d5e62b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.f260717w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421167d;
        activityC19068x49d5e62b.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "updateTotalBalance: [blance] " + l17);
        android.widget.TextView textView = activityC19068x49d5e62b.f260720f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNoBalanceTipsTv");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.LinearLayout linearLayout = activityC19068x49d5e62b.f260719e;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceLl");
            throw null;
        }
        linearLayout.setVisibility(8);
        long longValue = l17 != null ? l17.longValue() : 0L;
        if (longValue > 0) {
            android.widget.TextView textView2 = activityC19068x49d5e62b.f260728q;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWeCoinBalanceView");
                throw null;
            }
            textView2.setText("" + longValue);
            android.widget.TextView textView3 = activityC19068x49d5e62b.f260720f;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mNoBalanceTipsTv");
                throw null;
            }
            textView3.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = activityC19068x49d5e62b.f260719e;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceLl");
                throw null;
            }
        }
    }
}
