package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class s7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f186061e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186062f;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feedObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        this.f186061e = presenter;
        this.f186062f = feedObj;
    }

    public final void J(in5.s0 s0Var, so2.y0 y0Var) {
        F(s0Var, this.f186062f.getFeedObject(), y0Var);
        s0Var.p(com.p314xaae8f345.mm.R.id.uca).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x6(s0Var, y0Var, this));
    }

    public final void K(android.view.View view, java.lang.String str, so2.y0 y0Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mvi)).setText(str);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.mvf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.mvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y6(findViewById, findViewById2, this, y0Var, i17));
    }

    public final boolean L() {
        return this.f186061e.W() == 2;
    }

    public final void M(so2.y0 y0Var, in5.s0 s0Var, boolean z17) {
        jz5.f0 f0Var;
        r45.xk m60785x37f6d02b = y0Var.f492236d.m60785x37f6d02b();
        if (m60785x37f6d02b != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec8307 = m60785x37f6d02b.m75945x2fec8307(0);
            java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f186061e;
            so2.g0.b(y0Var, context, str, nPresenter.mo56026x8fadefe3(), nPresenter.z0(), "");
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String Z0 = y0Var.f492236d.Z0();
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, Z0, context2, "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        o3Var.Gk(context3, y0Var.f492236d.f68959xf9a02e3e, true, true, 1, z17);
    }

    public final void N(boolean z17, in5.s0 s0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.a_z);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.iht);
        boolean[] zArr = {false};
        p17.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q7(zArr));
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int s17 = s(context, z17, this.f186061e);
        c22699x3dcdb352.setImageResource(z17 ? com.p314xaae8f345.mm.R.raw.f79758xc84e73d5 : com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
        c22699x3dcdb352.m82040x7541828(s17);
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
        p17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r7(s0Var, this, zArr));
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569368d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x06b8, code lost:
    
        if (((r11.b().z0() & 16) != 0) != false) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0719  */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r58, in5.c r59, int r60, int r61, boolean r62, java.util.List r63) {
        /*
            Method dump skipped, instructions count: 3995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
        c15258xcd50c176.m61741xc3b64c0d(4);
        c15258xcd50c176.m61734x50e5c22f(true);
        c15258xcd50c176.f(false, true);
        c15258xcd50c176.m61743x9bd24cae(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.o7(holder, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b c15302x70e49e3b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b) holder.p(com.p314xaae8f345.mm.R.id.rrw);
        if (c15302x70e49e3b != null) {
            c15302x70e49e3b.m62114x5691fb54(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p7(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.p314xaae8f345.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.v2_);
        if (c22699x3dcdb352 != null) {
            java.lang.Object tag = c22699x3dcdb352.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool)) {
                return;
            }
            c22699x3dcdb352.setTag(bool);
            c22699x3dcdb352.post(new d92.a(c22699x3dcdb352));
        }
    }
}
