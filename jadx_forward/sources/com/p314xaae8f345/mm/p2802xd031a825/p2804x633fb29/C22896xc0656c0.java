package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$1 */
/* loaded from: classes9.dex */
class C22896xc0656c0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6279xeaa7f677> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 f295377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22896xc0656c0(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f295377d = p0Var;
        this.f39173x3fe91575 = -553207673;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6279xeaa7f677 c6279xeaa7f677) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpRemind", "WxPayGdprResultEvent result");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = this.f295377d;
        p0Var.f295503i = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g0(this, c6279xeaa7f677));
        p0Var.f295505k.mo48814x2efc64();
        return false;
    }
}
