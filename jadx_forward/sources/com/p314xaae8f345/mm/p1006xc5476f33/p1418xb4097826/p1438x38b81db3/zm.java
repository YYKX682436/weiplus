package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class zm extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b1x;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.content.Context context;
        int i19;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        so2.w2 item = (so2.w2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context2 = holder.f374654e;
        if (i17 == 0) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.p314xaae8f345.mm.R.id.fqu);
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fqv);
            if (textView != null) {
                textView.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekc, zl2.r4.S(zl2.r4.f555483a, item.f492222d, 0, 2, null)));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fqr);
            if (textView2 != null) {
                textView2.setText(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ego, java.lang.Long.valueOf(item.f492223e)));
            }
        } else {
            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) holder.p(com.p314xaae8f345.mm.R.id.fqu);
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fqy);
        r45.a82 a82Var = item.f492224f;
        if (textView3 != null) {
            r45.xn1 xn1Var = (r45.xn1) a82Var.m75936x14adae67(0);
            r45.yl1 yl1Var = xn1Var != null ? (r45.yl1) xn1Var.m75936x14adae67(5) : null;
            int m75939xb282bd08 = yl1Var != null ? yl1Var.m75939xb282bd08(0) : 0;
            int m75939xb282bd082 = yl1Var != null ? yl1Var.m75939xb282bd08(2) : 0;
            int m75939xb282bd083 = xn1Var != null ? xn1Var.m75939xb282bd08(3) : 0;
            zl2.r4 r4Var = zl2.r4.f555483a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setRankTv contact is empty:");
            sb6.append(xn1Var == null);
            sb6.append(",position:");
            sb6.append(i17);
            sb6.append(",badgeType:");
            sb6.append(m75939xb282bd08);
            sb6.append(",badgeLevel:");
            sb6.append(m75939xb282bd082);
            sb6.append(",rewardAmount:");
            sb6.append(m75939xb282bd083);
            context = context2;
            r4Var.M2("FinderLiveWeCoinHotConvert", sb6.toString());
            if (m75939xb282bd083 > 0) {
                int i27 = i17 + 1;
                textView3.setText(java.lang.String.valueOf(i27));
                if (i27 == 1) {
                    textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560567o2));
                    textView3.setTextSize(1, 22.0f);
                } else if (i27 == 2) {
                    textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560569o4));
                    textView3.setTextSize(1, 22.0f);
                } else if (i27 != 3) {
                    textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
                    textView3.setTextSize(1, 15.0f);
                } else {
                    textView3.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560568o3));
                    textView3.setTextSize(1, 22.0f);
                }
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setRankTv contact is empty:");
                sb7.append(xn1Var == null);
                sb7.append(",position:");
                sb7.append(i17);
                sb7.append(",badgeType:");
                sb7.append(m75939xb282bd08);
                sb7.append(",badgeLevel:");
                sb7.append(m75939xb282bd082);
                sb7.append(",rewardAmount:");
                sb7.append(m75939xb282bd083);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveWeCoinHotConvert", sb7.toString());
            }
        } else {
            context = context2;
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fqt);
        if (textView4 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            r45.xn1 xn1Var2 = (r45.xn1) a82Var.m75936x14adae67(0);
            java.lang.String m76184x8010e5e4 = (xn1Var2 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4();
            float textSize = textView4.getTextSize();
            ((ke0.e) xVar).getClass();
            textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, m76184x8010e5e4, textSize));
        }
        android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fqs);
        if (textView5 == null) {
            i19 = 0;
        } else {
            i19 = 0;
            r45.xn1 xn1Var3 = (r45.xn1) a82Var.m75936x14adae67(0);
            textView5.setText(java.lang.String.valueOf(xn1Var3 != null ? java.lang.Integer.valueOf(xn1Var3.m75939xb282bd08(3)) : null));
        }
        r45.xn1 xn1Var4 = (r45.xn1) a82Var.m75936x14adae67(i19);
        if ((xn1Var4 != null ? xn1Var4.m75939xb282bd08(7) : 0) == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.ehp);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.ehp);
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(8);
            }
        }
        android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.gsc);
        if (textView6 == null) {
            return;
        }
        gm2.c1 c1Var = gm2.c1.f354853a;
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.gsc);
        android.content.Context context3 = holder.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        r45.xn1 xn1Var5 = (r45.xn1) a82Var.m75936x14adae67(0);
        textView6.setText((java.lang.CharSequence) gm2.c1.d(c1Var, p17, context3, " ", xn1Var5 != null ? xn1Var5.m75941xfb821914(11) : null, new int[]{2, 4}, null, null, 0, null, null, 992, null).f384366d);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fqy);
        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
    }
}
