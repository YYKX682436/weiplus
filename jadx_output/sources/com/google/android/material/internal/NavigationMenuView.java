package com.google.android.material.internal;

/* loaded from: classes15.dex */
public class NavigationMenuView extends androidx.recyclerview.widget.RecyclerView implements o.i0 {
    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // o.i0
    public void r(o.r rVar) {
    }

    public NavigationMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
    }
}
