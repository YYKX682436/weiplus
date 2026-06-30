package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* renamed from: com.tencent.mm.ui.chatting.component.SilenceMsgComponent$1 */
/* loaded from: classes9.dex */
class C21672x160faeea extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml f280100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21672x160faeea(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f280100d = mlVar;
        this.f39173x3fe91575 = 562497440;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190 c6029xbb3f0190) {
        byte[] bArr = c6029xbb3f0190.f136319g.f89671a;
        if (bArr != null) {
            r45.k4 k4Var = new r45.k4();
            try {
                k4Var.mo11468x92b714fd(bArr);
                java.lang.String g17 = x51.j1.g(k4Var.f459878d);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar = this.f280100d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr SilenceNotifyEvent callback chatRoomId[%s], current talker[%s]", g17, mlVar.f280113d.u().d1());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) && g17.equals(mlVar.f280113d.u().d1())) {
                    gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hl(this, k4Var.f459880f, k4Var.f459882h, g17));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingUI.SilenceMsgComponent", e17, "summerbadcr SilenceNotifyEvent callback parse:", new java.lang.Object[0]);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr silenceNotifyListener callback event data is null");
        }
        return false;
    }
}
