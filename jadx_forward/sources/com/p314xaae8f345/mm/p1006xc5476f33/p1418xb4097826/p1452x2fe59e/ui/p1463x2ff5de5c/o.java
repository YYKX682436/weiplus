package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes2.dex */
public final class o implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f191406a;

    /* renamed from: b, reason: collision with root package name */
    public float f191407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f191408c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.ValueAnimator f191409d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.ValueAnimator f191410e;

    /* renamed from: f, reason: collision with root package name */
    public int f191411f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f191412g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191413h;

    public o() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.3f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.b(ofFloat));
        this.f191409d = ofFloat;
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.3f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.a(ofFloat2, ofFloat2));
        this.f191410e = ofFloat2;
        this.f191411f = -1;
    }

    @Override // gc2.c
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int i18 = this.f191411f;
        if (i18 >= 0) {
            android.view.View childAt = recyclerView.getChildAt(i18 - (c1162x665295de != null ? c1162x665295de.w() : 0));
            android.view.View selectedView = (childAt == null || (c13709xbc18ee15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15) childAt.findViewById(com.p314xaae8f345.mm.R.id.u76)) == null) ? null : c13709xbc18ee15.getSelectedView();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = selectedView instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) selectedView : null;
            if (c21524xecd57b9a != null) {
                c21524xecd57b9a.d(0.0f, 0.0f);
            }
            if (i17 != 0 && this.f191411f == 0) {
                android.view.View childAt2 = recyclerView.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.removeCallbacks(this.f191412g);
                }
                this.f191412g = null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt2);
                d(childAt2);
            }
        }
        this.f191411f = i17;
    }

    @Override // gc2.c
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            android.view.View childAt = recyclerView.getChildAt(0);
            android.view.ViewGroup viewGroup = childAt != null ? (android.view.ViewGroup) childAt.findViewById(com.p314xaae8f345.mm.R.id.ssh) : null;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.a(viewGroup != null ? java.lang.Float.valueOf(viewGroup.getAlpha()) : null, 1.0f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.g(viewGroup);
                android.animation.ValueAnimator valueAnimator = this.f191410e;
                valueAnimator.addUpdateListener(gVar);
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                valueAnimator.start();
            }
            this.f191406a = null;
            this.f191407b = 0.0f;
            this.f191408c = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if ((r11 != null ? r11.h("kFinderCommentImageFlowBottomEduDisplayed") : false) == false) goto L48;
     */
    @Override // gc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r10, int r11, float r12, int r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.o.c(androidx.recyclerview.widget.RecyclerView, int, float, int):void");
    }

    public final void d(android.view.View view) {
        android.view.View findViewById;
        if (this.f191413h && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.vbb)) != null) {
            if (findViewById.getVisibility() == 0) {
                this.f191413h = false;
                findViewById.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.f(findViewById, view.findViewById(com.p314xaae8f345.mm.R.id.ssh)));
            }
        }
    }
}
