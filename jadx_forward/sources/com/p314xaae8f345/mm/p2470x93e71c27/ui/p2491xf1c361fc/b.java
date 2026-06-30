package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e f273586d;

    public b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e c19758xc331845e) {
        this.f273586d = c19758xc331845e;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e c19758xc331845e = this.f273586d;
        if (action == 0) {
            c19758xc331845e.f273581t = false;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            c19758xc331845e.getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = c19758xc331845e.f273580s;
            g3Var.f272389s = 6;
            g3Var.f272390t.cancel();
            g3Var.invalidateSelf();
            c19758xc331845e.i(false, false);
        } else if (action == 1) {
            int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e.f273578w;
            int i18 = c19758xc331845e.f271389g;
            if (c19758xc331845e.f273581t) {
                c19758xc331845e.i(true, false);
                c19758xc331845e.f273581t = false;
                c19758xc331845e.getClass();
            } else {
                c19758xc331845e.i(false, true);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
