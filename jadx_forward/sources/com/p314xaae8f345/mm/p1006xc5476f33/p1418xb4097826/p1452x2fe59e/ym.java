package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ym extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 implements ym5.l1 {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f192711u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 f192712v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, android.view.View parent) {
        super(context, 0, i17, false, i18, false, 32, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f192711u = parent;
        tu2.b bVar = new tu2.b();
        bVar.f503666c = true;
        bVar.f503664a = false;
        this.f192712v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f80(context, bVar, i17, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View A() {
        return this.f192711u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public float F() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Pa).mo141623x754a37bb()).r()).floatValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        int a07;
        boolean z17;
        java.lang.String t17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = adapter instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter : null;
        if (c22848x6ddd90cf == null || (a07 = i17 - c22848x6ddd90cf.a0()) < 0 || a07 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - qd2.h.f443300a >= 500) {
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                z17 = true;
            }
            qd2.h.f443300a = currentTimeMillis;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaGridUIContract.ViewCallback", "onItemClick return for fastClick");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, this.f187707d, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            cl0.g gVar = new cl0.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5 d5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) j5Var;
            gVar.h("drama_tab_sessionid", pm0.v.u(d5Var.f189325d.m75942xfb822ef2(2)));
            java.lang.Integer num = d5Var.f189330i;
            gVar.h("drama_rec_reason", num);
            java.lang.String str = d5Var.f189329h;
            gVar.h("drama_type", str);
            gVar.o("ref_commentscene", this.f187708e);
            intent.putExtra("CLIENT_KV_REPORTINFO", gVar.toString());
            hc2.e0.a(intent, 0, null, 3, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
            long j17 = d5Var.f189326e;
            java.lang.Long l17 = d5Var.f189332n;
            i0Var.ak(abstractActivityC21394xb3d2c0cf, intent, j17, l17 != null ? l17.longValue() : 0L, null, d5Var.f189327f, 0L, null, this.f187708e, d5Var.f189333o);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick enterNativeDramaTimeline fixPos=");
            sb6.append(a07);
            sb6.append(" dramaId=");
            long j18 = d5Var.f189326e;
            sb6.append(pm0.v.u(j18));
            sb6.append(" dramaName=");
            sb6.append(d5Var.f189327f);
            sb6.append(" objectId=");
            sb6.append(pm0.v.u(l17 != null ? l17.longValue() : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaGridUIContract.ViewCallback", sb6.toString());
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187707d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            cl0.g gVar2 = new cl0.g();
            gVar2.h("drama_id", pm0.v.u(j18));
            gVar2.h("drama_rec_reason", num);
            gVar2.h("drama_type", str);
            gVar2.h("drama_tab_sessionid", pm0.v.u(d5Var.f189325d.m75942xfb822ef2(2)));
            java.lang.String gVar3 = gVar2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
            java.lang.String t18 = r26.i0.t(gVar3, ",", ";", false);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = this.f187713m.m82555x4905e9fa();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6497x6ec53449 c6497x6ec53449 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6497x6ec53449();
            c6497x6ec53449.f138378d = V6.m75939xb282bd08(5);
            c6497x6ec53449.f138379e = c6497x6ec53449.b("SessionId", V6.m75945x2fec8307(0), true);
            c6497x6ec53449.f138380f = c6497x6ec53449.b("ContextId", V6.m75945x2fec8307(1), true);
            c6497x6ec53449.f138381g = c6497x6ec53449.b("ClickTabContextId", V6.m75945x2fec8307(2), true);
            c6497x6ec53449.f138382h = c6497x6ec53449.b("ClickFeedid", pm0.v.u(mo2128x1ed62e84), true);
            c6497x6ec53449.f138385k = c01.id.c();
            java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(9);
            c6497x6ec53449.f138386l = c6497x6ec53449.b("PageTag", m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", ";", false) : "", true);
            java.lang.String gVar4 = o3Var.kk().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
            c6497x6ec53449.f138389o = c6497x6ec53449.b("ScreenInfo", r26.i0.t(gVar4, ",", ";", false), true);
            if (m82555x4905e9fa != null) {
                java.lang.String jSONArray = o3Var.ck(m82555x4905e9fa).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
                t17 = r26.i0.t(jSONArray, ",", ";", false);
            } else {
                t17 = r26.i0.t("", ",", ";", false);
            }
            c6497x6ec53449.f138383i = c6497x6ec53449.b("AllFeedInfo", t17, true);
            c6497x6ec53449.f138384j = az2.j.f97666r.b(V6.m75939xb282bd08(5));
            c6497x6ec53449.f138387m = c6497x6ec53449.b("SessionBuffer", o3Var.ek(mo2128x1ed62e84, null, V6.m75939xb282bd08(5)), true);
            c6497x6ec53449.f138397w = c6497x6ec53449.b("jump_id", V6.m75945x2fec8307(16), true);
            c6497x6ec53449.f138398x = c6497x6ec53449.b("udf_kv", r26.i0.t(t18, ",", ";", false), true);
            c6497x6ec53449.f138399y = 0L;
            c6497x6ec53449.k();
            o3Var.Zk(c6497x6ec53449);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public boolean Q(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return holder.m8185xcdaf1228() == -7 || holder.m8185xcdaf1228() == -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public boolean R() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public boolean S() {
        return false;
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 q() {
        return this.f192712v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void r(java.util.ArrayList data) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4;
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.r(data);
        o().f374637n = null;
        android.view.View l17 = l(com.p314xaae8f345.mm.R.id.ghf);
        if (l17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(l17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            l17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(l17, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View l18 = l(com.p314xaae8f345.mm.R.id.m6h);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
        if (l18 != null && (layoutParams = l18.getLayoutParams()) != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = com.p314xaae8f345.mm.ui.bl.h(abstractActivityC21394xb3d2c0cf) + com.p314xaae8f345.mm.ui.bl.a(abstractActivityC21394xb3d2c0cf);
            }
        }
        android.view.View l19 = l(com.p314xaae8f345.mm.R.id.nuv);
        if (l19 != null) {
            l19.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f187713m;
        int dimension = (int) this.f192711u.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi);
        int dimension2 = (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        android.view.View inflate = android.view.LayoutInflater.from(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0x, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        c22801x87cbdc00.m82701x7344efcb(inflate);
        c22801x87cbdc00.m82696x5dd8f4d3(dimension - dimension2);
        c22801x87cbdc00.m82702xfa5d1e8f(dimension2 - dimension);
        c22801x87cbdc00.m82686x6e84640(1.7f);
        android.view.View f294968x = c22801x87cbdc00.getF294968x();
        if (f294968x != null && (c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) f294968x.findViewById(com.p314xaae8f345.mm.R.id.m6l)) != null) {
            c22627xa933f8e4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.avk);
        }
        in5.o.b(this.f187713m.m82555x4905e9fa(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xm(this), in5.k.f374612d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wm();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return this.f192712v.d(context);
    }
}
