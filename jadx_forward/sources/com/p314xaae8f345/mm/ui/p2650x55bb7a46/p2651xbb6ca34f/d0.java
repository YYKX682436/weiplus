package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes9.dex */
public class d0 implements android.view.View.OnLongClickListener {
    public d0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0 e0Var) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0.f279963f != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0.f279963f.b(view, intValue, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0.f279964g).h(intValue));
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
