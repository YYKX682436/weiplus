package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class r9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286947e;

    public r9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 y9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        this.f286946d = f9Var;
        this.f286947e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286946d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", "sourceTV click msgId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.m(this.f286947e, f9Var.Q0(), f9Var.m124847x74d37ac6(), 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
