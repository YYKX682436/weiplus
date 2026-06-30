package io;

/* loaded from: classes.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.a1 f374970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ne5.a f374971e;

    public w(em.a1 a1Var, ne5.a aVar) {
        this.f374970d = a1Var;
        this.f374971e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingTextForwardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f374970d.f335582a.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_chat_from", context.getClass().getName());
        ne5.a aVar = this.f374971e;
        intent.putExtra("key_chat_text", aVar.j());
        intent.putExtra("Chat_Msg_Id", aVar.m75942xfb822ef2(aVar.f125235d + 0));
        intent.putExtra("Chat_User", aVar.m75945x2fec8307(aVar.f125235d + 1));
        intent.putExtra("key_chat_preview_hide_toolbar", true);
        intent.putExtra("is_group_chat", com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(aVar.m75945x2fec8307(aVar.f125235d + 1)));
        j45.l.u(context, ".ui.chatting.TextPreviewUI", intent, null);
        db5.f.j(context);
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingTextForwardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
