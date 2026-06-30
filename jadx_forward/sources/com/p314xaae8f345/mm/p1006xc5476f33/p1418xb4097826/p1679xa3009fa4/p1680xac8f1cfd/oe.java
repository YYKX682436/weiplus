package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class oe extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ee implements zy2.i7 {

    /* renamed from: n, reason: collision with root package name */
    public final so2.c f217002n;

    /* renamed from: o, reason: collision with root package name */
    public r45.u25 f217003o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217002n = so2.c.f491811e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public android.view.View R6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.g1p);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.p314xaae8f345.mm.R.id.g1q);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public so2.c S6() {
        return this.f217002n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void W6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.p(com.p314xaae8f345.mm.R.id.g1p) != null) {
            super.W6(holder);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ee
    public void g7(in5.s0 holder) {
        android.view.View R6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.g7(holder);
        if (d7(holder, true) && (R6 = R6(holder)) != null) {
            android.content.Context context = holder.f374654e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf == null) {
                return;
            }
            java.lang.Object obj = holder.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 == null) {
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kmi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = "";
            pm0.v.y(((xc2.k0) ((jz5.n) this.f215802i).mo141623x754a37bb()).c7(abstractC14490x69736cb5.mo2128x1ed62e84()), abstractActivityC21394xb3d2c0cf, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ke(this, textView, h0Var, string));
            r45.u25 u25Var = this.f217003o;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedRingtoneUIC", java.lang.String.valueOf(u25Var != null ? u25Var.m75945x2fec8307(1) : null));
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.mnl);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.mnk);
            textView2.setTextSize(0, m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.me(this, abstractC14490x69736cb5, holder, p17, textView2));
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a.b(abstractC14490x69736cb5)) {
                p17.setBackgroundColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                textView2.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2c));
                textView2.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            } else {
                p17.setBackgroundColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                textView2.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f4x));
                textView2.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            }
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.m59);
            java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(abstractC14490x69736cb5.getFeedObject().f66937x27cd822a.m76826xb1bffb28(), false);
            textView3.setTextSize(0, m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
            textView3.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f2a, o17));
            float dimension = m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p17, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) p17).b(dimension, dimension, dimension, dimension);
            p17.invalidate();
            ym5.a1.h(R6, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ne(this, abstractC14490x69736cb5));
        }
    }
}
