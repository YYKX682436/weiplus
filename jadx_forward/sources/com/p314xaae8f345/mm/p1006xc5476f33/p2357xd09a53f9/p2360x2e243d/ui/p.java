package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes3.dex */
public class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.q f260172d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.q qVar) {
        this.f260172d = qVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "operType：%s", java.lang.Integer.valueOf(itemId));
        if (itemId != 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/kfweb/helpcenter/dispatch?scene_code=CommIssueBankCard");
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f260172d.f260173d.mo55332x76847179(), intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14422, 3);
    }
}
