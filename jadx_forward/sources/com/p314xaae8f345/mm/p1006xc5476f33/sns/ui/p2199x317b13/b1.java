package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class b1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f250855q = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f250856r = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.a1) baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).getParent() == null) {
            a1Var.E0 = (android.widget.LinearLayout) baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.ncw);
            a1Var.D0 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571064cv1);
            if (!a1Var.D0) {
                a1Var.E0 = (android.widget.LinearLayout) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                a1Var.D0 = true;
            }
        }
        a1Var.F0 = (android.widget.TextView) a1Var.E0.findViewById(com.p314xaae8f345.mm.R.id.f568595nd3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        int i19;
        r45.qb6 qb6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.a1) baseViewHolder;
        if (nsVar.f251559a0 == null || (qb6Var = nsVar.f251561b0) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(qb6Var.f465343d)) {
            i19 = 1;
        } else {
            int size = nsVar.f251561b0.f465343d.size();
            ed4.c0 c0Var = ed4.c0.f332822a;
            final java.lang.String str = "";
            if (size == 1) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nsVar.f251561b0.f465344e)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(((java.lang.Long) nsVar.f251561b0.f465343d.get(0)).longValue());
                    if (W0 != null) {
                        str = c0Var.a(W0.m70371x485d7().f39014x86965dde.f451370e, nsVar.f251561b0.f465343d.size());
                    }
                } else {
                    str = nsVar.f251561b0.f465344e;
                }
            } else if (nsVar.f251561b0.f465343d.size() > 1) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nsVar.f251561b0.f465344e)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W02 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(((java.lang.Long) nsVar.f251561b0.f465343d.get(0)).longValue());
                    if (W02 != null) {
                        str = c0Var.a(W02.m70371x485d7().f39014x86965dde.f451370e, nsVar.f251561b0.f465343d.size());
                    }
                } else {
                    str = nsVar.f251561b0.f465344e;
                    this.f250855q = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jay, java.lang.Integer.valueOf(nsVar.f251561b0.f465343d.size()));
                    this.f250856r = true;
                }
            }
            if (!this.f250856r) {
                android.widget.TextView textView = a1Var.F0;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = a1Var.F0.getContext();
                float textSize = a1Var.F0.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
            }
            if (this.f250856r) {
                a1Var.F0.post(new java.lang.Runnable() { // from class: ed4.b0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.b1 b1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.b1.this;
                        b1Var.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.a1 a1Var2 = a1Var;
                        float textSize2 = a1Var2.F0.getTextSize();
                        int width = a1Var2.E0.getWidth() - (i65.a.h(a1Var2.F0.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2);
                        int i27 = (int) (width / textSize2);
                        java.lang.String str2 = str;
                        int length = str2.length();
                        int length2 = b1Var.f250855q.length();
                        int i28 = i27 - length2;
                        int min = java.lang.Math.min(i28, length);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTimeLineItem", "finalDesc = " + str2 + ", suffix = " + b1Var.f250855q);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTimeLineItem", "textSize = " + textSize2 + ", width = " + width + ", textNumber = " + i27 + ", descLen = " + length + ", suffixLen = " + length2 + ", maxDescLen = " + i28);
                        if (min > 0) {
                            java.lang.String str3 = str2.substring(0, min) + b1Var.f250855q;
                            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                            android.content.Context context2 = a1Var2.F0.getContext();
                            float textSize3 = a1Var2.F0.getTextSize();
                            ((ke0.e) xVar2).getClass();
                            a1Var2.F0.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str3, textSize3));
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$fillItem$0", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
                    }
                });
            }
            a1Var.f250813l.setVisibility(8);
            a1Var.L.setVisibility(8);
            a1Var.H.setVisibility(8);
            a1Var.f250790J.setVisibility(8);
            android.view.View view = a1Var.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/WsFoldTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/WsFoldTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.py pyVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.py();
            pyVar.f251818a = c19807x593d1720.f39018xf3f56116;
            pyVar.f251820c = ((java.lang.Long) nsVar.f251561b0.f465343d.get(0)).longValue();
            java.util.LinkedList linkedList = nsVar.f251561b0.f465343d;
            pyVar.f251821d = ((java.lang.Long) linkedList.get(linkedList.size() - 1)).longValue();
            pyVar.f251819b = nsVar.f251559a0.f69422x861009b5;
            ((java.util.ArrayList) pyVar.f251822e).addAll(nsVar.f251561b0.f465343d);
            a1Var.E0.setTag(pyVar);
            a1Var.E0.setOnClickListener(bsVar.f249576i.f251194i);
            nsVar.U = null;
            nsVar.V = null;
            nsVar.F = false;
            nsVar.D = null;
            nsVar.M = false;
            i19 = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.W(nsVar.f251571j, true, i17);
        }
        g(nsVar, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        return "WsFoldTimeLineItem";
    }
}
