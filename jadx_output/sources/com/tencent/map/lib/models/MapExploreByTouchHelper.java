package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public abstract class MapExploreByTouchHelper extends androidx.customview.widget.d {
    protected static final int MAP_ACTION_CLICKED = 1;
    protected static final int NO_ITEM = -1;
    public java.util.List<com.tencent.map.lib.models.AccessibleTouchItem> accessibleTouchItems;

    public MapExploreByTouchHelper(android.view.View view) {
        super(view);
        this.accessibleTouchItems = new java.util.ArrayList();
    }

    public abstract int getTargetPoiItemIdx(float f17, float f18);

    @Override // androidx.customview.widget.d
    public int getVirtualViewAt(float f17, float f18) {
        int targetPoiItemIdx = getTargetPoiItemIdx(f17, f18);
        if (targetPoiItemIdx == -1) {
            return Integer.MIN_VALUE;
        }
        return targetPoiItemIdx;
    }

    @Override // androidx.customview.widget.d
    public void getVisibleVirtualViews(java.util.List<java.lang.Integer> list) {
        for (int i17 = 0; i17 < this.accessibleTouchItems.size(); i17++) {
            list.add(java.lang.Integer.valueOf(i17));
        }
    }

    public abstract boolean onItemClicked(int i17);

    @Override // androidx.customview.widget.d
    public boolean onPerformActionForVirtualView(int i17, int i18, android.os.Bundle bundle) {
        if (i18 == 16) {
            return onItemClicked(i17);
        }
        return false;
    }

    @Override // androidx.customview.widget.d
    public void onPopulateEventForVirtualView(int i17, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (i17 >= this.accessibleTouchItems.size()) {
            accessibilityEvent.getText().add("");
            return;
        }
        com.tencent.map.lib.models.AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(i17);
        if (accessibleTouchItem == null) {
            throw new java.lang.IllegalArgumentException("Invalid virtual view id");
        }
        accessibilityEvent.getText().add(accessibleTouchItem.getContentDescription());
    }

    @Override // androidx.customview.widget.d
    public void onPopulateNodeForVirtualView(int i17, o3.l lVar) {
        if (i17 >= this.accessibleTouchItems.size()) {
            lVar.v("");
            lVar.k(new android.graphics.Rect());
            return;
        }
        com.tencent.map.lib.models.AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(i17);
        if (accessibleTouchItem == null) {
            throw new java.lang.IllegalArgumentException("Invalid virtual view id");
        }
        lVar.v(accessibleTouchItem.getContentDescription());
        lVar.k(accessibleTouchItem.getBounds());
        lVar.a(16);
    }

    public void onTalkBackActivate(android.view.View view) {
        n3.l1.l(view, this);
    }

    public void onTalkBackDeActivate(android.view.View view) {
        n3.l1.l(view, null);
    }
}
