package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B%\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010+\u001a\u00020\t¢\u0006\u0004\b)\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderJumpAnchorView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "setTitle", "", "color", "setTitleColor", "", "below", "setBelow", "", "d", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "setTitleView", "(Landroid/widget/TextView;)V", "titleView", "value", "getLoading", "()Z", "setLoading", "(Z)V", "loading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderJumpAnchorView */
/* loaded from: classes2.dex */
public final class C15304x8ca13bae extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f212698i = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212700e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView titleView;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f212702g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f212703h;

    public C15304x8ca13bae(android.content.Context context) {
        super(context);
        this.animationDuration = 400L;
        b(null);
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        if (c15304x8ca13bae.getVisibility() == 0) {
            return;
        }
        c15304x8ca13bae.setVisibility(0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(hc2.f1.t(c15304x8ca13bae), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(c15304x8ca13bae.animationDuration);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(c15304x8ca13bae.getContext(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rc(aVar));
        c15304x8ca13bae.startAnimation(translateAnimation);
    }

    public final void a(yz5.a aVar) {
        if (getVisibility() != 0) {
            return;
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, getWidth(), 0.0f, 0.0f);
        translateAnimation.setDuration(this.animationDuration);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(getContext(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qc(aVar, this));
        startAnimation(translateAnimation);
    }

    public final void b(android.util.AttributeSet attributeSet) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        setVisibility(8);
        setOrientation(0);
        setGravity(16);
        int f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        setPadding(f17, f17, getPaddingRight(), f17);
        setClipToPadding(false);
        setClipChildren(false);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7s, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.u86);
        this.f212700e = findViewById;
        if (findViewById != null) {
            findViewById.setBackground(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pc(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c), 0.0f, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj), b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835), i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)));
        }
        android.view.View view = this.f212700e;
        this.titleView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hq6) : null;
        android.view.View view2 = this.f212700e;
        this.f212702g = view2 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.rse) : null;
        android.view.View view3 = this.f212700e;
        this.f212703h = view3 != null ? (android.widget.ProgressBar) view3.findViewById(com.p314xaae8f345.mm.R.id.f566993hq5) : null;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b92.w2.f100082f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            java.lang.String string = obtainStyledAttributes.getString(0);
            int color = obtainStyledAttributes.getColor(1, -1);
            this.animationDuration = obtainStyledAttributes.getInt(2, (int) this.animationDuration);
            obtainStyledAttributes.recycle();
            if (string != null && (textView2 = this.titleView) != null) {
                textView2.setText(string);
            }
            if (color == -1 || (textView = this.titleView) == null) {
                return;
            }
            textView.setTextColor(color);
        }
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    /* renamed from: getLoading */
    public final boolean m62118x51de1d06() {
        android.widget.ProgressBar progressBar = this.f212703h;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public final android.widget.TextView getTitleView() {
        return this.titleView;
    }

    /* renamed from: setAnimationDuration */
    public final void m62120xce929cf6(long j17) {
        this.animationDuration = j17;
    }

    /* renamed from: setBelow */
    public final void m62121x52c04cef(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f212702g;
        if (c22699x3dcdb352 == null) {
            return;
        }
        c22699x3dcdb352.setRotation(z17 ? 180.0f : 0.0f);
    }

    /* renamed from: setLoading */
    public final void m62122xc54f6a7a(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f212702g;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            android.widget.ProgressBar progressBar = this.f212703h;
            if (progressBar == null) {
                return;
            }
            progressBar.setVisibility(0);
            return;
        }
        android.widget.ProgressBar progressBar2 = this.f212703h;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f212702g;
        if (c22699x3dcdb3522 == null) {
            return;
        }
        c22699x3dcdb3522.setVisibility(0);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        jz5.f0 f0Var;
        android.view.View view = this.f212700e;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setTitle */
    public final void m62123x53bfe316(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        android.widget.TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    /* renamed from: setTitleColor */
    public final void m62124xb124d9ed(int i17) {
        android.widget.TextView textView = this.titleView;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* renamed from: setTitleView */
    public final void m62125xdc7516db(android.widget.TextView textView) {
        this.titleView = textView;
    }

    public C15304x8ca13bae(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animationDuration = 400L;
        b(attributeSet);
    }

    public C15304x8ca13bae(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.animationDuration = 400L;
        b(attributeSet);
    }
}
