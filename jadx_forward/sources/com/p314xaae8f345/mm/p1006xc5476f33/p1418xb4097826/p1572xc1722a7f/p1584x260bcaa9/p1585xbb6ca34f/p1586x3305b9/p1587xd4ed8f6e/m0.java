package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class m0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final sp2.c4 f203328e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.k f203329f;

    /* renamed from: g, reason: collision with root package name */
    public final ml2.d f203330g;

    /* renamed from: h, reason: collision with root package name */
    public tp2.f f203331h;

    /* renamed from: i, reason: collision with root package name */
    public r45.qt2 f203332i;

    public m0(sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideEventListener, "outsideEventListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideOperator, "outsideOperator");
        this.f203328e = outsideEventListener;
        this.f203329f = outsideOperator;
        this.f203330g = new ml2.d();
    }

    public static final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var, vp2.e eVar, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, gp2.l0 l0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar) {
        java.util.List list;
        m0Var.getClass();
        eVar.f520448e.remove(i17);
        f2Var.m8155x27702c4(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.z(c1163xf1deaba4, l0Var);
        if (xVar != null && (list = xVar.f203552i) != null) {
            ((java.util.ArrayList) list).add(zVar);
        }
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.postDelayed(zVar, 100L);
        }
        if (eVar.f520448e.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", "feedDataList is empty, notify outer to remove big banner container");
            m0Var.f203329f.o(eVar, eVar.f520447d.f455658d);
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6n;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        int i19;
        vp2.e item = (vp2.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onBindViewHolder holder=");
        sb6.append(holder);
        sb6.append(" position=");
        sb6.append(i17);
        sb6.append(" name=");
        r45.fa2 fa2Var = item.f520447d;
        sb6.append(fa2Var.f455660f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", sb6.toString());
        o(holder);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x(this);
        xVar.f203551h = item.hashCode();
        java.lang.String str2 = fa2Var.f455661g;
        java.lang.String str3 = fa2Var.f455660f;
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ho8);
        if (imageView != null) {
            if (str2 != null) {
                java.lang.String str4 = str2.length() > 0 ? str2 : null;
                if (str4 != null) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.a().c(new mn2.n(str4, null, 2, null), imageView, g1Var.h(mn2.f1.f411498s));
                }
            }
            imageView.setVisibility(str2 == null || str2.length() == 0 ? 8 : 0);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ho6);
        if (textView != null) {
            textView.setText(str3);
            textView.setVisibility(str3 == null || str3.length() == 0 ? 8 : 0);
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.iiz);
        if (p17 != null) {
            if (str2 == null || str2.length() == 0) {
                if (str3 == null || str3.length() == 0) {
                    i19 = 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            i19 = 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1589x46a97710.C14548x1c1bfd34 c14548x1c1bfd34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1589x46a97710.C14548x1c1bfd34) holder.p(com.p314xaae8f345.mm.R.id.hcc);
        java.util.ArrayList arrayList3 = item.f520448e;
        if (c14548x1c1bfd34 == null) {
            c14548x1c1bfd34 = null;
        } else if (arrayList3.size() <= 1) {
            c14548x1c1bfd34.setVisibility(8);
        } else {
            c14548x1c1bfd34.m58435x66520b61(arrayList3.size());
            c14548x1c1bfd34.m58436x7c3da832(0);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.m8s);
        xVar.f203545b = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) p18;
        h0Var.f391656d = p18;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        up2.c cVar2 = new up2.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14538xec582716((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, false, false, 0, this.f203329f), arrayList3);
        cVar2.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.b0(item, this);
        cVar2.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.d0(item, this, h0Var, xVar);
        h0Var2.f391656d = cVar2;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) h0Var.f391656d;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(cVar2);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) h0Var.f391656d;
        if (c22849x81a93d253 != null) {
            c22849x81a93d253.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(1, 0));
        }
        if (((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) h0Var.f391656d).m7950x883dc776() == 0 && (c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) h0Var.f391656d) != null) {
            c22849x81a93d25.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w(com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.e0(this, c14548x1c1bfd34);
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) h0Var.f391656d).i(e0Var);
        xVar.f203546c = e0Var;
        xVar.f203547d.b((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) h0Var.f391656d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.f0(item, xVar, h0Var, h0Var2, this);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[AutoPlayCheck] ADD caller=");
        sb7.append(f0Var);
        sb7.append(", item.hashCode=");
        sb7.append(item.hashCode());
        sb7.append(", size before=");
        sp2.c4 c4Var = this.f203328e;
        sb7.append(((java.util.ArrayList) c4Var.f492530a).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", sb7.toString());
        ((java.util.ArrayList) c4Var.f492530a).add(f0Var);
        xVar.f203548e = f0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) h0Var.f391656d;
        mn0.d0 d0Var = mn0.d0.f411247m;
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
            str = "";
        }
        gp2.l0 l0Var = new gp2.l0(context, c1163xf1deaba4, arrayList3, false, 0, true, false, true, null, d0Var, 6, str, 0, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.h0(item, h0Var2, xVar, h0Var, holder, this), 28928, null);
        l0Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.i0(this);
        xVar.f203549f = l0Var;
        l0Var.e(new hp2.h(arrayList3));
        gp2.l0 l0Var2 = xVar.f203549f;
        if (l0Var2 != null) {
            l0Var2.H(item.f520449f);
        }
        gp2.l0 l0Var3 = xVar.f203549f;
        if (l0Var3 != null) {
            l0Var3.g();
        }
        xVar.f203550g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a0(holder, xVar, this);
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(xVar.f203550g);
        }
        java.lang.Object element = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
        p3325xe03a0797.p3326xc267989b.l.d(xVar.f203544a, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l0(item, (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) element, this, null), 3, null);
        holder.f374657h = xVar;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "live_square_hotdot_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 26236);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f203331h = new tp2.f(V6, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, null, 0, this.f203329f);
        this.f203332i = V6;
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = true;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) holder.p(com.p314xaae8f345.mm.R.id.m8s);
        if (c22849x81a93d25 != null) {
            in5.o.b(c22849x81a93d25, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j0(holder, this), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k0.f203284d);
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", "#onViewRecycled holder=" + holder);
        o(holder);
    }

    public final void o(in5.s0 s0Var) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        java.lang.Object obj = s0Var.f374657h;
        if (obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x) obj;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = xVar.f203545b;
            if (c22849x81a93d252 != null) {
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                c22849x81a93d252.mo7960x6cab2c8d(new up2.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14538xec582716((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, false, false, 0, this.f203329f), new java.util.ArrayList()));
            }
            p3325xe03a0797.p3326xc267989b.z0.e(xVar.f203544a, null, 1, null);
            sp2.b4 b4Var = xVar.f203548e;
            if (b4Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
                sb6.append(b4Var);
                sb6.append(", item.hashCode=");
                sb6.append(xVar.f203551h);
                sb6.append(", size before=");
                sp2.c4 c4Var = this.f203328e;
                sb6.append(((java.util.ArrayList) c4Var.f492530a).size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", sb6.toString());
                ((java.util.ArrayList) c4Var.f492530a).remove(b4Var);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = xVar.f203546c;
            if (w2Var != null && (c22849x81a93d25 = xVar.f203545b) != null) {
                c22849x81a93d25.V0(w2Var);
            }
            xVar.f203547d.b(null);
            java.util.List<java.lang.Runnable> list = xVar.f203552i;
            for (java.lang.Runnable runnable : list) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = xVar.f203545b;
                if (c22849x81a93d253 != null) {
                    c22849x81a93d253.removeCallbacks(runnable);
                }
            }
            ((java.util.ArrayList) list).clear();
            gp2.l0 l0Var = xVar.f203549f;
            if (l0Var != null) {
                l0Var.o();
            }
            xVar.f203549f = null;
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = xVar.f203550g;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f374657h = null;
    }
}
