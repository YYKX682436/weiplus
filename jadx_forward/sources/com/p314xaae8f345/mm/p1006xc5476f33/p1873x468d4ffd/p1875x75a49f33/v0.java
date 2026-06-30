package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes5.dex */
public final class v0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f230626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 f230627e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224) {
        this.f230627e = c16540x42192224;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 c18813xaf14a0f9;
        bg0.y yVar;
        bg0.x behaviorHolder;
        int d17;
        bz0.h hVar;
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 c18813xaf14a0f92;
        bg0.y yVar2;
        bg0.x behaviorHolder2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224 = this.f230627e;
        if (i17 != 0) {
            if (i17 == 1) {
                this.f230626d = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e eVar = c16540x42192224.f230449o;
                if (eVar != null) {
                    boolean z17 = c16540x42192224.a() > c16540x42192224.f230441d;
                    kp4.p0 p0Var = (kp4.p0) eVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "onDown: " + z17);
                    if (z17 && (yVar2 = (c18813xaf14a0f92 = p0Var.f392664a).f257585g) != null && (behaviorHolder2 = c18813xaf14a0f92.getBehaviorHolder()) != null) {
                        dz0.v vVar = (dz0.v) behaviorHolder2;
                        if (vVar.b(yVar2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "onSegmentClipUpdateReady: stopPlay");
                            com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = vVar.f326568g;
                            p3325xe03a0797.p3326xc267989b.l.d(c11015x5b190a3b.m158345xefc66565(), null, null, new dz0.t(c11015x5b190a3b, null), 3, null);
                        }
                    }
                }
            }
        } else if (this.f230626d) {
            this.f230626d = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e eVar2 = c16540x42192224.f230449o;
            if (eVar2 != null) {
                boolean z18 = c16540x42192224.a() > c16540x42192224.f230441d;
                kp4.p0 p0Var2 = (kp4.p0) eVar2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "onUp: " + z18);
                if (z18 && (yVar = (c18813xaf14a0f9 = p0Var2.f392664a).f257585g) != null && (behaviorHolder = c18813xaf14a0f9.getBehaviorHolder()) != null) {
                    dz0.v vVar2 = (dz0.v) behaviorHolder;
                    if (vVar2.b(yVar) && (d17 = vVar2.d(yVar)) >= 0 && (hVar = bz0.j.f118294l) != null && (list = hVar.f118280d) != null) {
                        if (!(list.indexOf(java.lang.Integer.valueOf(d17)) >= 0)) {
                            list.add(java.lang.Integer.valueOf(d17));
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 c18813xaf14a0f9;
        bg0.y yVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224 = this.f230627e;
            if (c16540x42192224.a() > c16540x42192224.f230441d) {
                int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
                double computeHorizontalScrollOffset = computeHorizontalScrollRange <= 0 ? 0.0d : recyclerView.computeHorizontalScrollOffset() / computeHorizontalScrollRange;
                double d17 = (c16540x42192224.f230445h * computeHorizontalScrollOffset) / 1000;
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16541xda59d1ab c16541xda59d1ab = c16540x42192224.f230452r;
                java.lang.Object obj = null;
                if (c16541xda59d1ab != null) {
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = c16541xda59d1ab.f230461d;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    c16541xda59d1ab.setVisibility(0);
                    double pow = java.lang.Math.pow(10.0d, 1);
                    java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(java.lang.Math.rint(d17 * pow) / pow)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    java.lang.String string = c16541xda59d1ab.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ief);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    java.lang.String format2 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{format}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                    android.widget.TextView textView = c16541xda59d1ab.f230464g;
                    if (textView != null) {
                        textView.setText(format2);
                    }
                    c16541xda59d1ab.f230461d = p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(c16541xda59d1ab), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f1(c16541xda59d1ab, null), 3, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e eVar = c16540x42192224.f230449o;
                if (eVar != null && (yVar = (c18813xaf14a0f9 = ((kp4.p0) eVar).f392664a).f257585g) != null) {
                    yVar.f101403f = yVar.f101401d * computeHorizontalScrollOffset;
                    bg0.x behaviorHolder = c18813xaf14a0f9.getBehaviorHolder();
                    if (behaviorHolder != null) {
                        dz0.v vVar = (dz0.v) behaviorHolder;
                        if (vVar.b(yVar)) {
                            java.util.Iterator it = vVar.f326564c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a) next).f129698a, yVar.f101398a)) {
                                    obj = next;
                                    break;
                                }
                            }
                            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a aVar = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.a) obj;
                            if (aVar != null) {
                                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33967x6fa736dc = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc((long) yVar.f101403f);
                                az0.n7 n7Var = vVar.f326568g.f151316d;
                                if (n7Var != null) {
                                    java.lang.String str = aVar.f129698a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getId(...)");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m33967x6fa736dc);
                                    n7Var.f97275a.m33448xfb229e1c(str, m33967x6fa736dc);
                                }
                            }
                        }
                    }
                }
                c16540x42192224.m66924x3b08e79f().put(c16540x42192224.f230443f, java.lang.Double.valueOf(c16540x42192224.f230445h * computeHorizontalScrollOffset));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
