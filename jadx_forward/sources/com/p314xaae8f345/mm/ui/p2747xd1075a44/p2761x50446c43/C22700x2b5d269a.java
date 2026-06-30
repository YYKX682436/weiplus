package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43;

/* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView */
/* loaded from: classes15.dex */
public class C22700x2b5d269a extends android.widget.ExpandableListView {

    /* renamed from: d, reason: collision with root package name */
    public ql5.d f293676d;

    public C22700x2b5d269a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAnimationDuration */
    public int m82041xf2fc9082() {
        return 150;
    }

    public boolean c(int i17) {
        int flatListPosition = getFlatListPosition(android.widget.ExpandableListView.getPackedPositionForGroup(i17));
        if (flatListPosition != -1) {
            int firstVisiblePosition = flatListPosition - getFirstVisiblePosition();
            if (firstVisiblePosition < 0 || firstVisiblePosition >= getChildCount()) {
                return collapseGroup(i17);
            }
            if (getChildAt(firstVisiblePosition).getBottom() >= getBottom()) {
                return collapseGroup(i17);
            }
        }
        long expandableListPosition = getExpandableListPosition(getFirstVisiblePosition());
        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(expandableListPosition);
        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(expandableListPosition);
        if (packedPositionChild == -1 || packedPositionGroup != i17) {
            packedPositionChild = 0;
        }
        ql5.d dVar = this.f293676d;
        int i18 = ql5.d.f446128c;
        ql5.g a17 = dVar.a(i17);
        a17.f446139a = true;
        a17.f446141c = packedPositionChild;
        a17.f446140b = false;
        this.f293676d.notifyDataSetChanged();
        return isGroupExpanded(i17);
    }

    public boolean d(int i17) {
        int firstVisiblePosition;
        int flatListPosition = getFlatListPosition(android.widget.ExpandableListView.getPackedPositionForGroup(i17));
        if (flatListPosition != -1 && (firstVisiblePosition = flatListPosition - getFirstVisiblePosition()) < getChildCount() && getChildAt(firstVisiblePosition).getBottom() >= getBottom()) {
            this.f293676d.a(i17).f446142d = -1;
            return expandGroup(i17);
        }
        ql5.d dVar = this.f293676d;
        int i18 = ql5.d.f446128c;
        ql5.g a17 = dVar.a(i17);
        a17.f446139a = true;
        a17.f446141c = 0;
        a17.f446140b = true;
        return expandGroup(i17);
    }

    @Override // android.widget.ExpandableListView
    public void setAdapter(android.widget.ExpandableListAdapter expandableListAdapter) {
        super.setAdapter(expandableListAdapter);
        if (expandableListAdapter instanceof ql5.d) {
            ql5.d dVar = (ql5.d) expandableListAdapter;
            this.f293676d = dVar;
            dVar.f446130b = this;
        } else {
            throw new java.lang.ClassCastException(expandableListAdapter.toString() + " must implement AnimatedExpandableListAdapter");
        }
    }

    public C22700x2b5d269a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
