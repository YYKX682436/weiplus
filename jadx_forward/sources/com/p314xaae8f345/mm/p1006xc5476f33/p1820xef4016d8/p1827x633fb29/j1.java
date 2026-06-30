package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k1 f226881e;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k1 k1Var, android.graphics.Bitmap bitmap) {
        this.f226881e = k1Var;
        this.f226880d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k1 k1Var = this.f226881e;
        android.widget.ImageView imageView = k1Var.f226919f.f226940d;
        if (imageView != null) {
            java.lang.String str = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.j1c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[loadThumbView] loadUrl: %s, oldUrl:%s", k1Var.f226918e, str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k1Var.f226918e) || !k1Var.f226918e.equals(str)) {
                gb3.i iVar = k1Var.f226919f.f226937a;
                if (iVar != null) {
                    iVar.mo66107x815f5438(false);
                    return;
                }
                return;
            }
            k1Var.f226919f.f226940d.setImageBitmap(this.f226880d);
            gb3.i iVar2 = k1Var.f226919f.f226937a;
            if (iVar2 != null) {
                iVar2.mo66107x815f5438(true);
            }
        }
    }
}
