package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class md implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f286108b;

    public md(yb5.d dVar, java.lang.CharSequence charSequence) {
        this.f286107a = dVar;
        this.f286108b = charSequence;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i0
    public void a(android.text.SpannableString spannableString) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i0
    public void b(android.view.View view) {
        yb5.d dVar = this.f286107a;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar != null) {
            intent.putExtra("Chat_Msg_Id", erVar.c().m124847x74d37ac6());
            intent.putExtra("Chat_User", erVar.c().Q0());
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("key_chat_text", this.f286108b);
        }
        intent.putExtra("is_group_chat", dVar.D());
        android.app.Activity g17 = dVar.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(view.getContext());
    }
}
