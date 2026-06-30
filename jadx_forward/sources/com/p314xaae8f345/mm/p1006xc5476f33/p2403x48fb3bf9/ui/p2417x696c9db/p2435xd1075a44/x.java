package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class x implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 f269125a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var) {
        this.f269125a = d0Var;
    }

    @Override // db5.j4
    public final void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var = this.f269125a;
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((db5.h4) menuItem).A)) {
            return;
        }
        try {
            java.lang.String R9 = d0Var.e().e0().R9(((db5.h4) menuItem).A);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R9, "getHeadImgPath(...)");
            android.graphics.Bitmap a17 = hy4.z.f367739a.a(R9);
            if (a17 == null) {
                return;
            }
            android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(a17, true, a17.getWidth() * 0.1f);
            imageView.setVisibility(8);
            imageView2.setImageBitmap(s07);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            d0Var.f268677b.put(str, s07);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HalfScreenWebViewMenuHelper", "handle share to recent friends, ex = " + e17.getMessage());
        }
    }
}
