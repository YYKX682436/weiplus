package cw2;

/* loaded from: classes2.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305434d;

    public o8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305434d = c15196x85976f5f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m61460x51de1d06;
        android.view.View m61460x51de1d062;
        android.view.View m61460x51de1d063;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305434d;
        m61460x51de1d06 = c15196x85976f5f.m61460x51de1d06();
        android.view.ViewGroup.LayoutParams layoutParams = m61460x51de1d06.getLayoutParams();
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            m61460x51de1d062 = c15196x85976f5f.m61460x51de1d06();
            int dimension = (int) m61460x51de1d062.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            layoutParams2.setMarginEnd(0);
            if (17 != layoutParams2.gravity) {
                layoutParams2.gravity = 17;
                m61460x51de1d063 = c15196x85976f5f.m61460x51de1d06();
                m61460x51de1d063.requestLayout();
            }
        }
        c15196x85976f5f.V(new cw2.y8(c15196x85976f5f));
    }
}
