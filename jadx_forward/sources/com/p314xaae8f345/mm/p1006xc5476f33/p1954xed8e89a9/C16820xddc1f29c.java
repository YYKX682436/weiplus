package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$25 */
/* loaded from: classes11.dex */
public class C16820xddc1f29c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f234913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16820xddc1f29c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f234913d = e0Var;
        this.f39173x3fe91575 = 896186802;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2 c5242x5950d3a2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2 c5242x5950d3a22 = c5242x5950d3a2;
        am.g2 g2Var = c5242x5950d3a22.f135575g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "[ChatroomMemberInviterUpdatedEvent callback] username:%s inviter:%s", g2Var.f88262a, g2Var.f88263b);
        am.g2 g2Var2 = c5242x5950d3a22.f135575g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g2Var2.f88262a) || !g2Var2.f88262a.equals(this.f234913d.f234954e.d1()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g2Var2.f88263b)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.z0(this, c5242x5950d3a22));
        return false;
    }
}
