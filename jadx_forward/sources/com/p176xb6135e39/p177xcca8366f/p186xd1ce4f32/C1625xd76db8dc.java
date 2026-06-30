package com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32;

/* renamed from: com.google.android.flexbox.FlexboxLayout */
/* loaded from: classes15.dex */
public class C1625xd76db8dc extends android.view.ViewGroup implements com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a {

    /* renamed from: d, reason: collision with root package name */
    public int f125705d;

    /* renamed from: e, reason: collision with root package name */
    public int f125706e;

    /* renamed from: f, reason: collision with root package name */
    public int f125707f;

    /* renamed from: g, reason: collision with root package name */
    public int f125708g;

    /* renamed from: h, reason: collision with root package name */
    public int f125709h;

    /* renamed from: i, reason: collision with root package name */
    public int f125710i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f125711m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f125712n;

    /* renamed from: o, reason: collision with root package name */
    public int f125713o;

    /* renamed from: p, reason: collision with root package name */
    public int f125714p;

    /* renamed from: q, reason: collision with root package name */
    public int f125715q;

    /* renamed from: r, reason: collision with root package name */
    public int f125716r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f125717s;

    /* renamed from: t, reason: collision with root package name */
    public android.util.SparseIntArray f125718t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f f125719u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f125720v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.d f125721w;

    public C1625xd76db8dc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f125718t == null) {
            this.f125718t = new android.util.SparseIntArray(getChildCount());
        }
        android.util.SparseIntArray sparseIntArray = this.f125718t;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f fVar = this.f125719u;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = fVar.f125785a;
        int mo17222x3b739e0d = aVar.mo17222x3b739e0d();
        java.util.List f17 = fVar.f(mo17222x3b739e0d);
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e eVar = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e(null);
        if (view == null || !(layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc)) {
            eVar.f125784e = 1;
        } else {
            eVar.f125784e = ((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) layoutParams).mo17214x74ef2d98();
        }
        if (i17 == -1 || i17 == mo17222x3b739e0d) {
            eVar.f125783d = mo17222x3b739e0d;
        } else if (i17 < aVar.mo17222x3b739e0d()) {
            eVar.f125783d = i17;
            for (int i18 = i17; i18 < mo17222x3b739e0d; i18++) {
                ((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e) ((java.util.ArrayList) f17).get(i18)).f125783d++;
            }
        } else {
            eVar.f125783d = mo17222x3b739e0d;
        }
        ((java.util.ArrayList) f17).add(eVar);
        this.f125717s = fVar.r(mo17222x3b739e0d + 1, f17, sparseIntArray);
        super.addView(view, i17, layoutParams);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public void b(android.view.View view, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar) {
        if (q(i17, i18)) {
            if (l()) {
                int i19 = bVar.f125767e;
                int i27 = this.f125716r;
                bVar.f125767e = i19 + i27;
                bVar.f125768f += i27;
                return;
            }
            int i28 = bVar.f125767e;
            int i29 = this.f125715q;
            bVar.f125767e = i28 + i29;
            bVar.f125768f += i29;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public android.view.View c(int i17) {
        return getChildAt(i17);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int d(int i17, int i18, int i19) {
        return android.view.ViewGroup.getChildMeasureSpec(i17, i18, i19);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int e(android.view.View view) {
        return 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public android.view.View f(int i17) {
        return p(i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int g(android.view.View view, int i17, int i18) {
        int i19;
        int i27;
        if (l()) {
            i19 = q(i17, i18) ? 0 + this.f125716r : 0;
            if ((this.f125714p & 4) <= 0) {
                return i19;
            }
            i27 = this.f125716r;
        } else {
            i19 = q(i17, i18) ? 0 + this.f125715q : 0;
            if ((this.f125713o & 4) <= 0) {
                return i19;
            }
            i27 = this.f125715q;
        }
        return i19 + i27;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(getContext(), attributeSet);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getAlignContent */
    public int mo17217x3416c82a() {
        return this.f125709h;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getAlignItems */
    public int mo17218xaee0b3b1() {
        return this.f125708g;
    }

    /* renamed from: getDividerDrawableHorizontal */
    public android.graphics.drawable.Drawable m17219x1ec473a5() {
        return this.f125711m;
    }

    /* renamed from: getDividerDrawableVertical */
    public android.graphics.drawable.Drawable m17220xffb13b37() {
        return this.f125712n;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexDirection */
    public int mo17221x833fcbd0() {
        return this.f125705d;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexItemCount */
    public int mo17222x3b739e0d() {
        return getChildCount();
    }

    /* renamed from: getFlexLines */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b> m17223x95abe3d0() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f125720v.size());
        for (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar : this.f125720v) {
            if (bVar.f125770h - bVar.f125771i != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexLinesInternal */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b> mo17224x68d3ead() {
        return this.f125720v;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexWrap */
    public int mo17225xe3d0dd59() {
        return this.f125706e;
    }

    /* renamed from: getJustifyContent */
    public int m17226x5d7f2cbf() {
        return this.f125707f;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getLargestMainSize */
    public int mo17227x5e625620() {
        java.util.Iterator it = this.f125720v.iterator();
        int i17 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i17 = java.lang.Math.max(i17, ((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) it.next()).f125767e);
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getMaxLine */
    public int mo17228x7019b342() {
        return this.f125710i;
    }

    /* renamed from: getShowDividerHorizontal */
    public int m17229xa78320ea() {
        return this.f125713o;
    }

    /* renamed from: getShowDividerVertical */
    public int m17230x245475bc() {
        return this.f125714p;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getSumOfCrossSize */
    public int mo17231xc050e9f5() {
        int size = this.f125720v.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125720v.get(i18);
            if (r(i18)) {
                i17 += l() ? this.f125715q : this.f125716r;
            }
            if (s(i18)) {
                i17 += l() ? this.f125715q : this.f125716r;
            }
            i17 += bVar.f125769g;
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int h(int i17, int i18, int i19) {
        return android.view.ViewGroup.getChildMeasureSpec(i17, i18, i19);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public void i(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar) {
        if (l()) {
            if ((this.f125714p & 4) > 0) {
                int i17 = bVar.f125767e;
                int i18 = this.f125716r;
                bVar.f125767e = i17 + i18;
                bVar.f125768f += i18;
                return;
            }
            return;
        }
        if ((this.f125713o & 4) > 0) {
            int i19 = bVar.f125767e;
            int i27 = this.f125715q;
            bVar.f125767e = i19 + i27;
            bVar.f125768f += i27;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public void j(int i17, android.view.View view) {
    }

    public final void k(android.graphics.Canvas canvas, boolean z17, boolean z18) {
        int paddingLeft = getPaddingLeft();
        int max = java.lang.Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f125720v.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125720v.get(i17);
            for (int i18 = 0; i18 < bVar.f125770h; i18++) {
                int i19 = bVar.f125777o + i18;
                android.view.View p17 = p(i19);
                if (p17 != null && p17.getVisibility() != 8) {
                    com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) p17.getLayoutParams();
                    if (q(i19, i18)) {
                        o(canvas, z17 ? p17.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (p17.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f125716r, bVar.f125764b, bVar.f125769g);
                    }
                    if (i18 == bVar.f125770h - 1 && (this.f125714p & 4) > 0) {
                        o(canvas, z17 ? (p17.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f125716r : p17.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, bVar.f125764b, bVar.f125769g);
                    }
                }
            }
            if (r(i17)) {
                n(canvas, paddingLeft, z18 ? bVar.f125766d : bVar.f125764b - this.f125715q, max);
            }
            if (s(i17) && (this.f125713o & 4) > 0) {
                n(canvas, paddingLeft, z18 ? bVar.f125764b - this.f125715q : bVar.f125766d, max);
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public boolean l() {
        int i17 = this.f125705d;
        return i17 == 0 || i17 == 1;
    }

    public final void m(android.graphics.Canvas canvas, boolean z17, boolean z18) {
        int paddingTop = getPaddingTop();
        int max = java.lang.Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f125720v.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125720v.get(i17);
            for (int i18 = 0; i18 < bVar.f125770h; i18++) {
                int i19 = bVar.f125777o + i18;
                android.view.View p17 = p(i19);
                if (p17 != null && p17.getVisibility() != 8) {
                    com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) p17.getLayoutParams();
                    if (q(i19, i18)) {
                        n(canvas, bVar.f125763a, z18 ? p17.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (p17.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f125715q, bVar.f125769g);
                    }
                    if (i18 == bVar.f125770h - 1 && (this.f125713o & 4) > 0) {
                        n(canvas, bVar.f125763a, z18 ? (p17.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f125715q : p17.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, bVar.f125769g);
                    }
                }
            }
            if (r(i17)) {
                o(canvas, z17 ? bVar.f125765c : bVar.f125763a - this.f125716r, paddingTop, max);
            }
            if (s(i17) && (this.f125714p & 4) > 0) {
                o(canvas, z17 ? bVar.f125763a - this.f125716r : bVar.f125765c, paddingTop, max);
            }
        }
    }

    public final void n(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        android.graphics.drawable.Drawable drawable = this.f125711m;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i17, i18, i19 + i17, this.f125715q + i18);
        this.f125711m.draw(canvas);
    }

    public final void o(android.graphics.Canvas canvas, int i17, int i18, int i19) {
        android.graphics.drawable.Drawable drawable = this.f125712n;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i17, i18, this.f125716r + i17, i19 + i18);
        this.f125712n.draw(canvas);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f125712n == null && this.f125711m == null) {
            return;
        }
        if (this.f125713o == 0 && this.f125714p == 0) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int d17 = n3.v0.d(this);
        int i17 = this.f125705d;
        if (i17 == 0) {
            k(canvas, d17 == 1, this.f125706e == 2);
            return;
        }
        if (i17 == 1) {
            k(canvas, d17 != 1, this.f125706e == 2);
            return;
        }
        if (i17 == 2) {
            boolean z17 = d17 == 1;
            if (this.f125706e == 2) {
                z17 = !z17;
            }
            m(canvas, z17, false);
            return;
        }
        if (i17 != 3) {
            return;
        }
        boolean z18 = d17 == 1;
        if (this.f125706e == 2) {
            z18 = !z18;
        }
        m(canvas, z18, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean z18;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int d17 = n3.v0.d(this);
        int i28 = this.f125705d;
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
            u(this.f125706e == 2 ? !z18 : z18, false, i17, i18, i19, i27);
        } else if (i28 == 3) {
            z18 = d17 == 1;
            u(this.f125706e == 2 ? !z18 : z18, true, i17, i18, i19, i27);
        } else {
            throw new java.lang.IllegalStateException("Invalid flex direction is set: " + this.f125705d);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.onMeasure(int, int):void");
    }

    public android.view.View p(int i17) {
        if (i17 < 0) {
            return null;
        }
        int[] iArr = this.f125717s;
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
        return z17 ? l() ? (this.f125714p & 1) != 0 : (this.f125713o & 1) != 0 : l() ? (this.f125714p & 2) != 0 : (this.f125713o & 2) != 0;
    }

    public final boolean r(int i17) {
        boolean z17;
        if (i17 < 0 || i17 >= this.f125720v.size()) {
            return false;
        }
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                z17 = true;
                break;
            }
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125720v.get(i18);
            if (bVar.f125770h - bVar.f125771i > 0) {
                z17 = false;
                break;
            }
            i18++;
        }
        return z17 ? l() ? (this.f125713o & 1) != 0 : (this.f125714p & 1) != 0 : l() ? (this.f125713o & 2) != 0 : (this.f125714p & 2) != 0;
    }

    public final boolean s(int i17) {
        if (i17 < 0 || i17 >= this.f125720v.size()) {
            return false;
        }
        for (int i18 = i17 + 1; i18 < this.f125720v.size(); i18++) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125720v.get(i18);
            if (bVar.f125770h - bVar.f125771i > 0) {
                return false;
            }
        }
        return l() ? (this.f125713o & 4) != 0 : (this.f125714p & 4) != 0;
    }

    /* renamed from: setAlignContent */
    public void m17232x6a5fc336(int i17) {
        if (this.f125709h != i17) {
            this.f125709h = i17;
            requestLayout();
        }
    }

    /* renamed from: setAlignItems */
    public void m17233xdd0501bd(int i17) {
        if (this.f125708g != i17) {
            this.f125708g = i17;
            requestLayout();
        }
    }

    /* renamed from: setDividerDrawable */
    public void m17234x54873a15(android.graphics.drawable.Drawable drawable) {
        m17235x6890cc19(drawable);
        m17236x15e120ab(drawable);
    }

    /* renamed from: setDividerDrawableHorizontal */
    public void m17235x6890cc19(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f125711m) {
            return;
        }
        this.f125711m = drawable;
        if (drawable != null) {
            this.f125715q = drawable.getIntrinsicHeight();
        } else {
            this.f125715q = 0;
        }
        if (this.f125711m == null && this.f125712n == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    /* renamed from: setDividerDrawableVertical */
    public void m17236x15e120ab(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f125712n) {
            return;
        }
        this.f125712n = drawable;
        if (drawable != null) {
            this.f125716r = drawable.getIntrinsicWidth();
        } else {
            this.f125716r = 0;
        }
        if (this.f125711m == null && this.f125712n == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    /* renamed from: setFlexDirection */
    public void m17237x16163244(int i17) {
        if (this.f125705d != i17) {
            this.f125705d = i17;
            requestLayout();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: setFlexLines */
    public void mo17238xf1ffa444(java.util.List<com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b> list) {
        this.f125720v = list;
    }

    /* renamed from: setFlexWrap */
    public void m17239xde893e65(int i17) {
        if (this.f125706e != i17) {
            this.f125706e = i17;
            requestLayout();
        }
    }

    /* renamed from: setJustifyContent */
    public void m17240x257594cb(int i17) {
        if (this.f125707f != i17) {
            this.f125707f = i17;
            requestLayout();
        }
    }

    /* renamed from: setMaxLine */
    public void m17241xe38b00b6(int i17) {
        if (this.f125710i != i17) {
            this.f125710i = i17;
            requestLayout();
        }
    }

    /* renamed from: setShowDivider */
    public void m17242xeb2aa39a(int i17) {
        m17244x72993530(i17);
        m17243x7795d35e(i17);
    }

    /* renamed from: setShowDividerHorizontal */
    public void m17243x7795d35e(int i17) {
        if (i17 != this.f125713o) {
            this.f125713o = i17;
            requestLayout();
        }
    }

    /* renamed from: setShowDividerVertical */
    public void m17244x72993530(int i17) {
        if (i17 != this.f125714p) {
            this.f125714p = i17;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.t(boolean, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.u(boolean, boolean, int, int, int, int):void");
    }

    public final void v(int i17, int i18, int i19, int i27) {
        int mo17231xc050e9f5;
        int mo17227x5e625620;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i19);
        int size2 = android.view.View.MeasureSpec.getSize(i19);
        if (i17 == 0 || i17 == 1) {
            mo17231xc050e9f5 = mo17231xc050e9f5() + getPaddingTop() + getPaddingBottom();
            mo17227x5e625620 = mo17227x5e625620();
        } else {
            if (i17 != 2 && i17 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + i17);
            }
            mo17231xc050e9f5 = mo17227x5e625620();
            mo17227x5e625620 = mo17231xc050e9f5() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < mo17227x5e625620) {
                i27 = android.view.View.combineMeasuredStates(i27, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
            } else {
                size = mo17227x5e625620;
            }
            resolveSizeAndState = android.view.View.resolveSizeAndState(size, i18, i27);
        } else if (mode == 0) {
            resolveSizeAndState = android.view.View.resolveSizeAndState(mo17227x5e625620, i18, i27);
        } else {
            if (mode != 1073741824) {
                throw new java.lang.IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < mo17227x5e625620) {
                i27 = android.view.View.combineMeasuredStates(i27, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
            }
            resolveSizeAndState = android.view.View.resolveSizeAndState(size, i18, i27);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < mo17231xc050e9f5) {
                i27 = android.view.View.combineMeasuredStates(i27, 256);
            } else {
                size2 = mo17231xc050e9f5;
            }
            resolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i19, i27);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = android.view.View.resolveSizeAndState(mo17231xc050e9f5, i19, i27);
        } else {
            if (mode2 != 1073741824) {
                throw new java.lang.IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < mo17231xc050e9f5) {
                i27 = android.view.View.combineMeasuredStates(i27, 256);
            }
            resolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i19, i27);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    public C1625xd76db8dc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f125710i = -1;
        this.f125719u = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f(this);
        this.f125720v = new java.util.ArrayList();
        this.f125721w = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.d();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.m.f125808a, i17, 0);
        this.f125705d = obtainStyledAttributes.getInt(5, 0);
        this.f125706e = obtainStyledAttributes.getInt(6, 0);
        this.f125707f = obtainStyledAttributes.getInt(7, 0);
        this.f125708g = obtainStyledAttributes.getInt(1, 0);
        this.f125709h = obtainStyledAttributes.getInt(0, 0);
        this.f125710i = obtainStyledAttributes.getInt(8, -1);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            m17235x6890cc19(drawable);
            m17236x15e120ab(drawable);
        }
        android.graphics.drawable.Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            m17235x6890cc19(drawable2);
        }
        android.graphics.drawable.Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            m17236x15e120ab(drawable3);
        }
        int i18 = obtainStyledAttributes.getInt(9, 0);
        if (i18 != 0) {
            this.f125714p = i18;
            this.f125713o = i18;
        }
        int i19 = obtainStyledAttributes.getInt(11, 0);
        if (i19 != 0) {
            this.f125714p = i19;
        }
        int i27 = obtainStyledAttributes.getInt(10, 0);
        if (i27 != 0) {
            this.f125713o = i27;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) {
            return new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(layoutParams);
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams implements com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams> f5325x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.g();

        /* renamed from: d, reason: collision with root package name */
        public int f125722d;

        /* renamed from: e, reason: collision with root package name */
        public float f125723e;

        /* renamed from: f, reason: collision with root package name */
        public float f125724f;

        /* renamed from: g, reason: collision with root package name */
        public int f125725g;

        /* renamed from: h, reason: collision with root package name */
        public float f125726h;

        /* renamed from: i, reason: collision with root package name */
        public int f125727i;

        /* renamed from: m, reason: collision with root package name */
        public int f125728m;

        /* renamed from: n, reason: collision with root package name */
        public int f125729n;

        /* renamed from: o, reason: collision with root package name */
        public int f125730o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f125731p;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f125722d = 1;
            this.f125723e = 0.0f;
            this.f125724f = 1.0f;
            this.f125725g = -1;
            this.f125726h = -1.0f;
            this.f125727i = -1;
            this.f125728m = -1;
            this.f125729n = 16777215;
            this.f125730o = 16777215;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.m.f125809b);
            this.f125722d = obtainStyledAttributes.getInt(8, 1);
            this.f125723e = obtainStyledAttributes.getFloat(2, 0.0f);
            this.f125724f = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f125725g = obtainStyledAttributes.getInt(0, -1);
            this.f125726h = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f125727i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.f125728m = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.f125729n = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f125730o = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f125731p = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        public void A1(int i17) {
            this.f125727i = i17;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        public float M0() {
            return this.f125726h;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        public boolean V0() {
            return this.f125731p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getAlignSelf */
        public int mo17202x68c1413b() {
            return this.f125725g;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getFlexGrow */
        public float mo17203xe3c99922() {
            return this.f125723e;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getFlexShrink */
        public float mo17204x2bb64b58() {
            return this.f125724f;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getHeight */
        public int mo17205x1c4fb41d() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginBottom */
        public int mo17206x4fb623ef() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginLeft */
        public int mo17207x63bacacb() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginRight */
        public int mo17208x13f4efd8() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginTop */
        public int mo17209xc1272e11() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMaxHeight */
        public int mo17210xc96bf8f5() {
            return this.f125730o;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMaxWidth */
        public int mo17211x93b79438() {
            return this.f125729n;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMinHeight */
        public int mo17212xf7770f63() {
            return this.f125728m;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMinWidth */
        public int mo17213x29d8f80a() {
            return this.f125727i;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getOrder */
        public int mo17214x74ef2d98() {
            return this.f125722d;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getWidth */
        public int mo17215x755bd410() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: setMinHeight */
        public void mo17216x53cacfd7(int i17) {
            this.f125728m = i17;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f125722d);
            parcel.writeFloat(this.f125723e);
            parcel.writeFloat(this.f125724f);
            parcel.writeInt(this.f125725g);
            parcel.writeFloat(this.f125726h);
            parcel.writeInt(this.f125727i);
            parcel.writeInt(this.f125728m);
            parcel.writeInt(this.f125729n);
            parcel.writeInt(this.f125730o);
            parcel.writeByte(this.f125731p ? (byte) 1 : (byte) 0);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.f125722d = 1;
            this.f125723e = 0.0f;
            this.f125724f = 1.0f;
            this.f125725g = -1;
            this.f125726h = -1.0f;
            this.f125727i = -1;
            this.f125728m = -1;
            this.f125729n = 16777215;
            this.f125730o = 16777215;
            this.f125722d = layoutParams.f125722d;
            this.f125723e = layoutParams.f125723e;
            this.f125724f = layoutParams.f125724f;
            this.f125725g = layoutParams.f125725g;
            this.f125726h = layoutParams.f125726h;
            this.f125727i = layoutParams.f125727i;
            this.f125728m = layoutParams.f125728m;
            this.f125729n = layoutParams.f125729n;
            this.f125730o = layoutParams.f125730o;
            this.f125731p = layoutParams.f125731p;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f125722d = 1;
            this.f125723e = 0.0f;
            this.f125724f = 1.0f;
            this.f125725g = -1;
            this.f125726h = -1.0f;
            this.f125727i = -1;
            this.f125728m = -1;
            this.f125729n = 16777215;
            this.f125730o = 16777215;
        }

        public LayoutParams(int i17, int i18) {
            super(new android.view.ViewGroup.LayoutParams(i17, i18));
            this.f125722d = 1;
            this.f125723e = 0.0f;
            this.f125724f = 1.0f;
            this.f125725g = -1;
            this.f125726h = -1.0f;
            this.f125727i = -1;
            this.f125728m = -1;
            this.f125729n = 16777215;
            this.f125730o = 16777215;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f125722d = 1;
            this.f125723e = 0.0f;
            this.f125724f = 1.0f;
            this.f125725g = -1;
            this.f125726h = -1.0f;
            this.f125727i = -1;
            this.f125728m = -1;
            this.f125729n = 16777215;
            this.f125730o = 16777215;
        }

        public LayoutParams(android.os.Parcel parcel) {
            super(0, 0);
            this.f125722d = 1;
            this.f125723e = 0.0f;
            this.f125724f = 1.0f;
            this.f125725g = -1;
            this.f125726h = -1.0f;
            this.f125727i = -1;
            this.f125728m = -1;
            this.f125729n = 16777215;
            this.f125730o = 16777215;
            this.f125722d = parcel.readInt();
            this.f125723e = parcel.readFloat();
            this.f125724f = parcel.readFloat();
            this.f125725g = parcel.readInt();
            this.f125726h = parcel.readFloat();
            this.f125727i = parcel.readInt();
            this.f125728m = parcel.readInt();
            this.f125729n = parcel.readInt();
            this.f125730o = parcel.readInt();
            this.f125731p = parcel.readByte() != 0;
            ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
