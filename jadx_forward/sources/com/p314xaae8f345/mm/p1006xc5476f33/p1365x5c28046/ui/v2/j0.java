package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes11.dex */
public class j0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f179900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b f179901e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b, boolean z17) {
        this.f179901e = activityC13354x79b4d90b;
        this.f179900d = z17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17 = this.f179900d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b = this.f179901e;
        if (z17) {
            d22.w wVar = new d22.w();
            wVar.f307410j = 0;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(activityC13354x79b4d90b, wVar);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiStoreV2UI", "emoticon liteapp service not found");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(java.lang.String.valueOf(10931), 1);
        intent.setClass(activityC13354x79b4d90b, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13307xada0aded.class);
        intent.putExtra("from_store", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b2 = this.f179901e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC13354x79b4d90b2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13354x79b4d90b2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC13354x79b4d90b2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
        Di.a(44);
        Di.q("stickernavright");
        return false;
    }
}
