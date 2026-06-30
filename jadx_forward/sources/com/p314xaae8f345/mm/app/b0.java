package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class b0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.graphics.Bitmap f134868d = null;

    /* renamed from: e, reason: collision with root package name */
    public kv.c0 f134869e = null;

    /* renamed from: f, reason: collision with root package name */
    public kv.f0 f134870f;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        if (this.f134870f == null) {
            synchronized (this) {
                if (this.f134870f == null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    this.f134870f = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai();
                }
            }
        }
        return ((com.p314xaae8f345.mm.p943x351df9c2.z) this.f134870f).l(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d((kv.e0) n1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        if (this.f134869e == null) {
            synchronized (this) {
                if (this.f134869e == null) {
                    this.f134869e = (kv.c0) i95.n0.c(kv.c0.class);
                }
            }
        }
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) this.f134869e).Vi(str, i17, i18, i19);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String str) {
        if (this.f134869e == null) {
            synchronized (this) {
                if (this.f134869e == null) {
                    this.f134869e = (kv.c0) i95.n0.c(kv.c0.class);
                }
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) this.f134869e).getClass();
        return com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        if (this.f134868d == null || this.f134868d.isRecycled()) {
            synchronized (this) {
                if (this.f134868d == null || this.f134868d.isRecycled()) {
                    this.f134868d = bp.b.m10969xb866ec1c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), com.p314xaae8f345.mm.R.raw.f78922x61de8d17, null);
                }
            }
        }
        return this.f134868d;
    }
}
