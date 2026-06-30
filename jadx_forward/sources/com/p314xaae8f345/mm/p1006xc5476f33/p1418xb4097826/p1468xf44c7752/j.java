package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m f192918r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m mVar) {
        super(0, null, null, null, 15, null);
        this.f192918r = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m mVar = this.f192918r;
        if (mVar.d()) {
            android.content.Context context = holder.f374654e;
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w);
            int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
            int color3 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f566403fs4);
            if (p17 != null) {
                p17.setBackgroundColor(color);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
            if (textView != null) {
                textView.setTextColor(color2);
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
            if (textView2 != null) {
                textView2.setTextColor(color3);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
        if (textView3 != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.getFeedObject().m59226x730bcac6())) {
                textView3.setVisibility(8);
                textView3.setText("");
            } else {
                textView3.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207295b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.String m59226x730bcac6 = item.getFeedObject().m59226x730bcac6();
                android.text.TextPaint paint = textView3.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                android.text.Spanned b17 = l4Var.b(m59226x730bcac6, paint, i19, "", true);
                ((ke0.e) xVar).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context2, b17, 0.0f));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e_e);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
        imageView.setClickable(false);
        imageView.setEnabled(false);
        textView4.setClickable(false);
        textView4.setEnabled(false);
        pd2.d dVar = pd2.d.f435078a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dVar.a(itemView, item, true, mVar.d());
    }
}
