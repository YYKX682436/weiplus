package hb5;

/* loaded from: classes11.dex */
public class q implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 f361784d;

    public q(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4) {
        this.f361784d = activityC21585x4f340ac4;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatFavUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4 = this.f361784d;
        long j18 = ((s01.h) activityC21585x4f340ac4.f279450f.getItem(i17)).f69168x92559640;
        activityC21585x4f340ac4.getClass();
        android.content.Intent intent = new android.content.Intent(activityC21585x4f340ac4, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent.addFlags(67108864);
        intent.putExtra("Chat_User", activityC21585x4f340ac4.f279452h);
        intent.putExtra("key_biz_chat_id", j18);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_need_send_video", false);
        intent.putExtra("key_is_biz_chat", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC21585x4f340ac4, arrayList2.toArray(), "com/tencent/mm/ui/bizchat/BizChatFavUI", "goToChattingUI", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21585x4f340ac4.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC21585x4f340ac4, "com/tencent/mm/ui/bizchat/BizChatFavUI", "goToChattingUI", "(J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new hb5.s(activityC21585x4f340ac4), 500L);
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatFavUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
