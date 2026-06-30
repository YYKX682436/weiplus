package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public abstract class rk {
    public static void a(android.content.Context context, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar) {
        if (o6Var == null) {
            return;
        }
        b(context, viewGroup, o6Var, okVar, o6Var.f227052f);
    }

    public static void b(android.content.Context context, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar, java.lang.String str) {
        r45.xv3 xv3Var;
        int i17;
        int i18;
        int i19;
        int i27;
        if (viewGroup == null || o6Var == null) {
            return;
        }
        if (o6Var.f227050d == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", "operInfo enable:" + o6Var.f227050d);
            viewGroup.setVisibility(8);
            return;
        }
        if (!o6Var.f227052f.equalsIgnoreCase(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", "not match type:" + o6Var.f227052f + ", " + str);
            viewGroup.setVisibility(8);
            return;
        }
        if (str.equalsIgnoreCase("Text") || str.equalsIgnoreCase("Native")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qk qkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qk();
            qkVar.f228888a = okVar;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f227051e)) {
                return;
            }
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bv9, viewGroup, true);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567351j71);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567350j70);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f227055i)) {
                imageView.setVisibility(8);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.u(imageView, o6Var.f227055i, null, false);
                imageView.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar2 = qkVar.f228888a;
            if (okVar2 == null || (i18 = okVar2.f228817b) == Integer.MIN_VALUE) {
                textView.setTextSize(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
            } else {
                textView.setTextSize(0, i18);
            }
            textView.setGravity(17);
            textView.setText(o6Var.f227051e);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f227053g)) {
                textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.pk(qkVar, o6Var, context));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar3 = qkVar.f228888a;
            if (okVar3 != null && (i17 = okVar3.f228816a) != Integer.MIN_VALUE) {
                textView.setTextColor(i17);
            }
            viewGroup.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 14, 0, 0, 0, 1, java.lang.Integer.valueOf(o6Var.f227054h));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar4 = qkVar.f228888a;
            if (okVar4 != null) {
                o45.eg.a(okVar4.f228819d, 0);
                r45.wv3 wv3Var = qkVar.f228888a.f228821f;
                if (wv3Var == null || (xv3Var = wv3Var.f471034g) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472013g)) {
                    return;
                }
                gb3.m.a(65, qkVar.f228888a.f228821f.f471034g.f472013g);
                return;
            }
            return;
        }
        if (str.equalsIgnoreCase("Pic")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kk kkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kk();
            kkVar.f228643a = okVar;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f227051e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyOperationViewMgr", "BannerPicOperationView attach iconUrl null");
                viewGroup.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView2 = new android.widget.ImageView(context);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.u(imageView2, o6Var.f227051e, null, false);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f227053g)) {
                imageView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jk(kkVar, o6Var, context));
            }
            imageView2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(imageView2);
            viewGroup.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 14, 0, 0, 0, 1, java.lang.Integer.valueOf(o6Var.f227054h));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar5 = kkVar.f228643a;
            if (okVar5 != null) {
                o45.eg.a(okVar5.f228819d, 0);
                return;
            }
            return;
        }
        if (str.equalsIgnoreCase("Appid")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nk nkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nk();
            nkVar.f228778a = okVar;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f227051e)) {
                return;
            }
            android.widget.TextView textView2 = new android.widget.TextView(context);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar6 = nkVar.f228778a;
            if (okVar6 == null || (i27 = okVar6.f228816a) == Integer.MIN_VALUE) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_w));
            } else {
                textView2.setTextColor(i27);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar7 = nkVar.f228778a;
            if (okVar7 == null || (i19 = okVar7.f228817b) == Integer.MIN_VALUE) {
                textView2.setTextSize(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
            } else {
                textView2.setTextSize(0, i19);
            }
            textView2.setGravity(17);
            textView2.setText(o6Var.f227051e);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.f227053g)) {
                textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mk(nkVar, o6Var, context));
            }
            viewGroup.addView(textView2, new android.view.ViewGroup.LayoutParams(-2, -2));
            viewGroup.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 14, 0, 0, 0, 1, java.lang.Integer.valueOf(o6Var.f227054h));
        }
    }
}
