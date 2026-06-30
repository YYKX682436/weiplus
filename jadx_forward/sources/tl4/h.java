package tl4;

/* loaded from: classes11.dex */
public abstract class h implements tl4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Service f501841a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.eq0 f501842b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f501843c;

    /* renamed from: d, reason: collision with root package name */
    public int f501844d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f501845e;

    public h(android.app.Service context, bw5.eq0 appId, com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f501841a = context;
        this.f501842b = appId;
        this.f501843c = c26845xac206036;
        this.f501845e = jz5.h.b(new tl4.f(this));
    }

    public void a() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "cancelNotification");
            this.f501841a.stopForeground(true);
            ((android.app.NotificationManager) ((jz5.n) this.f501845e).mo141623x754a37bb()).cancel(((wl4.m) this).f528626f.f108558d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingPlayAppBaseNotificationManager", e17, "cancelNotification exception", new java.lang.Object[0]);
        }
    }

    public final android.app.PendingIntent b(int i17) {
        android.app.Service service = this.f501841a;
        android.content.Intent intent = new android.content.Intent(service, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2294x237a88eb.C18720xb2959c62.class);
        intent.putExtra("com.tencent.mm.ting.ActionCode", i17);
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(service, i17, intent, 201326592);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public void c(bw5.jq0 playingInfo, int i17, java.lang.String title, java.lang.String description, android.graphics.Bitmap bitmap, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 sessionToken) {
        android.app.PendingIntent activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playingInfo, "playingInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionToken, "sessionToken");
        if (i17 == 0 || i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "updateSystemNotification state = " + i17 + ", just cancel");
            a();
            return;
        }
        java.lang.String packageName = this.f501841a.getPackageName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName, "getPackageName(...)");
        z2.k0 k0Var = new z2.k0(this.f501841a, packageName);
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.f551010u = -1;
        k0Var.h(2, true);
        k0Var.f550999j = 2;
        k0Var.d(false);
        k0Var.E = true;
        k0Var.f(title);
        k0Var.e(description);
        if (bitmap != null) {
            k0Var.j(bitmap);
        }
        k0Var.f551003n = 0;
        k0Var.f551004o = 0;
        k0Var.f551005p = false;
        sb0.f fVar = (sb0.f) ((tb0.j) i95.n0.c(tb0.j.class));
        android.app.Service service = this.f501841a;
        boolean Ui = fVar.Ui(service);
        bw5.eq0 eq0Var = this.f501842b;
        if (Ui) {
            android.content.Intent intent = new android.content.Intent(service, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2294x237a88eb.C18720xb2959c62.class);
            intent.putExtra("com.tencent.mm.ting.ActionCode", 5);
            intent.putExtra("com.tent.mm.ting.PlayAppId", eq0Var.f108558d);
            activity = android.app.PendingIntent.getBroadcast(service, 5, intent, fp.g0.a(134217728));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "getBroadcast(...)");
        } else {
            android.content.Intent intent2 = new android.content.Intent(service, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18709x25b7e2d5.class);
            intent2.putExtra("com.tent.mm.ting.PlayAppId", eq0Var.f108558d);
            activity = android.app.PendingIntent.getActivity(service, 52, intent2, fp.g0.a(134217728));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "getActivity(...)");
        }
        k0Var.f550996g = activity;
        android.app.PendingIntent b17 = b(1);
        android.app.Service service2 = this.f501841a;
        k0Var.a(new z2.e0(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.d(service2, com.p314xaae8f345.mm.R.C30861xcebc809e.c6p), service2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574140h51), b17).a());
        if (i17 == 3) {
            z2.f0 a17 = new z2.e0(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.d(service2, com.p314xaae8f345.mm.R.C30861xcebc809e.c6n), service2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4z), b(2)).a();
            if (this.f501844d != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "setupNotificationAction actionCode = 2, title = " + ((java.lang.Object) a17.f550977i));
            }
            k0Var.a(a17);
        } else {
            z2.f0 a18 = new z2.e0(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.d(service2, com.p314xaae8f345.mm.R.C30861xcebc809e.c6o), service2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574139h50), b(4)).a();
            if (this.f501844d != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "setupNotificationAction actionCode = 4, title = " + ((java.lang.Object) a18.f550977i));
            }
            k0Var.a(a18);
        }
        k0Var.a(new z2.e0(p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.d(service2, com.p314xaae8f345.mm.R.C30861xcebc809e.c6m), service2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4y), b(3)).a());
        d4.b bVar = new d4.b();
        bVar.f307887c = sessionToken;
        bVar.f307886b = java.util.Arrays.copyOf(new int[]{0, 1, 2}, 3);
        k0Var.l(bVar);
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 26) {
            java.lang.String packageName2 = this.f501841a.getPackageName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName2, "getPackageName(...)");
            k0Var.f551015z = packageName2;
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) ((jz5.n) this.f501845e).mo141623x754a37bb();
            java.lang.String packageName3 = this.f501841a.getPackageName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName3, "getPackageName(...)");
            if (notificationManager.getNotificationChannel(packageName3) == null) {
                java.lang.String packageName4 = this.f501841a.getPackageName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName4, "getPackageName(...)");
                java.lang.String string = this.f501841a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_v);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(packageName4, string, 2);
                java.lang.String string2 = this.f501841a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_u);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                notificationChannel.setDescription(string2);
                ((android.app.NotificationManager) ((jz5.n) this.f501845e).mo141623x754a37bb()).createNotificationChannel(notificationChannel);
            }
        }
        if (i17 == 2) {
            k0Var.h(2, false);
            ku5.u0 u0Var = ku5.t0.f394148d;
            tl4.g gVar = new tl4.g(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(gVar, 20L, false);
        }
        android.app.Notification b18 = k0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "build(...)");
        if (i17 != 2) {
            if (i18 >= 30) {
                this.f501841a.startForeground(((wl4.m) this).f528626f.f108558d, b18, 2);
            } else {
                this.f501841a.startForeground(((wl4.m) this).f528626f.f108558d, b18);
            }
        }
        ((android.app.NotificationManager) ((jz5.n) this.f501845e).mo141623x754a37bb()).notify(((wl4.m) this).f528626f.f108558d, b18);
        this.f501844d = i17;
    }
}
