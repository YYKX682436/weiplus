package com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.view.manager.SmileyPanelManager$9 */
/* loaded from: classes12.dex */
public class C22831x357b0c4f extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d f295143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22831x357b0c4f(com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f295143d = dVar;
        this.f39173x3fe91575 = 281399509;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5 c5326x794c50e5) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5326x794c50e5 c5326x794c50e52 = c5326x794c50e5;
        int i17 = c5326x794c50e52.f135638g.f89332a;
        java.lang.String str = i17 == 1 ? "custom" : i17 == 2 ? "capture" : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.o(this, str), 500L);
        c5326x794c50e52.f135639h.f89402a = true;
        return false;
    }
}
