package av1;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity) {
        super(0);
        this.f14195d = screenCastActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f14195d.findViewById(com.tencent.mm.R.id.bd_);
        int i17 = com.tencent.mm.R.id.bd9;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.bd9);
        if (weImageView != null) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById;
            i17 = com.tencent.mm.R.id.cwk;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.cwk);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.f486291kt3;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.f486291kt3);
                if (progressBar != null) {
                    i17 = com.tencent.mm.R.id.f486292kt4;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f486292kt4);
                    if (weImageView2 != null) {
                        i17 = com.tencent.mm.R.id.f486299ku5;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f486299ku5);
                        if (weImageView3 != null) {
                            i17 = com.tencent.mm.R.id.f486743mb5;
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f486743mb5);
                            if (relativeLayout != null) {
                                i17 = com.tencent.mm.R.id.mb6;
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.mb6);
                                if (weImageView4 != null) {
                                    i17 = com.tencent.mm.R.id.ngy;
                                    android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.ngy);
                                    if (button != null) {
                                        i17 = com.tencent.mm.R.id.ngz;
                                        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.ngz);
                                        if (relativeLayout2 != null) {
                                            i17 = com.tencent.mm.R.id.f487099ni1;
                                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f487099ni1);
                                            if (textView2 != null) {
                                                return new qu1.a(scrollView, weImageView, scrollView, textView, progressBar, weImageView2, weImageView3, relativeLayout, weImageView4, button, relativeLayout2, textView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
