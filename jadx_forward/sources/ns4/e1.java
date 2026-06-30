package ns4;

/* loaded from: classes8.dex */
public final class e1 implements com.p314xaae8f345.mm.p2802xd031a825.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421042a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f421042a = activityC19066x54c41420;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
    /* renamed from: onVisibleStateChange */
    public final void mo26891xca4e600e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421042a;
        if (z17) {
            android.widget.ScrollView scrollView = activityC19066x54c41420.f260686h;
            if (scrollView != null) {
                scrollView.postDelayed(new ns4.c1(activityC19066x54c41420), 100L);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
        }
        android.widget.ScrollView scrollView2 = activityC19066x54c41420.f260686h;
        if (scrollView2 != null) {
            scrollView2.scrollTo(0, 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
    }
}
