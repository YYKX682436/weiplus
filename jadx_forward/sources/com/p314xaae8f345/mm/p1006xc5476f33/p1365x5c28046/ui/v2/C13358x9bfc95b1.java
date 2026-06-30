package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.PreViewListGridView */
/* loaded from: classes5.dex */
public class C13358x9bfc95b1 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f179879d;

    /* renamed from: e, reason: collision with root package name */
    public int f179880e;

    public C13358x9bfc95b1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        b(context);
    }

    public final void b(android.content.Context context) {
        new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19692xb2c668da(getContext());
        this.f179880e = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561913wb);
        this.f179879d = (android.view.WindowManager) context.getSystemService("window");
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-1, -1, 2, 8, 1);
        int i17 = this.f179880e;
        layoutParams.width = i17;
        layoutParams.height = i17;
        layoutParams.gravity = 17;
        if (getResources().getConfiguration().orientation == 2) {
            this.f179879d.getDefaultDisplay().getHeight();
            this.f179879d.getDefaultDisplay().getWidth();
        } else {
            this.f179879d.getDefaultDisplay().getWidth();
            this.f179879d.getDefaultDisplay().getHeight();
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: setEnablePreView */
    public void m54843x7fea43a3(boolean z17) {
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public C13358x9bfc95b1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        b(context);
    }
}
