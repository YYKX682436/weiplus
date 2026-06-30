package hn;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f363886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363888f;

    public m(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, java.lang.String str, java.lang.String str2) {
        this.f363886d = activityC21401x6ce6f73f;
        this.f363887e = str;
        this.f363888f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this.f363886d, "com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI");
        intent.putExtra("key_error_title", this.f363887e);
        intent.putExtra("key_error_content", this.f363888f);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f363886d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21401x6ce6f73f, arrayList.toArray(), "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppBindChatRoom$2$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21401x6ce6f73f.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21401x6ce6f73f, "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppBindChatRoom$2$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
