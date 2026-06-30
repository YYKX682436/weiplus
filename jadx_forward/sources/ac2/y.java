package ac2;

/* loaded from: classes2.dex */
public final class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj {

    /* renamed from: r, reason: collision with root package name */
    public final ac2.t f84599r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f84600s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f84601t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f84602u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f84603v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, ac2.t presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f84599r = presenter;
    }

    public final void A(java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) this.f188501d.findViewById(com.p314xaae8f345.mm.R.id.ggm);
        if (str == null || str.length() == 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView == null) {
                return;
            }
            textView.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r11.m59318xcdeb3c4() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r11) {
        /*
            r10 = this;
            r0 = 2131308683(0x7f09308b, float:1.8235628E38)
            com.tencent.mm.ui.MMActivity r1 = r10.f188501d
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto Lc
            return
        Lc:
            r1 = 0
            if (r11 == 0) goto L1d
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.getFeedObject()
            if (r11 == 0) goto L1d
            boolean r11 = r11.m59318xcdeb3c4()
            r2 = 1
            if (r11 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 == 0) goto L67
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f554818a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r11.add(r2)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r3 = r11.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r5 = "showFloatBall"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r11 = r11.get(r1)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0.setVisibility(r11)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r4 = "showFloatBall"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            goto Laf
        L67:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f554818a
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.add(r2)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r3 = r11.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r5 = "showFloatBall"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r11 = r11.get(r1)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0.setVisibility(r11)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback"
            java.lang.String r4 = "showFloatBall"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac2.y.B(com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public final void C() {
        android.view.View view = this.f84600s;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f84601t;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void D(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaTimelineContract", "dramaReq noMore down " + z17);
        if (z17) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(o(), null, 1, null);
        } else {
            o().m82685x96646ed(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void q(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.q(data);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f188501d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ac2.g gVar = (ac2.g) pf5.z.f435481a.a(activity).a(ac2.g.class);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = o().m82555x4905e9fa();
        gVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        gVar.f84559d = recyclerView;
        recyclerView.i(new ac2.a(gVar));
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.f566428ts4);
        if (findViewById != null) {
            findViewById.setOnClickListener(new ac2.v(this));
        }
        o().m82555x4905e9fa().i(new ac2.w(this));
        m56068x4905e9fa().P(new ac2.u(new p3321xbce91901.jvm.p3324x21ffc6bd.e0(), new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), this));
        int dimension = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        int dimension2 = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561212cf);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0x, (android.view.ViewGroup) null);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, dimension2);
        }
        layoutParams.height = dimension2;
        inflate.setMinimumHeight(dimension2);
        inflate.setLayoutParams(layoutParams);
        o().m82690xd3a27e96(true);
        o().m82701x7344efcb(inflate);
        o().m82696x5dd8f4d3(dimension2 - dimension);
        o().m82702xfa5d1e8f(dimension - dimension2);
        o().m82686x6e84640(1.6f);
        o().m82694x51948852(true);
        o().m82685x96646ed(false);
    }

    public final int y() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = o().m82555x4905e9fa().getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        int i17 = -1;
        if (c15415x74224fd8 == null) {
            return -1;
        }
        int w17 = c15415x74224fd8.w();
        int y17 = c15415x74224fd8.y();
        if (w17 <= y17) {
            int i18 = 0;
            while (true) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = o().m82555x4905e9fa().q0(w17, false);
                if (q07 != null) {
                    android.view.View itemView = q07.f3639x46306858;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                    android.graphics.Rect rect = kn5.f.f391340a;
                    itemView.getLocalVisibleRect(rect);
                    if (rect.height() > i18) {
                        i18 = rect.height();
                        i17 = w17;
                    }
                }
                if (w17 == y17) {
                    break;
                }
                w17++;
            }
        }
        return i17;
    }

    public final void z() {
        android.view.View view = this.f84600s;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineContract$ViewCallback", "hideLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
