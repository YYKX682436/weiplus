package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class x5 implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f254718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 f254719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 f254720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f254721g;

    public x5(android.widget.Button button, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049, android.widget.ScrollView scrollView) {
        this.f254718d = button;
        this.f254719e = activityC18589x3dbac5d0;
        this.f254720f = c22607x763d2049;
        this.f254721g = scrollView;
    }

    @Override // al5.e0
    public final void J2(boolean z17, int i17) {
        android.widget.Button button = this.f254718d;
        android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        android.widget.ScrollView scrollView = this.f254721g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0 activityC18589x3dbac5d0 = this.f254719e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = this.f254720f;
        if (!z17) {
            layoutParams2.bottomMargin = activityC18589x3dbac5d0.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            layoutParams2.topMargin = 0;
            button.setLayoutParams(layoutParams2);
            c22607x763d2049.setPadding(c22607x763d2049.getPaddingLeft(), c22607x763d2049.getPaddingTop(), c22607x763d2049.getPaddingRight(), 0);
            scrollView.scrollBy(0, 0);
            return;
        }
        layoutParams2.bottomMargin = activityC18589x3dbac5d0.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        layoutParams2.topMargin = activityC18589x3dbac5d0.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        button.setLayoutParams(layoutParams2);
        c22607x763d2049.setPadding(c22607x763d2049.getPaddingLeft(), c22607x763d2049.getPaddingTop(), c22607x763d2049.getPaddingRight(), i17);
        int height = scrollView.getHeight();
        c22607x763d2049.requestLayout();
        c22607x763d2049.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w5(c22607x763d2049, height, scrollView));
    }
}
