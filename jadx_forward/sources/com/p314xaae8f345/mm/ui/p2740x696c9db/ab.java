package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class ab implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f291809d;

    public ab(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752) {
        this.f291809d = activityC22534xec824752;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f291809d;
        if (itemId == 2) {
            int i18 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.f291723u;
            activityC22534xec824752.W6();
            return;
        }
        if (itemId != 4) {
            return;
        }
        int i19 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.f291723u;
        long longExtra = activityC22534xec824752.getIntent().getLongExtra("key_message_id", -1L);
        java.lang.String stringExtra = activityC22534xec824752.getIntent().getStringExtra("key_message_talker");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activityC22534xec824752, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        intent.putExtra("Retr_Msg_Id", longExtra);
        intent.putExtra("Retr_MsgTalker", stringExtra);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC22534xec824752, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI", "doSendMsgToDevice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22534xec824752.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC22534xec824752, "com/tencent/mm/ui/tools/ShowImageUI", "doSendMsgToDevice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
