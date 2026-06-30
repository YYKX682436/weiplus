package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes10.dex */
public abstract class r3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f273394d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f273395e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f273396f;

    public r3(android.util.SparseArray headerViews, android.util.SparseArray footerViews, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 innerAdapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerViews, "headerViews");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerViews, "footerViews");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(innerAdapter, "innerAdapter");
        this.f273394d = headerViews;
        this.f273395e = footerViews;
        this.f273396f = innerAdapter;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return y() + this.f273395e.size() + this.f273396f.mo1894x7e414b06();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 < y()) {
            return this.f273394d.keyAt(i17);
        }
        boolean z17 = z(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f273396f;
        if (z17) {
            return this.f273395e.keyAt((i17 - y()) - f2Var.mo1894x7e414b06());
        }
        return f2Var.mo863xcdaf1228(i17 - y());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        this.f273396f.mo8156x4147ed22(recyclerView);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        x(holder, i17, payloads);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.util.SparseArray sparseArray = this.f273394d;
        if (sparseArray.get(i17) != null) {
            java.lang.Object obj = sparseArray.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q3((android.view.View) obj);
        }
        android.util.SparseArray sparseArray2 = this.f273395e;
        if (sparseArray2.get(i17) != null) {
            java.lang.Object obj2 = sparseArray2.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q3((android.view.View) obj2);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc = this.f273396f.mo865x9cc5cacc(parent, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo865x9cc5cacc);
        return mo865x9cc5cacc;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onDetachedFromRecyclerView */
    public void mo8158xdba684df(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8158xdba684df(recyclerView);
        this.f273396f.mo8158xdba684df(recyclerView);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        if (holder instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q3) {
            return;
        }
        this.f273396f.mo8160xd8bfd53(holder);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8161x38c82990(holder);
        if (holder instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q3) {
            return;
        }
        this.f273396f.mo8161x38c82990(holder);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        if (holder instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q3) {
            return;
        }
        this.f273396f.mo8162x34789575(holder);
    }

    public final void x(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        if ((i17 < y()) || z(i17)) {
            return;
        }
        k3Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.gyi, new java.lang.ref.WeakReference(this));
        this.f273396f.mo8157xe5e2e48d(k3Var, i17 - y(), list);
    }

    public final int y() {
        return this.f273394d.size();
    }

    public final boolean z(int i17) {
        return i17 >= y() + this.f273396f.mo1894x7e414b06();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        x(holder, i17, new java.util.ArrayList());
    }
}
