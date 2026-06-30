package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes.dex */
public abstract class c4 {

    /* renamed from: a, reason: collision with root package name */
    public static long f270801a;

    public static void a(android.content.Intent intent) {
        long longExtra = intent.getLongExtra("msg_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("msg_talker");
        boolean booleanExtra = intent.getBooleanExtra("msg_share_forbidden", false);
        boolean booleanExtra2 = intent.getBooleanExtra("open_in_device", false);
        java.lang.String stringExtra2 = intent.getStringExtra("file_path");
        java.lang.String stringExtra3 = intent.getStringExtra("file_ext");
        java.lang.String stringExtra4 = intent.getStringExtra("file_name");
        java.lang.String stringExtra5 = intent.getStringExtra("file_md5");
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_multi_task_common_info");
        int intExtra = intent.getIntExtra("sence", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TBSFileBrowseHelper", "openFileByMiniQB filePath:" + stringExtra2 + ", fileExt:" + stringExtra3 + ", sence:" + intExtra);
        if (java.lang.System.currentTimeMillis() - f270801a < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TBSFileBrowseHelper", "openFileByMiniQB ignore, too close");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TBSFileBrowseHelper", "openFileByMiniQB failed, filePath is empty");
            return;
        }
        f270801a = java.lang.System.currentTimeMillis();
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI");
        intent2.putExtra("msg_id", longExtra);
        intent2.putExtra("msg_talker", stringExtra);
        intent2.putExtra("msg_share_forbidden", booleanExtra);
        intent2.putExtra("open_in_device", booleanExtra2);
        intent2.putExtra("file_path", stringExtra2);
        intent2.putExtra("file_ext", stringExtra3);
        intent2.putExtra("file_name", stringExtra4);
        intent2.putExtra("file_md5", stringExtra5);
        intent2.putExtra("sence", intExtra);
        intent2.putExtra("key_multi_task_common_info", byteArrayExtra);
        if (9 == intExtra && byteArrayExtra == null) {
            ep1.m.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent2, true);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if ((stringExtra == null ? "" : stringExtra).startsWith("gh_")) {
                ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                boolean g17 = r01.z.g(stringExtra);
                if (g17) {
                    intent2.putExtra("key_is_biz_chat", g17);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(stringExtra, longExtra);
                    if (Li != null) {
                        intent2.putExtra("key_biz_chat_id", Li.t0());
                    }
                }
            }
        }
        intent2.addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/TBSFileBrowseHelper", "loadByMiniQB", "(JLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[B)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/model/TBSFileBrowseHelper", "loadByMiniQB", "(JLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[B)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
