package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class eh extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck {

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f184796q;

    public /* synthetic */ eh(int i17, tu2.b bVar, yz5.r rVar, yz5.a aVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? -1 : i17, (i18 & 2) != 0 ? new tu2.b() : bVar, (i18 & 4) != 0 ? null : rVar, (i18 & 8) != 0 ? null : aVar);
    }

    @Override // in5.r
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(item.getFeedObject().m59264x7efe73ec());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int intValue = ((java.lang.Number) ((jz5.n) this.f184796q).mo141623x754a37bb()).intValue();
        android.content.Context context = holder.f374654e;
        int dimension = (intValue - ((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9))) / 2;
        int a17 = bu2.z.a(bu2.z.g(mb4Var), dimension, item.getFeedObject().m59311x25315bf4());
        if (a17 > 0) {
            layoutParams.width = dimension;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
        }
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.teh, 0L);
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tei, "");
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c a18 = g1Var.e().a(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null));
        tu2.b bVar = this.f184596f;
        a18.g(g1Var.h(bVar.f503666c ? mn2.f1.f411489g : mn2.f1.f411488f));
        a18.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ch(holder, mb4Var);
        a18.c(imageView);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 c18393x3e165bd9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) holder.p(com.p314xaae8f345.mm.R.id.h9l);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            c18393x3e165bd9.f252188i = com.p314xaae8f345.mm.R.C30859x5a72f63.f77665x8b2be3de;
            c18393x3e165bd9.f252187h = com.p314xaae8f345.mm.R.C30859x5a72f63.f77669x8b2be79f;
        } else {
            c18393x3e165bd9.f252188i = com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d;
            c18393x3e165bd9.f252187h = com.p314xaae8f345.mm.R.C30859x5a72f63.f77632xb498d0de;
        }
        if (c18393x3e165bd9 != null) {
            c18393x3e165bd9.setVisibility(0);
        }
        if (c18393x3e165bd9 != null) {
            c18393x3e165bd9.f252184e = item.getFeedObject().m59264x7efe73ec().size();
        }
        n(holder, item);
        if (o() && c18393x3e165bd9 != null) {
            c18393x3e165bd9.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560517mn));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.i1g);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.e0b);
        if (p17 != null) {
            java.lang.CharSequence text = textView != null ? textView.getText() : null;
            if (text == null) {
                text = "";
            }
            p17.setTag(com.p314xaae8f345.mm.R.id.e79, text);
            ya2.b2 contact = item.getContact();
            p17.setTag(com.p314xaae8f345.mm.R.id.e5i, java.lang.Integer.valueOf((contact == null || (c19780xceb4c4dc = contact.f69300x731cac1b) == null) ? 0 : c19780xceb4c4dc.m76027x1cbb0791()));
            java.lang.CharSequence text2 = textView2 != null ? textView2.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            p17.setTag(com.p314xaae8f345.mm.R.id.f565941e61, text2);
            java.lang.CharSequence text3 = textView3 != null ? textView3.getText() : null;
            p17.setTag(com.p314xaae8f345.mm.R.id.e5o, text3 != null ? text3 : "");
            p17.setTag(com.p314xaae8f345.mm.R.id.f565949e73, java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        }
        if (bVar.f503666c) {
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0);
            int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560788u7);
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f566403fs4);
            if (p18 != null) {
                p18.setBackgroundColor(color);
            }
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.lb6);
            if (p19 != null) {
                p19.setBackgroundColor(color);
            }
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.l96);
            if (p27 != null) {
                p27.setBackgroundColor(color);
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
            if (textView4 != null) {
                textView4.setTextColor(color2);
            }
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
            if (textView5 != null) {
                textView5.setTextColor(color2);
            }
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fwn);
            if (textView6 != null) {
                textView6.setTextColor(color2);
            }
            android.widget.TextView textView7 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fvz);
            if (textView7 != null) {
                textView7.setTextColor(color2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 c18393x3e165bd92 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) holder.p(com.p314xaae8f345.mm.R.id.h9l);
            if (c18393x3e165bd92 != null) {
                c18393x3e165bd92.setBackgroundColor(color);
                c18393x3e165bd92.f252188i = com.p314xaae8f345.mm.R.C30859x5a72f63.f77665x8b2be3de;
                c18393x3e165bd92.f252187h = com.p314xaae8f345.mm.R.C30859x5a72f63.f77669x8b2be79f;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(int i17, tu2.b itemViewConfig, yz5.r rVar, yz5.a aVar) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.aia, itemViewConfig, i17, rVar, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemViewConfig, "itemViewConfig");
        this.f184796q = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dh.f184688d);
    }
}
