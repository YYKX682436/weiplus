package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class fa extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa f289215a;

    public fa(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa paVar) {
        this.f289215a = paVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa paVar = this.f289215a;
        yf5.j0 j0Var = paVar.f289503e;
        if (j0Var != null) {
            ((yf5.w0) j0Var).d().f543505s.clear();
            ((yf5.w0) paVar.f289503e).notifyDataSetChanged();
        }
    }
}
