package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public class n7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf f273328d;

    public n7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf) {
        this.f273328d = c19744xe1ab67bf;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf = this.f273328d;
        if (action == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerSeekBar", "ontouch down");
            int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf.D;
            c19744xe1ab67bf.f244016s = false;
            c19744xe1ab67bf.f244017t = motionEvent.getX();
            m34.e eVar = c19744xe1ab67bf.f244004d;
            if (eVar != null) {
                eVar.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            int i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf.D;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c19744xe1ab67bf.f244008h.getLayoutParams();
            int s17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf.s(c19744xe1ab67bf, layoutParams.leftMargin + ((int) (x17 - c19744xe1ab67bf.f244017t)), c19744xe1ab67bf.f272978y);
            layoutParams.leftMargin = s17;
            c19744xe1ab67bf.f244008h.setLayoutParams(layoutParams);
            int i19 = c19744xe1ab67bf.f272978y.f38864x6ac9171;
            if (c19744xe1ab67bf.f244012o > 0) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) c19744xe1ab67bf.f244006f.getLayoutParams();
                layoutParams2.width = s17;
                c19744xe1ab67bf.f244006f.setLayoutParams(layoutParams2);
            }
            c19744xe1ab67bf.mo61297xf1a3e670(i19);
            m34.e eVar2 = c19744xe1ab67bf.f244004d;
            if (eVar2 != null) {
                eVar2.d(i19);
            }
            c19744xe1ab67bf.f244016s = true;
        } else {
            int i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf.D;
            int i28 = c19744xe1ab67bf.f244013p;
            if (c19744xe1ab67bf.f244016s) {
                i28 = c19744xe1ab67bf.f272978y.f38864x6ac9171;
                c19744xe1ab67bf.f244013p = i28;
            }
            if (c19744xe1ab67bf.f244004d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerSeekBar", "current time : " + i28);
                c19744xe1ab67bf.f244004d.a(i28);
            }
            c19744xe1ab67bf.f244016s = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/tools/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
