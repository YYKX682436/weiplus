package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.csp);
            android.view.ViewStub viewStub2 = (android.view.ViewStub) baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f566851ha2);
            if (!baseViewHolder.f250796c0 && viewStub2 != null) {
                baseViewHolder.f250798d0 = viewStub2.inflate();
                baseViewHolder.f250796c0 = true;
            }
        } else {
            baseViewHolder.f250798d0 = baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.jdl);
            baseViewHolder.f250796c0 = true;
        }
        android.view.View view = baseViewHolder.f250798d0;
        baseViewHolder.f250831u = view;
        view.findViewById(com.p314xaae8f345.mm.R.id.nh7).setOnTouchListener(this.f250784h.K);
        baseViewHolder.f250833v = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446) baseViewHolder.f250831u.findViewById(com.p314xaae8f345.mm.R.id.h9t);
        baseViewHolder.f250835w = (android.widget.ImageView) baseViewHolder.f250831u.findViewById(com.p314xaae8f345.mm.R.id.nh7);
        baseViewHolder.f250837x = (android.widget.TextView) baseViewHolder.f250831u.findViewById(com.p314xaae8f345.mm.R.id.m4o);
        android.widget.TextView textView = (android.widget.TextView) baseViewHolder.f250831u.findViewById(com.p314xaae8f345.mm.R.id.odj);
        baseViewHolder.f250839y = textView;
        textView.setMaxLines(2);
        ca4.z0.A0(baseViewHolder.f250833v, this.f250782f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        if (c19807x593d1720.f39014x86965dde.f451379q != null) {
            baseViewHolder.f250833v.m70817xa32537ab(i17);
            android.view.View view = baseViewHolder.f250831u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.jj4 jj4Var = new r45.jj4();
            java.lang.String str = c19807x593d1720.f39014x86965dde.f451379q.f454876h;
            jj4Var.f459391g = str;
            jj4Var.f459393i = str;
            jj4Var.f459389e = 2;
            jj4Var.f459395m = 1;
            r45.lj4 lj4Var = new r45.lj4();
            jj4Var.f459398p = lj4Var;
            jj4Var.f459392h = 1;
            r45.ee eeVar = c19807x593d1720.f39014x86965dde.f451379q;
            lj4Var.f461053d = eeVar.f454878m;
            lj4Var.f461054e = eeVar.f454879n;
            jj4Var.f459388d = c19807x593d1720.Id;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            java.lang.String m70367x7525eefd = nsVar.f251558a.m70367x7525eefd();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446 = baseViewHolder.f250833v;
            int hashCode = this.f250782f.hashCode();
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 d17 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.d();
            d17.f276846b = c19807x593d1720.f39015xc86e6609;
            hj6.Z(m70367x7525eefd, jj4Var, c18146x7d99d446, hashCode, d17);
            baseViewHolder.f250835w.setPressed(false);
            android.widget.ImageView imageView = baseViewHolder.f250835w;
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f80346xe0fea6fa, -1));
            baseViewHolder.f250831u.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y5(c19807x593d1720, baseViewHolder.f250833v, nsVar.f251569h));
            baseViewHolder.f250837x.setVisibility(8);
            rl5.r d18 = bsVar.d();
            android.view.View view2 = baseViewHolder.f250831u;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = bsVar.f249572e;
            d18.j(view2, iVar.F, iVar.f251342l);
            baseViewHolder.f250831u.setOnClickListener(bsVar.f249576i.f251189d);
            java.lang.String str2 = c19807x593d1720.f39014x86965dde.f451379q.f454875g;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                baseViewHolder.f250839y.setVisibility(8);
            } else {
                baseViewHolder.f250839y.setVisibility(0);
                baseViewHolder.f250839y.setText(new android.text.SpannableString(str2), android.widget.TextView.BufferType.SPANNABLE);
            }
        } else {
            android.view.View view3 = baseViewHolder.f250831u;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        g(nsVar, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        return "MPVideoTimeLineItem";
    }
}
