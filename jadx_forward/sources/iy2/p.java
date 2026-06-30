package iy2;

/* loaded from: classes13.dex */
public final class p implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 f377438d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4) {
        this.f377438d = c15488x2a0085b4;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4 = this.f377438d;
        if (action != 0) {
            if (action == 1) {
                if (c15488x2a0085b4.E) {
                    c15488x2a0085b4.E = false;
                    yj0.a.i(false, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                c15488x2a0085b4.getTAG();
                c15488x2a0085b4.getCurrentState();
                if (c15488x2a0085b4.D) {
                    c15488x2a0085b4.g(true, false);
                    c15488x2a0085b4.D = false;
                    c15488x2a0085b4.getClass();
                } else {
                    c15488x2a0085b4.g(false, true);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new iy2.q(c15488x2a0085b4), 100L);
            }
        } else {
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(c15488x2a0085b4.getContext())) {
                c15488x2a0085b4.E = true;
                iy2.e voiceDetectListener = c15488x2a0085b4.getVoiceDetectListener();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(voiceDetectListener);
                ((iy2.z) voiceDetectListener).a(12, 0, 0);
                yj0.a.i(false, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            c15488x2a0085b4.E = false;
            c15488x2a0085b4.D = false;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            c15488x2a0085b4.getClass();
            c15488x2a0085b4.getTAG();
            c15488x2a0085b4.getCurrentState();
            iy2.b bVar = c15488x2a0085b4.C;
            if (bVar != null) {
                bVar.f377413s = 6;
                bVar.f377414t.cancel();
                bVar.invalidateSelf();
            }
            c15488x2a0085b4.g(false, false);
            android.widget.TextView textView = c15488x2a0085b4.B;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            textView.setVisibility(8);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl$onTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
