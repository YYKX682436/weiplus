package cw2;

/* loaded from: classes2.dex */
public final class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305657d;

    public y8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305657d = c15196x85976f5f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m61460x51de1d06;
        android.view.View m61460x51de1d062;
        android.view.View m61460x51de1d063;
        yz5.l onCustomLoadingStatusChange;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.f212237x0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305657d;
        c15196x85976f5f.getClass();
        if (c15196x85976f5f.isEnableShowLoading) {
            cw2.da videoView = c15196x85976f5f.getVideoView();
            if (videoView != null && videoView.getIsViewFocused()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 longVideoSeekBar = c15196x85976f5f.getLongVideoSeekBar();
                if (longVideoSeekBar != null && (onCustomLoadingStatusChange = longVideoSeekBar.getOnCustomLoadingStatusChange()) != null) {
                    onCustomLoadingStatusChange.mo146xb9724478(java.lang.Boolean.TRUE);
                    return;
                }
                if (c15196x85976f5f.getNewSeekBarLayout() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.N5).mo141623x754a37bb()).r()).booleanValue()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 newSeekBarLayout = c15196x85976f5f.getNewSeekBarLayout();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newSeekBarLayout);
                        android.view.View m61209xcc04d8cb = newSeekBarLayout.m61209xcc04d8cb();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(m61209xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m61209xcc04d8cb.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(m61209xcc04d8cb, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{android.graphics.Color.argb(0, 161, 161, 161), android.graphics.Color.argb(255, 161, 161, 161)});
                        gradientDrawable.setCornerRadius(newSeekBarLayout.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
                        newSeekBarLayout.m61209xcc04d8cb().setBackground(gradientDrawable);
                        newSeekBarLayout.m61209xcc04d8cb().getLayoutParams().width = 0;
                        android.view.View m61209xcc04d8cb2 = newSeekBarLayout.m61209xcc04d8cb();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(m61209xcc04d8cb2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        m61209xcc04d8cb2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(m61209xcc04d8cb2, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, newSeekBarLayout.getContext().getResources().getDisplayMetrics().widthPixels - ((int) newSeekBarLayout.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7)));
                        ofInt.addUpdateListener(new cw2.w0(newSeekBarLayout));
                        ofInt.setDuration(500L);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new cw2.x0(newSeekBarLayout));
                        ofFloat.setDuration(500L);
                        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playSequentially(ofInt, ofFloat);
                        animatorSet.addListener(new cw2.y0(newSeekBarLayout));
                        animatorSet.setStartDelay(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.O5).mo141623x754a37bb()).r()).longValue() * 1000);
                        animatorSet.start();
                        newSeekBarLayout.C = animatorSet;
                        return;
                    }
                }
                m61460x51de1d06 = c15196x85976f5f.m61460x51de1d06();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(m61460x51de1d06, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m61460x51de1d06.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(m61460x51de1d06, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m61460x51de1d062 = c15196x85976f5f.m61460x51de1d06();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(m61460x51de1d062, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                m61460x51de1d062.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(m61460x51de1d062, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15196x85976f5f.m61471xe56ce956(), "[showLoading] " + c15196x85976f5f.d0());
                float floatValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.P5).mo141623x754a37bb()).r()).floatValue();
                m61460x51de1d063 = c15196x85976f5f.m61460x51de1d06();
                m61460x51de1d063.animate().alpha(floatValue).setDuration(300L).setListener(new cw2.x8(c15196x85976f5f, floatValue)).start();
            }
        }
    }
}
