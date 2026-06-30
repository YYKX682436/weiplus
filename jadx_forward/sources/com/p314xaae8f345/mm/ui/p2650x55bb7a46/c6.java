package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class c6 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.d6 f280049a;

    public c6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.d6 d6Var) {
        this.f280049a = d6Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        android.view.View view = (android.view.View) message.obj;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.d6 d6Var = this.f280049a;
        if (d6Var.f281951b == view.getScrollY()) {
            d6Var.getClass();
            return;
        }
        d6Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = d6Var.f281952c;
        n3Var.mo50311x7ab51103(n3Var.mo50292x733c63a2(0, view), 5L);
        d6Var.f281951b = view.getScrollY();
    }
}
