package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a f231814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h f231815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f231816f;

    public f(com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h hVar, android.content.Intent intent) {
        this.f231814d = c11142xe8e5c41a;
        this.f231815e = hVar;
        this.f231816f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = this.f231814d;
        if (c11142xe8e5c41a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h hVar = this.f231815e;
            android.content.Intent intent = this.f231816f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.a aVar = hVar.f231818w;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j1) aVar;
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.d(c11142xe8e5c41a);
                if (fp.h.b(28) || android.os.Build.VERSION.CODENAME.equals("Q")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = j1Var.f231552a;
                    v0Var.f231718y0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s1(v0Var, c11142xe8e5c41a, java.lang.Boolean.FALSE);
                }
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1x);
                intent.putExtra("Voip_User", d17);
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(intent.getStringExtra("Voip_User"), true).d1();
                ((sg3.a) v0Var2).getClass();
                java.lang.String e17 = c01.a2.e(d18);
                android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570843c32);
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.kg7, string);
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.f567701kg0, e17);
                remoteViews.setImageViewResource(com.p314xaae8f345.mm.R.id.pjk, com.p314xaae8f345.mm.R.C30861xcebc809e.btt);
                remoteViews.setImageViewResource(com.p314xaae8f345.mm.R.id.kfq, com.p314xaae8f345.mm.R.C30861xcebc809e.btq);
                java.lang.String str = e17 + string;
                uf0.e eVar = (uf0.e) i95.n0.c(uf0.e.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n25.a.f415851b)) {
                    n25.a.f415851b = gm0.m.v().getString("voip_notify_channel_new_id", "voip_notify_channel_new_id");
                }
                ((tf0.a) eVar).Ai(context, "multitalk", ".ui.MultiTalkMainUI", intent, remoteViews, str, true, n25.a.f415851b, true);
            }
        }
    }
}
