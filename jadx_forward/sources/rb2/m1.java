package rb2;

/* loaded from: classes3.dex */
public final class m1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 f475222a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15) {
        this.f475222a = c13709xbc18ee15;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = this.f475222a;
        android.content.Context context = c13709xbc18ee15.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(context);
        if (a17 == null) {
            return;
        }
        java.lang.String m55652x596791eb = c13709xbc18ee15.m55652x596791eb();
        if (m55652x596791eb == null || r26.n0.N(m55652x596791eb)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageGalleryView", "localImagePath is empty, cannot show the image menu!!!");
            return;
        }
        rb2.d1 d1Var = c13709xbc18ee15.f184615y0;
        android.graphics.Bitmap bitmap = d1Var != null ? d1Var.f475140f : null;
        gd2.n menuData = c13709xbc18ee15.getMenuData();
        if (c13709xbc18ee15.getSelectedView() != null && bitmap != null && menuData != null) {
            try {
                new gd2.i(a17, m55652x596791eb, this.f475222a, (gd2.x) ((jz5.n) menuData.f352087j).mo141623x754a37bb(), new rb2.k1(menuData, m55652x596791eb), rb2.l1.f475211d).a();
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageGalleryView", "show image menu failed. " + e17.getMessage());
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cannot show the image menu, bitmap==null:");
        sb6.append(bitmap == null);
        sb6.append(" selectedView:");
        sb6.append(c13709xbc18ee15.getSelectedView());
        sb6.append(" currentMenuData:");
        sb6.append(menuData);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageGalleryView", sb6.toString());
    }
}
