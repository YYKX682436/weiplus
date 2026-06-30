package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView;", "Landroid/widget/RelativeLayout;", "Lix4/a;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setBrowserClickListener", "", "Lhx4/x;", "dataList", "setBrowserList", "", "show", "setShowBrowserSettingEntry", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lx4/e", "lx4/f", "lx4/g", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView */
/* loaded from: classes8.dex */
public final class C19353x4337a0ac extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f265534d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f265535e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f265536f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f265537g;

    /* renamed from: h, reason: collision with root package name */
    public int f265538h;

    /* renamed from: i, reason: collision with root package name */
    public lx4.e f265539i;

    /* renamed from: m, reason: collision with root package name */
    public lx4.a f265540m;

    /* renamed from: n, reason: collision with root package name */
    public ix4.a f265541n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f265542o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19353x4337a0ac(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setBrowserClickListener */
    public final void m74427x3273796(ix4.a aVar) {
        this.f265541n = aVar;
    }

    /* renamed from: setBrowserList */
    public final void m74428x42053624(java.util.List<hx4.x> list) {
        lx4.e eVar;
        if (list == null || (eVar = this.f265539i) == null) {
            return;
        }
        java.util.ArrayList arrayList = eVar.f403658e;
        arrayList.clear();
        arrayList.addAll(list);
    }

    /* renamed from: setShowBrowserSettingEntry */
    public final void m74429x3e45564b(boolean z17) {
        if (this.f265542o != z17) {
            this.f265542o = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseDialogView", "updateBrowserSettingEntry %s", java.lang.Boolean.valueOf(z17));
            android.widget.ImageView imageView = this.f265536f;
            if (imageView != null) {
                imageView.setVisibility(this.f265542o ? 0 : 8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreButton");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19353x4337a0ac(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.util.DisplayMetrics displayMetrics;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f265542o = true;
        setFitsSystemWindows(true);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnv, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ayv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f265534d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ayp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f265535e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ays);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f265536f = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ayy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f265537g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        android.widget.TextView textView = this.f265534d;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.widget.ImageView imageView = this.f265535e;
            if (imageView != null) {
                imageView.setOnClickListener(new lx4.h(this, inflate));
                android.widget.ImageView imageView2 = this.f265536f;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new lx4.i(this, inflate));
                    android.content.res.Resources resources = getResources();
                    int B = (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? i65.a.B(getContext()) : displayMetrics.widthPixels;
                    this.f265538h = (B - (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aek) * 4)) / 5;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseDialogView", "configItemPadding width: %d, mItemPadding: %s", java.lang.Integer.valueOf(B), java.lang.Integer.valueOf(this.f265538h));
                    this.f265539i = new lx4.e(this, context);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f265537g;
                    if (c1163xf1deaba4 != null) {
                        c1163xf1deaba4.m7964x8d4ad49c(null);
                        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 4));
                        c1163xf1deaba4.mo7960x6cab2c8d(this.f265539i);
                        c1163xf1deaba4.N(new lx4.f(context));
                        c1163xf1deaba4.setOverScrollMode(2);
                        c1163xf1deaba4.setVerticalFadingEdgeEnabled(false);
                        c1163xf1deaba4.setNestedScrollingEnabled(false);
                        if (c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf c12697x85b15aaf = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12697x85b15aaf) c1163xf1deaba4;
                            c12697x85b15aaf.m52925x25bfb969((((int) ((i65.a.k(context) * 3.0f) / 4.0f)) - c12697x85b15aaf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn)) - c12697x85b15aaf.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn));
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f265537g;
                        if (c1163xf1deaba42 != null) {
                            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba42.getLayoutParams();
                            if (layoutParams == null || !(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                                return;
                            }
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                            int i18 = this.f265538h / 2;
                            marginLayoutParams.leftMargin = i18;
                            marginLayoutParams.rightMargin = i18;
                            return;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("browserRecyclerView");
                        throw null;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("browserRecyclerView");
                    throw null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreButton");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeButton");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialogTitle");
        throw null;
    }
}
