package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f72837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f72838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72839f;

    public u7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f72839f = paylistAAUI;
        this.f72837d = textView;
        this.f72838e = textView2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f72837d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.topMargin = this.f72838e.getHeight() + i65.a.b(this.f72839f.getContext(), 10);
        textView.setLayoutParams(layoutParams);
    }
}
