package com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.p3176x2844fce5.p3177x2daeb0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/wechat/zrpc/ext_channel/aidl/AidlZChannelService;", "Landroid/app/Service;", "<init>", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "Companion", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.wechat.zrpc.ext_channel.aidl.AidlZChannelService */
/* loaded from: classes12.dex */
public final class ServiceC27721x2504d25c extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        android.content.pm.Signature[] apkContentsSigners;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("bizName");
        java.lang.String str = "";
        java.lang.String str2 = stringExtra == null ? "" : stringExtra;
        android.content.pm.Signature signature = null;
        if (str2.length() == 0) {
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AidlZChannelService", "onBind: bizName is empty");
            }
            return null;
        }
        java.lang.String msg = "onBind: bizName=".concat(str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (iw5.o.f376808a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelService", msg);
        }
        java.lang.String packageName = getPackageName();
        try {
            int i17 = android.os.Build.VERSION.SDK_INT;
            android.content.pm.PackageInfo packageInfo = i17 >= 30 ? getPackageManager().getPackageInfo(packageName, 134217728) : getPackageManager().getPackageInfo(packageName, 64);
            if (i17 >= 30) {
                android.content.pm.SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo != null && (apkContentsSigners = signingInfo.getApkContentsSigners()) != null) {
                    signature = (android.content.pm.Signature) kz5.z.O(apkContentsSigners);
                }
            } else {
                android.content.pm.Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null) {
                    signature = (android.content.pm.Signature) kz5.z.O(signatureArr);
                }
            }
            if (signature != null) {
                byte[] digest = java.security.MessageDigest.getInstance("SHA-1").digest(signature.toByteArray());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
                str = kz5.z.a0(digest, "", null, null, 0, null, jw5.c.f383883d, 30, null);
            }
        } catch (java.lang.Exception e17) {
            java.lang.String msg2 = "get signature sha1 error: " + e17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AidlUtil", msg2);
            }
        }
        return new jw5.d(str2, packageName + '|' + str);
    }
}
