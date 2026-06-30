package z83;

/* loaded from: classes14.dex */
public final class g implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 f552272a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6) {
        this.f552272a = activityC16160x425523e6;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6.f224672t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6 = this.f552272a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16160x425523e6.T6().f525535n.getText().toString()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16160x425523e6.T6().f525534m.getText().toString()) && z17) {
            activityC16160x425523e6.T6().f525536o.setEnabled(z17);
        }
        if (z17) {
            return;
        }
        activityC16160x425523e6.T6().f525536o.setEnabled(z17);
    }
}
