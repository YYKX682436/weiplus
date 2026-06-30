package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f260503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 f260504e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 c19037xa7790f87, android.view.View view) {
        this.f260504e = c19037xa7790f87;
        this.f260503d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19037xa7790f87 c19037xa7790f87 = this.f260504e;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c19037xa7790f87.P.getLayoutParams();
        layoutParams.leftMargin = this.f260503d.findViewById(android.R.id.summary).getWidth();
        c19037xa7790f87.P.setLayoutParams(layoutParams);
    }
}
