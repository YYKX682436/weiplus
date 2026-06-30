package cw2;

/* loaded from: classes2.dex */
public final class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305322d;

    public j8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305322d = c15196x85976f5f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m61460x51de1d06;
        android.view.View m61460x51de1d062;
        android.view.View m61460x51de1d063;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90;
        yz5.l onCustomLoadingStatusChange;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305322d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 longVideoSeekBar = c15196x85976f5f.getLongVideoSeekBar();
        if (longVideoSeekBar != null && (onCustomLoadingStatusChange = longVideoSeekBar.getOnCustomLoadingStatusChange()) != null) {
            onCustomLoadingStatusChange.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15196x85976f5f.m61471xe56ce956(), "[dismissLoading] " + c15196x85976f5f.d0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 newSeekBarLayout = c15196x85976f5f.getNewSeekBarLayout();
        if (newSeekBarLayout != null) {
            android.animation.AnimatorSet animatorSet = newSeekBarLayout.C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            newSeekBarLayout.C = null;
            android.view.View m61209xcc04d8cb = newSeekBarLayout.m61209xcc04d8cb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m61209xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m61209xcc04d8cb.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m61209xcc04d8cb, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (newSeekBarLayout.m61214x2f13401b().getVisibility() != 0 && (c15178x4303ff90 = newSeekBarLayout.fullSeekBarLayout) != null && c15178x4303ff90.hasHighlightInfo) {
                c15178x4303ff90.H();
            }
        }
        m61460x51de1d06 = c15196x85976f5f.m61460x51de1d06();
        m61460x51de1d06.animate().cancel();
        m61460x51de1d062 = c15196x85976f5f.m61460x51de1d06();
        if (m61460x51de1d062.getVisibility() != 8) {
            m61460x51de1d063 = c15196x85976f5f.m61460x51de1d06();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m61460x51de1d063, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m61460x51de1d063.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m61460x51de1d063, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
