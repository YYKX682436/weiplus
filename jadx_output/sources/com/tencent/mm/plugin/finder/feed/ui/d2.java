package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class d2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f109924d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f109925e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f109926f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f109927g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ui.a2 f109928h;

    /* renamed from: i, reason: collision with root package name */
    public float f109929i;

    /* renamed from: m, reason: collision with root package name */
    public float f109930m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f109931n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f109924d = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        setBackgroundColor(0);
        com.tencent.mm.plugin.finder.feed.ui.b2 b2Var = new com.tencent.mm.plugin.finder.feed.ui.b2(context);
        b2Var.setBackgroundColor(-16777216);
        b2Var.setAlpha(0.0f);
        addView(b2Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f109925e = b2Var;
        this.f109928h = com.tencent.mm.plugin.finder.feed.ui.a2.f109642d;
        post(new com.tencent.mm.plugin.finder.feed.ui.z1(this));
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout a(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof com.tencent.mm.view.RefreshLoadMoreLayout)) {
                com.tencent.mm.view.RefreshLoadMoreLayout a17 = a((android.view.ViewGroup) childAt);
                if (a17 != null) {
                    return a17;
                }
            } else if (childAt instanceof com.tencent.mm.view.RefreshLoadMoreLayout) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) childAt;
                if (viewGroup.getHeight() <= refreshLoadMoreLayout.getHeight()) {
                    return refreshLoadMoreLayout;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public final android.view.View b() {
        android.view.View view = this.f109926f;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("contentView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if ((r0.getTranslationY() == ((float) r3.getHeight())) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.d2.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 != 3) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.d2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
