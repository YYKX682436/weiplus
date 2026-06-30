package com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui;

/* renamed from: com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendMsgNotificationService */
/* loaded from: classes15.dex */
public abstract class AbstractServiceC16756x7ebe4fad extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f233988d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5748xcdc4bed7>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendMsgNotificationService.1
        {
            this.f39173x3fe91575 = -1445026585;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5748xcdc4bed7 c5748xcdc4bed7) {
            int i17 = c5748xcdc4bed7.f136069g.f88375a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.AbstractServiceC16756x7ebe4fad abstractServiceC16756x7ebe4fad = com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.AbstractServiceC16756x7ebe4fad.this;
            if (i17 != abstractServiceC16756x7ebe4fad.a()) {
                abstractServiceC16756x7ebe4fad.a();
            } else {
                abstractServiceC16756x7ebe4fad.stopForeground(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = abstractServiceC16756x7ebe4fad.f233989e;
                if (aVar != null) {
                    aVar.f234003m = false;
                    aVar.d();
                }
                abstractServiceC16756x7ebe4fad.stopSelf();
            }
            return false;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a f233989e = null;

    public abstract int a();

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f233988d.mo48813x58998cd();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f233988d.mo48814x2efc64();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (intent != null && intent.getExtras() != null) {
            java.lang.String action = intent.getAction();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
                return 2;
            }
            int i19 = intent.getExtras().getInt("notification_type", -1);
            if (po3.p.Ai(i19) == null) {
                return 2;
            }
            this.f233989e = po3.p.Ai(i19);
            if (action.startsWith("com.tencent.failnotification.omit")) {
                if (this.f233989e.f233995e != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.c) this.f233989e.f233995e;
                    cVar.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.b(cVar));
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotificaiton.resend")) {
                if (this.f233989e.f233995e != null) {
                    android.app.Notification notification = this.f233989e.f233991a;
                    z2.k0 k0Var = this.f233989e.f233992b;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar = this.f233989e;
                    if (aVar != null) {
                        aVar.f234003m = true;
                    }
                    android.app.Notification notification2 = aVar.f233991a;
                    if (notification2 != null) {
                        notification2.priority = 0;
                    }
                    if (notification2 == null) {
                        aVar.d();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.c) this.f233989e.f233995e;
                    cVar2.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.a(cVar2));
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotification.click")) {
                if (this.f233989e.f233996f != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.d) this.f233989e.f233996f;
                    dVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar = dVar.f233968a;
                    g0Var.d(11425, java.lang.Integer.valueOf(jVar.l()), 1, 0, 0);
                    jVar.a();
                    jVar.p();
                    if (!jVar.f233978c) {
                        jVar.f233977b.a();
                    }
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotification.dismiss")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.a aVar2 = this.f233989e;
                aVar2.f234002l = false;
                aVar2.f234003m = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.ui.d dVar2 = aVar2.f233997g;
                if (dVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.e) dVar2).f233969a.w();
                }
                stopSelf();
            }
        }
        return 2;
    }
}
