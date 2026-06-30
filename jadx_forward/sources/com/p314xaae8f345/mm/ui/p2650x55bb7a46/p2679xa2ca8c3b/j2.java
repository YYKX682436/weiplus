package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class j2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 f285756d;

    public j2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2 c2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var) {
        this.f285756d = v1Var;
    }

    @Override // l01.u
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgFrom", "hy: decode recorder cover failed receiver!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(808, 2);
    }

    @Override // l01.u
    public void d() {
        this.f285756d.T.setVisibility(4);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "CHAT#" + ik1.i0.a(this);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var = this.f285756d;
        v1Var.T.setImageBitmap(bitmap);
        v1Var.T.setVisibility(0);
    }
}
