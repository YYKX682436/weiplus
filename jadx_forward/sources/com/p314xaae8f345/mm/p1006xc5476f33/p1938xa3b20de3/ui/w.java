package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e f234279f;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, android.view.View view, android.view.View view2) {
        this.f234279f = c16759xaa786f9e;
        this.f234277d = view;
        this.f234278e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f234277d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineAlertView", "showFirstPostTip: qrCodeView.getHeight %s %s", java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(view.getMeasuredHeight()));
        android.view.View view2 = this.f234278e;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
        int height = view.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e = this.f234279f;
        if (height > 0) {
            if (view2.getHeight() > view.getHeight()) {
                c16759xaa786f9e.requestLayout();
            } else {
                layoutParams.height = view.getHeight();
                view2.setLayoutParams(layoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z zVar = c16759xaa786f9e.f234010h;
        if (zVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q1) zVar).a();
        }
    }
}
