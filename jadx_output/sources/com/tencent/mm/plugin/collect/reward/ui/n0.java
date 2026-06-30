package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class n0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.i f96320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI f96321b;

    public n0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI, xw1.i iVar) {
        this.f96321b = qrRewardSetMoneyUI;
        this.f96320a = iVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        xw1.i iVar = this.f96320a;
        java.lang.String str2 = iVar.f457678n.f383444f;
        int i19 = com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.f96268x;
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI = this.f96321b;
        qrRewardSetMoneyUI.getClass();
        qrRewardSetMoneyUI.f96280r = iVar.f457678n.f383448m;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_desc", iVar.f457678n.f383448m);
        intent.putExtra("key_photo_url", iVar.f457678n.f383444f);
        intent.putExtra("key_photo_aeskey", iVar.f457678n.f383445g);
        intent.putExtra("key_photo_width", iVar.f457678n.f383449n);
        intent.putExtra("key_icon_width", iVar.f457678n.f383446h);
        intent.putExtra("key_return_from_first", qrRewardSetMoneyUI.f96282t);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.f457678n.f383450o)) {
            intent.putExtra("key_photo_url_v2", iVar.f457678n.f383450o);
        }
        qrRewardSetMoneyUI.setResult(-1, intent);
        qrRewardSetMoneyUI.finish();
    }
}
