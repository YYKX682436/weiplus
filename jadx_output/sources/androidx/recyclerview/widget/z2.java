package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f12309a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f12310b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f12311c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f12312d;

    /* renamed from: e, reason: collision with root package name */
    public int f12313e;

    /* renamed from: f, reason: collision with root package name */
    public int f12314f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.y2 f12315g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.i3 f12316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f12317i;

    public z2(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f12317i = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f12309a = arrayList;
        this.f12310b = null;
        this.f12311c = new java.util.ArrayList();
        this.f12312d = java.util.Collections.unmodifiableList(arrayList);
        this.f12313e = 2;
        this.f12314f = 2;
    }

    public void a(androidx.recyclerview.widget.k3 k3Var, boolean z17) {
        androidx.recyclerview.widget.RecyclerView.R(k3Var);
        if (k3Var.hasAnyOfTheFlags(16384)) {
            k3Var.setFlags(0, 16384);
            n3.l1.l(k3Var.itemView, null);
        }
        if (z17) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f12317i;
            androidx.recyclerview.widget.a3 a3Var = recyclerView.f11903t;
            if (a3Var != null) {
                oj5.r rVar = ((oj5.c) a3Var).f345837a;
                androidx.recyclerview.widget.k3 k3Var2 = (androidx.recyclerview.widget.k3) rVar.f345882e.get(java.lang.Integer.valueOf(k3Var.getAdapterPosition()));
                if (kotlin.jvm.internal.o.b(k3Var2, k3Var) || (k3Var2 instanceof oj5.p)) {
                    rVar.f345882e.remove(java.lang.Integer.valueOf(k3Var.getAdapterPosition()));
                }
                android.view.View itemView = k3Var.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                oj5.r.a(rVar, itemView);
                android.view.View itemView2 = k3Var.itemView;
                kotlin.jvm.internal.o.f(itemView2, "itemView");
                rVar.c(itemView2, true);
                android.view.View itemView3 = k3Var.itemView;
                kotlin.jvm.internal.o.f(itemView3, "itemView");
                rVar.d(itemView3, true);
            }
            androidx.recyclerview.widget.f2 f2Var = recyclerView.f11901r;
            if (f2Var != null) {
                f2Var.onViewRecycled(k3Var);
            }
            if (recyclerView.F1 != null) {
                recyclerView.f11892i.d(k3Var);
            }
        }
        k3Var.mOwnerRecyclerView = null;
        e().d(k3Var);
    }

    public void b(android.view.View view, int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams;
        androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12317i;
        if (x07 == null) {
            throw new java.lang.IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + recyclerView.i0());
        }
        int f17 = recyclerView.f11890g.f(i17, 0);
        if (f17 < 0 || f17 >= recyclerView.f11901r.getItemCount()) {
            throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i17 + "(offset:" + f17 + ").state:" + recyclerView.F1.b() + recyclerView.i0());
        }
        l(x07, f17, i17, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        android.view.ViewGroup.LayoutParams layoutParams2 = x07.itemView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) recyclerView.generateDefaultLayoutParams();
            x07.itemView.setLayoutParams(layoutParams);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams2;
        } else {
            layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) recyclerView.generateLayoutParams(layoutParams2);
            x07.itemView.setLayoutParams(layoutParams);
        }
        layoutParams.f11917f = true;
        layoutParams.f11915d = x07;
        layoutParams.f11918g = x07.itemView.getParent() == null;
    }

    public void c() {
        this.f12309a.clear();
        g();
    }

    public int d(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12317i;
        if (i17 >= 0 && i17 < recyclerView.F1.b()) {
            return !recyclerView.F1.f12065g ? i17 : recyclerView.f11890g.f(i17, 0);
        }
        throw new java.lang.IndexOutOfBoundsException("invalid position " + i17 + ". State item count is " + recyclerView.F1.b() + recyclerView.i0());
    }

    public androidx.recyclerview.widget.y2 e() {
        if (this.f12315g == null) {
            this.f12315g = new androidx.recyclerview.widget.y2();
        }
        return this.f12315g;
    }

    public android.view.View f(int i17) {
        return m(i17, false, com.tencent.wcdb.core.Database.DictDefaultMatchValue).itemView;
    }

    public void g() {
        java.util.ArrayList arrayList = this.f12311c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        int[] iArr = androidx.recyclerview.widget.RecyclerView.X1;
        androidx.recyclerview.widget.p0 p0Var = this.f12317i.E1;
        int[] iArr2 = p0Var.f12187c;
        if (iArr2 != null) {
            java.util.Arrays.fill(iArr2, -1);
        }
        p0Var.f12188d = 0;
    }

    public void h(int i17) {
        java.util.ArrayList arrayList = this.f12311c;
        a((androidx.recyclerview.widget.k3) arrayList.get(i17), true);
        arrayList.remove(i17);
    }

    public void i(android.view.View view) {
        androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
        if (x07.isTmpDetached()) {
            this.f12317i.removeDetachedView(view, false);
        }
        if (x07.isScrap()) {
            x07.unScrap();
        } else if (x07.wasReturnedFromScrap()) {
            x07.clearReturnedFromScrapFlag();
        }
        j(x07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007b, code lost:
    
        if (r6 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
    
        if (r5 < 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:
    
        r6 = ((androidx.recyclerview.widget.k3) r4.get(r5)).mPosition;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        if (r7.f12187c == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008d, code lost:
    
        r8 = r7.f12188d * 2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
    
        if (r9 >= r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        if (r7.f12187c[r9] != r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        r9 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        if (r6 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a2, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009f, code lost:
    
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(androidx.recyclerview.widget.k3 r12) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.z2.j(androidx.recyclerview.widget.k3):void");
    }

    public void k(android.view.View view) {
        androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
        boolean hasAnyOfTheFlags = x07.hasAnyOfTheFlags(12);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12317i;
        if (!hasAnyOfTheFlags && x07.isUpdated()) {
            androidx.recyclerview.widget.n2 n2Var = recyclerView.S;
            if (!(n2Var == null || n2Var.g(x07, x07.getUnmodifiedPayloads()))) {
                if (this.f12310b == null) {
                    this.f12310b = new java.util.ArrayList();
                }
                x07.setScrapContainer(this, true);
                this.f12310b.add(x07);
                return;
            }
        }
        if (!x07.isInvalid() || x07.isRemoved() || recyclerView.f11901r.hasStableIds()) {
            x07.setScrapContainer(this, false);
            this.f12309a.add(x07);
        } else {
            throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.i0());
        }
    }

    public final boolean l(androidx.recyclerview.widget.k3 k3Var, int i17, int i18, long j17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12317i;
        k3Var.mOwnerRecyclerView = recyclerView;
        int itemViewType = k3Var.getItemViewType();
        long nanoTime = recyclerView.getNanoTime();
        if (j17 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            long j18 = this.f12315g.c(itemViewType).f12275d;
            if (!(j18 == 0 || j18 + nanoTime < j17)) {
                return false;
            }
        }
        recyclerView.f11901r.bindViewHolder(k3Var, i17);
        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
        androidx.recyclerview.widget.x2 c17 = this.f12315g.c(k3Var.getItemViewType());
        long j19 = c17.f12275d;
        if (j19 != 0) {
            nanoTime2 = (nanoTime2 / 4) + ((j19 / 4) * 3);
        }
        c17.f12275d = nanoTime2;
        android.view.accessibility.AccessibilityManager accessibilityManager = recyclerView.G;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            android.view.View view = k3Var.itemView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.u0.c(view) == 0) {
                n3.u0.s(view, 1);
            }
            if (!(n3.l1.f(view) != null)) {
                k3Var.addFlags(16384);
                n3.l1.l(view, recyclerView.M1.b());
            }
        }
        if (recyclerView.F1.f12065g) {
            k3Var.mPreLayoutPosition = i18;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x02cb, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.k3 m(int r20, boolean r21, long r22) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.z2.m(int, boolean, long):androidx.recyclerview.widget.k3");
    }

    public void n(androidx.recyclerview.widget.k3 k3Var) {
        if (k3Var.mInChangeScrap) {
            this.f12310b.remove(k3Var);
        } else {
            this.f12309a.remove(k3Var);
        }
        k3Var.mScrapContainer = null;
        k3Var.mInChangeScrap = false;
        k3Var.clearReturnedFromScrapFlag();
    }

    public void o() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12317i.f11902s;
        this.f12314f = this.f12313e + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
        java.util.ArrayList arrayList = this.f12311c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f12314f; size--) {
            h(size);
        }
    }
}
