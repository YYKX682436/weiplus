package com.p314xaae8f345.mm.p1006xc5476f33.p1286x59692e7.p1287xd1075a44;

/* renamed from: com.tencent.mm.plugin.bizui.widget.StoryListView */
/* loaded from: classes4.dex */
public class C12960x9140a858 extends android.widget.ListView implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f175441d;

    public C12960x9140a858(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.View C(int i17, int i18) {
        return getChildAt(i17 - i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.View F(int i17) {
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingListView", "null == view index:%s", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            childAt = getChildAt(i17 + getHeaderViewsCount());
        }
        return childAt;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.ViewGroup f() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    /* renamed from: getFirstCompletelyVisiblePosition */
    public int mo54248xf50f67b() {
        return getFirstVisiblePosition();
    }

    /* renamed from: getRecycledViewPool */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 m54249x4145728() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public void k(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 u3Var) {
        if (u3Var instanceof android.widget.ListAdapter) {
            super.setAdapter((android.widget.ListAdapter) u3Var);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        if (this.f175441d) {
            return;
        }
        super.layoutChildren();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public android.view.View q(int i17) {
        return findViewById(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 s() {
        android.widget.ListAdapter adapter = super.getAdapter();
        if (adapter instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3) {
            return (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3) adapter;
        }
        return null;
    }

    /* renamed from: setBlockLayoutChildren */
    public void m54250xedf4a574(boolean z17) {
        this.f175441d = z17;
    }

    /* renamed from: setLayoutManager */
    public void m54251x900dcbe1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3
    public int x(int i17, int i18) {
        return java.lang.Math.max(i17, i18 - getFirstVisiblePosition());
    }
}
