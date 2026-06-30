package yz2;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0 f550056d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0 c15540x683732f0) {
        this.f550056d = c15540x683732f0;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumberView", "showNumberRunnable current index:%s", java.lang.Integer.valueOf(this.f550056d.f218802d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0 c15540x683732f0 = this.f550056d;
        if (c15540x683732f0.getChildAt(c15540x683732f0.f218802d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0 c15540x683732f02 = this.f550056d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb c15541x39aaabeb = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb) c15540x683732f02.getChildAt(c15540x683732f02.f218802d);
            c15541x39aaabeb.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumberView", "show");
            android.view.View view = c15541x39aaabeb.f218806d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/view/FaceNumberView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/flash/view/FaceNumberView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c15541x39aaabeb.f218807e.clearAnimation();
            android.view.animation.Animation animation = c15541x39aaabeb.f218808f;
            animation.setFillAfter(true);
            animation.setDuration(500L);
            c15541x39aaabeb.f218807e.startAnimation(animation);
            c15541x39aaabeb.f218807e.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0 c15540x683732f03 = this.f550056d;
            int i17 = c15540x683732f03.f218802d + 1;
            c15540x683732f03.f218802d = i17;
            if (i17 <= c15540x683732f03.f218803e) {
                c15540x683732f03.f218804f = ((ku5.t0) ku5.t0.f394148d).E(this.f550056d.f218805g, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0.f218801h);
            }
        }
    }
}
