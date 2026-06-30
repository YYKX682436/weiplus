package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class zm extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b1x;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.content.Context context;
        int i19;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        so2.w2 item = (so2.w2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context2 = holder.f293121e;
        if (i17 == 0) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.tencent.mm.R.id.fqu);
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fqv);
            if (textView != null) {
                textView.setText(context2.getResources().getString(com.tencent.mm.R.string.ekc, zl2.r4.S(zl2.r4.f473950a, item.f410689d, 0, 2, null)));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fqr);
            if (textView2 != null) {
                textView2.setText(context2.getResources().getString(com.tencent.mm.R.string.ego, java.lang.Long.valueOf(item.f410690e)));
            }
        } else {
            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) holder.p(com.tencent.mm.R.id.fqu);
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fqy);
        r45.a82 a82Var = item.f410691f;
        if (textView3 != null) {
            r45.xn1 xn1Var = (r45.xn1) a82Var.getCustom(0);
            r45.yl1 yl1Var = xn1Var != null ? (r45.yl1) xn1Var.getCustom(5) : null;
            int integer = yl1Var != null ? yl1Var.getInteger(0) : 0;
            int integer2 = yl1Var != null ? yl1Var.getInteger(2) : 0;
            int integer3 = xn1Var != null ? xn1Var.getInteger(3) : 0;
            zl2.r4 r4Var = zl2.r4.f473950a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setRankTv contact is empty:");
            sb6.append(xn1Var == null);
            sb6.append(",position:");
            sb6.append(i17);
            sb6.append(",badgeType:");
            sb6.append(integer);
            sb6.append(",badgeLevel:");
            sb6.append(integer2);
            sb6.append(",rewardAmount:");
            sb6.append(integer3);
            context = context2;
            r4Var.M2("FinderLiveWeCoinHotConvert", sb6.toString());
            if (integer3 > 0) {
                int i27 = i17 + 1;
                textView3.setText(java.lang.String.valueOf(i27));
                if (i27 == 1) {
                    textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479034o2));
                    textView3.setTextSize(1, 22.0f);
                } else if (i27 == 2) {
                    textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479036o4));
                    textView3.setTextSize(1, 22.0f);
                } else if (i27 != 3) {
                    textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
                    textView3.setTextSize(1, 15.0f);
                } else {
                    textView3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479035o3));
                    textView3.setTextSize(1, 22.0f);
                }
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setRankTv contact is empty:");
                sb7.append(xn1Var == null);
                sb7.append(",position:");
                sb7.append(i17);
                sb7.append(",badgeType:");
                sb7.append(integer);
                sb7.append(",badgeLevel:");
                sb7.append(integer2);
                sb7.append(",rewardAmount:");
                sb7.append(integer3);
                com.tencent.mars.xlog.Log.e("FinderLiveWeCoinHotConvert", sb7.toString());
            }
        } else {
            context = context2;
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fqt);
        if (textView4 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            r45.xn1 xn1Var2 = (r45.xn1) a82Var.getCustom(0);
            java.lang.String nickname = (xn1Var2 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact.getNickname();
            float textSize = textView4.getTextSize();
            ((ke0.e) xVar).getClass();
            textView4.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, nickname, textSize));
        }
        android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fqs);
        if (textView5 == null) {
            i19 = 0;
        } else {
            i19 = 0;
            r45.xn1 xn1Var3 = (r45.xn1) a82Var.getCustom(0);
            textView5.setText(java.lang.String.valueOf(xn1Var3 != null ? java.lang.Integer.valueOf(xn1Var3.getInteger(3)) : null));
        }
        r45.xn1 xn1Var4 = (r45.xn1) a82Var.getCustom(i19);
        if ((xn1Var4 != null ? xn1Var4.getInteger(7) : 0) == 3) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ehp);
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ehp);
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
        }
        android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gsc);
        if (textView6 == null) {
            return;
        }
        gm2.c1 c1Var = gm2.c1.f273320a;
        android.view.View p17 = holder.p(com.tencent.mm.R.id.gsc);
        android.content.Context context3 = holder.itemView.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        r45.xn1 xn1Var5 = (r45.xn1) a82Var.getCustom(0);
        textView6.setText((java.lang.CharSequence) gm2.c1.d(c1Var, p17, context3, " ", xn1Var5 != null ? xn1Var5.getList(11) : null, new int[]{2, 4}, null, null, 0, null, null, 992, null).f302833d);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fqy);
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
    }
}
