package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes12.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f173776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 f173778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173779g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173780h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.w3 f173781i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 x1Var, java.lang.String str2, java.lang.String str3, r45.w3 w3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f173777e = str;
        this.f173778f = x1Var;
        this.f173779g = str2;
        this.f173780h = str3;
        this.f173781i = w3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n1(this.f173777e, this.f173778f, this.f173779g, this.f173780h, this.f173781i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.app.Notification.Builder builder;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f173776d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            java.lang.String title = this.f173777e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                java.lang.Object systemService = context.getSystemService("notification");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
                if (notificationManager.getNotificationChannel("MicroMsg.DEBUG.NotificationUtil") == null) {
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("MicroMsg.DEBUG.NotificationUtil", "MicroMsg.DEBUG.NotificationUtil", 4));
                }
                builder = new android.app.Notification.Builder(context, "MicroMsg.DEBUG.NotificationUtil");
            } else {
                builder = new android.app.Notification.Builder(context);
            }
            builder.setContentTitle(title).setStyle(new android.app.Notification.BigTextStyle().bigText("")).setSmallIcon(com.p314xaae8f345.mm.R.C30861xcebc809e.btt).setAutoCancel(true).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis());
            java.lang.Object systemService2 = context.getSystemService("notification");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
            ((android.app.NotificationManager) systemService2).notify(new java.lang.Object().hashCode(), builder.build());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 x1Var = this.f173778f;
            java.lang.String str = this.f173779g;
            java.lang.String str2 = this.f173780h;
            java.lang.String str3 = this.f173777e;
            r45.w3 w3Var = this.f173781i;
            this.f173776d = 1;
            obj = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1.a(x1Var, str, str2, str3, w3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
