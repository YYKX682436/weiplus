package io.p3284xd2ae381c.p3301xc5476f33.p3308x36452d;

/* renamed from: io.flutter.plugin.text.ProcessTextPlugin */
/* loaded from: classes8.dex */
public class C28746x47d2866f implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.ProcessTextMethodHandler {
    private static final java.lang.String TAG = "ProcessTextPlugin";

    /* renamed from: activityBinding */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 f71915x18e39476;

    /* renamed from: packageManager */
    private final android.content.pm.PackageManager f71916x2e2c3887;

    /* renamed from: processTextChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47 f71917x8d1f9127;

    /* renamed from: requestsByCode */
    private java.util.Map<java.lang.Integer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result> f71918x68fa93c8 = new java.util.HashMap();

    /* renamed from: resolveInfosById */
    private java.util.Map<java.lang.String, android.content.pm.ResolveInfo> f71919xcb2bbe6b;

    public C28746x47d2866f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47 c28666xfae34d47) {
        this.f71917x8d1f9127 = c28666xfae34d47;
        this.f71916x2e2c3887 = c28666xfae34d47.f71450x2e2c3887;
    }

    /* renamed from: cacheResolveInfos */
    private void m138859x6716e39b() {
        this.f71919xcb2bbe6b = new java.util.HashMap();
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.content.Intent type = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (android.content.pm.ResolveInfo resolveInfo : i17 >= 33 ? this.f71916x2e2c3887.queryIntentActivities(type, android.content.pm.PackageManager.ResolveInfoFlags.of(0L)) : this.f71916x2e2c3887.queryIntentActivities(type, 0)) {
            java.lang.String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f71916x2e2c3887).toString();
            this.f71919xcb2bbe6b.put(str, resolveInfo);
        }
    }

    /* renamed from: destroy */
    public void m138860x5cd39ffa() {
        this.f71917x8d1f9127.m138294x6b2b1e7(null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (!this.f71918x68fa93c8.containsKey(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        this.f71918x68fa93c8.remove(java.lang.Integer.valueOf(i17)).mo65720x90b54003(i18 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        this.f71915x18e39476 = interfaceC28627xb16524e3;
        interfaceC28627xb16524e3.mo137502xbf77c2e1(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f71915x18e39476.mo137517xa002e684(this);
        this.f71915x18e39476 = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f71915x18e39476.mo137517xa002e684(this);
        this.f71915x18e39476 = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        this.f71915x18e39476 = interfaceC28627xb16524e3;
        interfaceC28627xb16524e3.mo137502xbf77c2e1(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.ProcessTextMethodHandler
    /* renamed from: processTextAction */
    public void mo138295x42f65592(java.lang.String str, java.lang.String str2, boolean z17, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (this.f71915x18e39476 == null) {
            result.mo65718x5c4d208("error", "Plugin not bound to an Activity", null);
            return;
        }
        java.util.Map<java.lang.String, android.content.pm.ResolveInfo> map = this.f71919xcb2bbe6b;
        if (map == null) {
            result.mo65718x5c4d208("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        android.content.pm.ResolveInfo resolveInfo = map.get(str);
        if (resolveInfo == null) {
            result.mo65718x5c4d208("error", "Text processing activity not found", null);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.hashCode());
        this.f71918x68fa93c8.put(valueOf, result);
        android.content.Intent intent = new android.content.Intent();
        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z17);
        android.app.Activity mo137508x19263085 = this.f71915x18e39476.mo137508x19263085();
        int intValue = valueOf.intValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(mo137508x19263085, arrayList.toArray(), "io/flutter/plugin/text/ProcessTextPlugin", "processTextAction", "(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/plugin/common/MethodChannel$Result;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28666xfae34d47.ProcessTextMethodHandler
    /* renamed from: queryTextActions */
    public java.util.Map<java.lang.String, java.lang.String> mo138296x8494a128() {
        if (this.f71919xcb2bbe6b == null) {
            m138859x6716e39b();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.f71919xcb2bbe6b.keySet()) {
            hashMap.put(str, this.f71919xcb2bbe6b.get(str).loadLabel(this.f71916x2e2c3887).toString());
        }
        return hashMap;
    }
}
