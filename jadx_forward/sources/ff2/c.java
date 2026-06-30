package ff2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ff2.c f343171a = new ff2.c();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1 a(int i17) {
        java.util.List i18 = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 6 ? kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#B19696", "#FFF2F2", "#966D6D") : kz5.c0.i("#DE7E6C", "#FFC7BA", "#B84836");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i18, 10));
        java.util.Iterator it = i18.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it.next())));
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1(kz5.n0.R0(arrayList), new float[]{0.0f, 0.6f, 1.0f});
    }

    public final void b(java.util.List pageItems, android.view.ViewGroup parent, boolean z17, yz5.a aVar) {
        java.lang.String m75945x2fec8307;
        r45.dg1 dg1Var;
        java.lang.String string;
        r45.e02 e02Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageItems, "pageItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        parent.removeAllViews();
        java.util.Iterator it = pageItems.iterator();
        while (it.hasNext()) {
            r45.fg1 fg1Var = (r45.fg1) it.next();
            int m75939xb282bd08 = fg1Var.m75939xb282bd08(0);
            int i17 = com.p314xaae8f345.mm.R.id.scx;
            int i18 = com.p314xaae8f345.mm.R.id.scw;
            int i19 = com.p314xaae8f345.mm.R.id.scz;
            int i27 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570367e82;
            ff2.c cVar = f343171a;
            if (m75939xb282bd08 == 1) {
                r45.d02 d02Var = (r45.d02) fg1Var.m75936x14adae67(1);
                java.util.LinkedList m75941xfb821914 = (d02Var == null || (e02Var = (r45.e02) d02Var.m75936x14adae67(0)) == null) ? null : e02Var.m75941xfb821914(0);
                if (m75941xfb821914 != null) {
                    boolean z18 = !z17 && m75941xfb821914.size() > 1;
                    java.util.Iterator it6 = m75941xfb821914.iterator();
                    while (it6.hasNext()) {
                        r45.c02 c02Var = (r45.c02) it6.next();
                        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(i27, parent, false);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(i19);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(i18);
                        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(i17);
                        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.scy);
                        if (z18) {
                            java.lang.String string2 = parent.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nnv);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            string = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(m75941xfb821914.size())}, 1));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "format(...)");
                        } else {
                            string = parent.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nnw);
                        }
                        textView.setText(string);
                        textView2.setText(c02Var.m75945x2fec8307(1));
                        textView3.setText(parent.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nnu));
                        textView3.setVisibility(z18 ? 0 : 8);
                        int i28 = z18 ? 0 : 8;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(i28));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/util/FinderLiveAnchorMilestoneUIUtil", "insertMilestoneCards", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveAnchorClosePageItem;Landroid/view/ViewGroup;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/util/FinderLiveAnchorMilestoneUIUtil", "insertMilestoneCards", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveAnchorClosePageItem;Landroid/view/ViewGroup;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setTextColor(parent.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5));
                        textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(cVar.a(c02Var.m75939xb282bd08(0)), textView));
                        textView2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(cVar.a(c02Var.m75939xb282bd08(0)), textView2));
                        parent.addView(inflate);
                        if (z18) {
                            textView3.setOnClickListener(new ff2.b(aVar));
                            break;
                        }
                        i17 = com.p314xaae8f345.mm.R.id.scx;
                        i18 = com.p314xaae8f345.mm.R.id.scw;
                        i19 = com.p314xaae8f345.mm.R.id.scz;
                        i27 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570367e82;
                    }
                }
            } else if (m75939xb282bd08 == 2) {
                r45.hw1 hw1Var = (r45.hw1) fg1Var.m75936x14adae67(2);
                if (hw1Var != null && (m75945x2fec8307 = hw1Var.m75945x2fec8307(0)) != null) {
                    android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570367e82, parent, false);
                    android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.scz);
                    android.widget.TextView textView5 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.scw);
                    textView4.setText(parent.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nnt));
                    textView5.setText(m75945x2fec8307);
                    textView4.setTextColor(parent.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5));
                    textView4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(cVar.a(3), textView4));
                    textView5.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(cVar.a(3), textView5));
                    parent.addView(inflate2);
                }
            } else if (m75939xb282bd08 == 3 && (dg1Var = (r45.dg1) fg1Var.m75936x14adae67(3)) != null && dg1Var.m75945x2fec8307(0) != null && dg1Var.m75945x2fec8307(1) != null) {
                android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570367e82, parent, false);
                android.widget.TextView textView6 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.scz);
                android.widget.TextView textView7 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.scw);
                android.widget.TextView textView8 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.scx);
                textView6.setText(dg1Var.m75945x2fec8307(0));
                textView7.setText(dg1Var.m75945x2fec8307(1));
                java.lang.String m75945x2fec83072 = dg1Var.m75945x2fec8307(2);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                textView8.setText(m75945x2fec83072);
                textView8.setVisibility(dg1Var.m75945x2fec8307(2) == null ? 8 : 0);
                if (dg1Var.m75933x41a8a7f2(3)) {
                    textView7.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(cVar.a(3), textView7));
                }
                if (dg1Var.m75939xb282bd08(4) == 2) {
                    qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
                    android.content.Context context = parent.getContext();
                    ((pg0.s3) h0Var).getClass();
                    textView7.setTypeface(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(context, 4));
                }
                parent.addView(inflate3);
            }
        }
    }
}
