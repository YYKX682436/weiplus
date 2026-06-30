package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class i70 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l70 f216244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f216245c;

    public i70(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l70 l70Var, java.util.List list) {
        this.f216243a = s0Var;
        this.f216244b = l70Var;
        this.f216245c = list;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sr
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr optionItem, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionItem, "optionItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        in5.s0 s0Var = this.f216243a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = abstractC14490x69736cb5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? abstractC14490x69736cb5 : null;
        if (abstractC14490x69736cb52 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSubtitleSettingUIC", "subtitleSettingClick onOptionSelected  item is null");
            return;
        }
        java.lang.String str = optionItem.f214681a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "self_open_subtitle");
        java.util.List list = this.f216245c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l70 l70Var = this.f216244b;
        if (b17) {
            l70Var.U6(s0Var, abstractC14490x69736cb52, false);
            this.f216244b.R6(context, abstractC14490x69736cb52, "view_clk", list.size(), "40000");
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "self_close_subtitle")) {
            l70Var.U6(s0Var, abstractC14490x69736cb52, true);
            this.f216244b.R6(context, abstractC14490x69736cb52, "view_clk", list.size(), "30000");
        }
    }
}
