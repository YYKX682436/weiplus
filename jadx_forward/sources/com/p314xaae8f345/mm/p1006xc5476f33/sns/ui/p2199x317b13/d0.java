package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.c0) baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(c0Var) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(c0Var).getParent() == null) {
            c0Var.E0 = c0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.n8j);
            c0Var.D0 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(c0Var).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.cro);
            if (!c0Var.D0) {
                c0Var.E0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(c0Var).inflate();
                c0Var.D0 = true;
            }
        }
        c0Var.G0 = (android.widget.ImageView) c0Var.E0.findViewById(com.p314xaae8f345.mm.R.id.n8m);
        c0Var.H0 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) c0Var.E0.findViewById(com.p314xaae8f345.mm.R.id.n8k);
        c0Var.I0 = (android.widget.ImageView) c0Var.E0.findViewById(com.p314xaae8f345.mm.R.id.n8n);
        c0Var.F0 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) c0Var.E0.findViewById(com.p314xaae8f345.mm.R.id.n8l);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        r45.a90 a90Var;
        r45.ek4 ek4Var;
        r45.dk4 dk4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        if (c19807x593d1720 != null && (a90Var = c19807x593d1720.f39014x86965dde) != null && (ek4Var = a90Var.f451382t) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.c0) baseViewHolder;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(ek4Var.m75941xfb821914(6)) && (dk4Var = (r45.dk4) ek4Var.m75941xfb821914(6).get(0)) != null) {
                c0Var.G0.setVisibility(0);
                c0Var.H0.setVisibility(8);
                c0Var.F0.m7187xdf772b4d(0);
                android.util.Pair k17 = m21.y.k((int) dk4Var.m75938x746dc8a6(2), (int) dk4Var.m75938x746dc8a6(3), c0Var.E0.getContext(), false);
                int intValue = ((java.lang.Integer) k17.first).intValue();
                int intValue2 = ((java.lang.Integer) k17.second).intValue();
                c0Var.E0.getLayoutParams().width = intValue;
                c0Var.E0.getLayoutParams().height = intValue2;
                c0Var.E0.requestLayout();
                if (android.text.TextUtils.isEmpty(dk4Var.m75945x2fec8307(4))) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.h(dk4Var.m75945x2fec8307(1), c0Var.I0, mn2.f1.B);
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.h(dk4Var.m75945x2fec8307(4), c0Var.I0, mn2.f1.B);
                }
                c0Var.E0.setTag(c19807x593d1720);
                c0Var.E0.setOnClickListener(bsVar.f249576i.f251190e);
                rl5.r d17 = bsVar.d();
                android.view.View view = c0Var.E0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = bsVar.f249572e;
                d17.j(view, iVar.G, iVar.f251342l);
            }
        }
        g(nsVar, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        return "MegaVideoTimeLineItem";
    }
}
