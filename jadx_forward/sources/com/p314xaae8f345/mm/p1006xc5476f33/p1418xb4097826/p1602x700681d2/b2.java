package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class b2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4y;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fvj);
        r45.vx0 vx0Var = item.f203824d;
        long f17 = c01.id.f(vx0Var.m75939xb282bd08(7));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.content.Context context = holder.f374654e;
        java.lang.String m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.m(context, vx0Var.m75939xb282bd08(7) * 1000, bool);
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
        if ((m17.length() > 0) && f17 <= 604800) {
            string2 = string2 + ' ' + string3;
        }
        textView.setText(string2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
        if (p2Var == null || (str = p2Var.m58743x6c03c64c()) == null) {
            str = "";
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.d1y);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            if (item.f203825e == item.f203826f - 1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                marginLayoutParams2.leftMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                marginLayoutParams2.leftMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw);
            }
            marginLayoutParams = marginLayoutParams2;
        }
        p17.setLayoutParams(marginLayoutParams);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dy1.a.i(itemView, "profile_collection_card");
        android.view.View itemView2 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
        dy1.a.a(itemView2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.a2(V6, item, str, holder));
        android.view.View itemView3 = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
        dy1.a.l(itemView3, 40, 25496);
    }
}
