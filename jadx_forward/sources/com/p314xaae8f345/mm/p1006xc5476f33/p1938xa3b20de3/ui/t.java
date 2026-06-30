package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f234246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f234247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e f234250h;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, java.lang.Runnable runnable, java.lang.Runnable runnable2, android.view.View view, android.view.View view2) {
        this.f234250h = c16759xaa786f9e;
        this.f234246d = runnable;
        this.f234247e = runnable2;
        this.f234248f = view;
        this.f234249g = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e = this.f234250h;
        android.widget.TextView textView = (android.widget.TextView) c16759xaa786f9e.f234007e.findViewById(com.p314xaae8f345.mm.R.id.h5h);
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q(this));
        }
        android.widget.TextView textView2 = (android.widget.TextView) c16759xaa786f9e.f234007e.findViewById(com.p314xaae8f345.mm.R.id.nxl);
        if (textView2 != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(textView2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.krt), 0, textView2.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.r(this), true), c16759xaa786f9e.f234007e.getContext());
        }
        android.view.View view = this.f234248f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", java.lang.Integer.valueOf(view.getHeight()), java.lang.Integer.valueOf(view.getMeasuredHeight()));
        android.view.View view2 = this.f234249g;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
        if (view2.getMeasuredHeight() > view.getHeight()) {
            layoutParams.height = view2.getMeasuredHeight();
            view2.setLayoutParams(layoutParams);
        } else if (view.getHeight() > 0) {
            layoutParams.height = view.getHeight();
            view2.setLayoutParams(layoutParams);
        }
        c16759xaa786f9e.f234009g = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.z zVar = c16759xaa786f9e.f234010h;
        if (zVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.q1) zVar).a();
        }
    }
}
