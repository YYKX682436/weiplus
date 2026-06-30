package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes11.dex */
public class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13307xada0aded f179712d;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13307xada0aded viewOnClickListenerC13307xada0aded) {
        this.f179712d = viewOnClickListenerC13307xada0aded;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        int size = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().k1().size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13307xada0aded viewOnClickListenerC13307xada0aded = this.f179712d;
        if (size <= 1) {
            db5.e1.i(viewOnClickListenerC13307xada0aded.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.buu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return true;
        }
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13307xada0aded.f179326y;
            db5.e1.y(viewOnClickListenerC13307xada0aded, viewOnClickListenerC13307xada0aded.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bya), "", viewOnClickListenerC13307xada0aded.getString(com.p314xaae8f345.mm.R.C30867xcad56011.by_), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t2(viewOnClickListenerC13307xada0aded));
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(viewOnClickListenerC13307xada0aded, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13318xb8345878.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13307xada0aded viewOnClickListenerC13307xada0aded2 = this.f179712d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewOnClickListenerC13307xada0aded2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        viewOnClickListenerC13307xada0aded2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(viewOnClickListenerC13307xada0aded2, "com/tencent/mm/plugin/emoji/ui/EmojiMineUI$3", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
