package ck2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f42420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.r4 f42421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f42423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f42424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, mm2.r4 r4Var, ck2.o oVar, boolean z18, boolean z19) {
        super(0);
        this.f42420d = z17;
        this.f42421e = r4Var;
        this.f42422f = oVar;
        this.f42423g = z18;
        this.f42424h = z19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f42420d) {
            mm2.r4 r4Var = this.f42421e;
            int i17 = r4Var.f329376a;
            ck2.o oVar = this.f42422f;
            boolean z17 = this.f42423g;
            if (i17 == 1) {
                zj2.b a76 = oVar.a7();
                if (a76 != null) {
                    a76.f473289c.setVisibility(8);
                }
                zj2.c b76 = oVar.b7();
                if (b76 != null) {
                    b76.f473293f.setVisibility(0);
                }
                if2.d0 d0Var = oVar.f42438r;
                if (d0Var != null) {
                    d0Var.d(0);
                }
                if (z17) {
                    zj2.c b77 = oVar.b7();
                    if (b77 != null) {
                        com.tencent.mars.xlog.Log.i("LiveMilestoneBubbleWidget", "startBubbleAnimateShow");
                        b77.f473293f.setVisibility(0);
                        b77.f473294g.setVisibility(8);
                        com.tencent.mm.view.MMPAGView mMPAGView = b77.f473296i;
                        mMPAGView.setProgress(0.0d);
                        mMPAGView.g();
                    }
                } else {
                    zj2.c b78 = oVar.b7();
                    if (b78 != null) {
                        java.lang.String a17 = no0.l.a(no0.m.f338730a, r4Var.f329377b, ":", false, false, false, 24, null);
                        com.tencent.mars.xlog.Log.i("LiveMilestoneBubbleWidget", "updateCountDown remainTime:".concat(a17));
                        android.widget.TextView textView = b78.f473294g;
                        if (textView != null) {
                            textView.setText(a17);
                        }
                        com.tencent.mm.view.MMPAGView mMPAGView2 = b78.f473296i;
                        if (mMPAGView2 != null) {
                            mMPAGView2.setProgress(1.0d);
                        }
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                }
            } else if (i17 == 2) {
                zj2.c b79 = oVar.b7();
                if (b79 != null) {
                    b79.f473293f.setVisibility(0);
                }
                if2.d0 d0Var2 = oVar.f42438r;
                if (d0Var2 != null) {
                    d0Var2.d(0);
                }
                zj2.c b710 = oVar.b7();
                if (b710 != null) {
                    com.tencent.mars.xlog.Log.i("LiveMilestoneBubbleWidget", "showLotteryComputing");
                    com.tencent.mm.view.MMPAGView mMPAGView3 = b710.f473296i;
                    if (mMPAGView3 != null) {
                        mMPAGView3.setProgress(1.0d);
                    }
                    android.widget.TextView textView2 = b710.f473294g;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    if (textView2 != null) {
                        textView2.setText(b710.f473291d.getContext().getResources().getString(com.tencent.mm.R.string.dou));
                    }
                }
            } else if (i17 == 3 && !this.f42424h && !z17) {
                if (!oVar.U6() || oVar.c7() || com.tencent.mm.ui.bk.d0()) {
                    oVar.e7(df2.dn.f229990d, r4Var.f329379d, null);
                } else {
                    oVar.W6(new ck2.j(oVar, r4Var));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
