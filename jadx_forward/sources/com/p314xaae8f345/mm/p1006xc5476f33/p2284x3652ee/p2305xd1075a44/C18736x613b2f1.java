package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/TingCategoryView;", "Landroid/widget/RelativeLayout;", "", "color", "Ljz5/f0;", "setContainerBackgroundColor", "", "getAccessibilityDesc", "d", "Ljz5/g;", "getCornerRadius", "()I", "cornerRadius", "e", "getCoverSize", "coverSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.widget.TingCategoryView */
/* loaded from: classes9.dex */
public final class C18736x613b2f1 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cornerRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g coverSize;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f256397f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 f256398g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f256399h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f256400i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f256401m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f256402n;

    /* renamed from: o, reason: collision with root package name */
    public final int f256403o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18736x613b2f1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCornerRadius */
    public final int m72278x83bb89bd() {
        return ((java.lang.Number) ((jz5.n) this.cornerRadius).mo141623x754a37bb()).intValue();
    }

    /* renamed from: getCoverSize */
    private final int m72279x756d65a2() {
        return ((java.lang.Number) ((jz5.n) this.coverSize).mo141623x754a37bb()).intValue();
    }

    public final void b(r45.lm6 tingCategoryViewData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingCategoryViewData, "tingCategoryViewData");
        android.widget.TextView textView = this.f256399h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryTitle");
            throw null;
        }
        textView.setText(tingCategoryViewData.f461170d);
        textView.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        java.lang.String str = tingCategoryViewData.f461171e;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f256401m;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingDescIcon");
            throw null;
        }
        c22699x3dcdb352.setVisibility(8);
        boolean z17 = true;
        boolean z18 = str.length() > 0;
        android.widget.TextView textView2 = this.f256400i;
        if (z18) {
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryDesc");
                throw null;
            }
            textView2.setText(str);
            textView2.setVisibility(0);
        } else {
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryDesc");
                throw null;
            }
            textView2.setText("");
            textView2.setVisibility(8);
        }
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryDesc");
            throw null;
        }
        textView2.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = this.f256398g;
        if (c18735xc3936731 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryMvvmView");
            throw null;
        }
        c18735xc3936731.g(tingCategoryViewData, null);
        java.lang.String str2 = tingCategoryViewData.f461175i;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        android.widget.ImageView imageView = this.f256402n;
        if (z17) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryAuthorAvatar");
                throw null;
            }
        }
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryAuthorAvatar");
            throw null;
        }
        imageView.setVisibility(0);
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        ((dl4.m0) tVar).aj(str2, imageView, 0, null);
    }

    /* renamed from: getAccessibilityDesc */
    public final java.lang.String m72280x4d236449() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(",");
        android.widget.TextView textView = this.f256399h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryTitle");
            throw null;
        }
        java.lang.CharSequence text = textView.getText();
        if (!(text == null || text.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryTitle");
                throw null;
            }
            sb6.append((java.lang.Object) textView.getText());
            sb6.append(',');
            stringBuffer.append(sb6.toString());
        }
        android.widget.TextView textView2 = this.f256400i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryDesc");
            throw null;
        }
        java.lang.CharSequence text2 = textView2.getText();
        if (!(text2 == null || text2.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryDesc");
                throw null;
            }
            sb7.append((java.lang.Object) textView2.getText());
            sb7.append(',');
            stringBuffer.append(sb7.toString());
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    /* renamed from: setContainerBackgroundColor */
    public final void m72281xefe20a96(int i17) {
        android.view.View view = this.f256397f;
        if (view != null) {
            view.setBackgroundColor(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTingCategoryContainer");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18736x613b2f1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.cornerRadius = jz5.h.b(new nm4.k(context));
        this.coverSize = jz5.h.b(new nm4.l(context));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571106d10, (android.view.ViewGroup) this, true);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ji0.a.f381443a, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.f256403o = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568845o95);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f256397f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vez);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731 c18735xc3936731 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18735xc3936731) findViewById2;
        this.f256398g = c18735xc3936731;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.o9d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f256399h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.o98);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f256400i = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vex);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f256401m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568844o94);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f256402n = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568848vf2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        c18735xc3936731.m72277x66627cf0(this.f256403o);
        setClipToOutline(true);
        setOutlineProvider(new nm4.j(this));
    }
}
