package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public final class b7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19740xe82b0b7f f273063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f273064e;

    public b7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19740xe82b0b7f c19740xe82b0b7f, float f17) {
        this.f273063d = c19740xe82b0b7f;
        this.f273064e = f17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        float f17 = this.f273064e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19740xe82b0b7f c19740xe82b0b7f = this.f273063d;
        if (action == 0) {
            android.widget.TextView m75796x63b38b8c = c19740xe82b0b7f.m75796x63b38b8c();
            m75796x63b38b8c.setTextColor(c19740xe82b0b7f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231));
            m75796x63b38b8c.setTextSize(0, f17 * 0.9f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            c19740xe82b0b7f.m75796x63b38b8c().setTextSize(0, f17);
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
