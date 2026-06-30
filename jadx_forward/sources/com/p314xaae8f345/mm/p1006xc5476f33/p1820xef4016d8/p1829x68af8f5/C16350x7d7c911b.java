package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout */
/* loaded from: classes5.dex */
public class C16350x7d7c911b extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a {
    public final java.util.List D;
    public boolean E;

    public C16350x7d7c911b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new java.util.ArrayList();
        this.E = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.util.Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((android.view.View.OnTouchListener) it.next()).onTouch(this, motionEvent);
        }
        if (this.E) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C16350x7d7c911b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.D = new java.util.ArrayList();
        this.E = false;
    }
}
