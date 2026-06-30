package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* renamed from: androidx.recyclerview.widget.RecyclerView */
/* loaded from: classes15.dex */
public class C1163xf1deaba4 extends android.view.ViewGroup implements n3.o0, n3.d0 {
    public static final int[] X1 = {android.R.attr.nestedScrollingEnabled};
    public static final int[] Y1 = {android.R.attr.clipToPadding};
    public static final java.lang.Class[] Z1;

    /* renamed from: a2, reason: collision with root package name */
    public static final android.view.animation.Interpolator f93418a2;
    public int A;
    public final float A1;
    public boolean B;
    public boolean B1;
    public boolean C;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.j3 C1;
    public boolean D;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.r0 D1;
    public int E;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.p0 E1;
    public boolean F;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 F1;
    public final android.view.accessibility.AccessibilityManager G;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 G1;
    public java.util.List H;
    public java.util.List H1;
    public boolean I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f93419J;
    public boolean J1;
    public int K;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.l2 K1;
    public int L;
    public boolean L1;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.j2 M;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.m3 M1;
    public android.widget.EdgeEffect N;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.i2 N1;
    public final int[] O1;
    public android.widget.EdgeEffect P;
    public n3.f0 P1;
    public android.widget.EdgeEffect Q;
    public final int[] Q1;
    public android.widget.EdgeEffect R;
    public final int[] R1;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 S;
    public final int[] S1;
    public int T;
    public final int[] T1;
    public int U;
    public final java.util.List U1;
    public android.view.VelocityTracker V;
    public final java.lang.Runnable V1;
    public int W;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.c4 W1;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.b3 f93420d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 f93421e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState f93422f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.c f93423g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.o f93424h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.d4 f93425i;

    /* renamed from: l1, reason: collision with root package name */
    public int f93426l1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f93427m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f93428n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f93429o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f93430p;

    /* renamed from: p0, reason: collision with root package name */
    public int f93431p0;

    /* renamed from: p1, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 f93432p1;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.RectF f93433q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f93434r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f93435s;

    /* renamed from: t, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.a3 f93436t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f93437u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f93438v;

    /* renamed from: w, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 f93439w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f93440x;

    /* renamed from: x0, reason: collision with root package name */
    public int f93441x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int f93442x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f93443y;

    /* renamed from: y0, reason: collision with root package name */
    public int f93444y0;

    /* renamed from: y1, reason: collision with root package name */
    public final int f93445y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f93446z;

    /* renamed from: z1, reason: collision with root package name */
    public final float f93447z1;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager */
    /* loaded from: classes15.dex */
    public static abstract class LayoutManager {

        /* renamed from: mAutoMeasure */
        boolean f3591x8f107e02;

        /* renamed from: mChildHelper */
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o f3592x49f2bd3d;

        /* renamed from: mHeight */
        private int f3593x6a4b7f4;

        /* renamed from: mHeightMode */
        private int f3594x35044bb7;

        /* renamed from: mHorizontalBoundCheck */
        p012xc85e97e9.p103xe821e364.p104xd1075a44.a4 f3595xc73d417b;

        /* renamed from: mHorizontalBoundCheckCallback */
        private final p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 f3596xd0e41ae0;

        /* renamed from: mIsAttachedToWindow */
        boolean f3597xf385e4a6;

        /* renamed from: mItemPrefetchEnabled */
        private boolean f3598x642300a;

        /* renamed from: mMeasurementCacheEnabled */
        private boolean f3599x9faa800e;

        /* renamed from: mPrefetchMaxCountObserved */
        int f3600x5b55db97;

        /* renamed from: mPrefetchMaxObservedInInitialPrefetch */
        boolean f3601xcca70e2e;

        /* renamed from: mRecyclerView */
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f3602x7fa87091;

        /* renamed from: mRequestedSimpleAnimations */
        boolean f3603x188c7062;

        /* renamed from: mSmoothScroller */
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 f3604xc944c9d5;

        /* renamed from: mVerticalBoundCheck */
        p012xc85e97e9.p103xe821e364.p104xd1075a44.a4 f3605x5b593d8d;

        /* renamed from: mVerticalBoundCheckCallback */
        private final p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 f3606xe413e4f2;

        /* renamed from: mWidth */
        private int f3607xbefb7959;

        /* renamed from: mWidthMode */
        private int f3608x77a1d29c;

        public LayoutManager() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.q2 q2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.q2(this);
            this.f3596xd0e41ae0 = q2Var;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.r2 r2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.r2(this);
            this.f3606xe413e4f2 = r2Var;
            this.f3595xc73d417b = new p012xc85e97e9.p103xe821e364.p104xd1075a44.a4(q2Var);
            this.f3605x5b593d8d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.a4(r2Var);
            this.f3603x188c7062 = false;
            this.f3597xf385e4a6 = false;
            this.f3591x8f107e02 = false;
            this.f3599x9faa800e = true;
            this.f3598x642300a = true;
        }

        /* renamed from: addViewInt */
        private void m7977x8ccfff29(android.view.View view, int i17, boolean z17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
            if (z17 || x07.m8195x1e855fd6()) {
                x.b bVar = this.f3602x7fa87091.f93425i.f93533a;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.m174751x4aabfc28(x07, null);
                if (b4Var == null) {
                    b4Var = p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.a();
                    bVar.put(x07, b4Var);
                }
                b4Var.f93500a |= 1;
            } else {
                this.f3602x7fa87091.f93425i.c(x07);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
            if (x07.m8213xd93a794f() || x07.m8196x7b6bf4c7()) {
                if (x07.m8196x7b6bf4c7()) {
                    x07.m8212xedae80b8();
                } else {
                    x07.m8179x969a8877();
                }
                this.f3592x49f2bd3d.b(view, i17, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3602x7fa87091) {
                int j17 = this.f3592x49f2bd3d.j(view);
                if (i17 == -1) {
                    i17 = this.f3592x49f2bd3d.e();
                }
                if (j17 == -1) {
                    throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3602x7fa87091.indexOfChild(view) + this.f3602x7fa87091.i0());
                }
                if (j17 != i17) {
                    this.f3602x7fa87091.f93435s.m8053xf9c79a16(j17, i17);
                }
            } else {
                this.f3592x49f2bd3d.a(view, i17, false);
                layoutParams.f93450f = true;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 g3Var = this.f3604xc944c9d5;
                if (g3Var != null && g3Var.f93586e && g3Var.f93583b.v0(view) == g3Var.f93582a) {
                    g3Var.f93587f = view;
                }
            }
            if (layoutParams.f93451g) {
                x07.f3639x46306858.invalidate();
                layoutParams.f93451g = false;
            }
        }

        /* renamed from: chooseSize */
        public static int m7978x789de6b8(int i17, int i18, int i19) {
            int mode = android.view.View.MeasureSpec.getMode(i17);
            int size = android.view.View.MeasureSpec.getSize(i17);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? java.lang.Math.max(i18, i19) : size : java.lang.Math.min(size, java.lang.Math.max(i18, i19));
        }

        /* renamed from: detachViewInternal */
        private void m7979x365a97b5(int i17, android.view.View view) {
            this.f3592x49f2bd3d.c(i17);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /* renamed from: getChildMeasureSpec */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m7981xa05842f3(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7981xa05842f3(int, int, int, boolean):int");
        }

        /* renamed from: getChildRectangleOnScreenScrollAmount */
        private int[] m7982xa5c88299(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, android.graphics.Rect rect, boolean z17) {
            int[] iArr = new int[2];
            int m8028x805c2682 = m8028x805c2682();
            int m8031xf39fff7a = m8031xf39fff7a();
            int m8037x755bd410 = m8037x755bd410() - m8029x8b7f0b01();
            int m8018x1c4fb41d = m8018x1c4fb41d() - m8026xc96f6de6();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i17 = left - m8028x805c2682;
            int min = java.lang.Math.min(0, i17);
            int i18 = top - m8031xf39fff7a;
            int min2 = java.lang.Math.min(0, i18);
            int i19 = width - m8037x755bd410;
            int max = java.lang.Math.max(0, i19);
            int max2 = java.lang.Math.max(0, height - m8018x1c4fb41d);
            if (m8022x6fcfed3f() != 1) {
                if (min == 0) {
                    min = java.lang.Math.min(i17, max);
                }
                max = min;
            } else if (max == 0) {
                max = java.lang.Math.max(min, i19);
            }
            if (min2 == 0) {
                min2 = java.lang.Math.min(i18, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: getProperties */
        public static p012xc85e97e9.p103xe821e364.p104xd1075a44.t2 m7983xb70e4529(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.t2 t2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.t2();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k4.a.f385493a, i17, i18);
            t2Var.f93760a = obtainStyledAttributes.getInt(0, 1);
            t2Var.f93761b = obtainStyledAttributes.getInt(9, 1);
            t2Var.f93762c = obtainStyledAttributes.getBoolean(8, false);
            t2Var.f93763d = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            return t2Var;
        }

        /* renamed from: isFocusedChildVisibleAfterScrolling */
        private boolean m7984x8ce8759c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
            android.view.View focusedChild = c1163xf1deaba4.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m8028x805c2682 = m8028x805c2682();
            int m8031xf39fff7a = m8031xf39fff7a();
            int m8037x755bd410 = m8037x755bd410() - m8029x8b7f0b01();
            int m8018x1c4fb41d = m8018x1c4fb41d() - m8026xc96f6de6();
            android.graphics.Rect rect = this.f3602x7fa87091.f93429o;
            m8011x8b74aca9(focusedChild, rect);
            return rect.left - i17 < m8037x755bd410 && rect.right - i17 > m8028x805c2682 && rect.top - i18 < m8018x1c4fb41d && rect.bottom - i18 > m8031xf39fff7a;
        }

        /* renamed from: isMeasurementUpToDate */
        private static boolean m7985xaa5ea196(int i17, int i18, int i19) {
            int mode = android.view.View.MeasureSpec.getMode(i18);
            int size = android.view.View.MeasureSpec.getSize(i18);
            if (i19 > 0 && i17 != i19) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i17;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i17;
            }
            return true;
        }

        /* renamed from: scrapOrRecycleView */
        private void m7986x8c10a1a4(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17, android.view.View view) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
            if (x07.m8209xa033ad65()) {
                return;
            }
            if (x07.m8193x5241396d() && !x07.m8195x1e855fd6() && !this.f3602x7fa87091.f93434r.m8145x24a16003()) {
                m8084xd19f9f5c(i17);
                z2Var.j(x07);
            } else {
                m8000xe128f72b(i17);
                z2Var.k(view);
                this.f3602x7fa87091.f93425i.c(x07);
            }
        }

        /* renamed from: addDisappearingView */
        public void mo7987x9bd66365(android.view.View view) {
            m7988x9bd66365(view, -1);
        }

        /* renamed from: addView */
        public void mo7989xbb8aeee6(android.view.View view) {
            m7990xbb8aeee6(view, -1);
        }

        /* renamed from: assertInLayoutOrScroll */
        public void m7991x7c9c1fc5(java.lang.String str) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null || c1163xf1deaba4.E0()) {
                return;
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + c1163xf1deaba4.i0());
            }
            throw new java.lang.IllegalStateException(str + c1163xf1deaba4.i0());
        }

        /* renamed from: assertNotInLayoutOrScroll */
        public void mo7925x48ffb02c(java.lang.String str) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.Q(str);
            }
        }

        /* renamed from: attachView */
        public void m7994x8aecf28a(android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
            if (x07.m8195x1e855fd6()) {
                x.b bVar = this.f3602x7fa87091.f93425i.f93533a;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.m174751x4aabfc28(x07, null);
                if (b4Var == null) {
                    b4Var = p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.a();
                    bVar.put(x07, b4Var);
                }
                b4Var.f93500a |= 1;
            } else {
                this.f3602x7fa87091.f93425i.c(x07);
            }
            this.f3592x49f2bd3d.b(view, i17, layoutParams, x07.m8195x1e855fd6());
        }

        /* renamed from: calculateItemDecorationsForChild */
        public void m7995x142d145d(android.view.View view, android.graphics.Rect rect) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(c1163xf1deaba4.A0(view));
            }
        }

        /* renamed from: canScrollHorizontally */
        public boolean mo2416xc6ea780e() {
            return false;
        }

        /* renamed from: canScrollVertically */
        public boolean getF204840r() {
            return false;
        }

        /* renamed from: checkLayoutParams */
        public boolean mo7909xc6204678(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: collectAdjacentPrefetchPositions */
        public void mo7927x3a789507(int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 s2Var) {
        }

        /* renamed from: collectInitialPrefetchPositions */
        public void mo7928x7cba7099(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 s2Var) {
        }

        /* renamed from: computeHorizontalScrollExtent */
        public int mo7929x8e0c6fb2(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: computeHorizontalScrollOffset */
        public int mo7930x9e19151b(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: computeHorizontalScrollRange */
        public int mo7931x57d657b5(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: computeVerticalScrollExtent */
        public int mo7932xa00e39c4(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: computeVerticalScrollOffset */
        public int mo7933xb01adf2d(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: computeVerticalScrollRange */
        public int mo7934xd44a0363(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: detachAndScrapAttachedViews */
        public void m7996x5201473d(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            for (int m8008x3d79f549 = m8008x3d79f549() - 1; m8008x3d79f549 >= 0; m8008x3d79f549--) {
                m7986x8c10a1a4(z2Var, m8008x3d79f549, m8007x6a486239(m8008x3d79f549));
            }
        }

        /* renamed from: detachAndScrapView */
        public void m7997xeff01532(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            m7986x8c10a1a4(z2Var, this.f3592x49f2bd3d.j(view), view);
        }

        /* renamed from: detachAndScrapViewAt */
        public void m7998xb43f9905(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            m7986x8c10a1a4(z2Var, i17, m8007x6a486239(i17));
        }

        /* renamed from: detachView */
        public void m7999xb7c6c4d8(android.view.View view) {
            int j17 = this.f3592x49f2bd3d.j(view);
            if (j17 >= 0) {
                m7979x365a97b5(j17, view);
            }
        }

        /* renamed from: detachViewAt */
        public void m8000xe128f72b(int i17) {
            m7979x365a97b5(i17, m8007x6a486239(i17));
        }

        /* renamed from: dispatchAttachedToWindow */
        public void m8001xa6f720a9(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
            this.f3597xf385e4a6 = true;
            mo8058xfc50800e(c1163xf1deaba4);
        }

        /* renamed from: dispatchDetachedFromWindow */
        public void m8002x23f7cf66(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            this.f3597xf385e4a6 = false;
            mo7937x8876e98b(c1163xf1deaba4, z2Var);
        }

        /* renamed from: endAnimation */
        public void m8003x2a2878e9(android.view.View view) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var = this.f3602x7fa87091.S;
            if (n2Var != null) {
                n2Var.j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view));
            }
        }

        /* renamed from: findContainingItemView */
        public android.view.View m8004x6417c69f(android.view.View view) {
            android.view.View l07;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null || (l07 = c1163xf1deaba4.l0(view)) == null || this.f3592x49f2bd3d.k(l07)) {
                return null;
            }
            return l07;
        }

        /* renamed from: findViewByPosition */
        public android.view.View mo7935xa188593e(int i17) {
            int m8008x3d79f549 = m8008x3d79f549();
            for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
                android.view.View m8007x6a486239 = m8007x6a486239(i18);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(m8007x6a486239);
                if (x07 != null && x07.m8186xceeefb69() == i17 && !x07.m8209xa033ad65() && (this.f3602x7fa87091.F1.f93598g || !x07.m8195x1e855fd6())) {
                    return m8007x6a486239;
                }
            }
            return null;
        }

        /* renamed from: generateDefaultLayoutParams */
        public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c();

        /* renamed from: generateLayoutParams */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo7911x5663b65(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) {
                return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(layoutParams);
        }

        /* renamed from: getBaseline */
        public int m8005x154923bb() {
            return -1;
        }

        /* renamed from: getBottomDecorationHeight */
        public int m8006xda9e9138(android.view.View view) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e.bottom;
        }

        /* renamed from: getChildAt */
        public android.view.View m8007x6a486239(int i17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.o oVar = this.f3592x49f2bd3d;
            if (oVar != null) {
                return oVar.d(i17);
            }
            return null;
        }

        /* renamed from: getChildCount */
        public int m8008x3d79f549() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.o oVar = this.f3592x49f2bd3d;
            if (oVar != null) {
                return oVar.e();
            }
            return 0;
        }

        /* renamed from: getClipToPadding */
        public boolean m8009xf2b87f0() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            return c1163xf1deaba4 != null && c1163xf1deaba4.f93427m;
        }

        /* renamed from: getColumnCountForAccessibility */
        public int mo7912xed424b48(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null || c1163xf1deaba4.f93434r == null || !mo2416xc6ea780e()) {
                return 1;
            }
            return this.f3602x7fa87091.f93434r.mo1894x7e414b06();
        }

        /* renamed from: getDecoratedBottom */
        public int m8010xd6b039cc(android.view.View view) {
            return view.getBottom() + m8006xda9e9138(view);
        }

        /* renamed from: getDecoratedBoundsWithMargins */
        public void m8011x8b74aca9(android.view.View view, android.graphics.Rect rect) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.z0(view, rect);
        }

        /* renamed from: getDecoratedLeft */
        public int m8012x7f0ab3e8(android.view.View view) {
            return view.getLeft() - m8023xe96e78b9(view);
        }

        /* renamed from: getDecoratedMeasuredHeight */
        public int m8013x8bb7462e(android.view.View view) {
            android.graphics.Rect rect = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: getDecoratedMeasuredWidth */
        public int m8014x2ea13bdf(android.view.View view) {
            android.graphics.Rect rect = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: getDecoratedRight */
        public int m8015x62a22a5b(android.view.View view) {
            return view.getRight() + m8033x269429b0(view);
        }

        /* renamed from: getDecoratedTop */
        public int m8016xfbd72d54(android.view.View view) {
            return view.getTop() - m8035xd0248a36(view);
        }

        /* renamed from: getFocusedChild */
        public android.view.View m8017x74139e5b() {
            android.view.View focusedChild;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null || (focusedChild = c1163xf1deaba4.getFocusedChild()) == null || this.f3592x49f2bd3d.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: getHeight */
        public int m8018x1c4fb41d() {
            return this.f3593x6a4b7f4;
        }

        /* renamed from: getHeightMode */
        public int m8019x47130b60() {
            return this.f3594x35044bb7;
        }

        /* renamed from: getItemCount */
        public int m8020x7e414b06() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
            if (mo7946xf939df19 != null) {
                return mo7946xf939df19.mo1894x7e414b06();
            }
            return 0;
        }

        /* renamed from: getItemViewType */
        public int m8021xcdaf1228(android.view.View view) {
            return p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view).m8185xcdaf1228();
        }

        /* renamed from: getLayoutDirection */
        public int m8022x6fcfed3f() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            return n3.v0.d(c1163xf1deaba4);
        }

        /* renamed from: getLeftDecorationWidth */
        public int m8023xe96e78b9(android.view.View view) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e.left;
        }

        /* renamed from: getMinimumHeight */
        public int m8024x411c071f() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            return n3.u0.d(c1163xf1deaba4);
        }

        /* renamed from: getMinimumWidth */
        public int m8025xa81818ce() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            return n3.u0.e(c1163xf1deaba4);
        }

        /* renamed from: getPaddingBottom */
        public int m8026xc96f6de6() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                return c1163xf1deaba4.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: getPaddingEnd */
        public int m8027xf39fc700() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null) {
                return 0;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            return n3.v0.e(c1163xf1deaba4);
        }

        /* renamed from: getPaddingLeft */
        public int m8028x805c2682() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                return c1163xf1deaba4.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: getPaddingRight */
        public int m8029x8b7f0b01() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                return c1163xf1deaba4.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: getPaddingStart */
        public int m8030x8b920d47() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null) {
                return 0;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            return n3.v0.f(c1163xf1deaba4);
        }

        /* renamed from: getPaddingTop */
        public int m8031xf39fff7a() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                return c1163xf1deaba4.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: getPosition */
        public int m8032xa86cd69f(android.view.View view) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).b();
        }

        /* renamed from: getRightDecorationWidth */
        public int m8033x269429b0(android.view.View view) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e.right;
        }

        /* renamed from: getRowCountForAccessibility */
        public int mo7913x35d87df0(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null || c1163xf1deaba4.f93434r == null || !getF204840r()) {
                return 1;
            }
            return this.f3602x7fa87091.f93434r.mo1894x7e414b06();
        }

        /* renamed from: getSelectionModeForAccessibility */
        public int m8034xf5815abe(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: getTopDecorationHeight */
        public int m8035xd0248a36(android.view.View view) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e.top;
        }

        /* renamed from: getTransformedBoundingBox */
        public void m8036xbfed3a72(android.view.View view, boolean z17, android.graphics.Rect rect) {
            android.graphics.Matrix matrix;
            if (z17) {
                android.graphics.Rect rect2 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3602x7fa87091 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                android.graphics.RectF rectF = this.f3602x7fa87091.f93433q;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: getWidth */
        public int m8037x755bd410() {
            return this.f3607xbefb7959;
        }

        /* renamed from: getWidthMode */
        public int m8038xfc57f9d3() {
            return this.f3608x77a1d29c;
        }

        /* renamed from: hasFlexibleChildInBothOrientations */
        public boolean m8039x4ba86600() {
            int m8008x3d79f549 = m8008x3d79f549();
            for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
                android.view.ViewGroup.LayoutParams layoutParams = m8007x6a486239(i17).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: hasFocus */
        public boolean m8040x702625e() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            return c1163xf1deaba4 != null && c1163xf1deaba4.hasFocus();
        }

        /* renamed from: ignoreView */
        public void m8041x347d7397(android.view.View view) {
            android.view.ViewParent parent = view.getParent();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (parent != c1163xf1deaba4 || c1163xf1deaba4.indexOfChild(view) == -1) {
                throw new java.lang.IllegalArgumentException("View should be fully attached to be ignored" + this.f3602x7fa87091.i0());
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
            x07.m8176xb4f2c266(128);
            this.f3602x7fa87091.f93425i.d(x07);
        }

        /* renamed from: isAttachedToWindow */
        public boolean m8042xf4368959() {
            return this.f3597xf385e4a6;
        }

        /* renamed from: isAutoMeasureEnabled */
        public boolean mo7936xd96f765c() {
            return this.f3591x8f107e02;
        }

        /* renamed from: isFocused */
        public boolean m8043xb440d2ed() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            return c1163xf1deaba4 != null && c1163xf1deaba4.isFocused();
        }

        /* renamed from: isItemPrefetchEnabled */
        public final boolean m8044x9ec9e82d() {
            return this.f3598x642300a;
        }

        /* renamed from: isLayoutHierarchical */
        public boolean m8045x6f51f29d(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return false;
        }

        /* renamed from: isMeasurementCacheEnabled */
        public boolean m8046xbf836eb1() {
            return this.f3599x9faa800e;
        }

        /* renamed from: isSmoothScrolling */
        public boolean m8047xbe6bc15d() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 g3Var = this.f3604xc944c9d5;
            return g3Var != null && g3Var.f93586e;
        }

        /* renamed from: isViewPartiallyVisible */
        public boolean m8048x60786d3(android.view.View view, boolean z17, boolean z18) {
            boolean z19 = this.f3595xc73d417b.b(view, 24579) && this.f3605x5b593d8d.b(view, 24579);
            return z17 ? z19 : !z19;
        }

        /* renamed from: layoutDecorated */
        public void m8049xe4474aed(android.view.View view, int i17, int i18, int i19, int i27) {
            android.graphics.Rect rect = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93449e;
            view.layout(i17 + rect.left, i18 + rect.top, i19 - rect.right, i27 - rect.bottom);
        }

        /* renamed from: layoutDecoratedWithMargins */
        public void m8050xb62e03b2(android.view.View view, int i17, int i18, int i19, int i27) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
            android.graphics.Rect rect = layoutParams.f93449e;
            view.layout(i17 + rect.left + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i18 + rect.top + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i19 - rect.right) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i27 - rect.bottom) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        /* renamed from: measureChild */
        public void mo8051xe81a0a5e(android.view.View view, int i17, int i18) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
            android.graphics.Rect A0 = this.f3602x7fa87091.A0(view);
            int i19 = i17 + A0.left + A0.right;
            int i27 = i18 + A0.top + A0.bottom;
            int m7980xa05842f3 = m7980xa05842f3(m8037x755bd410(), m8038xfc57f9d3(), m8028x805c2682() + m8029x8b7f0b01() + i19, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, mo2416xc6ea780e());
            int m7980xa05842f32 = m7980xa05842f3(m8018x1c4fb41d(), m8019x47130b60(), m8031xf39fff7a() + m8026xc96f6de6() + i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, getF204840r());
            if (m8097x58b67fb1(view, m7980xa05842f3, m7980xa05842f32, layoutParams)) {
                view.measure(m7980xa05842f3, m7980xa05842f32);
            }
        }

        /* renamed from: measureChildWithMargins */
        public void mo8052x6ae7e3a1(android.view.View view, int i17, int i18) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
            android.graphics.Rect A0 = this.f3602x7fa87091.A0(view);
            int i19 = i17 + A0.left + A0.right;
            int i27 = i18 + A0.top + A0.bottom;
            int m7980xa05842f3 = m7980xa05842f3(m8037x755bd410(), m8038xfc57f9d3(), m8028x805c2682() + m8029x8b7f0b01() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i19, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, mo2416xc6ea780e());
            int m7980xa05842f32 = m7980xa05842f3(m8018x1c4fb41d(), m8019x47130b60(), m8031xf39fff7a() + m8026xc96f6de6() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, getF204840r());
            if (m8097x58b67fb1(view, m7980xa05842f3, m7980xa05842f32, layoutParams)) {
                view.measure(m7980xa05842f3, m7980xa05842f32);
            }
        }

        /* renamed from: moveView */
        public void m8053xf9c79a16(int i17, int i18) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null) {
                m8000xe128f72b(i17);
                m7993x8aecf28a(m8007x6a486239, i18);
            } else {
                throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + i17 + this.f3602x7fa87091.toString());
            }
        }

        /* renamed from: offsetChildrenHorizontal */
        public void mo8054x8cefd576(int i17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                int e17 = c1163xf1deaba4.f93424h.e();
                for (int i18 = 0; i18 < e17; i18++) {
                    c1163xf1deaba4.f93424h.d(i18).offsetLeftAndRight(i17);
                }
            }
        }

        /* renamed from: offsetChildrenVertical */
        public void mo8055xe23cdd48(int i17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                int e17 = c1163xf1deaba4.f93424h.e();
                for (int i18 = 0; i18 < e17; i18++) {
                    c1163xf1deaba4.f93424h.d(i18).offsetTopAndBottom(i17);
                }
            }
        }

        /* renamed from: onAdapterChanged */
        public void mo8056xff347824(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var2) {
        }

        /* renamed from: onAddFocusables */
        public boolean mo8057xf63fac63(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, java.util.ArrayList<android.view.View> arrayList, int i17, int i18) {
            return false;
        }

        /* renamed from: onAttachedToWindow */
        public void mo8058xfc50800e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        }

        @java.lang.Deprecated
        /* renamed from: onDetachedFromWindow */
        public void m8059x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        }

        /* renamed from: onFocusSearchFailed */
        public android.view.View mo7914x990cf8de(android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return null;
        }

        /* renamed from: onInitializeAccessibilityEvent */
        public void mo7938x9d5dd31b(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            m8060x9d5dd31b(c1163xf1deaba4.f93421e, c1163xf1deaba4.F1, accessibilityEvent);
        }

        /* renamed from: onInitializeAccessibilityNodeInfo */
        public void m8062x1bd2f9af(o3.l lVar) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            m8061x1bd2f9af(c1163xf1deaba4.f93421e, c1163xf1deaba4.F1, lVar);
        }

        /* renamed from: onInitializeAccessibilityNodeInfoForItem */
        public void m8063x96481acd(android.view.View view, o3.l lVar) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
            if (x07 == null || x07.m8195x1e855fd6() || this.f3592x49f2bd3d.k(x07.f3639x46306858)) {
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            mo7915x96481acd(c1163xf1deaba4.f93421e, c1163xf1deaba4.F1, view, lVar);
        }

        /* renamed from: onInterceptFocusSearch */
        public android.view.View m8064xfddf1afd(android.view.View view, int i17) {
            return null;
        }

        /* renamed from: onItemsAdded */
        public void mo7916x721d405f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        }

        /* renamed from: onItemsChanged */
        public void mo7917xd0486653(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        }

        /* renamed from: onItemsMoved */
        public void mo7918x72cb9e12(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, int i19) {
        }

        /* renamed from: onItemsRemoved */
        public void mo7919xe5511bff(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        }

        /* renamed from: onItemsUpdated */
        public void mo8065x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        }

        /* renamed from: onLayoutChildren */
        public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        }

        /* renamed from: onLayoutCompleted */
        public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        }

        /* renamed from: onMeasure */
        public void mo8066x8793a67f(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17, int i18) {
            this.f3602x7fa87091.V(i17, i18);
        }

        @java.lang.Deprecated
        /* renamed from: onRequestChildFocus */
        public boolean m8067x291134ec(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, android.view.View view2) {
            return m8047xbe6bc15d() || c1163xf1deaba4.E0();
        }

        /* renamed from: onRestoreInstanceState */
        public void mo7939xb949e58d(android.os.Parcelable parcelable) {
        }

        /* renamed from: onSaveInstanceState */
        public android.os.Parcelable mo7940xa71a2260() {
            return null;
        }

        /* renamed from: onScrollStateChanged */
        public void mo8069x4d79408f(int i17) {
        }

        /* renamed from: onSmoothScrollerStopped */
        public void m8070xe1c0c406(p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 g3Var) {
            if (this.f3604xc944c9d5 == g3Var) {
                this.f3604xc944c9d5 = null;
            }
        }

        /* renamed from: performAccessibilityAction */
        public boolean m8071xcdbe3403(int i17, android.os.Bundle bundle) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            return m8072xcdbe3403(c1163xf1deaba4.f93421e, c1163xf1deaba4.F1, i17, bundle);
        }

        /* renamed from: performAccessibilityActionForItem */
        public boolean m8074x100a59f9(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, android.view.View view, int i17, android.os.Bundle bundle) {
            return false;
        }

        /* renamed from: postOnAnimation */
        public void m8075x84c2c3a5(java.lang.Runnable runnable) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.u0.m(c1163xf1deaba4, runnable);
            }
        }

        /* renamed from: removeAllViews */
        public void m8076xba225f1() {
            for (int m8008x3d79f549 = m8008x3d79f549() - 1; m8008x3d79f549 >= 0; m8008x3d79f549--) {
                this.f3592x49f2bd3d.l(m8008x3d79f549);
            }
        }

        /* renamed from: removeAndRecycleAllViews */
        public void m8077x28b7b1cd(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            for (int m8008x3d79f549 = m8008x3d79f549() - 1; m8008x3d79f549 >= 0; m8008x3d79f549--) {
                if (!p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(m8007x6a486239(m8008x3d79f549)).m8209xa033ad65()) {
                    m8080x531e7238(m8008x3d79f549, z2Var);
                }
            }
        }

        /* renamed from: removeAndRecycleScrapInt */
        public void m8078xa54f9ede(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            int size = z2Var.f93842a.size();
            for (int i17 = size - 1; i17 >= 0; i17--) {
                android.view.View view = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) z2Var.f93842a.get(i17)).f3639x46306858;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
                if (!x07.m8209xa033ad65()) {
                    x07.m8206x3c5056b8(false);
                    if (x07.m8197x46e8461f()) {
                        this.f3602x7fa87091.removeDetachedView(view, false);
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var = this.f3602x7fa87091.S;
                    if (n2Var != null) {
                        n2Var.j(x07);
                    }
                    x07.m8206x3c5056b8(true);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x08 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
                    x08.f3652xd0d8697d = null;
                    x08.f3641x7d3c7c2f = false;
                    x08.m8179x969a8877();
                    z2Var.j(x08);
                }
            }
            z2Var.f93842a.clear();
            java.util.ArrayList arrayList = z2Var.f93843b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f3602x7fa87091.invalidate();
            }
        }

        /* renamed from: removeAndRecycleView */
        public void m8079xef099f25(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            m8083x417bc549(view);
            z2Var.i(view);
        }

        /* renamed from: removeAndRecycleViewAt */
        public void m8080x531e7238(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            m8084xd19f9f5c(i17);
            z2Var.i(m8007x6a486239);
        }

        /* renamed from: removeCallbacks */
        public boolean m8081x3fa464aa(java.lang.Runnable runnable) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                return c1163xf1deaba4.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: removeDetachedView */
        public void m8082x9765d7db(android.view.View view) {
            this.f3602x7fa87091.removeDetachedView(view, false);
        }

        /* renamed from: removeView */
        public void m8083x417bc549(android.view.View view) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.o oVar = this.f3592x49f2bd3d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) oVar.f93705a;
            int indexOfChild = d2Var.f93532a.indexOfChild(view);
            if (indexOfChild < 0) {
                return;
            }
            if (oVar.f93706b.f(indexOfChild)) {
                oVar.m(view);
            }
            d2Var.b(indexOfChild);
        }

        /* renamed from: removeViewAt */
        public void m8084xd19f9f5c(int i17) {
            if (m8007x6a486239(i17) != null) {
                this.f3592x49f2bd3d.l(i17);
            }
        }

        /* renamed from: requestChildRectangleOnScreen */
        public boolean m8085xd6c2296d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, android.graphics.Rect rect, boolean z17) {
            return m8086xd6c2296d(c1163xf1deaba4, view, rect, z17, false);
        }

        /* renamed from: requestLayout */
        public void m8087x46ac7299() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.requestLayout();
            }
        }

        /* renamed from: requestSimpleAnimationsInNextLayout */
        public void mo8088xe9400092() {
            this.f3603x188c7062 = true;
        }

        /* renamed from: scrollHorizontallyBy */
        public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        /* renamed from: scrollToPosition */
        public void mo2420xc593c771(int i17) {
        }

        /* renamed from: scrollVerticallyBy */
        public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
            return 0;
        }

        @java.lang.Deprecated
        /* renamed from: setAutoMeasureEnabled */
        public void mo8089xb148c794(boolean z17) {
            this.f3591x8f107e02 = z17;
        }

        /* renamed from: setExactMeasureSpecsFrom */
        public void m8090x332c9a01(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
            m8092x803aa2dc(android.view.View.MeasureSpec.makeMeasureSpec(c1163xf1deaba4.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(c1163xf1deaba4.getHeight(), 1073741824));
        }

        /* renamed from: setItemPrefetchEnabled */
        public final void m8091xc21abdf5(boolean z17) {
            if (z17 != this.f3598x642300a) {
                this.f3598x642300a = z17;
                this.f3600x5b55db97 = 0;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.f93421e.o();
                }
            }
        }

        /* renamed from: setMeasureSpecs */
        public void m8092x803aa2dc(int i17, int i18) {
            this.f3607xbefb7959 = android.view.View.MeasureSpec.getSize(i17);
            int mode = android.view.View.MeasureSpec.getMode(i17);
            this.f3608x77a1d29c = mode;
            if (mode == 0) {
                int[] iArr = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.X1;
            }
            this.f3593x6a4b7f4 = android.view.View.MeasureSpec.getSize(i18);
            int mode2 = android.view.View.MeasureSpec.getMode(i18);
            this.f3594x35044bb7 = mode2;
            if (mode2 == 0) {
                int[] iArr2 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.X1;
            }
        }

        /* renamed from: setMeasuredDimension */
        public void mo7923xd88558fe(android.graphics.Rect rect, int i17, int i18) {
            mo8093xd88558fe(m7978x789de6b8(i17, rect.width() + m8028x805c2682() + m8029x8b7f0b01(), m8025xa81818ce()), m7978x789de6b8(i18, rect.height() + m8031xf39fff7a() + m8026xc96f6de6(), m8024x411c071f()));
        }

        /* renamed from: setMeasuredDimensionFromChildren */
        public void m8094xc56cafe7(int i17, int i18) {
            int m8008x3d79f549 = m8008x3d79f549();
            if (m8008x3d79f549 == 0) {
                this.f3602x7fa87091.V(i17, i18);
                return;
            }
            int i19 = Integer.MIN_VALUE;
            int i27 = Integer.MAX_VALUE;
            int i28 = Integer.MIN_VALUE;
            int i29 = Integer.MAX_VALUE;
            for (int i37 = 0; i37 < m8008x3d79f549; i37++) {
                android.view.View m8007x6a486239 = m8007x6a486239(i37);
                android.graphics.Rect rect = this.f3602x7fa87091.f93429o;
                m8011x8b74aca9(m8007x6a486239, rect);
                int i38 = rect.left;
                if (i38 < i29) {
                    i29 = i38;
                }
                int i39 = rect.right;
                if (i39 > i19) {
                    i19 = i39;
                }
                int i47 = rect.top;
                if (i47 < i27) {
                    i27 = i47;
                }
                int i48 = rect.bottom;
                if (i48 > i28) {
                    i28 = i48;
                }
            }
            this.f3602x7fa87091.f93429o.set(i29, i27, i19, i28);
            mo7923xd88558fe(this.f3602x7fa87091.f93429o, i17, i18);
        }

        /* renamed from: setMeasurementCacheEnabled */
        public void m8095x7f642079(boolean z17) {
            this.f3599x9faa800e = z17;
        }

        /* renamed from: setRecyclerView */
        public void m8096x7f4ee506(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
            if (c1163xf1deaba4 == null) {
                this.f3602x7fa87091 = null;
                this.f3592x49f2bd3d = null;
                this.f3607xbefb7959 = 0;
                this.f3593x6a4b7f4 = 0;
            } else {
                this.f3602x7fa87091 = c1163xf1deaba4;
                this.f3592x49f2bd3d = c1163xf1deaba4.f93424h;
                this.f3607xbefb7959 = c1163xf1deaba4.getWidth();
                this.f3593x6a4b7f4 = c1163xf1deaba4.getHeight();
            }
            this.f3608x77a1d29c = 1073741824;
            this.f3594x35044bb7 = 1073741824;
        }

        /* renamed from: shouldMeasureChild */
        public boolean m8097x58b67fb1(android.view.View view, int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.f3599x9faa800e && m7985xaa5ea196(view.getWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && m7985xaa5ea196(view.getHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: shouldMeasureTwice */
        public boolean mo7941x59acdfbd() {
            return false;
        }

        /* renamed from: shouldReMeasureChild */
        public boolean m8098x5baf24c4(android.view.View view, int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
            return (this.f3599x9faa800e && m7985xaa5ea196(view.getMeasuredWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && m7985xaa5ea196(view.getMeasuredHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: smoothScrollToPosition */
        public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        }

        /* renamed from: startSmoothScroll */
        public void m8099x6305639d(p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 g3Var) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 g3Var2 = this.f3604xc944c9d5;
            if (g3Var2 != null && g3Var != g3Var2 && g3Var2.f93586e) {
                g3Var2.f();
            }
            this.f3604xc944c9d5 = g3Var;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            g3Var.f93583b = c1163xf1deaba4;
            g3Var.f93584c = this;
            int i17 = g3Var.f93582a;
            if (i17 == -1) {
                throw new java.lang.IllegalArgumentException("Invalid target position");
            }
            c1163xf1deaba4.F1.f93592a = i17;
            g3Var.f93586e = true;
            g3Var.f93585d = true;
            g3Var.f93587f = c1163xf1deaba4.f93435s.mo7935xa188593e(i17);
            g3Var.c();
            g3Var.f93583b.C1.b();
        }

        /* renamed from: stopIgnoringView */
        public void m8100x65946676(android.view.View view) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
            x07.m8210x60153831();
            x07.m8203xd801892c();
            x07.m8176xb4f2c266(4);
        }

        /* renamed from: stopSmoothScroller */
        public void m8101x7f9768aa() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 g3Var = this.f3604xc944c9d5;
            if (g3Var != null) {
                g3Var.f();
            }
        }

        /* renamed from: supportsPredictiveItemAnimations */
        public boolean mo7924x9f0306c5() {
            return false;
        }

        /* renamed from: addDisappearingView */
        public void m7988x9bd66365(android.view.View view, int i17) {
            m7977x8ccfff29(view, i17, true);
        }

        /* renamed from: addView */
        public void m7990xbb8aeee6(android.view.View view, int i17) {
            m7977x8ccfff29(view, i17, false);
        }

        /* renamed from: onDetachedFromWindow */
        public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
            m8059x8876e98b(c1163xf1deaba4);
        }

        /* renamed from: onInitializeAccessibilityEvent */
        public void m8060x9d5dd31b(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null || accessibilityEvent == null) {
                return;
            }
            boolean z17 = true;
            if (!c1163xf1deaba4.canScrollVertically(1) && !this.f3602x7fa87091.canScrollVertically(-1) && !this.f3602x7fa87091.canScrollHorizontally(-1) && !this.f3602x7fa87091.canScrollHorizontally(1)) {
                z17 = false;
            }
            accessibilityEvent.setScrollable(z17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f3602x7fa87091.f93434r;
            if (f2Var != null) {
                accessibilityEvent.setItemCount(f2Var.mo1894x7e414b06());
            }
        }

        /* renamed from: onInitializeAccessibilityNodeInfo */
        public void m8061x1bd2f9af(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, o3.l lVar) {
            if (this.f3602x7fa87091.canScrollVertically(-1) || this.f3602x7fa87091.canScrollHorizontally(-1)) {
                lVar.a(8192);
                lVar.t(true);
            }
            if (this.f3602x7fa87091.canScrollVertically(1) || this.f3602x7fa87091.canScrollHorizontally(1)) {
                lVar.a(4096);
                lVar.t(true);
            }
            android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(mo7913x35d87df0(z2Var, h3Var), mo7912xed424b48(z2Var, h3Var), m8045x6f51f29d(z2Var, h3Var), m8034xf5815abe(z2Var, h3Var));
            lVar.getClass();
            lVar.f424175a.setCollectionInfo(obtain);
        }

        /* renamed from: onItemsUpdated */
        public void mo7920x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, java.lang.Object obj) {
            mo8065x9643e45a(c1163xf1deaba4, i17, i18);
        }

        /* renamed from: onRequestChildFocus */
        public boolean m8068x291134ec(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, android.view.View view, android.view.View view2) {
            return m8067x291134ec(c1163xf1deaba4, view, view2);
        }

        /* renamed from: performAccessibilityAction */
        public boolean m8072xcdbe3403(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17, android.os.Bundle bundle) {
            int m8018x1c4fb41d;
            int m8037x755bd410;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            if (c1163xf1deaba4 == null) {
                return false;
            }
            if (i17 == 4096) {
                m8018x1c4fb41d = c1163xf1deaba4.canScrollVertically(1) ? (m8018x1c4fb41d() - m8031xf39fff7a()) - m8026xc96f6de6() : 0;
                if (this.f3602x7fa87091.canScrollHorizontally(1)) {
                    m8037x755bd410 = (m8037x755bd410() - m8028x805c2682()) - m8029x8b7f0b01();
                }
                m8037x755bd410 = 0;
            } else if (i17 != 8192) {
                m8018x1c4fb41d = 0;
                m8037x755bd410 = 0;
            } else {
                m8018x1c4fb41d = c1163xf1deaba4.canScrollVertically(-1) ? -((m8018x1c4fb41d() - m8031xf39fff7a()) - m8026xc96f6de6()) : 0;
                if (this.f3602x7fa87091.canScrollHorizontally(-1)) {
                    m8037x755bd410 = -((m8037x755bd410() - m8028x805c2682()) - m8029x8b7f0b01());
                }
                m8037x755bd410 = 0;
            }
            if (m8018x1c4fb41d == 0 && m8037x755bd410 == 0) {
                return false;
            }
            this.f3602x7fa87091.mo7976xc291bbd2(m8037x755bd410, m8018x1c4fb41d);
            return true;
        }

        /* renamed from: performAccessibilityActionForItem */
        public boolean m8073x100a59f9(android.view.View view, int i17, android.os.Bundle bundle) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3602x7fa87091;
            return m8074x100a59f9(c1163xf1deaba4.f93421e, c1163xf1deaba4.F1, view, i17, bundle);
        }

        /* renamed from: requestChildRectangleOnScreen */
        public boolean m8086xd6c2296d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, android.graphics.Rect rect, boolean z17, boolean z18) {
            int[] m7982xa5c88299 = m7982xa5c88299(c1163xf1deaba4, view, rect, z17);
            int i17 = m7982xa5c88299[0];
            int i18 = m7982xa5c88299[1];
            if ((z18 && !m7984x8ce8759c(c1163xf1deaba4, i17, i18)) || (i17 == 0 && i18 == 0)) {
                return false;
            }
            if (z17) {
                c1163xf1deaba4.scrollBy(i17, i18);
            } else {
                c1163xf1deaba4.mo7976xc291bbd2(i17, i18);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /* renamed from: getChildMeasureSpec */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m7980xa05842f3(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(int, int, int, int, boolean):int");
        }

        /* renamed from: onInitializeAccessibilityNodeInfoForItem */
        public void mo7915x96481acd(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, android.view.View view, o3.l lVar) {
            lVar.o(o3.k.a(getF204840r() ? m8032xa86cd69f(view) : 0, 1, mo2416xc6ea780e() ? m8032xa86cd69f(view) : 0, 1, false, false));
        }

        /* renamed from: generateLayoutParams */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo7910x5663b65(android.content.Context context, android.util.AttributeSet attributeSet) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(context, attributeSet);
        }

        /* renamed from: setMeasuredDimension */
        public void mo8093xd88558fe(int i17, int i18) {
            this.f3602x7fa87091.setMeasuredDimension(i17, i18);
        }

        /* renamed from: attachView */
        public void m7993x8aecf28a(android.view.View view, int i17) {
            m7994x8aecf28a(view, i17, (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams());
        }

        /* renamed from: attachView */
        public void m7992x8aecf28a(android.view.View view) {
            m7993x8aecf28a(view, -1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState> f3609x681a0c0c = new p012xc85e97e9.p103xe821e364.p104xd1075a44.c3();

        /* renamed from: f, reason: collision with root package name */
        public android.os.Parcelable f93452f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f93452f = parcel.readParcelable(classLoader == null ? p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeParcelable(this.f93452f, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes5.dex */
    public interface a {
        void R3(android.view.View view);

        void p3(android.view.View view);
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        Z1 = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        f93418a2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.b2();
    }

    public C1163xf1deaba4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void R(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.ref.WeakReference<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4> weakReference = k3Var.f3645x8e83ad68;
        if (weakReference != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = weakReference.get();
            while (c1163xf1deaba4 != null) {
                if (c1163xf1deaba4 == k3Var.f3639x46306858) {
                    return;
                }
                java.lang.Object parent = c1163xf1deaba4.getParent();
                c1163xf1deaba4 = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            k3Var.f3645x8e83ad68 = null;
        }
    }

    private void X0() {
        android.view.VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z17 = false;
        p(0);
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z17 = this.N.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.P;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z17 |= this.P.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z17 |= this.Q.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z17 |= this.R.isFinished();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    /* renamed from: getScrollingChildHelper */
    private n3.f0 m7945x1528932b() {
        if (this.P1 == null) {
            this.P1 = new n3.f0(this);
        }
        return this.P1;
    }

    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o0(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o07 = o0(viewGroup.getChildAt(i17));
            if (o07 != null) {
                return o07;
            }
        }
        return null;
    }

    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x0(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).f93448d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z0(android.view.View view, android.graphics.Rect rect) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect2 = layoutParams.f93449e;
        rect.set((view.getLeft() - rect2.left) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    android.graphics.Rect A0(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        boolean z17 = layoutParams.f93450f;
        android.graphics.Rect rect = layoutParams.f93449e;
        if (!z17) {
            return rect;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = this.F1;
        if (h3Var.f93598g && (layoutParams.c() || layoutParams.f93448d.m8193x5241396d())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        java.util.ArrayList arrayList = this.f93437u;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.graphics.Rect rect2 = this.f93429o;
            rect2.set(0, 0, 0, 0);
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.p2) arrayList.get(i17)).mo7902x5db88677(rect2, view, this, h3Var);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f93450f = false;
        return rect;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 B0(int i17) {
        int m7950x883dc776 = m7950x883dc776();
        if (i17 >= 0 && i17 < m7950x883dc776) {
            return (p012xc85e97e9.p103xe821e364.p104xd1075a44.p2) this.f93437u.get(i17);
        }
        throw new java.lang.IndexOutOfBoundsException(i17 + " is an invalid index for size " + m7950x883dc776);
    }

    public boolean C0(int i17) {
        return m7945x1528932b().h(i17);
    }

    public void D0() {
        if (this.f93437u.size() == 0) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            layoutManager.mo7925x48ffb02c("Cannot invalidate item decorations during a scroll or layout");
        }
        G0();
        requestLayout();
    }

    public boolean E0() {
        return this.K > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F0(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "androidx/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(layoutManager, "androidx/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        awakenScrollBars();
    }

    void G0() {
        int h17 = this.f93424h.h();
        for (int i17 = 0; i17 < h17; i17++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) this.f93424h.g(i17).getLayoutParams()).f93450f = true;
        }
        java.util.ArrayList arrayList = this.f93421e.f93844c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(i18)).f3639x46306858.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f93450f = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H0(int i17, int i18, boolean z17) {
        int i19 = i17 + i18;
        int h17 = this.f93424h.h();
        for (int i27 = 0; i27 < h17; i27++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(this.f93424h.g(i27));
            if (x07 != null && !x07.m8209xa033ad65()) {
                int i28 = x07.f3650x519040b6;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = this.F1;
                if (i28 >= i19) {
                    x07.m8200xab4c1edc(-i18, z17);
                    h3Var.f93597f = true;
                } else if (i28 >= i17) {
                    x07.m8182x627c739f(i17 - 1, -i18, z17);
                    h3Var.f93597f = true;
                }
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = this.f93421e;
        java.util.ArrayList arrayList = z2Var.f93844c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(size);
            if (k3Var != null) {
                int i29 = k3Var.f3650x519040b6;
                if (i29 >= i19) {
                    k3Var.m8200xab4c1edc(-i18, z17);
                } else if (i29 >= i17) {
                    k3Var.m8176xb4f2c266(8);
                    z2Var.h(size);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I0() {
        this.K++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(boolean z17) {
        int i17;
        int i18 = this.K - 1;
        this.K = i18;
        if (i18 < 1) {
            this.K = 0;
            if (z17) {
                int i19 = this.E;
                this.E = 0;
                if (i19 != 0) {
                    android.view.accessibility.AccessibilityManager accessibilityManager = this.G;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        o3.b.b(obtain, i19);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) this.U1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(size);
                    if (k3Var.f3639x46306858.getParent() == this && !k3Var.m8209xa033ad65() && (i17 = k3Var.f3649x172925ed) != -1) {
                        android.view.View view = k3Var.f3639x46306858;
                        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                        n3.u0.s(view, i17);
                        k3Var.f3649x172925ed = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void K0(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.U = motionEvent.getPointerId(i17);
            int x17 = (int) (motionEvent.getX(i17) + 0.5f);
            this.f93441x0 = x17;
            this.W = x17;
            int y17 = (int) (motionEvent.getY(i17) + 0.5f);
            this.f93444y0 = y17;
            this.f93431p0 = y17;
        }
    }

    public void L0(int i17) {
    }

    public final void M(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view = k3Var.f3639x46306858;
        boolean z17 = view.getParent() == this;
        this.f93421e.n(w0(view));
        if (k3Var.m8197x46e8461f()) {
            this.f93424h.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z17) {
            this.f93424h.a(view, -1, true);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o oVar = this.f93424h;
        int indexOfChild = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) oVar.f93705a).f93532a.indexOfChild(view);
        if (indexOfChild >= 0) {
            oVar.f93706b.h(indexOfChild);
            oVar.i(view);
        } else {
            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void M0(int i17, int i18) {
    }

    public void N(p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 p2Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            layoutManager.mo7925x48ffb02c("Cannot add item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.f93437u;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(p2Var);
        G0();
        requestLayout();
    }

    void N0() {
        if (this.L1 || !this.f93440x) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(this, this.V1);
        this.L1 = true;
    }

    public void O(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a aVar) {
        if (this.H == null) {
            this.H = new java.util.ArrayList();
        }
        this.H.add(aVar);
    }

    public final void O0() {
        boolean z17;
        boolean z18 = false;
        if (this.I) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = this.f93423g;
            cVar.l(cVar.f93504b);
            cVar.l(cVar.f93505c);
            cVar.f93508f = 0;
            if (this.f93419J) {
                this.f93435s.mo7917xd0486653(this);
            }
        }
        if (this.S != null && this.f93435s.mo7924x9f0306c5()) {
            this.f93423g.j();
        } else {
            this.f93423g.c();
        }
        boolean z19 = this.I1 || this.J1;
        boolean z27 = this.f93446z && this.S != null && ((z17 = this.I) || z19 || this.f93435s.f3603x188c7062) && (!z17 || this.f93434r.m8145x24a16003());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = this.F1;
        h3Var.f93601j = z27;
        if (z27 && z19 && !this.I) {
            if (this.S != null && this.f93435s.mo7924x9f0306c5()) {
                z18 = true;
            }
        }
        h3Var.f93602k = z18;
    }

    public void P(p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var) {
        this.f93438v.add(v2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0(boolean z17) {
        this.f93419J = z17 | this.f93419J;
        this.I = true;
        int h17 = this.f93424h.h();
        for (int i17 = 0; i17 < h17; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(this.f93424h.g(i17));
            if (x07 != null && !x07.m8209xa033ad65()) {
                x07.m8176xb4f2c266(6);
            }
        }
        G0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = this.f93421e;
        java.util.ArrayList arrayList = z2Var.f93844c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(i18);
            if (k3Var != null) {
                k3Var.m8176xb4f2c266(6);
                k3Var.m8175x92fd649d(null);
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = z2Var.f93850i.f93434r;
        if (f2Var == null || !f2Var.m8145x24a16003()) {
            z2Var.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(java.lang.String str) {
        if (E0()) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + i0());
        }
        if (this.L > 0) {
            new java.lang.IllegalStateException("" + i0());
        }
    }

    public void Q0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var) {
        k3Var.m8205x52fbaf45(0, 8192);
        boolean z17 = this.F1.f93599h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d4 d4Var = this.f93425i;
        if (z17 && k3Var.m8198xcf782831() && !k3Var.m8195x1e855fd6() && !k3Var.m8209xa033ad65()) {
            d4Var.f93534b.d(t0(k3Var), k3Var);
        }
        x.b bVar = d4Var.f93533a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.m174751x4aabfc28(k3Var, null);
        if (b4Var == null) {
            b4Var = p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.a();
            bVar.put(k3Var, b4Var);
        }
        b4Var.f93501b = m2Var;
        b4Var.f93500a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R0() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var = this.S;
        if (n2Var != null) {
            n2Var.k();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            layoutManager.m8077x28b7b1cd(this.f93421e);
            this.f93435s.m8078xa54f9ede(this.f93421e);
        }
        this.f93421e.c();
    }

    void S() {
        int h17 = this.f93424h.h();
        for (int i17 = 0; i17 < h17; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(this.f93424h.g(i17));
            if (!x07.m8209xa033ad65()) {
                x07.m8177x29f283e3();
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = this.f93421e;
        java.util.ArrayList arrayList = z2Var.f93844c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(i18)).m8177x29f283e3();
        }
        int size2 = z2Var.f93842a.size();
        for (int i19 = 0; i19 < size2; i19++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) z2Var.f93842a.get(i19)).m8177x29f283e3();
        }
        java.util.ArrayList arrayList2 = z2Var.f93843b;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            for (int i27 = 0; i27 < size3; i27++) {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) z2Var.f93843b.get(i27)).m8177x29f283e3();
            }
        }
    }

    public void S0(p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 p2Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            layoutManager.mo7925x48ffb02c("Cannot remove item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.f93437u;
        arrayList.remove(p2Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        G0();
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i17, int i18) {
        boolean z17;
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished() || i17 <= 0) {
            z17 = false;
        } else {
            this.N.onRelease();
            z17 = this.N.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i17 < 0) {
            this.Q.onRelease();
            z17 |= this.Q.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i18 > 0) {
            this.P.onRelease();
            z17 |= this.P.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i18 < 0) {
            this.R.onRelease();
            z17 |= this.R.isFinished();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    public void T0(int i17) {
        int m7950x883dc776 = m7950x883dc776();
        if (i17 >= 0 && i17 < m7950x883dc776) {
            S0(B0(i17));
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(i17 + " is an invalid index for size " + m7950x883dc776);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U() {
        if (!this.f93446z || this.I) {
            java.lang.reflect.Method method = j3.v.f378876b;
            j3.t.a("RV FullInvalidate");
            X();
            j3.t.b();
            return;
        }
        if (this.f93423g.g()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = this.f93423g;
            int i17 = cVar.f93508f;
            boolean z17 = false;
            if ((4 & i17) != 0) {
                if (!((i17 & 11) != 0)) {
                    java.lang.reflect.Method method2 = j3.v.f378876b;
                    j3.t.a("RV PartialInvalidate");
                    d1();
                    I0();
                    this.f93423g.j();
                    if (!this.B) {
                        int e17 = this.f93424h.e();
                        int i18 = 0;
                        while (true) {
                            if (i18 < e17) {
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(this.f93424h.d(i18));
                                if (x07 != null && !x07.m8209xa033ad65() && x07.m8198xcf782831()) {
                                    z17 = true;
                                    break;
                                }
                                i18++;
                            } else {
                                break;
                            }
                        }
                        if (z17) {
                            X();
                        } else {
                            this.f93423g.b();
                        }
                    }
                    e1(true);
                    J0(true);
                    j3.t.b();
                    return;
                }
            }
            if (cVar.g()) {
                java.lang.reflect.Method method3 = j3.v.f378876b;
                j3.t.a("RV FullInvalidate");
                X();
                j3.t.b();
            }
        }
    }

    public void U0(p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var) {
        this.f93438v.remove(v2Var);
        if (this.f93439w == v2Var) {
            this.f93439w = null;
        }
    }

    void V(int i17, int i18) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        setMeasuredDimension(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i17, paddingLeft, n3.u0.e(this)), p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i18, getPaddingTop() + getPaddingBottom(), n3.u0.d(this)));
    }

    public void V0(p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var) {
        java.util.List list = this.H1;
        if (list != null) {
            ((java.util.ArrayList) list).remove(w2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f93434r;
        if (f2Var != null && x07 != null) {
            f2Var.mo8161x38c82990(x07);
        }
        java.util.List list = this.H;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a) ((java.util.ArrayList) this.H).get(size)).p3(view);
            }
        }
    }

    public final void W0(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        android.graphics.Rect rect = this.f93429o;
        rect.set(0, 0, width, height);
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
            if (!layoutParams2.f93450f) {
                int i17 = rect.left;
                android.graphics.Rect rect2 = layoutParams2.f93449e;
                rect.left = i17 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f93435s.m8086xd6c2296d(this, view, this.f93429o, !this.f93446z, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0333, code lost:
    
        if (r18.f93424h.k(getFocusedChild()) == false) goto L218;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void X() {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.X():void");
    }

    public final void Y() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = this.F1;
        h3Var.a(1);
        j0(h3Var);
        h3Var.f93600i = false;
        d1();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d4 d4Var = this.f93425i;
        d4Var.f93533a.clear();
        d4Var.f93534b.m174730x5a5b64d();
        I0();
        O0();
        android.view.View focusedChild = (this.B1 && hasFocus() && this.f93434r != null) ? getFocusedChild() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = focusedChild == null ? null : m0(focusedChild);
        if (m07 == null) {
            h3Var.f93604m = -1L;
            h3Var.f93603l = -1;
            h3Var.f93605n = -1;
        } else {
            h3Var.f93604m = this.f93434r.m8145x24a16003() ? m07.m8184x1ed62e84() : -1L;
            h3Var.f93603l = this.I ? -1 : m07.m8195x1e855fd6() ? m07.f3646x635aa5c3 : m07.m8183xf806b362();
            android.view.View view = m07.f3639x46306858;
            int id6 = view.getId();
            while (!view.isFocused() && (view instanceof android.view.ViewGroup) && view.hasFocus()) {
                view = ((android.view.ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id6 = view.getId();
                }
            }
            h3Var.f93605n = id6;
        }
        h3Var.f93599h = h3Var.f93601j && this.J1;
        this.J1 = false;
        this.I1 = false;
        h3Var.f93598g = h3Var.f93602k;
        h3Var.f93596e = this.f93434r.mo1894x7e414b06();
        n0(this.O1);
        boolean z17 = h3Var.f93601j;
        x.b bVar = d4Var.f93533a;
        if (z17) {
            int e17 = this.f93424h.e();
            for (int i17 = 0; i17 < e17; i17++) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(this.f93424h.d(i17));
                if (!x07.m8209xa033ad65() && (!x07.m8193x5241396d() || this.f93434r.m8145x24a16003())) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 r17 = this.S.r(h3Var, x07, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2.e(x07), x07.m8189x6729fd1d());
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.m174751x4aabfc28(x07, null);
                    if (b4Var == null) {
                        b4Var = p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.a();
                        bVar.put(x07, b4Var);
                    }
                    b4Var.f93501b = r17;
                    b4Var.f93500a |= 4;
                    if (h3Var.f93599h && x07.m8198xcf782831() && !x07.m8195x1e855fd6() && !x07.m8209xa033ad65() && !x07.m8193x5241396d()) {
                        d4Var.f93534b.d(t0(x07), x07);
                    }
                }
            }
        }
        if (h3Var.f93602k) {
            int h17 = this.f93424h.h();
            for (int i18 = 0; i18 < h17; i18++) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x08 = x0(this.f93424h.g(i18));
                if (!x08.m8209xa033ad65()) {
                    x08.m8204x8cc9ab3();
                }
            }
            boolean z18 = h3Var.f93597f;
            h3Var.f93597f = false;
            this.f93435s.mo2418x457c9b08(this.f93421e, h3Var);
            h3Var.f93597f = z18;
            for (int i19 = 0; i19 < this.f93424h.e(); i19++) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x09 = x0(this.f93424h.d(i19));
                if (!x09.m8209xa033ad65()) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.m174751x4aabfc28(x09, null);
                    if (!((b4Var2 == null || (b4Var2.f93500a & 4) == 0) ? false : true)) {
                        int e18 = p012xc85e97e9.p103xe821e364.p104xd1075a44.n2.e(x09);
                        boolean m8190x1d788e1f = x09.m8190x1d788e1f(8192);
                        if (!m8190x1d788e1f) {
                            e18 |= 4096;
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 r18 = this.S.r(h3Var, x09, e18, x09.m8189x6729fd1d());
                        if (m8190x1d788e1f) {
                            Q0(x09, r18);
                        } else {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.b4 b4Var3 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b4) bVar.m174751x4aabfc28(x09, null);
                            if (b4Var3 == null) {
                                b4Var3 = p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.a();
                                bVar.put(x09, b4Var3);
                            }
                            b4Var3.f93500a |= 2;
                            b4Var3.f93501b = r18;
                        }
                    }
                }
            }
            S();
        } else {
            S();
        }
        J0(true);
        e1(false);
        h3Var.f93595d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Y0(int r19, int r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.Y0(int, int, android.view.MotionEvent):boolean");
    }

    public final void Z() {
        d1();
        I0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = this.F1;
        h3Var.a(6);
        this.f93423g.c();
        h3Var.f93596e = this.f93434r.mo1894x7e414b06();
        h3Var.f93594c = 0;
        h3Var.f93598g = false;
        this.f93435s.mo2418x457c9b08(this.f93421e, h3Var);
        h3Var.f93597f = false;
        this.f93422f = null;
        h3Var.f93601j = h3Var.f93601j && this.S != null;
        h3Var.f93595d = 4;
        J0(true);
        e1(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(int i17, int i18, int[] iArr) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var;
        d1();
        I0();
        java.lang.reflect.Method method = j3.v.f378876b;
        j3.t.a("RV Scroll");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = this.F1;
        j0(h3Var);
        int mo2419x96d40915 = i17 != 0 ? this.f93435s.mo2419x96d40915(i17, this.f93421e, h3Var) : 0;
        int mo7922xd8d712a7 = i18 != 0 ? this.f93435s.mo7922xd8d712a7(i18, this.f93421e, h3Var) : 0;
        j3.t.b();
        int e17 = this.f93424h.e();
        for (int i19 = 0; i19 < e17; i19++) {
            android.view.View d17 = this.f93424h.d(i19);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = w0(d17);
            if (w07 != null && (k3Var = w07.f3654xaa505ae1) != null) {
                android.view.View view = k3Var.f3639x46306858;
                int left = d17.getLeft();
                int top = d17.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        J0(true);
        e1(false);
        if (iArr != null) {
            iArr[0] = mo2419x96d40915;
            iArr[1] = mo7922xd8d712a7;
        }
    }

    public boolean a0(int i17, int i18, int[] iArr, int[] iArr2, int i19) {
        return m7945x1528932b().d(i17, i18, iArr, iArr2, i19);
    }

    public void a1(int i17) {
        if (this.C) {
            return;
        }
        f1();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "androidx/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(layoutManager, "androidx/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList arrayList, int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null || !layoutManager.mo8057xf63fac63(this, arrayList, i17, i18)) {
            super.addFocusables(arrayList, i17, i18);
        }
    }

    public boolean b0(int i17, int i18, int i19, int i27, int[] iArr, int i28) {
        return m7945x1528932b().f(i17, i18, i19, i27, iArr, i28, null);
    }

    public void b1(int i17, int i18, android.view.animation.Interpolator interpolator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null || this.C) {
            return;
        }
        if (!layoutManager.mo2416xc6ea780e()) {
            i17 = 0;
        }
        if (!this.f93435s.getF204840r()) {
            i18 = 0;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j3 j3Var = this.C1;
        int a17 = j3Var.a(i17, i18, 0, 0);
        if (interpolator == null) {
            interpolator = f93418a2;
        }
        j3Var.c(i17, i18, a17, interpolator);
    }

    public void c1(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        if (this.C || (layoutManager = this.f93435s) == null) {
            return;
        }
        layoutManager.mo7942xd1b4653f(this, this.F1, i17);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) && this.f93435s.mo7909xc6204678((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null && layoutManager.mo2416xc6ea780e()) {
            return this.f93435s.mo7929x8e0c6fb2(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null && layoutManager.mo2416xc6ea780e()) {
            return this.f93435s.mo7930x9e19151b(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null && layoutManager.mo2416xc6ea780e()) {
            return this.f93435s.mo7931x57d657b5(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null && layoutManager.getF204840r()) {
            return this.f93435s.mo7932xa00e39c4(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null && layoutManager.getF204840r()) {
            return this.f93435s.mo7933xb01adf2d(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null && layoutManager.getF204840r()) {
            return this.f93435s.mo7934xd44a0363(this.F1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(int i17, int i18) {
        this.L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        M0(i17, i18);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.G1;
        if (w2Var != null) {
            w2Var.mo482x8d21972b(this, i17, i18);
        }
        java.util.List list = this.H1;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.w2) ((java.util.ArrayList) this.H1).get(size)).mo482x8d21972b(this, i17, i18);
            }
        }
        this.L--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1() {
        int i17 = this.A + 1;
        this.A = i17;
        if (i17 != 1 || this.C) {
            return;
        }
        this.B = false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return m7945x1528932b().a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return m7945x1528932b().b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return m7945x1528932b().c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return m7945x1528932b().e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z17;
        super.draw(canvas);
        java.util.ArrayList arrayList = this.f93437u;
        int size = arrayList.size();
        boolean z18 = false;
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.p2) arrayList.get(i17)).mo7903x73cebf37(canvas, this, this.F1);
        }
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z17 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f93427m ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.N;
            z17 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f93427m) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.P;
            z17 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.Q;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f93427m ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.Q;
            z17 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.R;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f93427m) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.R;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z18 = true;
            }
            z17 |= z18;
            canvas.restoreToCount(save4);
        }
        if ((z17 || this.S == null || arrayList.size() <= 0 || !this.S.o()) ? z17 : true) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        return super.drawChild(canvas, view, j17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0() {
        if (this.R != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.R = edgeEffect;
        if (this.f93427m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(boolean z17) {
        if (this.A < 1) {
            this.A = 1;
        }
        if (!z17 && !this.C) {
            this.B = false;
        }
        if (this.A == 1) {
            if (z17 && this.B && !this.C && this.f93435s != null && this.f93434r != null) {
                X();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        if (this.N != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.f93427m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void f1() {
        m7973xeaaee002(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j3 j3Var = this.C1;
        j3Var.f93632m.removeCallbacks(j3Var);
        j3Var.f93628f.abortAnimation();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            layoutManager.m8101x7f9768aa();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0184, code lost:
    
        if (r5 > 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0187, code lost:
    
        if (r7 < 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018a, code lost:
    
        if (r5 < 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0192, code lost:
    
        if ((r5 * r6) < 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019a, code lost:
    
        if ((r5 * r6) > 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        if (r7 > 0) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0() {
        if (this.Q != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.Q = edgeEffect;
        if (this.f93427m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            return layoutManager.mo2417xcbb3b67c();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + i0());
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            return layoutManager.mo7910x5663b65(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + i0());
    }

    /* renamed from: getAdapter */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19() {
        return this.f93434r;
    }

    @Override // android.view.View
    public int getBaseline() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        return layoutManager != null ? layoutManager.m8005x154923bb() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i2 i2Var = this.N1;
        return i2Var == null ? super.getChildDrawingOrder(i17, i18) : ((pp1.q) i2Var).f438969a.f438987o ? i18 : (i17 - 1) - i18;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f93427m;
    }

    /* renamed from: getCompatAccessibilityDelegate */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.m3 m7947xf731095b() {
        return this.M1;
    }

    /* renamed from: getEdgeEffectFactory */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.j2 m7948x1fd09ec6() {
        return this.M;
    }

    /* renamed from: getItemAnimator */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990() {
        return this.S;
    }

    /* renamed from: getItemDecorationCount */
    public int m7950x883dc776() {
        return this.f93437u.size();
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager getLayoutManager() {
        return this.f93435s;
    }

    /* renamed from: getMaxFlingVelocity */
    public int m7952x49c866cb() {
        return this.f93445y1;
    }

    /* renamed from: getMinFlingVelocity */
    public int m7953x45f9d89d() {
        return this.f93442x1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: getNanoTime */
    public long m7954xebd10517() {
        return java.lang.System.nanoTime();
    }

    /* renamed from: getOnFlingListener */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 m7955x6392d05b() {
        return this.f93432p1;
    }

    /* renamed from: getPreserveFocusAfterLayout */
    public boolean m7956x74b3e010() {
        return this.B1;
    }

    /* renamed from: getRecycledViewPool */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 m7957x4145728() {
        return this.f93421e.e();
    }

    /* renamed from: getScrollState */
    public int mo7958x54496c8e() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0() {
        if (this.P != null) {
            return;
        }
        this.M.getClass();
        android.widget.EdgeEffect edgeEffect = new android.widget.EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.f93427m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m7945x1528932b().h(0);
    }

    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var) {
        if (this.H1 == null) {
            this.H1 = new java.util.ArrayList();
        }
        this.H1.add(w2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public java.lang.String i0() {
        return " " + super.toString() + ", adapter:" + this.f93434r + ", layout:" + this.f93435s + ", context:" + getContext();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f93440x;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return m7945x1528932b().f415867d;
    }

    public final void j0(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (mo7958x54496c8e() != 2) {
            h3Var.getClass();
            return;
        }
        android.widget.OverScroller overScroller = this.C1.f93628f;
        overScroller.getFinalX();
        overScroller.getCurrX();
        h3Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public android.view.View k0(float f17, float f18) {
        for (int e17 = this.f93424h.e() - 1; e17 >= 0; e17--) {
            android.view.View d17 = this.f93424h.d(e17);
            float translationX = d17.getTranslationX();
            float translationY = d17.getTranslationY();
            if (f17 >= d17.getLeft() + translationX && f17 <= d17.getRight() + translationX && f18 >= d17.getTop() + translationY && f18 <= d17.getBottom() + translationY) {
                return d17;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View l0(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.l0(android.view.View):android.view.View");
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m0(android.view.View view) {
        android.view.View l07 = l0(view);
        if (l07 == null) {
            return null;
        }
        return w0(l07);
    }

    public final void n0(int[] iArr) {
        int e17 = this.f93424h.e();
        if (e17 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        for (int i19 = 0; i19 < e17; i19++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(this.f93424h.d(i19));
            if (!x07.m8209xa033ad65()) {
                int m8186xceeefb69 = x07.m8186xceeefb69();
                if (m8186xceeefb69 < i17) {
                    i17 = m8186xceeefb69;
                }
                if (m8186xceeefb69 > i18) {
                    i18 = m8186xceeefb69;
                }
            }
        }
        iArr[0] = i17;
        iArr[1] = i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.K = r0
            r1 = 1
            r5.f93440x = r1
            boolean r2 = r5.f93446z
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f93446z = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.f93435s
            if (r1 == 0) goto L1e
            r1.m8001xa6f720a9(r5)
        L1e:
            r5.L1 = r0
            java.lang.ThreadLocal r0 = p012xc85e97e9.p103xe821e364.p104xd1075a44.r0.f93738h
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.r0 r1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.r0) r1
            r5.D1 = r1
            if (r1 != 0) goto L5a
            androidx.recyclerview.widget.r0 r1 = new androidx.recyclerview.widget.r0
            r1.<init>()
            r5.D1 = r1
            java.util.WeakHashMap r1 = n3.l1.f415895a
            android.view.Display r1 = n3.v0.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4c
            if (r1 == 0) goto L4c
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4c
            goto L4e
        L4c:
            r1 = 1114636288(0x42700000, float:60.0)
        L4e:
            androidx.recyclerview.widget.r0 r2 = r5.D1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f93742f = r3
            r0.set(r2)
        L5a:
            androidx.recyclerview.widget.r0 r0 = r5.D1
            java.util.ArrayList r0 = r0.f93740d
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var = this.S;
        if (n2Var != null) {
            n2Var.k();
        }
        f1();
        this.f93440x = false;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            layoutManager.m8002x23f7cf66(this, this.f93421e);
        }
        ((java.util.ArrayList) this.U1).clear();
        removeCallbacks(this.V1);
        this.f93425i.getClass();
        do {
        } while (((m3.f) p012xc85e97e9.p103xe821e364.p104xd1075a44.b4.f93499d).a() != null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.r0 r0Var = this.D1;
        if (r0Var != null) {
            r0Var.f93740d.remove(this);
            this.D1 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.f93437u;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.p2) arrayList.get(i17)).mo8166xc398a7c3(canvas, this, this.F1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.f93435s
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.C
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.f93435s
            boolean r0 = r0.getF204840r()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f93435s
            boolean r3 = r3.mo2416xc6ea780e()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f93435s
            boolean r3 = r3.getF204840r()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f93435s
            boolean r3 = r3.mo2416xc6ea780e()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f93447z1
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.A1
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.Y0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        boolean z18;
        if (this.C) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f93439w = null;
        }
        java.util.ArrayList arrayList = this.f93438v;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = false;
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.v2) arrayList.get(i17);
            if (v2Var.b(this, motionEvent) && action != 3) {
                this.f93439w = v2Var;
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            X0();
            m7973xeaaee002(0);
            return true;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null) {
            return false;
        }
        boolean mo2416xc6ea780e = layoutManager.mo2416xc6ea780e();
        boolean f204840r = this.f93435s.getF204840r();
        if (this.V == null) {
            this.V = android.view.VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.D) {
                this.D = false;
            }
            this.U = motionEvent.getPointerId(0);
            int x17 = (int) (motionEvent.getX() + 0.5f);
            this.f93441x0 = x17;
            this.W = x17;
            int y17 = (int) (motionEvent.getY() + 0.5f);
            this.f93444y0 = y17;
            this.f93431p0 = y17;
            if (this.T == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                m7973xeaaee002(1);
            }
            int[] iArr = this.S1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i18 = mo2416xc6ea780e;
            if (f204840r) {
                i18 = (mo2416xc6ea780e ? 1 : 0) | 2;
            }
            m7945x1528932b().j(i18, 0);
        } else if (actionMasked == 1) {
            this.V.clear();
            p(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.U);
            if (findPointerIndex < 0) {
                return false;
            }
            int x18 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y18 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.T != 1) {
                int i19 = x18 - this.W;
                int i27 = y18 - this.f93431p0;
                if (mo2416xc6ea780e == 0 || java.lang.Math.abs(i19) <= this.f93426l1) {
                    z18 = false;
                } else {
                    this.f93441x0 = x18;
                    z18 = true;
                }
                if (f204840r && java.lang.Math.abs(i27) > this.f93426l1) {
                    this.f93444y0 = y18;
                    z18 = true;
                }
                if (z18) {
                    m7973xeaaee002(1);
                }
            }
        } else if (actionMasked == 3) {
            X0();
            m7973xeaaee002(0);
        } else if (actionMasked == 5) {
            this.U = motionEvent.getPointerId(actionIndex);
            int x19 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f93441x0 = x19;
            this.W = x19;
            int y19 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f93444y0 = y19;
            this.f93431p0 = y19;
        } else if (actionMasked == 6) {
            K0(motionEvent);
        }
        return this.T == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.reflect.Method method = j3.v.f378876b;
        j3.t.a("RV OnLayout");
        X();
        j3.t.b();
        this.f93446z = true;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null) {
            V(i17, i18);
            return;
        }
        boolean mo7936xd96f765c = layoutManager.mo7936xd96f765c();
        boolean z17 = false;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = this.F1;
        if (mo7936xd96f765c) {
            int mode = android.view.View.MeasureSpec.getMode(i17);
            int mode2 = android.view.View.MeasureSpec.getMode(i18);
            this.f93435s.mo8066x8793a67f(this.f93421e, h3Var, i17, i18);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z17 = true;
            }
            if (z17 || this.f93434r == null) {
                return;
            }
            if (h3Var.f93595d == 1) {
                Y();
            }
            this.f93435s.m8092x803aa2dc(i17, i18);
            h3Var.f93600i = true;
            Z();
            this.f93435s.m8094xc56cafe7(i17, i18);
            if (this.f93435s.mo7941x59acdfbd()) {
                this.f93435s.m8092x803aa2dc(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                h3Var.f93600i = true;
                Z();
                this.f93435s.m8094xc56cafe7(i17, i18);
                return;
            }
            return;
        }
        if (this.f93443y) {
            this.f93435s.mo8066x8793a67f(this.f93421e, h3Var, i17, i18);
            return;
        }
        if (this.F) {
            d1();
            I0();
            O0();
            J0(true);
            if (h3Var.f93602k) {
                h3Var.f93598g = true;
            } else {
                this.f93423g.c();
                h3Var.f93598g = false;
            }
            this.F = false;
            e1(false);
        } else if (h3Var.f93602k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f93434r;
        if (f2Var != null) {
            h3Var.f93596e = f2Var.mo1894x7e414b06();
        } else {
            h3Var.f93596e = 0;
        }
        d1();
        this.f93435s.mo8066x8793a67f(this.f93421e, h3Var, i17, i18);
        e1(false);
        h3Var.f93598g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        if (E0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i17, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState savedState = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState) parcelable;
        this.f93422f = savedState;
        super.onRestoreInstanceState(savedState.f92645d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null || (parcelable2 = this.f93422f.f93452f) == null) {
            return;
        }
        layoutManager.mo7939xb949e58d(parcelable2);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState savedState = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState(super.onSaveInstanceState());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.SavedState savedState2 = this.f93422f;
        if (savedState2 != null) {
            savedState.f93452f = savedState2.f93452f;
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
            if (layoutManager != null) {
                savedState.f93452f = layoutManager.mo7940xa71a2260();
            } else {
                savedState.f93452f = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 == i19 && i18 == i27) {
            return;
        }
        this.R = null;
        this.P = null;
        this.Q = null;
        this.N = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // n3.d0
    public void p(int i17) {
        m7945x1528932b().k(i17);
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p0(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = null;
        if (this.I) {
            return null;
        }
        int h17 = this.f93424h.h();
        for (int i18 = 0; i18 < h17; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(this.f93424h.g(i18));
            if (x07 != null && !x07.m8195x1e855fd6() && s0(x07) == i17) {
                if (!this.f93424h.k(x07.f3639x46306858)) {
                    return x07;
                }
                k3Var = x07;
            }
        }
        return k3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.o r0 = r5.f93424h
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.o r3 = r5.f93424h
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.k3 r3 = x0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.m8195x1e855fd6()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f3650x519040b6
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m8186xceeefb69()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.o r1 = r5.f93424h
            android.view.View r4 = r3.f3639x46306858
            boolean r1 = r1.k(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.q0(int, boolean):androidx.recyclerview.widget.k3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public boolean r0(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null || this.C) {
            return false;
        }
        int mo2416xc6ea780e = layoutManager.mo2416xc6ea780e();
        boolean f204840r = this.f93435s.getF204840r();
        int i19 = this.f93442x1;
        int i27 = (mo2416xc6ea780e == 0 || java.lang.Math.abs(i17) < i19) ? 0 : i17;
        int i28 = (!f204840r || java.lang.Math.abs(i18) < i19) ? 0 : i18;
        if (i27 == 0 && i28 == 0) {
            return false;
        }
        float f17 = i27;
        float f18 = i28;
        if (!dispatchNestedPreFling(f17, f18)) {
            boolean z17 = mo2416xc6ea780e != 0 || f204840r;
            dispatchNestedFling(f17, f18, z17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 u2Var = this.f93432p1;
            if (u2Var != null && u2Var.a(i27, i28)) {
                return true;
            }
            if (z17) {
                if (f204840r) {
                    mo2416xc6ea780e = (mo2416xc6ea780e == true ? 1 : 0) | 2;
                }
                m7945x1528932b().j(mo2416xc6ea780e, 1);
                int i29 = this.f93445y1;
                int i37 = -i29;
                int max = java.lang.Math.max(i37, java.lang.Math.min(i27, i29));
                int max2 = java.lang.Math.max(i37, java.lang.Math.min(i28, i29));
                p012xc85e97e9.p103xe821e364.p104xd1075a44.j3 j3Var = this.C1;
                j3Var.f93632m.m7973xeaaee002(2);
                j3Var.f93627e = 0;
                j3Var.f93626d = 0;
                j3Var.f93628f.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                j3Var.b();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(android.view.View view, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(view);
        if (x07 != null) {
            if (x07.m8197x46e8461f()) {
                x07.m8180x87c8d4c9();
            } else if (!x07.m8209xa033ad65()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + x07 + i0());
            }
        }
        view.clearAnimation();
        W(view);
        super.removeDetachedView(view, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.f93435s.m8068x291134ec(this, this.F1, view, view2) && view2 != null) {
            W0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z17) {
        return this.f93435s.m8085xd6c2296d(this, view, rect, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        java.util.ArrayList arrayList = this.f93438v;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.v2) arrayList.get(i17)).c(z17);
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A != 0 || this.C) {
            this.B = true;
        } else {
            super.requestLayout();
        }
    }

    public int s0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (k3Var.m8190x1d788e1f(524) || !k3Var.m8192x7a81e674()) {
            return -1;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = this.f93423g;
        int i17 = k3Var.f3650x519040b6;
        java.util.ArrayList arrayList = cVar.f93504b;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) arrayList.get(i18);
            int i19 = bVar.f93492a;
            if (i19 != 1) {
                if (i19 == 2) {
                    int i27 = bVar.f93493b;
                    if (i27 <= i17) {
                        int i28 = bVar.f93495d;
                        if (i27 + i28 > i17) {
                            return -1;
                        }
                        i17 -= i28;
                    } else {
                        continue;
                    }
                } else if (i19 == 8) {
                    int i29 = bVar.f93493b;
                    if (i29 == i17) {
                        i17 = bVar.f93495d;
                    } else {
                        if (i29 < i17) {
                            i17--;
                        }
                        if (bVar.f93495d <= i17) {
                            i17++;
                        }
                    }
                }
            } else if (bVar.f93493b <= i17) {
                i17 += bVar.f93495d;
            }
        }
        return i17;
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager == null || this.C) {
            return;
        }
        boolean mo2416xc6ea780e = layoutManager.mo2416xc6ea780e();
        boolean f204840r = this.f93435s.getF204840r();
        if (mo2416xc6ea780e || f204840r) {
            if (!mo2416xc6ea780e) {
                i17 = 0;
            }
            if (!f204840r) {
                i18 = 0;
            }
            Y0(i17, i18, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (E0()) {
            int a17 = accessibilityEvent != null ? o3.b.a(accessibilityEvent) : 0;
            this.E |= a17 != 0 ? a17 : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    /* renamed from: setAccessibilityDelegateCompat */
    public void m7959x256fb093(p012xc85e97e9.p103xe821e364.p104xd1075a44.m3 m3Var) {
        this.M1 = m3Var;
        n3.l1.l(this, m3Var);
    }

    /* renamed from: setAdapter */
    public void mo7960x6cab2c8d(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        mo7966xf161ffec(false);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var2 = this.f93434r;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b3 b3Var = this.f93420d;
        if (f2Var2 != null) {
            f2Var2.mo8165x48eac7b3(b3Var);
            this.f93434r.mo8158xdba684df(this);
        }
        R0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = this.f93423g;
        cVar.l(cVar.f93504b);
        cVar.l(cVar.f93505c);
        cVar.f93508f = 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var3 = this.f93434r;
        this.f93434r = f2Var;
        if (f2Var != null) {
            f2Var.mo8163xed962dec(b3Var);
            f2Var.mo8156x4147ed22(this);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            layoutManager.mo8056xff347824(f2Var3, this.f93434r);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = this.f93421e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var4 = this.f93434r;
        z2Var.c();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 e17 = z2Var.e();
        if (f2Var3 != null) {
            e17.f93823b--;
        }
        if (e17.f93823b == 0) {
            e17.a();
        }
        if (f2Var4 != null) {
            e17.f93823b++;
        }
        this.F1.f93597f = true;
        P0(false);
        requestLayout();
    }

    /* renamed from: setChildDrawingOrderCallback */
    public void m7961x5f7f732f(p012xc85e97e9.p103xe821e364.p104xd1075a44.i2 i2Var) {
        if (i2Var == this.N1) {
            return;
        }
        this.N1 = i2Var;
        setChildrenDrawingOrderEnabled(i2Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z17) {
        if (z17 != this.f93427m) {
            this.R = null;
            this.P = null;
            this.Q = null;
            this.N = null;
        }
        this.f93427m = z17;
        super.setClipToPadding(z17);
        if (this.f93446z) {
            requestLayout();
        }
    }

    /* renamed from: setEdgeEffectFactory */
    public void m7962xfb66ab3a(p012xc85e97e9.p103xe821e364.p104xd1075a44.j2 j2Var) {
        j2Var.getClass();
        this.M = j2Var;
        this.R = null;
        this.P = null;
        this.Q = null;
        this.N = null;
    }

    /* renamed from: setHasFixedSize */
    public void m7963x830bc99d(boolean z17) {
        this.f93443y = z17;
    }

    /* renamed from: setItemAnimator */
    public void m7964x8d4ad49c(p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var2 = this.S;
        if (n2Var2 != null) {
            n2Var2.k();
            this.S.f93699a = null;
        }
        this.S = n2Var;
        if (n2Var != null) {
            n2Var.f93699a = this.K1;
        }
    }

    /* renamed from: setItemViewCacheSize */
    public void m7965x440a0e9(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = this.f93421e;
        z2Var.f93846e = i17;
        z2Var.o();
    }

    /* renamed from: setLayoutFrozen */
    public void mo7966xf161ffec(boolean z17) {
        if (z17 != this.C) {
            Q("Do not setLayoutFrozen in layout or scroll");
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.C = true;
                this.D = true;
                f1();
                return;
            }
            this.C = false;
            if (this.B && this.f93435s != null && this.f93434r != null) {
                requestLayout();
            }
            this.B = false;
        }
    }

    /* renamed from: setLayoutManager */
    public void mo7967x900dcbe1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n nVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        if (layoutManager == this.f93435s) {
            return;
        }
        f1();
        if (this.f93435s != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var = this.S;
            if (n2Var != null) {
                n2Var.k();
            }
            this.f93435s.m8077x28b7b1cd(this.f93421e);
            this.f93435s.m8078xa54f9ede(this.f93421e);
            this.f93421e.c();
            if (this.f93440x) {
                this.f93435s.m8002x23f7cf66(this, this.f93421e);
            }
            this.f93435s.m8096x7f4ee506(null);
            this.f93435s = null;
        } else {
            this.f93421e.c();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o oVar = this.f93424h;
        oVar.f93706b.g();
        java.util.ArrayList arrayList = (java.util.ArrayList) oVar.f93707c;
        int size = arrayList.size();
        while (true) {
            size--;
            nVar = oVar.f93705a;
            if (size < 0) {
                break;
            }
            android.view.View view = (android.view.View) arrayList.get(size);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) nVar;
            d2Var.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(view);
            if (x07 != null) {
                x07.m8202x65210ea1(d2Var.f93532a);
            }
            arrayList.remove(size);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) nVar;
        int a17 = d2Var2.a();
        int i17 = 0;
        while (true) {
            c1163xf1deaba4 = d2Var2.f93532a;
            if (i17 >= a17) {
                break;
            }
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            c1163xf1deaba4.W(childAt);
            childAt.clearAnimation();
            i17++;
        }
        c1163xf1deaba4.removeAllViews();
        this.f93435s = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.f3602x7fa87091 != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f3602x7fa87091.i0());
            }
            layoutManager.m8096x7f4ee506(this);
            if (this.f93440x) {
                this.f93435s.m8001xa6f720a9(this);
            }
        }
        this.f93421e.o();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        m7945x1528932b().i(z17);
    }

    /* renamed from: setOnFlingListener */
    public void m7968x9a6969cf(p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 u2Var) {
        this.f93432p1 = u2Var;
    }

    @java.lang.Deprecated
    /* renamed from: setOnScrollListener */
    public void m7969x1a2696e2(p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var) {
        this.G1 = w2Var;
    }

    /* renamed from: setPreserveFocusAfterLayout */
    public void m7970x2480a91c(boolean z17) {
        this.B1 = z17;
    }

    /* renamed from: setRecycledViewPool */
    public void m7971xa810ec34(p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 y2Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = this.f93421e;
        if (z2Var.f93848g != null) {
            r1.f93823b--;
        }
        z2Var.f93848g = y2Var;
        if (y2Var == null || z2Var.f93850i.mo7946xf939df19() == null) {
            return;
        }
        z2Var.f93848g.f93823b++;
    }

    /* renamed from: setRecyclerListener */
    public void m7972xccc65695(p012xc85e97e9.p103xe821e364.p104xd1075a44.a3 a3Var) {
        this.f93436t = a3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: setScrollState */
    public void m7973xeaaee002(int i17) {
        if (i17 == this.T) {
            return;
        }
        this.T = i17;
        if (i17 != 2) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.j3 j3Var = this.C1;
            j3Var.f93632m.removeCallbacks(j3Var);
            j3Var.f93628f.abortAnimation();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
            if (layoutManager != null) {
                layoutManager.m8101x7f9768aa();
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = this.f93435s;
        if (layoutManager2 != null) {
            layoutManager2.mo8069x4d79408f(i17);
        }
        L0(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.G1;
        if (w2Var != null) {
            w2Var.mo481x4d79408f(this, i17);
        }
        java.util.List list = this.H1;
        if (list == null) {
            return;
        }
        int size = ((java.util.ArrayList) list).size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.w2) ((java.util.ArrayList) this.H1).get(size)).mo481x4d79408f(this, i17);
            }
        }
    }

    /* renamed from: setScrollingTouchSlop */
    public void mo7974x747fcb66(int i17) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i17 != 1) {
            this.f93426l1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f93426l1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    /* renamed from: setViewCacheExtension */
    public void m7975xc632c4e4(p012xc85e97e9.p103xe821e364.p104xd1075a44.i3 i3Var) {
        this.f93421e.f93849h = i3Var;
    }

    /* renamed from: smoothScrollBy */
    public void mo7976xc291bbd2(int i17, int i18) {
        b1(i17, i18, null);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return m7945x1528932b().j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m7945x1528932b().k(0);
    }

    public long t0(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return this.f93434r.m8145x24a16003() ? k3Var.m8184x1ed62e84() : k3Var.f3650x519040b6;
    }

    public int u0(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(view);
        if (x07 != null) {
            return x07.m8183xf806b362();
        }
        return -1;
    }

    public int v0(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = x0(view);
        if (x07 != null) {
            return x07.m8186xceeefb69();
        }
        return -1;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w0(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return x0(view);
        }
        throw new java.lang.IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void y0(android.view.View view, android.graphics.Rect rect) {
        z0(view, rect);
    }

    public C1163xf1deaba4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        float a17;
        float a18;
        char c17;
        int i18;
        android.content.res.TypedArray typedArray;
        char c18;
        java.lang.ClassLoader classLoader;
        java.lang.reflect.Constructor constructor;
        java.lang.Object[] objArr;
        this.f93420d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.b3(this);
        this.f93421e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.z2(this);
        this.f93425i = new p012xc85e97e9.p103xe821e364.p104xd1075a44.d4();
        this.f93428n = new p012xc85e97e9.p103xe821e364.p104xd1075a44.z1(this);
        this.f93429o = new android.graphics.Rect();
        this.f93430p = new android.graphics.Rect();
        this.f93433q = new android.graphics.RectF();
        this.f93437u = new java.util.ArrayList();
        this.f93438v = new java.util.ArrayList();
        this.A = 0;
        this.I = false;
        this.f93419J = false;
        this.K = 0;
        this.L = 0;
        this.M = new p012xc85e97e9.p103xe821e364.p104xd1075a44.j2();
        this.S = new p012xc85e97e9.p103xe821e364.p104xd1075a44.z();
        this.T = 0;
        this.U = -1;
        this.f93447z1 = Float.MIN_VALUE;
        this.A1 = Float.MIN_VALUE;
        boolean z17 = true;
        this.B1 = true;
        this.C1 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.j3(this);
        this.E1 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.p0();
        this.F1 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.h3();
        this.I1 = false;
        this.J1 = false;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o2 o2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.o2(this);
        this.K1 = o2Var;
        this.L1 = false;
        this.O1 = new int[2];
        this.Q1 = new int[2];
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.T1 = new int[2];
        this.U1 = new java.util.ArrayList();
        this.V1 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.a2(this);
        this.W1 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.c2(this);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y1, i17, 0);
            this.f93427m = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f93427m = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f93426l1 = viewConfiguration.getScaledTouchSlop();
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            java.lang.reflect.Method method = n3.o1.f415911a;
            a17 = n3.m1.a(viewConfiguration);
        } else {
            a17 = n3.o1.a(viewConfiguration, context);
        }
        this.f93447z1 = a17;
        if (i19 >= 26) {
            a18 = n3.m1.b(viewConfiguration);
        } else {
            a18 = n3.o1.a(viewConfiguration, context);
        }
        this.A1 = a18;
        this.f93442x1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f93445y1 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.S.f93699a = o2Var;
        this.f93423g = new p012xc85e97e9.p103xe821e364.p104xd1075a44.c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.e2(this));
        this.f93424h = new p012xc85e97e9.p103xe821e364.p104xd1075a44.o(new p012xc85e97e9.p103xe821e364.p104xd1075a44.d2(this));
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if ((i19 >= 26 ? n3.d1.c(this) : 0) == 0 && i19 >= 26) {
            n3.d1.m(this, 8);
        }
        if (n3.u0.c(this) == 0) {
            n3.u0.s(this, 1);
        }
        this.G = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        m7959x256fb093(new p012xc85e97e9.p103xe821e364.p104xd1075a44.m3(this));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k4.a.f385493a, i17, 0);
            java.lang.String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                android.graphics.drawable.Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                    android.content.res.Resources resources = getContext().getResources();
                    c17 = 3;
                    i18 = 4;
                    typedArray = obtainStyledAttributes2;
                    c18 = 2;
                    new p012xc85e97e9.p103xe821e364.p104xd1075a44.n0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561940x2), resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561942x4), resources.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561941x3));
                } else {
                    throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + i0());
                }
            } else {
                c17 = 3;
                i18 = 4;
                typedArray = obtainStyledAttributes2;
                c18 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                java.lang.String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        java.lang.Class<? extends U> asSubclass = classLoader.loadClass(trim).asSubclass(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.class);
                        try {
                            constructor = asSubclass.getConstructor(Z1);
                            objArr = new java.lang.Object[i18];
                            objArr[0] = context;
                            objArr[1] = attributeSet;
                            objArr[c18] = java.lang.Integer.valueOf(i17);
                            objArr[c17] = 0;
                        } catch (java.lang.NoSuchMethodException e17) {
                            try {
                                constructor = asSubclass.getConstructor(new java.lang.Class[0]);
                                objArr = null;
                            } catch (java.lang.NoSuchMethodException e18) {
                                e18.initCause(e17);
                                throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e18);
                            }
                        }
                        constructor.setAccessible(true);
                        mo7967x900dcbe1((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager) constructor.newInstance(objArr));
                    } catch (java.lang.ClassCastException e19) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e19);
                    } catch (java.lang.ClassNotFoundException e27) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e27);
                    } catch (java.lang.IllegalAccessException e28) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e28);
                    } catch (java.lang.InstantiationException e29) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e29);
                    } catch (java.lang.reflect.InvocationTargetException e37) {
                        throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e37);
                    }
                }
            }
            android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, X1, i17, 0);
            z17 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z17);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: d, reason: collision with root package name */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f93448d;

        /* renamed from: e, reason: collision with root package name */
        public final android.graphics.Rect f93449e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f93450f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f93451g;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f93449e = new android.graphics.Rect();
            this.f93450f = true;
            this.f93451g = false;
        }

        public int a() {
            return this.f93448d.m8183xf806b362();
        }

        public int b() {
            return this.f93448d.m8186xceeefb69();
        }

        public boolean c() {
            return this.f93448d.m8198xcf782831();
        }

        public boolean d() {
            return this.f93448d.m8195x1e855fd6();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f93449e = new android.graphics.Rect();
            this.f93450f = true;
            this.f93451g = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f93449e = new android.graphics.Rect();
            this.f93450f = true;
            this.f93451g = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f93449e = new android.graphics.Rect();
            this.f93450f = true;
            this.f93451g = false;
        }

        public LayoutParams(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.f93449e = new android.graphics.Rect();
            this.f93450f = true;
            this.f93451g = false;
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93435s;
        if (layoutManager != null) {
            return layoutManager.mo7911x5663b65(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + i0());
    }
}
