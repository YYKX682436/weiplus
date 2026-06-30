package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class d2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f191457d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f191458e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f191459f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f191460g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a2 f191461h;

    /* renamed from: i, reason: collision with root package name */
    public float f191462i;

    /* renamed from: m, reason: collision with root package name */
    public float f191463m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f191464n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f191457d = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        setBackgroundColor(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b2(context);
        b2Var.setBackgroundColor(-16777216);
        b2Var.setAlpha(0.0f);
        addView(b2Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f191458e = b2Var;
        this.f191461h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a2.f191175d;
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.z1(this));
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 a(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00)) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 a17 = a((android.view.ViewGroup) childAt);
                if (a17 != null) {
                    return a17;
                }
            } else if (childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) childAt;
                if (viewGroup.getHeight() <= c22801x87cbdc00.getHeight()) {
                    return c22801x87cbdc00;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public final android.view.View b() {
        android.view.View view = this.f191459f;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d2.onInterceptTouchEvent(android.view.MotionEvent):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
