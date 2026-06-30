package ns4;

/* loaded from: classes8.dex */
public final class l1 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f421117b;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420, long j17) {
        this.f421116a = activityC19066x54c41420;
        this.f421117b = j17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public final void mo48650xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421116a;
        ms4.n nVar = activityC19066x54c41420.f260687i;
        if (nVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        nVar.P6(4);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = activityC19066x54c41420.f260684f;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
            throw null;
        }
        viewOnFocusChangeListenerC22907xe18534c2.m83213x765074af(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(os4.h.c(this.f421117b + "", "100", 2)));
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = activityC19066x54c41420.f260684f;
        if (viewOnFocusChangeListenerC22907xe18534c22 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
            throw null;
        }
        viewOnFocusChangeListenerC22907xe18534c22.m83169xe7297452().requestFocus();
        activityC19066x54c41420.m83140xebcf1de0();
    }
}
