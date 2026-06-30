package rc2;

/* loaded from: classes2.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.y6 {

    /* renamed from: d, reason: collision with root package name */
    public in5.s0 f475474d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f475475e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f475476f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f475475e = new java.util.ArrayList();
    }

    public static final android.graphics.Rect O6(rc2.f fVar, r45.jl6 jl6Var, android.graphics.Rect rect) {
        fVar.getClass();
        float width = rect.width();
        float height = rect.height();
        android.graphics.Rect rect2 = new android.graphics.Rect(rect.left + ((int) (((java.lang.Number) jl6Var.m75941xfb821914(0).get(0)).floatValue() * width)), rect.top + ((int) (((java.lang.Number) jl6Var.m75941xfb821914(0).get(1)).floatValue() * height)), rect.left + ((int) (((java.lang.Number) jl6Var.m75941xfb821914(0).get(2)).floatValue() * width)), rect.top + ((int) (((java.lang.Number) jl6Var.m75941xfb821914(0).get(3)).floatValue() * height)));
        fVar.U6(rect2, "textBox");
        return rect2;
    }

    public static final void P6(rc2.f fVar, android.view.View view, android.graphics.Rect rect) {
        boolean z17;
        fVar.getClass();
        if (view != null) {
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17) {
                if (!(view instanceof android.view.ViewGroup)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFeedAlphaManagerUIC", "drawRect: view is not ViewGroup, cannot add overlay");
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rect_overlay");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append('_');
                java.util.ArrayList arrayList = (java.util.ArrayList) fVar.f475475e;
                sb6.append(arrayList.size());
                java.lang.String sb7 = sb6.toString();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                rc2.b bVar = new rc2.b(rect, view, viewGroup.getContext());
                bVar.setTag(sb7);
                bVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(bVar);
                bVar.invalidate();
                arrayList.add(sb7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "drawRect: added overlay view with tag " + sb7 + ", total overlays: " + arrayList.size());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q6(android.view.View view, java.util.List list) {
        if ((view instanceof rc2.g) && ((rc2.g) view).getF187838w()) {
            list.add(view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                Q6(childAt, list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R6(android.view.View view, java.util.List list) {
        if ((view instanceof rc2.g) && ((rc2.g) view).getF187839x()) {
            list.add(view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                R6(childAt, list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S6() {
        java.util.ArrayList<android.view.View> arrayList;
        boolean z17;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L9).mo141623x754a37bb()).r()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "dismissAlphaStatus");
            in5.s0 s0Var = this.f475474d;
            if (s0Var == null || (view = s0Var.f3639x46306858) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                Q6(view, arrayList);
            }
            if (arrayList != null) {
                z17 = false;
                for (android.view.View view2 : arrayList) {
                    if (view2 instanceof rc2.g) {
                        if (!(((rc2.g) view2).getF187840y() == 1.0f)) {
                            z17 = true;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "dismissAlphaStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "dismissAlphaStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        ((rc2.g) view2).mo56030x57aaa426(true);
                    }
                }
            } else {
                z17 = false;
            }
            if (z17) {
                W6(false);
            }
        }
    }

    public final android.graphics.Rect T6(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        return new android.graphics.Rect(i17, iArr[1], view.getWidth() + i17, iArr[1] + view.getHeight());
    }

    public final void U6(android.graphics.Rect rect, java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "rect: " + from + ", left: " + rect.left + ", right: " + rect.right + ", top: " + rect.top + ", bottom: " + rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View] */
    public final void V6() {
        java.util.List list = this.f475475e;
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "removeAllDrawRects: no overlays to remove");
            return;
        }
        in5.s0 s0Var = this.f475474d;
        android.view.ViewGroup viewGroup = s0Var != null ? s0Var.f3639x46306858 : null;
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFeedAlphaManagerUIC", "removeAllDrawRects: itemView is null");
            list.clear();
            return;
        }
        if (!(viewGroup instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFeedAlphaManagerUIC", "removeAllDrawRects: itemView is not ViewGroup");
            list.clear();
            return;
        }
        int i17 = 0;
        for (java.lang.String str : kz5.n0.S0(list)) {
            android.view.View findViewWithTag = viewGroup.findViewWithTag(str);
            if (!(findViewWithTag instanceof android.view.View)) {
                findViewWithTag = null;
            }
            if (findViewWithTag != null) {
                viewGroup.removeView(findViewWithTag);
                i17++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "removeAllDrawRects: removed overlay with tag " + str);
            }
        }
        list.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "removeAllDrawRects: removed " + i17 + " overlays");
    }

    public final void W6(boolean z17) {
        in5.s0 s0Var = this.f475474d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null;
        if (abstractC14490x69736cb5 == null) {
            return;
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("is_transparent", java.lang.Integer.valueOf(z17 ? 1 : 0));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
        lVarArr[2] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr[4] = new jz5.l("extra_info", V6 != null ? V6.m75945x2fec8307(11) : null);
        lVarArr[5] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("trigger_lower_half_screen_translucent", null, kz5.c1.k(lVarArr), 1, false);
    }

    public final void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L9).mo141623x754a37bb()).r()).booleanValue()) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f475476f;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f475476f = pf5.e.m158344xbe96bc24(this, null, null, new rc2.e(this, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y6(android.view.View view, int i17) {
        android.view.View view2;
        if (view == null) {
            in5.s0 s0Var = this.f475474d;
            view2 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.ghd) : null;
            if (view2 == null) {
                return;
            }
        } else {
            view2 = view;
        }
        java.lang.Object parent = view2.getParent();
        android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view3 == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view3.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
        int childCount = viewGroup.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (childAt.getId() != com.p314xaae8f345.mm.R.id.r8c) {
                if (i17 != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else if (childAt instanceof rc2.g) {
                    float f187840y = ((rc2.g) childAt).getF187840y();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(f187840y));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view3.findViewById(com.p314xaae8f345.mm.R.id.qma);
        int childCount2 = viewGroup2.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            android.view.View childAt2 = viewGroup2.getChildAt(i19);
            if (childAt2.getId() == com.p314xaae8f345.mm.R.id.f566429qk3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedNewSeekBarLayout", "finder_new_seek_bar_layout alpha: " + childAt2.getAlpha() + ", visibility: " + childAt2.getVisibility() + ", parentAlpha: " + viewGroup2.getAlpha());
            } else if (i17 != 0) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(childAt2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (childAt2 instanceof rc2.g) {
                float f187840y2 = ((rc2.g) childAt2).getF187840y();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(java.lang.Float.valueOf(f187840y2));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(childAt2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt2.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(childAt2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt2.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/feed/alpha/FinderFeedAlphaManagerUIC", "setAlphaForSeekStatusChange", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view3.findViewById(com.p314xaae8f345.mm.R.id.g1y);
        if (i17 == 0) {
            viewGroup3.setAlpha(1.0f);
        } else {
            viewGroup3.setAlpha(0.0f);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3>(m158354x19263085) { // from class: com.tencent.mm.plugin.finder.feed.alpha.FinderFeedAlphaManagerUIC$onCreateAfter$1
            {
                this.f39173x3fe91575 = 2063121603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 c5151xfdcfc6b3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5151xfdcfc6b3 event = c5151xfdcfc6b3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                rc2.f fVar = rc2.f.this;
                if (fVar.m158354x19263085().hashCode() != event.f135500g.f88248a) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedAlphaManagerUIC", "ActivityToggleAnimEndEvent: notify setAlphaForOcrBox");
                pm0.v.X(new rc2.c(fVar));
                return false;
            }
        }.mo48813x58998cd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f475475e = new java.util.ArrayList();
    }
}
