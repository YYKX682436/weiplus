package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class o implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f109873a;

    /* renamed from: b, reason: collision with root package name */
    public float f109874b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f109875c;

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.ValueAnimator f109876d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.ValueAnimator f109877e;

    /* renamed from: f, reason: collision with root package name */
    public int f109878f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f109879g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109880h;

    public o() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.3f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.b(ofFloat));
        this.f109876d = ofFloat;
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.3f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.addListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.a(ofFloat2, ofFloat2));
        this.f109877e = ofFloat2;
        this.f109878f = -1;
    }

    @Override // gc2.c
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int i18 = this.f109878f;
        if (i18 >= 0) {
            android.view.View childAt = recyclerView.getChildAt(i18 - (linearLayoutManager != null ? linearLayoutManager.w() : 0));
            android.view.View selectedView = (childAt == null || (finderCommentImageGalleryView = (com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView) childAt.findViewById(com.tencent.mm.R.id.u76)) == null) ? null : finderCommentImageGalleryView.getSelectedView();
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = selectedView instanceof com.tencent.mm.ui.base.MultiTouchImageView ? (com.tencent.mm.ui.base.MultiTouchImageView) selectedView : null;
            if (multiTouchImageView != null) {
                multiTouchImageView.d(0.0f, 0.0f);
            }
            if (i17 != 0 && this.f109878f == 0) {
                android.view.View childAt2 = recyclerView.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.removeCallbacks(this.f109879g);
                }
                this.f109879g = null;
                kotlin.jvm.internal.o.d(childAt2);
                d(childAt2);
            }
        }
        this.f109878f = i17;
    }

    @Override // gc2.c
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            android.view.View childAt = recyclerView.getChildAt(0);
            android.view.ViewGroup viewGroup = childAt != null ? (android.view.ViewGroup) childAt.findViewById(com.tencent.mm.R.id.ssh) : null;
            if (!kotlin.jvm.internal.o.a(viewGroup != null ? java.lang.Float.valueOf(viewGroup.getAlpha()) : null, 1.0f)) {
                com.tencent.mm.plugin.finder.feed.ui.commentimage.g gVar = new com.tencent.mm.plugin.finder.feed.ui.commentimage.g(viewGroup);
                android.animation.ValueAnimator valueAnimator = this.f109877e;
                valueAnimator.addUpdateListener(gVar);
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                valueAnimator.start();
            }
            this.f109873a = null;
            this.f109874b = 0.0f;
            this.f109875c = false;
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
    public void c(androidx.recyclerview.widget.RecyclerView r10, int r11, float r12, int r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.commentimage.o.c(androidx.recyclerview.widget.RecyclerView, int, float, int):void");
    }

    public final void d(android.view.View view) {
        android.view.View findViewById;
        if (this.f109880h && (findViewById = view.findViewById(com.tencent.mm.R.id.vbb)) != null) {
            if (findViewById.getVisibility() == 0) {
                this.f109880h = false;
                findViewById.post(new com.tencent.mm.plugin.finder.feed.ui.commentimage.f(findViewById, view.findViewById(com.tencent.mm.R.id.ssh)));
            }
        }
    }
}
