package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class sk extends in5.r {

    /* renamed from: i, reason: collision with root package name */
    public static int f186092i = -2;

    /* renamed from: e, reason: collision with root package name */
    public final fs2.b f186093e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f186094f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 f186095g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rk f186096h;

    public sk(fs2.b viewCallBackTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCallBackTag, "viewCallBackTag");
        this.f186093e = viewCallBackTag;
        this.f186096h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rk(this);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b9x;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rk rkVar = this.f186096h;
        recyclerView.V0(rkVar);
        recyclerView.i(rkVar);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.v item = (so2.v) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        f186092i = i17;
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = true;
        }
        if (item.f492176d.m75941xfb821914(0).isEmpty()) {
            return;
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.nwt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) p17;
        android.view.View a17 = this.f186093e.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w.a();
        android.view.View findViewById = a17.findViewById(com.p314xaae8f345.mm.R.id.egh);
        if (findViewById != null) {
            frameLayout.getLayoutParams().height = findViewById.getLayoutParams().height;
            return;
        }
        if (frameLayout.getChildCount() != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39(holder.f374654e);
        r45.xn5 xn5Var = item.f492176d;
        if (xn5Var != null) {
            java.util.LinkedList m75941xfb821914 = xn5Var.m75941xfb821914(0);
            if (m75941xfb821914 != null) {
                r45.r03 r03Var = new r45.r03();
                r03Var.set(0, c15352x8ed10a39.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f6k));
                r03Var.set(1, -1L);
                c15352x8ed10a39.tagClickMap.put(java.lang.Long.valueOf(r03Var.m75942xfb822ef2(1)), 1);
                m75941xfb821914.addFirst(r03Var);
            }
            c15352x8ed10a39.m62426x54e34fa2(xn5Var);
            c15352x8ed10a39.m62411x5aa37cae().removeAllViews();
            ((java.util.ArrayList) c15352x8ed10a39.m62411x5aa37cae().f213021d).clear();
            int size = c15352x8ed10a39.m62410xe172022e().m75941xfb821914(0).size();
            for (int i19 = 0; i19 < size; i19++) {
                java.lang.Object obj = c15352x8ed10a39.m62410xe172022e().m75941xfb821914(0).get(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                r45.r03 r03Var2 = (r45.r03) obj;
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(c15352x8ed10a39.m62407xfb84e958().getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2e, (android.view.ViewGroup) null);
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.frv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                ((android.widget.TextView) findViewById2).setText(r03Var2.m75945x2fec8307(0));
                if (r03Var2.m75942xfb822ef2(1) == -1) {
                    c15352x8ed10a39.c(true, inflate, i19);
                } else {
                    c15352x8ed10a39.c(false, inflate, i19);
                }
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wl(c15352x8ed10a39));
                c15352x8ed10a39.allAddViews.add(inflate);
                c15352x8ed10a39.m62411x5aa37cae().addView(inflate);
            }
            c15352x8ed10a39.b();
        }
        c15352x8ed10a39.m62411x5aa37cae().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ul(c15352x8ed10a39));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w.a();
        c15352x8ed10a39.setId(com.p314xaae8f345.mm.R.id.egh);
        c15352x8ed10a39.setVisibility(4);
        frameLayout.addView(c15352x8ed10a39);
        this.f186095g = c15352x8ed10a39;
        c15352x8ed10a39.setVisibility(0);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
    }

    public final void n(android.view.ViewGroup parent, in5.s0 holder, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recylerView) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recylerView, "recylerView");
        if (this.f186094f) {
            this.f186094f = false;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = holder.p(com.p314xaae8f345.mm.R.id.nwt);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39.f213027w.a();
            android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.egh);
            h0Var2.f391656d = findViewById;
            if (findViewById == null || (obj = h0Var.f391656d) == null || ((android.widget.FrameLayout) obj).getChildCount() != 0) {
                return;
            }
            recylerView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qk(parent, h0Var2, h0Var));
        }
    }
}
