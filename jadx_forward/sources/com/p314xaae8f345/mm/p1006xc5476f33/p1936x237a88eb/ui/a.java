package com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public z2.k0 f233992b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f233993c;

    /* renamed from: d, reason: collision with root package name */
    public final int f233994d;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f233999i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f234002l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f234004n;

    /* renamed from: a, reason: collision with root package name */
    public android.app.Notification f233991a = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.b f233995e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.c f233996f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.d f233997g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f233998h = null;

    /* renamed from: j, reason: collision with root package name */
    public android.app.PendingIntent f234000j = null;

    /* renamed from: k, reason: collision with root package name */
    public android.app.PendingIntent f234001k = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f234003m = false;

    public a(int i17) {
        this.f233992b = null;
        this.f233999i = null;
        this.f234002l = false;
        this.f234004n = false;
        this.f233994d = i17;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f233993c = context;
        this.f233992b = new z2.k0(context, n25.a.b());
        this.f233999i = "";
        try {
            b();
            c();
            this.f234004n = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailSendMsgNotification", "init FailSendMsgNotification error, e:%s", e17.getMessage());
            this.f234004n = false;
        }
        this.f234002l = false;
    }

    public void a() {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x xVar = (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f();
        int i17 = this.f233994d;
        xVar.f(i17);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f233993c;
        if (i17 == 1) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16757xaf733674.class);
            context.stopService(intent);
        } else if (i17 == 2) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16758x3d08b97d.class);
            context.stopService(intent);
        }
        this.f234003m = false;
        this.f234002l = false;
    }

    public final void b() {
        this.f233992b.f551007r = true;
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f233994d;
        android.content.Context context = this.f233993c;
        if (i17 == 1) {
            intent.setAction("com.tencent.failnotification.omit_msg");
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16757xaf733674.class);
        } else if (i17 == 2) {
            intent.setAction("com.tencent.failnotification.omit_sns");
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16758x3d08b97d.class);
        }
        intent.putExtra("notification_type", i17);
        this.f234000j = android.app.PendingIntent.getService(context, i17, intent, fp.g0.a(134217728));
        this.f233992b.f550991b.add(new z2.f0(com.p314xaae8f345.mm.R.C30861xcebc809e.ccb, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hay), this.f234000j));
        android.content.Intent intent2 = new android.content.Intent();
        if (i17 == 1) {
            intent2.setAction("com.tencent.failnotificaiton.resend_msg");
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16757xaf733674.class);
        } else if (i17 == 2) {
            intent2.setAction("com.tencent.failnotificaiton.resend_sns");
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16758x3d08b97d.class);
        }
        intent2.putExtra("notification_type", i17);
        intent2.addFlags(268435456);
        this.f234001k = android.app.PendingIntent.getService(context, i17, intent2, fp.g0.a(134217728));
        this.f233992b.f550991b.add(new z2.f0(com.p314xaae8f345.mm.R.C30861xcebc809e.ccc, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.haz), this.f234001k));
    }

    public final void c() {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f233993c;
        int i17 = this.f233994d;
        if (i17 == 1) {
            intent.setAction("com.tencent.failnotification.click_msg");
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16757xaf733674.class);
        } else if (i17 == 2) {
            intent.setAction("com.tencent.failnotification.click_sns");
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16758x3d08b97d.class);
        }
        intent.putExtra("notification_type", i17);
        this.f233992b.f550996g = android.app.PendingIntent.getService(context, i17, intent, fp.g0.a(134217728));
        android.content.Intent intent2 = new android.content.Intent();
        if (i17 == 1) {
            intent2.setAction("com.tencent.failnotification.dismiss_msg");
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16757xaf733674.class);
        } else if (i17 == 2) {
            intent2.setAction("com.tencent.failnotification.dismiss_sns");
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.ServiceC16758x3d08b97d.class);
        }
        intent2.putExtra("notification_type", i17);
        this.f233992b.D.deleteIntent = android.app.PendingIntent.getService(context, i17, intent2, fp.g0.a(134217728));
    }

    public void d() {
        if (!this.f234004n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailSendMsgNotification", "when show notification, is not init yet");
            return;
        }
        this.f233992b.m(this.f233999i);
        this.f233992b.f(this.f233993c.getText(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp));
        z2.k0 k0Var = this.f233992b;
        k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.e(this.f233998h);
        this.f233992b.d(false);
        android.app.Notification b17 = this.f233992b.b();
        this.f233991a = b17;
        if (!this.f234003m) {
            b17.priority = 2;
        }
        c01.m8 f17 = c01.d9.f();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) f17).n(this.f233994d, this.f233991a, false);
        this.f234002l = true;
    }

    public void e(java.lang.String str) {
        this.f233998h = str;
        d();
    }
}
