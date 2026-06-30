package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* renamed from: com.tencent.mm.ui.widget.snackbar.SnackContainer */
/* loaded from: classes10.dex */
public class C22721xaf9ba7f3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f293992d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AnimationSet f293993e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f293994f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.AnimationSet f293995g;

    public C22721xaf9ba7f3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293992d = new java.util.LinkedList();
        this.f293994f = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.k(this);
        a();
    }

    public final void a() {
        this.f293995g = new android.view.animation.AnimationSet(false);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.f293995g.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        this.f293995g.addAnimation(translateAnimation);
        this.f293995g.addAnimation(alphaAnimation);
        this.f293993e = new android.view.animation.AnimationSet(false);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 0.0f, 1, 1.0f);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.f293993e.addAnimation(translateAnimation2);
        this.f293993e.addAnimation(alphaAnimation2);
        this.f293993e.setDuration(300L);
        this.f293993e.setAnimationListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.l(this));
    }

    public final void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n nVar, boolean z17) {
        setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar = nVar.f294020e;
        if (hVar != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a = true;
            hVar.mo50891xc39f557c();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22720x4c5182e c22720x4c5182e = nVar.f294019d;
        int i17 = c22720x4c5182e.f293990m;
        android.view.View view = nVar.f294016a;
        if (i17 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c22720x4c5182e.f293990m;
            }
        }
        android.view.View view2 = c22720x4c5182e.f293991n;
        if (view2 != null) {
            addView(view2);
        } else {
            addView(view);
        }
        java.lang.String str = c22720x4c5182e.f293984d;
        android.widget.TextView textView = nVar.f294017b;
        textView.setText(str);
        java.lang.String str2 = c22720x4c5182e.f293985e;
        android.widget.TextView textView2 = nVar.f294018c;
        if (str2 != null) {
            textView2.setVisibility(0);
            textView2.setText(c22720x4c5182e.f293985e);
        } else {
            textView2.setVisibility(8);
        }
        if (z17) {
            this.f293995g.setDuration(0L);
        } else {
            this.f293995g.setDuration(500L);
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        loadAnimation.setDuration(500L);
        startAnimation(this.f293995g);
        loadAnimation.setStartOffset(200L);
        textView2.startAnimation(loadAnimation);
        textView.startAnimation(loadAnimation);
        int i18 = c22720x4c5182e.f293988h;
        if (i18 > 0) {
            postDelayed(this.f293994f, i18);
        }
        view.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.m(this, nVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f293995g.cancel();
        this.f293993e.cancel();
        removeCallbacks(this.f293994f);
        this.f293992d.clear();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar;
        super.onVisibilityChanged(view, i17);
        if (8 == i17) {
            removeAllViews();
            java.util.Queue queue = this.f293992d;
            if (!queue.isEmpty() && (hVar = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n) ((java.util.LinkedList) queue).poll()).f294020e) != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a = false;
                hVar.mo50890xc39a57c1();
            }
            if (queue.isEmpty()) {
                setVisibility(8);
            } else {
                b((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n) ((java.util.LinkedList) queue).peek(), false);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.f294010a = false;
        }
    }

    public C22721xaf9ba7f3(android.view.ViewGroup viewGroup) {
        super(viewGroup.getContext());
        this.f293992d = new java.util.LinkedList();
        this.f293994f = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.k(this);
        viewGroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        setVisibility(8);
        setId(com.p314xaae8f345.mm.R.id.n19);
        a();
    }
}
