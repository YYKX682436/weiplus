package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class w3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 f273570d;

    public w3(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 c19656x5a7dec62) {
        this.f273570d = c19656x5a7dec62;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 c19656x5a7dec62 = this.f273570d;
        if (action == 0) {
            c19656x5a7dec62.f271399t = false;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19656x5a7dec62.f271400u = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = c19656x5a7dec62.f271398s;
            g3Var.f272389s = 6;
            g3Var.f272390t.cancel();
            g3Var.invalidateSelf();
            c19656x5a7dec62.i(false, false);
        } else if (action == 1) {
            int i17 = c19656x5a7dec62.f271389g;
            if (c19656x5a7dec62.f271399t) {
                c19656x5a7dec62.i(true, false);
                c19656x5a7dec62.f271399t = false;
                c19656x5a7dec62.f271400u = 0L;
            } else {
                c19656x5a7dec62.i(false, true);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
