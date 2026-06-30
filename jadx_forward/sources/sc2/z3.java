package sc2;

/* loaded from: classes2.dex */
public class z3 extends ad2.h {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f487945z = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487946w = "Finder.FeedJumperCombinationLayoutObserver";

    /* renamed from: x, reason: collision with root package name */
    public final java.util.Map f487947x = new java.util.LinkedHashMap();

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f487948y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());

    public final void G(long j17, int i17) {
        f487945z.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487946w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        boolean z17;
        java.lang.Object obj;
        r45.v50 v50Var;
        ad2.h hVar;
        ad2.h hVar2;
        ?? r202;
        r45.wf6 wf6Var;
        r45.wf6 wf6Var2;
        r45.wf6 wf6Var3;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (!o(holder, c19786x6a1e2862)) {
            D(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487946w, "[onBindView] priority not ok");
            return;
        }
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator it = m76521x7528c3fb.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).m75939xb282bd08(2) == 15) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var4 = (r45.wf6) obj;
        if (wf6Var4 == null || (v50Var = (r45.v50) wf6Var4.m75936x14adae67(24)) == null) {
            return;
        }
        java.util.LinkedList m75941xfb821914 = v50Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getStyle(...)");
        java.util.Iterator it6 = m75941xfb821914.iterator();
        ad2.h hVar3 = null;
        while (it6.hasNext()) {
            ad2.h hVar4 = (ad2.h) ((java.util.LinkedHashMap) this.f487947x).get(java.lang.Integer.valueOf(((r45.wf6) it6.next()).m75939xb282bd08(2)));
            if (hVar3 != null) {
                hVar3.f84686q = hVar4;
            }
            if (hVar4 == null || (view = hVar4.f84676d) == null) {
                hVar = hVar4;
                hVar2 = hVar3;
                r202 = z17;
            } else {
                hVar = hVar4;
                hVar2 = hVar3;
                boolean z18 = z17;
                hVar4.q(feed, holder, view, infoEx, source);
                r202 = z18;
                if (view.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams) {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 8388691;
                    view.setLayoutParams(layoutParams2);
                    r202 = z18;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : -1L;
            java.lang.Object obj2 = f487945z.get(java.lang.Long.valueOf(mo2128x1ed62e84));
            int i17 = -1;
            java.lang.Object obj3 = obj2;
            if (obj2 == null) {
                obj3 = -1;
            }
            int intValue = ((java.lang.Number) obj3).intValue();
            if (intValue == -1 && hVar2 == null) {
                android.view.View view2 = hVar != null ? hVar.f84676d : null;
                if (view2 == null) {
                    z17 = r202;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf((int) r202));
                    java.util.Collections.reverse(arrayList);
                    android.view.View view3 = view2;
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z17 = r202;
                    view2.setVisibility(((java.lang.Integer) arrayList.get(z17 ? 1 : 0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (hVar != null && (wf6Var3 = hVar.f84682m) != null) {
                    i17 = wf6Var3.m75939xb282bd08(2);
                }
                G(mo2128x1ed62e84, i17);
            } else {
                z17 = r202;
                if (intValue != -1) {
                    if ((hVar == null || (wf6Var2 = hVar.f84682m) == null || wf6Var2.m75939xb282bd08(2) != intValue) ? z17 ? 1 : 0 : true) {
                        android.view.View view4 = hVar != null ? hVar.f84676d : null;
                        if (view4 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(java.lang.Integer.valueOf(z17 ? 1 : 0));
                            java.util.Collections.reverse(arrayList2);
                            android.view.View view5 = view4;
                            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((java.lang.Integer) arrayList2.get(z17 ? 1 : 0)).intValue());
                            yj0.a.f(view5, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        G(mo2128x1ed62e84, (hVar == null || (wf6Var = hVar.f84682m) == null) ? -1 : wf6Var.m75939xb282bd08(2));
                    }
                }
                android.view.View view6 = hVar != null ? hVar.f84676d : null;
                if (view6 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    android.view.View view7 = view6;
                    yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList3.get(z17 ? 1 : 0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            hVar3 = hVar;
        }
        gs2.c.f356605a.e(holder, jumpView, j(c19786x6a1e2862), z17);
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        xc2.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
        long j17 = -1;
        java.lang.Object obj = f487945z.get(java.lang.Long.valueOf(abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.mo2128x1ed62e84() : -1L));
        if (obj == null) {
            obj = -1;
        }
        ad2.h hVar = (ad2.h) ((java.util.LinkedHashMap) this.f487947x).get(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()));
        ad2.h hVar2 = hVar != null ? hVar.f84686q : null;
        if (hVar != null && (p0Var = hVar.f84680h) != null && (abstractC14490x69736cb5 = p0Var.f534777f) != null) {
            j17 = abstractC14490x69736cb5.mo2128x1ed62e84();
        }
        long j18 = j17;
        if (hVar2 != null) {
            r45.wf6 wf6Var = hVar2.f84682m;
            int m75939xb282bd08 = wf6Var != null ? wf6Var.m75939xb282bd08(11) : 0;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f487948y;
            n3Var.mo50302x6b17ad39(null);
            n3Var.mo50297x7c4d7ca2(new sc2.y3(hVar, hVar2, this, j18), m75939xb282bd08 * 1000);
        }
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        this.f487948y.mo50302x6b17ad39(null);
    }
}
