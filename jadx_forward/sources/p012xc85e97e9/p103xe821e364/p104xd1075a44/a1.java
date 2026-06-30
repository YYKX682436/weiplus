package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public abstract class a1 {

    /* renamed from: ABS_HORIZONTAL_DIR_FLAGS */
    private static final int f3612x809d9787 = 789516;

    /* renamed from: DEFAULT_DRAG_ANIMATION_DURATION */
    public static final int f3613xf7b9b4dc = 200;

    /* renamed from: DEFAULT_SWIPE_ANIMATION_DURATION */
    public static final int f3614xd98461b2 = 250;

    /* renamed from: DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS */
    private static final long f3615xd2d1169c = 2000;

    /* renamed from: RELATIVE_DIR_FLAGS */
    static final int f3616x94797262 = 3158064;

    /* renamed from: sDragScrollInterpolator */
    private static final android.view.animation.Interpolator f3617xf574c0db = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y0();

    /* renamed from: sDragViewScrollCapInterpolator */
    private static final android.view.animation.Interpolator f3618x31a78b00 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.z0();

    /* renamed from: _hellAccFlag_ */
    private byte f3619x7f11beae;

    /* renamed from: mCachedMaxScrollSpeed */
    private int f3620x94350345 = -1;

    /* renamed from: convertToRelativeDirection */
    public static int m8107xad249825(int i17, int i18) {
        int i19;
        int i27 = i17 & f3612x809d9787;
        if (i27 == 0) {
            return i17;
        }
        int i28 = i17 & (~i27);
        if (i18 == 0) {
            i19 = i27 << 2;
        } else {
            int i29 = i27 << 1;
            i28 |= (-789517) & i29;
            i19 = (i29 & f3612x809d9787) << 2;
        }
        return i28 | i19;
    }

    /* renamed from: getDefaultUIUtil */
    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.h1 m8108xf8692281() {
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.i1.f93614a;
    }

    /* renamed from: makeFlag */
    public static int m8109x263d27a(int i17, int i18) {
        return i18 << (i17 * 8);
    }

    /* renamed from: makeMovementFlags */
    public static int m8110x3388cfca(int i17, int i18) {
        return m8109x263d27a(2, i17) | m8109x263d27a(1, i18) | m8109x263d27a(0, i18 | i17);
    }

    /* renamed from: canDropOver */
    public boolean m8111xc3bce453(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2) {
        return true;
    }

    /* renamed from: chooseDropTarget */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m8112xf7c93ed7(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.util.List<p012xc85e97e9.p103xe821e364.p104xd1075a44.k3> list, int i17, int i18) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int width = i17 + k3Var.f3639x46306858.getWidth();
        int height = i18 + k3Var.f3639x46306858.getHeight();
        int left2 = i17 - k3Var.f3639x46306858.getLeft();
        int top2 = i18 - k3Var.f3639x46306858.getTop();
        int size = list.size();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = null;
        int i19 = -1;
        for (int i27 = 0; i27 < size; i27++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var3 = list.get(i27);
            if (left2 > 0 && (right = k3Var3.f3639x46306858.getRight() - width) < 0 && k3Var3.f3639x46306858.getRight() > k3Var.f3639x46306858.getRight() && (abs4 = java.lang.Math.abs(right)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs4;
            }
            if (left2 < 0 && (left = k3Var3.f3639x46306858.getLeft() - i17) > 0 && k3Var3.f3639x46306858.getLeft() < k3Var.f3639x46306858.getLeft() && (abs3 = java.lang.Math.abs(left)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs3;
            }
            if (top2 < 0 && (top = k3Var3.f3639x46306858.getTop() - i18) > 0 && k3Var3.f3639x46306858.getTop() < k3Var.f3639x46306858.getTop() && (abs2 = java.lang.Math.abs(top)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs2;
            }
            if (top2 > 0 && (bottom = k3Var3.f3639x46306858.getBottom() - height) < 0 && k3Var3.f3639x46306858.getBottom() > k3Var.f3639x46306858.getBottom() && (abs = java.lang.Math.abs(bottom)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs;
            }
        }
        return k3Var2;
    }

    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view = k3Var.f3639x46306858;
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.hjr);
        if (tag != null && (tag instanceof java.lang.Float)) {
            float floatValue = ((java.lang.Float) tag).floatValue();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.s(view, floatValue);
        }
        view.setTag(com.p314xaae8f345.mm.R.id.hjr, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: convertToAbsoluteDirection */
    public int m8114x3aba55da(int i17, int i18) {
        int i19;
        int i27 = i17 & f3616x94797262;
        if (i27 == 0) {
            return i17;
        }
        int i28 = i17 & (~i27);
        if (i18 == 0) {
            i19 = i27 >> 2;
        } else {
            int i29 = i27 >> 1;
            i28 |= (-3158065) & i29;
            i19 = (i29 & f3616x94797262) >> 2;
        }
        return i28 | i19;
    }

    /* renamed from: getAbsoluteMovementFlags */
    public final int m8115xc75ae12b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        int mo8119x457acf62 = mo8119x457acf62(c1163xf1deaba4, k3Var);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return m8114x3aba55da(mo8119x457acf62, n3.v0.d(c1163xf1deaba4));
    }

    /* renamed from: getAnimationDuration */
    public long m8116xf2fc9082(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, float f17, float f18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c1163xf1deaba4.m7949x5701d990();
        return m7949x5701d990 == null ? i17 == 8 ? 200L : 250L : i17 == 8 ? m7949x5701d990.f93703e : m7949x5701d990.n();
    }

    /* renamed from: getBoundingBoxMargin */
    public int m8117x510fe55f() {
        return 0;
    }

    /* renamed from: getMoveThreshold */
    public float mo8118xbee83fe4(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return 0.5f;
    }

    /* renamed from: getMovementFlags */
    public abstract int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var);

    /* renamed from: getSwipeEscapeVelocity */
    public float m8120xa0c7cb22(float f17) {
        return f17;
    }

    /* renamed from: getSwipeThreshold */
    public float m8121xc5a1347(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return 0.5f;
    }

    /* renamed from: getSwipeVelocityThreshold */
    public float m8122x9a0182ea(float f17) {
        return f17;
    }

    /* renamed from: hasDragFlag */
    public boolean m8123x7923a37a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return (m8115xc75ae12b(c1163xf1deaba4, k3Var) & 16711680) != 0;
    }

    /* renamed from: hasSwipeFlag */
    public boolean m8124x1aea604c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return (m8115xc75ae12b(c1163xf1deaba4, k3Var) & 65280) != 0;
    }

    /* renamed from: interpolateOutOfBoundsScroll */
    public int m8125x79d98946(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, int i19, long j17) {
        if (this.f3620x94350345 == -1) {
            this.f3620x94350345 = c1163xf1deaba4.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a3b);
        }
        int signum = (int) (((int) (((int) java.lang.Math.signum(i18)) * this.f3620x94350345 * f3618x31a78b00.getInterpolation(java.lang.Math.min(1.0f, (java.lang.Math.abs(i18) * 1.0f) / i17)))) * f3617xf574c0db.getInterpolation(j17 <= 2000 ? ((float) j17) / 2000.0f : 1.0f));
        return signum == 0 ? i18 > 0 ? 1 : -1 : signum;
    }

    /* renamed from: isItemViewSwipeEnabled */
    public boolean mo8126x5b4a2f69() {
        return true;
    }

    /* renamed from: isLongPressDragEnabled */
    public boolean mo8127x3b3ada10() {
        return !(this instanceof com.p314xaae8f345.mm.p648x55baa833.ui.u3);
    }

    /* renamed from: onChildDraw */
    public void mo8128xf876e561(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        android.view.View view = k3Var.f3639x46306858;
        if (z17 && view.getTag(com.p314xaae8f345.mm.R.id.hjr) == null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            java.lang.Float valueOf = java.lang.Float.valueOf(n3.a1.i(view));
            int childCount = c1163xf1deaba4.getChildCount();
            float f19 = 0.0f;
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = c1163xf1deaba4.getChildAt(i18);
                if (childAt != view) {
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                    float i19 = n3.a1.i(childAt);
                    if (i19 > f19) {
                        f19 = i19;
                    }
                }
            }
            n3.a1.s(view, f19 + 1.0f);
            view.setTag(com.p314xaae8f345.mm.R.id.hjr, valueOf);
        }
        view.setTranslationX(f17);
        view.setTranslationY(f18);
    }

    /* renamed from: onChildDrawOver */
    public void m8129x6df8fdd5(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        android.view.View view = k3Var.f3639x46306858;
    }

    /* renamed from: onDraw */
    public void m8130xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.util.List<p012xc85e97e9.p103xe821e364.p104xd1075a44.d1> list, int i17, float f17, float f18) {
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var = list.get(i18);
            float f19 = d1Var.f93519d;
            float f27 = d1Var.f93521f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = d1Var.f93523h;
            if (f19 == f27) {
                d1Var.f93527o = k3Var2.f3639x46306858.getTranslationX();
            } else {
                d1Var.f93527o = f19 + (d1Var.f93531s * (f27 - f19));
            }
            float f28 = d1Var.f93520e;
            float f29 = d1Var.f93522g;
            if (f28 == f29) {
                d1Var.f93528p = k3Var2.f3639x46306858.getTranslationY();
            } else {
                d1Var.f93528p = f28 + (d1Var.f93531s * (f29 - f28));
            }
            int save = canvas.save();
            mo8128xf876e561(canvas, c1163xf1deaba4, d1Var.f93523h, d1Var.f93527o, d1Var.f93528p, d1Var.f93524i, false);
            canvas.restoreToCount(save);
        }
        if (k3Var != null) {
            int save2 = canvas.save();
            mo8128xf876e561(canvas, c1163xf1deaba4, k3Var, f17, f18, i17, true);
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: onDrawOver */
    public void m8131x73cebf37(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.util.List<p012xc85e97e9.p103xe821e364.p104xd1075a44.d1> list, int i17, float f17, float f18) {
        int size = list.size();
        boolean z17 = false;
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var = list.get(i18);
            int save = canvas.save();
            m8129x6df8fdd5(canvas, c1163xf1deaba4, d1Var.f93523h, d1Var.f93527o, d1Var.f93528p, d1Var.f93524i, false);
            canvas.restoreToCount(save);
        }
        if (k3Var != null) {
            int save2 = canvas.save();
            m8129x6df8fdd5(canvas, c1163xf1deaba4, k3Var, f17, f18, i17, true);
            canvas.restoreToCount(save2);
        }
        for (int i19 = size - 1; i19 >= 0; i19--) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var2 = list.get(i19);
            boolean z18 = d1Var2.f93530r;
            if (z18 && !d1Var2.f93526n) {
                list.remove(i19);
            } else if (!z18) {
                z17 = true;
            }
        }
        if (z17) {
            c1163xf1deaba4.invalidate();
        }
    }

    /* renamed from: onMove */
    public abstract boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onMoved */
    public void mo8133xaffa1414(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i18, int i19, int i27) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f1)) {
            if (layoutManager.mo2416xc6ea780e()) {
                if (layoutManager.m8012x7f0ab3e8(k3Var2.f3639x46306858) <= c1163xf1deaba4.getPaddingLeft()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (layoutManager.m8015x62a22a5b(k3Var2.f3639x46306858) >= c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
            if (layoutManager.getF204840r()) {
                if (layoutManager.m8016xfbd72d54(k3Var2.f3639x46306858) <= c1163xf1deaba4.getPaddingTop()) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(c1163xf1deaba4, arrayList3.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (layoutManager.m8010xd6b039cc(k3Var2.f3639x46306858) >= c1163xf1deaba4.getHeight() - c1163xf1deaba4.getPaddingBottom()) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(c1163xf1deaba4, arrayList4.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        android.view.View view = k3Var.f3639x46306858;
        android.view.View view2 = k3Var2.f3639x46306858;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f1) layoutManager);
        c1162x665295de.mo7925x48ffb02c("Cannot drop a view during a scroll or layout calculation");
        c1162x665295de.r();
        c1162x665295de.N();
        int m8032xa86cd69f = c1162x665295de.m8032xa86cd69f(view);
        int m8032xa86cd69f2 = c1162x665295de.m8032xa86cd69f(view2);
        char c17 = m8032xa86cd69f < m8032xa86cd69f2 ? (char) 1 : (char) 65535;
        if (c1162x665295de.f93405i) {
            if (c17 == 1) {
                int g17 = c1162x665295de.f93402f.g() - (c1162x665295de.f93402f.e(view2) + c1162x665295de.f93402f.c(view));
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(java.lang.Integer.valueOf(g17));
                arrayList5.add(java.lang.Integer.valueOf(m8032xa86cd69f2));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(c1162x665295de, arrayList5.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de.P(((java.lang.Integer) arrayList5.get(0)).intValue(), ((java.lang.Integer) arrayList5.get(1)).intValue());
                yj0.a.f(c1162x665295de, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            int g18 = c1162x665295de.f93402f.g() - c1162x665295de.f93402f.b(view2);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(java.lang.Integer.valueOf(g18));
            arrayList6.add(java.lang.Integer.valueOf(m8032xa86cd69f2));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(c1162x665295de, arrayList6.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList6.get(0)).intValue(), ((java.lang.Integer) arrayList6.get(1)).intValue());
            yj0.a.f(c1162x665295de, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        if (c17 == 65535) {
            int e17 = c1162x665295de.f93402f.e(view2);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(java.lang.Integer.valueOf(e17));
            arrayList7.add(java.lang.Integer.valueOf(m8032xa86cd69f2));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(c1162x665295de, arrayList7.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList7.get(0)).intValue(), ((java.lang.Integer) arrayList7.get(1)).intValue());
            yj0.a.f(c1162x665295de, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        int b17 = c1162x665295de.f93402f.b(view2) - c1162x665295de.f93402f.c(view);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
        arrayList8.add(java.lang.Integer.valueOf(b17));
        arrayList8.add(java.lang.Integer.valueOf(m8032xa86cd69f2));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(c1162x665295de, arrayList8.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList8.get(0)).intValue(), ((java.lang.Integer) arrayList8.get(1)).intValue());
        yj0.a.f(c1162x665295de, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    /* renamed from: onSelectedChanged */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
    }

    /* renamed from: onSwiped */
    public abstract void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17);
}
