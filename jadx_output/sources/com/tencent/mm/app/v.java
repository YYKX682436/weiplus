package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class v extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f53847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.w f53848b;

    public v(com.tencent.mm.app.w wVar, com.tencent.mm.app.f fVar) {
        this.f53848b = wVar;
    }

    public void a(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(z17 ? "com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE" : "com.tencent.mm.AppForegroundDelegate.ACTION_DEAD");
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", str);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.DISPATCH_TIME", android.os.SystemClock.uptimeMillis());
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.app.w.f53874s);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        this.f53847a = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME");
        long longExtra = intent.getLongExtra("com.tencent.mm.AppForegroundDelegate.DISPATCH_TIME", 0L);
        boolean equalsIgnoreCase = "com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE".equalsIgnoreCase(action);
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - longExtra;
        boolean z17 = true;
        if (equalsIgnoreCase) {
            com.tencent.mm.app.w wVar = this.f53848b;
            java.lang.String str = this.f53847a;
            if (wVar.f53889n || !wVar.f53891p) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppForeground", "onAppForeground... activity[%s] expired[%sms]", str, java.lang.Long.valueOf(uptimeMillis));
            wVar.f53889n = true;
            wVar.f53883e.post(new com.tencent.mm.app.h(wVar, str));
            return;
        }
        com.tencent.mm.app.w wVar2 = this.f53848b;
        java.lang.String str2 = this.f53847a;
        if (wVar2.f53889n && wVar2.f53891p) {
            if (com.tencent.mm.app.w.f53876u) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                if (context2 != null && com.tencent.mm.sdk.platformtools.x2.f193072b != null) {
                    if (com.tencent.mm.sdk.platformtools.x2.f193076f == null) {
                        com.tencent.mm.sdk.platformtools.x2.f193076f = (android.app.ActivityManager) context2.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    }
                    try {
                        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : com.tencent.mm.sdk.platformtools.x2.f193076f.getRunningAppProcesses()) {
                            linkedList2.add(runningAppProcessInfo.processName + "@" + runningAppProcessInfo.pid);
                        }
                    } catch (java.lang.Error e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Error: " + e17.toString());
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Exception: " + e18.toString());
                    }
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.app.w.f53880y;
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (!linkedList2.contains(entry.getKey())) {
                        linkedList.add((java.lang.String) entry.getKey());
                    } else if (((com.tencent.mm.app.u) entry.getValue()).f53819a.size() > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppForegroundDelegate", "[isFallbackBackgroundValid] printRecord=%s", ((com.tencent.mm.app.u) entry.getValue()).f53819a.toString());
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("isFallbackBackgroundValid=false", ((com.tencent.mm.app.u) entry.getValue()).f53819a.toString());
                        } catch (org.json.JSONException unused) {
                        }
                        jx3.f.INSTANCE.d(20459, jSONObject.toString().replaceAll(",", ";"), 3L);
                        z17 = false;
                    }
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    concurrentHashMap.remove((java.lang.String) it.next());
                }
            }
            if (z17) {
                wVar2.f53889n = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppForeground", "onAppBackground... activity[%s] expired[%sms]", str2, java.lang.Long.valueOf(uptimeMillis));
                wVar2.f53883e.post(new com.tencent.mm.app.j(wVar2, str2));
            }
        }
    }
}
