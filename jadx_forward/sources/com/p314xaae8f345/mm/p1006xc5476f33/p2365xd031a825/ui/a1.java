package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f261665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c1 f261666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c1 c1Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        super(context);
        this.f261666h = c1Var;
        this.f261665g = c19091x9511676c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f261665g.f69241x935a0ea9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardBottomSheetHelper", "go to url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f261666h.f261697e, intent);
    }
}
