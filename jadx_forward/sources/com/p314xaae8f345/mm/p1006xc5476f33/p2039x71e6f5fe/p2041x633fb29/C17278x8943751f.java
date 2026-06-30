package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.scanner.model.RecogQBarInYUVListener */
/* loaded from: classes12.dex */
public class C17278x8943751f extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5927xcd833740> {

    /* renamed from: d, reason: collision with root package name */
    public boolean f240304d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u0 f240305e;

    public C17278x8943751f() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f240304d = false;
        this.f240305e = null;
        this.f39173x3fe91575 = 1252797776;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5927xcd833740 c5927xcd833740) {
        am.nr nrVar = c5927xcd833740.f136231g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u0 u0Var = nrVar.f88983d;
        if (!this.f240304d || u0Var == null) {
            this.f240305e = u0Var;
            this.f240304d = true;
            int i17 = nrVar.f88981b;
            int i18 = nrVar.f88982c;
            byte[] bArr = nrVar.f88980a;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(i18);
            objArr[2] = java.lang.Integer.valueOf(bArr != null ? bArr.length : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecogQBarInYUVListener", "hy: request scanning width: %d, height: %d, yuvLen: %d", objArr);
            android.graphics.Bitmap I = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr, i17, i18, null);
            if (I != null) {
                zs5.c0 b17 = bt5.a.b(I, new int[2]);
                if (b17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecogQBarInYUVListener", "decode success");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u0 u0Var2 = this.f240305e;
                    if (u0Var2 != null) {
                        ((v62.k) u0Var2).a(b17.f556865f, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(b17.f556864e), -1);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecogQBarInYUVListener", "decode failed");
                    ((v62.k) this.f240305e).a("", -2, -1);
                }
            }
            this.f240304d = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecogQBarInYUVListener", "hy: is decoding. direct return");
            ((v62.k) u0Var).a("", -1, -1);
        }
        return false;
    }
}
