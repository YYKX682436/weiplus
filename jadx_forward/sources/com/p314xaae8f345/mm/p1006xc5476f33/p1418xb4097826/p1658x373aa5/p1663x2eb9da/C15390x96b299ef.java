package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/crit/LiveCritBuffAnimView;", "Landroid/widget/LinearLayout;", "", "f", "Ljz5/g;", "getTRAN_Y", "()F", "TRAN_Y", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView */
/* loaded from: classes3.dex */
public final class C15390x96b299ef extends android.widget.LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f213336g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f213337d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f213338e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g TRAN_Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15390x96b299ef(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213338e = "LiveCritBuffAnimView";
        this.TRAN_Y = jz5.h.b(ax2.a.f96562d);
        b();
    }

    public final void a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = new p012xc85e97e9.p112x993b6d55.C1184xfa388aad();
        c1184xfa388aad.b0(0);
        c1184xfa388aad.X(new p012xc85e97e9.p112x993b6d55.C1182x4c44d91());
        c1184xfa388aad.X(new p012xc85e97e9.p112x993b6d55.C1179x214a9c(1));
        c1184xfa388aad.X(new p012xc85e97e9.p112x993b6d55.C1173xe703c6a5());
        android.widget.LinearLayout linearLayout = this.f213337d;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        u4.g1.a(linearLayout, c1184xfa388aad);
        android.widget.LinearLayout linearLayout2 = this.f213337d;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        int childCount = linearLayout2.getChildCount();
        if (childCount > 0) {
            for (int i17 = 0; i17 < childCount; i17++) {
                android.widget.LinearLayout linearLayout3 = this.f213337d;
                if (linearLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                    throw null;
                }
                android.view.View childAt = linearLayout3.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                java.lang.Object tag = childAt.getTag();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE)) {
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(childAt, "alpha", 1.0f, 0.2f);
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleX", 1.0f, 0.8f);
                    android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleY", 1.0f, 0.8f);
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                    animatorSet.setDuration(600L);
                    animatorSet.addListener(new ax2.c(this, childAt));
                    animatorSet.start();
                }
            }
        }
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        textView.setShadowLayer(1.0f, 0.0f, 1.0f, android.graphics.Color.parseColor("#FF6146"));
        textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        textView.invalidate();
        android.widget.LinearLayout linearLayout4 = this.f213337d;
        if (linearLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        linearLayout4.addView(textView, linearLayout4.getChildCount());
    }

    public final void b() {
        android.view.View findViewById = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.awy, this).findViewById(com.p314xaae8f345.mm.R.id.i98);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f213337d = linearLayout;
        linearLayout.setGravity(80);
        android.widget.LinearLayout linearLayout2 = this.f213337d;
        if (linearLayout2 != null) {
            ym5.a1.h(linearLayout2, new ax2.b(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
    }

    /* renamed from: getTRAN_Y */
    public final float m62561x2fab8f1b() {
        return ((java.lang.Number) this.TRAN_Y.mo141623x754a37bb()).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.widget.LinearLayout linearLayout = this.f213337d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15390x96b299ef(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213338e = "LiveCritBuffAnimView";
        this.TRAN_Y = jz5.h.b(ax2.a.f96562d);
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15390x96b299ef(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213338e = "LiveCritBuffAnimView";
        this.TRAN_Y = jz5.h.b(ax2.a.f96562d);
        b();
    }
}
