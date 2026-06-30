package dn2;

/* loaded from: classes3.dex */
public final class s0 implements dn2.e {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cf, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r1v3, types: [r45.bv1, com.tencent.mm.protobuf.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(dn2.s0 r9, android.widget.TextView r10, long r11, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 r13, java.lang.String r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.s0.e(dn2.s0, android.widget.TextView, long, com.tencent.mm.plugin.finder.live.view.k0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dn2.e
    public java.lang.Integer a() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dn2.e
    public java.lang.Object b(android.view.View view, dk2.zf zfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object e17;
        java.lang.Object D = zfVar.D();
        r45.pj1 pj1Var = D instanceof r45.pj1 ? (r45.pj1) D : null;
        java.lang.Object[] objArr = pj1Var != null && pj1Var.m75939xb282bd08(5) == 1;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (objArr == true) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cjk);
            textView.setTextSize(1, 12.0f);
            java.lang.Object D2 = zfVar.D();
            r45.pj1 pj1Var2 = D2 instanceof r45.pj1 ? (r45.pj1) D2 : null;
            if (pj1Var2 != null && pj1Var2.m75939xb282bd08(5) == 1) {
                r45.n32 n32Var = (r45.n32) pj1Var2.m75936x14adae67(4);
                r45.y23 y23Var = (r45.y23) pj1Var2.m75936x14adae67(0);
                long m75942xfb822ef2 = y23Var != null ? y23Var.m75942xfb822ef2(0) : 0L;
                if (textView != null && n32Var != null && (e17 = xt2.a0.f538144a.e(textView, m75942xfb822ef2, n32Var, "notification", interfaceC29045xdcb5ca57)) == pz5.a.f440719d) {
                    return e17;
                }
            }
        } else {
            if (pj1Var != null && pj1Var.m75939xb282bd08(5) == 2) {
                java.lang.Object b17 = p3325xe03a0797.p3326xc267989b.k1.b(((zfVar instanceof dk2.y7 ? (dk2.y7) zfVar : null) != null ? r3.f315908b : 0) * 1000, interfaceC29045xdcb5ca57);
                if (b17 == pz5.a.f440719d) {
                    return b17;
                }
            }
        }
        return f0Var;
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        r45.pj1 pj1Var;
        p3325xe03a0797.p3326xc267989b.f1 f1Var;
        yg2.b m57691xa0fa63f9;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.cg7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rbw);
        ((android.widget.TextView) findViewById2).setTextSize(1, 12.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "also(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.l7a);
        ((android.widget.TextView) findViewById3).setTextSize(1, 12.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "also(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f567974l74);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.utk);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
        textView3.setTextSize(1, 14.0f);
        hc2.o.a(textView3, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "also(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.u2w);
        android.widget.TextView textView5 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.lod);
        textView5.setTextSize(1, 10.0f);
        java.lang.Object D = liveMsg.D();
        r45.pj1 pj1Var2 = D instanceof r45.pj1 ? (r45.pj1) D : null;
        if (pj1Var2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on bind ShoppingHotSaleNotificationItem, productInfo = ");
            r45.y23 y23Var = (r45.y23) pj1Var2.m75936x14adae67(0);
            sb6.append(y23Var != null ? y23Var.mo12245xcc313de3() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingHotSaleNotificationItem", sb6.toString());
            r45.y23 y23Var2 = (r45.y23) pj1Var2.m75936x14adae67(0);
            if (y23Var2 == null || (str = y23Var2.m75945x2fec8307(1)) == null) {
                str = "";
            }
            textView2.setText(str);
            if (pj1Var2.m75939xb282bd08(5) == 1) {
                viewGroup.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ct6);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                str2 = "";
                yj0.a.d(findViewById6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView5.setVisibility(8);
                textView.setText(pj1Var2.m75945x2fec8307(1));
                com.p314xaae8f345.mm.ui.fk.a(textView);
                i17 = 2;
            } else {
                str2 = "";
                if (pj1Var2.m75939xb282bd08(5) == 2) {
                    viewGroup.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d3d);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    i17 = 2;
                    yj0.a.d(findViewById6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView5.setVisibility(0);
                    textView5.setText(pj1Var2.m75945x2fec8307(1));
                } else {
                    i17 = 2;
                }
            }
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
            r45.y23 y23Var3 = (r45.y23) pj1Var2.m75936x14adae67(0);
            d1Var.a(((c61.i8) i5Var).Ai((y23Var3 == null || (m75941xfb821914 = y23Var3.m75941xfb821914(i17)) == null) ? null : (java.lang.String) kz5.n0.Z(m75941xfb821914), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f)).c(imageView);
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            r45.y23 y23Var4 = (r45.y23) pj1Var2.m75936x14adae67(0);
            long m75942xfb822ef2 = y23Var4 != null ? y23Var4.m75942xfb822ef2(0) : 0L;
            if (k0Var == null || (m57691xa0fa63f9 = k0Var.m57691xa0fa63f9()) == null) {
                pj1Var = pj1Var2;
                f1Var = null;
            } else {
                pj1Var = pj1Var2;
                f1Var = p3325xe03a0797.p3326xc267989b.l.b(m57691xa0fa63f9, null, null, new dn2.r0(this, textView4, m75942xfb822ef2, k0Var, pj1Var, null), 3, null);
            }
            rootView.setOnClickListener(new dn2.q0(this, pj1Var, k0Var, f1Var, rootView));
            r45.pj1 pj1Var3 = pj1Var;
            f(pj1Var3, false);
            g(ml2.f4.M, pj1Var3, str2);
        }
        return rootView;
    }

    public final void f(r45.pj1 pj1Var, boolean z17) {
        java.lang.String str;
        byte[] bArr;
        r45.nw1 nw1Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.x92 x92Var = new r45.x92();
        r45.y23 y23Var = (r45.y23) pj1Var.m75936x14adae67(0);
        x92Var.set(0, java.lang.Long.valueOf(y23Var != null ? y23Var.m75942xfb822ef2(0) : 0L));
        x92Var.set(1, pj1Var.m75945x2fec8307(7));
        r45.u92 u92Var = new r45.u92();
        u92Var.set(0, java.lang.Integer.valueOf(z17 ? 3 : 2));
        u92Var.set(2, x92Var);
        linkedList.add(u92Var);
        r45.y92 y92Var = new r45.y92();
        y92Var.set(1, db2.t4.f309704a.a(13215));
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        y92Var.set(3, java.lang.Long.valueOf((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0)));
        gk2.e eVar2 = dk2.ef.I;
        y92Var.set(4, java.lang.Long.valueOf(eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f410516m : 0L));
        gk2.e eVar3 = dk2.ef.I;
        y92Var.set(2, (eVar3 == null || (bArr = ((mm2.e1) eVar3.a(mm2.e1.class)).f410518o) == null) ? null : new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length));
        gk2.e eVar4 = dk2.ef.I;
        if (eVar4 == null || (str = ((mm2.e1) eVar4.a(mm2.e1.class)).f410525v) == null) {
            str = "";
        }
        y92Var.set(5, str);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        y92Var.set(6, xy2.c.e(context));
        y92Var.set(7, linkedList);
        y92Var.d().l().K(new dn2.m0(this, z17));
    }

    public final void g(ml2.f4 f4Var, r45.pj1 pj1Var, java.lang.String str) {
        long m75942xfb822ef2;
        java.util.Map map;
        java.lang.Long l17;
        r45.y23 y23Var = (r45.y23) pj1Var.m75936x14adae67(0);
        long m75942xfb822ef22 = y23Var != null ? y23Var.m75942xfb822ef2(0) : 0L;
        r45.n32 n32Var = (r45.n32) pj1Var.m75936x14adae67(4);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        java.lang.String u17 = pm0.v.u(m75942xfb822ef22);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("notice_type", pj1Var.m75939xb282bd08(5));
        if (n32Var != null) {
            mm2.f6 f6Var = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
            if (f6Var != null && (map = f6Var.D1) != null) {
                java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(m75942xfb822ef22));
                if (map2 != null && (l17 = (java.lang.Long) map2.get(java.lang.Integer.valueOf(n32Var.m75939xb282bd08(4)))) != null) {
                    m75942xfb822ef2 = l17.longValue();
                    jSONObject.put("cur_initial_value", m75942xfb822ef2);
                    jSONObject.put("cur_end_value", n32Var.m75942xfb822ef2(3));
                }
            }
            m75942xfb822ef2 = n32Var.m75942xfb822ef2(2);
            jSONObject.put("cur_initial_value", m75942xfb822ef2);
            jSONObject.put("cur_end_value", n32Var.m75942xfb822ef2(3));
        }
        ml2.r0.Dj(r0Var, f4Var, null, u17, null, null, null, 0, 0L, jSONObject, null, null, null, false, str, 7928, null);
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dov;
    }
}
