package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public final class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee f273544d;

    public y6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee) {
        this.f273544d = c19739x911a23ee;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee.f272960l1;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee = this.f273544d;
        c19739x911a23ee.getClass();
        java.util.List list2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee.f272960l1;
        int size = list2.size();
        if (size <= 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o5 playerUIReporter = c19739x911a23ee.getPlayerUIReporter();
            if (playerUIReporter != null) {
                float f17 = c19739x911a23ee.M;
                playerUIReporter.b(f17, f17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedesignVideoPlayerSeekBarWithAnimation", "on speedRatioTextView click, speed range is empty");
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        float floatValue = ((java.lang.Number) list2.get((list2.indexOf(java.lang.Float.valueOf(c19739x911a23ee.M)) + 1) % size)).floatValue();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o5 playerUIReporter2 = c19739x911a23ee.getPlayerUIReporter();
        if (playerUIReporter2 != null) {
            playerUIReporter2.b(c19739x911a23ee.M, floatValue);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w6 w6Var = c19739x911a23ee.N;
        if (w6Var != null) {
            w6Var.a(floatValue);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
