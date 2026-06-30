package com.tencent.mm.opensdk.channel;

/* loaded from: classes8.dex */
public class MMessageActV2 {
    public static final java.lang.String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
    public static final java.lang.String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
    public static final java.lang.String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    private static final java.lang.String TAG = "MicroMsg.SDK.MMessageAct";
    private byte _hellAccFlag_;

    /* loaded from: classes8.dex */
    public static class Args {
        public static final int INVALID_FLAGS = -1;
        public android.os.Bundle bundle;
        public java.lang.String content;
        public int flags = -1;
        public int launchMode = 2;
        public java.lang.String targetClassName;
        public java.lang.String targetPkgName;
        public java.lang.String token;

        public java.lang.String toString() {
            return "targetPkgName:" + this.targetPkgName + ", targetClassName:" + this.targetClassName + ", content:" + this.content + ", flags:" + this.flags + ", bundle:" + this.bundle;
        }
    }

    public static boolean send(android.content.Context context, com.tencent.mm.opensdk.channel.MMessageActV2.Args args) {
        java.lang.String str;
        if (context == null || args == null) {
            str = "send fail, invalid argument";
        } else if (com.tencent.mm.opensdk.utils.d.b(args.targetPkgName)) {
            str = "send fail, invalid targetPkgName, targetPkgName = " + args.targetPkgName;
        } else {
            if (com.tencent.mm.opensdk.utils.d.b(args.targetClassName)) {
                args.targetClassName = args.targetPkgName + DEFAULT_ENTRY_CLASS_NAME;
            }
            com.tencent.mm.opensdk.utils.Log.i(TAG, "send, targetPkgName = " + args.targetPkgName + ", targetClassName = " + args.targetClassName + ", launchMode = " + args.launchMode);
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(args.targetPkgName, args.targetClassName);
            android.os.Bundle bundle = args.bundle;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            java.lang.String packageName = context.getPackageName();
            intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
            intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT, args.content);
            intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.CHECK_SUM, com.tencent.mm.opensdk.channel.a.b.a(args.content, com.tencent.mm.opensdk.constants.Build.SDK_INT, packageName));
            intent.putExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.TOKEN, args.token);
            int i17 = args.flags;
            if (i17 == -1) {
                intent.addFlags(268435456).addFlags(134217728);
            } else {
                intent.setFlags(i17);
            }
            try {
                if (android.os.Build.VERSION.SDK_INT < 29 || args.launchMode != 2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/opensdk/channel/MMessageActV2", "send", "(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/opensdk/channel/MMessageActV2", "send", "(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    sendUsingPendingIntent(context, intent);
                }
                com.tencent.mm.opensdk.utils.Log.d(TAG, "send mm message, intent=".concat(java.lang.String.valueOf(intent)));
                return true;
            } catch (java.lang.Exception e17) {
                str = "send fail, ex = " + android.util.Log.getStackTraceString(e17);
            }
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, str);
        return false;
    }

    private static void sendUsingPendingIntent(android.content.Context context, android.content.Intent intent) {
        android.app.PendingIntent activity;
        try {
            com.tencent.mm.opensdk.utils.Log.i(TAG, "sendUsingPendingIntent");
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                android.app.ActivityOptions makeBasic = android.app.ActivityOptions.makeBasic();
                makeBasic.setPendingIntentBackgroundActivityStartMode(1);
                activity = android.app.PendingIntent.getActivity(context, 3, intent, 201326592, makeBasic.toBundle());
            } else {
                activity = android.app.PendingIntent.getActivity(context, 3, intent, 201326592);
            }
            activity.send(context, 4, null, new android.app.PendingIntent.OnFinished() { // from class: com.tencent.mm.opensdk.channel.MMessageActV2.1
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent2, int i17, java.lang.String str, android.os.Bundle bundle) {
                    com.tencent.mm.opensdk.utils.Log.i(com.tencent.mm.opensdk.channel.MMessageActV2.TAG, "sendUsingPendingIntent onSendFinished resultCode: " + i17 + ", resultData: " + str);
                }
            }, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "sendUsingPendingIntent fail, ex = " + e17.getMessage());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/opensdk/channel/MMessageActV2", "sendUsingPendingIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/opensdk/channel/MMessageActV2", "sendUsingPendingIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
