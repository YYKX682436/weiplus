package sc2;

/* loaded from: classes2.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f487807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487808f;

    public u0(sc2.h1 h1Var, android.view.ViewGroup viewGroup, in5.s0 s0Var) {
        this.f487806d = h1Var;
        this.f487807e = viewGroup;
        this.f487808f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sc2.h1 h1Var = this.f487806d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = h1Var.f487462x;
        boolean z17 = c15188xd8bd4bd != null && c15188xd8bd4bd.mo58787xc00617a4();
        in5.s0 s0Var = this.f487808f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = h1Var.f487462x;
            if (c15188xd8bd4bd2 != null) {
                c15188xd8bd4bd2.m61428x4d7bb316(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = h1Var.f487462x;
            if (c15188xd8bd4bd3 != null) {
                c15188xd8bd4bd3.mo56716x4121a19(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4 = h1Var.f487462x;
            if (c15188xd8bd4bd4 != null) {
                c15188xd8bd4bd4.mo58788x65825f6();
            }
            android.view.View view2 = h1Var.f487463x0;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.F = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(d2Var, this.f487807e, "ad_card", "video_pause", false, sc2.h1.H(h1Var, s0Var), null, 40, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd5 = h1Var.f487462x;
            if (c15188xd8bd4bd5 != null) {
                c15188xd8bd4bd5.m61428x4d7bb316(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd6 = h1Var.f487462x;
            if (c15188xd8bd4bd6 != null) {
                c15188xd8bd4bd6.mo56716x4121a19(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd7 = h1Var.f487462x;
            if (c15188xd8bd4bd7 != null) {
                c15188xd8bd4bd7.mo58789x348b34();
            }
            android.view.View view3 = h1Var.f487463x0;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.F = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(d2Var, this.f487807e, "ad_card", "video_play", false, sc2.h1.H(h1Var, s0Var), null, 40, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
