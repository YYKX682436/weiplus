package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143;

/* renamed from: com.tencent.mm.ui.base.sortview.BaseSortView */
/* loaded from: classes9.dex */
public abstract class AbstractC21579x95b0374 extends android.widget.LinearLayout implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 f279396d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f279397e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f279398f;

    /* renamed from: g, reason: collision with root package name */
    public fb5.m f279399g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f279400h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f279401i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f279402m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f279403n;

    /* renamed from: o, reason: collision with root package name */
    public int f279404o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f279405p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f279406q;

    /* renamed from: r, reason: collision with root package name */
    public fb5.j f279407r;

    public AbstractC21579x95b0374(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279403n = new java.util.ArrayList();
        this.f279399g = new fb5.m(mo48655x185aee7e());
        b();
        this.f279396d = mo48658x1853ff50();
        this.f279397e = mo48656xcc101dd9();
        this.f279398f = mo48657x932e1f79();
        this.f279405p = true;
        d(true);
        this.f279397e.setAdapter((android.widget.ListAdapter) this.f279399g);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 abstractC21534x4b3e8b10 = this.f279396d;
        if (abstractC21534x4b3e8b10 != null) {
            abstractC21534x4b3e8b10.m79298x40d747ee(this);
        }
        this.f279399g.registerDataSetObserver(new fb5.f(this));
        this.f279397e.setOnItemClickListener(new fb5.g(this));
        this.f279397e.setOnItemLongClickListener(new fb5.h(this));
        this.f279397e.setOnItemSelectedListener(new fb5.i(this));
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) ((java.util.HashMap) this.f279399g.f342428e).get(str), -1);
        if (j17 >= 0) {
            this.f279397e.setSelection(j17);
        }
    }

    public void a(java.lang.String str) {
        boolean z17;
        if (this.f279404o != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseSortView", "Can't doFilter successfully out of the search mode.");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            z17 = false;
        } else {
            arrayList.clear();
            java.util.Iterator it = ((java.util.ArrayList) this.f279403n).iterator();
            while (it.hasNext()) {
                fb5.n nVar = (fb5.n) it.next();
                if (c(str, nVar)) {
                    arrayList.add(nVar);
                }
            }
            z17 = true;
        }
        f(this.f279397e, z17 && arrayList.size() > 0);
        f(this.f279398f, z17 && arrayList.size() <= 0);
        e(arrayList);
    }

    public abstract android.view.View b();

    public abstract boolean c(java.lang.String str, fb5.n nVar);

    public void d(boolean z17) {
        this.f279406q = z17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 abstractC21534x4b3e8b10 = this.f279396d;
        if (abstractC21534x4b3e8b10 != null) {
            abstractC21534x4b3e8b10.setVisibility(z17 ? 0 : 8);
        }
    }

    public void e(java.util.List list) {
        java.util.List list2;
        if (this.f279404o == 0 && (list2 = this.f279403n) != list) {
            ((java.util.ArrayList) list2).clear();
            if (list != null) {
                ((java.util.ArrayList) this.f279403n).addAll(list);
            }
        }
        this.f279399g.c(list);
    }

    public void f(android.view.View view, boolean z17) {
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/sortview/BaseSortView", "updateViewStatus", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/sortview/BaseSortView", "updateViewStatus", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: getAdapter */
    public fb5.m m79351xf939df19() {
        return this.f279399g;
    }

    /* renamed from: getDataSetObserver */
    public fb5.j m79352x7f92ed18() {
        return this.f279407r;
    }

    /* renamed from: getDatas */
    public java.util.List<fb5.n> m79353x744cac53() {
        return this.f279399g.f342427d;
    }

    /* renamed from: getItemViewCreator */
    public abstract fb5.l mo48655x185aee7e();

    /* renamed from: getListView */
    public abstract android.widget.ListView mo48656xcc101dd9();

    /* renamed from: getMode */
    public int m79354xfb82a219() {
        return this.f279404o;
    }

    /* renamed from: getNoResultView */
    public abstract android.view.View mo48657x932e1f79();

    /* renamed from: getOnItemClickListener */
    public android.widget.AdapterView.OnItemClickListener m79355x536a1ab4() {
        return this.f279400h;
    }

    /* renamed from: getOnItemLongClickListener */
    public android.widget.AdapterView.OnItemLongClickListener m79356xeb940198() {
        return this.f279401i;
    }

    /* renamed from: getOnItemSelectedListener */
    public android.widget.AdapterView.OnItemSelectedListener m79357x55fe9d17() {
        return this.f279402m;
    }

    /* renamed from: getScrollBar */
    public abstract com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 mo48658x1853ff50();

    /* renamed from: setDataSetObserver */
    public void m79358xb669868c(fb5.j jVar) {
        this.f279407r = jVar;
    }

    /* renamed from: setMode */
    public void m79359x764d6925(int i17) {
        if (i17 == 1) {
            this.f279404o = 1;
            a("");
        } else {
            this.f279404o = 0;
            f(this.f279398f, false);
            f(this.f279397e, true);
            e(this.f279403n);
        }
    }

    /* renamed from: setOnItemClickListener */
    public void m79360xa1aeda28(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f279400h = onItemClickListener;
    }

    /* renamed from: setOnItemLongClickListener */
    public void m79361x1c3e70c(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f279401i = onItemLongClickListener;
    }

    /* renamed from: setOnItemSelectedListener */
    public void m79362x88423923(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f279402m = onItemSelectedListener;
    }
}
