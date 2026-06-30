package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5 */
/* loaded from: classes4.dex */
public class C18364xd250554c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6164xa16f40ad> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18364xd250554c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f251278d = iVar;
        this.f39173x3fe91575 = -548976483;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6164xa16f40ad c6164xa16f40ad) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6164xa16f40ad c6164xa16f40ad2 = c6164xa16f40ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "receive timeline back anim event");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f251278d;
        boolean z17 = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.q(iVar) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.z0(this, c6164xa16f40ad2.f136424g.f89861a));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.r(iVar) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.b1(this, c6164xa16f40ad2.f136424g.f89861a));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5");
        return z17;
    }
}
