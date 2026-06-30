package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43;

/* renamed from: com.tencent.mm.ui.widget.listview.OverScrollListView */
/* loaded from: classes5.dex */
public class C22701x3d56d064 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public int f293677d;

    /* renamed from: e, reason: collision with root package name */
    public float f293678e;

    public C22701x3d56d064(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f293678e = motionEvent.getY(0);
        } else if (action == 2) {
            this.f293677d = (int) java.lang.Math.abs(motionEvent.getY(0) - this.f293678e);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean overScrollBy(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        com.p314xaae8f345.mm.ui.yk.a("OverScrollListView", "dancy test maxOverScrollYDis: %s", java.lang.Integer.valueOf(this.f293677d));
        return super.overScrollBy(i17, i18, i19, i27, i28, i29, i37, this.f293677d / 2, z17);
    }

    public C22701x3d56d064(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
