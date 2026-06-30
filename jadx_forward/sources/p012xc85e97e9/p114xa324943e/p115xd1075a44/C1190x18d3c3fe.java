package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* renamed from: androidx.viewpager.widget.ViewPager */
/* loaded from: classes15.dex */
public class C1190x18d3c3fe extends android.view.ViewGroup {

    /* renamed from: CLOSE_ENOUGH */
    private static final int f3659xc78d11b7 = 2;

    /* renamed from: DEBUG */
    private static final boolean f3661x3de9e33 = false;

    /* renamed from: DEFAULT_GUTTER_SIZE */
    private static final int f3662xea30cb87 = 16;

    /* renamed from: DEFAULT_OFFSCREEN_PAGES */
    private static final int f3663x30f616c2 = 1;

    /* renamed from: DRAW_ORDER_DEFAULT */
    private static final int f3664xb54cfa55 = 0;

    /* renamed from: DRAW_ORDER_FORWARD */
    private static final int f3665x30dcb6d9 = 1;

    /* renamed from: DRAW_ORDER_REVERSE */
    private static final int f3666x9ac776f6 = 2;

    /* renamed from: INVALID_POINTER */
    private static final int f3667x63c227b5 = -1;

    /* renamed from: MAX_SETTLE_DURATION */
    private static final int f3669xca02a50d = 600;

    /* renamed from: MIN_DISTANCE_FOR_FLING */
    private static final int f3670xcb872989 = 25;

    /* renamed from: MIN_FLING_VELOCITY */
    private static final int f3671xc7b0c62d = 400;

    /* renamed from: SCROLL_STATE_DRAGGING */
    public static final int f3672xa773a10f = 1;

    /* renamed from: SCROLL_STATE_IDLE */
    public static final int f3673x1591eb94 = 0;

    /* renamed from: SCROLL_STATE_SETTLING */
    public static final int f3674x2f19cb08 = 2;
    private static final java.lang.String TAG = "ViewPager";

    /* renamed from: USE_CACHE */
    private static final boolean f3675xd0b37a8a = false;

    /* renamed from: mActivePointerId */
    private int f3678x46f103a5;

    /* renamed from: mAdapter */
    p012xc85e97e9.p114xa324943e.p115xd1075a44.a f3679x59855622;

    /* renamed from: mAdapterChangeListeners */
    private java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.l> f3680x2e101ded;

    /* renamed from: mBottomPageBounds */
    private int f3681x4399a53c;

    /* renamed from: mCalledSuper */
    private boolean f3682xbc724f51;

    /* renamed from: mChildHeightMeasureSpec */
    private int f3683x3b186da3;

    /* renamed from: mChildWidthMeasureSpec */
    private int f3684x608ebb62;

    /* renamed from: mCloseEnough */
    private int f3685x9c234adb;

    /* renamed from: mCurItem */
    int f3686xe1320446;

    /* renamed from: mDecorChildCount */
    private int f3687xac79286b;

    /* renamed from: mDefaultGutterSize */
    private int f3688x797acbf0;

    /* renamed from: mDrawingOrder */
    private int f3689x6d0f5edd;

    /* renamed from: mDrawingOrderedChildren */
    private java.util.ArrayList<android.view.View> f3690xdbd9ee5b;

    /* renamed from: mEndScrollRunnable */
    private final java.lang.Runnable f3691xbb46c1d8;

    /* renamed from: mExpectedAdapterCount */
    private int f3692x837879e5;

    /* renamed from: mFakeDragBeginTime */
    private long f3693x97a88200;

    /* renamed from: mFakeDragging */
    private boolean f3694x7e6f0cd1;

    /* renamed from: mFirstLayout */
    private boolean f3695x5f7f074d;

    /* renamed from: mFirstOffset */
    private float f3696x64db70b6;

    /* renamed from: mFlingDistance */
    private int f3697x6824ea04;

    /* renamed from: mGutterSize */
    private int f3698xa627a809;

    /* renamed from: mInLayout */
    private boolean f3699x2866c3c;

    /* renamed from: mInitialMotionX */
    private float f3700xa6bf8d4b;

    /* renamed from: mInitialMotionY */
    private float f3701xa6bf8d4c;

    /* renamed from: mInternalPageChangeListener */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f3702x41b180dd;

    /* renamed from: mIsBeingDragged */
    private boolean f3703x11e573ea;

    /* renamed from: mIsScrollStarted */
    private boolean f3704xfb2da7bd;

    /* renamed from: mIsUnableToDrag */
    private boolean f3705xf135efb9;

    /* renamed from: mItems */
    private final java.util.ArrayList<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo> f3706xbe3b3353;

    /* renamed from: mLastMotionX */
    private float f3707x6460593f;

    /* renamed from: mLastMotionY */
    private float f3708x64605940;

    /* renamed from: mLastOffset */
    private float f3709x48321316;

    /* renamed from: mLeftEdge */
    private android.widget.EdgeEffect f3710x8b63cdf1;

    /* renamed from: mMarginDrawable */
    private android.graphics.drawable.Drawable f3711xa104e639;

    /* renamed from: mMaximumVelocity */
    private int f3712x4b9066f0;

    /* renamed from: mMinimumVelocity */
    private int f3713x96072de;

    /* renamed from: mNeedCalculatePageOffsets */
    private boolean f3714x749760ae;

    /* renamed from: mObserver */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.n f3715x39c4fa63;

    /* renamed from: mOffscreenPageLimit */
    private int f3716x94fb955e;

    /* renamed from: mOnPageChangeListener */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener f3717x6dfb013f;

    /* renamed from: mOnPageChangeListeners */
    private java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> f3718x51652714;

    /* renamed from: mPageMargin */
    private int f3719x1da1656a;

    /* renamed from: mPageTransformer */
    private p012xc85e97e9.p114xa324943e.p115xd1075a44.m f3720xa0bee2dd;

    /* renamed from: mPageTransformerLayerType */
    private int f3721x2282edce;

    /* renamed from: mPopulatePending */
    private boolean f3722xb20bed20;

    /* renamed from: mRestoredAdapterState */
    private android.os.Parcelable f3723xeab7c945;

    /* renamed from: mRestoredClassLoader */
    private java.lang.ClassLoader f3724x50c08888;

    /* renamed from: mRestoredCurItem */
    private int f3725xa26404d0;

    /* renamed from: mRightEdge */
    private android.widget.EdgeEffect f3726x1d29800c;

    /* renamed from: mScrollState */
    private int f3727x24803717;

    /* renamed from: mScroller */
    private android.widget.Scroller f3728xd051bc7;

    /* renamed from: mScrollingCacheEnabled */
    private boolean f3729xf2ed5187;

    /* renamed from: mTempItem */
    private final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo f3730xd628d094;

    /* renamed from: mTempRect */
    private final android.graphics.Rect f3731xd62caf65;

    /* renamed from: mTopPageBounds */
    private int f3732x8ec49dec;

    /* renamed from: mTouchSlop */
    private int f3733x9065cfec;

    /* renamed from: mVelocityTracker */
    private android.view.VelocityTracker f3734x7f399f6e;

    /* renamed from: LAYOUT_ATTRS */
    static final int[] f3668x449c372d = {android.R.attr.layout_gravity};

    /* renamed from: COMPARATOR */
    private static final java.util.Comparator<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo> f3660xea9138d6 = new p012xc85e97e9.p114xa324943e.p115xd1075a44.f();

    /* renamed from: sInterpolator */
    private static final android.view.animation.Interpolator f3676xab9988da = new p012xc85e97e9.p114xa324943e.p115xd1075a44.g();

    /* renamed from: sPositionComparator */
    private static final p012xc85e97e9.p114xa324943e.p115xd1075a44.q f3677xbb4ec8b2 = new p012xc85e97e9.p114xa324943e.p115xd1075a44.q();

    /* renamed from: androidx.viewpager.widget.ViewPager$ItemInfo */
    /* loaded from: classes15.dex */
    public static class ItemInfo {

        /* renamed from: object */
        java.lang.Object f3735xc300a33f;

        /* renamed from: offset */
        float f3736xc3376493;

        /* renamed from: position */
        int f3737x2c929929;

        /* renamed from: scrolling */
        boolean f3738x18e721f5;

        /* renamed from: widthFactor */
        float f3739x5fb326b5;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$OnPageChangeListener */
    /* loaded from: classes4.dex */
    public interface OnPageChangeListener {
        /* renamed from: onPageScrollStateChanged */
        void mo8331xcb2941fe(int i17);

        /* renamed from: onPageScrolled */
        void mo8332xf210c75a(int i17, float f17, int i18);

        /* renamed from: onPageSelected */
        void mo8333x510f45c9(int i17);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.SavedState> f3740x681a0c0c = new p012xc85e97e9.p114xa324943e.p115xd1075a44.o();

        /* renamed from: f, reason: collision with root package name */
        public int f93962f;

        /* renamed from: g, reason: collision with root package name */
        public android.os.Parcelable f93963g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.ClassLoader f93964h;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f93962f = parcel.readInt();
            this.f93963g = parcel.readParcelable(classLoader);
            this.f93964h = classLoader;
        }

        /* renamed from: toString */
        public java.lang.String m8335x9616526c() {
            return "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.f93962f + "}";
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeInt(this.f93962f);
            parcel.writeParcelable(this.f93963g, i17);
        }
    }

    public C1190x18d3c3fe(android.content.Context context) {
        super(context);
        this.f3706xbe3b3353 = new java.util.ArrayList<>();
        this.f3730xd628d094 = new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo();
        this.f3731xd62caf65 = new android.graphics.Rect();
        this.f3725xa26404d0 = -1;
        this.f3723xeab7c945 = null;
        this.f3724x50c08888 = null;
        this.f3696x64db70b6 = -3.4028235E38f;
        this.f3709x48321316 = Float.MAX_VALUE;
        this.f3716x94fb955e = 1;
        this.f3678x46f103a5 = -1;
        this.f3695x5f7f074d = true;
        this.f3714x749760ae = false;
        this.f3691xbb46c1d8 = new p012xc85e97e9.p114xa324943e.p115xd1075a44.h(this);
        this.f3727x24803717 = 0;
        m8306xfdfb10ee();
    }

    private void f(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3678x46f103a5) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.f3707x6460593f = motionEvent.getX(i17);
            this.f3678x46f103a5 = motionEvent.getPointerId(i17);
            android.view.VelocityTracker velocityTracker = this.f3734x7f399f6e;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: getClientWidth */
    private int m8285xcf063785() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: setScrollingCacheEnabled */
    private void m8286x1ada10b2(boolean z17) {
        if (this.f3729xf2ed5187 != z17) {
            this.f3729xf2ed5187 = z17;
        }
    }

    public final void a(boolean z17) {
        boolean z18 = this.f3727x24803717 == 2;
        if (z18) {
            m8286x1ada10b2(false);
            if (!this.f3728xd051bc7.isFinished()) {
                this.f3728xd051bc7.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3728xd051bc7.getCurrX();
                int currY = this.f3728xd051bc7.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        g(currX);
                    }
                }
            }
        }
        this.f3722xb20bed20 = false;
        for (int i17 = 0; i17 < this.f3706xbe3b3353.size(); i17++) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(i17);
            if (itemInfo.f3738x18e721f5) {
                itemInfo.f3738x18e721f5 = false;
                z18 = true;
            }
        }
        if (z18) {
            if (!z17) {
                this.f3691xbb46c1d8.run();
                return;
            }
            java.lang.Runnable runnable = this.f3691xbb46c1d8;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(this, runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> arrayList, int i17, int i18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8304xdee048a1;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                android.view.View childAt = getChildAt(i19);
                if (childAt.getVisibility() == 0 && (m8304xdee048a1 = m8304xdee048a1(childAt)) != null && m8304xdee048a1.f3737x2c929929 == this.f3686xe1320446) {
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
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8287xdfb420f2(int i17, int i18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo();
        itemInfo.f3737x2c929929 = i17;
        itemInfo.f3735xc300a33f = this.f3679x59855622.mo7744x8d1aed1d((android.view.ViewGroup) this, i17);
        itemInfo.f3739x5fb326b5 = this.f3679x59855622.m8341x33a68dc1(i17);
        if (i18 < 0 || i18 >= this.f3706xbe3b3353.size()) {
            this.f3706xbe3b3353.add(itemInfo);
        } else {
            this.f3706xbe3b3353.add(i18, itemInfo);
        }
        return itemInfo;
    }

    /* renamed from: addOnAdapterChangeListener */
    public void m8288xa7bfb333(p012xc85e97e9.p114xa324943e.p115xd1075a44.l lVar) {
        if (this.f3680x2e101ded == null) {
            this.f3680x2e101ded = new java.util.ArrayList();
        }
        this.f3680x2e101ded.add(lVar);
    }

    /* renamed from: addOnPageChangeListener */
    public void m8289xa5a25773(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        if (this.f3718x51652714 == null) {
            this.f3718x51652714 = new java.util.ArrayList();
        }
        this.f3718x51652714.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> arrayList) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8304xdee048a1;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (m8304xdee048a1 = m8304xdee048a1(childAt)) != null && m8304xdee048a1.f3737x2c929929 == this.f3686xe1320446) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams layoutParams2 = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) layoutParams;
        boolean z17 = layoutParams2.f93956a | (view.getClass().getAnnotation(p012xc85e97e9.p114xa324943e.p115xd1075a44.j.class) != null);
        layoutParams2.f93956a = z17;
        if (!this.f3699x2866c3c) {
            super.addView(view, i17, layoutParams);
        } else {
            if (z17) {
                throw new java.lang.IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f93959d = true;
            addViewInLayout(view, i17, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* renamed from: arrowScroll */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m8290x6ec85c36(int r7) {
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
            android.graphics.Rect r1 = r6.f3731xd62caf65
            android.graphics.Rect r1 = r6.d(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3731xd62caf65
            android.graphics.Rect r2 = r6.d(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L6c
            if (r1 < r2) goto L6c
            boolean r0 = r6.m8309x33369736()
            goto L70
        L6c:
            boolean r0 = r3.requestFocus()
        L70:
            r2 = r0
            goto La5
        L72:
            if (r7 != r4) goto La5
            android.graphics.Rect r1 = r6.f3731xd62caf65
            android.graphics.Rect r1 = r6.d(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3731xd62caf65
            android.graphics.Rect r2 = r6.d(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8d
            if (r1 > r2) goto L8d
            boolean r0 = r6.m8310x33f2b0cd()
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
            boolean r2 = r6.m8310x33f2b0cd()
            goto La5
        La1:
            boolean r2 = r6.m8309x33369736()
        La5:
            if (r2 == 0) goto Lae
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.m8290x6ec85c36(int):boolean");
    }

    public final int b(int i17, float f17, int i18, int i19) {
        if (java.lang.Math.abs(i19) <= this.f3697x6824ea04 || java.lang.Math.abs(i18) <= this.f3713x96072de) {
            i17 += (int) (f17 + (i17 >= this.f3686xe1320446 ? 0.4f : 0.6f));
        } else if (i18 <= 0) {
            i17++;
        }
        if (this.f3706xbe3b3353.size() <= 0) {
            return i17;
        }
        return java.lang.Math.max(this.f3706xbe3b3353.get(0).f3737x2c929929, java.lang.Math.min(i17, this.f3706xbe3b3353.get(r4.size() - 1).f3737x2c929929));
    }

    /* renamed from: beginFakeDrag */
    public boolean m8291x55dee9f2() {
        if (this.f3703x11e573ea) {
            return false;
        }
        this.f3694x7e6f0cd1 = true;
        m8328xeaaee002(1);
        this.f3707x6460593f = 0.0f;
        this.f3700xa6bf8d4b = 0.0f;
        android.view.VelocityTracker velocityTracker = this.f3734x7f399f6e;
        if (velocityTracker == null) {
            this.f3734x7f399f6e = android.view.VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f3734x7f399f6e.addMovement(obtain);
        obtain.recycle();
        this.f3693x97a88200 = uptimeMillis;
        return true;
    }

    public final void c(int i17) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = this.f3717x6dfb013f;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8333x510f45c9(i17);
        }
        java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> list = this.f3718x51652714;
        if (list != null) {
            int size = list.size();
            for (int i18 = 0; i18 < size; i18++) {
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener2 = this.f3718x51652714.get(i18);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.mo8333x510f45c9(i17);
                }
            }
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener3 = this.f3702x41b180dd;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.mo8333x510f45c9(i17);
        }
    }

    /* renamed from: canScroll */
    public boolean mo8292x10136bd(android.view.View view, boolean z17, int i17, int i18, int i19) {
        int i27;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i28 = i18 + scrollX;
                if (i28 >= childAt.getLeft() && i28 < childAt.getRight() && (i27 = i19 + scrollY) >= childAt.getTop() && i27 < childAt.getBottom() && mo8292x10136bd(childAt, true, i17, i28 - childAt.getLeft(), i27 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z17 && view.canScrollHorizontally(-i17);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        if (this.f3679x59855622 == null) {
            return false;
        }
        int m8285xcf063785 = m8285xcf063785();
        int scrollX = getScrollX();
        return i17 < 0 ? scrollX > ((int) (((float) m8285xcf063785) * this.f3696x64db70b6)) : i17 > 0 && scrollX < ((int) (((float) m8285xcf063785) * this.f3709x48321316));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: clearOnPageChangeListeners */
    public void m8293xf6d5dd34() {
        java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> list = this.f3718x51652714;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f3704xfb2da7bd = true;
        if (this.f3728xd051bc7.isFinished() || !this.f3728xd051bc7.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3728xd051bc7.getCurrX();
        int currY = this.f3728xd051bc7.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!g(currX)) {
                this.f3728xd051bc7.abortAnimation();
                scrollTo(0, currY);
            }
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(this);
    }

    public final android.graphics.Rect d(android.graphics.Rect rect, android.view.View view) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dataSetChanged */
    public void m8294xd58aab3c() {
        int mo8338x7444f759 = this.f3679x59855622.mo8338x7444f759();
        this.f3692x837879e5 = mo8338x7444f759;
        boolean z17 = this.f3706xbe3b3353.size() < (this.f3716x94fb955e * 2) + 1 && this.f3706xbe3b3353.size() < mo8338x7444f759;
        int i17 = this.f3686xe1320446;
        int i18 = 0;
        boolean z18 = false;
        while (i18 < this.f3706xbe3b3353.size()) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(i18);
            int mo8339xb2fa47d2 = this.f3679x59855622.mo8339xb2fa47d2(itemInfo.f3735xc300a33f);
            if (mo8339xb2fa47d2 != -1) {
                if (mo8339xb2fa47d2 == -2) {
                    this.f3706xbe3b3353.remove(i18);
                    i18--;
                    if (!z18) {
                        this.f3679x59855622.mo7749x93ef97cb((android.view.ViewGroup) this);
                        z18 = true;
                    }
                    this.f3679x59855622.mo7741x89d2022d((android.view.ViewGroup) this, itemInfo.f3737x2c929929, itemInfo.f3735xc300a33f);
                    int i19 = this.f3686xe1320446;
                    if (i19 == itemInfo.f3737x2c929929) {
                        i17 = java.lang.Math.max(0, java.lang.Math.min(i19, mo8338x7444f759 - 1));
                    }
                } else {
                    int i27 = itemInfo.f3737x2c929929;
                    if (i27 != mo8339xb2fa47d2) {
                        if (i27 == this.f3686xe1320446) {
                            i17 = mo8339xb2fa47d2;
                        }
                        itemInfo.f3737x2c929929 = mo8339xb2fa47d2;
                    }
                }
                z17 = true;
            }
            i18++;
        }
        if (z18) {
            this.f3679x59855622.mo7742xa949b73c((android.view.ViewGroup) this);
        }
        java.util.Collections.sort(this.f3706xbe3b3353, f3660xea9138d6);
        if (z17) {
            int childCount = getChildCount();
            for (int i28 = 0; i28 < childCount; i28++) {
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams layoutParams = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) getChildAt(i28).getLayoutParams();
                if (!layoutParams.f93956a) {
                    layoutParams.f93958c = 0.0f;
                }
            }
            m8318x4a1b2347(i17, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m8297xc4041e10(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8304xdee048a1;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 0 && (m8304xdee048a1 = m8304xdee048a1(childAt)) != null && m8304xdee048a1.f3737x2c929929 == this.f3686xe1320446 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: distanceInfluenceForSnapDuration */
    float m8295x52ac447(float f17) {
        return (float) java.lang.Math.sin((f17 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z17 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f3679x59855622) != null && aVar.mo8338x7444f759() > 1)) {
            if (!this.f3710x8b63cdf1.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f3696x64db70b6 * width);
                this.f3710x8b63cdf1.setSize(height, width);
                z17 = false | this.f3710x8b63cdf1.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3726x1d29800c.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f3709x48321316 + 1.0f)) * width2);
                this.f3726x1d29800c.setSize(height2, width2);
                z17 |= this.f3726x1d29800c.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3710x8b63cdf1.finish();
            this.f3726x1d29800c.finish();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f3711xa104e639;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo e() {
        int i17;
        int m8285xcf063785 = m8285xcf063785();
        float f17 = 0.0f;
        float scrollX = m8285xcf063785 > 0 ? getScrollX() / m8285xcf063785 : 0.0f;
        float f18 = m8285xcf063785 > 0 ? this.f3719x1da1656a / m8285xcf063785 : 0.0f;
        int i18 = 0;
        boolean z17 = true;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = null;
        int i19 = -1;
        float f19 = 0.0f;
        while (i18 < this.f3706xbe3b3353.size()) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo2 = this.f3706xbe3b3353.get(i18);
            if (!z17 && itemInfo2.f3737x2c929929 != (i17 = i19 + 1)) {
                itemInfo2 = this.f3730xd628d094;
                itemInfo2.f3736xc3376493 = f17 + f19 + f18;
                itemInfo2.f3737x2c929929 = i17;
                itemInfo2.f3739x5fb326b5 = this.f3679x59855622.m8341x33a68dc1(i17);
                i18--;
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo3 = itemInfo2;
            f17 = itemInfo3.f3736xc3376493;
            float f27 = itemInfo3.f3739x5fb326b5 + f17 + f18;
            if (!z17 && scrollX < f17) {
                return itemInfo;
            }
            if (scrollX < f27 || i18 == this.f3706xbe3b3353.size() - 1) {
                return itemInfo3;
            }
            int i27 = itemInfo3.f3737x2c929929;
            float f28 = itemInfo3.f3739x5fb326b5;
            i18++;
            z17 = false;
            i19 = i27;
            f19 = f28;
            itemInfo = itemInfo3;
        }
        return itemInfo;
    }

    /* renamed from: endFakeDrag */
    public void m8296xcf99a824() {
        if (!this.f3694x7e6f0cd1) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f3679x59855622 != null) {
            android.view.VelocityTracker velocityTracker = this.f3734x7f399f6e;
            velocityTracker.computeCurrentVelocity(1000, this.f3712x4b9066f0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f3678x46f103a5);
            this.f3722xb20bed20 = true;
            int m8285xcf063785 = m8285xcf063785();
            int scrollX = getScrollX();
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo e17 = e();
            m8319x4a1b2347(b(e17.f3737x2c929929, ((scrollX / m8285xcf063785) - e17.f3736xc3376493) / e17.f3739x5fb326b5, xVelocity, (int) (this.f3707x6460593f - this.f3700xa6bf8d4b)), true, true, xVelocity);
        }
        this.f3703x11e573ea = false;
        this.f3705xf135efb9 = false;
        android.view.VelocityTracker velocityTracker2 = this.f3734x7f399f6e;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f3734x7f399f6e = null;
        }
        this.f3694x7e6f0cd1 = false;
    }

    /* renamed from: executeKeyEvent */
    public boolean m8297xc4041e10(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? m8309x33369736() : m8290x6ec85c36(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? m8310x33f2b0cd() : m8290x6ec85c36(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m8290x6ec85c36(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m8290x6ec85c36(1);
                }
            }
        }
        return false;
    }

    /* renamed from: fakeDragBy */
    public void m8298x47a1e860(float f17) {
        if (!this.f3694x7e6f0cd1) {
            throw new java.lang.IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f3679x59855622 == null) {
            return;
        }
        this.f3707x6460593f += f17;
        float scrollX = getScrollX() - f17;
        float m8285xcf063785 = m8285xcf063785();
        float f18 = this.f3696x64db70b6 * m8285xcf063785;
        float f19 = this.f3709x48321316 * m8285xcf063785;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(0);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo2 = this.f3706xbe3b3353.get(r4.size() - 1);
        if (itemInfo.f3737x2c929929 != 0) {
            f18 = itemInfo.f3736xc3376493 * m8285xcf063785;
        }
        if (itemInfo2.f3737x2c929929 != this.f3679x59855622.mo8338x7444f759() - 1) {
            f19 = itemInfo2.f3736xc3376493 * m8285xcf063785;
        }
        if (scrollX < f18) {
            scrollX = f18;
        } else if (scrollX > f19) {
            scrollX = f19;
        }
        int i17 = (int) scrollX;
        this.f3707x6460593f += scrollX - i17;
        scrollTo(i17, getScrollY());
        g(i17);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(this.f3693x97a88200, android.os.SystemClock.uptimeMillis(), 2, this.f3707x6460593f, 0.0f, 0);
        this.f3734x7f399f6e.addMovement(obtain);
        obtain.recycle();
    }

    public final boolean g(int i17) {
        if (this.f3706xbe3b3353.size() == 0) {
            if (this.f3695x5f7f074d) {
                return false;
            }
            this.f3682xbc724f51 = false;
            m8308xf210c75a(0, 0.0f, 0);
            if (this.f3682xbc724f51) {
                return false;
            }
            throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo e17 = e();
        int m8285xcf063785 = m8285xcf063785();
        int i18 = this.f3719x1da1656a;
        int i19 = m8285xcf063785 + i18;
        float f17 = m8285xcf063785;
        int i27 = e17.f3737x2c929929;
        float f18 = ((i17 / f17) - e17.f3736xc3376493) / (e17.f3739x5fb326b5 + (i18 / f17));
        this.f3682xbc724f51 = false;
        m8308xf210c75a(i27, f18, (int) (i19 * f18));
        if (this.f3682xbc724f51) {
            return true;
        }
        throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* renamed from: getAdapter */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19() {
        return this.f3679x59855622;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        if (this.f3689x6d0f5edd == 2) {
            i18 = (i17 - 1) - i18;
        }
        return ((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) this.f3690xdbd9ee5b.get(i18).getLayoutParams()).f93961f;
    }

    /* renamed from: getCurrentItem */
    public int m8300xfda78ef6() {
        return this.f3686xe1320446;
    }

    /* renamed from: getOffscreenPageLimit */
    public int m8301xa9089c07() {
        return this.f3716x94fb955e;
    }

    /* renamed from: getPageMargin */
    public int m8302x2fb02513() {
        return this.f3719x1da1656a;
    }

    public final boolean h(float f17) {
        boolean z17;
        boolean z18;
        float f18 = this.f3707x6460593f - f17;
        this.f3707x6460593f = f17;
        float scrollX = getScrollX() + f18;
        float m8285xcf063785 = m8285xcf063785();
        float f19 = this.f3696x64db70b6 * m8285xcf063785;
        float f27 = this.f3709x48321316 * m8285xcf063785;
        boolean z19 = false;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(0);
        java.util.ArrayList<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo> arrayList = this.f3706xbe3b3353;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.f3737x2c929929 != 0) {
            f19 = itemInfo.f3736xc3376493 * m8285xcf063785;
            z17 = false;
        } else {
            z17 = true;
        }
        if (itemInfo2.f3737x2c929929 != this.f3679x59855622.mo8338x7444f759() - 1) {
            f27 = itemInfo2.f3736xc3376493 * m8285xcf063785;
            z18 = false;
        } else {
            z18 = true;
        }
        if (scrollX < f19) {
            if (z17) {
                this.f3710x8b63cdf1.onPull(java.lang.Math.abs(f19 - scrollX) / m8285xcf063785);
                z19 = true;
            }
            scrollX = f19;
        } else if (scrollX > f27) {
            if (z18) {
                this.f3726x1d29800c.onPull(java.lang.Math.abs(scrollX - f27) / m8285xcf063785);
                z19 = true;
            }
            scrollX = f27;
        }
        int i17 = (int) scrollX;
        this.f3707x6460593f += scrollX - i17;
        scrollTo(i17, getScrollY());
        g(i17);
        return z19;
    }

    public final void i(int i17, int i18, int i19, int i27) {
        if (i18 > 0 && !this.f3706xbe3b3353.isEmpty()) {
            if (!this.f3728xd051bc7.isFinished()) {
                this.f3728xd051bc7.setFinalX(m8300xfda78ef6() * m8285xcf063785());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i18 - getPaddingLeft()) - getPaddingRight()) + i27)) * (((i17 - getPaddingLeft()) - getPaddingRight()) + i19)), getScrollY());
                return;
            }
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8305x1fcddb84 = m8305x1fcddb84(this.f3686xe1320446);
        int min = (int) ((m8305x1fcddb84 != null ? java.lang.Math.min(m8305x1fcddb84.f3736xc3376493, this.f3709x48321316) : 0.0f) * ((i17 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            a(false);
            scrollTo(min, getScrollY());
        }
    }

    /* renamed from: infoForAnyChild */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8303xdcd620eb(android.view.View view) {
        while (true) {
            java.lang.Object parent = view.getParent();
            if (parent == this) {
                return m8304xdee048a1(view);
            }
            if (parent == null || !(parent instanceof android.view.View)) {
                return null;
            }
            view = (android.view.View) parent;
        }
    }

    /* renamed from: infoForChild */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8304xdee048a1(android.view.View view) {
        for (int i17 = 0; i17 < this.f3706xbe3b3353.size(); i17++) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(i17);
            if (this.f3679x59855622.mo7745xc5a713d8(view, itemInfo.f3735xc300a33f)) {
                return itemInfo;
            }
        }
        return null;
    }

    /* renamed from: infoForPosition */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8305x1fcddb84(int i17) {
        for (int i18 = 0; i18 < this.f3706xbe3b3353.size(); i18++) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(i18);
            if (itemInfo.f3737x2c929929 == i17) {
                return itemInfo;
            }
        }
        return null;
    }

    /* renamed from: initViewPager */
    void m8306xfdfb10ee() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        android.content.Context context = getContext();
        this.f3728xd051bc7 = new android.widget.Scroller(context, f3676xab9988da);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f3733x9065cfec = viewConfiguration.getScaledPagingTouchSlop();
        this.f3713x96072de = (int) (400.0f * f17);
        this.f3712x4b9066f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3710x8b63cdf1 = new android.widget.EdgeEffect(context);
        this.f3726x1d29800c = new android.widget.EdgeEffect(context);
        this.f3697x6824ea04 = (int) (25.0f * f17);
        this.f3685x9c234adb = (int) (2.0f * f17);
        this.f3688x797acbf0 = (int) (f17 * 16.0f);
        n3.l1.l(this, new p012xc85e97e9.p114xa324943e.p115xd1075a44.k(this));
        if (n3.u0.c(this) == 0) {
            n3.u0.s(this, 1);
        }
        n3.a1.u(this, new p012xc85e97e9.p114xa324943e.p115xd1075a44.i(this));
    }

    /* renamed from: isFakeDragging */
    public boolean m8307xb978e60e() {
        return this.f3694x7e6f0cd1;
    }

    public final boolean j() {
        this.f3678x46f103a5 = -1;
        this.f3703x11e573ea = false;
        this.f3705xf135efb9 = false;
        android.view.VelocityTracker velocityTracker = this.f3734x7f399f6e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3734x7f399f6e = null;
        }
        this.f3710x8b63cdf1.onRelease();
        this.f3726x1d29800c.onRelease();
        return this.f3710x8b63cdf1.isFinished() || this.f3726x1d29800c.isFinished();
    }

    public final void k(int i17, boolean z17, int i18, boolean z18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8305x1fcddb84 = m8305x1fcddb84(i17);
        int m8285xcf063785 = m8305x1fcddb84 != null ? (int) (m8285xcf063785() * java.lang.Math.max(this.f3696x64db70b6, java.lang.Math.min(m8305x1fcddb84.f3736xc3376493, this.f3709x48321316))) : 0;
        if (z17) {
            m8330xc291bdf6(m8285xcf063785, 0, i18);
            if (z18) {
                c(i17);
                return;
            }
            return;
        }
        if (z18) {
            c(i17);
        }
        a(false);
        scrollTo(m8285xcf063785, 0);
        g(m8285xcf063785);
    }

    public final void l() {
        if (this.f3689x6d0f5edd != 0) {
            java.util.ArrayList<android.view.View> arrayList = this.f3690xdbd9ee5b;
            if (arrayList == null) {
                this.f3690xdbd9ee5b = new java.util.ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                this.f3690xdbd9ee5b.add(getChildAt(i17));
            }
            java.util.Collections.sort(this.f3690xdbd9ee5b, f3677xbb4ec8b2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3695x5f7f074d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3691xbb46c1d8);
        android.widget.Scroller scroller = this.f3728xd051bc7;
        if (scroller != null && !scroller.isFinished()) {
            this.f3728xd051bc7.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        float f17;
        float f18;
        super.onDraw(canvas);
        if (this.f3719x1da1656a <= 0 || this.f3711xa104e639 == null || this.f3706xbe3b3353.size() <= 0 || this.f3679x59855622 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f19 = this.f3719x1da1656a / width;
        int i18 = 0;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(0);
        float f27 = itemInfo.f3736xc3376493;
        int size = this.f3706xbe3b3353.size();
        int i19 = itemInfo.f3737x2c929929;
        int i27 = this.f3706xbe3b3353.get(size - 1).f3737x2c929929;
        while (i19 < i27) {
            while (true) {
                i17 = itemInfo.f3737x2c929929;
                if (i19 <= i17 || i18 >= size) {
                    break;
                }
                i18++;
                itemInfo = this.f3706xbe3b3353.get(i18);
            }
            if (i19 == i17) {
                float f28 = itemInfo.f3736xc3376493;
                float f29 = itemInfo.f3739x5fb326b5;
                f17 = (f28 + f29) * width;
                f27 = f28 + f29 + f19;
            } else {
                float m8341x33a68dc1 = this.f3679x59855622.m8341x33a68dc1(i19);
                f17 = (f27 + m8341x33a68dc1) * width;
                f27 += m8341x33a68dc1 + f19;
            }
            if (this.f3719x1da1656a + f17 > scrollX) {
                f18 = f19;
                this.f3711xa104e639.setBounds(java.lang.Math.round(f17), this.f3732x8ec49dec, java.lang.Math.round(this.f3719x1da1656a + f17), this.f3681x4399a53c);
                this.f3711xa104e639.draw(canvas);
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
            j();
            return false;
        }
        if (action != 0) {
            if (this.f3703x11e573ea) {
                return true;
            }
            if (this.f3705xf135efb9) {
                return false;
            }
        }
        if (action == 0) {
            float x17 = motionEvent.getX();
            this.f3700xa6bf8d4b = x17;
            this.f3707x6460593f = x17;
            float y17 = motionEvent.getY();
            this.f3701xa6bf8d4c = y17;
            this.f3708x64605940 = y17;
            this.f3678x46f103a5 = motionEvent.getPointerId(0);
            this.f3705xf135efb9 = false;
            this.f3704xfb2da7bd = true;
            this.f3728xd051bc7.computeScrollOffset();
            if (this.f3727x24803717 != 2 || java.lang.Math.abs(this.f3728xd051bc7.getFinalX() - this.f3728xd051bc7.getCurrX()) <= this.f3685x9c234adb) {
                a(false);
                this.f3703x11e573ea = false;
            } else {
                this.f3728xd051bc7.abortAnimation();
                this.f3722xb20bed20 = false;
                m8311x281968ea();
                this.f3703x11e573ea = true;
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m8328xeaaee002(1);
            }
        } else if (action == 2) {
            int i17 = this.f3678x46f103a5;
            if (i17 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i17);
                float x18 = motionEvent.getX(findPointerIndex);
                float f17 = x18 - this.f3707x6460593f;
                float abs = java.lang.Math.abs(f17);
                float y18 = motionEvent.getY(findPointerIndex);
                float abs2 = java.lang.Math.abs(y18 - this.f3701xa6bf8d4c);
                if (f17 != 0.0f) {
                    float f18 = this.f3707x6460593f;
                    if (!((f18 < ((float) this.f3698xa627a809) && f17 > 0.0f) || (f18 > ((float) (getWidth() - this.f3698xa627a809)) && f17 < 0.0f)) && mo8292x10136bd(this, false, (int) f17, (int) x18, (int) y18)) {
                        this.f3707x6460593f = x18;
                        this.f3708x64605940 = y18;
                        this.f3705xf135efb9 = true;
                        return false;
                    }
                }
                float f19 = this.f3733x9065cfec;
                if (abs > f19 && abs * 0.5f > abs2) {
                    this.f3703x11e573ea = true;
                    android.view.ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m8328xeaaee002(1);
                    float f27 = this.f3700xa6bf8d4b;
                    float f28 = this.f3733x9065cfec;
                    this.f3707x6460593f = f17 > 0.0f ? f27 + f28 : f27 - f28;
                    this.f3708x64605940 = y18;
                    m8286x1ada10b2(true);
                } else if (abs2 > f19) {
                    this.f3705xf135efb9 = true;
                }
                if (this.f3703x11e573ea && h(x18)) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.u0.k(this);
                }
            }
        } else if (action == 6) {
            f(motionEvent);
        }
        if (this.f3734x7f399f6e == null) {
            this.f3734x7f399f6e = android.view.VelocityTracker.obtain();
        }
        this.f3734x7f399f6e.addMovement(motionEvent);
        return this.f3703x11e573ea;
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams layoutParams;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams layoutParams2;
        int i19;
        setMeasuredDimension(android.view.View.getDefaultSize(0, i17), android.view.View.getDefaultSize(0, i18));
        int measuredWidth = getMeasuredWidth();
        this.f3698xa627a809 = java.lang.Math.min(measuredWidth / 10, this.f3688x797acbf0);
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
            if (childAt.getVisibility() != 8 && (layoutParams2 = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f93956a) {
                int i29 = layoutParams2.f93957b;
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
        this.f3684x608ebb62 = android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f3683x3b186da3 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f3699x2866c3c = true;
        m8311x281968ea();
        this.f3699x2866c3c = false;
        int childCount2 = getChildCount();
        for (int i49 = 0; i49 < childCount2; i49++) {
            android.view.View childAt2 = getChildAt(i49);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f93956a)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f93958c), 1073741824), this.f3683x3b186da3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: onPageScrolled */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m8308xf210c75a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f3687xac79286b
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
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) r9
            boolean r10 = r9.f93956a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f93957b
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
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.f3717x6dfb013f
            if (r0 == 0) goto L72
            r0.mo8332xf210c75a(r13, r14, r15)
        L72:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r12.f3718x51652714
            if (r0 == 0) goto L8d
            int r0 = r0.size()
            r3 = r1
        L7b:
            if (r3 >= r0) goto L8d
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r4 = r12.f3718x51652714
            java.lang.Object r4 = r4.get(r3)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r4 = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener) r4
            if (r4 == 0) goto L8a
            r4.mo8332xf210c75a(r13, r14, r15)
        L8a:
            int r3 = r3 + 1
            goto L7b
        L8d:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.f3702x41b180dd
            if (r0 == 0) goto L94
            r0.mo8332xf210c75a(r13, r14, r15)
        L94:
            androidx.viewpager.widget.m r13 = r12.f3720xa0bee2dd
            if (r13 == 0) goto Lc7
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        La0:
            if (r1 >= r14) goto Lc7
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) r0
            boolean r0 = r0.f93956a
            if (r0 == 0) goto Lb1
            goto Lc4
        Lb1:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.m8285xcf063785()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.m r3 = r12.f3720xa0bee2dd
            hb4.a r3 = (hb4.a) r3
            r3.a(r15, r0)
        Lc4:
            int r1 = r1 + 1
            goto La0
        Lc7:
            r12.f3682xbc724f51 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.m8308xf210c75a(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        int i18;
        int i19;
        int i27;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo m8304xdee048a1;
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
            if (childAt.getVisibility() == 0 && (m8304xdee048a1 = m8304xdee048a1(childAt)) != null && m8304xdee048a1.f3737x2c929929 == this.f3686xe1320446 && childAt.requestFocus(i17, rect)) {
                return true;
            }
            i18 += i27;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.SavedState savedState = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f3679x59855622;
        java.lang.ClassLoader classLoader = savedState.f93964h;
        if (aVar != null) {
            aVar.mo7746x61a06aa3(savedState.f93963g, classLoader);
            m8318x4a1b2347(savedState.f93962f, false, true);
        } else {
            this.f3725xa26404d0 = savedState.f93962f;
            this.f3723xeab7c945 = savedState.f93963g;
            this.f3724x50c08888 = classLoader;
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.SavedState savedState = new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.SavedState(super.onSaveInstanceState());
        savedState.f93962f = this.f3686xe1320446;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f3679x59855622;
        if (aVar != null) {
            savedState.f93963g = aVar.mo7747xa507914();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            int i28 = this.f3719x1da1656a;
            i(i17, i19, i28, i28);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar;
        if (this.f3694x7e6f0cd1) {
            return true;
        }
        boolean z17 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f3679x59855622) == null || aVar.mo8338x7444f759() == 0) {
            return false;
        }
        if (this.f3734x7f399f6e == null) {
            this.f3734x7f399f6e = android.view.VelocityTracker.obtain();
        }
        this.f3734x7f399f6e.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f3728xd051bc7.abortAnimation();
            this.f3722xb20bed20 = false;
            m8311x281968ea();
            float x17 = motionEvent.getX();
            this.f3700xa6bf8d4b = x17;
            this.f3707x6460593f = x17;
            float y17 = motionEvent.getY();
            this.f3701xa6bf8d4c = y17;
            this.f3708x64605940 = y17;
            this.f3678x46f103a5 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f3703x11e573ea) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3678x46f103a5);
                    if (findPointerIndex == -1) {
                        z17 = j();
                    } else {
                        float x18 = motionEvent.getX(findPointerIndex);
                        float abs = java.lang.Math.abs(x18 - this.f3707x6460593f);
                        float y18 = motionEvent.getY(findPointerIndex);
                        float abs2 = java.lang.Math.abs(y18 - this.f3708x64605940);
                        if (abs > this.f3733x9065cfec && abs > abs2) {
                            this.f3703x11e573ea = true;
                            android.view.ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f17 = this.f3700xa6bf8d4b;
                            this.f3707x6460593f = x18 - f17 > 0.0f ? f17 + this.f3733x9065cfec : f17 - this.f3733x9065cfec;
                            this.f3708x64605940 = y18;
                            m8328xeaaee002(1);
                            m8286x1ada10b2(true);
                            android.view.ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f3703x11e573ea) {
                    z17 = false | h(motionEvent.getX(motionEvent.findPointerIndex(this.f3678x46f103a5)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f3707x6460593f = motionEvent.getX(actionIndex);
                    this.f3678x46f103a5 = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    f(motionEvent);
                    this.f3707x6460593f = motionEvent.getX(motionEvent.findPointerIndex(this.f3678x46f103a5));
                }
            } else if (this.f3703x11e573ea) {
                k(this.f3686xe1320446, true, 0, false);
                z17 = j();
            }
        } else if (this.f3703x11e573ea) {
            android.view.VelocityTracker velocityTracker = this.f3734x7f399f6e;
            velocityTracker.computeCurrentVelocity(1000, this.f3712x4b9066f0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f3678x46f103a5);
            this.f3722xb20bed20 = true;
            int m8285xcf063785 = m8285xcf063785();
            int scrollX = getScrollX();
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo e17 = e();
            float f18 = m8285xcf063785;
            m8319x4a1b2347(b(e17.f3737x2c929929, ((scrollX / f18) - e17.f3736xc3376493) / (e17.f3739x5fb326b5 + (this.f3719x1da1656a / f18)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3678x46f103a5)) - this.f3700xa6bf8d4b)), true, true, xVelocity);
            z17 = j();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
        return true;
    }

    /* renamed from: pageLeft */
    boolean m8309x33369736() {
        int i17 = this.f3686xe1320446;
        if (i17 <= 0) {
            return false;
        }
        m8317x940d026a(i17 - 1, true);
        return true;
    }

    /* renamed from: pageRight */
    boolean m8310x33f2b0cd() {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f3679x59855622;
        if (aVar == null || this.f3686xe1320446 >= aVar.mo8338x7444f759() - 1) {
            return false;
        }
        m8317x940d026a(this.f3686xe1320446 + 1, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: populate */
    public void m8311x281968ea() {
        m8312x281968ea(this.f3686xe1320446);
    }

    /* renamed from: removeOnAdapterChangeListener */
    public void m8313xd89903f0(p012xc85e97e9.p114xa324943e.p115xd1075a44.l lVar) {
        java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.l> list = this.f3680x2e101ded;
        if (list != null) {
            list.remove(lVar);
        }
    }

    /* renamed from: removeOnPageChangeListener */
    public void m8314x7cd807d6(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> list = this.f3718x51652714;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (this.f3699x2866c3c) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: setAdapter */
    public void m8315x6cab2c8d(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar2 = this.f3679x59855622;
        if (aVar2 != null) {
            aVar2.m8346x2eeef0d2(null);
            this.f3679x59855622.mo7749x93ef97cb((android.view.ViewGroup) this);
            for (int i17 = 0; i17 < this.f3706xbe3b3353.size(); i17++) {
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo itemInfo = this.f3706xbe3b3353.get(i17);
                this.f3679x59855622.mo7741x89d2022d((android.view.ViewGroup) this, itemInfo.f3737x2c929929, itemInfo.f3735xc300a33f);
            }
            this.f3679x59855622.mo7742xa949b73c((android.view.ViewGroup) this);
            this.f3706xbe3b3353.clear();
            int i18 = 0;
            while (i18 < getChildCount()) {
                if (!((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams) getChildAt(i18).getLayoutParams()).f93956a) {
                    removeViewAt(i18);
                    i18--;
                }
                i18++;
            }
            this.f3686xe1320446 = 0;
            scrollTo(0, 0);
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar3 = this.f3679x59855622;
        this.f3679x59855622 = aVar;
        this.f3692x837879e5 = 0;
        if (aVar != null) {
            if (this.f3715x39c4fa63 == null) {
                this.f3715x39c4fa63 = new p012xc85e97e9.p114xa324943e.p115xd1075a44.n(this);
            }
            this.f3679x59855622.m8346x2eeef0d2(this.f3715x39c4fa63);
            this.f3722xb20bed20 = false;
            boolean z17 = this.f3695x5f7f074d;
            this.f3695x5f7f074d = true;
            this.f3692x837879e5 = this.f3679x59855622.mo8338x7444f759();
            if (this.f3725xa26404d0 >= 0) {
                this.f3679x59855622.mo7746x61a06aa3(this.f3723xeab7c945, this.f3724x50c08888);
                m8318x4a1b2347(this.f3725xa26404d0, false, true);
                this.f3725xa26404d0 = -1;
                this.f3723xeab7c945 = null;
                this.f3724x50c08888 = null;
            } else if (z17) {
                requestLayout();
            } else {
                m8311x281968ea();
            }
        }
        java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.l> list = this.f3680x2e101ded;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f3680x2e101ded.size();
        for (int i19 = 0; i19 < size; i19++) {
            this.f3680x2e101ded.get(i19).a(this, aVar3, aVar);
        }
    }

    /* renamed from: setCurrentItem */
    public void m8316x940d026a(int i17) {
        this.f3722xb20bed20 = false;
        m8318x4a1b2347(i17, !this.f3695x5f7f074d, false);
    }

    /* renamed from: setCurrentItemInternal */
    void m8318x4a1b2347(int i17, boolean z17, boolean z18) {
        m8319x4a1b2347(i17, z17, z18, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: setInternalPageChangeListener */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener m8320x64448492(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener2 = this.f3702x41b180dd;
        this.f3702x41b180dd = onPageChangeListener;
        return onPageChangeListener2;
    }

    /* renamed from: setOffscreenPageLimit */
    public void m8321x40341e13(int i17) {
        if (i17 < 1) {
            i17 = 1;
        }
        if (i17 != this.f3716x94fb955e) {
            this.f3716x94fb955e = i17;
            m8311x281968ea();
        }
    }

    @java.lang.Deprecated
    /* renamed from: setOnPageChangeListener */
    public void m8322x2d3430b4(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener) {
        this.f3717x6dfb013f = onPageChangeListener;
    }

    /* renamed from: setPageMargin */
    public void m8323x5dd4731f(int i17) {
        int i18 = this.f3719x1da1656a;
        this.f3719x1da1656a = i17;
        int width = getWidth();
        i(width, width, i17, i18);
        requestLayout();
    }

    /* renamed from: setPageMarginDrawable */
    public void m8325xce91c8dd(android.graphics.drawable.Drawable drawable) {
        this.f3711xa104e639 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* renamed from: setPageTransformer */
    public void m8326xec491e48(boolean z17, p012xc85e97e9.p114xa324943e.p115xd1075a44.m mVar) {
        m8327xec491e48(z17, mVar, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: setScrollState */
    public void m8328xeaaee002(int i17) {
        if (this.f3727x24803717 == i17) {
            return;
        }
        this.f3727x24803717 = i17;
        if (this.f3720xa0bee2dd != null) {
            boolean z17 = i17 != 0;
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                getChildAt(i18).setLayerType(z17 ? this.f3721x2282edce : 0, null);
            }
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener = this.f3717x6dfb013f;
        if (onPageChangeListener != null) {
            onPageChangeListener.mo8331xcb2941fe(i17);
        }
        java.util.List<p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener> list = this.f3718x51652714;
        if (list != null) {
            int size = list.size();
            for (int i19 = 0; i19 < size; i19++) {
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener2 = this.f3718x51652714.get(i19);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.mo8331xcb2941fe(i17);
                }
            }
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener onPageChangeListener3 = this.f3702x41b180dd;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.mo8331xcb2941fe(i17);
        }
    }

    /* renamed from: smoothScrollTo */
    void m8329xc291bdf6(int i17, int i18) {
        m8330xc291bdf6(i17, i18, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3711xa104e639;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f93956a;

        /* renamed from: b, reason: collision with root package name */
        public final int f93957b;

        /* renamed from: c, reason: collision with root package name */
        public float f93958c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f93959d;

        /* renamed from: e, reason: collision with root package name */
        public int f93960e;

        /* renamed from: f, reason: collision with root package name */
        public int f93961f;

        public LayoutParams() {
            super(-1, -1);
            this.f93958c = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f93958c = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.f3668x449c372d);
            this.f93957b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /* renamed from: populate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m8312x281968ea(int r18) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.m8312x281968ea(int):void");
    }

    /* renamed from: setCurrentItemInternal */
    void m8319x4a1b2347(int i17, boolean z17, boolean z18, int i18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.f3679x59855622;
        if (aVar != null && aVar.mo8338x7444f759() > 0) {
            if (!z18 && this.f3686xe1320446 == i17 && this.f3706xbe3b3353.size() != 0) {
                m8286x1ada10b2(false);
                return;
            }
            if (i17 < 0) {
                i17 = 0;
            } else if (i17 >= this.f3679x59855622.mo8338x7444f759()) {
                i17 = this.f3679x59855622.mo8338x7444f759() - 1;
            }
            int i19 = this.f3716x94fb955e;
            int i27 = this.f3686xe1320446;
            if (i17 > i27 + i19 || i17 < i27 - i19) {
                for (int i28 = 0; i28 < this.f3706xbe3b3353.size(); i28++) {
                    this.f3706xbe3b3353.get(i28).f3738x18e721f5 = true;
                }
            }
            boolean z19 = this.f3686xe1320446 != i17;
            if (this.f3695x5f7f074d) {
                this.f3686xe1320446 = i17;
                if (z19) {
                    c(i17);
                }
                requestLayout();
                return;
            }
            m8312x281968ea(i17);
            k(i17, z17, i18, z19);
            return;
        }
        m8286x1ada10b2(false);
    }

    /* renamed from: setPageTransformer */
    public void m8327xec491e48(boolean z17, p012xc85e97e9.p114xa324943e.p115xd1075a44.m mVar, int i17) {
        boolean z18 = mVar != null;
        boolean z19 = z18 != (this.f3720xa0bee2dd != null);
        this.f3720xa0bee2dd = mVar;
        setChildrenDrawingOrderEnabled(z18);
        if (z18) {
            this.f3689x6d0f5edd = z17 ? 2 : 1;
            this.f3721x2282edce = i17;
        } else {
            this.f3689x6d0f5edd = 0;
        }
        if (z19) {
            m8311x281968ea();
        }
    }

    /* renamed from: smoothScrollTo */
    void m8330xc291bdf6(int i17, int i18, int i19) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            m8286x1ada10b2(false);
            return;
        }
        android.widget.Scroller scroller = this.f3728xd051bc7;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f3704xfb2da7bd ? this.f3728xd051bc7.getCurrX() : this.f3728xd051bc7.getStartX();
            this.f3728xd051bc7.abortAnimation();
            m8286x1ada10b2(false);
        } else {
            scrollX = getScrollX();
        }
        int i27 = scrollX;
        int scrollY = getScrollY();
        int i28 = i17 - i27;
        int i29 = i18 - scrollY;
        if (i28 == 0 && i29 == 0) {
            a(false);
            m8311x281968ea();
            m8328xeaaee002(0);
            return;
        }
        m8286x1ada10b2(true);
        m8328xeaaee002(2);
        int m8285xcf063785 = m8285xcf063785();
        int i37 = m8285xcf063785 / 2;
        float f17 = m8285xcf063785;
        float f18 = i37;
        float m8295x52ac447 = f18 + (m8295x52ac447(java.lang.Math.min(1.0f, (java.lang.Math.abs(i28) * 1.0f) / f17)) * f18);
        int abs2 = java.lang.Math.abs(i19);
        if (abs2 > 0) {
            abs = java.lang.Math.round(java.lang.Math.abs(m8295x52ac447 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((java.lang.Math.abs(i28) / ((f17 * this.f3679x59855622.m8341x33a68dc1(this.f3686xe1320446)) + this.f3719x1da1656a)) + 1.0f) * 100.0f);
        }
        int min = java.lang.Math.min(abs, 600);
        this.f3704xfb2da7bd = false;
        this.f3728xd051bc7.startScroll(i27, scrollY, i28, i29, min);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(this);
    }

    /* renamed from: setCurrentItem */
    public void m8317x940d026a(int i17, boolean z17) {
        this.f3722xb20bed20 = false;
        m8318x4a1b2347(i17, z17, false);
    }

    /* renamed from: setPageMarginDrawable */
    public void m8324xce91c8dd(int i17) {
        m8325xce91c8dd(b3.l.m9707x4a96be14(getContext(), i17));
    }

    public C1190x18d3c3fe(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3706xbe3b3353 = new java.util.ArrayList<>();
        this.f3730xd628d094 = new p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.ItemInfo();
        this.f3731xd62caf65 = new android.graphics.Rect();
        this.f3725xa26404d0 = -1;
        this.f3723xeab7c945 = null;
        this.f3724x50c08888 = null;
        this.f3696x64db70b6 = -3.4028235E38f;
        this.f3709x48321316 = Float.MAX_VALUE;
        this.f3716x94fb955e = 1;
        this.f3678x46f103a5 = -1;
        this.f3695x5f7f074d = true;
        this.f3714x749760ae = false;
        this.f3691xbb46c1d8 = new p012xc85e97e9.p114xa324943e.p115xd1075a44.h(this);
        this.f3727x24803717 = 0;
        m8306xfdfb10ee();
    }
}
