package cw2;

/* loaded from: classes2.dex */
public final class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305680d;

    public z8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305680d = c15196x85976f5f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305680d;
        c15196x85976f5f.m61481x6966400a().animate().cancel();
        android.view.View m61481x6966400a = c15196x85976f5f.m61481x6966400a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m61481x6966400a, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m61481x6966400a.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m61481x6966400a, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cw2.ca seekBarLayout = c15196x85976f5f.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.m122862x901b6914(8);
        }
        c15196x85976f5f.x();
    }
}
