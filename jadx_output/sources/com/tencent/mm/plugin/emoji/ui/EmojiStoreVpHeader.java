package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class EmojiStoreVpHeader extends android.widget.LinearLayout implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f97843q = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMDotView f97844d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f97845e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f97846f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f97847g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f97848h;

    /* renamed from: i, reason: collision with root package name */
    public i12.c0 f97849i;

    /* renamed from: m, reason: collision with root package name */
    public float f97850m;

    /* renamed from: n, reason: collision with root package name */
    public float f97851n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.s3 f97852o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f97853p;

    public EmojiStoreVpHeader(android.content.Context context) {
        super(context);
        setOrientation(1);
    }

    public static int[] a(android.content.Context context) {
        int[] iArr = new int[2];
        if (context instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        } else {
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            iArr[0] = defaultDisplay.getWidth();
            iArr[1] = defaultDisplay.getHeight();
        }
        return iArr;
    }

    public void b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a8r, null);
        this.f97848h = inflate;
        this.f97846f = inflate.findViewById(com.tencent.mm.R.id.f484209de2);
        this.f97844d = (com.tencent.mm.ui.base.MMDotView) this.f97848h.findViewById(com.tencent.mm.R.id.f484208de1);
        this.f97845e = (androidx.viewpager.widget.ViewPager) this.f97848h.findViewById(com.tencent.mm.R.id.f484210de3);
        this.f97852o = new com.tencent.mm.plugin.emoji.ui.s3(this, null);
        int i17 = ((a(getContext())[0] * 3) / 8) + 1;
        android.view.View view = this.f97846f;
        if (view != null) {
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i17));
        }
        addView(this.f97848h, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    public final void c() {
        java.util.LinkedList linkedList;
        if (this.f97845e == null || (linkedList = this.f97847g) == null) {
            return;
        }
        if (linkedList.size() <= 0) {
            android.view.View view = this.f97846f;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        android.view.View view2 = this.f97846f;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f97845e.setOnPageChangeListener(this);
        if (this.f97849i != null) {
            post(new com.tencent.mm.plugin.emoji.ui.q3(this));
            return;
        }
        i12.c0 c0Var = new i12.c0(getContext(), this.f97847g);
        this.f97849i = c0Var;
        this.f97845e.setAdapter(c0Var);
        this.f97845e.setOffscreenPageLimit(1);
        androidx.viewpager.widget.ViewPager viewPager = this.f97845e;
        if (viewPager == null) {
            return;
        }
        viewPager.setCurrentItem(this.f97847g.size() * 30, false);
    }

    public void d(java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        r45.ij0 ij0Var;
        r45.ij0 ij0Var2;
        if (linkedList == null) {
            return;
        }
        java.util.LinkedList linkedList3 = this.f97847g;
        if (linkedList3 == null) {
            this.f97847g = new java.util.LinkedList();
        } else {
            linkedList3.clear();
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            r45.kj0 kj0Var = (r45.kj0) it.next();
            if (kj0Var != null && (ij0Var2 = kj0Var.f378726d) != null && !com.tencent.mm.sdk.platformtools.t8.K0(ij0Var2.f377094g)) {
                this.f97847g.add(new com.tencent.mm.plugin.emoji.model.b(null, kj0Var, true));
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.hj0 hj0Var = (r45.hj0) it6.next();
            if (hj0Var != null && (ij0Var = hj0Var.f376211e) != null && !com.tencent.mm.sdk.platformtools.t8.K0(ij0Var.f377094g)) {
                this.f97847g.add(new com.tencent.mm.plugin.emoji.model.b(hj0Var, null, false));
            }
        }
        synchronized (this) {
            if (this.f97847g == null) {
                throw new java.lang.IllegalAccessError("must has emoji baner list first");
            }
            if (this.f97848h == null) {
                b();
            }
            com.tencent.mm.ui.base.MMDotView mMDotView = this.f97844d;
            if (mMDotView != null) {
                java.util.LinkedList linkedList4 = this.f97847g;
                mMDotView.setDotCount(linkedList4 == null ? 0 : linkedList4.size());
                this.f97844d.setSelectedDot(0);
                this.f97844d.setVisibility(8);
            }
            c();
        }
    }

    public void e() {
        if (this.f97852o == null) {
            this.f97852o = new com.tencent.mm.plugin.emoji.ui.s3(this, null);
        }
        this.f97853p = true;
        this.f97852o.removeMessages(0);
        this.f97852o.sendEmptyMessageDelayed(0, 5000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 != 3) goto L18;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            int r1 = r9.getAction()
            float r2 = r9.getRawX()
            float r3 = r9.getRawY()
            r4 = 0
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L48
            if (r1 == r6) goto L39
            r7 = 2
            if (r1 == r7) goto L1d
            if (r1 == r5) goto L39
            goto L4c
        L1d:
            float r1 = r8.f97850m
            float r2 = r2 - r1
            int r1 = (int) r2
            float r2 = r8.f97851n
            float r3 = r3 - r2
            int r2 = (int) r3
            int r1 = java.lang.Math.abs(r1)
            int r2 = java.lang.Math.abs(r2)
            if (r1 <= r2) goto L4c
            android.view.ViewParent r1 = r8.getParent()
            if (r1 == 0) goto L4c
            r1.requestDisallowInterceptTouchEvent(r6)
            goto L4c
        L39:
            r1 = 0
            r8.f97850m = r1
            r8.f97851n = r1
            android.view.ViewParent r1 = r8.getParent()
            if (r1 == 0) goto L4c
            r1.requestDisallowInterceptTouchEvent(r4)
            goto L4c
        L48:
            r8.f97850m = r2
            r8.f97851n = r3
        L4c:
            if (r0 == 0) goto L57
            if (r0 == r6) goto L53
            if (r0 == r5) goto L53
            goto L63
        L53:
            r8.e()
            goto L63
        L57:
            com.tencent.mm.plugin.emoji.ui.s3 r0 = r8.f97852o
            if (r0 != 0) goto L5c
            goto L63
        L5c:
            r8.f97853p = r4
            com.tencent.mm.plugin.emoji.ui.s3 r0 = r8.f97852o
            r0.removeMessages(r4)
        L63:
            boolean r9 = super.onInterceptTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        java.util.LinkedList linkedList = this.f97847g;
        if (linkedList == null || linkedList.size() <= 1) {
            return;
        }
        if (i17 == 0 || i17 == this.f97849i.getCount() - 1) {
            this.f97848h.postDelayed(new com.tencent.mm.plugin.emoji.ui.r3(this), 350L);
        }
    }

    public EmojiStoreVpHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }
}
