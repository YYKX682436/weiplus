package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class v extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f135380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.w f135381b;

    public v(com.p314xaae8f345.mm.app.w wVar, com.p314xaae8f345.mm.app.f fVar) {
        this.f135381b = wVar;
    }

    public void a(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(z17 ? "com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE" : "com.tencent.mm.AppForegroundDelegate.ACTION_DEAD");
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", str);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.DISPATCH_TIME", android.os.SystemClock.uptimeMillis());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent, com.p314xaae8f345.mm.app.w.f135407s);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        this.f135380a = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME");
        long longExtra = intent.getLongExtra("com.tencent.mm.AppForegroundDelegate.DISPATCH_TIME", 0L);
        boolean equalsIgnoreCase = "com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE".equalsIgnoreCase(action);
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - longExtra;
        boolean z17 = true;
        if (equalsIgnoreCase) {
            com.p314xaae8f345.mm.app.w wVar = this.f135381b;
            java.lang.String str = this.f135380a;
            if (wVar.f135422n || !wVar.f135424p) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppForeground", "onAppForeground... activity[%s] expired[%sms]", str, java.lang.Long.valueOf(uptimeMillis));
            wVar.f135422n = true;
            wVar.f135416e.post(new com.p314xaae8f345.mm.app.h(wVar, str));
            return;
        }
        com.p314xaae8f345.mm.app.w wVar2 = this.f135381b;
        java.lang.String str2 = this.f135380a;
        if (wVar2.f135422n && wVar2.f135424p) {
            if (com.p314xaae8f345.mm.app.w.f135409u) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                if (context2 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b != null) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274609f == null) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274609f = (android.app.ActivityManager) context2.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                    }
                    try {
                        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274609f.getRunningAppProcesses()) {
                            linkedList2.add(runningAppProcessInfo.processName + "@" + runningAppProcessInfo.pid);
                        }
                    } catch (java.lang.Error e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Error: " + e17.toString());
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMApplicationContext", "isMMProcessExist Exception: " + e18.toString());
                    }
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.app.w.f135413y;
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (!linkedList2.contains(entry.getKey())) {
                        linkedList.add((java.lang.String) entry.getKey());
                    } else if (((com.p314xaae8f345.mm.app.u) entry.getValue()).f135352a.size() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppForegroundDelegate", "[isFallbackBackgroundValid] printRecord=%s", ((com.p314xaae8f345.mm.app.u) entry.getValue()).f135352a.toString());
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("isFallbackBackgroundValid=false", ((com.p314xaae8f345.mm.app.u) entry.getValue()).f135352a.toString());
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
                wVar2.f135422n = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppForeground", "onAppBackground... activity[%s] expired[%sms]", str2, java.lang.Long.valueOf(uptimeMillis));
                wVar2.f135416e.post(new com.p314xaae8f345.mm.app.j(wVar2, str2));
            }
        }
    }
}
