package c61;

@j95.b
/* loaded from: classes4.dex */
public final class h9 extends i95.w implements c50.w0, ya2.x1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f120555d = jz5.h.b(new c61.c9(this));

    public final r45.sf6 Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        r45.sf6 sf6Var = new r45.sf6();
        sf6Var.set(0, java.lang.Long.valueOf(jbVar.N.m75942xfb822ef2(3)));
        sf6Var.set(1, jbVar.N.m75934xbce7f2f(7));
        return sf6Var;
    }

    public final boolean Bi(android.view.ViewGroup viewGroup, int i17, java.lang.StringBuilder sb6) {
        int i18;
        int i19;
        int i27;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a9r);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a9p);
        viewGroup.measure(0, 0);
        n3.t1 t1Var = new n3.t1(viewGroup);
        int i28 = 0;
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            if (view.getVisibility() == 0) {
                int measuredWidth = view.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int b17 = measuredWidth + (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams) : 0);
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                i27 = b17 + (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams2) : 0);
            } else {
                i27 = 0;
            }
            i28 += i27;
        }
        if (i28 <= i17) {
            return false;
        }
        if (imageView2.getVisibility() == 0) {
            imageView2.setVisibility(8);
            sb6.append("#(gone avatar3)");
        }
        viewGroup.measure(0, 0);
        n3.t1 t1Var2 = new n3.t1(viewGroup);
        int i29 = 0;
        while (t1Var2.hasNext()) {
            android.view.View view2 = (android.view.View) t1Var2.next();
            if (view2.getVisibility() == 0) {
                int measuredWidth2 = view2.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                int b18 = measuredWidth2 + (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams3) : 0);
                android.view.ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                i19 = b18 + (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams4) : 0);
            } else {
                i19 = 0;
            }
            i29 += i19;
        }
        if (i29 <= i17) {
            return false;
        }
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(8);
            sb6.append("#(gone avatar2)");
        }
        viewGroup.measure(0, 0);
        n3.t1 t1Var3 = new n3.t1(viewGroup);
        int i37 = 0;
        while (t1Var3.hasNext()) {
            android.view.View view3 = (android.view.View) t1Var3.next();
            if (view3.getVisibility() == 0) {
                int measuredWidth3 = view3.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                int b19 = measuredWidth3 + (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams5) : 0);
                android.view.ViewGroup.LayoutParams layoutParams6 = view3.getLayoutParams();
                i18 = b19 + (layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams6) : 0);
            } else {
                i18 = 0;
            }
            i37 += i18;
        }
        return i37 > i17;
    }

    public final boolean Di(android.view.ViewGroup viewGroup, int i17, boolean z17, java.lang.CharSequence charSequence, java.lang.StringBuilder sb6) {
        int i18;
        int i19;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.gss);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a8o);
        n3.t1 t1Var = new n3.t1(viewGroup);
        int i27 = 0;
        while (true) {
            if (!t1Var.hasNext()) {
                break;
            }
            android.view.View view = (android.view.View) t1Var.next();
            if ((view.getId() != com.p314xaae8f345.mm.R.id.a8o) && view.getVisibility() == 0) {
                int measuredWidth = view.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int b17 = measuredWidth + (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams) : 0);
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                i19 = b17 + (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams2) : 0);
            } else {
                i19 = 0;
            }
            i27 += i19;
        }
        int i28 = i17 - i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        android.view.ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
        int c17 = i28 - (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams3) : 0);
        android.view.ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
        int b18 = c17 - (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams4) : 0);
        if (b18 > 0) {
            textView2.setMaxWidth(b18);
            viewGroup.measure(0, 0);
            int ellipsisCount = textView2.getLayout().getEllipsisCount(0);
            int ellipsisStart = textView2.getLayout().getEllipsisStart(0);
            sb6.append("#(省略到【XX···】)");
            if (ellipsisCount > 0) {
                int dimension = (int) textView2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
                android.view.ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((android.widget.LinearLayout.LayoutParams) layoutParams5).rightMargin = -dimension;
            }
            if (ellipsisCount > 0 && ellipsisStart < 2) {
                if (z17) {
                    sb6.append("#(去掉昵称)");
                    textView2.setVisibility(8);
                } else {
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        sb6.append("#(去掉昵称换成" + ((java.lang.Object) charSequence) + ')');
                        android.view.ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        ((android.widget.LinearLayout.LayoutParams) layoutParams6).rightMargin = 0;
                        textView2.setMaxWidth(b18);
                        textView2.setText(charSequence);
                        android.view.ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        ((android.widget.LinearLayout.LayoutParams) layoutParams7).rightMargin = 0;
                        viewGroup.measure(0, 0);
                        if (textView2.getLayout().getEllipsisCount(0) > 0) {
                            return true;
                        }
                    }
                }
            }
        } else if (z17) {
            sb6.append("#(去掉昵称)");
            textView2.setVisibility(8);
        }
        viewGroup.measure(0, 0);
        n3.t1 t1Var2 = new n3.t1(viewGroup);
        int i29 = 0;
        while (t1Var2.hasNext()) {
            android.view.View view2 = (android.view.View) t1Var2.next();
            if (view2.getVisibility() == 0) {
                int measuredWidth2 = view2.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                int b19 = measuredWidth2 + (layoutParams8 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams8) : 0);
                android.view.ViewGroup.LayoutParams layoutParams9 = view2.getLayoutParams();
                i18 = b19 + (layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams9) : 0);
            } else {
                i18 = 0;
            }
            i29 += i18;
        }
        return i29 > i17;
    }

    public final boolean Ni() {
        if (!aj().m75933x41a8a7f2(7)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209131a7).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final void Ri(android.view.View view, java.lang.StringBuilder sb6) {
        sb6.append("#(兜底 去看+头像+❤️ logo)");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568872oc3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.ocb);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a8o);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9p);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9r);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9t);
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gss)).setVisibility(0);
        imageView.setVisibility(0);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        c22699x3dcdb352.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
    }

    public final void Ui(android.view.View view, java.lang.StringBuilder sb6) {
        sb6.append("#(兜底 去看+头像+的视频️ logo)");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568872oc3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.ocb);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a8o);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9p);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9r);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9t);
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gss)).setVisibility(0);
        imageView.setVisibility(0);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctb));
        c22699x3dcdb352.setVisibility(0);
    }

    public final void Vi(android.view.View view, java.lang.StringBuilder sb6) {
        sb6.append("#(兜底 logo+去看+朋友+❤️ 头像)");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568872oc3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.ocb);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a8o);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9p);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9r);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9t);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gss);
        textView3.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
        imageView.setVisibility(0);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        textView2.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
        textView2.setMaxWidth(Integer.MAX_VALUE);
        textView2.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ct9));
        textView.setVisibility(8);
        c22699x3dcdb352.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams3 = c22699x3dcdb352.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams3).rightMargin = (int) c22699x3dcdb352.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
    }

    public final void Zi(android.view.View view, java.lang.StringBuilder sb6) {
        sb6.append("#(兜底 logo+去看朋友发表 头像>)");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568872oc3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.ocb);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a8o);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9p);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9r);
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9t);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gss);
        textView3.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
        imageView.setVisibility(0);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        textView2.setVisibility(0);
        textView2.setMaxWidth(Integer.MAX_VALUE);
        textView2.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ct8));
        android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams2).rightMargin = (int) textView2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        textView.setVisibility(8);
        c22699x3dcdb352.setVisibility(8);
    }

    public final r45.gl0 aj() {
        return (r45.gl0) ((jz5.n) this.f120555d).mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cl0.g bj(c50.v0 ret) {
        int i17;
        java.lang.CharSequence charSequence;
        int i18;
        android.text.Layout layout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = ret.f120155c;
        if (jbVar == null) {
            return new cl0.g();
        }
        java.util.LinkedList m75941xfb821914 = jbVar.W0().m75941xfb821914(4);
        int m75939xb282bd08 = jbVar.W0().m75939xb282bd08(10);
        int m75939xb282bd082 = jbVar.W0().m75939xb282bd08(9);
        boolean z17 = true;
        java.lang.Object[] objArr = m75939xb282bd08 > 1;
        java.lang.Object[] objArr2 = jbVar.f65874xb5f7102a.f470030r == 13;
        r45.xs2 xs2Var = jbVar.N;
        int m75939xb282bd083 = xs2Var.m75939xb282bd08(9);
        cl0.g gVar = new cl0.g();
        gVar.h("tips_uuid", jbVar.f65874xb5f7102a.f470036x);
        gVar.h("tips_id", jbVar.f65874xb5f7102a.f470023h);
        gVar.o("contenttype", objArr2 != false ? 3 : objArr != false ? 2 : 1);
        gVar.o("friend_like_count", m75939xb282bd08);
        android.view.View view = ret.f120154b;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a8o) : null;
        gVar.o("if_show_less", ((textView == null || (layout = textView.getLayout()) == null) ? 0 : layout.getEllipsisCount(0)) > 0 ? 1 : 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n((java.lang.String) kz5.n0.Z(m75941xfb821914), true);
        gVar.o("if_show_remarks", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17 != null ? n17.w0() : null, textView != null ? textView.getText() : null) ? 1 : 0);
        gVar.o("next_page_type", m75939xb282bd083 != 1 ? m75939xb282bd083 != 6 ? m75939xb282bd083 != 3 ? m75939xb282bd083 != 4 ? 0 : 2 : 4 : 3 : 1);
        gVar.h("next_page_feedid", pm0.v.u(xs2Var.m75942xfb822ef2(3)));
        gVar.o("appear_index", fj());
        java.lang.String m75945x2fec8307 = jbVar.W0().m75945x2fec8307(5);
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) != false) {
            m75945x2fec8307 = jbVar.f65874xb5f7102a.f470032t;
        }
        gVar.h("reportext", m75945x2fec8307);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z18 = view instanceof android.view.ViewGroup;
        android.view.ViewGroup viewGroup = z18 ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            n3.t1 t1Var = new n3.t1(viewGroup);
            while (t1Var.hasNext()) {
                android.view.View view2 = (android.view.View) t1Var.next();
                if (view2.getVisibility() == 0) {
                    if (view2 instanceof android.widget.TextView) {
                        android.widget.TextView textView2 = (android.widget.TextView) view2;
                        if (textView2.getLayout() != null) {
                            java.lang.CharSequence text = textView2.getText();
                            if (!((text == null || text.length() == 0) ? z17 : false)) {
                                int ellipsisCount = textView2.getLayout().getEllipsisCount(0);
                                if (textView2.getText().length() - ellipsisCount >= 0) {
                                    sb6.append(textView2.getText().subSequence(0, textView2.getText().length() - ellipsisCount));
                                }
                                if (ellipsisCount > 0) {
                                    sb6.append((char) 8230);
                                }
                            }
                        }
                    }
                    if (view2.getId() == com.p314xaae8f345.mm.R.id.ocb) {
                        if (m75939xb282bd082 == 1) {
                            sb6.append("火赞");
                        } else {
                            sb6.append("爱心赞");
                        }
                    }
                }
                z17 = true;
            }
        }
        gVar.h("show_content", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        android.view.ViewGroup viewGroup2 = z18 ? (android.view.ViewGroup) view : null;
        if (viewGroup2 != null) {
            n3.t1 t1Var2 = new n3.t1(viewGroup2);
            while (t1Var2.hasNext()) {
                android.view.View view3 = (android.view.View) t1Var2.next();
                if (view3.getVisibility() == 0) {
                    if (view3 instanceof android.widget.TextView) {
                        android.widget.TextView textView3 = (android.widget.TextView) view3;
                        if (textView3.getLayout() != null) {
                            java.lang.CharSequence text2 = textView3.getText();
                            if (!(text2 == null || text2.length() == 0)) {
                                sb7.append(textView3.getText());
                            }
                        }
                    }
                    if (view3.getId() == com.p314xaae8f345.mm.R.id.ocb) {
                        if (m75939xb282bd082 == 1) {
                            sb7.append("火赞");
                        } else {
                            sb7.append("爱心赞");
                        }
                    }
                }
            }
        }
        gVar.h("send_content", sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            sb8.append((java.lang.String) it.next());
            sb8.append("#");
        }
        int H = r26.n0.H(sb8);
        while (true) {
            if (-1 >= H) {
                i17 = 1;
                charSequence = "";
                break;
            }
            if (!(sb8.charAt(H) == '#')) {
                i17 = 1;
                charSequence = sb8.subSequence(0, H + 1);
                break;
            }
            H--;
        }
        gVar.h("show_username", charSequence);
        r45.f03 I0 = jbVar.I0("FinderSnsDeliveryEntrance");
        if (I0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SnsDeliveryBubbleService", "showInfo is null");
        } else {
            switch (I0.f455420d) {
                case 1001:
                    i18 = 2;
                    break;
                case 1002:
                    i18 = 3;
                    break;
                case 1003:
                    i18 = 4;
                    break;
                default:
                    i18 = i17;
                    break;
            }
            gVar.o("show_style", i18);
            gVar.h("finder_context_id", ret.f120156d);
        }
        return gVar;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb cj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderSnsDeliveryEntrance");
        if (!Ni() || L0 == null) {
            return L0;
        }
        bu2.j jVar = bu2.j.f106067a;
        r45.xs2 xs2Var = L0.N;
        if (jVar.h(xs2Var.m75942xfb822ef2(3)) != null) {
            return L0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SnsDeliveryBubbleService", pm0.v.u(xs2Var.m75942xfb822ef2(3)).concat("has not cache."));
        return null;
    }

    public int fj() {
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.I1().r()).intValue() > 0) {
            return 1;
        }
        return aj().m75939xb282bd08(5);
    }

    public final r45.gl0 hj(r45.gl0 gl0Var) {
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_RED_DOT_SNS_DELIVERY_STRING, "");
        if (!(v17 == null || v17.length() == 0)) {
            gl0Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gl0Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EntranceReportConfig", "report_switch=" + gl0Var.m75939xb282bd08(0) + ", report_ts_interval=" + gl0Var.m75939xb282bd08(1) + " sns_delivery_update_n_feed=" + gl0Var.m75939xb282bd08(4) + ", sns_delivery_before_m_feed=" + gl0Var.m75939xb282bd08(5) + ", sns_delivery_disable_cache=" + gl0Var.m75933x41a8a7f2(6) + ", sns_delivery_disable_preload=" + gl0Var.m75933x41a8a7f2(7) + ", sns_delivery_back_page=" + gl0Var.m75939xb282bd08(8));
        return gl0Var;
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItem, "cmdItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "[triggerFetchSnsDeliveryBubbleSync] doSyncEnd");
        hj(aj());
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.getClass();
        ic2.l0.f371871r.add(this);
        pm0.v.X(new c61.g9(this));
    }

    public final android.view.View wi(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        java.lang.String string;
        android.text.SpannableString descriptionSpan;
        android.content.Context context;
        java.lang.String quantityString;
        int i17;
        int i18;
        int i19;
        int i27;
        jz5.f0 f0Var;
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(jbVar.N.m75942xfb822ef2(3));
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SnsDeliveryBubbleService", "feed is null.");
            viewGroup.setVisibility(8);
            return viewGroup;
        }
        android.content.Context context2 = viewGroup.getContext();
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568872oc3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ocb);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a8o);
        android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a9p);
        android.widget.ImageView imageView3 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a9r);
        android.widget.ImageView imageView4 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a9t);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.gss);
        java.util.LinkedList m75941xfb821914 = jbVar.W0().m75941xfb821914(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "usernames=" + m75941xfb821914);
        int m75939xb282bd08 = jbVar.W0().m75939xb282bd08(10);
        boolean z17 = m75939xb282bd08 > 3;
        int i28 = jbVar.f65874xb5f7102a.f470030r;
        boolean z18 = i28 == 13;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "[bindFeedCardView] subtype=" + i28 + " isPostType=" + z18 + " friendLikeCount=" + m75939xb282bd08);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        imageView4.setVisibility(8);
        textView3.setVisibility(8);
        textView2.setVisibility(8);
        c22699x3dcdb352.setVisibility(8);
        viewGroup.setId(com.p314xaae8f345.mm.R.id.ebu);
        java.lang.String str = "";
        mn2.g1 g1Var = mn2.g1.f411508a;
        java.lang.String str2 = null;
        if (i28 == 4 || i28 == 6 || i28 == 2005) {
            textView.setMaxLines(2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var.C, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d())) {
                textView.setText(new android.text.SpannableString(f03Var.f455422f));
            } else {
                if (i28 == 4) {
                    string = context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572873ct4);
                } else if (i28 == 6) {
                    android.content.res.Resources resources = context2.getResources();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    java.lang.String m59273x80025a04 = h17.m59273x80025a04();
                    if (m59273x80025a04 == null) {
                        m59273x80025a04 = "";
                    }
                    objArr[0] = m59273x80025a04;
                    string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572874ct5, objArr);
                } else if (i28 != 2005) {
                    string = "";
                } else {
                    android.content.res.Resources resources2 = context2.getResources();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    java.lang.String m59273x80025a042 = h17.m59273x80025a04();
                    if (m59273x80025a042 == null) {
                        m59273x80025a042 = "";
                    }
                    objArr2[0] = m59273x80025a042;
                    string = resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ct_, objArr2);
                }
                textView.setText(string);
            }
        } else {
            textView.setMaxLines(1);
            textView2.setVisibility(0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = textView2.getContext();
            g92.b bVar = g92.b.f351302e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb821914);
            java.lang.String M6 = g92.a.M6(bVar, (java.lang.String) kz5.n0.Z(m75941xfb821914), "", false, 4, null);
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i29 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context3, M6);
            if (z17) {
                textView2.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ct7, java.lang.Integer.valueOf(m75939xb282bd08)));
                android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((android.widget.LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((android.widget.LinearLayout.LayoutParams) layoutParams2).rightMargin = (int) textView2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                textView2.setText(i29);
            }
            java.util.LinkedList linkedList = f03Var.f455429p;
            int size = m75941xfb821914.size();
            if (3 <= size) {
                size = 3;
            }
            java.util.List subList = linkedList.subList(0, size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
            int i37 = 0;
            for (java.lang.Object obj : kz5.n0.x0(subList)) {
                int i38 = i37 + 1;
                if (i37 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str3 = (java.lang.String) obj;
                if (i37 == 0) {
                    imageView2.setVisibility(0);
                    imageView = imageView2;
                } else if (i37 == 1) {
                    imageView3.setVisibility(0);
                    imageView = imageView3;
                } else if (i37 != 2) {
                    imageView = null;
                } else {
                    imageView4.setVisibility(0);
                    imageView = imageView4;
                }
                if (imageView != null) {
                    g1Var.l().c(new mn2.n(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.W), imageView, g1Var.h(mn2.f1.f411494o));
                }
                i37 = i38;
            }
            if (jbVar.W0().m75939xb282bd08(9) == 1) {
                r45.rl2 b17 = cu2.f0.f303924a.b(1);
                if (b17 != null) {
                    nf.y yVar = nf.x.f418149b;
                    wo0.c b18 = g1Var.e().b(new mn2.q3(yVar != null ? yVar.mo53144x387a9983() : false ? b17.m75945x2fec8307(2) : b17.m75945x2fec8307(1), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411486d));
                    c61.z8 z8Var = new c61.z8(c22699x3dcdb352);
                    b18.getClass();
                    b18.f529406d = z8Var;
                    b18.f();
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79306xd5094e27, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
                }
            } else {
                c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79669xb52d055c, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            }
            c22699x3dcdb352.setContentDescription(c22699x3dcdb352.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvs));
            if (z18) {
                c22699x3dcdb352.setVisibility(8);
                textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cta));
                i17 = 0;
            } else {
                i17 = 0;
                c22699x3dcdb352.setVisibility(0);
                textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctb));
            }
            viewGroup.measure(i17, i17);
            int i39 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
            int paddingEnd = viewGroup.getPaddingEnd() + viewGroup.getPaddingStart();
            android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            int c17 = paddingEnd + (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams3) : 0);
            android.view.ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
            int b19 = i39 - (c17 + (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams4) : 0));
            android.view.ViewParent parent = textView.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            n3.t1 t1Var = new n3.t1((android.view.ViewGroup) parent);
            int i47 = 0;
            while (t1Var.hasNext()) {
                android.view.View view = (android.view.View) t1Var.next();
                if (view.getVisibility() == 0) {
                    int measuredWidth = view.getMeasuredWidth();
                    android.view.ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                    int b27 = measuredWidth + (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams5) : 0);
                    android.view.ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                    i27 = (layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams6) : 0) + b27;
                } else {
                    i27 = 0;
                }
                i47 += i27;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (i47 > b19) {
                if (z18) {
                    textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctb));
                    viewGroup.measure(0, 0);
                    android.view.ViewParent parent2 = textView.getParent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    n3.t1 t1Var2 = new n3.t1((android.view.ViewGroup) parent2);
                    int i48 = 0;
                    while (t1Var2.hasNext()) {
                        android.view.View view2 = (android.view.View) t1Var2.next();
                        if (view2.getVisibility() == 0) {
                            int measuredWidth2 = view2.getMeasuredWidth();
                            android.view.ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
                            int b28 = measuredWidth2 + (layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams7) : 0);
                            android.view.ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                            i19 = (layoutParams8 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams8) : 0) + b28;
                        } else {
                            i19 = 0;
                        }
                        i48 += i19;
                    }
                    if (i48 > b19) {
                        android.view.ViewParent parent3 = textView.getParent();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
                        Di((android.view.ViewGroup) parent3, b19, true, null, sb6);
                    }
                } else {
                    textView.setVisibility(8);
                    viewGroup.measure(0, 0);
                    android.view.ViewParent parent4 = textView.getParent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent4, "null cannot be cast to non-null type android.view.ViewGroup");
                    n3.t1 t1Var3 = new n3.t1((android.view.ViewGroup) parent4);
                    int i49 = 0;
                    while (t1Var3.hasNext()) {
                        android.view.View view3 = (android.view.View) t1Var3.next();
                        if (view3.getVisibility() == 0) {
                            int measuredWidth3 = view3.getMeasuredWidth();
                            android.view.ViewGroup.LayoutParams layoutParams9 = view3.getLayoutParams();
                            int b29 = measuredWidth3 + (layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.b((android.view.ViewGroup.MarginLayoutParams) layoutParams9) : 0);
                            android.view.ViewGroup.LayoutParams layoutParams10 = view3.getLayoutParams();
                            i18 = (layoutParams10 instanceof android.view.ViewGroup.MarginLayoutParams ? n3.u.c((android.view.ViewGroup.MarginLayoutParams) layoutParams10) : 0) + b29;
                        } else {
                            i18 = 0;
                        }
                        i49 += i18;
                    }
                    if (i49 > b19) {
                        android.view.ViewParent parent5 = textView.getParent();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent5, "null cannot be cast to non-null type android.view.ViewGroup");
                        Di((android.view.ViewGroup) parent5, b19, true, null, sb6);
                    }
                }
            }
        }
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.dz7);
        android.widget.TextView textView4 = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.dzh) : null;
        android.widget.ImageView imageView5 = findViewById != null ? (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.dzd) : null;
        android.widget.ImageView imageView6 = findViewById != null ? (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f565885e01) : null;
        int m75939xb282bd082 = jbVar.N.m75939xb282bd08(9);
        if (imageView6 != null) {
            imageView6.setVisibility(0);
        }
        int b37 = m75939xb282bd082 == 6 ? 25 : hc2.d0.b(m75939xb282bd082);
        android.text.SpannableString flowCardDescSpan = h17.getFlowCardDescSpan();
        if (!(!(flowCardDescSpan == null || flowCardDescSpan.length() == 0) && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.a3(b37)) ? (descriptionSpan = h17.getDescriptionSpan()) != null : (descriptionSpan = h17.getFlowCardDescSpan()) != null) {
            str2 = descriptionSpan.toString();
        }
        if (str2 == null || str2.length() == 0) {
            android.content.res.Resources resources3 = context2.getResources();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            long m59221x3fdd41df = h17.m59221x3fdd41df() * 1000;
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
            if (m59221x3fdd41df >= 3600000) {
                long timeInMillis = gregorianCalendar.getTimeInMillis() - m59221x3fdd41df;
                long j17 = timeInMillis / 3600000;
                if (j17 == 0) {
                    int i57 = (int) (timeInMillis / 60000);
                    if (i57 < 1) {
                        i57 = 1;
                    }
                    java.lang.String quantityString2 = context2.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571207k, i57, java.lang.Integer.valueOf(i57));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quantityString2, "getQuantityString(...)");
                    str = quantityString2;
                } else {
                    java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                    long timeInMillis2 = m59221x3fdd41df - gregorianCalendar2.getTimeInMillis();
                    if (timeInMillis2 < 0 || timeInMillis2 >= 86400000) {
                        long timeInMillis3 = (m59221x3fdd41df - gregorianCalendar2.getTimeInMillis()) + 86400000;
                        if (timeInMillis3 <= 0 || timeInMillis3 > 86400000) {
                            context = context2;
                            int timeInMillis4 = (int) (((gregorianCalendar2.getTimeInMillis() + 86400000) - m59221x3fdd41df) / 86400000);
                            if (timeInMillis4 < 1) {
                                timeInMillis4 = 1;
                            }
                            quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571208l, timeInMillis4, java.lang.Integer.valueOf(timeInMillis4));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quantityString, "getQuantityString(...)");
                        } else {
                            context = context2;
                            quantityString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quantityString, "getString(...)");
                        }
                        str = quantityString;
                        objArr3[0] = str;
                        str2 = resources3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ct6, objArr3);
                    } else {
                        int i58 = (int) j17;
                        if (i58 < 1) {
                            i58 = 1;
                        }
                        java.lang.String quantityString3 = context2.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571206j, i58, java.lang.Integer.valueOf(i58));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quantityString3, "getQuantityString(...)");
                        str = quantityString3;
                    }
                }
            }
            context = context2;
            objArr3[0] = str;
            str2 = resources3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ct6, objArr3);
        } else {
            context = context2;
        }
        java.lang.String v17 = r26.i0.v(str2, "\n", " ", false, 4, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("  ");
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7);
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq);
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79740x3d5c86da, color);
        e17.setBounds(0, 0, dimension, dimension);
        spannableStringBuilder.setSpan(new al5.w(e17, 1), 0, 1, 17);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        spannableStringBuilder.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, v17));
        if (textView4 != null) {
            textView4.setText(spannableStringBuilder);
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(h17.m59264x7efe73ec());
        if (imageView5 != null) {
            float dimension2 = imageView5.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561986yc);
            if (mb4Var.m75938x746dc8a6(5) > mb4Var.m75938x746dc8a6(4)) {
                imageView5.getLayoutParams().height = (int) dimension2;
                imageView5.getLayoutParams().width = (int) ((dimension2 / 4) * 3);
            } else {
                imageView5.getLayoutParams().width = (int) dimension2;
                imageView5.getLayoutParams().height = (int) ((dimension2 / 4) * 3);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(41))) {
                g1Var.e().c(new mn2.f4(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), imageView5, g1Var.h(mn2.f1.B));
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16))) {
                g1Var.e().c(new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView5, g1Var.h(mn2.f1.B));
            } else {
                g1Var.e().c(new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), imageView5, g1Var.h(mn2.f1.B));
            }
        }
        return viewGroup;
    }
}
