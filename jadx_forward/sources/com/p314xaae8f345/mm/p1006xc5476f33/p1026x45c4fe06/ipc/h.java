package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* loaded from: classes7.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c f159938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f159939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f159940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f159941g;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c, java.lang.Class cls, android.content.Context context, android.content.Intent intent) {
        this.f159938d = abstractC11887x3610e10c;
        this.f159939e = cls;
        this.f159940f = context;
        this.f159941g = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c = this.f159938d;
        int mo50397x4930e041 = abstractC11887x3610e10c.mo50397x4930e041();
        java.lang.Class cls = this.f159939e;
        android.content.Context context = this.f159940f;
        android.content.Intent intent = this.f159941g;
        if (!(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class == cls && mo50397x4930e041 == -1) && (context instanceof android.app.Activity)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(mo50397x4930e041));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8() && abstractC11887x3610e10c.mo50404x2733f359()) {
            try {
                android.app.PendingIntent.getActivity(context, -1, intent, 201326592).send(cf.b.a(abstractC11887x3610e10c), new android.app.PendingIntent.OnFinished() { // from class: com.tencent.mm.plugin.appbrand.ipc.h$$a
                    @Override // android.app.PendingIntent.OnFinished
                    public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent2, int i17, java.lang.String str, android.os.Bundle bundle) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", "startLogicProxy start with pendingIntent finished for req:%s", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c.this);
                    }
                }, (android.os.Handler) null);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "startLogicProxy start with pendingIntent get exception:%s for req:%s", e17, abstractC11887x3610e10c);
            }
        }
        android.content.Context context2 = this.f159940f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
