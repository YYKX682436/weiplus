package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class jb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id {
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(android.content.Context context, boolean z17) {
        super(context, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13762xdda189a7(this), this.f188540m, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void e(android.content.Context context, android.widget.FrameLayout headerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        cq.k1.a();
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.k1().r()).booleanValue()) {
            android.view.View findViewById = headerLayout.findViewById(com.p314xaae8f345.mm.R.id.d4y);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = headerLayout.findViewById(com.p314xaae8f345.mm.R.id.d4y);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        headerLayout.findViewById(com.p314xaae8f345.mm.R.id.d4y).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fb(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void g(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    /* renamed from: getScene */
    public int mo56041x7520bed6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public void h(yw2.n builder, final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.LinkedList linkedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        super.h(builder, c14994x9b99c079, gVar, linkedList);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5438xd818d525> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5438xd818d525>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$onAttach$1
            {
                this.f39173x3fe91575 = -213301995;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5438xd818d525 c5438xd818d525) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5438xd818d525 event = c5438xd818d525;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.this;
                if (c14994x9b99c0792 == null) {
                    return true;
                }
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ib(this, c14994x9b99c0792));
                return true;
            }
        };
        this.I = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        bu2.d dVar = bu2.g.f106041b;
        dVar.a().getClass();
        dVar.a().a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id
    public in5.s l() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13762xdda189a7(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id
    public void o() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        yw2.n nVar = this.f188543p;
        if (nVar != null) {
            android.widget.TextView h17 = nVar.h();
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.l6 l6Var = new zy2.l6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f188536f;
            l6Var.f558984b = c14994x9b99c079 != null ? c14994x9b99c079.getFeedObject() : null;
            l6Var.f558985c = this.f188546s;
            l6Var.f558987e = this.f188547t;
            int i17 = 0;
            l6Var.f558986d = false;
            cu2.f0 f0Var = cu2.f0.f303924a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = this.f188536f;
            if (c14994x9b99c0792 != null && (feedObject = c14994x9b99c0792.getFeedObject()) != null) {
                i17 = feedObject.m76805x2dd7a70f();
            }
            l6Var.f558983a = f0Var.e(i17);
            ((ht2.y0) s6Var).Ni(h17, l6Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20
    /* renamed from: onDetach */
    public void mo56042x3f5eee52() {
        if (!this.f188550w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        java.util.ArrayList arrayList = this.f188540m;
        java.util.ArrayList<so2.f1> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((so2.f1) obj).f491869d.m75939xb282bd08(4) == 1) {
                arrayList2.add(obj);
            }
        }
        for (so2.f1 f1Var : arrayList2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5545x4ee67671 c5545x4ee67671 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5545x4ee67671();
            java.lang.String m75945x2fec8307 = f1Var.f491869d.m75945x2fec8307(5);
            am.pd pdVar = c5545x4ee67671.f135869g;
            pdVar.f89146a = m75945x2fec8307;
            pdVar.getClass();
            c5545x4ee67671.e();
        }
        super.mo56042x3f5eee52();
        bu2.g.f106041b.a().getClass();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.I;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }
}
