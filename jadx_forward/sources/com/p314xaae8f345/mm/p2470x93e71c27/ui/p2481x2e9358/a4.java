package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class a4 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271708a;

    public a4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271708a = c19666xfd6e2f33;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        java.lang.Object obj;
        if (message.what != 1002) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271708a;
        if (c19666xfd6e2f33.f271554m == null || (obj = message.obj) == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            c19666xfd6e2f33.f271554m.setAlpha(1.0f);
        } else {
            c19666xfd6e2f33.f271554m.setAlpha(0.5f);
        }
        c19666xfd6e2f33.U0(booleanValue);
    }
}
