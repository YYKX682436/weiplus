package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class fn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao f285518e;

    public fn(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar) {
        this.f285517d = dVar;
        this.f285518e = aoVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) view.getTag();
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = this.f285518e;
        final yb5.d dVar = this.f285517d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.m(f9Var, dVar, 1, new r.a() { // from class: com.tencent.mm.ui.chatting.viewitems.fn$$a
            @Override // r.a
            /* renamed from: apply */
            public final java.lang.Object mo1850x58b836e(java.lang.Object obj) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.h(((java.lang.Boolean) obj).booleanValue(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao.this, dVar);
                return null;
            }
        });
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
