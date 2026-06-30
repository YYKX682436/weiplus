package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent$1 */
/* loaded from: classes9.dex */
public class C21684xb929dcfb extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5813xd97b0123> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f f280196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21684xb929dcfb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f280196d = fVar;
        this.f39173x3fe91575 = 495598387;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5813xd97b0123 c5813xd97b0123) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5813xd97b0123 c5813xd97b01232 = c5813xd97b0123;
        am.gn gnVar = c5813xd97b01232.f136120g;
        if (gnVar == null || gnVar.f88316a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent event is empty");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar = this.f280196d;
        fVar.f280218d.x();
        am.gn gnVar2 = c5813xd97b01232.f136120g;
        if (gnVar2.f88316a.equals(fVar.f280218d.x())) {
            fVar.f280212q = (gnVar2.f88317b & 2) > 0;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.a(this));
        }
        return true;
    }
}
