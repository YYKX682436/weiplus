package df1;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf f311178d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf c12275xe1ab67bf) {
        this.f311178d = c12275xe1ab67bf;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf c12275xe1ab67bf = this.f311178d;
        if (action == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.VideoPlayerSeekBar", "ontouch down");
            c12275xe1ab67bf.f165172s = false;
            c12275xe1ab67bf.f165173t = motionEvent.getX();
            oe1.i1 i1Var = c12275xe1ab67bf.f165160d;
            if (i1Var != null) {
                i1Var.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c12275xe1ab67bf.f165164h.getLayoutParams();
            int s17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf.s(c12275xe1ab67bf, layoutParams.leftMargin + ((int) (x17 - c12275xe1ab67bf.f165173t)), c12275xe1ab67bf.f165184y);
            layoutParams.leftMargin = s17;
            c12275xe1ab67bf.f165164h.setLayoutParams(layoutParams);
            int i17 = c12275xe1ab67bf.f165184y.f38864x6ac9171;
            if (c12275xe1ab67bf.f165168o > 0) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) c12275xe1ab67bf.f165162f.getLayoutParams();
                layoutParams2.width = s17;
                c12275xe1ab67bf.f165162f.setLayoutParams(layoutParams2);
            }
            c12275xe1ab67bf.f165166m.setText(c12275xe1ab67bf.p(i17 / 60) + ":" + c12275xe1ab67bf.p(i17 % 60));
            c12275xe1ab67bf.f165172s = true;
        } else {
            int i18 = c12275xe1ab67bf.f165169p;
            if (c12275xe1ab67bf.f165172s) {
                i18 = c12275xe1ab67bf.f165184y.f38864x6ac9171;
                c12275xe1ab67bf.f165169p = i18;
            }
            if (c12275xe1ab67bf.f165160d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.VideoPlayerSeekBar", "current time : " + i18);
                c12275xe1ab67bf.f165160d.a(i18);
            }
            c12275xe1ab67bf.f165172s = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
