package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes8.dex */
public final class l extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dtr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.e item = (jo2.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.kg2 kg2Var = item.f382417d;
        int i19 = kg2Var.f460210m;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i19 == 2) {
            vo0.d a17 = g1Var.a();
            java.lang.String str = kg2Var.f460205e;
            mn2.n nVar = new mn2.n(str != null ? str : "", null, 2, null);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f567418rx0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411490h));
        } else {
            vo0.d l17 = g1Var.l();
            java.lang.String str2 = kg2Var.f460205e;
            mn2.n nVar2 = new mn2.n(str2 != null ? str2 : "", null, 2, null);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f567418rx0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
            l17.c(nVar2, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f411490h));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567419rx1);
        android.content.Context context = holder.f374654e;
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567419rx1);
            i95.m c17 = i95.n0.c(ht2.y0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.s6 s6Var = (zy2.s6) c17;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = kg2Var.f460204d;
            ((ke0.e) xVar).getClass();
            textView2.setText(zy2.s6.l6(s6Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3), (int) textView.getTextSize(), false, null, 0, false, null, 120, null));
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567420rx2);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str4 = kg2Var.f460206f;
        ((ke0.e) xVar2).getClass();
        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str4));
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567421rx3)).setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.k(context, kg2Var.f460208h * 1000));
        if (kg2Var.f460207g == 0) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.rwz)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mrg));
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.rwz)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mri, java.lang.String.valueOf(kg2Var.f460207g)));
        }
    }
}
