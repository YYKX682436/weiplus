package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.chatting.component.ChattingAppBrandNotifyComponent$1 */
/* loaded from: classes9.dex */
public class C21658x69ae0a35 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5165x4ba90390> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s2 f280072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21658x69ae0a35(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s2 s2Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f280072d = s2Var;
        this.f39173x3fe91575 = -1390647424;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5165x4ba90390 c5165x4ba90390) {
        yb5.d dVar = this.f280072d.f280113d;
        if (dVar == null) {
            return true;
        }
        dVar.g().runOnUiThread(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r2(this));
        return true;
    }
}
