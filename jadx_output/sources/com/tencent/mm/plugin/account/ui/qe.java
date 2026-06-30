package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class qe implements kv.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f74144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI f74145e;

    public qe(com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI, java.lang.String str) {
        this.f74145e = regAffiliateAccountUI;
        this.f74144d = str;
    }

    @Override // kv.i0
    public void X(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI = this.f74145e;
        regAffiliateAccountUI.f73560s = str;
        regAffiliateAccountUI.f73561t = str2;
        regAffiliateAccountUI.findViewById(com.tencent.mm.R.id.mnr).post(new com.tencent.mm.plugin.account.ui.pe(this));
    }

    @Override // kv.i0
    public void d(int i17, int i18, java.lang.String str) {
        com.tencent.mm.vfs.w6.h(lp0.b.j() + "temp.avatar");
        com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI = this.f74145e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = regAffiliateAccountUI.f73555n;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        regAffiliateAccountUI.f73555n.dismiss();
    }
}
