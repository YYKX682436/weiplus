package yi2;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.p f544090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f544091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f544092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f544093g;

    public o(yi2.p pVar, java.lang.Long l17, java.lang.Long l18, boolean z17) {
        this.f544090d = pVar;
        this.f544091e = l17;
        this.f544092f = l18;
        this.f544093g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        r45.qn0 qn0Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        java.lang.Long l17;
        yi2.p pVar = this.f544090d;
        int right = pVar.f544118y.getRight() + pVar.f544098e;
        int left = (pVar.f544117x.getLeft() - com.p314xaae8f345.mm.ui.zk.a(pVar.f544094a.getContext(), 8)) - com.p314xaae8f345.mm.ui.zk.a(pVar.f544094a.getContext(), 6);
        if (pVar.f544108o.getMeasuredWidth() <= 0) {
            int i17 = pVar.f544098e;
        } else {
            pVar.f544108o.getMeasuredWidth();
        }
        java.lang.Long l18 = this.f544091e;
        if (l18 == null || (l17 = this.f544092f) == null) {
            f0Var = null;
        } else {
            long longValue = l17.longValue();
            long longValue2 = l18.longValue();
            long j17 = longValue + longValue2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.f544096c, "updateBattleBar: rewardTotal:" + j17 + ", self.wecoinHot:" + longValue2);
            android.view.View view = pVar.f544107n;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = pVar.f544108o;
            android.view.View view2 = pVar.f544094a;
            if (j17 == 0) {
                android.view.ViewGroup.LayoutParams layoutParams = c22789xd23e9a9b.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((com.p314xaae8f345.mm.ui.bl.b(view2.getContext()).x / 2) - pVar.f544100g) - com.p314xaae8f345.mm.ui.zk.a(view2.getContext(), 8));
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((com.p314xaae8f345.mm.ui.bl.b(view2.getContext()).x / 2) - pVar.f544100g);
            } else {
                float f17 = (((float) longValue2) / ((float) j17)) * com.p314xaae8f345.mm.ui.bl.b(view2.getContext()).x;
                float f18 = right;
                if (f17 < f18) {
                    f17 = f18;
                }
                float f19 = left;
                if (f17 > f19) {
                    f17 = f19;
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = c22789xd23e9a9b.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int i18 = (int) (f17 - pVar.f544100g);
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).setMarginEnd(((com.p314xaae8f345.mm.ui.bl.b(view2.getContext()).x - (pVar.f544100g * 2)) - i18) - com.p314xaae8f345.mm.ui.zk.a(view2.getContext(), 8));
                android.view.ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).setMarginStart(i18);
            }
            pVar.f544103j.requestLayout();
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null && this.f544093g) {
            android.view.ViewGroup.LayoutParams layoutParams5 = pVar.f544108o.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.View view3 = pVar.f544094a;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).setMarginEnd(((com.p314xaae8f345.mm.ui.bl.b(view3.getContext()).x / 2) - pVar.f544100g) - com.p314xaae8f345.mm.ui.zk.a(view3.getContext(), 8));
            android.view.ViewGroup.LayoutParams layoutParams6 = pVar.f544107n.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).setMarginStart((com.p314xaae8f345.mm.ui.bl.b(view3.getContext()).x / 2) - pVar.f544100g);
            pVar.f544103j.requestLayout();
        }
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) pVar.f544095b).a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            r45.hm1 hm1Var = u4Var.f315698l;
            if (hm1Var == null || (m75941xfb821914 = hm1Var.m75941xfb821914(1)) == null) {
                qn0Var = null;
            } else {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((r45.qn0) obj).m75939xb282bd08(2) == 1) {
                            break;
                        }
                    }
                }
                qn0Var = (r45.qn0) obj;
            }
            long m75942xfb822ef2 = qn0Var != null ? qn0Var.m75942xfb822ef2(0) : 0L;
            android.view.View view4 = pVar.f544119z;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = pVar.f544108o;
            if (m75942xfb822ef2 > 0) {
                android.view.ViewGroup.LayoutParams layoutParams7 = c22789xd23e9a9b2.getLayoutParams();
                layoutParams7.width = pVar.f544099f;
                c22789xd23e9a9b2.setLayoutParams(layoutParams7);
                ym5.l2 l2Var = ym5.l2.f544957a;
                ym5.j2[] j2VarArr = ym5.j2.f544925d;
                c22789xd23e9a9b2.o(ae2.in.f85221a.a(ym5.f6.L));
                c22789xd23e9a9b2.m82583xcde73672(0);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = pVar.f544101h;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                pVar.f544101h = p3325xe03a0797.p3326xc267989b.l.d(pVar.f544102i, null, null, new yi2.n(pVar, null), 3, null);
                pVar.g(true);
                if (view4 == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setSuperFansBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setSuperFansBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams8 = c22789xd23e9a9b2.getLayoutParams();
            layoutParams8.width = pVar.f544098e;
            c22789xd23e9a9b2.setLayoutParams(layoutParams8);
            ym5.l2 l2Var2 = ym5.l2.f544957a;
            ym5.j2[] j2VarArr2 = ym5.j2.f544925d;
            c22789xd23e9a9b2.o(ae2.in.f85221a.a(ym5.f6.K));
            android.content.res.AssetManager assets = pVar.f544094a.getContext().getAssets();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
            c22789xd23e9a9b2.k(assets, pVar.f544097d);
            c22789xd23e9a9b2.m82583xcde73672(0);
            c22789xd23e9a9b2.g();
            pVar.g(false);
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setNormalBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setNormalBarStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
