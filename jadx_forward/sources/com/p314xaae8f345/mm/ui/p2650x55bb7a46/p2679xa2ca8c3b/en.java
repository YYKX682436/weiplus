package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class en implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go f285426b;

    public en(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar) {
        this.f285425a = dVar;
        this.f285426b = goVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i0
    public void a(android.text.SpannableString spannableString) {
        this.f285426b.S = spannableString;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i0
    public void b(android.view.View view) {
        yb5.d dVar = this.f285425a;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go goVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) view.getTag();
        if (goVar != null) {
            intent.putExtra("Chat_Msg_Id", goVar.c().m124847x74d37ac6());
            intent.putExtra("Chat_User", goVar.c().Q0());
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("key_chat_text", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).q0(goVar.c(), false));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(goVar.c(), 1, 0);
        }
        intent.putExtra("is_group_chat", dVar.D());
        android.app.Activity g17 = dVar.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$6", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$6", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(view.getContext());
    }
}
