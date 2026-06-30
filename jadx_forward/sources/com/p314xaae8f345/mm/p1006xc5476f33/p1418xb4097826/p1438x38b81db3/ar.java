package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ar extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wq f184432f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wq(null);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f184433e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zq.f186655d);

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570579ed0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ar arVar;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder pos=");
        sb6.append(i17);
        sb6.append(" dramaId=");
        sb6.append(pm0.v.u(item.f189326e));
        sb6.append(" dramaName=");
        java.lang.String str = item.f189327f;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaRecommendConvert", sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.uk6);
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
            arVar = this;
        } else {
            arVar = this;
            layoutParams = null;
        }
        int intValue = (((java.lang.Number) ((jz5.n) arVar.f184433e).mo141623x754a37bb()).intValue() - ((int) holder.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz))) / 2;
        int i19 = (intValue / 3) * 4;
        if (layoutParams != null) {
            layoutParams.width = intValue;
        }
        if (layoutParams != null) {
            layoutParams.height = i19;
        }
        imageView.setLayoutParams(layoutParams);
        boolean z18 = true;
        java.lang.String str2 = item.f189328g;
        if (str2 == null || str2.length() == 0) {
            imageView.setImageDrawable(null);
        } else {
            mn2.q3 q3Var = new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(q3Var, imageView, g1Var.h(mn2.f1.f411489g));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uk7);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        com.p314xaae8f345.mm.ui.fk.b(textView);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uk8);
        java.lang.String str3 = item.f189331m;
        if (str3 == null || str3.length() == 0) {
            textView2.setVisibility(8);
        } else {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            textView2.setText(zy2.s6.l6((zy2.s6) c17, str3, (int) textView2.getTextSize(), false, null, 0, false, null, 124, null));
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uk9);
        java.lang.String str4 = item.f189329h;
        if (str4 != null && str4.length() != 0) {
            z18 = false;
        }
        if (z18) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(str4);
            textView3.setVisibility(0);
        }
        java.util.Map a17 = f184432f.a(item);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.view.View view = holder.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xq xqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xq(holder);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        d2Var.n(view, "drama_tab_series_card", (r20 & 4) != 0 ? 40 : 8, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : a17, (r20 & 128) != 0 ? null : xqVar);
        android.view.View view2 = holder.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yq yqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yq(holder);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        d2Var.n(view2, "drama_tab_series_card", (r20 & 4) != 0 ? 40 : 32, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : true, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : a17, (r20 & 128) != 0 ? null : yqVar);
    }
}
