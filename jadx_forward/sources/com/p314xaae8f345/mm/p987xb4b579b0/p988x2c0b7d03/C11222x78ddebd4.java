package com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03;

/* renamed from: com.tencent.mm.opensdk.channel.MMessageActV2 */
/* loaded from: classes8.dex */
public class C11222x78ddebd4 {

    /* renamed from: DEFAULT_ENTRY_CLASS_NAME */
    public static final java.lang.String f32696xfc4f357d = ".wxapi.WXEntryActivity";

    /* renamed from: MM_ENTRY_PACKAGE_NAME */
    public static final java.lang.String f32697x47db1ad0 = "com.tencent.mm";

    /* renamed from: MM_MSG_ENTRY_CLASS_NAME */
    public static final java.lang.String f32698xec38697c = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    private static final java.lang.String TAG = "MicroMsg.SDK.MMessageAct";

    /* renamed from: _hellAccFlag_ */
    private byte f32699x7f11beae;

    /* renamed from: com.tencent.mm.opensdk.channel.MMessageActV2$Args */
    /* loaded from: classes8.dex */
    public static class Args {

        /* renamed from: INVALID_FLAGS */
        public static final int f32700xbdbfd9ff = -1;

        /* renamed from: bundle */
        public android.os.Bundle f32701xaddf3082;

        /* renamed from: content */
        public java.lang.String f32702x38b73479;

        /* renamed from: flags */
        public int f32703x5cfee87 = -1;

        /* renamed from: launchMode */
        public int f32704x208ebff6 = 2;

        /* renamed from: targetClassName */
        public java.lang.String f32705x81a4fd92;

        /* renamed from: targetPkgName */
        public java.lang.String f32706x6a744ba6;

        /* renamed from: token */
        public java.lang.String f32707x696b9f9;

        /* renamed from: toString */
        public java.lang.String m48402x9616526c() {
            return "targetPkgName:" + this.f32706x6a744ba6 + ", targetClassName:" + this.f32705x81a4fd92 + ", content:" + this.f32702x38b73479 + ", flags:" + this.f32703x5cfee87 + ", bundle:" + this.f32701xaddf3082;
        }
    }

    /* renamed from: send */
    public static boolean m48400x35cf88(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args) {
        java.lang.String str;
        if (context == null || args == null) {
            str = "send fail, invalid argument";
        } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(args.f32706x6a744ba6)) {
            str = "send fail, invalid targetPkgName, targetPkgName = " + args.f32706x6a744ba6;
        } else {
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(args.f32705x81a4fd92)) {
                args.f32705x81a4fd92 = args.f32706x6a744ba6 + f32696xfc4f357d;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "send, targetPkgName = " + args.f32706x6a744ba6 + ", targetClassName = " + args.f32705x81a4fd92 + ", launchMode = " + args.f32704x208ebff6);
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(args.f32706x6a744ba6, args.f32705x81a4fd92);
            android.os.Bundle bundle = args.f32701xaddf3082;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            java.lang.String packageName = context.getPackageName();
            intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
            intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, packageName);
            intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059, args.f32702x38b73479);
            intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32762xbdedaa54, com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.b.a(args.f32702x38b73479, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a, packageName));
            intent.putExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32809x4c4c1d9, args.f32707x696b9f9);
            int i17 = args.f32703x5cfee87;
            if (i17 == -1) {
                intent.addFlags(268435456).addFlags(134217728);
            } else {
                intent.setFlags(i17);
            }
            try {
                if (android.os.Build.VERSION.SDK_INT < 29 || args.f32704x208ebff6 != 2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/opensdk/channel/MMessageActV2", "send", "(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/opensdk/channel/MMessageActV2", "send", "(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    m48401xfde2a297(context, intent);
                }
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "send mm message, intent=".concat(java.lang.String.valueOf(intent)));
                return true;
            } catch (java.lang.Exception e17) {
                str = "send fail, ex = " + android.util.Log.getStackTraceString(e17);
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    /* renamed from: sendUsingPendingIntent */
    private static void m48401xfde2a297(android.content.Context context, android.content.Intent intent) {
        android.app.PendingIntent activity;
        try {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendUsingPendingIntent");
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
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.TAG, "sendUsingPendingIntent onSendFinished resultCode: " + i17 + ", resultData: " + str);
                }
            }, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "sendUsingPendingIntent fail, ex = " + e17.getMessage());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/opensdk/channel/MMessageActV2", "sendUsingPendingIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/opensdk/channel/MMessageActV2", "sendUsingPendingIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
