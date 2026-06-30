package com.p314xaae8f345.mm.p2617xca9a2a67;

/* loaded from: classes12.dex */
public class p implements android.os.Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f275201g = new java.util.HashSet(java.util.Arrays.asList("com.tencent.mm.plugin.wear.model.service.WearDataLayerService", "com.tencent.mm.plugin.account.model.AccountAuthenticatorService", "com.tencent.mm.plugin.account.model.ContactsSyncService", "com.tencent.mm.plugin.hld.WxHldService", "com.tencent.mm.plugin.fcm.WCFirebaseMessagingService", "com.tencent.mm.plugin.fcm.FCMInstanceIDListenerService", "com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService", "com.tencent.smtt.sandbox.SandboxedProcessService0", "com.tencent.smtt.sandbox.SandboxedProcessService1", "com.google.firebase.iid.FirebaseInstanceIdService", "com.google.firebase.messaging.FirebaseMessagingService", "com.google.android.gms.auth.api.signin.RevocationBoundService"));

    /* renamed from: h, reason: collision with root package name */
    public static boolean f275202h = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f275203d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler.Callback f275204e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f275205f = false;

    public p(android.content.Context context, java.lang.Object obj, android.os.Handler.Callback callback) {
        this.f275203d = obj;
        this.f275204e = callback;
    }

    public final void a(java.lang.Object obj) {
        java.lang.Object obj2 = this.f275203d;
        if (fp.h.b(25)) {
            try {
                if (com.p314xaae8f345.mm.p2617xca9a2a67.q.f275212g == null) {
                    java.lang.reflect.Field declaredField = java.lang.Class.forName("android.app.ActivityThread$ActivityClientRecord").getDeclaredField("mPreserveWindow");
                    declaredField.setAccessible(true);
                    com.p314xaae8f345.mm.p2617xca9a2a67.q.f275212g = declaredField;
                }
                if (obj instanceof android.os.IBinder) {
                    if (com.p314xaae8f345.mm.p2617xca9a2a67.q.f275213h == null) {
                        java.lang.reflect.Field declaredField2 = obj2.getClass().getDeclaredField("mActivities");
                        declaredField2.setAccessible(true);
                        com.p314xaae8f345.mm.p2617xca9a2a67.q.f275213h = (java.util.Map) declaredField2.get(obj2);
                    }
                    obj = com.p314xaae8f345.mm.p2617xca9a2a67.q.f275213h.get(obj);
                }
                com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackHandlerCallback", "preserveWindow is %s, will set false", java.lang.Boolean.valueOf(((java.lang.Boolean) com.p314xaae8f345.mm.p2617xca9a2a67.q.f275212g.get(obj)).booleanValue()));
                com.p314xaae8f345.mm.p2617xca9a2a67.q.f275212g.set(obj, java.lang.Boolean.FALSE);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p2617xca9a2a67.j.e(e17, "");
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int indexOf;
        com.p314xaae8f345.mm.p2617xca9a2a67.p pVar;
        if (this.f275205f) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackHandlerCallback", "found a infinite call loop", new java.lang.Object[0]);
            return false;
        }
        f275202h = false;
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackHandlerCallback", "before handleMessage %s, splash %s, pending early %s, obj %s", java.lang.Integer.valueOf(message.what), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2617xca9a2a67.j.f275183i), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2617xca9a2a67.j.f275184j), message.obj);
        if (message.what == 987654321 && (pVar = com.p314xaae8f345.mm.p2617xca9a2a67.q.f275210e) != null && message.obj == pVar) {
            message.arg2 = 1;
            return true;
        }
        if (com.p314xaae8f345.mm.p2617xca9a2a67.j.f275183i && !com.p314xaae8f345.mm.p2617xca9a2a67.j.f275184j) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackHandlerCallback", "handleMessage %s, splash %s", java.lang.Integer.valueOf(message.what), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2617xca9a2a67.j.f275183i));
            int i17 = message.what;
            if (i17 == 113 || i17 == 114 || i17 == 115 || i17 == 116 || i17 == 121 || i17 == 122 || i17 == 145) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.copyFrom(message);
                com.p314xaae8f345.mm.p2617xca9a2a67.j.f275176b.add(obtain);
                if (com.p314xaae8f345.mm.p2617xca9a2a67.j.f275181g != null) {
                    nm.a.a(512);
                }
                return true;
            }
        }
        int i18 = message.what;
        if (i18 == 126 || (android.os.Build.VERSION.SDK_INT >= 28 && i18 == 160)) {
            java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p2617xca9a2a67.j.f275182h;
            if (hashSet.size() > 0) {
                f275202h = true;
            }
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackHandlerCallback", "received a RELAUNCH_ACTIVITY message, with %s splash activity", java.lang.Integer.valueOf(hashSet.size()));
            a(message.obj);
        }
        if (message.what == 134) {
            java.lang.Object obj = message.obj;
            if (obj instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) obj;
                com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackHandlerCallback", "DOS_PROOF: remote crash msg: %s", str);
                if (str.contains("did not then call Service.startForeground()") && (indexOf = str.indexOf("ServiceRecord{")) >= 0) {
                    java.lang.String[] split = str.substring(indexOf).split(" +");
                    if (split.length >= 3) {
                        java.lang.String str2 = split[2];
                        if (str2.endsWith("}")) {
                            str2 = str2.substring(0, str2.length() - 1);
                        }
                        android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str2.trim());
                        if (((java.util.HashSet) f275201g).contains(unflattenFromString.getClassName())) {
                            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.SplashHackHandlerCallback", "DOS_PROOF: DOS related to '%s' was avoided.", unflattenFromString.getClassName());
                            return true;
                        }
                    }
                }
            }
        }
        android.os.Handler.Callback callback = this.f275204e;
        if (callback == null) {
            return false;
        }
        this.f275205f = true;
        boolean handleMessage = callback.handleMessage(message);
        this.f275205f = false;
        return handleMessage;
    }
}
