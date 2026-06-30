package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation;", "", "getLayoutId", "", "isPlay", "Ljz5/f0;", "setIsPlay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAlphaAnimation */
/* loaded from: classes3.dex */
public class C19738x1379dd9c extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee {

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f272959p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19738x1379dd9c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void D(android.view.View view, android.view.View view2) {
        if (view == null || view2 == null) {
            return;
        }
        view.clearAnimation();
        view2.clearAnimation();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.7f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.7f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view2, "scaleX", 0.7f, 1.0f);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view2, "scaleY", 0.7f, 1.0f);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.setDuration(150L);
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet2.playTogether(ofFloat4, ofFloat5, ofFloat6);
        animatorSet.start();
        animatorSet2.start();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.em8;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        super.j();
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.uqk);
        this.f272959p1 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79844x41f895de, -1));
        }
        android.widget.ImageView imageView2 = this.f272959p1;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v6(this));
        }
        android.widget.ImageView imageView3 = this.f272959p1;
        if (imageView3 != null) {
            imageView3.setAlpha(0.0f);
        }
        android.widget.ImageView m75824x20617a52 = m75824x20617a52();
        if (m75824x20617a52 != null) {
            m75824x20617a52.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79865xc8527e4c, -1));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        boolean z18 = this.f272979z != z17;
        this.f272979z = z17;
        if (z17) {
            java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.widget.ImageView m75824x20617a52 = m75824x20617a52();
            if (m75824x20617a52 != null) {
                m75824x20617a52.setContentDescription(string);
            }
            android.widget.ImageView imageView = this.f272959p1;
            if (imageView != null) {
                imageView.setContentDescription(string);
            }
            if (z18) {
                android.widget.ImageView m75824x20617a522 = m75824x20617a52();
                if (m75824x20617a522 != null) {
                    m75824x20617a522.setAlpha(1.0f);
                }
                android.widget.ImageView m75824x20617a523 = m75824x20617a52();
                if (m75824x20617a523 != null) {
                    m75824x20617a523.setScaleX(1.0f);
                }
                android.widget.ImageView m75824x20617a524 = m75824x20617a52();
                if (m75824x20617a524 != null) {
                    m75824x20617a524.setScaleY(1.0f);
                }
                android.widget.ImageView imageView2 = this.f272959p1;
                if (imageView2 != null) {
                    imageView2.setAlpha(0.0f);
                }
                D(m75824x20617a52(), this.f272959p1);
                return;
            }
            android.widget.ImageView m75824x20617a525 = m75824x20617a52();
            if (m75824x20617a525 != null) {
                m75824x20617a525.setAlpha(0.0f);
            }
            android.widget.ImageView imageView3 = this.f272959p1;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            android.widget.ImageView imageView4 = this.f272959p1;
            if (imageView4 != null) {
                imageView4.setScaleX(1.0f);
            }
            android.widget.ImageView imageView5 = this.f272959p1;
            if (imageView5 == null) {
                return;
            }
            imageView5.setScaleY(1.0f);
            return;
        }
        java.lang.String string2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.widget.ImageView m75824x20617a526 = m75824x20617a52();
        if (m75824x20617a526 != null) {
            m75824x20617a526.setContentDescription(string2);
        }
        android.widget.ImageView imageView6 = this.f272959p1;
        if (imageView6 != null) {
            imageView6.setContentDescription(string2);
        }
        if (z18) {
            android.widget.ImageView m75824x20617a527 = m75824x20617a52();
            if (m75824x20617a527 != null) {
                m75824x20617a527.setAlpha(0.0f);
            }
            android.widget.ImageView imageView7 = this.f272959p1;
            if (imageView7 != null) {
                imageView7.setAlpha(1.0f);
            }
            android.widget.ImageView imageView8 = this.f272959p1;
            if (imageView8 != null) {
                imageView8.setScaleX(1.0f);
            }
            android.widget.ImageView imageView9 = this.f272959p1;
            if (imageView9 != null) {
                imageView9.setScaleY(1.0f);
            }
            D(this.f272959p1, m75824x20617a52());
            return;
        }
        android.widget.ImageView m75824x20617a528 = m75824x20617a52();
        if (m75824x20617a528 != null) {
            m75824x20617a528.setAlpha(1.0f);
        }
        android.widget.ImageView m75824x20617a529 = m75824x20617a52();
        if (m75824x20617a529 != null) {
            m75824x20617a529.setScaleX(1.0f);
        }
        android.widget.ImageView m75824x20617a5210 = m75824x20617a52();
        if (m75824x20617a5210 != null) {
            m75824x20617a5210.setScaleY(1.0f);
        }
        android.widget.ImageView imageView10 = this.f272959p1;
        if (imageView10 == null) {
            return;
        }
        imageView10.setAlpha(0.0f);
    }
}
