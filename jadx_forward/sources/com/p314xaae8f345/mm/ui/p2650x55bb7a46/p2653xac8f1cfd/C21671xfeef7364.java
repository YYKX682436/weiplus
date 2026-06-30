package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.chatting.component.RemittanceSearchComponent$1 */
/* loaded from: classes9.dex */
public class C21671xfeef7364 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sj f280099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21671xfeef7364(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sj sjVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f280099d = sjVar;
        this.f39173x3fe91575 = -477523102;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372 c5979x79adf372) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5979x79adf372 c5979x79adf3722 = c5979x79adf372;
        am.gt gtVar = c5979x79adf3722.f136276g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.RemittanceSearchComponent", "ScrollChattingUIConversationList: %s, %s", gtVar.f88321a, java.lang.Long.valueOf(gtVar.f88322b));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sj sjVar = this.f280099d;
        sjVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = currentTimeMillis - sjVar.f281474e < 1200;
        sjVar.f281474e = currentTimeMillis;
        if (!z17) {
            sjVar.f280113d.f542254p = true;
            sb5.y yVar = new sb5.y();
            yVar.f487129a = true;
            sb5.z zVar = (sb5.z) sjVar.f280113d.f542241c.a(sb5.z.class);
            am.gt gtVar2 = c5979x79adf3722.f136276g;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).T0(gtVar2.f88323c, gtVar2.f88322b, hd5.n.ACTION_POSITION, yVar);
            if (sjVar.f280113d.p() != null) {
                sjVar.f280113d.p().m75894x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rj(this), 220L);
            }
        }
        return false;
    }
}
