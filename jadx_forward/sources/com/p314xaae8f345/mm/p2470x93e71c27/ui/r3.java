package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class r3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 f272631a;

    public r3(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722) {
        this.f272631a = abstractC19655xeb0f7722;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f272631a;
        if (i17 == 0) {
            if (abstractC19655xeb0f7722.f271389g != 2) {
                return;
            }
            abstractC19655xeb0f7722.f271389g = 3;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = abstractC19655xeb0f7722.f271394o;
            n3Var.mo50303x856b99f0(0);
            n3Var.mo50307xb9e94560(0, abstractC19655xeb0f7722.f271391i);
            n3Var.mo50307xb9e94560(1, abstractC19655xeb0f7722.f271392m);
            abstractC19655xeb0f7722.d(false);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.os.Bundle data = message.getData();
        int i18 = data.getInt("localCode");
        int i19 = data.getInt("errType");
        int i27 = data.getInt("errCode");
        abstractC19655xeb0f7722.f271389g = 1;
        abstractC19655xeb0f7722.f();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = abstractC19655xeb0f7722.f271386d;
        if (u3Var != null) {
            u3Var.g(i18, i19, i27);
        }
    }
}
