package dw2;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 f325697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f325698e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 c15204x9dd9b8b0, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f325697d = c15204x9dd9b8b0;
        this.f325698e = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 c15204x9dd9b8b0 = this.f325697d;
        c15204x9dd9b8b0.f212304u.setEmpty();
        c15204x9dd9b8b0.f212294h.getGlobalVisibleRect(c15204x9dd9b8b0.f212304u);
        this.f325698e.topMargin = (int) (c15204x9dd9b8b0.f212304u.top + (c15204x9dd9b8b0.f212294h.getHeight() * 0.3f));
    }
}
