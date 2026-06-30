package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.MapExploreByTouchHelper */
/* loaded from: classes13.dex */
public abstract class AbstractC4252x6e14267f extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d {

    /* renamed from: MAP_ACTION_CLICKED */
    protected static final int f16528xac49c461 = 1;

    /* renamed from: NO_ITEM */
    protected static final int f16529xaa5212d1 = -1;

    /* renamed from: accessibleTouchItems */
    public java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc> f16530xdc739417;

    public AbstractC4252x6e14267f(android.view.View view) {
        super(view);
        this.f16530xdc739417 = new java.util.ArrayList();
    }

    /* renamed from: getTargetPoiItemIdx */
    public abstract int mo35379x139cb8e7(float f17, float f18);

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: getVirtualViewAt */
    public int mo7249xde3240ed(float f17, float f18) {
        int mo35379x139cb8e7 = mo35379x139cb8e7(f17, f18);
        if (mo35379x139cb8e7 == -1) {
            return Integer.MIN_VALUE;
        }
        return mo35379x139cb8e7;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: getVisibleVirtualViews */
    public void mo7250x3082c07f(java.util.List<java.lang.Integer> list) {
        for (int i17 = 0; i17 < this.f16530xdc739417.size(); i17++) {
            list.add(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: onItemClicked */
    public abstract boolean mo35380x30062a35(int i17);

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: onPerformActionForVirtualView */
    public boolean mo7256x6c00bf3f(int i17, int i18, android.os.Bundle bundle) {
        if (i18 == 16) {
            return mo35380x30062a35(i17);
        }
        return false;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: onPopulateEventForVirtualView */
    public void mo7258xbdc6e658(int i17, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (i17 >= this.f16530xdc739417.size()) {
            accessibilityEvent.getText().add("");
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc abstractC4234xc56d2fbc = this.f16530xdc739417.get(i17);
        if (abstractC4234xc56d2fbc == null) {
            throw new java.lang.IllegalArgumentException("Invalid virtual view id");
        }
        accessibilityEvent.getText().add(abstractC4234xc56d2fbc.mo35239xc77303b9());
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: onPopulateNodeForVirtualView */
    public void mo7260xeb1f1232(int i17, o3.l lVar) {
        if (i17 >= this.f16530xdc739417.size()) {
            lVar.v("");
            lVar.k(new android.graphics.Rect());
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc abstractC4234xc56d2fbc = this.f16530xdc739417.get(i17);
        if (abstractC4234xc56d2fbc == null) {
            throw new java.lang.IllegalArgumentException("Invalid virtual view id");
        }
        lVar.v(abstractC4234xc56d2fbc.mo35239xc77303b9());
        lVar.k(abstractC4234xc56d2fbc.mo35238x12a519ab());
        lVar.a(16);
    }

    /* renamed from: onTalkBackActivate */
    public void mo35381x672f01c5(android.view.View view) {
        n3.l1.l(view, this);
    }

    /* renamed from: onTalkBackDeActivate */
    public void mo35382x6aa174e6(android.view.View view) {
        n3.l1.l(view, null);
    }
}
