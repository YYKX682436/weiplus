package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest f78405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f78406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f78407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f78408g;

    public h(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest, java.lang.Class cls, android.content.Context context, android.content.Intent intent) {
        this.f78405d = appBrandProxyUIProcessTask$ProcessRequest;
        this.f78406e = cls;
        this.f78407f = context;
        this.f78408g = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest = this.f78405d;
        int startActivityRequestCode = appBrandProxyUIProcessTask$ProcessRequest.getStartActivityRequestCode();
        java.lang.Class cls = this.f78406e;
        android.content.Context context = this.f78407f;
        android.content.Intent intent = this.f78408g;
        if (!(com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class == cls && startActivityRequestCode == -1) && (context instanceof android.app.Activity)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(startActivityRequestCode));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground() && appBrandProxyUIProcessTask$ProcessRequest.usePendingIntentOnBackground()) {
            try {
                android.app.PendingIntent.getActivity(context, -1, intent, 201326592).send(cf.b.a(appBrandProxyUIProcessTask$ProcessRequest), new android.app.PendingIntent.OnFinished() { // from class: com.tencent.mm.plugin.appbrand.ipc.h$$a
                    @Override // android.app.PendingIntent.OnFinished
                    public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent2, int i17, java.lang.String str, android.os.Bundle bundle) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", "startLogicProxy start with pendingIntent finished for req:%s", com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest.this);
                    }
                }, (android.os.Handler) null);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "startLogicProxy start with pendingIntent get exception:%s for req:%s", e17, appBrandProxyUIProcessTask$ProcessRequest);
            }
        }
        android.content.Context context2 = this.f78407f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
