package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class a1 {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final android.view.animation.Interpolator sDragScrollInterpolator = new androidx.recyclerview.widget.y0();
    private static final android.view.animation.Interpolator sDragViewScrollCapInterpolator = new androidx.recyclerview.widget.z0();
    private byte _hellAccFlag_;
    private int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i17, int i18) {
        int i19;
        int i27 = i17 & ABS_HORIZONTAL_DIR_FLAGS;
        if (i27 == 0) {
            return i17;
        }
        int i28 = i17 & (~i27);
        if (i18 == 0) {
            i19 = i27 << 2;
        } else {
            int i29 = i27 << 1;
            i28 |= (-789517) & i29;
            i19 = (i29 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i28 | i19;
    }

    public static androidx.recyclerview.widget.h1 getDefaultUIUtil() {
        return androidx.recyclerview.widget.i1.f12081a;
    }

    public static int makeFlag(int i17, int i18) {
        return i18 << (i17 * 8);
    }

    public static int makeMovementFlags(int i17, int i18) {
        return makeFlag(2, i17) | makeFlag(1, i18) | makeFlag(0, i18 | i17);
    }

    public boolean canDropOver(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2) {
        return true;
    }

    public androidx.recyclerview.widget.k3 chooseDropTarget(androidx.recyclerview.widget.k3 k3Var, java.util.List<androidx.recyclerview.widget.k3> list, int i17, int i18) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int width = i17 + k3Var.itemView.getWidth();
        int height = i18 + k3Var.itemView.getHeight();
        int left2 = i17 - k3Var.itemView.getLeft();
        int top2 = i18 - k3Var.itemView.getTop();
        int size = list.size();
        androidx.recyclerview.widget.k3 k3Var2 = null;
        int i19 = -1;
        for (int i27 = 0; i27 < size; i27++) {
            androidx.recyclerview.widget.k3 k3Var3 = list.get(i27);
            if (left2 > 0 && (right = k3Var3.itemView.getRight() - width) < 0 && k3Var3.itemView.getRight() > k3Var.itemView.getRight() && (abs4 = java.lang.Math.abs(right)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs4;
            }
            if (left2 < 0 && (left = k3Var3.itemView.getLeft() - i17) > 0 && k3Var3.itemView.getLeft() < k3Var.itemView.getLeft() && (abs3 = java.lang.Math.abs(left)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs3;
            }
            if (top2 < 0 && (top = k3Var3.itemView.getTop() - i18) > 0 && k3Var3.itemView.getTop() < k3Var.itemView.getTop() && (abs2 = java.lang.Math.abs(top)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs2;
            }
            if (top2 > 0 && (bottom = k3Var3.itemView.getBottom() - height) < 0 && k3Var3.itemView.getBottom() > k3Var.itemView.getBottom() && (abs = java.lang.Math.abs(bottom)) > i19) {
                k3Var2 = k3Var3;
                i19 = abs;
            }
        }
        return k3Var2;
    }

    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view = k3Var.itemView;
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.hjr);
        if (tag != null && (tag instanceof java.lang.Float)) {
            float floatValue = ((java.lang.Float) tag).floatValue();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.s(view, floatValue);
        }
        view.setTag(com.tencent.mm.R.id.hjr, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int convertToAbsoluteDirection(int i17, int i18) {
        int i19;
        int i27 = i17 & RELATIVE_DIR_FLAGS;
        if (i27 == 0) {
            return i17;
        }
        int i28 = i17 & (~i27);
        if (i18 == 0) {
            i19 = i27 >> 2;
        } else {
            int i29 = i27 >> 1;
            i28 |= (-3158065) & i29;
            i19 = (i29 & RELATIVE_DIR_FLAGS) >> 2;
        }
        return i28 | i19;
    }

    public final int getAbsoluteMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        int movementFlags = getMovementFlags(recyclerView, k3Var);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return convertToAbsoluteDirection(movementFlags, n3.v0.d(recyclerView));
    }

    public long getAnimationDuration(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, float f17, float f18) {
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i17 == 8 ? 200L : 250L : i17 == 8 ? itemAnimator.f12170e : itemAnimator.n();
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public float getMoveThreshold(androidx.recyclerview.widget.k3 k3Var) {
        return 0.5f;
    }

    public abstract int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var);

    public float getSwipeEscapeVelocity(float f17) {
        return f17;
    }

    public float getSwipeThreshold(androidx.recyclerview.widget.k3 k3Var) {
        return 0.5f;
    }

    public float getSwipeVelocityThreshold(float f17) {
        return f17;
    }

    public boolean hasDragFlag(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        return (getAbsoluteMovementFlags(recyclerView, k3Var) & 16711680) != 0;
    }

    public boolean hasSwipeFlag(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        return (getAbsoluteMovementFlags(recyclerView, k3Var) & 65280) != 0;
    }

    public int interpolateOutOfBoundsScroll(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19, long j17) {
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3b);
        }
        int signum = (int) (((int) (((int) java.lang.Math.signum(i18)) * this.mCachedMaxScrollSpeed * sDragViewScrollCapInterpolator.getInterpolation(java.lang.Math.min(1.0f, (java.lang.Math.abs(i18) * 1.0f) / i17)))) * sDragScrollInterpolator.getInterpolation(j17 <= 2000 ? ((float) j17) / 2000.0f : 1.0f));
        return signum == 0 ? i18 > 0 ? 1 : -1 : signum;
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return !(this instanceof com.tencent.mm.chatroom.ui.u3);
    }

    public void onChildDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        android.view.View view = k3Var.itemView;
        if (z17 && view.getTag(com.tencent.mm.R.id.hjr) == null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            java.lang.Float valueOf = java.lang.Float.valueOf(n3.a1.i(view));
            int childCount = recyclerView.getChildCount();
            float f19 = 0.0f;
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = recyclerView.getChildAt(i18);
                if (childAt != view) {
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                    float i19 = n3.a1.i(childAt);
                    if (i19 > f19) {
                        f19 = i19;
                    }
                }
            }
            n3.a1.s(view, f19 + 1.0f);
            view.setTag(com.tencent.mm.R.id.hjr, valueOf);
        }
        view.setTranslationX(f17);
        view.setTranslationY(f18);
    }

    public void onChildDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        android.view.View view = k3Var.itemView;
    }

    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, java.util.List<androidx.recyclerview.widget.d1> list, int i17, float f17, float f18) {
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            androidx.recyclerview.widget.d1 d1Var = list.get(i18);
            float f19 = d1Var.f11986d;
            float f27 = d1Var.f11988f;
            androidx.recyclerview.widget.k3 k3Var2 = d1Var.f11990h;
            if (f19 == f27) {
                d1Var.f11994o = k3Var2.itemView.getTranslationX();
            } else {
                d1Var.f11994o = f19 + (d1Var.f11998s * (f27 - f19));
            }
            float f28 = d1Var.f11987e;
            float f29 = d1Var.f11989g;
            if (f28 == f29) {
                d1Var.f11995p = k3Var2.itemView.getTranslationY();
            } else {
                d1Var.f11995p = f28 + (d1Var.f11998s * (f29 - f28));
            }
            int save = canvas.save();
            onChildDraw(canvas, recyclerView, d1Var.f11990h, d1Var.f11994o, d1Var.f11995p, d1Var.f11991i, false);
            canvas.restoreToCount(save);
        }
        if (k3Var != null) {
            int save2 = canvas.save();
            onChildDraw(canvas, recyclerView, k3Var, f17, f18, i17, true);
            canvas.restoreToCount(save2);
        }
    }

    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, java.util.List<androidx.recyclerview.widget.d1> list, int i17, float f17, float f18) {
        int size = list.size();
        boolean z17 = false;
        for (int i18 = 0; i18 < size; i18++) {
            androidx.recyclerview.widget.d1 d1Var = list.get(i18);
            int save = canvas.save();
            onChildDrawOver(canvas, recyclerView, d1Var.f11990h, d1Var.f11994o, d1Var.f11995p, d1Var.f11991i, false);
            canvas.restoreToCount(save);
        }
        if (k3Var != null) {
            int save2 = canvas.save();
            onChildDrawOver(canvas, recyclerView, k3Var, f17, f18, i17, true);
            canvas.restoreToCount(save2);
        }
        for (int i19 = size - 1; i19 >= 0; i19--) {
            androidx.recyclerview.widget.d1 d1Var2 = list.get(i19);
            boolean z18 = d1Var2.f11997r;
            if (z18 && !d1Var2.f11993n) {
                list.remove(i19);
            } else if (!z18) {
                z17 = true;
            }
        }
        if (z17) {
            recyclerView.invalidate();
        }
    }

    public abstract boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2);

    /* JADX WARN: Multi-variable type inference failed */
    public void onMoved(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, int i17, androidx.recyclerview.widget.k3 k3Var2, int i18, int i19, int i27) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof androidx.recyclerview.widget.f1)) {
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(k3Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(recyclerView, arrayList.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(recyclerView, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (layoutManager.getDecoratedRight(k3Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(recyclerView, arrayList2.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(recyclerView, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
            if (layoutManager.getF123307r()) {
                if (layoutManager.getDecoratedTop(k3Var2.itemView) <= recyclerView.getPaddingTop()) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(recyclerView, arrayList3.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(recyclerView, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (layoutManager.getDecoratedBottom(k3Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(recyclerView, arrayList4.toArray(), "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(recyclerView, "androidx/recyclerview/widget/ItemTouchHelper$Callback", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V", "Undefined", "scrollToPosition", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        android.view.View view = k3Var.itemView;
        android.view.View view2 = k3Var2.itemView;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) ((androidx.recyclerview.widget.f1) layoutManager);
        linearLayoutManager.assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        linearLayoutManager.r();
        linearLayoutManager.N();
        int position = linearLayoutManager.getPosition(view);
        int position2 = linearLayoutManager.getPosition(view2);
        char c17 = position < position2 ? (char) 1 : (char) 65535;
        if (linearLayoutManager.f11872i) {
            if (c17 == 1) {
                int g17 = linearLayoutManager.f11869f.g() - (linearLayoutManager.f11869f.e(view2) + linearLayoutManager.f11869f.c(view));
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(java.lang.Integer.valueOf(g17));
                arrayList5.add(java.lang.Integer.valueOf(position2));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(linearLayoutManager, arrayList5.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList5.get(0)).intValue(), ((java.lang.Integer) arrayList5.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            int g18 = linearLayoutManager.f11869f.g() - linearLayoutManager.f11869f.b(view2);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(java.lang.Integer.valueOf(g18));
            arrayList6.add(java.lang.Integer.valueOf(position2));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(linearLayoutManager, arrayList6.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList6.get(0)).intValue(), ((java.lang.Integer) arrayList6.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        if (c17 == 65535) {
            int e17 = linearLayoutManager.f11869f.e(view2);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(java.lang.Integer.valueOf(e17));
            arrayList7.add(java.lang.Integer.valueOf(position2));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(linearLayoutManager, arrayList7.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList7.get(0)).intValue(), ((java.lang.Integer) arrayList7.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            return;
        }
        int b17 = linearLayoutManager.f11869f.b(view2) - linearLayoutManager.f11869f.c(view);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
        arrayList8.add(java.lang.Integer.valueOf(b17));
        arrayList8.add(java.lang.Integer.valueOf(position2));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(linearLayoutManager, arrayList8.toArray(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList8.get(0)).intValue(), ((java.lang.Integer) arrayList8.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i17) {
    }

    public abstract void onSwiped(androidx.recyclerview.widget.k3 k3Var, int i17);
}
