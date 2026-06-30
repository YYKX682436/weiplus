package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 f287084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f287085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f287086f;

    public t3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var, boolean z17, boolean z18) {
        this.f287084d = a4Var;
        this.f287085e = z17;
        this.f287086f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a4 a4Var = this.f287084d;
        int height = a4Var.f39493x8ad70635.getHeight();
        a4Var.f39493x8ad70635.getWidth();
        if (!this.f287085e) {
            android.view.ViewGroup.LayoutParams layoutParams = a4Var.f284796g.getLayoutParams();
            layoutParams.height = height;
            a4Var.f284796g.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = a4Var.f284814y.getLayoutParams();
            layoutParams2.height = height;
            a4Var.f284814y.setLayoutParams(layoutParams2);
            android.view.ViewGroup.LayoutParams layoutParams3 = a4Var.f284813x.getLayoutParams();
            layoutParams3.height = height;
            a4Var.f284813x.setLayoutParams(layoutParams3);
            android.view.ViewGroup.LayoutParams layoutParams4 = a4Var.G.getLayoutParams();
            layoutParams4.height = height;
            a4Var.G.setLayoutParams(layoutParams4);
            android.view.ViewGroup.LayoutParams layoutParams5 = a4Var.H.getLayoutParams();
            layoutParams5.height = (int) (height * 1.45454f);
            a4Var.H.setLayoutParams(layoutParams5);
        }
        int height2 = (int) (a4Var.f39493x8ad70635.getHeight() * 1.45454f);
        int i17 = (int) (height2 * 1.25f);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) a4Var.f284800k.getLayoutParams();
        layoutParams6.height = height2;
        layoutParams6.width = i17;
        a4Var.f284800k.setLayoutParams(layoutParams6);
        a4Var.f284810u = (int) ((a4Var.f39493x8ad70635.getHeight() * 0.45d) / 2.0d);
        a4Var.f284811v = a4Var.f39493x8ad70635.getWidth() - (i17 + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g4.j(a4Var, a4Var.f284810u, this.f287086f);
    }
}
