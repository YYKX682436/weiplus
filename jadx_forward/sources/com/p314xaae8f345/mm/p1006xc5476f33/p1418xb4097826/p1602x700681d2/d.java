package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4x;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.fvh);
        r45.vx0 vx0Var = item.f203824d;
        java.lang.String m75945x2fec8307 = vx0Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d e17 = g1Var.e();
            mn2.q3 q3Var = new mn2.q3(vx0Var.m75945x2fec8307(3), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411496q));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fvm);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fvj);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String m75945x2fec83072 = vx0Var.m75945x2fec8307(1);
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f374654e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83072));
        long f17 = c01.id.f(vx0Var.m75939xb282bd08(7));
        java.lang.String m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.m(context, vx0Var.m75939xb282bd08(7) * 1000, java.lang.Boolean.TRUE);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ets);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (f17 < 31536000) {
            m17 = m17 + string;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.etl, java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(4)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.etm, m17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
        if (m17.length() > 0) {
            string2 = string2 + ' ' + string3;
        }
        textView2.setText(string2);
        o(holder, vx0Var, i17);
    }

    public void o(in5.s0 holder, r45.vx0 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, itemView, "collection_card", 0, 0, kz5.c1.k(new jz5.l("collection_id", pm0.v.u(info.m75942xfb822ef2(0))), new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17))), null, 44, null);
    }
}
