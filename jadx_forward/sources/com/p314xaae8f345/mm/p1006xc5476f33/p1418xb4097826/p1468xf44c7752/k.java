package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m f192921r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m mVar) {
        super(0, null, null, null, 15, null);
        this.f192921r = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m mVar = this.f192921r;
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
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 c18393x3e165bd9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) holder.p(com.p314xaae8f345.mm.R.id.h9l);
            if (c18393x3e165bd9 != null) {
                c18393x3e165bd9.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560047w));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e_e);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
        imageView.setClickable(false);
        imageView.setEnabled(false);
        textView3.setClickable(false);
        textView3.setEnabled(false);
        pd2.d dVar = pd2.d.f435078a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        dVar.a(itemView, item, true, mVar.d());
    }
}
