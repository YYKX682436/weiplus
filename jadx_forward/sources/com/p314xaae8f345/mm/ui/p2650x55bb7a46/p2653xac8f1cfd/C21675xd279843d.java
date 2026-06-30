package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* renamed from: com.tencent.mm.ui.chatting.component.TranslateComponent$2 */
/* loaded from: classes4.dex */
class C21675xd279843d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym f280102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21675xd279843d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym ymVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f280102d = ymVar;
        this.f39173x3fe91575 = -1739498572;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc42 = c6178x705b8fc4;
        if (c6178x705b8fc42 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4) {
            am.kz kzVar = c6178x705b8fc42.f136438g;
            java.lang.String str = kzVar.f88729d;
            int i17 = kzVar.f88726a;
            java.lang.String str2 = kzVar.f88731f;
            int i18 = i17 == 5 ? 2000 : 0;
            int i19 = kzVar.f88730e;
            if (i19 == 1 || i19 == 0) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bn(this, i17, c6178x705b8fc42, str, str2), i18);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUI.TranslateComponent", "type error, %s", java.lang.Integer.valueOf(i19));
            }
        }
        return false;
    }
}
