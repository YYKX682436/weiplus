package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class li implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si f214138d;

    public li(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar) {
        this.f214138d = siVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.si siVar = this.f214138d;
        r45.qy0 qy0Var = siVar.f214577f;
        if (qy0Var == null || (str = qy0Var.m75945x2fec8307(6)) == null) {
            str = "";
        }
        android.content.Context context = siVar.f214573b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int i17 = nyVar != null ? nyVar.f216913n : 0;
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        long j17 = siVar.f214574c;
        java.lang.String format = java.lang.String.format("t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&commentscene=%s", java.util.Arrays.copyOf(new java.lang.Object[]{58, d17, pm0.v.u(j17), java.lang.Integer.valueOf(i17)}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, siVar.f214575d, i17);
        if (ek6.length() > 0) {
            format = java.lang.String.format(format.concat("&session_buffer=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{ek6}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            format = java.lang.String.format(format.concat("&context_id=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        }
        if (str.length() > 0) {
            format = java.lang.String.format(format.concat("&promotion_id=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
        k74Var.set(2, format);
        c19786x6a1e2862.m76551x3af0573b(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(c19786x6a1e2862), null, null, null, 28, null);
        siVar.dismiss();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(siVar.f214574c));
        lVarArr[1] = new jz5.l("ad_label_option_type", 3);
        java.lang.String m75945x2fec8307 = siVar.f214577f.m75945x2fec8307(4);
        lVarArr[2] = new jz5.l("promotion_buffer", m75945x2fec8307 != null ? m75945x2fec8307 : "");
        ((cy1.a) rVar).Bj("promotion_comment_ad_label_option", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
