package dt;

/* loaded from: classes11.dex */
public class m4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        android.app.Notification b17;
        int i17;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        int W0 = r21.w.wi().W0();
        am.ul ulVar = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5765xb189a8e0) abstractC20979x809547d1).f136082g;
        int i18 = ulVar.f89638c;
        java.lang.String str = ulVar.f89636a;
        java.lang.String d17 = com.p314xaae8f345.mm.p2614xca6eae71.g.b().d(ulVar.f89637b);
        if (com.p314xaae8f345.mm.app.w7.f135434n == null) {
            com.p314xaae8f345.mm.app.w7.f135434n = new qm.z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        com.p314xaae8f345.mm.app.w7.f135434n.getClass();
        android.app.Notification notification = new android.app.Notification();
        notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.f78060x313c79;
        notification.when = java.lang.System.currentTimeMillis();
        notification.flags = 16;
        android.content.Intent intent = new android.content.Intent();
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20239x152d18ed()) == 1) {
            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI");
            intent.setAction("friend_message_verify_record");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "showNewFriendNotification, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new) via FMessageTransferUI");
        } else {
            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "showNewFriendNotification, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
        }
        intent.setFlags(335544320);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent, fp.g0.a(134217728));
        if (i18 == 1 || i18 == 2) {
            java.lang.String string = i18 == 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbd) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbe);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hay);
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbr);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI");
            intent2.putExtra("friend_message_transfer_username", str);
            intent2.setAction("friend_message_ignore_" + str);
            android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent2, fp.g0.a(134217728));
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.subapp.ui.friend.FMessageTransferUI");
            intent3.putExtra("friend_message_transfer_username", str);
            intent3.setAction("friend_message_accept_" + str);
            android.app.PendingIntent activity3 = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent3, fp.g0.a(134217728));
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).getClass();
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.i0 i0Var = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.f145037a;
            i0Var.getClass();
            om.a aVar = new om.a();
            aVar.f427775a = notification;
            aVar.f427776b = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            aVar.f427777c = 1;
            aVar.f427778d = activity;
            aVar.f427779e = d17;
            aVar.f427780f = string;
            aVar.f427781g = d17 + string;
            aVar.f427782h = a17;
            aVar.f427783i = com.p314xaae8f345.mm.R.C30861xcebc809e.ccb;
            aVar.f427784j = string2;
            aVar.f427785k = activity2;
            aVar.f427786l = com.p314xaae8f345.mm.R.C30861xcebc809e.cca;
            aVar.f427787m = string3;
            aVar.f427788n = activity3;
            aVar.f427789o = str;
            b17 = i0Var.f145032a.b(aVar);
            i17 = 2;
        } else {
            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbc);
            if (W0 > 2) {
                d17 = d17 + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hb_, java.lang.Integer.valueOf(W0));
            }
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.c7v));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/app/WorkerProfile", "callbackOfNotifyNewFriendRequestEvent", "(Lcom/tencent/mm/autogen/events/NotifyNewFriendRequestEvent;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/app/WorkerProfile", "callbackOfNotifyNewFriendRequestEvent", "(Lcom/tencent/mm/autogen/events/NotifyNewFriendRequestEvent;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            java.lang.String str2 = d17;
            i17 = 2;
            b17 = ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).j(notification, com.p314xaae8f345.mm.R.C30861xcebc809e.c7v, 1, activity, str2, string4, d17 + string4, decodeResource, str);
        }
        b17.priority = i17;
        if (str != null) {
            com.p314xaae8f345.mm.app.w7.f135432i = 2130706432 | (str.hashCode() & 16777215);
        } else {
            com.p314xaae8f345.mm.app.w7.f135432i = 2130706432;
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).n(com.p314xaae8f345.mm.app.w7.f135432i, b17, false);
        if (W0 == 0) {
            return true;
        }
        java.lang.StringBuilder sb6 = com.p314xaae8f345.mm.app.w7.f135433m;
        sb6.append(com.p314xaae8f345.mm.app.w7.f135432i + ",");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("notify_newfriend_prep", 0).edit().putString("notify_newfriend_prep", sb6.toString()).commit();
        return true;
    }
}
