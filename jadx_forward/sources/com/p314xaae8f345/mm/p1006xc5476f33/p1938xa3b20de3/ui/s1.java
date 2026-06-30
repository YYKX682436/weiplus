package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f234238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f234239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f234240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f234241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f234242h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234243i;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        this.f234243i = activityC16764xd1ab6b38;
        this.f234238d = z17;
        this.f234239e = z18;
        this.f234240f = z19;
        this.f234241g = z27;
        this.f234242h = z28;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234243i;
        android.widget.ScrollView scrollView = activityC16764xd1ab6b38.f234071v;
        if (scrollView == null) {
            return;
        }
        int[] iArr = new int[2];
        scrollView.getLocationInWindow(iArr);
        int i17 = com.p314xaae8f345.mm.ui.bk.h(activityC16764xd1ab6b38.mo55332x76847179()).y;
        if (com.p314xaae8f345.mm.ui.bk.k(activityC16764xd1ab6b38.mo55332x76847179())) {
            i17 -= com.p314xaae8f345.mm.ui.bk.j(activityC16764xd1ab6b38.mo55332x76847179());
        }
        int bottom = this.f234238d ? iArr[1] + activityC16764xd1ab6b38.U.getBottom() : 0;
        if (this.f234239e) {
            bottom = iArr[1] + activityC16764xd1ab6b38.X.getBottom();
        }
        if (this.f234240f) {
            bottom = iArr[1] + activityC16764xd1ab6b38.V.getBottom();
        }
        if (this.f234241g) {
            bottom = iArr[1] + activityC16764xd1ab6b38.W.getBottom();
        }
        if (this.f234242h) {
            bottom = activityC16764xd1ab6b38.Y.getBottom() + iArr[1];
        }
        int i18 = bottom - i17;
        if (i18 > 0) {
            activityC16764xd1ab6b38.f234071v.scrollBy(0, i18);
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
