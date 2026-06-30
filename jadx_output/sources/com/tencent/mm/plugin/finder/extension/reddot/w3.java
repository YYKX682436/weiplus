package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class w3 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final zy2.fa f105958d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f105959e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler$mainUiIndexChangeListener$1 f105960f;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler$mainUiIndexChangeListener$1] */
    public w3(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f105958d = redDotManager;
        this.f105959e = new com.tencent.mm.sdk.platformtools.n3("FinderRedDotExpired");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f105960f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler$mainUiIndexChangeListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54438g.f7425a;
                if (i17 != 2) {
                    if (i17 != 3) {
                        com.tencent.mm.plugin.finder.extension.reddot.w3.a(com.tencent.mm.plugin.finder.extension.reddot.w3.this, "otherTab", null, 0L, 6, null);
                        return false;
                    }
                    com.tencent.mm.plugin.finder.extension.reddot.w3.a(com.tencent.mm.plugin.finder.extension.reddot.w3.this, "mineTab", null, 0L, 6, null);
                    return false;
                }
                com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var = com.tencent.mm.plugin.finder.extension.reddot.w3.this;
                w3Var.getClass();
                com.tencent.mars.xlog.Log.i("Finder.RedDotExpiredHandler", "[checkDoSync] source=findMoreFriend delayed=0");
                w3Var.f105959e.postDelayed(new com.tencent.mm.plugin.finder.extension.reddot.q3(w3Var), 0L);
                com.tencent.mm.plugin.finder.extension.reddot.w3.a(com.tencent.mm.plugin.finder.extension.reddot.w3.this, "findMoreFriend", null, 0L, 6, null);
                return false;
            }
        };
    }

    public static void a(com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var, java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        w3Var.f105959e.post(new com.tencent.mm.plugin.finder.extension.reddot.s3(str, j17, str3, w3Var));
    }

    public final java.lang.String b(r45.qw0 qw0Var) {
        kotlin.jvm.internal.o.g(qw0Var, "<this>");
        return "check_expire_interval_sec=" + qw0Var.getInteger(1) + ", check_expire_max_count=" + qw0Var.getInteger(2) + ", check_expire_valid=" + qw0Var.getInteger(0);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        a(this, "onAppBackground", "Discovery", 0L, 4, null);
        ((com.tencent.mm.plugin.finder.extension.reddot.x2) this.f105958d).Y0(false, "onAppBackground");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
