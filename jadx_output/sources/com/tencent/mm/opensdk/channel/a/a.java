package com.tencent.mm.opensdk.channel.a;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0047a {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f72327a;
        public java.lang.String action;

        /* renamed from: b, reason: collision with root package name */
        public long f72328b;
        public android.os.Bundle bundle;
        public java.lang.String content;
    }

    public static boolean a(android.content.Context context, com.tencent.mm.opensdk.channel.a.a.C0047a c0047a) {
        java.lang.String str;
        java.lang.String str2;
        if (context == null) {
            str2 = "send fail, invalid argument";
        } else {
            if (!com.tencent.mm.opensdk.utils.d.b(c0047a.action)) {
                if (com.tencent.mm.opensdk.utils.d.b(c0047a.f72327a)) {
                    str = null;
                } else {
                    str = c0047a.f72327a + ".permission.MM_MESSAGE";
                }
                android.content.Intent intent = new android.content.Intent(c0047a.action);
                android.os.Bundle bundle = c0047a.bundle;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                java.lang.String packageName = context.getPackageName();
                intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
                intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT, c0047a.content);
                intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c0047a.f72328b);
                intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.CHECK_SUM, com.tencent.mm.opensdk.channel.a.b.a(c0047a.content, com.tencent.mm.opensdk.constants.Build.SDK_INT, packageName));
                context.sendBroadcast(intent, str);
                com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str);
                return true;
            }
            str2 = "send fail, action is null";
        }
        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.MMessage", str2);
        return false;
    }
}
