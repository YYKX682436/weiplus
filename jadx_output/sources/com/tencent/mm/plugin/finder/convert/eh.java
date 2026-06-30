package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class eh extends com.tencent.mm.plugin.finder.convert.ck {

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f103263q;

    public /* synthetic */ eh(int i17, tu2.b bVar, yz5.r rVar, yz5.a aVar, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? -1 : i17, (i18 & 2) != 0 ? new tu2.b() : bVar, (i18 & 4) != 0 ? null : rVar, (i18 & 8) != 0 ? null : aVar);
    }

    @Override // in5.r
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(item.getFeedObject().getMediaList());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int intValue = ((java.lang.Number) ((jz5.n) this.f103263q).getValue()).intValue();
        android.content.Context context = holder.f293121e;
        int dimension = (intValue - ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9))) / 2;
        int a17 = bu2.z.a(bu2.z.g(mb4Var), dimension, item.getFeedObject().isLiveFeed());
        if (a17 > 0) {
            layoutParams.width = dimension;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
        }
        holder.itemView.setTag(com.tencent.mm.R.id.teh, 0L);
        holder.itemView.setTag(com.tencent.mm.R.id.tei, "");
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c a18 = g1Var.e().a(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null));
        tu2.b bVar = this.f103063f;
        a18.g(g1Var.h(bVar.f422133c ? mn2.f1.f329956g : mn2.f1.f329955f));
        a18.f447873d = new com.tencent.mm.plugin.finder.convert.ch(holder, mb4Var);
        a18.c(imageView);
        com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) holder.p(com.tencent.mm.R.id.h9l);
        if (com.tencent.mm.ui.bk.C()) {
            imageIndicatorView.f170655i = com.tencent.mm.R.color.BW_100_Alpha_0_0_5;
            imageIndicatorView.f170654h = com.tencent.mm.R.color.BW_100_Alpha_0_1_5;
        } else {
            imageIndicatorView.f170655i = com.tencent.mm.R.color.BW_0_Alpha_0_0_5;
            imageIndicatorView.f170654h = com.tencent.mm.R.color.BW_0_Alpha_0_1_5;
        }
        if (imageIndicatorView != null) {
            imageIndicatorView.setVisibility(0);
        }
        if (imageIndicatorView != null) {
            imageIndicatorView.f170651e = item.getFeedObject().getMediaList().size();
        }
        n(holder, item);
        if (o() && imageIndicatorView != null) {
            imageIndicatorView.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478984mn));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.e0b);
        if (p17 != null) {
            java.lang.CharSequence text = textView != null ? textView.getText() : null;
            if (text == null) {
                text = "";
            }
            p17.setTag(com.tencent.mm.R.id.e79, text);
            ya2.b2 contact = item.getContact();
            p17.setTag(com.tencent.mm.R.id.e5i, java.lang.Integer.valueOf((contact == null || (finderAuthInfo = contact.field_authInfo) == null) ? 0 : finderAuthInfo.getAuthIconType()));
            java.lang.CharSequence text2 = textView2 != null ? textView2.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            p17.setTag(com.tencent.mm.R.id.f484408e61, text2);
            java.lang.CharSequence text3 = textView3 != null ? textView3.getText() : null;
            p17.setTag(com.tencent.mm.R.id.e5o, text3 != null ? text3 : "");
            p17.setTag(com.tencent.mm.R.id.f484416e73, java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        }
        if (bVar.f422133c) {
            int color = context.getResources().getColor(com.tencent.mm.R.color.f478518a0);
            int color2 = context.getResources().getColor(com.tencent.mm.R.color.f479255u7);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.f484870fs4);
            if (p18 != null) {
                p18.setBackgroundColor(color);
            }
            android.view.View p19 = holder.p(com.tencent.mm.R.id.lb6);
            if (p19 != null) {
                p19.setBackgroundColor(color);
            }
            android.view.View p27 = holder.p(com.tencent.mm.R.id.l96);
            if (p27 != null) {
                p27.setBackgroundColor(color);
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
            if (textView4 != null) {
                textView4.setTextColor(color2);
            }
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
            if (textView5 != null) {
                textView5.setTextColor(color2);
            }
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fwn);
            if (textView6 != null) {
                textView6.setTextColor(color2);
            }
            android.widget.TextView textView7 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fvz);
            if (textView7 != null) {
                textView7.setTextColor(color2);
            }
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView2 = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) holder.p(com.tencent.mm.R.id.h9l);
            if (imageIndicatorView2 != null) {
                imageIndicatorView2.setBackgroundColor(color);
                imageIndicatorView2.f170655i = com.tencent.mm.R.color.BW_100_Alpha_0_0_5;
                imageIndicatorView2.f170654h = com.tencent.mm.R.color.BW_100_Alpha_0_1_5;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(int i17, tu2.b itemViewConfig, yz5.r rVar, yz5.a aVar) {
        super(com.tencent.mm.R.layout.aia, itemViewConfig, i17, rVar, aVar);
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f103263q = jz5.h.b(com.tencent.mm.plugin.finder.convert.dh.f103155d);
    }
}
