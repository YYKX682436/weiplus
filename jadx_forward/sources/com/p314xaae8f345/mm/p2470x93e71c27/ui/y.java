package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes11.dex */
public class y implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f273626d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f273627e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p943x351df9c2.e f273628f = null;

    public y(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var) {
        this.f273626d = j1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        android.graphics.Bitmap b17 = b(str);
        if (b17 != null && !b17.isRecycled()) {
            return b17;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = this.f273626d;
        if (j1Var != null) {
            return j1Var.W0(str);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = this.f273626d;
        if (j1Var != null) {
            j1Var.X9(n1Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        u45.f a17;
        android.graphics.Bitmap b17 = b(str);
        if (b17 != null && !b17.isRecycled()) {
            return b17;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = this.f273626d;
        if (j1Var != null) {
            b17 = j1Var.Zg(str, i17, i18, i19);
        }
        android.graphics.Bitmap a18 = a(b17);
        if (a18 != null) {
            com.p314xaae8f345.mm.p943x351df9c2.e eVar = this.f273628f;
            if ((eVar != null && eVar.f151974b > 0.0f) && (a17 = u45.e.a()) != null) {
                ((va3.m0) a17).Bi(str + "-" + this.f273628f.f151974b, a18);
            }
        }
        return a18;
    }

    public final android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        com.p314xaae8f345.mm.p943x351df9c2.e eVar = this.f273628f;
        return eVar != null && (eVar.f151974b > 0.0f ? 1 : (eVar.f151974b == 0.0f ? 0 : -1)) > 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, eVar.f151974b * bitmap.getWidth()) : bitmap;
    }

    public final android.graphics.Bitmap b(java.lang.String str) {
        u45.f a17;
        com.p314xaae8f345.mm.p943x351df9c2.e eVar = this.f273628f;
        if (!(eVar != null && eVar.f151974b > 0.0f) || (a17 = u45.e.a()) == null) {
            return null;
        }
        return ((va3.m0) a17).Ai(str + "-" + this.f273628f.f151974b);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String str) {
        u45.f a17;
        android.graphics.Bitmap b17 = b(str);
        if (b17 != null && !b17.isRecycled()) {
            return b17;
        }
        com.p314xaae8f345.mm.p943x351df9c2.e eVar = this.f273628f;
        boolean z17 = false;
        if (eVar != null) {
            b17 = com.p314xaae8f345.mm.p943x351df9c2.g.b(str, false, -1, eVar);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = this.f273626d;
            if (j1Var != null) {
                b17 = j1Var.mo560xd586ddb5(str);
            }
        }
        android.graphics.Bitmap a18 = a(b17);
        if (a18 != null) {
            com.p314xaae8f345.mm.p943x351df9c2.e eVar2 = this.f273628f;
            if (eVar2 != null && eVar2.f151974b > 0.0f) {
                z17 = true;
            }
            if (z17 && (a17 = u45.e.a()) != null) {
                ((va3.m0) a17).Bi(str + "-" + this.f273628f.f151974b, a18);
            }
        }
        return a18;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        android.graphics.Bitmap bitmap = this.f273627e;
        if (bitmap != null && !bitmap.isRecycled()) {
            return this.f273627e;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var = this.f273626d;
        if (j1Var != null) {
            return j1Var.uc();
        }
        return null;
    }
}
