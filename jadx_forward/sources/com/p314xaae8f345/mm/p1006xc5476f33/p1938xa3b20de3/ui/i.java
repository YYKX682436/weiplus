package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e f234177f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, android.view.View view, android.view.View view2) {
        this.f234177f = c16759xaa786f9e;
        this.f234175d = view;
        this.f234176e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f234175d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getHeight());
        android.view.View view2 = this.f234176e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineAlertView", "showEmptyCodeAlert: qrCodeView.getHeight%s %s", valueOf, java.lang.Integer.valueOf(view2.getMeasuredHeight()));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
        if (view2.getMeasuredHeight() > view.getHeight()) {
            layoutParams.height = view2.getMeasuredHeight();
            view2.setLayoutParams(layoutParams);
        } else if (view.getHeight() > 0) {
            layoutParams.height = view.getHeight();
            view2.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z zVar = this.f234177f.f234010h;
        if (zVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q1) zVar).a();
        }
    }
}
