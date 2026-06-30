package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u0016\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006."}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/tools/v3;", "", "resID", "Ljz5/f0;", "setSelector", "color", "setCacheColorHint", "Landroid/graphics/drawable/Drawable;", "divider", "setDivider", "getLastVisiblePosition", "getHeaderViewsCount", "getFirstCompletelyVisiblePosition", "getFirstVisiblePosition", "getCount", "Landroid/widget/AbsListView$OnScrollListener;", "l", "setOnScrollListener", "Landroidx/recyclerview/widget/f2;", "adapter", "setAdapter", "getFooterViewsCount", "position", "setSelection", "mode", "setTranscriptMode", "visibility", "setVisibility", "Landroid/util/SparseArray;", "Landroid/view/View;", "b2", "Landroid/util/SparseArray;", "getHeaderViews", "()Landroid/util/SparseArray;", "headerViews", "c2", "getFooterViews", "footerViews", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView */
/* loaded from: classes9.dex */
public class C19727x3bcc210a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public final android.util.SparseArray headerViews;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public final android.util.SparseArray footerViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19727x3bcc210a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.headerViews = new android.util.SparseArray();
        this.footerViews = new android.util.SparseArray();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.View C(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = p0(i17);
        if (p07 != null) {
            return p07.f3639x46306858;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.View F(int i17) {
        mo75757x2ce24761();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = p0(i17);
        if (p07 != null) {
            return p07.f3639x46306858;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: addFooterView */
    public void mo75754x55dede61(android.view.View view) {
        if (view != null) {
            android.util.SparseArray sparseArray = this.footerViews;
            sparseArray.put(sparseArray.size() + 200000, view);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: addHeaderView */
    public void mo75755x77114253(android.view.View view) {
        if (view != null) {
            android.util.SparseArray sparseArray = this.headerViews;
            sparseArray.put(sparseArray.size() + 100000, view);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.ViewGroup f() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getCount */
    public int mo75756x7444f759() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            return mo7946xf939df19.mo1894x7e414b06();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getFirstCompletelyVisiblePosition */
    public int mo54248xf50f67b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).t();
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getFirstVisiblePosition */
    public int mo75757x2ce24761() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    /* renamed from: getFooterViews */
    public final android.util.SparseArray<android.view.View> m75758x1acd045d() {
        return this.footerViews;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getFooterViewsCount */
    public int mo75759x134c8eb2() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0) mo7946xf939df19 : null;
        if (r0Var != null) {
            return r0Var.f273395e.size();
        }
        return 0;
    }

    /* renamed from: getHeaderViews */
    public final android.util.SparseArray<android.view.View> m75760x1fe71eab() {
        return this.headerViews;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getHeaderViewsCount */
    public int mo75761x118cb524() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0) mo7946xf939df19 : null;
        if (r0Var != null) {
            return r0Var.y();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getLastVisiblePosition */
    public int mo75762xe81a1f0f() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = getLayoutManager();
        try {
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).y();
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getPositionForView */
    public int mo75763x413e8f6f(android.view.View view) {
        return -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        V0(listener);
        super.i(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public void k(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 u3Var) {
        mo7960x6cab2c8d(u3Var instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.f2) u3Var : null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.System.currentTimeMillis();
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.View q(int i17) {
        android.util.SparseArray sparseArray = this.headerViews;
        int size = sparseArray.size();
        for (int i18 = 0; i18 < size; i18++) {
            sparseArray.keyAt(i18);
            android.view.View findViewById = ((android.view.View) sparseArray.valueAt(i18)).findViewById(i17);
            if (findViewById != null) {
                return findViewById;
            }
        }
        android.util.SparseArray sparseArray2 = this.footerViews;
        int size2 = sparseArray2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            sparseArray2.keyAt(i19);
            android.view.View findViewById2 = ((android.view.View) sparseArray2.valueAt(i19)).findViewById(i17);
            if (findViewById2 != null) {
                return findViewById2;
            }
        }
        return findViewById(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: removeFooterView */
    public boolean mo75764x92601e84(android.view.View view) {
        if (view == null) {
            return false;
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        android.util.SparseArray sparseArray2 = this.footerViews;
        int size = sparseArray2.size();
        boolean z17 = false;
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray2.keyAt(i17);
            android.view.View view2 = (android.view.View) sparseArray2.valueAt(i17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view2, view)) {
                z17 = true;
            } else {
                sparseArray.put(sparseArray.size() + 200000, view2);
            }
        }
        if (!z17) {
            return false;
        }
        sparseArray2.clear();
        int size2 = sparseArray.size();
        for (int i18 = 0; i18 < size2; i18++) {
            sparseArray2.put(sparseArray.keyAt(i18), sparseArray.valueAt(i18));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: removeHeaderView */
    public boolean mo75765xb3928276(android.view.View view) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        android.util.SparseArray sparseArray2 = this.headerViews;
        int size = sparseArray2.size();
        boolean z17 = false;
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray2.keyAt(i17);
            android.view.View view2 = (android.view.View) sparseArray2.valueAt(i17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view2, view)) {
                z17 = true;
            } else {
                sparseArray.put(sparseArray.size() + 100000, view2);
            }
        }
        if (!z17) {
            return false;
        }
        sparseArray2.clear();
        int size2 = sparseArray.size();
        for (int i18 = 0; i18 < size2; i18++) {
            sparseArray2.put(sparseArray.keyAt(i18), sparseArray.valueAt(i18));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 s() {
        java.lang.Object mo7946xf939df19 = super.mo7946xf939df19();
        if (mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3) {
            return (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3) mo7946xf939df19;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: setAdapter */
    public void mo7960x6cab2c8d(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        android.util.SparseArray sparseArray = this.headerViews;
        android.util.SparseArray sparseArray2 = this.footerViews;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var = f2Var;
        r0Var = f2Var;
        r0Var = f2Var;
        if (f2Var != 0 && sparseArray != null && sparseArray2 != null) {
            boolean z17 = f2Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0;
            r0Var = f2Var;
            if (!z17) {
                boolean z18 = f2Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3;
                r0Var = f2Var;
                if (z18) {
                    r0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0(sparseArray, sparseArray2, f2Var, (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3) f2Var);
                }
            }
        }
        super.mo7960x6cab2c8d(r0Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setCacheColorHint */
    public void mo75766x340d102a(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setDivider */
    public void mo75767x150a9c57(android.graphics.drawable.Drawable drawable) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setItemChecked */
    public void mo75768x7ca79b52(int i17, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setOnScrollListener */
    public void mo75769x1a2696e2(android.widget.AbsListView.OnScrollListener onScrollListener) {
        super.m7969x1a2696e2(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u0());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setSelection */
    public void mo75770xf579a34a(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setSelectionFromTop */
    public void mo75771x46dba6a1(int i17, int i18) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView", "setSelectionFromTop", "(II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setSelector */
    public void mo75772xbd989261(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: setTranscriptMode */
    public void mo75773xf7ca0f7b(int i17) {
    }

    @Override // android.view.View, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public void setVisibility(int i17) {
        super.setVisibility(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: smoothScrollToPositionFromTop */
    public void mo75774x42b5b70c(int i17, int i18, int i19) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        c1(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public int x(int i17, int i18) {
        return i18;
    }
}
