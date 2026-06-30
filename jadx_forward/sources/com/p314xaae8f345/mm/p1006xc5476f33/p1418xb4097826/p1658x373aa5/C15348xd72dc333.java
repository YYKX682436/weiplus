package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0002B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tJ\u001a\u0010\f\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/al;", "getCurrentState", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, "Ljz5/f0;", "setCurrentSpeed", "getCurrentSpeed", "Lkotlin/Function1;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnSpeedClickListener", "setOnStateChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/yk", "com/tencent/mm/plugin/finder/view/zk", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView */
/* loaded from: classes2.dex */
public class C15348xd72dc333 extends android.widget.FrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f213000w = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f213001d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f213002e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f213003f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f213004g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f213005h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f213006i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f213007m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f213008n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al f213009o;

    /* renamed from: p, reason: collision with root package name */
    public float f213010p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f213011q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f213012r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f213013s;

    /* renamed from: t, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f213014t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.AnimatorSet f213015u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yk f213016v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15348xd72dc333(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar) {
        zkVar.f215005a.setVisibility(0);
        zkVar.f215005a.setBackground(b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.d0h));
        zkVar.f215006b.setVisibility(0);
        zkVar.f215007c.setVisibility(0);
        android.widget.TextView textView = zkVar.f215008d;
        textView.setTextColor(-1);
        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar;
        if (this.f213009o == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213185d && (zkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) ((java.util.LinkedHashMap) this.f213004g).get(java.lang.Float.valueOf(this.f213010p))) != null) {
            android.animation.AnimatorSet animatorSet = this.f213015u;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            android.widget.LinearLayout linearLayout = zkVar.f215005a;
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, "scaleX", 1.0f, 1.1f, 1.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(linearLayout, "scaleY", 1.0f, 1.1f, 1.0f);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(ofFloat, ofFloat2);
            animatorSet2.setDuration(300L);
            animatorSet2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fl(this));
            animatorSet2.start();
            this.f213015u = animatorSet2;
        }
    }

    public final void c(android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f213014t;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        imageView.setAlpha(1.0f);
        imageView2.setAlpha(0.3f);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f213013s;
        if (y0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorView", "startIconAnimation skip: scope unavailable (not attached)");
        } else {
            this.f213014t = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gl(this, imageView, imageView2, null), 3, null);
        }
    }

    public final void d() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f213014t;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f213014t = null;
        android.animation.AnimatorSet animatorSet = this.f213015u;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f213015u = null;
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al state) {
        android.widget.ImageView imageView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorView", "switchToState from " + this.f213009o + " to " + state);
        this.f213009o = state;
        d();
        android.widget.LinearLayout linearLayout = this.f213001d;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectorContainer");
            throw null;
        }
        linearLayout.setVisibility((state == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213185d || state == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213189h) ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = this.f213002e;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playingContainer");
            throw null;
        }
        linearLayout2.setVisibility(state == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e ? 0 : 8);
        android.widget.LinearLayout linearLayout3 = this.f213003f;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lockedContainer");
            throw null;
        }
        linearLayout3.setVisibility(state == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213187f ? 0 : 8);
        int ordinal = state.ordinal();
        java.util.Map map = this.f213004g;
        if (ordinal == 0) {
            f();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f213010p));
            if (zkVar != null) {
                c(zkVar.f215006b, zkVar.f215007c);
            }
        } else if (ordinal == 1) {
            k();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f213010p));
            if (zkVar2 != null) {
                c(zkVar2.f215006b, zkVar2.f215007c);
            }
        } else if (ordinal == 2) {
            h();
            android.widget.ImageView imageView2 = this.f213005h;
            if (imageView2 != null && (imageView = this.f213006i) != null) {
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPlayingIcon1");
                    throw null;
                }
                imageView2.setVisibility(0);
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPlayingIcon2");
                    throw null;
                }
                imageView.setVisibility(0);
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPlayingIcon1");
                    throw null;
                }
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPlayingIcon2");
                    throw null;
                }
                c(imageView2, imageView);
            }
        } else if (ordinal == 3) {
            g();
        }
        yz5.l lVar = this.f213012r;
        if (lVar != null) {
            lVar.mo146xb9724478(state);
        }
    }

    public final void f() {
        for (java.util.Map.Entry entry : this.f213004g.entrySet()) {
            float floatValue = ((java.lang.Number) entry.getKey()).floatValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) entry.getValue();
            zkVar.f215005a.setVisibility(0);
            if (floatValue == this.f213010p) {
                a(zkVar);
            } else {
                zkVar.f215005a.setBackground(null);
                zkVar.f215006b.setVisibility(8);
                zkVar.f215007c.setVisibility(8);
                int m9702x7444d5ad = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
                android.widget.TextView textView = zkVar.f215008d;
                textView.setTextColor(m9702x7444d5ad);
                textView.setShadowLayer(getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj), 0.0f, getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561174bg), 1291845632);
            }
        }
    }

    public final void g() {
        java.lang.String string;
        float f17 = this.f213010p;
        if (this.f213016v == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yk.f214931d) {
            if (f17 == 1.0f) {
                string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573619o22);
            } else {
                string = f17 % ((float) 1) == 0.0f ? getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573620o23, java.lang.Integer.valueOf((int) f17)) : getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573620o23, java.lang.Float.valueOf(f17));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            if (f17 == 1.0f) {
                string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573619o22);
            } else {
                string = f17 % ((float) 1) == 0.0f ? getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5h, java.lang.Integer.valueOf((int) f17)) : getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5h, java.lang.Float.valueOf(f17));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        android.widget.TextView textView = this.f213008n;
        if (textView != null) {
            textView.setText(string);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvLockedSpeed");
            throw null;
        }
    }

    /* renamed from: getCurrentSpeed, reason: from getter */
    public final float getF213010p() {
        return this.f213010p;
    }

    /* renamed from: getCurrentState, reason: from getter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al getF213009o() {
        return this.f213009o;
    }

    public final void h() {
        java.lang.String string;
        float f17 = this.f213010p;
        if (f17 == 1.0f) {
            string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573618o21);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        } else {
            if (f17 % ((float) 1) == 0.0f) {
                string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5v, java.lang.Integer.valueOf((int) f17));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            } else {
                string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5v, java.lang.Float.valueOf(f17));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            }
        }
        android.widget.TextView textView = this.f213007m;
        if (textView != null) {
            textView.setText(string);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvPlayingSpeed");
            throw null;
        }
    }

    public final void k() {
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f213004g).entrySet()) {
            float floatValue = ((java.lang.Number) entry.getKey()).floatValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) entry.getValue();
            if (floatValue == this.f213010p) {
                a(zkVar);
            } else {
                zkVar.f215005a.setVisibility(4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        android.widget.ImageView imageView;
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorView", "onAttachedToWindow currentState=" + this.f213009o);
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f213013s = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al alVar = this.f213009o;
        if (alVar != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e) {
            if (alVar == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213185d || alVar == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213189h) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) ((java.util.LinkedHashMap) this.f213004g).get(java.lang.Float.valueOf(this.f213010p));
                if (zkVar != null) {
                    c(zkVar.f215006b, zkVar.f215007c);
                    return;
                }
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = this.f213005h;
        if (imageView2 == null || (imageView = this.f213006i) == null) {
            return;
        }
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPlayingIcon1");
            throw null;
        }
        if (imageView != null) {
            c(imageView2, imageView);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ivPlayingIcon2");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f213013s;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f213013s = null;
    }

    /* renamed from: setCurrentSpeed */
    public final void m62386xee1e63d0(float f17) {
        this.f213010p = f17;
        int ordinal = this.f213009o.ordinal();
        java.util.Map map = this.f213004g;
        if (ordinal == 0) {
            f();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f213010p));
            if (zkVar != null) {
                c(zkVar.f215006b, zkVar.f215007c);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                h();
                return;
            } else {
                if (ordinal != 3) {
                    return;
                }
                g();
                return;
            }
        }
        k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk zkVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f213010p));
        if (zkVar2 != null) {
            c(zkVar2.f215006b, zkVar2.f215007c);
        }
    }

    /* renamed from: setOnSpeedClickListener */
    public final void m62387x2b009d16(yz5.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f213011q = listener;
    }

    /* renamed from: setOnStateChangeListener */
    public final void m62388xd77827d4(yz5.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f213012r = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15348xd72dc333(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f213004g = linkedHashMap;
        this.f213009o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213185d;
        this.f213010p = 2.0f;
        this.f213016v = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yk.f214931d;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eec, (android.view.ViewGroup) this, true);
        setClipChildren(false);
        setClipToPadding(false);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.v2w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f213001d = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.uqq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f213002e = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ucx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f213003f = (android.widget.LinearLayout) findViewById3;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.5f);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.v_b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.u6i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.u6j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.vh9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        linkedHashMap.put(valueOf, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk((android.widget.LinearLayout) findViewById4, (android.widget.ImageView) findViewById5, (android.widget.ImageView) findViewById6, (android.widget.TextView) findViewById7));
        java.lang.Float valueOf2 = java.lang.Float.valueOf(2.0f);
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.v_c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.u6k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.u6l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.vh_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        linkedHashMap.put(valueOf2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk((android.widget.LinearLayout) findViewById8, (android.widget.ImageView) findViewById9, (android.widget.ImageView) findViewById10, (android.widget.TextView) findViewById11));
        java.lang.Float valueOf3 = java.lang.Float.valueOf(3.0f);
        android.view.View findViewById12 = findViewById(com.p314xaae8f345.mm.R.id.v_d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        android.view.View findViewById13 = findViewById(com.p314xaae8f345.mm.R.id.u6m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        android.view.View findViewById14 = findViewById(com.p314xaae8f345.mm.R.id.u6n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        android.view.View findViewById15 = findViewById(com.p314xaae8f345.mm.R.id.vha);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        linkedHashMap.put(valueOf3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk((android.widget.LinearLayout) findViewById12, (android.widget.ImageView) findViewById13, (android.widget.ImageView) findViewById14, (android.widget.TextView) findViewById15));
        android.view.View findViewById16 = findViewById(com.p314xaae8f345.mm.R.id.u6o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.f213005h = (android.widget.ImageView) findViewById16;
        android.view.View findViewById17 = findViewById(com.p314xaae8f345.mm.R.id.u6p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        this.f213006i = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = findViewById(com.p314xaae8f345.mm.R.id.vh6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        this.f213007m = (android.widget.TextView) findViewById18;
        android.view.View findViewById19 = findViewById(com.p314xaae8f345.mm.R.id.f568943vh5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        this.f213008n = (android.widget.TextView) findViewById19;
        float m17 = i65.a.m(context);
        float dimension = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz);
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zk) it.next()).f215008d.setTextSize(0, dimension * m17);
        }
        android.widget.TextView textView = this.f213007m;
        if (textView != null) {
            float f17 = dimension * m17;
            textView.setTextSize(0, f17);
            android.widget.TextView textView2 = this.f213008n;
            if (textView2 != null) {
                textView2.setTextSize(0, f17);
                android.widget.LinearLayout linearLayout = this.f213002e;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xk(this));
                    f();
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playingContainer");
                    throw null;
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvLockedSpeed");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvPlayingSpeed");
        throw null;
    }

    public final android.animation.ValueAnimator a(android.view.View view, long j17, long j18, float f17, float f18) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.setStartDelay(j18);
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.el(view, f17, f18));
        return ofFloat;
    }
}
