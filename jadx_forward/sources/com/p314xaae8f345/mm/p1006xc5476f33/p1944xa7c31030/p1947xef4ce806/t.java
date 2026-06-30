package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f234665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f234666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234667g;

    public t(android.content.Context context, int i17, long j17, android.content.Intent intent) {
        this.f234664d = context;
        this.f234665e = i17;
        this.f234666f = j17;
        this.f234667g = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Notification.Builder builder;
        android.content.Context context = this.f234664d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("当前 Java Runtime 内存 ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234677a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.a(wVar, this.f234666f));
        sb6.append("MB 超过阈值 ");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.a(wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234681e - 52428800));
        sb6.append("MB");
        java.lang.String sb7 = sb6.toString();
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, this.f234667g, 201326592);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.Object systemService = context.getSystemService("notification");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
            if (notificationManager.getNotificationChannel("com.tencent.matrix.resource.processor.ManualDumpProcessor") == null) {
                oj.j.e("MicroMsg.MemoryLimitPublisher", "create channel", new java.lang.Object[0]);
                notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.tencent.matrix.resource.processor.ManualDumpProcessor", "com.tencent.matrix.resource.processor.ManualDumpProcessor", 4));
            }
            builder = new android.app.Notification.Builder(context, "com.tencent.matrix.resource.processor.ManualDumpProcessor");
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        builder.setContentTitle(sb7).setStyle(new android.app.Notification.BigTextStyle().bigText("点击转发 HPROF 文件，如有疑问请联系 @aurorani")).setSmallIcon(com.p314xaae8f345.mm.R.C30861xcebc809e.btt).setAutoCancel(true).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis());
        java.lang.Object systemService2 = context.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService2).notify(this.f234665e, builder.build());
    }
}
