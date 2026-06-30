package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f178651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f178652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 f178653f;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 r0Var, h02.a aVar, boolean z17) {
        this.f178653f = r0Var;
        this.f178651d = aVar;
        this.f178652e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.PendingIntent pendingIntent;
        h02.a aVar = this.f178651d;
        int i17 = aVar.f68421xf1ebe47b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 r0Var = this.f178653f;
        if (i17 == 1) {
            java.lang.String str = aVar.f68419xf1e9b966;
            r0Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13219x837298b0.class);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 3);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178491o, str);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178492p, aVar.f68426x4b6e68b9);
            intent.putExtra("downloadId", aVar.f68408x32b20428);
            pendingIntent = android.app.PendingIntent.getBroadcast(context, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(0));
        } else if (i17 == 5) {
            r0Var.getClass();
            android.content.Intent intent2 = new android.content.Intent();
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            intent2.setClass(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13219x837298b0.class);
            intent2.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178490n, 4);
            intent2.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13221x3505cfd1.f178491o, aVar.f68419xf1e9b966);
            intent2.putExtra("downloadId", aVar.f68408x32b20428);
            android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context2, (int) java.lang.System.currentTimeMillis(), intent2, fp.g0.a(0));
            try {
                java.lang.String appId = new org.json.JSONObject(aVar.f68417x26b3182a).getString("appId");
                ((com.p314xaae8f345.mm.p874xaefb6cc9.x0) ((ft.m4) i95.n0.c(ft.m4.class))).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
                com.p314xaae8f345.mm.p874xaefb6cc9.j1.f150617a.a(appId);
                ((com.p314xaae8f345.mm.p874xaefb6cc9.x0) ((ft.m4) i95.n0.c(ft.m4.class))).wi("download");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloadManager", e17, "onDownloadSuccess preloadWVA Exception", new java.lang.Object[0]);
            }
            pendingIntent = broadcast;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "onDownloadSuccess field_fileType[%d]", java.lang.Integer.valueOf(i17));
            pendingIntent = null;
        }
        if (aVar.f68421xf1ebe47b == 5) {
            r0Var.g().j(aVar, 3, false);
            r0Var.y(aVar.f68404x28d45f97, aVar.f68428x579b8428, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhm), pendingIntent);
        } else if (aVar.f68435x73c7b92d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f68428x579b8428)) {
            r0Var.y(aVar.f68404x28d45f97, aVar.f68428x579b8428, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cej), pendingIntent);
        } else if (aVar.f68435x73c7b92d && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f68418xf1e8cfcc)) {
            r0Var.y(aVar.f68404x28d45f97, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cej), "", pendingIntent);
        } else if (aVar.f68435x73c7b92d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f68418xf1e8cfcc)) {
            r0Var.y(aVar.f68404x28d45f97, aVar.f68418xf1e8cfcc, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cej), pendingIntent);
        }
        if (aVar.f68406x8d834527 && aVar.f68421xf1ebe47b == 1 && !aVar.f68431x4651c731) {
            r0Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f68419xf1e9b966)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadManager", "installApk, path is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "APK File Path: %s", aVar.f68419xf1e9b966);
                k02.l.a(aVar.f68408x32b20428, true, null);
            }
        }
        r0Var.f178664f.d(aVar.f68408x32b20428, aVar.f68419xf1e9b966, this.f178652e);
    }
}
