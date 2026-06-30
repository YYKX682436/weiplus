package c43;

/* loaded from: classes15.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.x f38394d;

    public b0(c43.x xVar) {
        this.f38394d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null && (view.getTag() instanceof java.lang.Integer)) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            if (intValue == this.f38394d.X) {
                yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent();
            am.d2 d2Var = chatRoomLocateInfoEvent.f54039g;
            d2Var.f6428a = intValue;
            d2Var.f6431d = true;
            chatRoomLocateInfoEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
