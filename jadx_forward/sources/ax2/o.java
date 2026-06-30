package ax2;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 f96611d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 c15391xf2263481) {
        this.f96611d = c15391xf2263481;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout m62563xecf09dbd;
        android.widget.HorizontalScrollView m62562xff977c4c;
        android.widget.HorizontalScrollView m62562xff977c4c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15391xf2263481 c15391xf2263481 = this.f96611d;
        m62563xecf09dbd = c15391xf2263481.m62563xecf09dbd();
        int width = m62563xecf09dbd.getWidth();
        android.animation.ObjectAnimator objectAnimator = c15391xf2263481.f213350q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        m62562xff977c4c = c15391xf2263481.m62562xff977c4c();
        int[] iArr = new int[2];
        iArr[0] = 0;
        m62562xff977c4c2 = c15391xf2263481.m62562xff977c4c();
        int width2 = width - m62562xff977c4c2.getWidth();
        iArr[1] = width2 >= 0 ? width2 : 0;
        c15391xf2263481.f213350q = android.animation.ObjectAnimator.ofInt(m62562xff977c4c, "scrollX", iArr);
        android.animation.ObjectAnimator objectAnimator2 = c15391xf2263481.f213350q;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(5000L);
        }
        android.animation.ObjectAnimator objectAnimator3 = c15391xf2263481.f213350q;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }
}
