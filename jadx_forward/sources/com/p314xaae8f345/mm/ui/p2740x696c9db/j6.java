package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class j6 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f292045a;

    /* renamed from: b, reason: collision with root package name */
    public long f292046b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f292047c;

    public j6(java.lang.ref.WeakReference weakReference) {
        this.f292045a = weakReference;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89;
        mo50303x856b99f0(message.what);
        java.lang.ref.WeakReference weakReference = this.f292045a;
        if (weakReference == null || (c22506x89e75b89 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) weakReference.get()) == null) {
            return;
        }
        int i17 = message.what;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c22506x89e75b89.L;
        if (i17 == 0) {
            if ((c22506x89e75b89.B == 1 || this.f292047c) && c22506x89e75b89.M != null) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2740x696c9db.h6(this, c22506x89e75b89));
            }
            c22506x89e75b89.B = 0;
            return;
        }
        if (i17 != 1) {
            mo50303x856b99f0(2);
            if (c22506x89e75b89.N != null) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2740x696c9db.i6(this, c22506x89e75b89));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.n5 n5Var = c22506x89e75b89.K;
        if (n5Var == null || n5Var.f292133a) {
            c22506x89e75b89.f291592h.mo50303x856b99f0(1);
        } else {
            n5Var.a();
            mo50307xb9e94560(message.what, this.f292046b);
        }
    }
}
