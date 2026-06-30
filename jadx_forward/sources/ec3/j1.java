package ec3;

/* loaded from: classes9.dex */
public final class j1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570784ej3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int b17;
        int i19;
        android.widget.ImageView imageView;
        ec3.k1 item = (ec3.k1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p6 p6Var = item.f332578d;
        java.lang.String str = p6Var != null ? p6Var.f227078d : null;
        boolean z18 = p6Var != null && p6Var.f227079e == 1;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.p314xaae8f345.mm.R.id.ue7);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f567317ue5);
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ue6);
        android.widget.ImageView imageView4 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ue9);
        android.widget.ImageView imageView5 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ue8);
        zl5.b bVar = zl5.b.f555619a;
        zl5.b.b(bVar, relativeLayout, i65.a.b(context, 1), false, false, 12, null);
        zl5.b.b(bVar, imageView2, i65.a.b(context, 1), false, false, 12, null);
        zl5.b.b(bVar, imageView3, i65.a.b(context, 1), false, false, 12, null);
        if (str == null || str.length() == 0) {
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            if (imageView3 != null) {
                imageView3.setImageBitmap(null);
            }
            if (imageView4 != null) {
                imageView4.setImageBitmap(null);
            }
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            if (imageView5 != null && imageView5.getVisibility() == 4) {
                imageView5.setVisibility(0);
                return;
            }
            return;
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (z18) {
            h0Var.f391656d = imageView4;
            b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 26);
            i19 = (int) (b17 / 0.5818f);
            imageView = imageView3;
        } else {
            h0Var.f391656d = imageView3;
            b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 24);
            i19 = (int) (b17 / 0.59385f);
            imageView = imageView4;
        }
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        r45.wv3 wv3Var = new r45.wv3();
        r45.xv3 xv3Var = new r45.xv3();
        xv3Var.K = str;
        wv3Var.f471034g = xv3Var;
        wv3Var.f471031d = str;
        wv3Var.f471033f = str;
        android.widget.ImageView imageView6 = (android.widget.ImageView) h0Var.f391656d;
        if (imageView6 != null) {
            imageView6.setImageBitmap(null);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) ((gb3.j) i95.n0.c(gb3.j.class))).oj((android.widget.ImageView) h0Var.f391656d, wv3Var, b17, i19, new ec3.i1(h0Var, imageView2, imageView5));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
