package sc2;

/* loaded from: classes2.dex */
public class m4 extends ad2.h {
    public static final java.util.HashMap D = new java.util.HashMap();
    public boolean A;
    public android.animation.AnimatorSet B;
    public int C;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487608w = "Finder.FeedJumperLabelObserver";

    /* renamed from: x, reason: collision with root package name */
    public ad2.h f487609x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f487610y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f487611z;

    public static /* synthetic */ void I(sc2.m4 m4Var, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCurShowStyle");
        }
        if ((i18 & 2) != 0) {
            str = null;
        }
        m4Var.H(i17, str);
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.C(holder);
        android.animation.AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.B = null;
        android.view.View view = this.f487611z;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f487610y;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
        }
        this.f487611z = null;
        this.f487610y = null;
        this.f487609x = null;
        this.A = false;
        this.C = 0;
    }

    public final int G() {
        java.lang.Integer num = (java.lang.Integer) D.get(xc2.k0.f534706y.a(this.f84678f, this.C, this.f84679g));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final void H(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = D;
        if (str == null) {
            str = xc2.k0.f534706y.a(this.f84678f, this.C, this.f84679g);
        }
        hashMap.put(str, valueOf);
        if (this.f84683n == 39) {
            so2.o2.f492050f.a().g(this.f84678f, this.C, i17 == 19 ? so2.h2.f491920g : so2.h2.f491919f);
        }
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487608w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(2) == 19) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.ya yaVar = wf6Var != null ? (r45.ya) wf6Var.m75936x14adae67(27) : null;
        java.lang.String m75945x2fec8307 = yaVar != null ? yaVar.m75945x2fec8307(0) : null;
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String l17 = l(m75945x2fec8307, y2Var.s(context, c19786x6a1e2862));
        return !(l17 == null || l17.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02af  */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r35, in5.s0 r36, android.view.View r37, xc2.p0 r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m4.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        ad2.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        int G = G();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487608w, "[onClick], hashCode:" + hashCode() + " curShowStyle:" + G);
        if (G == 19) {
            super.r(holder, jumpView, infoEx);
        } else {
            if (G < 0 || (hVar = this.f487609x) == null) {
                return;
            }
            hVar.r(holder, jumpView, infoEx);
        }
    }

    @Override // ad2.h
    public void t() {
        int i17;
        float f17;
        boolean z17 = this.A;
        java.lang.String str = this.f487608w;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[transformView] hashCode:" + hashCode() + " transforming");
            return;
        }
        if (G() == 19) {
            xc2.u0[] u0VarArr = xc2.u0.f534841d;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53 c5476xff2a9b53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53();
            long j17 = this.f84678f;
            am.lb lbVar = c5476xff2a9b53.f135814g;
            lbVar.f88767a = j17;
            lbVar.f88768b = 1;
            c5476xff2a9b53.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[transformView] hashCode:" + hashCode() + " current style is label");
            return;
        }
        android.view.View view = this.f487610y;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "transformView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "transformView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setPivotX(view.getMeasuredWidth());
            view.setPivotY(view.getMeasuredHeight());
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(250L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
            android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f).setDuration(450L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration2, "setDuration(...)");
            android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f).setDuration(450L);
            i17 = 0;
            f17 = 1.0f;
            duration3.addListener(new sc2.l4(view, this, this.f84678f, this.C, this.f84679g));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(duration, duration2, duration3);
            this.B = animatorSet;
            animatorSet.start();
        } else {
            i17 = 0;
            f17 = 1.0f;
        }
        android.view.View view2 = this.f487611z;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "transformView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(i17)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "transformView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "transformView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver", "transformView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.animate().alpha(f17).setDuration(300L).setStartDelay(150L).start();
        }
        this.A = true;
    }

    @Override // ad2.h
    public void u(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        ad2.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        int G = G();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487608w, "[onExposed], hashCode:" + hashCode() + " curShowStyle:" + G);
        if (G == 19) {
            super.u(z17, holder, jumpView, infoEx);
        } else {
            if (G < 0 || (hVar = this.f487609x) == null) {
                return;
            }
            hVar.u(z17, holder, jumpView, infoEx);
        }
    }
}
