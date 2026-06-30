package com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/sensitive/business/BusinessStackRecorder;", "Landroid/content/BroadcastReceiver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "e85/b", "e85/c", "sensitive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sensitive.business.BusinessStackRecorder */
/* loaded from: classes10.dex */
public final class C21019x1c5c1f66 extends android.content.BroadcastReceiver implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static final e85.b f274716f = new e85.b(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f274717g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f274718h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.LinkedList f274719i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.LinkedList f274720m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f274721n = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("BusinessStackRecorder");

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f274722o = jz5.h.b(e85.a.f331830d);

    /* renamed from: d, reason: collision with root package name */
    public final int f274723d = 1000;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f274724e;

    public C21019x1c5c1f66() {
        try {
            d85.i1 i1Var = d85.i1.f308739a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(i1Var.a(context, "businessToActivityName.json"));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                org.json.JSONArray jSONArray = jSONObject.getJSONArray(next);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.util.HashMap hashMap = f274717g;
                    java.lang.String obj = jSONArray.get(i17).toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                    hashMap.put(obj, next);
                }
            }
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(i1Var.a(context2, "keywordToBusinessMap.json"));
            java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys2, "keys(...)");
            while (keys2.hasNext()) {
                java.lang.String next2 = keys2.next();
                java.lang.String optString = jSONObject2.optString(next2);
                java.util.HashMap hashMap2 = f274718h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                hashMap2.put(next2, optString);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "catch exception: " + e17.getMessage());
            j85.g.f379784a.b("initJson2Map", "[throwAbleStr] catch: " + e17.getCause());
        }
        this.f274724e = jz5.h.b(e85.f.f331840d);
    }

    public final void a(java.lang.String action, java.lang.String forceBusiness) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceBusiness, "forceBusiness");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(action);
        intent.putExtra("_application_context_process_", bm5.f1.a() + '@' + android.os.Process.myPid());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", forceBusiness);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", forceBusiness);
        intent.putExtra("MANUAL_BUSINESS", forceBusiness);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            c(intent);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        }
    }

    public final void b(java.lang.String action, java.lang.String activityName, java.lang.String activityRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRef, "activityRef");
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(action);
        intent.putExtra("_application_context_process_", bm5.f1.a() + '@' + android.os.Process.myPid());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", activityName);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", activityRef);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            c(intent);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        }
    }

    public final void c(android.content.Intent intent) {
        e85.c cVar;
        if (intent != null) {
            java.lang.String action = intent.getAction();
            java.lang.String stringExtra = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME");
            java.lang.String stringExtra2 = intent.getStringExtra("_application_context_process_");
            java.lang.String stringExtra3 = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF");
            java.lang.String stringExtra4 = intent.getStringExtra("MANUAL_BUSINESS");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            if (action == null || stringExtra == null || stringExtra2 == null || stringExtra3 == null) {
                cVar = null;
            } else {
                cVar = new e85.c(action, stringExtra, stringExtra3, stringExtra2, android.os.SystemClock.uptimeMillis());
                cVar.f331836f = stringExtra4;
            }
            if (cVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "receive " + cVar);
                jz5.g gVar = this.f274724e;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb()).mo50308x2936bf5f(((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb()).mo50292x733c63a2(this.f274723d, cVar));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", "onActivityDestroyed，activity = " + activity);
        b("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", activity.getClass().getName(), java.lang.String.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityPreCreated，activity = ");
        sb6.append(activity);
        sb6.append(", currentTopActivity = ");
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        java.lang.ref.WeakReference i17 = wVar.i();
        sb6.append(i17 != null ? (android.app.Activity) i17.get() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", sb6.toString());
        java.lang.ref.WeakReference i18 = wVar.i();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity, i18 != null ? (android.app.Activity) i18.get() : null) || !lk5.s.b(activity)) {
            b("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", activity.getClass().getName(), java.lang.String.valueOf(activity.hashCode()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResumed，activity = ");
        sb6.append(activity);
        sb6.append(", currentTopActivity = ");
        com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
        java.lang.ref.WeakReference i17 = wVar.i();
        sb6.append(i17 != null ? (android.app.Activity) i17.get() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BusinessStackRecorder", sb6.toString());
        java.lang.ref.WeakReference i18 = wVar.i();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity, i18 != null ? (android.app.Activity) i18.get() : null) || !lk5.s.b(activity)) {
            b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", activity.getClass().getName(), java.lang.String.valueOf(activity.hashCode()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        c(intent);
    }
}
