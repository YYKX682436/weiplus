package ns4;

/* loaded from: classes8.dex */
public final class t2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421190d;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421190d = activityC19068x49d5e62b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.f260717w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421190d;
        activityC19068x49d5e62b.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "updateFaqView: [url] " + str);
        if (str != null) {
            android.widget.LinearLayout linearLayout = activityC19068x49d5e62b.f260722h;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new ns4.j3(activityC19068x49d5e62b, str));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFaqLinearLayout");
                throw null;
            }
        }
    }
}
