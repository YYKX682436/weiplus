package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e f272317d;

    public e(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e) {
        this.f272317d = abstractC19633xb84f839e;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e = this.f272317d;
        if (!abstractC19633xb84f839e.mo61531xc00617a4()) {
            return false;
        }
        if (abstractC19633xb84f839e.f271283s) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = abstractC19633xb84f839e.f271284t;
            if (b1Var != null) {
                b1Var.l(abstractC19633xb84f839e.mo66135x23a7af9b(), abstractC19633xb84f839e.mo48228x75e04be9());
            }
            abstractC19633xb84f839e.f271283s = false;
        }
        abstractC19633xb84f839e.W(abstractC19633xb84f839e.mo61523x898ffe25());
        abstractC19633xb84f839e.X(abstractC19633xb84f839e.mo61531xc00617a4());
        if (abstractC19633xb84f839e.P()) {
            return abstractC19633xb84f839e.A();
        }
        return true;
    }
}
