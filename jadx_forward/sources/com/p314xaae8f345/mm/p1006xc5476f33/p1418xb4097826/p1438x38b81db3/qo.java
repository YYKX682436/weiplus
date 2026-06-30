package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qo extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final tu2.b f185943e;

    public qo(int i17, tu2.b itemViewConfig, yz5.r rVar, yz5.a aVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        itemViewConfig = (i18 & 2) != 0 ? new tu2.b() : itemViewConfig;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemViewConfig, "itemViewConfig");
        this.f185943e = itemViewConfig;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570341e73;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m75945x2fec8307;
        so2.a0 item = (so2.a0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMixFavVideoRoundCornerConvert", "position:" + i17 + " FinderCollectInfoFeed=" + item);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f565103so5);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        r45.cc1 cc1Var = item.f491777d;
        r45.vx0 vx0Var = (r45.vx0) cc1Var.m75936x14adae67(2);
        mn2.q3 q3Var = new mn2.q3(vx0Var != null ? vx0Var.m75945x2fec8307(3) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(this.f185943e.f503666c ? mn2.f1.f411489g : mn2.f1.f411488f));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.obc);
        r45.vx0 vx0Var2 = (r45.vx0) cc1Var.m75936x14adae67(2);
        java.lang.String m75945x2fec83072 = vx0Var2 != null ? vx0Var2.m75945x2fec8307(1) : null;
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            r45.vx0 vx0Var3 = (r45.vx0) cc1Var.m75936x14adae67(2);
            if (vx0Var3 != null) {
                m75945x2fec8307 = vx0Var3.m75945x2fec8307(2);
            }
            m75945x2fec8307 = null;
        } else {
            r45.vx0 vx0Var4 = (r45.vx0) cc1Var.m75936x14adae67(2);
            if (vx0Var4 != null) {
                m75945x2fec8307 = vx0Var4.m75945x2fec8307(1);
            }
            m75945x2fec8307 = null;
        }
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            if (textView != null) {
                textView.setText(m75945x2fec8307);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565583cu2);
        r45.vx0 vx0Var5 = (r45.vx0) cc1Var.m75936x14adae67(2);
        int m75939xb282bd08 = vx0Var5 != null ? vx0Var5.m75939xb282bd08(4) : 0;
        android.content.Context context = holder.f374654e;
        if (m75939xb282bd08 > 0) {
            if (textView2 != null) {
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkw, java.lang.Integer.valueOf(m75939xb282bd08)));
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.k3f);
        ya2.b2 b2Var = item.f491778e;
        java.lang.String w07 = b2Var != null ? b2Var.w0() : null;
        if (textView3 != null) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, w07));
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o7i);
        long m75942xfb822ef2 = cc1Var.m75942xfb822ef2(4);
        if (m75942xfb822ef2 > 0) {
            if (textView4 != null) {
                o72.v3 v3Var = (o72.v3) i95.n0.c(o72.v3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q1) v3Var).getClass();
                textView4.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.a(context, m75942xfb822ef2 * 1000));
            }
        } else if (textView4 != null) {
            textView4.setText("");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "collection_list_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(holder.f3639x46306858, 32, 1, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.f3639x46306858, kz5.b1.e(new jz5.l("comment_scene", 349)));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.f3639x46306858, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.po(V6, item));
    }
}
