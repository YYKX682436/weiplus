package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class z0 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.n1 f230986a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.n1 n1Var) {
        this.f230986a = n1Var;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor onSuccess: %s isNever：%s", bitmap, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            if (bitmap != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.y0(this, bitmap));
                return;
            }
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230986a.f230905d;
        if (a2Var.f230813p == null || a2Var.f230817t) {
            if (a2Var.f230817t) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x0(this));
                return;
            }
            return;
        }
        int i18 = a2Var.f230802e;
        if (i18 > 0 && (i17 = a2Var.f230800c) > 0 && i18 <= i17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.v0(this));
        } else {
            a2Var.A = com.p314xaae8f345.mm.vfs.w6.p(a2Var.f230803f);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w0(this));
        }
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightVideoEditor", "photoEditor onError: %s", exc);
    }
}
