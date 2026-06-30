package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853 f178583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j f178584e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853 c13217x9736d853) {
        this.f178584e = jVar;
        this.f178583d = c13217x9736d853;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9;
        java.lang.ref.WeakReference weakReference = this.f178584e.f178588d;
        android.content.Context context = null;
        if (weakReference == null || weakReference.get() == null) {
            c27816xac2547f9 = null;
        } else {
            c27816xac2547f9 = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) this.f178584e.f178588d.get();
            if (c27816xac2547f9 != null) {
                context = c27816xac2547f9.getContext();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853 c13217x9736d853 = this.f178583d;
        if (c13217x9736d853 == null || !c13217x9736d853.f178468d) {
            if (c27816xac2547f9 != null) {
                c27816xac2547f9.mo32265x141096a9(this.f178584e.f178589e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "reload apk");
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "confirm type: %d", java.lang.Integer.valueOf(c13217x9736d853.f178469e));
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context2 = context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853 c13217x9736d8532 = this.f178583d;
        int i17 = c13217x9736d8532.f178469e;
        if (i17 == 0) {
            if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                dp.a.m125854x26a183b(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573741fm1), 0).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "startDownload fail, network not ready");
                return;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || !(context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) || ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).isFinishing()) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10768xcfd1c1ef.f149992e, this.f178583d, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.d(this));
                return;
            } else {
                db5.e1.D(context2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5x), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5q), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h(this), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
                return;
            }
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "coonfirm url: %s", c13217x9736d8532.f178470f);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context2, "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
        intent.putExtra("task_name", this.f178583d.f178472h);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f178583d.f178472h);
        intent.putExtra("thumb_url", this.f178583d.f178473i);
        intent.putExtra("task_url", this.f178583d.f178474m);
        intent.putExtra("alternative_url", this.f178583d.f178475n);
        intent.putExtra("task_size", this.f178583d.f178476o);
        intent.putExtra("file_md5", this.f178583d.f178478q);
        intent.putExtra("fileType", 1);
        intent.putExtra("appid", this.f178583d.f178471g);
        intent.putExtra("package_name", this.f178583d.f178477p);
        if (c27816xac2547f9 != null) {
            intent.putExtra("page_url", c27816xac2547f9.mo120156xb5887639());
        }
        intent.putExtra("page_scene", -1);
        intent.putExtra("task_scene", 8070);
        intent.addFlags(268435456);
        android.content.Context context4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context4, arrayList.toArray(), "com/tencent/mm/plugin/downloader/model/DownloadChecker$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context4.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context4, "com/tencent/mm/plugin/downloader/model/DownloadChecker$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
