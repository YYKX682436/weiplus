package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class FlexboxLayout extends android.view.ViewGroup implements com.google.android.flexbox.a {

    /* renamed from: d, reason: collision with root package name */
    public int f44172d;

    /* renamed from: e, reason: collision with root package name */
    public int f44173e;

    /* renamed from: f, reason: collision with root package name */
    public int f44174f;

    /* renamed from: g, reason: collision with root package name */
    public int f44175g;

    /* renamed from: h, reason: collision with root package name */
    public int f44176h;

    /* renamed from: i, reason: collision with root package name */
    public int f44177i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44178m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44179n;

    /* renamed from: o, reason: collision with root package name */
    public int f44180o;

    /* renamed from: p, reason: collision with root package name */
    public int f44181p;

    /* renamed from: q, reason: collision with root package name */
    public int f44182q;

    /* renamed from: r, reason: collision with root package name */
    public int f44183r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f44184s;

    /* renamed from: t, reason: collision with root package name */
    public android.util.SparseIntArray f44185t;

    /* renamed from: u, reason: collision with root package name */
    public final com.google.android.flexbox.f f44186u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f44187v;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.flexbox.d f44188w;

    public FlexboxLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f44185t == null) {
            this.f44185t = new android.util.SparseIntArray(getChildCount());
        }
        android.util.SparseIntArray sparseIntArray = this.f44185t;
        com.google.android.flexbox.f fVar = this.f44186u;
        com.google.android.flexbox.a aVar = fVar.f44252a;
        int flexItemCount = aVar.getFlexItemCount();
        java.util.List f17 = fVar.f(flexItemCount);
        com.google.android.flexbox.e eVar = new com.google.android.flexbox.e(null);
        if (view == null || !(layoutParams instanceof com.google.android.flexbox.FlexItem)) {
            eVar.f44251e = 1;
        } else {
            eVar.f44251e = ((com.google.android.flexbox.FlexItem) layoutParams).getOrder();
        }
        if (i17 == -1 || i17 == flexItemCount) {
            eVar.f44250d = flexItemCount;
        } else if (i17 < aVar.getFlexItemCount()) {
            eVar.f44250d = i17;
            for (int i18 = i17; i18 < flexItemCount; i18++) {
                ((com.google.android.flexbox.e) ((java.util.ArrayList) f17).get(i18)).f44250d++;
            }
        } else {
            eVar.f44250d = flexItemCount;
        }
        ((java.util.ArrayList) f17).add(eVar);
        this.f44184s = fVar.r(flexItemCount + 1, f17, sparseIntArray);
        super.addView(view, i17, layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public void b(android.view.View view, int i17, int i18, com.google.android.flexbox.b bVar) {
        if (q(i17, i18)) {
            if (l()) {
                int i19 = bVar.f44234e;
                int i27 = this.f44183r;
                bVar.f44234e = i19 + i27;
                bVar.f44235f += i27;
                return;
            }
            int i28 = bVar.f44234e;
            int i29 = this.f44182q;
            bVar.f44234e = i28 + i29;
            bVar.f44235f += i29;
        }
    }

    @Override // com.google.android.flexbox.a
    public android.view.View c(int i17) {
        return getChildAt(i17);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams;
    }

    @Override // com.google.android.flexbox.a
    public int d(int i17, int i18, int i19) {
        return android.view.ViewGroup.getChildMeasureSpec(i17, i18, i19);
    }

    @Override // com.google.android.flexbox.a
    public int e(android.view.View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public android.view.View f(int i17) {
        return p(i17);
    }

    @Override // com.google.android.flexbox.a
    public int g(android.view.View view, int i17, int i18) {
        int i19;
        int i27;
        if (l()) {
            i19 = q(i17, i18) ? 0 + this.f44183r : 0;
            if ((this.f44181p & 4) <= 0) {
                return i19;
            }
            i27 = this.f44183r;
        } else {
            i19 = q(i17, i18) ? 0 + this.f44182q : 0;
            if ((this.f44180o & 4) <= 0) {
                return i19;
            }
            i27 = this.f44182q;
        }
        return i19 + i27;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.flexbox.FlexboxLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.f44176h;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f44175g;
    }

    public android.graphics.drawable.Drawable getDividerDrawableHorizontal() {
        return this.f44178m;
    }

    public android.graphics.drawable.Drawable getDividerDrawableVertical() {
        return this.f44179n;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f44172d;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public java.util.List<com.google.android.flexbox.b> getFlexLines() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f44187v.size());
        for (com.google.android.flexbox.b bVar : this.f44187v) {
            if (bVar.f44237h - bVar.f44238i != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public java.util.List<com.google.android.flexbox.b> getFlexLinesInternal() {
        return this.f44187v;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f44173e;
    }

    public int getJustifyContent() {
        return this.f44174f;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        java.util.Iterator it = this.f44187v.iterator();
        int i17 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i17 = java.lang.Math.max(i17, ((com.google.android.flexbox.b) it.next()).f44234e);
        }
        return i17;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f44177i;
    }

    public int getShowDividerHorizontal() {
        return this.f44180o;
    }

    public int getShowDividerVertical() {
        return this.f44181p;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f44187v.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44187v.get(i18);
            if (r(i18)) {
                i17 += l() ? this.f44182q : this.f44183r;
            }
            if (s(i18)) {
                i17 += l() ? this.f44182q : this.f44183r;
            }
            i17 += bVar.f44236g;
        }
        return i17;
    }

    @Override // com.google.android.flexbox.a
    public int h(int i17, int i18, int i19) {
        return android.view.ViewGroup.getChildMeasureSpec(i17, i18, i19);
    }

    @Override // com.google.android.flexbox.a
    public void i(com.google.android.flexbox.b bVar) {
        if (l()) {
            if ((this.f44181p & 4) > 0) {
                int i17 = bVar.f44234e;
                int i18 = this.f44183r;
                bVar.f44234e = i17 + i18;
                bVar.f44235f += i18;
                return;
            }
            return;
        }
        if ((this.f44180o & 4) > 0) {
            int i19 = bVar.f44234e;
            int i27 = this.f44182q;
            bVar.f44234e = i19 + i27;
            bVar.f44235f += i27;
        }
    }

    @Override // com.google.android.flexbox.a
    public void j(int i17, android.view.View view) {
    }

    public final void k(android.graphics.Canvas canvas, boolean z17, boolean z18) {
        int paddingLeft = getPaddingLeft();
        int max = java.lang.Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f44187v.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44187v.get(i17);
            for (int i18 = 0; i18 < bVar.f44237h; i18++) {
                int i19 = bVar.f44244o + i18;
                android.view.View p17 = p(i19);
                if (p17 != null && p17.getVisibility() != 8) {
                    com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = (com.google.android.flexbox.FlexboxLayout.LayoutParams) p17.getLayoutParams();
                    if (q(i19, i18)) {
                        o(canvas, z17 ? p17.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (p17.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f44183r, bVar.f44231b, bVar.f44236g);
                    }
                    if (i18 == bVar.f44237h - 1 && (this.f44181p & 4) > 0) {
                        o(canvas, z17 ? (p17.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f44183r : p17.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, bVar.f44231b, bVar.f44236g);
                    }
                }
            }
            if (r(i17)) {
                n(canvas, paddingLeft, z18 ? bVar.f44233d : bVar.f44231b - this.f44182q, max);
            }
            if (s(i17) && (this.f44180o & 4) > 0) {
                n(canvas, paddingLeft, z18 ? bVar.f44231b - this.f44182q : bVar.f44233d, max);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public boolean l() {
        int i17 = this.f44172d;
        return i17 == 0 || i17 == 1;
    }

    public final void m(android.graphics.Canvas canvas, boolean z17, boolean z18) {
        int paddingTop = getPaddingTop();
        int max = java.lang.Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f44187v.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44187v.get(i17);
            for (int i18 = 0; i18 < bVar.f44237h; i18++) {
                int i19 = bVar.f44244o + i18;
                android.view.View p17 = p(i19);
                if (p17 != null && p17.getVisibility() != 8) {
                    com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = (com.google.android.flexbox.FlexboxLayout.LayoutParams) p17.getLayoutParams();
                    if (q(i19, i18)) {
                        n(canvas, bVar.f44230a, z18 ? p17.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (p17.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f44182q, bVar.f44236g);
                    }
                    if (i18 == bVar.f44237h - 1 && (this.f44180o & 4) > 0) {
                        n(canvas, bVar.f44230a, z18 ? (p17.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f44182q : p17.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, bVar.f44236g);
                    }
                }
            }
            if (r(i17)) {
                o(canvas, z17 ? bVar.f44232c : bVar.f44230a - this.f44183r, paddingTop, max);
            }
            if (s(i17) && (this.f44181p & 4) > 0) {
                o(canvas, z17 ? bVar.f44230a - this.f44183r : bVar.f44232c, paddingTop, max);
            }
        }
    }

    public final void n(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        android.graphics.drawable.Drawable drawable = this.f44178m;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i17, i18, i19 + i17, this.f44182q + i18);
        this.f44178m.draw(canvas);
    }

    public final void o(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        android.graphics.drawable.Drawable drawable = this.f44179n;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i17, i18, this.f44183r + i17, i19 + i18);
        this.f44179n.draw(canvas);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f44179n == null && this.f44178m == null) {
            return;
        }
        if (this.f44180o == 0 && this.f44181p == 0) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int d17 = n3.v0.d(this);
        int i17 = this.f44172d;
        if (i17 == 0) {
            k(canvas, d17 == 1, this.f44173e == 2);
            return;
        }
        if (i17 == 1) {
            k(canvas, d17 != 1, this.f44173e == 2);
            return;
        }
        if (i17 == 2) {
            boolean z17 = d17 == 1;
            if (this.f44173e == 2) {
                z17 = !z17;
            }
            m(canvas, z17, false);
            return;
        }
        if (i17 != 3) {
            return;
        }
        boolean z18 = d17 == 1;
        if (this.f44173e == 2) {
            z18 = !z18;
        }
        m(canvas, z18, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean z18;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        int d17 = n3.v0.d(this);
        int i28 = this.f44172d;
        if (i28 == 0) {
            t(d17 == 1, i17, i18, i19, i27);
            return;
        }
        if (i28 == 1) {
            t(d17 != 1, i17, i18, i19, i27);
            return;
        }
        if (i28 == 2) {
            z18 = d17 == 1;
            u(this.f44173e == 2 ? !z18 : z18, false, i17, i18, i19, i27);
        } else if (i28 == 3) {
            z18 = d17 == 1;
            u(this.f44173e == 2 ? !z18 : z18, true, i17, i18, i19, i27);
        } else {
            throw new java.lang.IllegalStateException("Invalid flex direction is set: " + this.f44172d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    public android.view.View p(int i17) {
        if (i17 < 0) {
            return null;
        }
        int[] iArr = this.f44184s;
        if (i17 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i17]);
    }

    public final boolean q(int i17, int i18) {
        boolean z17;
        int i19 = 1;
        while (true) {
            if (i19 > i18) {
                z17 = true;
                break;
            }
            android.view.View p17 = p(i17 - i19);
            if (p17 != null && p17.getVisibility() != 8) {
                z17 = false;
                break;
            }
            i19++;
        }
        return z17 ? l() ? (this.f44181p & 1) != 0 : (this.f44180o & 1) != 0 : l() ? (this.f44181p & 2) != 0 : (this.f44180o & 2) != 0;
    }

    public final boolean r(int i17) {
        boolean z17;
        if (i17 < 0 || i17 >= this.f44187v.size()) {
            return false;
        }
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                z17 = true;
                break;
            }
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44187v.get(i18);
            if (bVar.f44237h - bVar.f44238i > 0) {
                z17 = false;
                break;
            }
            i18++;
        }
        return z17 ? l() ? (this.f44180o & 1) != 0 : (this.f44181p & 1) != 0 : l() ? (this.f44180o & 2) != 0 : (this.f44181p & 2) != 0;
    }

    public final boolean s(int i17) {
        if (i17 < 0 || i17 >= this.f44187v.size()) {
            return false;
        }
        for (int i18 = i17 + 1; i18 < this.f44187v.size(); i18++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f44187v.get(i18);
            if (bVar.f44237h - bVar.f44238i > 0) {
                return false;
            }
        }
        return l() ? (this.f44180o & 4) != 0 : (this.f44181p & 4) != 0;
    }

    public void setAlignContent(int i17) {
        if (this.f44176h != i17) {
            this.f44176h = i17;
            requestLayout();
        }
    }

    public void setAlignItems(int i17) {
        if (this.f44175g != i17) {
            this.f44175g = i17;
            requestLayout();
        }
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f44178m) {
            return;
        }
        this.f44178m = drawable;
        if (drawable != null) {
            this.f44182q = drawable.getIntrinsicHeight();
        } else {
            this.f44182q = 0;
        }
        if (this.f44178m == null && this.f44179n == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f44179n) {
            return;
        }
        this.f44179n = drawable;
        if (drawable != null) {
            this.f44183r = drawable.getIntrinsicWidth();
        } else {
            this.f44183r = 0;
        }
        if (this.f44178m == null && this.f44179n == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i17) {
        if (this.f44172d != i17) {
            this.f44172d = i17;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(java.util.List<com.google.android.flexbox.b> list) {
        this.f44187v = list;
    }

    public void setFlexWrap(int i17) {
        if (this.f44173e != i17) {
            this.f44173e = i17;
            requestLayout();
        }
    }

    public void setJustifyContent(int i17) {
        if (this.f44174f != i17) {
            this.f44174f = i17;
            requestLayout();
        }
    }

    public void setMaxLine(int i17) {
        if (this.f44177i != i17) {
            this.f44177i = i17;
            requestLayout();
        }
    }

    public void setShowDivider(int i17) {
        setShowDividerVertical(i17);
        setShowDividerHorizontal(i17);
    }

    public void setShowDividerHorizontal(int i17) {
        if (i17 != this.f44180o) {
            this.f44180o = i17;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i17) {
        if (i17 != this.f44181p) {
            this.f44181p = i17;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.t(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.u(boolean, boolean, int, int, int, int):void");
    }

    public final void v(int i17, int i18, int i19, int i27) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i19);
        int size2 = android.view.View.MeasureSpec.getSize(i19);
        if (i17 == 0 || i17 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i17 != 2 && i17 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + i17);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i27 = android.view.View.combineMeasuredStates(i27, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = android.view.View.resolveSizeAndState(size, i18, i27);
        } else if (mode == 0) {
            resolveSizeAndState = android.view.View.resolveSizeAndState(largestMainSize, i18, i27);
        } else {
            if (mode != 1073741824) {
                throw new java.lang.IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i27 = android.view.View.combineMeasuredStates(i27, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            }
            resolveSizeAndState = android.view.View.resolveSizeAndState(size, i18, i27);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i27 = android.view.View.combineMeasuredStates(i27, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i19, i27);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = android.view.View.resolveSizeAndState(sumOfCrossSize, i19, i27);
        } else {
            if (mode2 != 1073741824) {
                throw new java.lang.IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i27 = android.view.View.combineMeasuredStates(i27, 256);
            }
            resolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i19, i27);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    public FlexboxLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44177i = -1;
        this.f44186u = new com.google.android.flexbox.f(this);
        this.f44187v = new java.util.ArrayList();
        this.f44188w = new com.google.android.flexbox.d();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.flexbox.m.f44275a, i17, 0);
        this.f44172d = obtainStyledAttributes.getInt(5, 0);
        this.f44173e = obtainStyledAttributes.getInt(6, 0);
        this.f44174f = obtainStyledAttributes.getInt(7, 0);
        this.f44175g = obtainStyledAttributes.getInt(1, 0);
        this.f44176h = obtainStyledAttributes.getInt(0, 0);
        this.f44177i = obtainStyledAttributes.getInt(8, -1);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        android.graphics.drawable.Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i18 = obtainStyledAttributes.getInt(9, 0);
        if (i18 != 0) {
            this.f44181p = i18;
            this.f44180o = i18;
        }
        int i19 = obtainStyledAttributes.getInt(11, 0);
        if (i19 != 0) {
            this.f44181p = i19;
        }
        int i27 = obtainStyledAttributes.getInt(10, 0);
        if (i27 != 0) {
            this.f44180o = i27;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams) {
            return new com.google.android.flexbox.FlexboxLayout.LayoutParams((com.google.android.flexbox.FlexboxLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new com.google.android.flexbox.FlexboxLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new com.google.android.flexbox.FlexboxLayout.LayoutParams(layoutParams);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams implements com.google.android.flexbox.FlexItem {
        public static final android.os.Parcelable.Creator<com.google.android.flexbox.FlexboxLayout.LayoutParams> CREATOR = new com.google.android.flexbox.g();

        /* renamed from: d, reason: collision with root package name */
        public int f44189d;

        /* renamed from: e, reason: collision with root package name */
        public float f44190e;

        /* renamed from: f, reason: collision with root package name */
        public float f44191f;

        /* renamed from: g, reason: collision with root package name */
        public int f44192g;

        /* renamed from: h, reason: collision with root package name */
        public float f44193h;

        /* renamed from: i, reason: collision with root package name */
        public int f44194i;

        /* renamed from: m, reason: collision with root package name */
        public int f44195m;

        /* renamed from: n, reason: collision with root package name */
        public int f44196n;

        /* renamed from: o, reason: collision with root package name */
        public int f44197o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f44198p;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44189d = 1;
            this.f44190e = 0.0f;
            this.f44191f = 1.0f;
            this.f44192g = -1;
            this.f44193h = -1.0f;
            this.f44194i = -1;
            this.f44195m = -1;
            this.f44196n = 16777215;
            this.f44197o = 16777215;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.flexbox.m.f44276b);
            this.f44189d = obtainStyledAttributes.getInt(8, 1);
            this.f44190e = obtainStyledAttributes.getFloat(2, 0.0f);
            this.f44191f = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f44192g = obtainStyledAttributes.getInt(0, -1);
            this.f44193h = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f44194i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.f44195m = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.f44196n = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f44197o = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f44198p = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public void A1(int i17) {
            this.f44194i = i17;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float M0() {
            return this.f44193h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean V0() {
            return this.f44198p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.f44192g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.f44190e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.f44191f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.f44197o;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.f44196n;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.f44195m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.f44194i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f44189d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i17) {
            this.f44195m = i17;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f44189d);
            parcel.writeFloat(this.f44190e);
            parcel.writeFloat(this.f44191f);
            parcel.writeInt(this.f44192g);
            parcel.writeFloat(this.f44193h);
            parcel.writeInt(this.f44194i);
            parcel.writeInt(this.f44195m);
            parcel.writeInt(this.f44196n);
            parcel.writeInt(this.f44197o);
            parcel.writeByte(this.f44198p ? (byte) 1 : (byte) 0);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.f44189d = 1;
            this.f44190e = 0.0f;
            this.f44191f = 1.0f;
            this.f44192g = -1;
            this.f44193h = -1.0f;
            this.f44194i = -1;
            this.f44195m = -1;
            this.f44196n = 16777215;
            this.f44197o = 16777215;
            this.f44189d = layoutParams.f44189d;
            this.f44190e = layoutParams.f44190e;
            this.f44191f = layoutParams.f44191f;
            this.f44192g = layoutParams.f44192g;
            this.f44193h = layoutParams.f44193h;
            this.f44194i = layoutParams.f44194i;
            this.f44195m = layoutParams.f44195m;
            this.f44196n = layoutParams.f44196n;
            this.f44197o = layoutParams.f44197o;
            this.f44198p = layoutParams.f44198p;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44189d = 1;
            this.f44190e = 0.0f;
            this.f44191f = 1.0f;
            this.f44192g = -1;
            this.f44193h = -1.0f;
            this.f44194i = -1;
            this.f44195m = -1;
            this.f44196n = 16777215;
            this.f44197o = 16777215;
        }

        public LayoutParams(int i17, int i18) {
            super(new android.view.ViewGroup.LayoutParams(i17, i18));
            this.f44189d = 1;
            this.f44190e = 0.0f;
            this.f44191f = 1.0f;
            this.f44192g = -1;
            this.f44193h = -1.0f;
            this.f44194i = -1;
            this.f44195m = -1;
            this.f44196n = 16777215;
            this.f44197o = 16777215;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f44189d = 1;
            this.f44190e = 0.0f;
            this.f44191f = 1.0f;
            this.f44192g = -1;
            this.f44193h = -1.0f;
            this.f44194i = -1;
            this.f44195m = -1;
            this.f44196n = 16777215;
            this.f44197o = 16777215;
        }

        public LayoutParams(android.os.Parcel parcel) {
            super(0, 0);
            this.f44189d = 1;
            this.f44190e = 0.0f;
            this.f44191f = 1.0f;
            this.f44192g = -1;
            this.f44193h = -1.0f;
            this.f44194i = -1;
            this.f44195m = -1;
            this.f44196n = 16777215;
            this.f44197o = 16777215;
            this.f44189d = parcel.readInt();
            this.f44190e = parcel.readFloat();
            this.f44191f = parcel.readFloat();
            this.f44192g = parcel.readInt();
            this.f44193h = parcel.readFloat();
            this.f44194i = parcel.readInt();
            this.f44195m = parcel.readInt();
            this.f44196n = parcel.readInt();
            this.f44197o = parcel.readInt();
            this.f44198p = parcel.readByte() != 0;
            ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
