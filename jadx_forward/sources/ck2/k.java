package ck2;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f123953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.r4 f123954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck2.o f123955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f123956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f123957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, mm2.r4 r4Var, ck2.o oVar, boolean z18, boolean z19) {
        super(0);
        this.f123953d = z17;
        this.f123954e = r4Var;
        this.f123955f = oVar;
        this.f123956g = z18;
        this.f123957h = z19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f123953d) {
            mm2.r4 r4Var = this.f123954e;
            int i17 = r4Var.f410909a;
            ck2.o oVar = this.f123955f;
            boolean z17 = this.f123956g;
            if (i17 == 1) {
                zj2.b a76 = oVar.a7();
                if (a76 != null) {
                    a76.f554822c.setVisibility(8);
                }
                zj2.c b76 = oVar.b7();
                if (b76 != null) {
                    b76.f554826f.setVisibility(0);
                }
                if2.d0 d0Var = oVar.f123971r;
                if (d0Var != null) {
                    d0Var.d(0);
                }
                if (z17) {
                    zj2.c b77 = oVar.b7();
                    if (b77 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMilestoneBubbleWidget", "startBubbleAnimateShow");
                        b77.f554826f.setVisibility(0);
                        b77.f554827g.setVisibility(8);
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = b77.f554829i;
                        c22789xd23e9a9b.m82582x3ae760af(0.0d);
                        c22789xd23e9a9b.g();
                    }
                } else {
                    zj2.c b78 = oVar.b7();
                    if (b78 != null) {
                        java.lang.String a17 = no0.l.a(no0.m.f420263a, r4Var.f410910b, ":", false, false, false, 24, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMilestoneBubbleWidget", "updateCountDown remainTime:".concat(a17));
                        android.widget.TextView textView = b78.f554827g;
                        if (textView != null) {
                            textView.setText(a17);
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = b78.f554829i;
                        if (c22789xd23e9a9b2 != null) {
                            c22789xd23e9a9b2.m82582x3ae760af(1.0d);
                        }
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                }
            } else if (i17 == 2) {
                zj2.c b79 = oVar.b7();
                if (b79 != null) {
                    b79.f554826f.setVisibility(0);
                }
                if2.d0 d0Var2 = oVar.f123971r;
                if (d0Var2 != null) {
                    d0Var2.d(0);
                }
                zj2.c b710 = oVar.b7();
                if (b710 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMilestoneBubbleWidget", "showLotteryComputing");
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = b710.f554829i;
                    if (c22789xd23e9a9b3 != null) {
                        c22789xd23e9a9b3.m82582x3ae760af(1.0d);
                    }
                    android.widget.TextView textView2 = b710.f554827g;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    if (textView2 != null) {
                        textView2.setText(b710.f554824d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dou));
                    }
                }
            } else if (i17 == 3 && !this.f123957h && !z17) {
                if (!oVar.U6() || oVar.c7() || com.p314xaae8f345.mm.ui.bk.d0()) {
                    oVar.e7(df2.dn.f311523d, r4Var.f410912d, null);
                } else {
                    oVar.W6(new ck2.j(oVar, r4Var));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
