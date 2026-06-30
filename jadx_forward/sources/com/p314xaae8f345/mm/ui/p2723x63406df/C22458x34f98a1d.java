package com.p314xaae8f345.mm.ui.p2723x63406df;

/* renamed from: com.tencent.mm.ui.mogic.WxViewPager */
/* loaded from: classes15.dex */
public class C22458x34f98a1d extends android.view.ViewGroup {

    /* renamed from: CLOSE_ENOUGH */
    private static final int f39607xc78d11b7 = 2;

    /* renamed from: DEBUG */
    private static final boolean f39609x3de9e33 = false;

    /* renamed from: DEFAULT_GUTTER_SIZE */
    private static final int f39610xea30cb87 = 16;

    /* renamed from: DEFAULT_OFFSCREEN_PAGES */
    private static final int f39611x30f616c2 = 1;

    /* renamed from: DRAW_ORDER_DEFAULT */
    private static final int f39612xb54cfa55 = 0;

    /* renamed from: DRAW_ORDER_FORWARD */
    private static final int f39613x30dcb6d9 = 1;

    /* renamed from: DRAW_ORDER_REVERSE */
    private static final int f39614x9ac776f6 = 2;

    /* renamed from: INVALID_POINTER */
    private static final int f39615x63c227b5 = -1;

    /* renamed from: MAX_SETTLE_DURATION */
    private static final int f39617xca02a50d = 600;

    /* renamed from: MIN_DISTANCE_FOR_FLING */
    private static final int f39618xcb872989 = 25;

    /* renamed from: MIN_FLING_VELOCITY */
    private static final int f39619xc7b0c62d = 400;

    /* renamed from: SCROLL_STATE_DRAGGING */
    public static final int f39620xa773a10f = 1;

    /* renamed from: SCROLL_STATE_IDLE */
    public static final int f39621x1591eb94 = 0;

    /* renamed from: SCROLL_STATE_SETTLING */
    public static final int f39622x2f19cb08 = 2;
    private static final java.lang.String TAG = "WxViewPager";

    /* renamed from: USE_CACHE */
    private static final boolean f39623xd0b37a8a = false;

    /* renamed from: enableChildScroll */
    public boolean f39626x1148586;

    /* renamed from: listeners */
    private java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> f39627xb75bd23f;

    /* renamed from: mActivePointerId */
    private int f39628x46f103a5;

    /* renamed from: mAdapter */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.a f39629x59855622;

    /* renamed from: mAdapterChangeListener */
    private ii5.i f39630x75194b46;

    /* renamed from: mBottomPageBounds */
    private int f39631x4399a53c;

    /* renamed from: mCalledSuper */
    private boolean f39632xbc724f51;

    /* renamed from: mChildHeightMeasureSpec */
    private int f39633x3b186da3;

    /* renamed from: mChildWidthMeasureSpec */
    private int f39634x608ebb62;

    /* renamed from: mCloseEnough */
    private int f39635x9c234adb;

    /* renamed from: mCurItem */
    private int f39636xe1320446;

    /* renamed from: mDecorChildCount */
    private int f39637xac79286b;

    /* renamed from: mDefaultGutterSize */
    private int f39638x797acbf0;

    /* renamed from: mDrawingOrder */
    private int f39639x6d0f5edd;

    /* renamed from: mDrawingOrderedChildren */
    private java.util.ArrayList<android.view.View> f39640xdbd9ee5b;

    /* renamed from: mEndScrollRunnable */
    private final java.lang.Runnable f39641xbb46c1d8;

    /* renamed from: mExpectedAdapterCount */
    private int f39642x837879e5;

    /* renamed from: mFakeDragBeginTime */
    private long f39643x97a88200;

    /* renamed from: mFakeDragging */
    private boolean f39644x7e6f0cd1;

    /* renamed from: mFirstLayout */
    private boolean f39645x5f7f074d;

    /* renamed from: mFirstOffset */
    private float f39646x64db70b6;

    /* renamed from: mFlingDistance */
    private int f39647x6824ea04;

    /* renamed from: mGutterSize */
    private int f39648xa627a809;

    /* renamed from: mIgnoreGutter */
    private boolean f39649x899b3e9a;

    /* renamed from: mInLayout */
    private boolean f39650x2866c3c;

    /* renamed from: mInitialMotionX */
    private float f39651xa6bf8d4b;

    /* renamed from: mInitialMotionY */
    private float f39652xa6bf8d4c;

    /* renamed from: mInternalPageChangeListener */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f39653x41b180dd;

    /* renamed from: mIsBeingDragged */
    private boolean f39654x11e573ea;

    /* renamed from: mIsUnableToDrag */
    private boolean f39655xf135efb9;

    /* renamed from: mItems */
    private final java.util.ArrayList<ii5.g> f39656xbe3b3353;

    /* renamed from: mLastMotionX */
    private float f39657x6460593f;

    /* renamed from: mLastMotionY */
    private float f39658x64605940;

    /* renamed from: mLastOffset */
    private float f39659x48321316;

    /* renamed from: mLeftEdge */
    private p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i f39660x8b63cdf1;

    /* renamed from: mMarginDrawable */
    private android.graphics.drawable.Drawable f39661xa104e639;

    /* renamed from: mMaximumVelocity */
    private int f39662x4b9066f0;

    /* renamed from: mMinimumVelocity */
    private int f39663x96072de;

    /* renamed from: mNeedCalculatePageOffsets */
    private boolean f39664x749760ae;

    /* renamed from: mObserver */
    private ii5.j f39665x39c4fa63;

    /* renamed from: mOffscreenPageLimit */
    private int f39666x94fb955e;

    /* renamed from: mOnPageChangeListener */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f39667x6dfb013f;

    /* renamed from: mPageMargin */
    private int f39668x1da1656a;

    /* renamed from: mPageTransformer */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.m f39669xa0bee2dd;

    /* renamed from: mPopulatePending */
    private boolean f39670xb20bed20;

    /* renamed from: mRestoredAdapterState */
    private android.os.Parcelable f39671xeab7c945;

    /* renamed from: mRestoredClassLoader */
    private java.lang.ClassLoader f39672x50c08888;

    /* renamed from: mRestoredCurItem */
    private int f39673xa26404d0;

    /* renamed from: mRightEdge */
    private p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i f39674x1d29800c;

    /* renamed from: mScrollState */
    private int f39675x24803717;

    /* renamed from: mScroller */
    private android.widget.Scroller f39676xd051bc7;

    /* renamed from: mScrollingCacheEnabled */
    private boolean f39677xf2ed5187;

    /* renamed from: mSetChildrenDrawingOrderEnabled */
    private java.lang.reflect.Method f39678x896cd4dd;

    /* renamed from: mTempItem */
    private final ii5.g f39679xd628d094;

    /* renamed from: mTempRect */
    private final android.graphics.Rect f39680xd62caf65;

    /* renamed from: mTopPageBounds */
    private int f39681x8ec49dec;

    /* renamed from: mTouchSlop */
    private int f39682x9065cfec;

    /* renamed from: mVelocityTracker */
    private android.view.VelocityTracker f39683x7f399f6e;

    /* renamed from: LAYOUT_ATTRS */
    private static final int[] f39616x449c372d = {android.R.attr.layout_gravity};

    /* renamed from: COMPARATOR */
    private static final java.util.Comparator<ii5.g> f39608xea9138d6 = new ii5.d();

    /* renamed from: sInterpolator */
    private static final android.view.animation.Interpolator f39624xab9988da = new ii5.e();

    /* renamed from: sPositionComparator */
    private static final com.p314xaae8f345.mm.ui.p2723x63406df.b f39625xbb4ec8b2 = new com.p314xaae8f345.mm.ui.p2723x63406df.b();

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.SavedState> f39684x681a0c0c = new j3.r(new com.p314xaae8f345.mm.ui.p2723x63406df.a());

        /* renamed from: d, reason: collision with root package name */
        public int f290782d;

        /* renamed from: e, reason: collision with root package name */
        public android.os.Parcelable f290783e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.ClassLoader f290784f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f290782d = parcel.readInt();
            this.f290783e = parcel.readParcelable(classLoader);
            this.f290784f = classLoader;
        }

        /* renamed from: toString */
        public java.lang.String m80864x9616526c() {
            return "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.f290782d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f290782d);
            parcel.writeParcelable(this.f290783e, i17);
        }
    }

    public C22458x34f98a1d(android.content.Context context) {
        super(context);
        this.f39656xbe3b3353 = new java.util.ArrayList<>();
        this.f39679xd628d094 = new ii5.g();
        this.f39680xd62caf65 = new android.graphics.Rect();
        this.f39673xa26404d0 = -1;
        this.f39671xeab7c945 = null;
        this.f39672x50c08888 = null;
        this.f39646x64db70b6 = -3.4028235E38f;
        this.f39659x48321316 = Float.MAX_VALUE;
        this.f39666x94fb955e = 1;
        this.f39628x46f103a5 = -1;
        this.f39645x5f7f074d = true;
        this.f39664x749760ae = false;
        this.f39626x1148586 = true;
        this.f39641xbb46c1d8 = new ii5.f(this);
        this.f39675x24803717 = 0;
        this.f39627xb75bd23f = new java.util.ArrayList();
        m80836xfdfb10ee();
    }

    /* renamed from: getClientWidth */
    private int m80817xcf063785() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setScrollState */
    public void m80818xeaaee002(int i17) {
        if (this.f39675x24803717 == i17) {
            return;
        }
        this.f39675x24803717 = i17;
        if (this.f39669xa0bee2dd != null) {
            boolean z17 = i17 != 0;
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                int i19 = z17 ? 2 : 0;
                android.view.View childAt = getChildAt(i18);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                childAt.setLayerType(i19, null);
            }
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = this.f39667x6dfb013f;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8331xcb2941fe(i17);
        }
        java.util.Iterator<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> it = this.f39627xb75bd23f.iterator();
        while (it.hasNext()) {
            it.next().mo8331xcb2941fe(i17);
        }
    }

    /* renamed from: setScrollingCacheEnabled */
    private void m80819x1ada10b2(boolean z17) {
        if (this.f39677xf2ed5187 != z17) {
            this.f39677xf2ed5187 = z17;
        }
    }

    public final void a(boolean z17) {
        boolean z18 = this.f39675x24803717 == 2;
        if (z18) {
            m80819x1ada10b2(false);
            this.f39676xd051bc7.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f39676xd051bc7.getCurrX();
            int currY = this.f39676xd051bc7.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f39670xb20bed20 = false;
        for (int i17 = 0; i17 < this.f39656xbe3b3353.size(); i17++) {
            ii5.g gVar = this.f39656xbe3b3353.get(i17);
            if (gVar.f373192c) {
                gVar.f373192c = false;
                z18 = true;
            }
        }
        if (z18) {
            if (!z17) {
                this.f39641xbb46c1d8.run();
                return;
            }
            java.lang.Runnable runnable = this.f39641xbb46c1d8;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(this, runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i17, int i18) {
        ii5.g m80834xdee048a1;
        iz5.a.d(null, arrayList);
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                android.view.View childAt = getChildAt(i19);
                if (childAt.getVisibility() == 0 && (m80834xdee048a1 = m80834xdee048a1(childAt)) != null && m80834xdee048a1.f373191b == this.f39636xe1320446) {
                    childAt.addFocusables(arrayList, i17, i18);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i18 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    /* renamed from: addNewItem */
    public ii5.g m80820xdfb420f2(int i17, int i18) {
        ii5.g gVar = new ii5.g();
        gVar.f373191b = i17;
        gVar.f373190a = this.f39629x59855622.mo7744x8d1aed1d((android.view.ViewGroup) this, i17);
        gVar.f373193d = this.f39629x59855622.m8341x33a68dc1(i17);
        if (i18 < 0 || i18 >= this.f39656xbe3b3353.size()) {
            this.f39656xbe3b3353.add(gVar);
        } else {
            this.f39656xbe3b3353.add(i18, gVar);
        }
        return gVar;
    }

    /* renamed from: addOnPageChangeListener */
    public void m80821xa5a25773(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        if (this.f39627xb75bd23f.contains(onPageChangeListener)) {
            return;
        }
        this.f39627xb75bd23f.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> arrayList) {
        ii5.g m80834xdee048a1;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (m80834xdee048a1 = m80834xdee048a1(childAt)) != null && m80834xdee048a1.f373191b == this.f39636xe1320446) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        iz5.a.d(null, layoutParams);
        com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams layoutParams2 = (com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) layoutParams;
        boolean z17 = layoutParams2.f290776a | false;
        layoutParams2.f290776a = z17;
        if (!this.f39650x2866c3c) {
            super.addView(view, i17, layoutParams);
        } else {
            if (z17) {
                throw new java.lang.IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f290779d = true;
            addViewInLayout(view, i17, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* renamed from: arrowScroll */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m80822x6ec85c36(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L41
        Lb:
            if (r0 == 0) goto L41
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L9
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L41:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L92
            if (r3 == r0) goto L92
            if (r7 != r5) goto L72
            android.graphics.Rect r1 = r6.f39680xd62caf65
            android.graphics.Rect r1 = r6.f(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f39680xd62caf65
            android.graphics.Rect r2 = r6.f(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L6c
            if (r1 < r2) goto L6c
            boolean r0 = r6.m80838x33369736()
            goto L70
        L6c:
            boolean r0 = r3.requestFocus()
        L70:
            r2 = r0
            goto La5
        L72:
            if (r7 != r4) goto La5
            android.graphics.Rect r1 = r6.f39680xd62caf65
            android.graphics.Rect r1 = r6.f(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f39680xd62caf65
            android.graphics.Rect r2 = r6.f(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8d
            if (r1 > r2) goto L8d
            boolean r0 = r6.m80839x33f2b0cd()
            goto L70
        L8d:
            boolean r0 = r3.requestFocus()
            goto L70
        L92:
            if (r7 == r5) goto La1
            if (r7 != r1) goto L97
            goto La1
        L97:
            if (r7 == r4) goto L9c
            r0 = 2
            if (r7 != r0) goto La5
        L9c:
            boolean r2 = r6.m80839x33f2b0cd()
            goto La5
        La1:
            boolean r2 = r6.m80838x33369736()
        La5:
            if (r2 == 0) goto Lae
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80822x6ec85c36(int):boolean");
    }

    public final int b(int i17, float f17, int i18, int i19) {
        if (java.lang.Math.abs(i19) <= this.f39647x6824ea04 || java.lang.Math.abs(i18) <= this.f39663x96072de) {
            i17 = (int) (i17 + f17 + (i17 >= this.f39636xe1320446 ? 0.6f : 0.4f));
        } else if (i18 <= 0) {
            i17++;
        }
        return this.f39656xbe3b3353.size() > 0 ? java.lang.Math.max(mo79157x9692759b(), java.lang.Math.min(i17, mo79163x1da6eff5())) : i17;
    }

    /* renamed from: beginFakeDrag */
    public boolean m80823x55dee9f2() {
        if (this.f39654x11e573ea) {
            return false;
        }
        this.f39644x7e6f0cd1 = true;
        m80818xeaaee002(1);
        this.f39657x6460593f = 0.0f;
        this.f39651xa6bf8d4b = 0.0f;
        android.view.VelocityTracker velocityTracker = this.f39683x7f399f6e;
        if (velocityTracker == null) {
            this.f39683x7f399f6e = android.view.VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f39683x7f399f6e.addMovement(obtain);
        obtain.recycle();
        this.f39643x97a88200 = uptimeMillis;
        return true;
    }

    public final void c() {
        this.f39654x11e573ea = false;
        this.f39655xf135efb9 = false;
        this.f39649x899b3e9a = false;
        android.view.VelocityTracker velocityTracker = this.f39683x7f399f6e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f39683x7f399f6e = null;
        }
    }

    /* renamed from: canScroll */
    public boolean mo67173x10136bd(android.view.View view, boolean z17, int i17, int i18, int i19) {
        int i27;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i28 = i18 + scrollX;
                if (i28 >= childAt.getLeft() && i28 < childAt.getRight() && (i27 = i19 + scrollY) >= childAt.getTop() && i27 < childAt.getBottom() && mo67173x10136bd(childAt, true, i17, i28 - childAt.getLeft(), i27 - childAt.getTop()) && childAt.isEnabled()) {
                    if (this.f39626x1148586) {
                        return true;
                    }
                }
            }
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (view.canScrollHorizontally(-i17)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        if (this.f39629x59855622 == null) {
            return false;
        }
        int m80817xcf063785 = m80817xcf063785();
        int scrollX = getScrollX();
        return i17 < 0 ? scrollX > ((int) (((float) m80817xcf063785) * this.f39646x64db70b6)) : i17 > 0 && scrollX < ((int) (((float) m80817xcf063785) * this.f39659x48321316));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f39676xd051bc7.isFinished() || !this.f39676xd051bc7.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f39676xd051bc7.getCurrX();
        int currY = this.f39676xd051bc7.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!j(currX)) {
                this.f39676xd051bc7.abortAnimation();
                scrollTo(0, currY);
            }
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(this);
    }

    /* renamed from: dataSetChanged */
    public void m80824xd58aab3c() {
        int mo8338x7444f759 = this.f39629x59855622.mo8338x7444f759();
        this.f39642x837879e5 = mo8338x7444f759;
        boolean z17 = this.f39656xbe3b3353.size() < (this.f39666x94fb955e * 2) + 1 && this.f39656xbe3b3353.size() < mo8338x7444f759;
        int i17 = this.f39636xe1320446;
        int i18 = 0;
        boolean z18 = false;
        while (i18 < this.f39656xbe3b3353.size()) {
            ii5.g gVar = this.f39656xbe3b3353.get(i18);
            int mo8339xb2fa47d2 = this.f39629x59855622.mo8339xb2fa47d2(gVar.f373190a);
            if (mo8339xb2fa47d2 != -1) {
                if (mo8339xb2fa47d2 == -2) {
                    this.f39656xbe3b3353.remove(i18);
                    i18--;
                    if (!z18) {
                        this.f39629x59855622.mo7749x93ef97cb((android.view.ViewGroup) this);
                        z18 = true;
                    }
                    this.f39629x59855622.mo7741x89d2022d((android.view.ViewGroup) this, gVar.f373191b, gVar.f373190a);
                    int i19 = this.f39636xe1320446;
                    if (i19 == gVar.f373191b) {
                        i17 = java.lang.Math.max(0, java.lang.Math.min(i19, mo8338x7444f759 - 1));
                    }
                } else {
                    int i27 = gVar.f373191b;
                    if (i27 != mo8339xb2fa47d2) {
                        if (i27 == this.f39636xe1320446) {
                            i17 = mo8339xb2fa47d2;
                        }
                        gVar.f373191b = mo8339xb2fa47d2;
                    }
                }
                z17 = true;
            }
            i18++;
        }
        if (z18) {
            this.f39629x59855622.mo7742xa949b73c((android.view.ViewGroup) this);
        }
        java.util.Collections.sort(this.f39656xbe3b3353, f39608xea9138d6);
        if (z17) {
            int childCount = getChildCount();
            for (int i28 = 0; i28 < childCount; i28++) {
                com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams layoutParams = (com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) getChildAt(i28).getLayoutParams();
                if (!layoutParams.f290776a) {
                    layoutParams.f290778c = 0.0f;
                }
            }
            m80847x4a1b2347(i17, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m80827xc4041e10(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        ii5.g m80834xdee048a1;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (m80834xdee048a1 = m80834xdee048a1(childAt)) != null && m80834xdee048a1.f373191b == this.f39636xe1320446 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: distanceInfluenceForSnapDuration */
    public float m80825x52ac447(float f17) {
        return (float) java.lang.Math.sin((float) ((f17 - 0.5f) * 0.4712389167638204d));
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar;
        super.draw(canvas);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int overScrollMode = getOverScrollMode();
        boolean z17 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f39629x59855622) != null && aVar.mo8338x7444f759() > 1)) {
            if (!this.f39660x8b63cdf1.b()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f39646x64db70b6 * width);
                this.f39660x8b63cdf1.f92635a.setSize(height, width);
                z17 = false | this.f39660x8b63cdf1.f92635a.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f39674x1d29800c.b()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f39659x48321316 + 1.0f)) * width2);
                this.f39674x1d29800c.f92635a.setSize(height2, width2);
                z17 |= this.f39674x1d29800c.f92635a.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f39660x8b63cdf1.f92635a.finish();
            this.f39674x1d29800c.f92635a.finish();
        }
        if (z17) {
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f39661xa104e639;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: endFakeDrag */
    public void m80826xcf99a824() {
        if (!this.f39644x7e6f0cd1) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        android.view.VelocityTracker velocityTracker = this.f39683x7f399f6e;
        velocityTracker.computeCurrentVelocity(1000, this.f39662x4b9066f0);
        int xVelocity = (int) velocityTracker.getXVelocity(this.f39628x46f103a5);
        this.f39670xb20bed20 = true;
        int m80817xcf063785 = m80817xcf063785();
        int scrollX = getScrollX();
        ii5.g g17 = g();
        if (g17 != null) {
            m80848x4a1b2347(b(g17.f373191b, ((scrollX / m80817xcf063785) - g17.f373194e) / g17.f373193d, xVelocity, (int) (this.f39657x6460593f - this.f39651xa6bf8d4b)), true, true, xVelocity);
        }
        c();
        this.f39644x7e6f0cd1 = false;
    }

    /* renamed from: executeKeyEvent */
    public boolean m80827xc4041e10(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return m80822x6ec85c36(17);
            }
            if (keyCode == 22) {
                return m80822x6ec85c36(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m80822x6ec85c36(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m80822x6ec85c36(1);
                }
            }
        }
        return false;
    }

    public final android.graphics.Rect f(android.graphics.Rect rect, android.view.View view) {
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        android.view.ViewParent parent = view.getParent();
        while ((parent instanceof android.view.ViewGroup) && parent != this) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: fakeDragBy */
    public void m80828x47a1e860(float f17) {
        if (!this.f39644x7e6f0cd1) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.f39657x6460593f += f17;
        float scrollX = getScrollX() - f17;
        float m80817xcf063785 = m80817xcf063785();
        float f18 = this.f39646x64db70b6 * m80817xcf063785;
        float f19 = this.f39659x48321316 * m80817xcf063785;
        ii5.g gVar = this.f39656xbe3b3353.get(0);
        ii5.g gVar2 = this.f39656xbe3b3353.get(r4.size() - 1);
        if (gVar.f373191b != 0) {
            f18 = gVar.f373194e * m80817xcf063785;
        }
        if (gVar2.f373191b != this.f39629x59855622.mo8338x7444f759() - 1) {
            f19 = gVar2.f373194e * m80817xcf063785;
        }
        if (scrollX < f18) {
            scrollX = f18;
        } else if (scrollX > f19) {
            scrollX = f19;
        }
        int i17 = (int) scrollX;
        this.f39657x6460593f += scrollX - i17;
        scrollTo(i17, getScrollY());
        j(i17);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(this.f39643x97a88200, android.os.SystemClock.uptimeMillis(), 2, this.f39657x6460593f, 0.0f, 0);
        this.f39683x7f399f6e.addMovement(obtain);
        obtain.recycle();
    }

    /* renamed from: firstItemPosForDetermine */
    public int mo79157x9692759b() {
        return this.f39656xbe3b3353.get(0).f373191b;
    }

    public final ii5.g g() {
        int i17;
        int m80817xcf063785 = m80817xcf063785();
        float f17 = 0.0f;
        float scrollX = m80817xcf063785 > 0 ? getScrollX() / m80817xcf063785 : 0.0f;
        float f18 = m80817xcf063785 > 0 ? this.f39668x1da1656a / m80817xcf063785 : 0.0f;
        int i18 = 0;
        boolean z17 = true;
        ii5.g gVar = null;
        int i19 = -1;
        float f19 = 0.0f;
        while (i18 < this.f39656xbe3b3353.size()) {
            ii5.g gVar2 = this.f39656xbe3b3353.get(i18);
            if (!z17 && gVar2.f373191b != (i17 = i19 + 1)) {
                gVar2 = this.f39679xd628d094;
                gVar2.f373194e = f17 + f19 + f18;
                gVar2.f373191b = i17;
                gVar2.f373193d = this.f39629x59855622.m8341x33a68dc1(i17);
                i18--;
            }
            ii5.g gVar3 = gVar2;
            f17 = gVar3.f373194e;
            float f27 = gVar3.f373193d + f17 + f18;
            if (!z17 && scrollX < f17) {
                return gVar;
            }
            if (scrollX < f27 || i18 == this.f39656xbe3b3353.size() - 1) {
                return gVar3;
            }
            int i27 = gVar3.f373191b;
            float f28 = gVar3.f373193d;
            i18++;
            z17 = false;
            i19 = i27;
            f19 = f28;
            gVar = gVar3;
        }
        return gVar;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* renamed from: getAdapter */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.a m80829xf939df19() {
        return this.f39629x59855622;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        if (this.f39639x6d0f5edd == 2) {
            i18 = (i17 - 1) - i18;
        }
        return ((com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) this.f39640xdbd9ee5b.get(i18).getLayoutParams()).f290781f;
    }

    /* renamed from: getCurrentItem */
    public int m80830xfda78ef6() {
        return this.f39636xe1320446;
    }

    /* renamed from: getOffscreenPageLimit */
    public int m80831xa9089c07() {
        return this.f39666x94fb955e;
    }

    /* renamed from: getPageMargin */
    public int m80832x2fb02513() {
        return this.f39668x1da1656a;
    }

    public final void h(int i17) {
        java.util.Iterator<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> it = this.f39627xb75bd23f.iterator();
        while (it.hasNext()) {
            it.next().mo8333x510f45c9(i17);
        }
    }

    public final void i(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f39628x46f103a5) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.f39657x6460593f = motionEvent.getX(i17);
            this.f39628x46f103a5 = motionEvent.getPointerId(i17);
            android.view.VelocityTracker velocityTracker = this.f39683x7f399f6e;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: infoForAnyChild */
    public ii5.g m80833xdcd620eb(android.view.View view) {
        while (true) {
            java.lang.Object parent = view.getParent();
            if (parent == this) {
                return m80834xdee048a1(view);
            }
            if (parent == null || !(parent instanceof android.view.View)) {
                return null;
            }
            view = (android.view.View) parent;
        }
    }

    /* renamed from: infoForChild */
    public ii5.g m80834xdee048a1(android.view.View view) {
        for (int i17 = 0; i17 < this.f39656xbe3b3353.size(); i17++) {
            ii5.g gVar = this.f39656xbe3b3353.get(i17);
            if (this.f39629x59855622.mo7745xc5a713d8(view, gVar.f373190a)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: infoForPosition */
    public ii5.g m80835x1fcddb84(int i17) {
        for (int i18 = 0; i18 < this.f39656xbe3b3353.size(); i18++) {
            ii5.g gVar = this.f39656xbe3b3353.get(i18);
            if (gVar.f373191b == i17) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: initViewPager */
    public void m80836xfdfb10ee() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        android.content.Context context = getContext();
        this.f39676xd051bc7 = new android.widget.Scroller(context, f39624xab9988da);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f17 = context.getResources().getDisplayMetrics().density;
        java.lang.reflect.Method method = n3.o1.f415911a;
        this.f39682x9065cfec = viewConfiguration.getScaledPagingTouchSlop();
        this.f39663x96072de = (int) (400.0f * f17);
        this.f39662x4b9066f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f39660x8b63cdf1 = new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i(context);
        this.f39674x1d29800c = new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i(context);
        this.f39647x6824ea04 = (int) (25.0f * f17);
        this.f39635x9c234adb = (int) (2.0f * f17);
        this.f39638x797acbf0 = (int) (f17 * 16.0f);
        n3.l1.l(this, new ii5.h(this));
        if (n3.u0.c(this) == 0) {
            n3.u0.s(this, 1);
        }
    }

    /* renamed from: isFakeDragging */
    public boolean m80837xb978e60e() {
        return this.f39644x7e6f0cd1;
    }

    /* renamed from: isGutterDrag */
    public boolean mo78872x4b59f9b9(float f17, float f18) {
        return (f17 < ((float) this.f39648xa627a809) && f18 > 0.0f) || (f17 > ((float) (getWidth() - this.f39648xa627a809)) && f18 < 0.0f);
    }

    public final boolean j(int i17) {
        if (this.f39656xbe3b3353.size() == 0) {
            this.f39632xbc724f51 = false;
            mo63668xf210c75a(0, 0.0f, 0);
            if (this.f39632xbc724f51) {
                return false;
            }
            throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ii5.g g17 = g();
        if (g17 == null) {
            return false;
        }
        int m80817xcf063785 = m80817xcf063785();
        int i18 = this.f39668x1da1656a;
        int i19 = m80817xcf063785 + i18;
        float f17 = m80817xcf063785;
        int i27 = g17.f373191b;
        float f18 = ((i17 / f17) - g17.f373194e) / (g17.f373193d + (i18 / f17));
        this.f39632xbc724f51 = false;
        mo63668xf210c75a(i27, f18, (int) (i19 * f18));
        if (this.f39632xbc724f51) {
            return true;
        }
        throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean k(float f17) {
        boolean z17;
        boolean z18;
        float f18 = this.f39657x6460593f - f17;
        this.f39657x6460593f = f17;
        float scrollX = getScrollX() + f18;
        float m80817xcf063785 = m80817xcf063785();
        float f19 = this.f39646x64db70b6 * m80817xcf063785;
        float f27 = this.f39659x48321316 * m80817xcf063785;
        boolean z19 = false;
        ii5.g gVar = this.f39656xbe3b3353.get(0);
        java.util.ArrayList<ii5.g> arrayList = this.f39656xbe3b3353;
        ii5.g gVar2 = arrayList.get(arrayList.size() - 1);
        if (gVar.f373191b != 0) {
            f19 = gVar.f373194e * m80817xcf063785;
            z17 = false;
        } else {
            z17 = true;
        }
        if (gVar2.f373191b != this.f39629x59855622.mo8338x7444f759() - 1) {
            f27 = gVar2.f373194e * m80817xcf063785;
            z18 = false;
        } else {
            z18 = true;
        }
        if (scrollX < f19) {
            if (z17) {
                this.f39660x8b63cdf1.c(java.lang.Math.abs(f19 - scrollX) / m80817xcf063785);
                z19 = true;
            }
            scrollX = f19;
        } else if (scrollX > f27) {
            if (z18) {
                this.f39674x1d29800c.c(java.lang.Math.abs(scrollX - f27) / m80817xcf063785);
                z19 = true;
            }
            scrollX = f27;
        }
        int i17 = (int) scrollX;
        this.f39657x6460593f += scrollX - i17;
        scrollTo(i17, getScrollY());
        j(i17);
        return z19;
    }

    public final void l(int i17, int i18, int i19, int i27) {
        if (i18 <= 0 || this.f39656xbe3b3353.isEmpty()) {
            ii5.g m80835x1fcddb84 = m80835x1fcddb84(this.f39636xe1320446);
            int min = (int) ((m80835x1fcddb84 != null ? java.lang.Math.min(m80835x1fcddb84.f373194e, this.f39659x48321316) : 0.0f) * ((i17 - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int scrollX = (int) ((getScrollX() / (((i18 - getPaddingLeft()) - getPaddingRight()) + i27)) * (((i17 - getPaddingLeft()) - getPaddingRight()) + i19));
        scrollTo(scrollX, getScrollY());
        if (this.f39676xd051bc7.isFinished()) {
            return;
        }
        int duration = this.f39676xd051bc7.getDuration() - this.f39676xd051bc7.timePassed();
        ii5.g m80835x1fcddb842 = m80835x1fcddb84(this.f39636xe1320446);
        if (m80835x1fcddb842 != null) {
            this.f39676xd051bc7.startScroll(scrollX, 0, (int) (m80835x1fcddb842.f373194e * i17), 0, duration);
        }
    }

    /* renamed from: lastItemPosForDetermine */
    public int mo79163x1da6eff5() {
        return this.f39656xbe3b3353.get(r0.size() - 1).f373191b;
    }

    public final void n(int i17, boolean z17, int i18, boolean z18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener2;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener3;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener4;
        ii5.g m80835x1fcddb84 = m80835x1fcddb84(i17);
        int m80817xcf063785 = m80835x1fcddb84 != null ? (int) (m80817xcf063785() * java.lang.Math.max(this.f39646x64db70b6, java.lang.Math.min(m80835x1fcddb84.f373194e, this.f39659x48321316))) : 0;
        if (z17) {
            m80862xc291bdf6(m80817xcf063785, 0, i18);
            if (z18 && (onPageChangeListener4 = this.f39667x6dfb013f) != null) {
                onPageChangeListener4.mo8333x510f45c9(i17);
            }
            if (z18 && (onPageChangeListener3 = this.f39653x41b180dd) != null) {
                onPageChangeListener3.mo8333x510f45c9(i17);
            }
            if (z18) {
                h(i17);
                return;
            }
            return;
        }
        if (z18 && (onPageChangeListener2 = this.f39667x6dfb013f) != null) {
            onPageChangeListener2.mo8333x510f45c9(i17);
        }
        if (z18 && (onPageChangeListener = this.f39653x41b180dd) != null) {
            onPageChangeListener.mo8333x510f45c9(i17);
        }
        if (z18) {
            h(i17);
        }
        a(false);
        scrollTo(m80817xcf063785, 0);
        j(m80817xcf063785);
    }

    public final void o() {
        if (this.f39639x6d0f5edd != 0) {
            java.util.ArrayList<android.view.View> arrayList = this.f39640xdbd9ee5b;
            if (arrayList == null) {
                this.f39640xdbd9ee5b = new java.util.ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                this.f39640xdbd9ee5b.add(getChildAt(i17));
            }
            java.util.Collections.sort(this.f39640xdbd9ee5b, f39625xbb4ec8b2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39645x5f7f074d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f39641xbb46c1d8);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        float f17;
        float f18;
        super.onDraw(canvas);
        if (this.f39668x1da1656a <= 0 || this.f39661xa104e639 == null || this.f39656xbe3b3353.size() <= 0 || this.f39629x59855622 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f19 = this.f39668x1da1656a / width;
        int i18 = 0;
        ii5.g gVar = this.f39656xbe3b3353.get(0);
        float f27 = gVar.f373194e;
        int size = this.f39656xbe3b3353.size();
        int i19 = gVar.f373191b;
        int i27 = this.f39656xbe3b3353.get(size - 1).f373191b;
        while (i19 < i27) {
            while (true) {
                i17 = gVar.f373191b;
                if (i19 <= i17 || i18 >= size) {
                    break;
                }
                i18++;
                gVar = this.f39656xbe3b3353.get(i18);
            }
            if (i19 == i17) {
                float f28 = gVar.f373194e;
                float f29 = gVar.f373193d;
                f17 = (f28 + f29) * width;
                f27 = f28 + f29 + f19;
            } else {
                float m8341x33a68dc1 = this.f39629x59855622.m8341x33a68dc1(i19);
                f17 = (f27 + m8341x33a68dc1) * width;
                f27 += m8341x33a68dc1 + f19;
            }
            if (this.f39668x1da1656a + f17 > scrollX) {
                f18 = f19;
                this.f39661xa104e639.setBounds(((int) f17) - 1, this.f39681x8ec49dec, ((int) ((r11 + f17) + 0.5f)) - 1, this.f39631x4399a53c);
                this.f39661xa104e639.draw(canvas);
            } else {
                f18 = f19;
            }
            if (f17 > scrollX + r2) {
                return;
            }
            i19++;
            f19 = f18;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f39654x11e573ea = false;
            this.f39655xf135efb9 = false;
            this.f39649x899b3e9a = false;
            this.f39628x46f103a5 = -1;
            android.view.VelocityTracker velocityTracker = this.f39683x7f399f6e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f39683x7f399f6e = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.f39654x11e573ea) {
                return true;
            }
            if (this.f39655xf135efb9) {
                return false;
            }
        }
        if (action == 0) {
            float x17 = motionEvent.getX();
            this.f39651xa6bf8d4b = x17;
            this.f39657x6460593f = x17;
            float y17 = motionEvent.getY();
            this.f39652xa6bf8d4c = y17;
            this.f39658x64605940 = y17;
            this.f39628x46f103a5 = motionEvent.getPointerId(0);
            this.f39655xf135efb9 = false;
            this.f39676xd051bc7.computeScrollOffset();
            if (this.f39675x24803717 != 2 || java.lang.Math.abs(this.f39676xd051bc7.getFinalX() - this.f39676xd051bc7.getCurrX()) <= this.f39635x9c234adb) {
                a(false);
                this.f39654x11e573ea = false;
            } else {
                this.f39676xd051bc7.abortAnimation();
                this.f39670xb20bed20 = false;
                m80840x281968ea();
                this.f39654x11e573ea = true;
                m80818xeaaee002(1);
            }
        } else if (action == 2) {
            int i17 = this.f39628x46f103a5;
            if (i17 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i17);
                float x18 = motionEvent.getX(findPointerIndex);
                float f17 = x18 - this.f39657x6460593f;
                float abs = java.lang.Math.abs(f17);
                float y18 = motionEvent.getY(findPointerIndex);
                float abs2 = java.lang.Math.abs(y18 - this.f39652xa6bf8d4c);
                if (f17 != 0.0f && !mo78872x4b59f9b9(this.f39657x6460593f, f17) && !this.f39649x899b3e9a && mo67173x10136bd(this, false, (int) f17, (int) x18, (int) y18)) {
                    this.f39657x6460593f = x18;
                    this.f39658x64605940 = y18;
                    this.f39655xf135efb9 = true;
                    return false;
                }
                int i18 = this.f39682x9065cfec;
                if (abs > i18 && abs * 0.5f > abs2) {
                    this.f39654x11e573ea = true;
                    m80818xeaaee002(1);
                    this.f39657x6460593f = f17 > 0.0f ? this.f39651xa6bf8d4b + this.f39682x9065cfec : this.f39651xa6bf8d4b - this.f39682x9065cfec;
                    this.f39658x64605940 = y18;
                    m80819x1ada10b2(true);
                } else if (abs2 > i18) {
                    this.f39655xf135efb9 = true;
                }
                if (this.f39654x11e573ea && k(x18)) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.u0.k(this);
                }
            }
        } else if (action == 6) {
            i(motionEvent);
        }
        if (this.f39683x7f399f6e == null) {
            this.f39683x7f399f6e = android.view.VelocityTracker.obtain();
        }
        this.f39683x7f399f6e.addMovement(motionEvent);
        return this.f39654x11e573ea;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams layoutParams;
        com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams layoutParams2;
        int i19;
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        int measuredWidth = getMeasuredWidth();
        this.f39648xa627a809 = java.lang.Math.min(measuredWidth / 10, this.f39638x797acbf0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i27 = 0;
        while (true) {
            boolean z17 = true;
            int i28 = 1073741824;
            if (i27 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f290776a) {
                int i29 = layoutParams2.f290777b;
                int i37 = i29 & 7;
                int i38 = i29 & 112;
                boolean z18 = i38 == 48 || i38 == 80;
                if (i37 != 3 && i37 != 5) {
                    z17 = false;
                }
                int i39 = Integer.MIN_VALUE;
                if (z18) {
                    i19 = Integer.MIN_VALUE;
                    i39 = 1073741824;
                } else {
                    i19 = z17 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i47 = ((android.view.ViewGroup.LayoutParams) layoutParams2).width;
                if (i47 != -2) {
                    if (i47 == -1) {
                        i47 = paddingLeft;
                    }
                    i39 = 1073741824;
                } else {
                    i47 = paddingLeft;
                }
                int i48 = ((android.view.ViewGroup.LayoutParams) layoutParams2).height;
                if (i48 == -2) {
                    i48 = measuredHeight;
                    i28 = i19;
                } else if (i48 == -1) {
                    i48 = measuredHeight;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i47, i39), android.view.View.MeasureSpec.makeMeasureSpec(i48, i28));
                if (z18) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z17) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i27++;
        }
        this.f39634x608ebb62 = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f39633x3b186da3 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f39650x2866c3c = true;
        m80840x281968ea();
        this.f39650x2866c3c = false;
        int childCount2 = getChildCount();
        for (int i49 = 0; i49 < childCount2; i49++) {
            android.view.View childAt2 = getChildAt(i49);
            if (childAt2.getVisibility() != 8 && (((layoutParams = (com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f290776a) && layoutParams != null)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f290778c), 1073741824), this.f39633x3b186da3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: onPageScrolled */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo63668xf210c75a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f39637xac79286b
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r9 = (com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) r9
            boolean r10 = r9.f290776a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f290777b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.f39667x6dfb013f
            if (r0 == 0) goto L72
            r0.mo8332xf210c75a(r13, r14, r15)
        L72:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.f39653x41b180dd
            if (r0 == 0) goto L79
            r0.mo8332xf210c75a(r13, r14, r15)
        L79:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r12.f39627xb75bd23f
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r0.next()
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r3 = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener) r3
            r3.mo8332xf210c75a(r13, r14, r15)
            goto L7f
        L8f:
            androidx.viewpager.widget.m r13 = r12.f39669xa0bee2dd
            if (r13 == 0) goto Lc2
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L9b:
            if (r1 >= r14) goto Lc2
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.tencent.mm.ui.mogic.WxViewPager$LayoutParams r0 = (com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) r0
            boolean r0 = r0.f290776a
            if (r0 == 0) goto Lac
            goto Lbf
        Lac:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.m80817xcf063785()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.m r3 = r12.f39669xa0bee2dd
            hb4.a r3 = (hb4.a) r3
            r3.a(r15, r0)
        Lbf:
            int r1 = r1 + 1
            goto L9b
        Lc2:
            r12.f39632xbc724f51 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.mo63668xf210c75a(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        int i18;
        int i19;
        int i27;
        ii5.g m80834xdee048a1;
        int childCount = getChildCount();
        if ((i17 & 2) != 0) {
            i19 = childCount;
            i18 = 0;
            i27 = 1;
        } else {
            i18 = childCount - 1;
            i19 = -1;
            i27 = -1;
        }
        while (i18 != i19) {
            android.view.View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 0 && (m80834xdee048a1 = m80834xdee048a1(childAt)) != null && m80834xdee048a1.f373191b == this.f39636xe1320446 && childAt.requestFocus(i17, rect)) {
                return true;
            }
            i18 += i27;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.SavedState savedState = (com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f39629x59855622;
        java.lang.ClassLoader classLoader = savedState.f290784f;
        if (aVar != null) {
            aVar.mo7746x61a06aa3(savedState.f290783e, classLoader);
            m80847x4a1b2347(savedState.f290782d, false, true);
        } else {
            this.f39673xa26404d0 = savedState.f290782d;
            this.f39671xeab7c945 = savedState.f290783e;
            this.f39672x50c08888 = classLoader;
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.SavedState savedState = new com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.SavedState(super.onSaveInstanceState());
        savedState.f290782d = this.f39636xe1320446;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f39629x59855622;
        if (aVar != null) {
            savedState.f290783e = aVar.mo7747xa507914();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            int i28 = this.f39668x1da1656a;
            l(i17, i19, i28, i28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar;
        int i17;
        int i18;
        if (this.f39644x7e6f0cd1) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f39629x59855622) == null || aVar.mo8338x7444f759() == 0) {
            return false;
        }
        if (this.f39683x7f399f6e == null) {
            this.f39683x7f399f6e = android.view.VelocityTracker.obtain();
        }
        this.f39683x7f399f6e.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f39676xd051bc7.abortAnimation();
            this.f39670xb20bed20 = false;
            m80840x281968ea();
            this.f39654x11e573ea = true;
            m80818xeaaee002(1);
            float x17 = motionEvent.getX();
            this.f39651xa6bf8d4b = x17;
            this.f39657x6460593f = x17;
            float y17 = motionEvent.getY();
            this.f39652xa6bf8d4c = y17;
            this.f39658x64605940 = y17;
            this.f39628x46f103a5 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f39654x11e573ea) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f39628x46f103a5);
                    float x18 = motionEvent.getX(findPointerIndex);
                    float abs = java.lang.Math.abs(x18 - this.f39657x6460593f);
                    float y18 = motionEvent.getY(findPointerIndex);
                    float abs2 = java.lang.Math.abs(y18 - this.f39658x64605940);
                    int i19 = this.f39682x9065cfec;
                    if (abs > i19 && abs > abs2) {
                        this.f39654x11e573ea = true;
                        float f17 = this.f39651xa6bf8d4b;
                        this.f39657x6460593f = x18 - f17 > 0.0f ? f17 + i19 : f17 - i19;
                        this.f39658x64605940 = y18;
                        m80818xeaaee002(1);
                        m80819x1ada10b2(true);
                    }
                }
                if (this.f39654x11e573ea) {
                    r2 = 0 | (k(motionEvent.getX(motionEvent.findPointerIndex(this.f39628x46f103a5))) ? 1 : 0);
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f39657x6460593f = motionEvent.getX(actionIndex);
                    this.f39628x46f103a5 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    i(motionEvent);
                    this.f39657x6460593f = motionEvent.getX(motionEvent.findPointerIndex(this.f39628x46f103a5));
                }
            } else if (this.f39654x11e573ea) {
                n(this.f39636xe1320446, true, 0, false);
                this.f39628x46f103a5 = -1;
                c();
                boolean e17 = this.f39660x8b63cdf1.e();
                i18 = this.f39674x1d29800c.e();
                i17 = e17;
                r2 = i17 | i18;
            }
        } else if (this.f39654x11e573ea) {
            android.view.VelocityTracker velocityTracker = this.f39683x7f399f6e;
            velocityTracker.computeCurrentVelocity(1000, this.f39662x4b9066f0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f39628x46f103a5);
            this.f39670xb20bed20 = true;
            int m80817xcf063785 = m80817xcf063785();
            int scrollX = getScrollX();
            ii5.g g17 = g();
            if (g17 != null) {
                int i27 = g17.f373191b;
                float f18 = ((scrollX / m80817xcf063785) - g17.f373194e) / g17.f373193d;
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f39628x46f103a5);
                m80848x4a1b2347(b(i27, f18, xVelocity, (int) (motionEvent.getX(findPointerIndex2 >= 0 ? findPointerIndex2 : 0) - this.f39651xa6bf8d4b)), true, true, xVelocity);
            }
            this.f39628x46f103a5 = -1;
            c();
            boolean e18 = this.f39660x8b63cdf1.e();
            i18 = this.f39674x1d29800c.e();
            i17 = e18;
            r2 = i17 | i18;
        }
        if (r2 != 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
        return true;
    }

    /* renamed from: pageLeft */
    public boolean m80838x33369736() {
        int i17 = this.f39636xe1320446;
        if (i17 <= 0) {
            return false;
        }
        m80845x940d026a(i17 - 1, true);
        return true;
    }

    /* renamed from: pageRight */
    public boolean m80839x33f2b0cd() {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f39629x59855622;
        if (aVar == null || this.f39636xe1320446 >= aVar.mo8338x7444f759() - 1) {
            return false;
        }
        m80845x940d026a(this.f39636xe1320446 + 1, true);
        return true;
    }

    /* renamed from: populate */
    public void m80840x281968ea() {
        m80841x281968ea(this.f39636xe1320446);
    }

    /* renamed from: removeOnPageChangeListener */
    public void m80842x7cd807d6(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        this.f39627xb75bd23f.remove(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (this.f39650x2866c3c) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: setAdapter */
    public void mo79164x6cab2c8d(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar2 = this.f39629x59855622;
        if (aVar2 != null) {
            aVar2.m8348xfde4bf72(this.f39665x39c4fa63);
            this.f39629x59855622.mo7749x93ef97cb((android.view.ViewGroup) this);
            for (int i17 = 0; i17 < this.f39656xbe3b3353.size(); i17++) {
                ii5.g gVar = this.f39656xbe3b3353.get(i17);
                this.f39629x59855622.mo7741x89d2022d((android.view.ViewGroup) this, gVar.f373191b, gVar.f373190a);
            }
            this.f39629x59855622.mo7742xa949b73c((android.view.ViewGroup) this);
            this.f39656xbe3b3353.clear();
            int i18 = 0;
            while (i18 < getChildCount()) {
                if (!((com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams) getChildAt(i18).getLayoutParams()).f290776a) {
                    removeViewAt(i18);
                    i18--;
                }
                i18++;
            }
            scrollTo(0, 0);
        }
        this.f39629x59855622 = aVar;
        this.f39642x837879e5 = 0;
        if (aVar != null) {
            if (this.f39665x39c4fa63 == null) {
                this.f39665x39c4fa63 = new ii5.j(this, null);
            }
            this.f39629x59855622.m8344x4b262a2b(this.f39665x39c4fa63);
            this.f39670xb20bed20 = false;
            boolean z17 = this.f39645x5f7f074d;
            this.f39645x5f7f074d = true;
            this.f39642x837879e5 = this.f39629x59855622.mo8338x7444f759();
            if (this.f39673xa26404d0 < 0) {
                if (z17) {
                    requestLayout();
                    return;
                } else {
                    m80840x281968ea();
                    return;
                }
            }
            this.f39629x59855622.mo7746x61a06aa3(this.f39671xeab7c945, this.f39672x50c08888);
            m80847x4a1b2347(this.f39673xa26404d0, false, true);
            this.f39673xa26404d0 = -1;
            this.f39671xeab7c945 = null;
            this.f39672x50c08888 = null;
        }
    }

    /* renamed from: setChildrenDrawingOrderEnabledCompat */
    public void m80843xbe5518b2(boolean z17) {
        if (this.f39678x896cd4dd == null) {
            try {
                this.f39678x896cd4dd = android.view.ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", java.lang.Boolean.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        try {
            java.lang.reflect.Method method = this.f39678x896cd4dd;
            if (method != null) {
                method.invoke(this, java.lang.Boolean.valueOf(z17));
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    /* renamed from: setCurrentItem */
    public void m80844x940d026a(int i17) {
        this.f39670xb20bed20 = false;
        m80847x4a1b2347(i17, !this.f39645x5f7f074d, false);
    }

    /* renamed from: setCurrentItemInternal */
    public void m80847x4a1b2347(int i17, boolean z17, boolean z18) {
        m80848x4a1b2347(i17, z17, z18, 0);
    }

    /* renamed from: setCurrentItemNotify */
    public void m80850xd5848e53(int i17, boolean z17) {
        this.f39670xb20bed20 = false;
        m80849x4a1b2347(i17, z17, false, 0, true);
    }

    /* renamed from: setInternalPageChangeListener */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener m80851x64448492(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener2 = this.f39653x41b180dd;
        this.f39653x41b180dd = onPageChangeListener;
        return onPageChangeListener2;
    }

    /* renamed from: setLastMotion */
    public void m80852x85807bee(float f17, float f18) {
        this.f39657x6460593f = f17;
        this.f39658x64605940 = f18;
    }

    /* renamed from: setOffscreenPageLimit */
    public void m80853x40341e13(int i17) {
        if (i17 < 1) {
            i17 = 1;
        }
        if (i17 != this.f39666x94fb955e) {
            this.f39666x94fb955e = i17;
            m80840x281968ea();
        }
    }

    /* renamed from: setOnAdapterChangeListener */
    public void m80854xd50c652(ii5.i iVar) {
    }

    /* renamed from: setOnPageChangeListener */
    public void mo79170x2d3430b4(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        this.f39667x6dfb013f = onPageChangeListener;
    }

    /* renamed from: setPageMargin */
    public void m80855x5dd4731f(int i17) {
        int i18 = this.f39668x1da1656a;
        this.f39668x1da1656a = i17;
        int width = getWidth();
        l(width, width, i17, i18);
        requestLayout();
    }

    /* renamed from: setPageMarginDrawable */
    public void m80857xce91c8dd(android.graphics.drawable.Drawable drawable) {
        this.f39661xa104e639 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* renamed from: setPageTransformer */
    public void m80858xec491e48(boolean z17, p012xc85e97e9.p114xa324943e.p115xd1075a44.m mVar) {
        boolean z18 = mVar != null;
        boolean z19 = z18 != (this.f39669xa0bee2dd != null);
        this.f39669xa0bee2dd = mVar;
        m80843xbe5518b2(z18);
        if (z18) {
            this.f39639x6d0f5edd = z17 ? 2 : 1;
        } else {
            this.f39639x6d0f5edd = 0;
        }
        if (z19) {
            m80840x281968ea();
        }
    }

    /* renamed from: setScroller */
    public void m80859x5e9a12bc(android.widget.Scroller scroller) {
        this.f39676xd051bc7 = scroller;
    }

    /* renamed from: setUnableDrag */
    public void m80860xd1cd6549(boolean z17, boolean z18) {
        this.f39655xf135efb9 = z17;
        this.f39649x899b3e9a = z18;
    }

    /* renamed from: smoothScrollTo */
    public void m80861xc291bdf6(int i17, int i18) {
        m80862xc291bdf6(i17, i18, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f39661xa104e639;
    }

    /* renamed from: com.tencent.mm.ui.mogic.WxViewPager$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f290776a;

        /* renamed from: b, reason: collision with root package name */
        public final int f290777b;

        /* renamed from: c, reason: collision with root package name */
        public float f290778c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f290779d;

        /* renamed from: e, reason: collision with root package name */
        public int f290780e;

        /* renamed from: f, reason: collision with root package name */
        public int f290781f;

        public LayoutParams() {
            super(-1, -1);
            this.f290778c = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f290778c = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.f39616x449c372d);
            this.f290777b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r10 == r11) goto L31;
     */
    /* renamed from: populate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m80841x281968ea(int r18) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d.m80841x281968ea(int):void");
    }

    /* renamed from: setCurrentItemInternal */
    public void m80848x4a1b2347(int i17, boolean z17, boolean z18, int i18) {
        m80849x4a1b2347(i17, z17, z18, i18, false);
    }

    /* renamed from: smoothScrollTo */
    public void m80862xc291bdf6(int i17, int i18, int i19) {
        int abs;
        if (getChildCount() == 0) {
            m80819x1ada10b2(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i27 = i17 - scrollX;
        int i28 = i18 - scrollY;
        if (i27 == 0 && i28 == 0) {
            a(false);
            m80840x281968ea();
            m80818xeaaee002(0);
            return;
        }
        m80819x1ada10b2(true);
        m80818xeaaee002(2);
        int m80817xcf063785 = m80817xcf063785();
        int i29 = m80817xcf063785 / 2;
        float f17 = m80817xcf063785;
        float f18 = i29;
        float m80825x52ac447 = f18 + (m80825x52ac447(java.lang.Math.min(1.0f, (java.lang.Math.abs(i27) * 1.0f) / f17)) * f18);
        int abs2 = java.lang.Math.abs(i19);
        if (abs2 > 0) {
            abs = java.lang.Math.round(java.lang.Math.abs(m80825x52ac447 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((java.lang.Math.abs(i27) / ((f17 * this.f39629x59855622.m8341x33a68dc1(this.f39636xe1320446)) + this.f39668x1da1656a)) + 3.0f) * 100.0f);
        }
        this.f39676xd051bc7.startScroll(scrollX, scrollY, i27, i28, java.lang.Math.min(abs, 600));
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(this);
    }

    /* renamed from: setCurrentItem */
    public void m80845x940d026a(int i17, boolean z17) {
        this.f39670xb20bed20 = false;
        m80847x4a1b2347(i17, z17, false);
    }

    /* renamed from: setCurrentItemInternal */
    public void m80849x4a1b2347(int i17, boolean z17, boolean z18, int i18, boolean z19) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener2;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f39629x59855622;
        if (aVar != null && aVar.mo8338x7444f759() > 0) {
            if (!z18 && this.f39636xe1320446 == i17 && this.f39656xbe3b3353.size() != 0) {
                m80819x1ada10b2(false);
                return;
            }
            if (i17 < 0) {
                i17 = 0;
            } else if (i17 >= this.f39629x59855622.mo8338x7444f759()) {
                i17 = this.f39629x59855622.mo8338x7444f759() - 1;
            }
            int i19 = this.f39666x94fb955e;
            int i27 = this.f39636xe1320446;
            if (i17 > i27 + i19 || i17 < i27 - i19) {
                for (int i28 = 0; i28 < this.f39656xbe3b3353.size(); i28++) {
                    this.f39656xbe3b3353.get(i28).f373192c = true;
                }
            }
            boolean z27 = this.f39636xe1320446 != i17;
            if (this.f39645x5f7f074d) {
                this.f39636xe1320446 = i17;
                if ((z19 || z27) && (onPageChangeListener = this.f39667x6dfb013f) != null) {
                    onPageChangeListener.mo8333x510f45c9(i17);
                }
                if ((z19 || z27) && (onPageChangeListener2 = this.f39653x41b180dd) != null) {
                    onPageChangeListener2.mo8333x510f45c9(i17);
                }
                if (z19 || z27) {
                    h(i17);
                }
                requestLayout();
                return;
            }
            m80841x281968ea(i17);
            n(i17, z17, i18, z27);
            return;
        }
        m80819x1ada10b2(false);
    }

    /* renamed from: setCurrentItem */
    public void m80846x940d026a(int i17, boolean z17, boolean z18) {
        this.f39670xb20bed20 = false;
        m80847x4a1b2347(i17, z17, z18);
    }

    /* renamed from: setPageMarginDrawable */
    public void m80856xce91c8dd(int i17) {
        m80857xce91c8dd(getContext().getResources().getDrawable(i17));
    }

    public C22458x34f98a1d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39656xbe3b3353 = new java.util.ArrayList<>();
        this.f39679xd628d094 = new ii5.g();
        this.f39680xd62caf65 = new android.graphics.Rect();
        this.f39673xa26404d0 = -1;
        this.f39671xeab7c945 = null;
        this.f39672x50c08888 = null;
        this.f39646x64db70b6 = -3.4028235E38f;
        this.f39659x48321316 = Float.MAX_VALUE;
        this.f39666x94fb955e = 1;
        this.f39628x46f103a5 = -1;
        this.f39645x5f7f074d = true;
        this.f39664x749760ae = false;
        this.f39626x1148586 = true;
        this.f39641xbb46c1d8 = new ii5.f(this);
        this.f39675x24803717 = 0;
        this.f39627xb75bd23f = new java.util.ArrayList();
        m80836xfdfb10ee();
    }
}
