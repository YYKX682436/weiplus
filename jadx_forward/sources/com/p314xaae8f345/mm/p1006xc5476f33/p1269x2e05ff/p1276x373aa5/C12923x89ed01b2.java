package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallButtonView;", "Lcom/tencent/mm/plugin/ball/view/BaseFloatBallButtonView;", "", "isLargeMode", "Ljz5/f0;", "setLargeMode", "", "color", "setPlayButtonColor", "setDeleteButtonColor", "Landroid/view/View$OnClickListener;", "clickListener", "setOnPlayButtonClickListener", "setOnDeleteButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallButtonView */
/* loaded from: classes10.dex */
public final class C12923x89ed01b2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f175002d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f175003e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f175004f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f175005g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f175006h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12923x89ed01b2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        m54144x88ef853c(ballInfo.f174586n == 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = ballInfo.f174587o;
        boolean z17 = ballButtonInfo.f174603e;
        boolean z18 = ballButtonInfo.f174604f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175003e;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
        android.widget.ImageView imageView = this.f175002d;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButtonShadow");
            throw null;
        }
        imageView.setVisibility(z17 ? 0 : 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f175003e;
        if (c22699x3dcdb3522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        c22699x3dcdb3522.setEnabled(z18);
        m54145xb06306bb(ballButtonInfo.f174605g);
        boolean z19 = ballButtonInfo.f174606h;
        boolean z27 = ballButtonInfo.f174607i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f175005g;
        if (c22699x3dcdb3523 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
        c22699x3dcdb3523.setVisibility(z19 ? 0 : 8);
        android.widget.ImageView imageView2 = this.f175004f;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDelButtonShadow");
            throw null;
        }
        imageView2.setVisibility(z19 ? 0 : 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f175005g;
        if (c22699x3dcdb3524 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
        c22699x3dcdb3524.setEnabled(z27);
        m54143xca36d464(ballButtonInfo.f174608m);
        boolean z28 = ballButtonInfo.f174602d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.f175003e;
        if (c22699x3dcdb3525 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        c22699x3dcdb3525.setImageResource(z28 ? com.p314xaae8f345.mm.R.raw.f79371x277d5a6a : com.p314xaae8f345.mm.R.raw.f79373x9d1ce7a1);
        android.widget.ImageView imageView3 = this.f175002d;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButtonShadow");
            throw null;
        }
        imageView3.setImageResource(z28 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563367cx0 : com.p314xaae8f345.mm.R.C30861xcebc809e.f563368cx1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = this.f175003e;
        if (c22699x3dcdb3526 != null) {
            c22699x3dcdb3526.setContentDescription(z28 ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574846lg1) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574847lg2));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
    }

    public final void b(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = qp1.e0.a(i17);
        layoutParams.height = qp1.e0.a(i17);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: setDeleteButtonColor */
    public final void m54143xca36d464(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175005g;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
    }

    /* renamed from: setLargeMode */
    public final void m54144x88ef853c(boolean z17) {
        if (this.f175006h != z17) {
            this.f175006h = z17;
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562043zz));
                setLayoutParams(layoutParams);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175003e;
                if (c22699x3dcdb352 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
                    throw null;
                }
                b(c22699x3dcdb352, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562045a01));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f175005g;
                if (c22699x3dcdb3522 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
                    throw null;
                }
                b(c22699x3dcdb3522, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562045a01));
                setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562414ek);
                android.widget.ImageView imageView = this.f175004f;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDelButtonShadow");
                    throw null;
                }
                imageView.setVisibility(8);
                android.widget.ImageView imageView2 = this.f175002d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButtonShadow");
                    throw null;
                }
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.height = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562044a00));
            setLayoutParams(layoutParams2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f175003e;
            if (c22699x3dcdb3523 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
                throw null;
            }
            b(c22699x3dcdb3523, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562046a02));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f175005g;
            if (c22699x3dcdb3524 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
                throw null;
            }
            b(c22699x3dcdb3524, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562046a02));
            setBackground(null);
            android.widget.ImageView imageView3 = this.f175004f;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDelButtonShadow");
                throw null;
            }
            imageView3.setVisibility(0);
            android.widget.ImageView imageView4 = this.f175002d;
            if (imageView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButtonShadow");
                throw null;
            }
            imageView4.setVisibility(0);
            android.widget.ImageView imageView5 = this.f175002d;
            if (imageView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButtonShadow");
                throw null;
            }
            b(imageView5, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562046a02));
            android.widget.ImageView imageView6 = this.f175004f;
            if (imageView6 != null) {
                b(imageView6, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562046a02));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDelButtonShadow");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721
    /* renamed from: setOnDeleteButtonClickListener */
    public void mo54082x5ab9ddbe(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175005g;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721
    /* renamed from: setOnPlayButtonClickListener */
    public void mo54083xb892d55(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175003e;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
    }

    /* renamed from: setPlayButtonColor */
    public final void m54145xb06306bb(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175003e;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12923x89ed01b2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570737bo4, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kwj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f175003e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.s0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f175002d = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.crz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f175005g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ri_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f175004f = (android.widget.ImageView) findViewById4;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175005g;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setContentDescription(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574845lg0));
            int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f175003e;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setPadding(a17, a17, a17, a17);
                android.widget.ImageView imageView = this.f175002d;
                if (imageView != null) {
                    imageView.setPadding(a17, a17, a17, a17);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f175005g;
                    if (c22699x3dcdb3523 != null) {
                        c22699x3dcdb3523.setPadding(a17, a17, a17, a17);
                        android.widget.ImageView imageView2 = this.f175004f;
                        if (imageView2 != null) {
                            imageView2.setPadding(a17, a17, a17, a17);
                            return;
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDelButtonShadow");
                            throw null;
                        }
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
                    throw null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButtonShadow");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
        throw null;
    }
}
