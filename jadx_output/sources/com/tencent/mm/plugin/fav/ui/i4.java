package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class i4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavPostVoiceUI f101161d;

    public i4(com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI) {
        this.f101161d = favPostVoiceUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI = this.f101161d;
        if (view != favPostVoiceUI.f100373e) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int rawY = (int) motionEvent.getRawY();
        int[] iArr = new int[2];
        favPostVoiceUI.f100385t = favPostVoiceUI.getResources().getDisplayMetrics().heightPixels;
        favPostVoiceUI.f100373e.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (rawY > favPostVoiceUI.f100385t - com.tencent.mm.sdk.platformtools.j.d(favPostVoiceUI, 60.0f) || rawY >= i17) {
                        android.view.View view2 = favPostVoiceUI.f100383r;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view3 = favPostVoiceUI.f100384s;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view4 = favPostVoiceUI.f100383r;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view5 = favPostVoiceUI.f100384s;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else if (action == 3) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavPostVoiceUI", "action cancel");
                    com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.O6(favPostVoiceUI);
                }
            } else {
                if (!favPostVoiceUI.f100374f) {
                    yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                if (favPostVoiceUI.f100384s.getVisibility() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavPostVoiceUI", "action up -> cancel");
                    com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.O6(favPostVoiceUI);
                } else if (!favPostVoiceUI.f100377i) {
                    favPostVoiceUI.P6();
                }
            }
        } else if (!favPostVoiceUI.f100374f) {
            favPostVoiceUI.f100374f = true;
            favPostVoiceUI.f100373e.setKeepScreenOn(true);
            favPostVoiceUI.f100373e.setBackgroundResource(com.tencent.mm.R.drawable.awn);
            favPostVoiceUI.f100373e.setText(com.tencent.mm.R.string.ccf);
            favPostVoiceUI.f100377i = false;
            ((bv.r0) ((cv.c1) i95.n0.c(cv.c1.class))).getClass();
            tl.y0 y0Var = new tl.y0();
            y0Var.f420191d = new com.tencent.mm.plugin.fav.ui.h4(favPostVoiceUI);
            favPostVoiceUI.f100388w = y0Var;
            if (y0Var.a(favPostVoiceUI.f100389x, 3600010)) {
                favPostVoiceUI.f100375g = android.os.SystemClock.elapsedRealtime();
                favPostVoiceUI.A.c(200L, 200L);
                favPostVoiceUI.f100382q.setVisibility(0);
                favPostVoiceUI.f100390y.c(100L, 100L);
                favPostVoiceUI.f100386u.setText(com.tencent.mm.R.string.cbk);
            } else {
                favPostVoiceUI.f100375g = 0L;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
