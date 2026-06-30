package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class h7 implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f266333a;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var) {
        this.f266333a = c6Var;
    }

    @Override // db5.j4
    public void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String str2 = ((db5.h4) menuItem).A;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a.equals(com.p314xaae8f345.mm.p794xb0fa9b5e.y.a())) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, str2, null);
            } else {
                try {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.s) ((kv.y) i95.n0.c(kv.y.class))).wi(imageView2, str2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewMenuHelper", e17, "attachAvatar for username: " + str2, new java.lang.Object[0]);
                }
            }
            imageView.setVisibility(8);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f266333a;
        c6Var.getClass();
        if (menuItem.getItemId() >= 10000) {
            imageView.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = c6Var.f265580d;
        if (r2Var.get(str) != null && !((android.graphics.Bitmap) r2Var.get(str)).isRecycled()) {
            imageView.setImageBitmap((android.graphics.Bitmap) r2Var.get(str));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewMenuHelper", "on attach icon, load from cache fail");
        try {
            java.lang.String R9 = c6Var.c().L1.A.R9(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(R9)) {
                return;
            }
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.f265422a;
            android.graphics.Bitmap a17 = hy4.z.f367739a.a(R9);
            if (a17 == null || a17.isRecycled()) {
                return;
            }
            imageView.setImageBitmap(a17);
            r2Var.put(str, a17);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + e18.getMessage());
        }
    }
}
