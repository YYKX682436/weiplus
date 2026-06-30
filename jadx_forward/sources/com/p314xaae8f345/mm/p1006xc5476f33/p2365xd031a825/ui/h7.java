package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class h7 implements com.p314xaae8f345.mm.p2802xd031a825.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f261851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 f261852b;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950, android.widget.ScrollView scrollView) {
        this.f261852b = activityC19119xf1f23950;
        this.f261851a = scrollView;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
    /* renamed from: onVisibleStateChange */
    public void mo26891xca4e600e(boolean z17) {
        android.widget.ScrollView scrollView = this.f261851a;
        if (!z17) {
            scrollView.scrollTo(0, 0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950 = this.f261852b;
            activityC19119xf1f23950.m83123x97a0486(scrollView, activityC19119xf1f23950.f261609e, 30);
        }
    }
}
