package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes11.dex */
public final class d4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8 f179463d;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8 viewOnClickListenerC13324xdbba4ef8) {
        this.f179463d = viewOnClickListenerC13324xdbba4ef8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        int size = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().k1().size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8 viewOnClickListenerC13324xdbba4ef8 = this.f179463d;
        if (size <= 1) {
            db5.e1.i(viewOnClickListenerC13324xdbba4ef8.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.buu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return true;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8.f179401u;
            db5.e1.y(viewOnClickListenerC13324xdbba4ef8, viewOnClickListenerC13324xdbba4ef8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bya), "", viewOnClickListenerC13324xdbba4ef8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.by_), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e4.f179487d);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(viewOnClickListenerC13324xdbba4ef8, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13318xb8345878.class);
        viewOnClickListenerC13324xdbba4ef8.startActivityForResult(intent, 100);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8.f179401u;
        viewOnClickListenerC13324xdbba4ef8.T6("emo_album_manage_page_sort_button", "view_clk", hashMap);
        return true;
    }
}
