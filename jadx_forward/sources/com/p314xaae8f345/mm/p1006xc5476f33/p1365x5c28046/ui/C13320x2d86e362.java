package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader */
/* loaded from: classes15.dex */
public class C13320x2d86e362 extends android.widget.LinearLayout implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f179376q = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce f179377d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f179378e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f179379f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f179380g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f179381h;

    /* renamed from: i, reason: collision with root package name */
    public i12.c0 f179382i;

    /* renamed from: m, reason: collision with root package name */
    public float f179383m;

    /* renamed from: n, reason: collision with root package name */
    public float f179384n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s3 f179385o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f179386p;

    public C13320x2d86e362(android.content.Context context) {
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
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a8r, null);
        this.f179381h = inflate;
        this.f179379f = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565742de2);
        this.f179377d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce) this.f179381h.findViewById(com.p314xaae8f345.mm.R.id.f565741de1);
        this.f179378e = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) this.f179381h.findViewById(com.p314xaae8f345.mm.R.id.f565743de3);
        this.f179385o = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s3(this, null);
        int i17 = ((a(getContext())[0] * 3) / 8) + 1;
        android.view.View view = this.f179379f;
        if (view != null) {
            view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i17));
        }
        addView(this.f179381h, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    public final void c() {
        java.util.LinkedList linkedList;
        if (this.f179378e == null || (linkedList = this.f179380g) == null) {
            return;
        }
        if (linkedList.size() <= 0) {
            android.view.View view = this.f179379f;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        android.view.View view2 = this.f179379f;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreVpHeader", "initViewPager", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f179378e.m8322x2d3430b4(this);
        if (this.f179382i != null) {
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q3(this));
            return;
        }
        i12.c0 c0Var = new i12.c0(getContext(), this.f179380g);
        this.f179382i = c0Var;
        this.f179378e.m8315x6cab2c8d(c0Var);
        this.f179378e.m8321x40341e13(1);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f179378e;
        if (c1190x18d3c3fe == null) {
            return;
        }
        c1190x18d3c3fe.m8317x940d026a(this.f179380g.size() * 30, false);
    }

    public void d(java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        r45.ij0 ij0Var;
        r45.ij0 ij0Var2;
        if (linkedList == null) {
            return;
        }
        java.util.LinkedList linkedList3 = this.f179380g;
        if (linkedList3 == null) {
            this.f179380g = new java.util.LinkedList();
        } else {
            linkedList3.clear();
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            r45.kj0 kj0Var = (r45.kj0) it.next();
            if (kj0Var != null && (ij0Var2 = kj0Var.f460259d) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ij0Var2.f458627g)) {
                this.f179380g.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b(null, kj0Var, true));
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            r45.hj0 hj0Var = (r45.hj0) it6.next();
            if (hj0Var != null && (ij0Var = hj0Var.f457744e) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ij0Var.f458627g)) {
                this.f179380g.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b(hj0Var, null, false));
            }
        }
        synchronized (this) {
            if (this.f179380g == null) {
                throw new java.lang.IllegalAccessError("must has emoji baner list first");
            }
            if (this.f179381h == null) {
                b();
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce c21487xa86ce1ce = this.f179377d;
            if (c21487xa86ce1ce != null) {
                java.util.LinkedList linkedList4 = this.f179380g;
                c21487xa86ce1ce.m78919xc4325fc8(linkedList4 == null ? 0 : linkedList4.size());
                this.f179377d.m78922x7d600aec(0);
                this.f179377d.setVisibility(8);
            }
            c();
        }
    }

    public void e() {
        if (this.f179385o == null) {
            this.f179385o = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s3(this, null);
        }
        this.f179386p = true;
        this.f179385o.mo50303x856b99f0(0);
        this.f179385o.mo50307xb9e94560(0, 5000L);
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
            float r1 = r8.f179383m
            float r2 = r2 - r1
            int r1 = (int) r2
            float r2 = r8.f179384n
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
            r8.f179383m = r1
            r8.f179384n = r1
            android.view.ViewParent r1 = r8.getParent()
            if (r1 == 0) goto L4c
            r1.requestDisallowInterceptTouchEvent(r4)
            goto L4c
        L48:
            r8.f179383m = r2
            r8.f179384n = r3
        L4c:
            if (r0 == 0) goto L57
            if (r0 == r6) goto L53
            if (r0 == r5) goto L53
            goto L63
        L53:
            r8.e()
            goto L63
        L57:
            com.tencent.mm.plugin.emoji.ui.s3 r0 = r8.f179385o
            if (r0 != 0) goto L5c
            goto L63
        L5c:
            r8.f179386p = r4
            com.tencent.mm.plugin.emoji.ui.s3 r0 = r8.f179385o
            r0.mo50303x856b99f0(r4)
        L63:
            boolean r9 = super.onInterceptTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        java.util.LinkedList linkedList = this.f179380g;
        if (linkedList == null || linkedList.size() <= 1) {
            return;
        }
        if (i17 == 0 || i17 == this.f179382i.mo8338x7444f759() - 1) {
            this.f179381h.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.r3(this), 350L);
        }
    }

    public C13320x2d86e362(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }
}
