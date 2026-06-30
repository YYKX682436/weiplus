package m31;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc f404738d;

    public r(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc) {
        this.f404738d = activityC11167x3e42f9bc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc activityC11167x3e42f9bc = this.f404738d;
        intent.putExtra("Chat_User", activityC11167x3e42f9bc.f153396i);
        intent.putExtra("key_biz_half_screen_chat_style", true);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("key_template_msg_username", activityC11167x3e42f9bc.f153396i);
        intent.putExtra("key_template_history_msg", true);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_template_msg_id", activityC11167x3e42f9bc.f153397m);
        j45.l.u(activityC11167x3e42f9bc, "com.tencent.mm.ui.chatting.BizHalfScreenChattingUI", intent, null);
        j31.e.d(4, activityC11167x3e42f9bc.f153398n);
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
