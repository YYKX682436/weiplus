package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes3.dex */
public class h1 implements android.view.View.OnLongClickListener {
    public h1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/SpanProcessor$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == null) {
            yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/span/SpanProcessor$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpanProcessor", "shouldPerformLongClick and click");
        boolean performLongClick = view.performLongClick();
        yj0.a.i(performLongClick, this, "com/tencent/mm/pluginsdk/ui/span/SpanProcessor$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return performLongClick;
    }
}
