package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes12.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f92243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.x1 f92245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92246g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92247h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.w3 f92248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String str, com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var, java.lang.String str2, java.lang.String str3, r45.w3 w3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f92244e = str;
        this.f92245f = x1Var;
        this.f92246g = str2;
        this.f92247h = str3;
        this.f92248i = w3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.wxassistant.n1(this.f92244e, this.f92245f, this.f92246g, this.f92247h, this.f92248i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.wxassistant.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.app.Notification.Builder builder;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f92243d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            java.lang.String title = this.f92244e;
            kotlin.jvm.internal.o.g(title, "title");
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                java.lang.Object systemService = context.getSystemService("notification");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
                if (notificationManager.getNotificationChannel("MicroMsg.DEBUG.NotificationUtil") == null) {
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("MicroMsg.DEBUG.NotificationUtil", "MicroMsg.DEBUG.NotificationUtil", 4));
                }
                builder = new android.app.Notification.Builder(context, "MicroMsg.DEBUG.NotificationUtil");
            } else {
                builder = new android.app.Notification.Builder(context);
            }
            builder.setContentTitle(title).setStyle(new android.app.Notification.BigTextStyle().bigText("")).setSmallIcon(com.tencent.mm.R.drawable.btt).setAutoCancel(true).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis());
            java.lang.Object systemService2 = context.getSystemService("notification");
            kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
            ((android.app.NotificationManager) systemService2).notify(new java.lang.Object().hashCode(), builder.build());
            com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var = this.f92245f;
            java.lang.String str = this.f92246g;
            java.lang.String str2 = this.f92247h;
            java.lang.String str3 = this.f92244e;
            r45.w3 w3Var = this.f92248i;
            this.f92243d = 1;
            obj = com.tencent.mm.plugin.appbrand.wxassistant.x1.a(x1Var, str, str2, str3, w3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
