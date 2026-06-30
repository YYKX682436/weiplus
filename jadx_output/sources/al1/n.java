package al1;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010&\u001a\u00020\u0003H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020 H\u0016¨\u0006-"}, d2 = {"Lal1/n;", "Landroid/widget/RelativeLayout;", "Lal1/k0;", "", "color", "Ljz5/f0;", "setSecurityTipsTitleColor", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "setSecurityTipsTitle", "Landroid/widget/TextView;", "getSecurityTipsTextView", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setForwardOnClickListener", "forwardText", "setForwardText", nd1.s0.NAME, "setOptionButtonClickListener", "", "setMainTitle", "setForegroundColor", "", "alpha", "setBackgroundAlpha", "setCloseButtonClickListener", "Landroid/view/View;", "getActionView", "getForegroundColor", "getMainTitle", "getBackgroundAlpha", "setBackButtonClickListener", "", "visible", "setLoadingIconVisibility", "getCapsuleView", "style", "setForegroundStyle", "getBackgroundColor", "hidden", "setNavHidden", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class n extends android.widget.RelativeLayout implements al1.k0 {

    /* renamed from: d, reason: collision with root package name */
    public int f5791d;

    /* renamed from: e, reason: collision with root package name */
    public double f5792e;

    /* renamed from: f, reason: collision with root package name */
    public final p91.a f5793f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f5792e = 1.0d;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488001e3, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.f482530gw;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f482530gw);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.myv;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.myv);
            if (imageView != null) {
                i17 = com.tencent.mm.R.id.myw;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.myw);
                if (linearLayout2 != null) {
                    i17 = com.tencent.mm.R.id.myx;
                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.myx);
                    if (linearLayout3 != null) {
                        i17 = com.tencent.mm.R.id.myy;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.myy);
                        if (textView != null) {
                            i17 = com.tencent.mm.R.id.myz;
                            com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView appBrandActionBarCustomImageView = (com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView) x4.b.a(inflate, com.tencent.mm.R.id.myz);
                            if (appBrandActionBarCustomImageView != null) {
                                i17 = com.tencent.mm.R.id.f486950mz0;
                                android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f486950mz0);
                                if (linearLayout4 != null) {
                                    android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) inflate;
                                    int i18 = com.tencent.mm.R.id.f486952mz2;
                                    android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f486952mz2);
                                    if (linearLayout6 != null) {
                                        i18 = com.tencent.mm.R.id.f486953mz3;
                                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486953mz3);
                                        if (textView2 != null) {
                                            i18 = com.tencent.mm.R.id.f486954mz4;
                                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486954mz4);
                                            if (textView3 != null) {
                                                this.f5793f = new p91.a(linearLayout5, linearLayout, imageView, linearLayout2, linearLayout3, textView, appBrandActionBarCustomImageView, linearLayout4, linearLayout5, linearLayout6, textView2, textView3);
                                                addView(linearLayout5);
                                                return;
                                            }
                                        }
                                    }
                                    i17 = i18;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // al1.k0
    public android.view.View getActionView() {
        return this;
    }

    /* renamed from: getBackgroundAlpha, reason: from getter */
    public double getF5792e() {
        return this.f5792e;
    }

    @Override // al1.k0
    /* renamed from: getBackgroundColor, reason: from getter */
    public int getF5791d() {
        return this.f5791d;
    }

    public android.view.View getCapsuleView() {
        return null;
    }

    public int getForegroundColor() {
        return this.f5793f.f352874j.getCurrentTextColor();
    }

    public java.lang.CharSequence getMainTitle() {
        java.lang.CharSequence text = this.f5793f.f352874j.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        return text;
    }

    public final android.widget.TextView getSecurityTipsTextView() {
        android.widget.TextView singlePageModeActionBarSecurityTipsTv = this.f5793f.f352873i;
        kotlin.jvm.internal.o.f(singlePageModeActionBarSecurityTipsTv, "singlePageModeActionBarSecurityTipsTv");
        return singlePageModeActionBarSecurityTipsTv;
    }

    @Override // al1.k0
    public void setBackButtonClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public void setBackgroundAlpha(double d17) {
        this.f5792e = d17;
        android.graphics.drawable.Drawable background = getBackground();
        if (background == null) {
            super.setBackgroundColor(this.f5791d);
            background = getBackground();
        }
        kotlin.jvm.internal.o.d(background);
        background.setAlpha((int) (255 * d17));
    }

    @Override // android.view.View, al1.k0
    public void setBackgroundColor(int i17) {
        this.f5791d = i17;
        super.setBackgroundColor(i17);
        setBackgroundAlpha(this.f5792e);
    }

    @Override // al1.k0
    public void setCloseButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f5793f.f352866b.setOnClickListener(onClickListener);
    }

    @Override // al1.k0
    public void setForegroundColor(int i17) {
        this.f5793f.f352874j.setTextColor(i17);
    }

    @Override // al1.k0
    public void setForegroundStyle(java.lang.String str) {
    }

    public final void setForwardOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f5793f.f352868d.setOnClickListener(onClickListener);
    }

    public final void setForwardText(java.lang.String forwardText) {
        kotlin.jvm.internal.o.g(forwardText, "forwardText");
        this.f5793f.f352869e.setText(forwardText);
    }

    @Override // al1.k0
    public void setLoadingIconVisibility(boolean z17) {
    }

    @Override // al1.k0
    public void setMainTitle(java.lang.CharSequence charSequence) {
        this.f5793f.f352874j.setText(charSequence);
    }

    @Override // al1.k0
    public void setNavHidden(boolean z17) {
    }

    public void setOptionButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f5793f.f352870f.setOnClickListener(onClickListener);
    }

    public final void setSecurityTipsTitle(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f5793f.f352873i.setText(title);
    }

    public final void setSecurityTipsTitleColor(int i17) {
        this.f5793f.f352873i.setTextColor(i17);
    }
}
