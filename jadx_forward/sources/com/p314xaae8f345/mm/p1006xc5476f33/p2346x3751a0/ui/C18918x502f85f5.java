package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/voip/ui/VoipViewFragment;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/voip/widget/BaseSmallView;", "getCurrentView", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280, "Ljz5/f0;", "setVoicePlayDevice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-voip_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.voip.ui.VoipViewFragment */
/* loaded from: classes14.dex */
public final class C18918x502f85f5 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b f258465d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b f258466e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f258467f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18918x502f85f5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getCurrentView */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b m72872xfdad4e88() {
        return this.f258467f ? this.f258466e : this.f258465d;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b a(boolean z17, boolean z18) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator alpha3;
        android.view.ViewPropertyAnimator duration3;
        if (z18) {
            if (z17) {
                this.f258467f = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = this.f258465d;
                if (abstractC18931xc27fcc5b != null) {
                    abstractC18931xc27fcc5b.setVisibility(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b2 = this.f258466e;
                if (abstractC18931xc27fcc5b2 != null) {
                    abstractC18931xc27fcc5b2.setVisibility(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b3 = this.f258466e;
                if (abstractC18931xc27fcc5b3 != null) {
                    abstractC18931xc27fcc5b3.setAlpha(0.0f);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b4 = this.f258465d;
                if (abstractC18931xc27fcc5b4 != null && (animate3 = abstractC18931xc27fcc5b4.animate()) != null && (alpha3 = animate3.alpha(0.0f)) != null && (duration3 = alpha3.setDuration(300L)) != null) {
                    duration3.start();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b5 = this.f258466e;
                if (abstractC18931xc27fcc5b5 != null && (animate2 = abstractC18931xc27fcc5b5.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null) {
                    duration2.start();
                }
            } else {
                this.f258467f = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b6 = this.f258466e;
                if (abstractC18931xc27fcc5b6 != null) {
                    abstractC18931xc27fcc5b6.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b7 = this.f258466e;
                if (abstractC18931xc27fcc5b7 != null) {
                    removeView(abstractC18931xc27fcc5b7);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b8 = this.f258465d;
                if (abstractC18931xc27fcc5b8 != null) {
                    abstractC18931xc27fcc5b8.setVisibility(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b9 = this.f258465d;
                if (abstractC18931xc27fcc5b9 != null) {
                    abstractC18931xc27fcc5b9.setAlpha(0.0f);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b10 = this.f258465d;
                if (abstractC18931xc27fcc5b10 != null && (animate = abstractC18931xc27fcc5b10.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(300L)) != null) {
                    duration.start();
                }
            }
        }
        this.f258467f = z17;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b11 = this.f258466e;
            if (abstractC18931xc27fcc5b11 != null) {
                abstractC18931xc27fcc5b11.setVisibility(0);
            }
            return this.f258466e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b12 = this.f258465d;
        if (abstractC18931xc27fcc5b12 != null) {
            abstractC18931xc27fcc5b12.setVisibility(0);
        }
        return this.f258465d;
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b m72872xfdad4e88 = m72872xfdad4e88();
        if (m72872xfdad4e88 != null) {
            m72872xfdad4e88.c(z17);
        }
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b m72872xfdad4e88 = m72872xfdad4e88();
        if (m72872xfdad4e88 != null) {
            return m72872xfdad4e88.d();
        }
        return false;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b m72872xfdad4e88 = m72872xfdad4e88();
        if (m72872xfdad4e88 != null) {
            m72872xfdad4e88.g();
        }
    }

    public final void e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b m72872xfdad4e88 = m72872xfdad4e88();
        if (m72872xfdad4e88 != null) {
            m72872xfdad4e88.k(str);
        }
    }

    public final void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b m72872xfdad4e88 = m72872xfdad4e88();
        if (m72872xfdad4e88 != null) {
            m72872xfdad4e88.l(str);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: setVoicePlayDevice */
    public final void m72873xbbf730ba(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b m72872xfdad4e88 = m72872xfdad4e88();
        if (m72872xfdad4e88 != null) {
            m72872xfdad4e88.mo72882xbbf730ba(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18918x502f85f5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f258466e = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.h1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f258465d = h1Var;
        h1Var.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b = this.f258466e;
        if (abstractC18931xc27fcc5b != null) {
            abstractC18931xc27fcc5b.setVisibility(8);
        }
        addView(this.f258465d);
        addView(this.f258466e);
    }
}
