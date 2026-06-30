package df2;

/* loaded from: classes3.dex */
public final class mz implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f312350d;

    public mz(df2.a00 a00Var) {
        this.f312350d = a00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList m75941xfb821914;
        r45.bb7 bb7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ShopCouponBubbleController$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.a00 a00Var = this.f312350d;
        r45.xb2 xb2Var = (r45.xb2) a00Var.f311183o.mo3195x754a37bb();
        if (xb2Var != null && (m75941xfb821914 = xb2Var.m75941xfb821914(1)) != null) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.W;
            cl0.g gVar = new cl0.g();
            r45.xb2 xb2Var2 = (r45.xb2) a00Var.f311183o.mo3195x754a37bb();
            gVar.h("extra_report_json", (xb2Var2 == null || (bb7Var = (r45.bb7) xb2Var2.m75936x14adae67(0)) == null) ? null : bb7Var.m75945x2fec8307(4));
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, gVar, null, null, null, false, null, 16126, null);
            st2.c cVar = a00Var.f311182n;
            if (cVar != null && !m75941xfb821914.isEmpty()) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0 r0Var2 = (ml2.r0) c18;
                ml2.f4 f4Var2 = ml2.f4.X;
                cl0.g gVar2 = new cl0.g();
                r45.qa5 qa5Var = (r45.qa5) kz5.n0.Z(m75941xfb821914);
                gVar2.h("extra_report_json", qa5Var != null ? qa5Var.m75945x2fec8307(5) : null);
                ml2.r0.Dj(r0Var2, f4Var2, null, null, null, null, null, 0, 0L, gVar2, null, null, null, false, null, 16126, null);
                android.view.View view2 = cVar.f493769a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "show", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveCouponCardListWidget", "show", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r45.qa5 data = (r45.qa5) kz5.n0.X(m75941xfb821914);
                st2.b bVar = new st2.b(cVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14979x1ca33895 c14979x1ca33895 = cVar.f493770b;
                c14979x1ca33895.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
                ((android.widget.TextView) c14979x1ca33895.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(data.m75945x2fec8307(0));
                ((android.widget.TextView) c14979x1ca33895.findViewById(com.p314xaae8f345.mm.R.id.owj)).setText(data.m75945x2fec8307(4));
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) c14979x1ca33895.findViewById(com.p314xaae8f345.mm.R.id.vaq);
                linearLayout.removeAllViews();
                android.widget.TextView textView = (android.widget.TextView) c14979x1ca33895.findViewById(com.p314xaae8f345.mm.R.id.vap);
                java.util.LinkedList<java.lang.String> m75941xfb8219142 = data.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getSub_title(...)");
                for (java.lang.String str : m75941xfb8219142) {
                    android.widget.TextView textView2 = new android.widget.TextView(c14979x1ca33895.getContext());
                    textView2.setText(str);
                    textView2.setTextSize(0, textView.getTextSize());
                    textView2.setTextColor(textView.getTextColors().getDefaultColor());
                    linearLayout.addView(textView2, new android.widget.LinearLayout.LayoutParams(-2, -2));
                }
                ((android.widget.TextView) c14979x1ca33895.findViewById(com.p314xaae8f345.mm.R.id.b2z)).setOnClickListener(new xt2.s3(bVar, data));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ShopCouponBubbleController$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
