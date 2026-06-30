package xc5;

/* loaded from: classes8.dex */
public final class b2 {
    public b2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String talker, long[] msgIdList, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdList, "msgIdList");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
        pf5.j0.a(intent, xc5.c2.class);
        intent.putExtra("key_msg_history_gallery_msg_id_list", msgIdList);
        intent.putExtra("img_gallery_msg_id", j17);
        intent.putExtra("img_gallery_talker", talker);
        intent.putExtra("img_gallery_chatroom_name", talker);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPreviewUI$Companion", "startPreview", "(Landroid/content/Context;Ljava/lang/String;[JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryPreviewUI$Companion", "startPreview", "(Landroid/content/Context;Ljava/lang/String;[JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }
}
