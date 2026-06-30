package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class i4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b f182694d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b) {
        this.f182694d = activityC13569x56faec8b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b = this.f182694d;
        if (view != activityC13569x56faec8b.f181906e) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int rawY = (int) motionEvent.getRawY();
        int[] iArr = new int[2];
        activityC13569x56faec8b.f181918t = activityC13569x56faec8b.getResources().getDisplayMetrics().heightPixels;
        activityC13569x56faec8b.f181906e.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (rawY > activityC13569x56faec8b.f181918t - com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC13569x56faec8b, 60.0f) || rawY >= i17) {
                        android.view.View view2 = activityC13569x56faec8b.f181916r;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view3 = activityC13569x56faec8b.f181917s;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view4 = activityC13569x56faec8b.f181916r;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view5 = activityC13569x56faec8b.f181917s;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else if (action == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavPostVoiceUI", "action cancel");
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b.O6(activityC13569x56faec8b);
                }
            } else {
                if (!activityC13569x56faec8b.f181907f) {
                    yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                if (activityC13569x56faec8b.f181917s.getVisibility() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavPostVoiceUI", "action up -> cancel");
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b.O6(activityC13569x56faec8b);
                } else if (!activityC13569x56faec8b.f181910i) {
                    activityC13569x56faec8b.P6();
                }
            }
        } else if (!activityC13569x56faec8b.f181907f) {
            activityC13569x56faec8b.f181907f = true;
            activityC13569x56faec8b.f181906e.setKeepScreenOn(true);
            activityC13569x56faec8b.f181906e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.awn);
            activityC13569x56faec8b.f181906e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ccf);
            activityC13569x56faec8b.f181910i = false;
            ((bv.r0) ((cv.c1) i95.n0.c(cv.c1.class))).getClass();
            tl.y0 y0Var = new tl.y0();
            y0Var.f501724d = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h4(activityC13569x56faec8b);
            activityC13569x56faec8b.f181921w = y0Var;
            if (y0Var.a(activityC13569x56faec8b.f181922x, 3600010)) {
                activityC13569x56faec8b.f181908g = android.os.SystemClock.elapsedRealtime();
                activityC13569x56faec8b.A.c(200L, 200L);
                activityC13569x56faec8b.f181915q.setVisibility(0);
                activityC13569x56faec8b.f181923y.c(100L, 100L);
                activityC13569x56faec8b.f181919u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cbk);
            } else {
                activityC13569x56faec8b.f181908g = 0L;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
