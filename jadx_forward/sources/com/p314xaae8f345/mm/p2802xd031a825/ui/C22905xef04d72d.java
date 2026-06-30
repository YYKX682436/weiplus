package com.p314xaae8f345.mm.p2802xd031a825.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/wallet_core/ui/WcPayBannerView;", "Landroid/widget/LinearLayout;", "Lr45/tw4;", "bannerItem", "Ljz5/f0;", "setBannerData", "", "value", "bgColor", "I", "getBgColor", "()I", "setBgColor", "(I)V", "textColor", "getTextColor", "setTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.wallet_core.ui.WcPayBannerView */
/* loaded from: classes9.dex */
public final class C22905xef04d72d extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f295633d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f295634e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f295635f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f295636g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f295637h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22905xef04d72d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d8x, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        this.f295636g = linearLayout;
        android.view.View findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.pgc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f295637h = (android.widget.LinearLayout) findViewById;
        android.widget.LinearLayout linearLayout2 = this.f295636g;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.pg_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f295633d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById2;
        android.widget.LinearLayout linearLayout3 = this.f295636g;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = linearLayout3.findViewById(com.p314xaae8f345.mm.R.id.pgb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f295634e = (android.widget.TextView) findViewById3;
        android.widget.LinearLayout linearLayout4 = this.f295636g;
        if (linearLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById4 = linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.pg9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f295635f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = this.f295633d;
        if (c19659x677e0913 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconIv");
            throw null;
        }
        c19659x677e0913.m75397xc185581c(true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09132 = this.f295633d;
        if (c19659x677e09132 != null) {
            c19659x677e09132.m75392xb52e7fa7(com.p314xaae8f345.mm.p2802xd031a825.f.a());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconIv");
            throw null;
        }
    }

    public final void a() {
        m83149xa5089f5c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
        m83150x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
    }

    /* renamed from: getBgColor */
    public final int m83146x319751e8() {
        return 0;
    }

    /* renamed from: getTextColor */
    public final int m83147xc0089f80() {
        return 0;
    }

    /* renamed from: setBannerData */
    public final void m83148xdedf72f8(r45.tw4 tw4Var) {
        boolean z17;
        if (tw4Var == null) {
            setVisibility(8);
            return;
        }
        if (tw4Var.f468364d == 0) {
            setVisibility(8);
            return;
        }
        boolean z18 = false;
        setVisibility(0);
        android.widget.TextView textView = this.f295634e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView.setLineSpacing(2.0f, 1.0f);
        android.widget.TextView textView2 = this.f295634e;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView2.setText(tw4Var.f468365e);
        java.lang.String str = tw4Var.f468366f;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = this.f295633d;
            if (c19659x677e0913 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconIv");
                throw null;
            }
            c19659x677e0913.setVisibility(8);
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09132 = this.f295633d;
            if (c19659x677e09132 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconIv");
                throw null;
            }
            c19659x677e09132.m75396xca029dad(tw4Var.f468366f);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09133 = this.f295633d;
            if (c19659x677e09133 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconIv");
                throw null;
            }
            c19659x677e09133.setVisibility(0);
            z17 = true;
        }
        java.lang.String str2 = tw4Var.f468367g;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f295635f;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
                throw null;
            }
            c22699x3dcdb352.setVisibility(8);
        } else {
            setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.g2(this, tw4Var));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f295635f;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
                throw null;
            }
            c22699x3dcdb3522.setVisibility(0);
            setForeground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bae));
            z18 = true;
        }
        if (!z17 && !z18) {
            android.widget.TextView textView3 = this.f295634e;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView3.setGravity(1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24273, tw4Var.f468368h, 1);
    }

    /* renamed from: setBgColor */
    public final void m83149xa5089f5c(int i17) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i65.a.b(getContext(), 8));
        gradientDrawable.setColor(i17);
        android.widget.LinearLayout linearLayout = this.f295637h;
        if (linearLayout != null) {
            linearLayout.setBackground(gradientDrawable);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bannerLayout");
            throw null;
        }
    }

    /* renamed from: setTextColor */
    public final void m83150x1c5c5ff4(int i17) {
        android.widget.TextView textView = this.f295634e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView.setTextColor(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f295635f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
            throw null;
        }
    }
}
