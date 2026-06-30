package com.tencent.mm.plugin.bizui.widget;

/* loaded from: classes4.dex */
public class StoryListView extends android.widget.ListView implements com.tencent.mm.pluginsdk.ui.tools.v3 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f93908d;

    public StoryListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View C(int i17, int i18) {
        return getChildAt(i17 - i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View F(int i17) {
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            com.tencent.mars.xlog.Log.e("ChattingListView", "null == view index:%s", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            childAt = getChildAt(i17 + getHeaderViewsCount());
        }
        return childAt;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.ViewGroup f() {
        return this;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int getFirstCompletelyVisiblePosition() {
        return getFirstVisiblePosition();
    }

    public androidx.recyclerview.widget.y2 getRecycledViewPool() {
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void i(androidx.recyclerview.widget.w2 w2Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public void k(com.tencent.mm.pluginsdk.ui.tools.u3 u3Var) {
        if (u3Var instanceof android.widget.ListAdapter) {
            super.setAdapter((android.widget.ListAdapter) u3Var);
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        if (this.f93908d) {
            return;
        }
        super.layoutChildren();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public android.view.View q(int i17) {
        return findViewById(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public com.tencent.mm.pluginsdk.ui.tools.u3 s() {
        android.widget.ListAdapter adapter = super.getAdapter();
        if (adapter instanceof com.tencent.mm.pluginsdk.ui.tools.u3) {
            return (com.tencent.mm.pluginsdk.ui.tools.u3) adapter;
        }
        return null;
    }

    public void setBlockLayoutChildren(boolean z17) {
        this.f93908d = z17;
    }

    public void setLayoutManager(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.v3
    public int x(int i17, int i18) {
        return java.lang.Math.max(i17, i18 - getFirstVisiblePosition());
    }
}
