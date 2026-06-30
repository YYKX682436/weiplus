package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes3.dex */
public class g1 implements android.view.View.OnClickListener {
    public g1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/SpanProcessor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpanProcessor", "shouldPerformClick and click");
            view.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/SpanProcessor$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
