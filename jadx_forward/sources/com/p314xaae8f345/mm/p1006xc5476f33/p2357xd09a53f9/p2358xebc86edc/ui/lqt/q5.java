package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class q5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s5 f259873h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s5 s5Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        super(context);
        this.f259873h = s5Var;
        this.f259872g = c19091x9511676c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.lang.String str = this.f259872g.f69241x935a0ea9;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "go to url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f259873h.f259901e.mo55332x76847179(), intent);
    }
}
