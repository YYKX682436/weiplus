package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.conversation.banner.NetWarnBanner$1 */
/* loaded from: classes5.dex */
public class C22387xac19ab7c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5737xb448caf1> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 f289022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22387xac19ab7c(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f289022d = k0Var;
        this.f39173x3fe91575 = 829538561;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5737xb448caf1 c5737xb448caf1) {
        am.zk zkVar = c5737xb448caf1.f136061g;
        int i17 = zkVar.f90108b;
        int i18 = zkVar.f90107a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var = this.f289022d;
        if (i17 == 0) {
            k0Var.f289071y = 33;
            k0Var.f289072z = i18 == 0;
        } else if (i17 == 1) {
            k0Var.f289071y = 66;
            k0Var.A = i18 == 0;
        } else if (i17 == 2) {
            k0Var.B = i18 == 0;
        }
        if (zkVar.f90109c) {
            k0Var.f289071y = 0;
            k0Var.f289070x = 0;
            k0Var.C = zkVar.f90110d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = k0Var.D;
            if (b4Var != null) {
                b4Var.d();
                k0Var.D = null;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.e0(this));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.f0(this));
        return false;
    }
}
